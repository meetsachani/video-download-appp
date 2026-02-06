package o;

import android.util.Pair;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.l81  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7692l81 extends AbstractC3283Ir2 {
    @InterfaceC11300zs1
    public a c;

    /* renamed from: o.l81$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final int h = 0;
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 3;
        public final int a;
        public final String[] b;
        public final int[] c;
        public final C10079ur2[] d;
        public final int[] e;
        public final int[][][] f;
        public final C10079ur2 g;

        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.l81$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public @interface InterfaceC0304a {
        }

        @InterfaceC5056aJ2
        public a(String[] strArr, int[] iArr, C10079ur2[] c10079ur2Arr, int[] iArr2, int[][][] iArr3, C10079ur2 c10079ur2) {
            this.b = strArr;
            this.c = iArr;
            this.d = c10079ur2Arr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = c10079ur2;
            this.a = iArr.length;
        }

        public int a(int i2, int i3, boolean z) {
            int i4 = this.d[i2].b(i3).X;
            int[] iArr = new int[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i(i2, i3, i6);
                if (i7 == 4 || (z && i7 == 3)) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            return b(i2, i3, Arrays.copyOf(iArr, i5));
        }

        public int b(int i2, int i3, int[] iArr) {
            int i4 = 0;
            int i5 = 16;
            String str = null;
            boolean z = false;
            int i6 = 0;
            while (i4 < iArr.length) {
                String str2 = this.d[i2].b(i3).c(iArr[i4]).g1;
                int i7 = i6 + 1;
                if (i6 == 0) {
                    str = str2;
                } else {
                    z |= !TD2.g(str, str2);
                }
                i5 = Math.min(i5, InterfaceC10712xR1.q(this.f[i2][i3][i4]));
                i4++;
                i6 = i7;
            }
            if (z) {
                return Math.min(i5, this.e[i2]);
            }
            return i5;
        }

        public int c(int i2, int i3, int i4) {
            return this.f[i2][i3][i4];
        }

        public int d() {
            return this.a;
        }

        public String e(int i2) {
            return this.b[i2];
        }

        public int f(int i2) {
            int[][] iArr;
            int i3 = 0;
            for (int[] iArr2 : this.f[i2]) {
                for (int i4 : iArr2) {
                    int H = InterfaceC10712xR1.H(i4);
                    int i5 = 1;
                    if (H != 0 && H != 1 && H != 2) {
                        if (H != 3) {
                            if (H == 4) {
                                return 3;
                            }
                            throw new IllegalStateException();
                        }
                        i5 = 2;
                    }
                    i3 = Math.max(i3, i5);
                }
            }
            return i3;
        }

        public int g(int i2) {
            return this.c[i2];
        }

        public C10079ur2 h(int i2) {
            return this.d[i2];
        }

        public int i(int i2, int i3, int i4) {
            return InterfaceC10712xR1.H(c(i2, i3, i4));
        }

        public int j(int i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.a; i4++) {
                if (this.c[i4] == i2) {
                    i3 = Math.max(i3, f(i4));
                }
            }
            return i3;
        }

        public C10079ur2 k() {
            return this.g;
        }
    }

    public static int n(InterfaceC10712xR1[] interfaceC10712xR1Arr, C9593sr2 c9593sr2, int[] iArr, boolean z) throws C3824Og0 {
        boolean z2;
        int length = interfaceC10712xR1Arr.length;
        int i = 0;
        boolean z3 = true;
        for (int i2 = 0; i2 < interfaceC10712xR1Arr.length; i2++) {
            InterfaceC10712xR1 interfaceC10712xR1 = interfaceC10712xR1Arr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < c9593sr2.X; i4++) {
                i3 = Math.max(i3, InterfaceC10712xR1.H(interfaceC10712xR1.a(c9593sr2.c(i4))));
            }
            if (iArr[i2] == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 > i || (i3 == i && z && !z3 && z2)) {
                length = i2;
                z3 = z2;
                i = i3;
            }
        }
        return length;
    }

    public static int[] p(InterfaceC10712xR1 interfaceC10712xR1, C9593sr2 c9593sr2) throws C3824Og0 {
        int[] iArr = new int[c9593sr2.X];
        for (int i = 0; i < c9593sr2.X; i++) {
            iArr[i] = interfaceC10712xR1.a(c9593sr2.c(i));
        }
        return iArr;
    }

    public static int[] q(InterfaceC10712xR1[] interfaceC10712xR1Arr) throws C3824Og0 {
        int length = interfaceC10712xR1Arr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = interfaceC10712xR1Arr[i].B();
        }
        return iArr;
    }

    @Override // o.AbstractC3283Ir2
    public final void i(@InterfaceC11300zs1 Object obj) {
        this.c = (a) obj;
    }

    @Override // o.AbstractC3283Ir2
    public final C3381Jr2 k(InterfaceC10712xR1[] interfaceC10712xR1Arr, C10079ur2 c10079ur2, InterfaceC7583kh1.b bVar, AbstractC7373jp2 abstractC7373jp2) throws C3824Og0 {
        boolean z;
        int[] p;
        int[] iArr = new int[interfaceC10712xR1Arr.length + 1];
        int length = interfaceC10712xR1Arr.length + 1;
        C9593sr2[][] c9593sr2Arr = new C9593sr2[length];
        int[][][] iArr2 = new int[interfaceC10712xR1Arr.length + 1][];
        for (int i = 0; i < length; i++) {
            int i2 = c10079ur2.X;
            c9593sr2Arr[i] = new C9593sr2[i2];
            iArr2[i] = new int[i2];
        }
        int[] q = q(interfaceC10712xR1Arr);
        for (int i3 = 0; i3 < c10079ur2.X; i3++) {
            C9593sr2 b = c10079ur2.b(i3);
            if (b.Z == 5) {
                z = true;
            } else {
                z = false;
            }
            int n = n(interfaceC10712xR1Arr, b, iArr, z);
            if (n == interfaceC10712xR1Arr.length) {
                p = new int[b.X];
            } else {
                p = p(interfaceC10712xR1Arr[n], b);
            }
            int i4 = iArr[n];
            c9593sr2Arr[n][i4] = b;
            iArr2[n][i4] = p;
            iArr[n] = i4 + 1;
        }
        C10079ur2[] c10079ur2Arr = new C10079ur2[interfaceC10712xR1Arr.length];
        String[] strArr = new String[interfaceC10712xR1Arr.length];
        int[] iArr3 = new int[interfaceC10712xR1Arr.length];
        for (int i5 = 0; i5 < interfaceC10712xR1Arr.length; i5++) {
            int i6 = iArr[i5];
            c10079ur2Arr[i5] = new C10079ur2((C9593sr2[]) TD2.p1(c9593sr2Arr[i5], i6));
            iArr2[i5] = (int[][]) TD2.p1(iArr2[i5], i6);
            strArr[i5] = interfaceC10712xR1Arr[i5].getName();
            iArr3[i5] = interfaceC10712xR1Arr[i5].d();
        }
        a aVar = new a(strArr, iArr3, c10079ur2Arr, q, iArr2, new C10079ur2((C9593sr2[]) TD2.p1(c9593sr2Arr[interfaceC10712xR1Arr.length], iArr[interfaceC10712xR1Arr.length])));
        Pair<C10955yR1[], InterfaceC6859hi0[]> r = r(aVar, iArr2, q, bVar, abstractC7373jp2);
        return new C3381Jr2((C10955yR1[]) r.first, (InterfaceC6859hi0[]) r.second, C3087Gr2.b(aVar, (InterfaceC11054yr2[]) r.second), aVar);
    }

    @InterfaceC11300zs1
    public final a o() {
        return this.c;
    }

    public abstract Pair<C10955yR1[], InterfaceC6859hi0[]> r(a aVar, int[][][] iArr, int[] iArr2, InterfaceC7583kh1.b bVar, AbstractC7373jp2 abstractC7373jp2) throws C3824Og0;
}
