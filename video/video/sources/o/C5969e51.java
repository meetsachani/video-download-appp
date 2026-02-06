package o;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: o.e51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5969e51 {
    public static final Object a = new Object();

    /* renamed from: o.e51$a */
    /* loaded from: classes.dex */
    public static final class a extends J41 {
        public int X;
        public final /* synthetic */ C5484c51<T> Y;

        public a(C5484c51<T> c5484c51) {
            this.Y = c5484c51;
        }

        public final int b() {
            return this.X;
        }

        public final void c(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.w()) {
                return true;
            }
            return false;
        }

        @Override // o.J41
        public long nextLong() {
            C5484c51<T> c5484c51 = this.Y;
            int i = this.X;
            this.X = i + 1;
            return c5484c51.m(i);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.e51$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, GW0 {
        public int X;
        public final /* synthetic */ C5484c51<T> Y;

        public b(C5484c51<T> c5484c51) {
            this.Y = c5484c51;
        }

        public final int b() {
            return this.X;
        }

        public final void c(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.w()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            C5484c51<T> c5484c51 = this.Y;
            int i = this.X;
            this.X = i + 1;
            return c5484c51.x(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> void A(C5484c51<T> c5484c51, VA0<? super Long, ? super T, C7458kA2> va0) {
        C6562gT0.p(c5484c51, "<this>");
        C6562gT0.p(va0, "action");
        int w = c5484c51.w();
        for (int i = 0; i < w; i++) {
            va0.i(Long.valueOf(c5484c51.m(i)), c5484c51.x(i));
        }
    }

    public static final <T> T B(C5484c51<T> c5484c51, long j, T t) {
        C6562gT0.p(c5484c51, "<this>");
        return c5484c51.i(j, t);
    }

    public static final <T> T C(C5484c51<T> c5484c51, long j, FA0<? extends T> fa0) {
        C6562gT0.p(c5484c51, "<this>");
        C6562gT0.p(fa0, "defaultValue");
        T h = c5484c51.h(j);
        if (h == null) {
            return fa0.invoke();
        }
        return h;
    }

    public static final <T> int D(C5484c51<T> c5484c51) {
        C6562gT0.p(c5484c51, "<this>");
        return c5484c51.w();
    }

    public static final <T> boolean F(C5484c51<T> c5484c51) {
        C6562gT0.p(c5484c51, "<this>");
        return !c5484c51.l();
    }

    public static final <T> J41 G(C5484c51<T> c5484c51) {
        C6562gT0.p(c5484c51, "<this>");
        return new a(c5484c51);
    }

    public static final <T> C5484c51<T> H(C5484c51<T> c5484c51, C5484c51<T> c5484c512) {
        C6562gT0.p(c5484c51, "<this>");
        C6562gT0.p(c5484c512, "other");
        C5484c51<T> c5484c513 = new C5484c51<>(c5484c51.w() + c5484c512.w());
        c5484c513.o(c5484c51);
        c5484c513.o(c5484c512);
        return c5484c513;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean I(C5484c51 c5484c51, long j, Object obj) {
        C6562gT0.p(c5484c51, "<this>");
        return c5484c51.r(j, obj);
    }

    public static final <T> void J(C5484c51<T> c5484c51, long j, T t) {
        C6562gT0.p(c5484c51, "<this>");
        c5484c51.n(j, t);
    }

    public static final <T> Iterator<T> K(C5484c51<T> c5484c51) {
        C6562gT0.p(c5484c51, "<this>");
        return new b(c5484c51);
    }

    public static final /* synthetic */ Object a() {
        return a;
    }

    public static final <E> void b(C5484c51<E> c5484c51, long j, E e) {
        C6562gT0.p(c5484c51, "<this>");
        int i = c5484c51.Y0;
        if (i != 0 && j <= c5484c51.Y[i - 1]) {
            c5484c51.n(j, e);
            return;
        }
        if (c5484c51.X) {
            long[] jArr = c5484c51.Y;
            if (i >= jArr.length) {
                Object[] objArr = c5484c51.Z;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != a) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                c5484c51.X = false;
                c5484c51.Y0 = i2;
            }
        }
        int i4 = c5484c51.Y0;
        if (i4 >= c5484c51.Y.length) {
            int f = BL.f(i4 + 1);
            long[] copyOf = Arrays.copyOf(c5484c51.Y, f);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            c5484c51.Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(c5484c51.Z, f);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            c5484c51.Z = copyOf2;
        }
        c5484c51.Y[i4] = j;
        c5484c51.Z[i4] = e;
        c5484c51.Y0 = i4 + 1;
    }

    public static final <E> void c(C5484c51<E> c5484c51) {
        C6562gT0.p(c5484c51, "<this>");
        int i = c5484c51.Y0;
        Object[] objArr = c5484c51.Z;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c5484c51.Y0 = 0;
        c5484c51.X = false;
    }

    public static final <E> boolean d(C5484c51<E> c5484c51, long j) {
        C6562gT0.p(c5484c51, "<this>");
        if (c5484c51.j(j) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean e(C5484c51<E> c5484c51, E e) {
        C6562gT0.p(c5484c51, "<this>");
        if (c5484c51.k(e) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> void f(C5484c51<E> c5484c51) {
        C6562gT0.p(c5484c51, "<this>");
        int i = c5484c51.Y0;
        long[] jArr = c5484c51.Y;
        Object[] objArr = c5484c51.Z;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        c5484c51.X = false;
        c5484c51.Y0 = i2;
    }

    public static final <E> E g(C5484c51<E> c5484c51, long j) {
        C6562gT0.p(c5484c51, "<this>");
        int b2 = BL.b(c5484c51.Y, c5484c51.Y0, j);
        if (b2 >= 0 && c5484c51.Z[b2] != a) {
            return (E) c5484c51.Z[b2];
        }
        return null;
    }

    public static final <E> E h(C5484c51<E> c5484c51, long j, E e) {
        C6562gT0.p(c5484c51, "<this>");
        int b2 = BL.b(c5484c51.Y, c5484c51.Y0, j);
        if (b2 >= 0 && c5484c51.Z[b2] != a) {
            return (E) c5484c51.Z[b2];
        }
        return e;
    }

    public static final <T extends E, E> T i(C5484c51<E> c5484c51, long j, T t) {
        C6562gT0.p(c5484c51, "<this>");
        int b2 = BL.b(c5484c51.Y, c5484c51.Y0, j);
        if (b2 >= 0 && c5484c51.Z[b2] != a) {
            return (T) c5484c51.Z[b2];
        }
        return t;
    }

    public static final <E> int j(C5484c51<E> c5484c51, long j) {
        C6562gT0.p(c5484c51, "<this>");
        if (c5484c51.X) {
            int i = c5484c51.Y0;
            long[] jArr = c5484c51.Y;
            Object[] objArr = c5484c51.Z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            c5484c51.X = false;
            c5484c51.Y0 = i2;
        }
        return BL.b(c5484c51.Y, c5484c51.Y0, j);
    }

    public static final <E> int k(C5484c51<E> c5484c51, E e) {
        C6562gT0.p(c5484c51, "<this>");
        if (c5484c51.X) {
            int i = c5484c51.Y0;
            long[] jArr = c5484c51.Y;
            Object[] objArr = c5484c51.Z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            c5484c51.X = false;
            c5484c51.Y0 = i2;
        }
        int i4 = c5484c51.Y0;
        for (int i5 = 0; i5 < i4; i5++) {
            if (c5484c51.Z[i5] == e) {
                return i5;
            }
        }
        return -1;
    }

    public static final <E> boolean l(C5484c51<E> c5484c51) {
        C6562gT0.p(c5484c51, "<this>");
        if (c5484c51.w() == 0) {
            return true;
        }
        return false;
    }

    public static final <E> long m(C5484c51<E> c5484c51, int i) {
        int i2;
        C6562gT0.p(c5484c51, "<this>");
        if (i >= 0 && i < (i2 = c5484c51.Y0)) {
            if (c5484c51.X) {
                long[] jArr = c5484c51.Y;
                Object[] objArr = c5484c51.Z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                c5484c51.X = false;
                c5484c51.Y0 = i3;
            }
            return c5484c51.Y[i];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public static final <E> void n(C5484c51<E> c5484c51, long j, E e) {
        C6562gT0.p(c5484c51, "<this>");
        int b2 = BL.b(c5484c51.Y, c5484c51.Y0, j);
        if (b2 >= 0) {
            c5484c51.Z[b2] = e;
            return;
        }
        int i = ~b2;
        if (i < c5484c51.Y0 && c5484c51.Z[i] == a) {
            c5484c51.Y[i] = j;
            c5484c51.Z[i] = e;
            return;
        }
        if (c5484c51.X) {
            int i2 = c5484c51.Y0;
            long[] jArr = c5484c51.Y;
            if (i2 >= jArr.length) {
                Object[] objArr = c5484c51.Z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                c5484c51.X = false;
                c5484c51.Y0 = i3;
                i = ~BL.b(c5484c51.Y, i3, j);
            }
        }
        int i5 = c5484c51.Y0;
        if (i5 >= c5484c51.Y.length) {
            int f = BL.f(i5 + 1);
            long[] copyOf = Arrays.copyOf(c5484c51.Y, f);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            c5484c51.Y = copyOf;
            Object[] copyOf2 = Arrays.copyOf(c5484c51.Z, f);
            C6562gT0.o(copyOf2, "copyOf(this, newSize)");
            c5484c51.Z = copyOf2;
        }
        int i6 = c5484c51.Y0;
        if (i6 - i != 0) {
            long[] jArr2 = c5484c51.Y;
            int i7 = i + 1;
            C4788Ye.A0(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = c5484c51.Z;
            C4788Ye.B0(objArr2, objArr2, i7, i, c5484c51.Y0);
        }
        c5484c51.Y[i] = j;
        c5484c51.Z[i] = e;
        c5484c51.Y0++;
    }

    public static final <E> void o(C5484c51<E> c5484c51, C5484c51<? extends E> c5484c512) {
        C6562gT0.p(c5484c51, "<this>");
        C6562gT0.p(c5484c512, "other");
        int w = c5484c512.w();
        for (int i = 0; i < w; i++) {
            c5484c51.n(c5484c512.m(i), c5484c512.x(i));
        }
    }

    public static final <E> E p(C5484c51<E> c5484c51, long j, E e) {
        C6562gT0.p(c5484c51, "<this>");
        E h = c5484c51.h(j);
        if (h == null) {
            c5484c51.n(j, e);
        }
        return h;
    }

    public static final <E> void q(C5484c51<E> c5484c51, long j) {
        C6562gT0.p(c5484c51, "<this>");
        int b2 = BL.b(c5484c51.Y, c5484c51.Y0, j);
        if (b2 >= 0 && c5484c51.Z[b2] != a) {
            c5484c51.Z[b2] = a;
            c5484c51.X = true;
        }
    }

    public static final <E> boolean r(C5484c51<E> c5484c51, long j, E e) {
        C6562gT0.p(c5484c51, "<this>");
        int j2 = c5484c51.j(j);
        if (j2 >= 0 && C6562gT0.g(e, c5484c51.x(j2))) {
            c5484c51.s(j2);
            return true;
        }
        return false;
    }

    public static final <E> void s(C5484c51<E> c5484c51, int i) {
        C6562gT0.p(c5484c51, "<this>");
        if (c5484c51.Z[i] != a) {
            c5484c51.Z[i] = a;
            c5484c51.X = true;
        }
    }

    public static final <E> E t(C5484c51<E> c5484c51, long j, E e) {
        C6562gT0.p(c5484c51, "<this>");
        int j2 = c5484c51.j(j);
        if (j2 >= 0) {
            Object[] objArr = c5484c51.Z;
            E e2 = (E) objArr[j2];
            objArr[j2] = e;
            return e2;
        }
        return null;
    }

    public static final <E> boolean u(C5484c51<E> c5484c51, long j, E e, E e2) {
        C6562gT0.p(c5484c51, "<this>");
        int j2 = c5484c51.j(j);
        if (j2 >= 0 && C6562gT0.g(c5484c51.Z[j2], e)) {
            c5484c51.Z[j2] = e2;
            return true;
        }
        return false;
    }

    public static final <E> void v(C5484c51<E> c5484c51, int i, E e) {
        int i2;
        C6562gT0.p(c5484c51, "<this>");
        if (i >= 0 && i < (i2 = c5484c51.Y0)) {
            if (c5484c51.X) {
                long[] jArr = c5484c51.Y;
                Object[] objArr = c5484c51.Z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                c5484c51.X = false;
                c5484c51.Y0 = i3;
            }
            c5484c51.Z[i] = e;
            return;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public static final <E> int w(C5484c51<E> c5484c51) {
        C6562gT0.p(c5484c51, "<this>");
        if (c5484c51.X) {
            int i = c5484c51.Y0;
            long[] jArr = c5484c51.Y;
            Object[] objArr = c5484c51.Z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            c5484c51.X = false;
            c5484c51.Y0 = i2;
        }
        return c5484c51.Y0;
    }

    public static final <E> String x(C5484c51<E> c5484c51) {
        C6562gT0.p(c5484c51, "<this>");
        if (c5484c51.w() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(c5484c51.Y0 * 28);
        sb.append('{');
        int i = c5484c51.Y0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(C6566gU0.h);
            }
            sb.append(c5484c51.m(i2));
            sb.append('=');
            E x = c5484c51.x(i2);
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

    public static final <E> E y(C5484c51<E> c5484c51, int i) {
        int i2;
        C6562gT0.p(c5484c51, "<this>");
        if (i >= 0 && i < (i2 = c5484c51.Y0)) {
            if (c5484c51.X) {
                long[] jArr = c5484c51.Y;
                Object[] objArr = c5484c51.Z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                c5484c51.X = false;
                c5484c51.Y0 = i3;
            }
            return (E) c5484c51.Z[i];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public static final <T> boolean z(C5484c51<T> c5484c51, long j) {
        C6562gT0.p(c5484c51, "<this>");
        return c5484c51.e(j);
    }

    public static /* synthetic */ void E(C5484c51 c5484c51) {
    }
}
