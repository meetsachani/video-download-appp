package o;

import java.util.Arrays;

/* renamed from: o.ya2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10986ya2<E> implements Cloneable {
    public /* synthetic */ boolean X;
    public /* synthetic */ int[] Y;
    public /* synthetic */ int Y0;
    public /* synthetic */ Object[] Z;

    public C10986ya2() {
        this(0, 1, null);
    }

    public void b(int i, E e) {
        int i2 = this.Y0;
        if (i2 != 0 && i <= this.Y[i2 - 1]) {
            o(i, e);
            return;
        }
        if (this.X && i2 >= this.Y.length) {
            C11229za2.z(this);
        }
        int i3 = this.Y0;
        if (i3 >= this.Y.length) {
            int e2 = BL.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.Y, e2);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.Z, e2);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            this.Z = copyOf2;
        }
        this.Y[i3] = i;
        this.Z[i3] = e;
        this.Y0 = i3 + 1;
    }

    public void c() {
        int i = this.Y0;
        Object[] objArr = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.Y0 = 0;
        this.X = false;
    }

    /* renamed from: d */
    public C10986ya2<E> clone() {
        Object clone = super.clone();
        C6562gT0.n(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C10986ya2<E> c10986ya2 = (C10986ya2) clone;
        c10986ya2.Y = (int[]) this.Y.clone();
        c10986ya2.Z = (Object[]) this.Z.clone();
        return c10986ya2;
    }

    public boolean e(int i) {
        if (k(i) >= 0) {
            return true;
        }
        return false;
    }

    public boolean f(E e) {
        if (this.X) {
            C11229za2.z(this);
        }
        int i = this.Y0;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                if (this.Z[i2] == e) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    @InterfaceC9150r20(message = "Alias for remove(int).", replaceWith = @IR1(expression = "remove(key)", imports = {}))
    public void g(int i) {
        r(i);
    }

    public E h(int i) {
        return (E) C11229za2.g(this, i);
    }

    public E i(int i, E e) {
        return (E) C11229za2.h(this, i, e);
    }

    public final boolean j() {
        return m();
    }

    public int k(int i) {
        if (this.X) {
            C11229za2.z(this);
        }
        return BL.a(this.Y, this.Y0, i);
    }

    public int l(E e) {
        if (this.X) {
            C11229za2.z(this);
        }
        int i = this.Y0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.Z[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public boolean m() {
        if (y() == 0) {
            return true;
        }
        return false;
    }

    public int n(int i) {
        if (this.X) {
            C11229za2.z(this);
        }
        return this.Y[i];
    }

    public void o(int i, E e) {
        int a = BL.a(this.Y, this.Y0, i);
        if (a >= 0) {
            this.Z[a] = e;
            return;
        }
        int i2 = ~a;
        if (i2 < this.Y0 && this.Z[i2] == C11229za2.a) {
            this.Y[i2] = i;
            this.Z[i2] = e;
            return;
        }
        if (this.X && this.Y0 >= this.Y.length) {
            C11229za2.z(this);
            i2 = ~BL.a(this.Y, this.Y0, i);
        }
        int i3 = this.Y0;
        if (i3 >= this.Y.length) {
            int e2 = BL.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.Y, e2);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.Z, e2);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            this.Z = copyOf2;
        }
        int i4 = this.Y0;
        if (i4 - i2 != 0) {
            int[] iArr = this.Y;
            int i5 = i2 + 1;
            C4788Ye.z0(iArr, iArr, i5, i2, i4);
            Object[] objArr = this.Z;
            C4788Ye.B0(objArr, objArr, i5, i2, this.Y0);
        }
        this.Y[i2] = i;
        this.Z[i2] = e;
        this.Y0++;
    }

    public void p(C10986ya2<? extends E> c10986ya2) {
        C6562gT0.p(c10986ya2, "other");
        int y = c10986ya2.y();
        for (int i = 0; i < y; i++) {
            int n = c10986ya2.n(i);
            E z = c10986ya2.z(i);
            int a = BL.a(this.Y, this.Y0, n);
            if (a >= 0) {
                this.Z[a] = z;
            } else {
                int i2 = ~a;
                if (i2 < this.Y0 && this.Z[i2] == C11229za2.a) {
                    this.Y[i2] = n;
                    this.Z[i2] = z;
                } else {
                    if (this.X && this.Y0 >= this.Y.length) {
                        C11229za2.z(this);
                        i2 = ~BL.a(this.Y, this.Y0, n);
                    }
                    int i3 = this.Y0;
                    if (i3 >= this.Y.length) {
                        int e = BL.e(i3 + 1);
                        int[] copyOf = Arrays.copyOf(this.Y, e);
                        C6562gT0.o(copyOf, "copyOf(this, newSize)");
                        this.Y = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(this.Z, e);
                        C6562gT0.o(copyOf2, "copyOf(this, newSize)");
                        this.Z = copyOf2;
                    }
                    int i4 = this.Y0;
                    if (i4 - i2 != 0) {
                        int[] iArr = this.Y;
                        int i5 = i2 + 1;
                        C4788Ye.z0(iArr, iArr, i5, i2, i4);
                        Object[] objArr = this.Z;
                        C4788Ye.B0(objArr, objArr, i5, i2, this.Y0);
                    }
                    this.Y[i2] = n;
                    this.Z[i2] = z;
                    this.Y0++;
                }
            }
        }
    }

    public E q(int i, E e) {
        E e2 = (E) C11229za2.g(this, i);
        if (e2 == null) {
            int a = BL.a(this.Y, this.Y0, i);
            if (a >= 0) {
                this.Z[a] = e;
                return e2;
            }
            int i2 = ~a;
            if (i2 < this.Y0 && this.Z[i2] == C11229za2.a) {
                this.Y[i2] = i;
                this.Z[i2] = e;
                return e2;
            }
            if (this.X && this.Y0 >= this.Y.length) {
                C11229za2.z(this);
                i2 = ~BL.a(this.Y, this.Y0, i);
            }
            int i3 = this.Y0;
            if (i3 >= this.Y.length) {
                int e3 = BL.e(i3 + 1);
                int[] copyOf = Arrays.copyOf(this.Y, e3);
                C6562gT0.o(copyOf, "copyOf(this, newSize)");
                this.Y = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.Z, e3);
                C6562gT0.o(copyOf2, "copyOf(this, newSize)");
                this.Z = copyOf2;
            }
            int i4 = this.Y0;
            if (i4 - i2 != 0) {
                int[] iArr = this.Y;
                int i5 = i2 + 1;
                C4788Ye.z0(iArr, iArr, i5, i2, i4);
                Object[] objArr = this.Z;
                C4788Ye.B0(objArr, objArr, i5, i2, this.Y0);
            }
            this.Y[i2] = i;
            this.Z[i2] = e;
            this.Y0++;
        }
        return e2;
    }

    public void r(int i) {
        C11229za2.p(this, i);
    }

    public boolean s(int i, Object obj) {
        int k = k(i);
        if (k >= 0 && C6562gT0.g(obj, z(k))) {
            t(k);
            return true;
        }
        return false;
    }

    public void t(int i) {
        if (this.Z[i] != C11229za2.a) {
            this.Z[i] = C11229za2.a;
            this.X = true;
        }
    }

    public String toString() {
        if (y() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Y0 * 28);
        sb.append('{');
        int i = this.Y0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(C6566gU0.h);
            }
            sb.append(n(i2));
            sb.append('=');
            E z = z(i2);
            if (z != this) {
                sb.append(z);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "buffer.toString()");
        return sb2;
    }

    public void u(int i, int i2) {
        int min = Math.min(i2, i + i2);
        while (i < min) {
            t(i);
            i++;
        }
    }

    public E v(int i, E e) {
        int k = k(i);
        if (k >= 0) {
            Object[] objArr = this.Z;
            E e2 = (E) objArr[k];
            objArr[k] = e;
            return e2;
        }
        return null;
    }

    public boolean w(int i, E e, E e2) {
        int k = k(i);
        if (k >= 0 && C6562gT0.g(this.Z[k], e)) {
            this.Z[k] = e2;
            return true;
        }
        return false;
    }

    public void x(int i, E e) {
        if (this.X) {
            C11229za2.z(this);
        }
        this.Z[i] = e;
    }

    public int y() {
        if (this.X) {
            C11229za2.z(this);
        }
        return this.Y0;
    }

    public E z(int i) {
        if (this.X) {
            C11229za2.z(this);
        }
        return (E) this.Z[i];
    }

    public C10986ya2(int i) {
        if (i == 0) {
            this.Y = BL.a;
            this.Z = BL.c;
            return;
        }
        int e = BL.e(i);
        this.Y = new int[e];
        this.Z = new Object[e];
    }

    public /* synthetic */ C10986ya2(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
