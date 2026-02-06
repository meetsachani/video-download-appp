package o;

import java.util.Arrays;

/* renamed from: o.c51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5484c51<E> implements Cloneable {
    public /* synthetic */ boolean X;
    public /* synthetic */ long[] Y;
    public /* synthetic */ int Y0;
    public /* synthetic */ Object[] Z;

    public C5484c51() {
        this(0, 1, null);
    }

    public void b(long j, E e) {
        int i = this.Y0;
        if (i != 0 && j <= this.Y[i - 1]) {
            n(j, e);
            return;
        }
        if (this.X) {
            long[] jArr = this.Y;
            if (i >= jArr.length) {
                Object[] objArr = this.Z;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != C5969e51.a) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.X = false;
                this.Y0 = i2;
            }
        }
        int i4 = this.Y0;
        if (i4 >= this.Y.length) {
            int f = BL.f(i4 + 1);
            long[] copyOf = Arrays.copyOf(this.Y, f);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.Z, f);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            this.Z = copyOf2;
        }
        this.Y[i4] = j;
        this.Z[i4] = e;
        this.Y0 = i4 + 1;
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
    public C5484c51<E> clone() {
        Object clone = super.clone();
        C6562gT0.n(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C5484c51<E> c5484c51 = (C5484c51) clone;
        c5484c51.Y = (long[]) this.Y.clone();
        c5484c51.Z = (Object[]) this.Z.clone();
        return c5484c51;
    }

    public boolean e(long j) {
        if (j(j) >= 0) {
            return true;
        }
        return false;
    }

    public boolean f(E e) {
        if (k(e) >= 0) {
            return true;
        }
        return false;
    }

    @InterfaceC9150r20(message = "Alias for `remove(key)`.", replaceWith = @IR1(expression = "remove(key)", imports = {}))
    public void g(long j) {
        int b = BL.b(this.Y, this.Y0, j);
        if (b >= 0 && this.Z[b] != C5969e51.a) {
            this.Z[b] = C5969e51.a;
            this.X = true;
        }
    }

    public E h(long j) {
        int b = BL.b(this.Y, this.Y0, j);
        if (b >= 0 && this.Z[b] != C5969e51.a) {
            return (E) this.Z[b];
        }
        return null;
    }

    public E i(long j, E e) {
        int b = BL.b(this.Y, this.Y0, j);
        if (b >= 0 && this.Z[b] != C5969e51.a) {
            return (E) this.Z[b];
        }
        return e;
    }

    public int j(long j) {
        if (this.X) {
            int i = this.Y0;
            long[] jArr = this.Y;
            Object[] objArr = this.Z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != C5969e51.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.X = false;
            this.Y0 = i2;
        }
        return BL.b(this.Y, this.Y0, j);
    }

    public int k(E e) {
        if (this.X) {
            int i = this.Y0;
            long[] jArr = this.Y;
            Object[] objArr = this.Z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != C5969e51.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.X = false;
            this.Y0 = i2;
        }
        int i4 = this.Y0;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.Z[i5] == e) {
                return i5;
            }
        }
        return -1;
    }

    public boolean l() {
        if (w() == 0) {
            return true;
        }
        return false;
    }

    public long m(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.Y0)) {
            if (this.X) {
                long[] jArr = this.Y;
                Object[] objArr = this.Z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != C5969e51.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.X = false;
                this.Y0 = i3;
            }
            return this.Y[i];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public void n(long j, E e) {
        int b = BL.b(this.Y, this.Y0, j);
        if (b >= 0) {
            this.Z[b] = e;
            return;
        }
        int i = ~b;
        if (i < this.Y0 && this.Z[i] == C5969e51.a) {
            this.Y[i] = j;
            this.Z[i] = e;
            return;
        }
        if (this.X) {
            int i2 = this.Y0;
            long[] jArr = this.Y;
            if (i2 >= jArr.length) {
                Object[] objArr = this.Z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != C5969e51.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.X = false;
                this.Y0 = i3;
                i = ~BL.b(this.Y, i3, j);
            }
        }
        int i5 = this.Y0;
        if (i5 >= this.Y.length) {
            int f = BL.f(i5 + 1);
            long[] copyOf = Arrays.copyOf(this.Y, f);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.Z, f);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            this.Z = copyOf2;
        }
        int i6 = this.Y0;
        if (i6 - i != 0) {
            long[] jArr2 = this.Y;
            int i7 = i + 1;
            C4788Ye.A0(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = this.Z;
            C4788Ye.B0(objArr2, objArr2, i7, i, this.Y0);
        }
        this.Y[i] = j;
        this.Z[i] = e;
        this.Y0++;
    }

    public void o(C5484c51<? extends E> c5484c51) {
        C6562gT0.p(c5484c51, "other");
        int w = c5484c51.w();
        for (int i = 0; i < w; i++) {
            n(c5484c51.m(i), c5484c51.x(i));
        }
    }

    public E p(long j, E e) {
        E h = h(j);
        if (h == null) {
            n(j, e);
        }
        return h;
    }

    public void q(long j) {
        int b = BL.b(this.Y, this.Y0, j);
        if (b >= 0 && this.Z[b] != C5969e51.a) {
            this.Z[b] = C5969e51.a;
            this.X = true;
        }
    }

    public boolean r(long j, E e) {
        int j2 = j(j);
        if (j2 >= 0 && C6562gT0.g(e, x(j2))) {
            s(j2);
            return true;
        }
        return false;
    }

    public void s(int i) {
        if (this.Z[i] != C5969e51.a) {
            this.Z[i] = C5969e51.a;
            this.X = true;
        }
    }

    public E t(long j, E e) {
        int j2 = j(j);
        if (j2 >= 0) {
            Object[] objArr = this.Z;
            E e2 = (E) objArr[j2];
            objArr[j2] = e;
            return e2;
        }
        return null;
    }

    public String toString() {
        if (w() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Y0 * 28);
        sb.append('{');
        int i = this.Y0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(C6566gU0.h);
            }
            sb.append(m(i2));
            sb.append('=');
            E x = x(i2);
            if (x != sb) {
                sb.append(x);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public boolean u(long j, E e, E e2) {
        int j2 = j(j);
        if (j2 >= 0 && C6562gT0.g(this.Z[j2], e)) {
            this.Z[j2] = e2;
            return true;
        }
        return false;
    }

    public void v(int i, E e) {
        int i2;
        if (i >= 0 && i < (i2 = this.Y0)) {
            if (this.X) {
                long[] jArr = this.Y;
                Object[] objArr = this.Z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != C5969e51.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.X = false;
                this.Y0 = i3;
            }
            this.Z[i] = e;
            return;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public int w() {
        if (this.X) {
            int i = this.Y0;
            long[] jArr = this.Y;
            Object[] objArr = this.Z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != C5969e51.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.X = false;
            this.Y0 = i2;
        }
        return this.Y0;
    }

    public E x(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.Y0)) {
            if (this.X) {
                long[] jArr = this.Y;
                Object[] objArr = this.Z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != C5969e51.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.X = false;
                this.Y0 = i3;
            }
            return (E) this.Z[i];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public C5484c51(int i) {
        if (i == 0) {
            this.Y = BL.b;
            this.Z = BL.c;
            return;
        }
        int f = BL.f(i);
        this.Y = new long[f];
        this.Z = new Object[f];
    }

    public /* synthetic */ C5484c51(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
