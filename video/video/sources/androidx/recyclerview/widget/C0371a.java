package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C6566gU0;
import o.FE1;

/* renamed from: androidx.recyclerview.widget.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371a implements s.a {
    public static final int i = 0;
    public static final int j = 1;
    public static final boolean k = false;
    public static final String l = "AHT";
    public FE1.a<b> a;
    public final ArrayList<b> b;
    public final ArrayList<b> c;
    public final InterfaceC0040a d;
    public Runnable e;
    public final boolean f;
    public final s g;
    public int h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0040a {
        void a(int i, int i2);

        void b(b bVar);

        void c(b bVar);

        void d(int i, int i2);

        void e(int i, int i2, Object obj);

        RecyclerView.H f(int i);

        void g(int i, int i2);

        void h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final int e = 1;
        public static final int f = 2;
        public static final int g = 4;
        public static final int h = 8;
        public static final int i = 30;
        public int a;
        public int b;
        public Object c;
        public int d;

        public b(int i2, int i3, int i4, Object obj) {
            this.a = i2;
            this.b = i3;
            this.d = i4;
            this.c = obj;
        }

        public String a() {
            int i2 = this.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 8) {
                            return "??";
                        }
                        return "mv";
                    }
                    return "up";
                }
                return "rm";
            }
            return "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.a;
            if (i2 != bVar.a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + C6566gU0.f + a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + C6566gU0.g;
        }
    }

    public C0371a(InterfaceC0040a interfaceC0040a) {
        this(interfaceC0040a, false);
    }

    public final int A(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i6 = bVar.a;
            if (i6 == 8) {
                int i7 = bVar.b;
                int i8 = bVar.d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 >= i5 && i2 <= i4) {
                    if (i5 == i7) {
                        if (i3 == 1) {
                            bVar.d = i8 + 1;
                        } else if (i3 == 2) {
                            bVar.d = i8 - 1;
                        }
                        i2++;
                    } else {
                        if (i3 == 1) {
                            bVar.b = i7 + 1;
                        } else if (i3 == 2) {
                            bVar.b = i7 - 1;
                        }
                        i2--;
                    }
                } else if (i2 < i7) {
                    if (i3 == 1) {
                        bVar.b = i7 + 1;
                        bVar.d = i8 + 1;
                    } else if (i3 == 2) {
                        bVar.b = i7 - 1;
                        bVar.d = i8 - 1;
                    }
                }
            } else {
                int i9 = bVar.b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= bVar.d;
                    } else if (i6 == 2) {
                        i2 += bVar.d;
                    }
                } else if (i3 == 1) {
                    bVar.b = i9 + 1;
                } else if (i3 == 2) {
                    bVar.b = i9 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i10 = bVar2.d;
                if (i10 == bVar2.b || i10 < 0) {
                    this.c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.c.remove(size2);
                b(bVar2);
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.s.a
    public b a(int i2, int i3, int i4, Object obj) {
        b a = this.a.a();
        if (a == null) {
            return new b(i2, i3, i4, obj);
        }
        a.a = i2;
        a.b = i3;
        a.d = i4;
        a.c = obj;
        return a;
    }

    @Override // androidx.recyclerview.widget.s.a
    public void b(b bVar) {
        if (!this.f) {
            bVar.c = null;
            this.a.b(bVar);
        }
    }

    public C0371a c(b... bVarArr) {
        Collections.addAll(this.b, bVarArr);
        return this;
    }

    public final void d(b bVar) {
        w(bVar);
    }

    public final void e(b bVar) {
        w(bVar);
    }

    public int f(int i2) {
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.b.get(i3);
            int i4 = bVar.a;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 8) {
                        int i5 = bVar.b;
                        if (i5 == i2) {
                            i2 = bVar.d;
                        } else {
                            if (i5 < i2) {
                                i2--;
                            }
                            if (bVar.d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else {
                    int i6 = bVar.b;
                    if (i6 <= i2) {
                        int i7 = bVar.d;
                        if (i6 + i7 > i2) {
                            return -1;
                        }
                        i2 -= i7;
                    } else {
                        continue;
                    }
                }
            } else if (bVar.b <= i2) {
                i2 += bVar.d;
            }
        }
        return i2;
    }

    public final void g(b bVar) {
        boolean z;
        char c;
        int i2 = bVar.b;
        int i3 = bVar.d + i2;
        char c2 = 65535;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            if (this.d.f(i4) == null && !i(i4)) {
                if (c2 == 1) {
                    w(a(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            } else {
                if (c2 == 0) {
                    l(a(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            }
            if (z) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            c2 = c;
        }
        if (i5 != bVar.d) {
            b(bVar);
            bVar = a(2, i2, i5, null);
        }
        if (c2 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    public final void h(b bVar) {
        int i2 = bVar.b;
        int i3 = bVar.d + i2;
        int i4 = 0;
        boolean z = true;
        int i5 = i2;
        while (i2 < i3) {
            if (this.d.f(i2) == null && !i(i2)) {
                if (z) {
                    w(a(4, i5, i4, bVar.c));
                    i5 = i2;
                    i4 = 0;
                }
                z = false;
            } else {
                if (!z) {
                    l(a(4, i5, i4, bVar.c));
                    i5 = i2;
                    i4 = 0;
                }
                z = true;
            }
            i4++;
            i2++;
        }
        if (i4 != bVar.d) {
            Object obj = bVar.c;
            b(bVar);
            bVar = a(4, i5, i4, obj);
        }
        if (!z) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    public final boolean i(int i2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                if (o(bVar.d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.b;
                int i6 = bVar.d + i5;
                while (i5 < i6) {
                    if (o(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void j() {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.d.c(this.c.get(i2));
        }
        y(this.c);
        this.h = 0;
    }

    public void k() {
        j();
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            int i3 = bVar.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        if (i3 == 8) {
                            this.d.c(bVar);
                            this.d.a(bVar.b, bVar.d);
                        }
                    } else {
                        this.d.c(bVar);
                        this.d.e(bVar.b, bVar.d, bVar.c);
                    }
                } else {
                    this.d.c(bVar);
                    this.d.h(bVar.b, bVar.d);
                }
            } else {
                this.d.c(bVar);
                this.d.g(bVar.b, bVar.d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.b);
        this.h = 0;
    }

    public final void l(b bVar) {
        int i2;
        int i3 = bVar.a;
        if (i3 != 1 && i3 != 8) {
            int A = A(bVar.b, i3);
            int i4 = bVar.b;
            int i5 = bVar.a;
            if (i5 != 2) {
                if (i5 == 4) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i2 = 0;
            }
            int i6 = 1;
            for (int i7 = 1; i7 < bVar.d; i7++) {
                int A2 = A(bVar.b + (i2 * i7), bVar.a);
                int i8 = bVar.a;
                if (i8 == 2 ? A2 == A : !(i8 != 4 || A2 != A + 1)) {
                    i6++;
                } else {
                    b a = a(i8, A, i6, bVar.c);
                    m(a, i4);
                    b(a);
                    if (bVar.a == 4) {
                        i4 += i6;
                    }
                    i6 = 1;
                    A = A2;
                }
            }
            Object obj = bVar.c;
            b(bVar);
            if (i6 > 0) {
                b a2 = a(bVar.a, A, i6, obj);
                m(a2, i4);
                b(a2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void m(b bVar, int i2) {
        this.d.b(bVar);
        int i3 = bVar.a;
        if (i3 != 2) {
            if (i3 == 4) {
                this.d.e(i2, bVar.d, bVar.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.d.h(i2, bVar.d);
    }

    public int n(int i2) {
        return o(i2, 0);
    }

    public int o(int i2, int i3) {
        int size = this.c.size();
        while (i3 < size) {
            b bVar = this.c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.b;
                if (i5 == i2) {
                    i2 = bVar.d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.d;
                }
            }
            i3++;
        }
        return i2;
    }

    public boolean p(int i2) {
        if ((i2 & this.h) != 0) {
            return true;
        }
        return false;
    }

    public boolean q() {
        if (this.b.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean r() {
        if (!this.c.isEmpty() && !this.b.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean s(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.b.add(a(4, i2, i3, obj));
        this.h |= 4;
        if (this.b.size() != 1) {
            return false;
        }
        return true;
    }

    public boolean t(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.b.add(a(1, i2, i3, null));
        this.h |= 1;
        if (this.b.size() != 1) {
            return false;
        }
        return true;
    }

    public boolean u(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 == 1) {
            this.b.add(a(8, i2, i3, null));
            this.h |= 8;
            if (this.b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public boolean v(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.b.add(a(2, i2, i3, null));
        this.h |= 2;
        if (this.b.size() != 1) {
            return false;
        }
        return true;
    }

    public final void w(b bVar) {
        this.c.add(bVar);
        int i2 = bVar.a;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 == 8) {
                        this.d.a(bVar.b, bVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                this.d.e(bVar.b, bVar.d, bVar.c);
                return;
            }
            this.d.d(bVar.b, bVar.d);
            return;
        }
        this.d.g(bVar.b, bVar.d);
    }

    public void x() {
        this.g.b(this.b);
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            int i3 = bVar.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        if (i3 == 8) {
                            e(bVar);
                        }
                    } else {
                        h(bVar);
                    }
                } else {
                    g(bVar);
                }
            } else {
                d(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.b.clear();
    }

    public void y(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(list.get(i2));
        }
        list.clear();
    }

    public void z() {
        y(this.b);
        y(this.c);
        this.h = 0;
    }

    public C0371a(InterfaceC0040a interfaceC0040a, boolean z) {
        this.a = new FE1.b(30);
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.h = 0;
        this.d = interfaceC0040a;
        this.f = z;
        this.g = new s(this);
    }
}
