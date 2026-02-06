package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.C6376fm;
import o.InterfaceC6439g11;

/* loaded from: classes.dex */
public class i {
    public static final Comparator<d> a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.a - dVar2.a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i, int i2);

        public abstract boolean b(int i, int i2);

        public Object c(int i, int i2) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* loaded from: classes.dex */
    public static class c {
        public final int[] a;
        public final int b;

        public c(int i) {
            int[] iArr = new int[i];
            this.a = iArr;
            this.b = iArr.length / 2;
        }

        public int[] a() {
            return this.a;
        }

        public void b(int i) {
            Arrays.fill(this.a, i);
        }

        public int c(int i) {
            return this.a[i + this.b];
        }

        public void d(int i, int i2) {
            this.a[i + this.b] = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final int a;
        public final int b;
        public final int c;

        public d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public int a() {
            return this.a + this.c;
        }

        public int b() {
            return this.b + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static final int h = -1;
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 4;
        public static final int l = 8;
        public static final int m = 12;
        public static final int n = 4;

        /* renamed from: o  reason: collision with root package name */
        public static final int f57o = 15;
        public final List<d> a;
        public final int[] b;
        public final int[] c;
        public final b d;
        public final int e;
        public final int f;
        public final boolean g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            this.e = bVar.e();
            this.f = bVar.d();
            this.g = z;
            a();
            g();
        }

        public static g i(Collection<g> collection, int i2, boolean z) {
            g gVar;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = it.next();
                    if (gVar.a == i2 && gVar.c == z) {
                        it.remove();
                        break;
                    }
                } else {
                    gVar = null;
                    break;
                }
            }
            while (it.hasNext()) {
                g next = it.next();
                if (z) {
                    next.b--;
                } else {
                    next.b++;
                }
            }
            return gVar;
        }

        public final void a() {
            d dVar;
            if (this.a.isEmpty()) {
                dVar = null;
            } else {
                dVar = this.a.get(0);
            }
            if (dVar == null || dVar.a != 0 || dVar.b != 0) {
                this.a.add(0, new d(0, 0, 0));
            }
            this.a.add(new d(this.e, this.f, 0));
        }

        public int b(int i2) {
            if (i2 >= 0 && i2 < this.f) {
                int i3 = this.c[i2];
                if ((i3 & 15) == 0) {
                    return -1;
                }
                return i3 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i2 + ", new list size = " + this.f);
        }

        public int c(int i2) {
            if (i2 >= 0 && i2 < this.e) {
                int i3 = this.b[i2];
                if ((i3 & 15) == 0) {
                    return -1;
                }
                return i3 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i2 + ", old list size = " + this.e);
        }

        public void d(RecyclerView.AbstractC0370h abstractC0370h) {
            e(new C0372b(abstractC0370h));
        }

        public void e(InterfaceC6439g11 interfaceC6439g11) {
            C6376fm c6376fm;
            int i2;
            if (interfaceC6439g11 instanceof C6376fm) {
                c6376fm = (C6376fm) interfaceC6439g11;
            } else {
                c6376fm = new C6376fm(interfaceC6439g11);
            }
            int i3 = this.e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i4 = this.e;
            int i5 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                d dVar = this.a.get(size);
                int a = dVar.a();
                int b = dVar.b();
                while (true) {
                    if (i4 <= a) {
                        break;
                    }
                    i4--;
                    int i6 = this.b[i4];
                    if ((i6 & 12) != 0) {
                        int i7 = i6 >> 4;
                        g i8 = i(arrayDeque, i7, false);
                        if (i8 != null) {
                            int i9 = (i3 - i8.b) - 1;
                            c6376fm.d(i4, i9);
                            if ((i6 & 4) != 0) {
                                c6376fm.c(i9, 1, this.d.c(i4, i7));
                            }
                        } else {
                            arrayDeque.add(new g(i4, (i3 - i4) - 1, true));
                        }
                    } else {
                        c6376fm.b(i4, 1);
                        i3--;
                    }
                }
                while (i5 > b) {
                    i5--;
                    int i10 = this.c[i5];
                    if ((i10 & 12) != 0) {
                        int i11 = i10 >> 4;
                        g i12 = i(arrayDeque, i11, true);
                        if (i12 == null) {
                            arrayDeque.add(new g(i5, i3 - i4, false));
                        } else {
                            c6376fm.d((i3 - i12.b) - 1, i4);
                            if ((i10 & 4) != 0) {
                                c6376fm.c(i4, 1, this.d.c(i11, i5));
                            }
                        }
                    } else {
                        c6376fm.a(i4, 1);
                        i3++;
                    }
                }
                int i13 = dVar.a;
                int i14 = dVar.b;
                for (i2 = 0; i2 < dVar.c; i2++) {
                    if ((this.b[i13] & 15) == 2) {
                        c6376fm.c(i13, 1, this.d.c(i13, i14));
                    }
                    i13++;
                    i14++;
                }
                i4 = dVar.a;
                i5 = dVar.b;
            }
            c6376fm.e();
        }

        public final void f(int i2) {
            int i3;
            int size = this.a.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                d dVar = this.a.get(i5);
                while (i4 < dVar.b) {
                    if (this.c[i4] == 0 && this.d.b(i2, i4)) {
                        if (this.d.a(i2, i4)) {
                            i3 = 8;
                        } else {
                            i3 = 4;
                        }
                        this.b[i2] = (i4 << 4) | i3;
                        this.c[i4] = (i2 << 4) | i3;
                        return;
                    }
                    i4++;
                }
                i4 = dVar.b();
            }
        }

        public final void g() {
            int i2;
            for (d dVar : this.a) {
                for (int i3 = 0; i3 < dVar.c; i3++) {
                    int i4 = dVar.a + i3;
                    int i5 = dVar.b + i3;
                    if (this.d.a(i4, i5)) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    this.b[i4] = (i5 << 4) | i2;
                    this.c[i5] = (i4 << 4) | i2;
                }
            }
            if (this.g) {
                h();
            }
        }

        public final void h() {
            int i2 = 0;
            for (d dVar : this.a) {
                while (i2 < dVar.a) {
                    if (this.b[i2] == 0) {
                        f(i2);
                    }
                    i2++;
                }
                i2 = dVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<T> {
        public abstract boolean a(T t, T t2);

        public abstract boolean b(T t, T t2);

        public Object c(T t, T t2) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public int a;
        public int b;
        public boolean c;

        public g(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public int a;
        public int b;
        public int c;
        public int d;

        public h() {
        }

        public int a() {
            return this.d - this.c;
        }

        public int b() {
            return this.b - this.a;
        }

        public h(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0044i {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }

        public boolean b() {
            if (this.d - this.b != this.c - this.a) {
                return true;
            }
            return false;
        }

        public boolean c() {
            if (this.d - this.b > this.c - this.a) {
                return true;
            }
            return false;
        }

        public d d() {
            if (b()) {
                if (this.e) {
                    return new d(this.a, this.b, a());
                }
                if (c()) {
                    return new d(this.a, this.b + 1, a());
                }
                return new d(this.a + 1, this.b, a());
            }
            int i = this.a;
            return new d(i, this.b, this.c - i);
        }
    }

    public static C0044i a(h hVar, b bVar, c cVar, c cVar2, int i) {
        boolean z;
        int c2;
        int i2;
        int i3;
        int i4;
        if ((hVar.b() - hVar.a()) % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int b2 = hVar.b() - hVar.a();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 != i5 && (i6 == i || cVar2.c(i6 + 1) >= cVar2.c(i6 - 1))) {
                c2 = cVar2.c(i6 - 1);
                i2 = c2 - 1;
            } else {
                c2 = cVar2.c(i6 + 1);
                i2 = c2;
            }
            int i7 = hVar.d - ((hVar.b - i2) - i6);
            if (i != 0 && i2 == c2) {
                i3 = i7 + 1;
            } else {
                i3 = i7;
            }
            while (i2 > hVar.a && i7 > hVar.c && bVar.b(i2 - 1, i7 - 1)) {
                i2--;
                i7--;
            }
            cVar2.d(i6, i2);
            if (z && (i4 = b2 - i6) >= i5 && i4 <= i && cVar.c(i4) >= i2) {
                C0044i c0044i = new C0044i();
                c0044i.a = i2;
                c0044i.b = i7;
                c0044i.c = c2;
                c0044i.d = i3;
                c0044i.e = true;
                return c0044i;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z) {
        h hVar;
        int e2 = bVar.e();
        int d2 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, e2, 0, d2));
        int i = ((((e2 + d2) + 1) / 2) * 2) + 1;
        c cVar = new c(i);
        c cVar2 = new c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar2 = (h) arrayList2.remove(arrayList2.size() - 1);
            C0044i e3 = e(hVar2, bVar, cVar, cVar2);
            if (e3 != null) {
                if (e3.a() > 0) {
                    arrayList.add(e3.d());
                }
                if (arrayList3.isEmpty()) {
                    hVar = new h();
                } else {
                    hVar = (h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.a = hVar2.a;
                hVar.c = hVar2.c;
                hVar.b = e3.a;
                hVar.d = e3.b;
                arrayList2.add(hVar);
                hVar2.b = hVar2.b;
                hVar2.d = hVar2.d;
                hVar2.a = e3.c;
                hVar2.c = e3.d;
                arrayList2.add(hVar2);
            } else {
                arrayList3.add(hVar2);
            }
        }
        Collections.sort(arrayList, a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z);
    }

    public static C0044i d(h hVar, b bVar, c cVar, c cVar2, int i) {
        int c2;
        int i2;
        int i3;
        boolean z = true;
        if (Math.abs(hVar.b() - hVar.a()) % 2 != 1) {
            z = false;
        }
        int b2 = hVar.b() - hVar.a();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 != i4 && (i5 == i || cVar.c(i5 + 1) <= cVar.c(i5 - 1))) {
                c2 = cVar.c(i5 - 1);
                i2 = c2 + 1;
            } else {
                c2 = cVar.c(i5 + 1);
                i2 = c2;
            }
            int i6 = (hVar.c + (i2 - hVar.a)) - i5;
            int i7 = (i != 0 && i2 == c2) ? i6 - 1 : i6;
            while (i2 < hVar.b && i6 < hVar.d && bVar.b(i2, i6)) {
                i2++;
                i6++;
            }
            cVar.d(i5, i2);
            if (z && (i3 = b2 - i5) >= i4 + 1 && i3 <= i - 1 && cVar2.c(i3) <= i2) {
                C0044i c0044i = new C0044i();
                c0044i.a = c2;
                c0044i.b = i7;
                c0044i.c = i2;
                c0044i.d = i6;
                c0044i.e = false;
                return c0044i;
            }
        }
        return null;
    }

    public static C0044i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b2 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.d(1, hVar.a);
            cVar2.d(1, hVar.b);
            for (int i = 0; i < b2; i++) {
                C0044i d2 = d(hVar, bVar, cVar, cVar2, i);
                if (d2 != null) {
                    return d2;
                }
                C0044i a2 = a(hVar, bVar, cVar, cVar2, i);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}
