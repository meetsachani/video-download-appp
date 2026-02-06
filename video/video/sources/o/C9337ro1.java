package o;

import java.nio.ByteBuffer;
import java.util.Arrays;

@Deprecated
/* renamed from: o.ro1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9337ro1 {
    public static final String a = "NalUnitUtil";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 9;
    public static final int j = 255;
    public static final int l = 6;
    public static final int m = 7;
    public static final int n = 39;
    public static final byte[] i = {0, 0, 0, 1};
    public static final float[] k = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: o  reason: collision with root package name */
    public static final Object f852o = new Object();
    public static int[] p = new int[10];

    /* renamed from: o.ro1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int[] h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final float m;
        public final int n;

        /* renamed from: o  reason: collision with root package name */
        public final int f853o;
        public final int p;

        public a(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = iArr;
            this.i = i7;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = f;
            this.n = i11;
            this.f853o = i12;
            this.p = i13;
        }
    }

    /* renamed from: o.ro1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final boolean c;

        public b(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* renamed from: o.ro1$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final float h;
        public final boolean i;
        public final boolean j;
        public final int k;
        public final int l;
        public final int m;
        public final boolean n;

        /* renamed from: o  reason: collision with root package name */
        public final int f854o;
        public final int p;
        public final int q;

        public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, boolean z, boolean z2, int i8, int i9, int i10, boolean z3, int i11, int i12, int i13) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = f;
            this.i = z;
            this.j = z2;
            this.k = i8;
            this.l = i9;
            this.m = i10;
            this.n = z3;
            this.f854o = i11;
            this.p = i12;
            this.q = i13;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i4 < position) {
                int i5 = byteBuffer.get(i2) & 255;
                if (i3 == 3) {
                    if (i5 == 1 && (byteBuffer.get(i4) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i2 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i5 == 0) {
                    i3++;
                }
                if (i5 != 0) {
                    i3 = 0;
                }
                i2 = i4;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int c(byte[] bArr, int i2, int i3, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i4 = i3 - i2;
        boolean z4 = false;
        if (i4 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        } else if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        } else if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        } else {
            int i5 = i3 - 1;
            int i6 = i2 + 2;
            while (i6 < i5) {
                byte b2 = bArr[i6];
                if ((b2 & 254) == 0) {
                    int i7 = i6 - 2;
                    if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                        a(zArr);
                        return i7;
                    }
                    i6 -= 2;
                }
                i6 += 3;
            }
            if (i4 <= 2 ? !(i4 != 2 ? !zArr[1] || bArr[i5] != 1 : !zArr[2] || bArr[i3 - 2] != 0 || bArr[i5] != 1) : !(bArr[i3 - 3] != 0 || bArr[i3 - 2] != 0 || bArr[i5] != 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            zArr[0] = z2;
            if (i4 <= 1 ? !(!zArr[2] || bArr[i5] != 0) : !(bArr[i3 - 2] != 0 || bArr[i5] != 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[1] = z3;
            if (bArr[i5] == 0) {
                z4 = true;
            }
            zArr[2] = z4;
            return i3;
        }
    }

    public static int d(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int e(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static boolean g(@InterfaceC11300zs1 String str, byte b2) {
        if (("video/avc".equals(str) && (b2 & 31) == 6) || (C4128Rj1.k.equals(str) && ((b2 & 126) >> 1) == 39)) {
            return true;
        }
        return false;
    }

    public static a h(byte[] bArr, int i2, int i3) {
        return i(bArr, i2 + 2, i3);
    }

    public static a i(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C3110Gy1 c3110Gy1 = new C3110Gy1(bArr, i2, i3);
        c3110Gy1.l(4);
        int e2 = c3110Gy1.e(3);
        c3110Gy1.k();
        int e3 = c3110Gy1.e(2);
        boolean d2 = c3110Gy1.d();
        int e4 = c3110Gy1.e(5);
        int i16 = 0;
        for (int i17 = 0; i17 < 32; i17++) {
            if (c3110Gy1.d()) {
                i16 |= 1 << i17;
            }
        }
        int[] iArr = new int[6];
        for (int i18 = 0; i18 < 6; i18++) {
            iArr[i18] = c3110Gy1.e(8);
        }
        int e5 = c3110Gy1.e(8);
        int i19 = 0;
        for (int i20 = 0; i20 < e2; i20++) {
            if (c3110Gy1.d()) {
                i19 += 89;
            }
            if (c3110Gy1.d()) {
                i19 += 8;
            }
        }
        c3110Gy1.l(i19);
        if (e2 > 0) {
            c3110Gy1.l((8 - e2) * 2);
        }
        int h2 = c3110Gy1.h();
        int h3 = c3110Gy1.h();
        if (h3 == 3) {
            c3110Gy1.k();
        }
        int h4 = c3110Gy1.h();
        int h5 = c3110Gy1.h();
        if (c3110Gy1.d()) {
            int h6 = c3110Gy1.h();
            int h7 = c3110Gy1.h();
            int h8 = c3110Gy1.h();
            int h9 = c3110Gy1.h();
            if (h3 != 1 && h3 != 2) {
                i14 = 1;
            } else {
                i14 = 2;
            }
            if (h3 == 1) {
                i15 = 2;
            } else {
                i15 = 1;
            }
            h4 -= i14 * (h6 + h7);
            h5 -= i15 * (h8 + h9);
        }
        int h10 = c3110Gy1.h();
        int h11 = c3110Gy1.h();
        int h12 = c3110Gy1.h();
        if (c3110Gy1.d()) {
            i4 = 0;
        } else {
            i4 = e2;
        }
        for (int i21 = i4; i21 <= e2; i21++) {
            c3110Gy1.h();
            c3110Gy1.h();
            c3110Gy1.h();
        }
        c3110Gy1.h();
        c3110Gy1.h();
        c3110Gy1.h();
        c3110Gy1.h();
        c3110Gy1.h();
        c3110Gy1.h();
        if (c3110Gy1.d() && c3110Gy1.d()) {
            n(c3110Gy1);
        }
        c3110Gy1.l(2);
        if (c3110Gy1.d()) {
            c3110Gy1.l(8);
            c3110Gy1.h();
            c3110Gy1.h();
            c3110Gy1.k();
        }
        p(c3110Gy1);
        if (c3110Gy1.d()) {
            int h13 = c3110Gy1.h();
            for (int i22 = 0; i22 < h13; i22++) {
                c3110Gy1.l(h12 + 5);
            }
        }
        c3110Gy1.l(2);
        float f2 = 1.0f;
        if (c3110Gy1.d()) {
            if (c3110Gy1.d()) {
                int e6 = c3110Gy1.e(8);
                if (e6 == 255) {
                    int e7 = c3110Gy1.e(16);
                    int e8 = c3110Gy1.e(16);
                    if (e7 != 0 && e8 != 0) {
                        f2 = e7 / e8;
                    }
                } else {
                    float[] fArr = k;
                    if (e6 < fArr.length) {
                        f2 = fArr[e6];
                    } else {
                        I31.n(a, "Unexpected aspect_ratio_idc value: " + e6);
                    }
                }
            }
            if (c3110Gy1.d()) {
                c3110Gy1.k();
            }
            if (c3110Gy1.d()) {
                c3110Gy1.l(3);
                if (c3110Gy1.d()) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (c3110Gy1.d()) {
                    int e9 = c3110Gy1.e(8);
                    int e10 = c3110Gy1.e(8);
                    c3110Gy1.l(8);
                    int i23 = IF.i(e9);
                    int j2 = IF.j(e10);
                    i12 = i23;
                    i11 = j2;
                } else {
                    i11 = -1;
                    i12 = -1;
                }
            } else {
                i11 = -1;
                i12 = -1;
                i13 = -1;
            }
            if (c3110Gy1.d()) {
                c3110Gy1.h();
                c3110Gy1.h();
            }
            c3110Gy1.k();
            if (c3110Gy1.d()) {
                h5 *= 2;
            }
            i10 = i11;
            i8 = i12;
            i9 = i13;
            i5 = h2;
            i6 = h4;
            i7 = h5;
        } else {
            i5 = h2;
            i6 = h4;
            i7 = h5;
            i8 = -1;
            i9 = -1;
            i10 = -1;
        }
        return new a(e3, d2, e4, i16, h3, h10, h11, iArr, e5, i5, i6, i7, f2, i8, i9, i10);
    }

    public static b j(byte[] bArr, int i2, int i3) {
        return k(bArr, i2 + 1, i3);
    }

    public static b k(byte[] bArr, int i2, int i3) {
        C3110Gy1 c3110Gy1 = new C3110Gy1(bArr, i2, i3);
        int h2 = c3110Gy1.h();
        int h3 = c3110Gy1.h();
        c3110Gy1.k();
        return new b(h2, h3, c3110Gy1.d());
    }

    public static c l(byte[] bArr, int i2, int i3) {
        return m(bArr, i2 + 1, i3);
    }

    public static c m(byte[] bArr, int i2, int i3) {
        int h2;
        boolean z;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C3110Gy1 c3110Gy1 = new C3110Gy1(bArr, i2, i3);
        int e2 = c3110Gy1.e(8);
        int e3 = c3110Gy1.e(8);
        int e4 = c3110Gy1.e(8);
        int h3 = c3110Gy1.h();
        if (e2 != 100 && e2 != 110 && e2 != 122 && e2 != 244 && e2 != 44 && e2 != 83 && e2 != 86 && e2 != 118 && e2 != 128 && e2 != 138) {
            h2 = 1;
            z = false;
        } else {
            h2 = c3110Gy1.h();
            if (h2 == 3) {
                z = c3110Gy1.d();
            } else {
                z = false;
            }
            c3110Gy1.h();
            c3110Gy1.h();
            c3110Gy1.k();
            if (c3110Gy1.d()) {
                if (h2 != 3) {
                    i4 = 8;
                } else {
                    i4 = 12;
                }
                for (int i14 = 0; i14 < i4; i14++) {
                    if (c3110Gy1.d()) {
                        if (i14 < 6) {
                            i5 = 16;
                        } else {
                            i5 = 64;
                        }
                        o(c3110Gy1, i5);
                    }
                }
            }
        }
        int h4 = c3110Gy1.h() + 4;
        int h5 = c3110Gy1.h();
        if (h5 == 0) {
            i6 = 1;
            z2 = z;
            i8 = c3110Gy1.h() + 4;
            i7 = 16;
            z3 = false;
        } else {
            if (h5 == 1) {
                boolean d2 = c3110Gy1.d();
                c3110Gy1.g();
                c3110Gy1.g();
                z2 = z;
                long h6 = c3110Gy1.h();
                i6 = 1;
                i7 = 16;
                for (int i15 = 0; i15 < h6; i15++) {
                    c3110Gy1.h();
                }
                z3 = d2;
            } else {
                i6 = 1;
                z2 = z;
                i7 = 16;
                z3 = false;
            }
            i8 = 0;
        }
        int h7 = c3110Gy1.h();
        c3110Gy1.k();
        int h8 = c3110Gy1.h() + 1;
        boolean d3 = c3110Gy1.d();
        int h9 = (2 - (d3 ? 1 : 0)) * (c3110Gy1.h() + 1);
        if (!d3) {
            c3110Gy1.k();
        }
        c3110Gy1.k();
        int i16 = h8 * 16;
        int i17 = h9 * 16;
        int i18 = 2;
        if (c3110Gy1.d()) {
            int h10 = c3110Gy1.h();
            int h11 = c3110Gy1.h();
            int h12 = c3110Gy1.h();
            int h13 = c3110Gy1.h();
            if (h2 == 0) {
                i13 = 2 - (d3 ? 1 : 0);
            } else {
                if (h2 == 3) {
                    i11 = i6;
                } else {
                    i11 = i6;
                    i6 = 2;
                }
                if (h2 == i11) {
                    i12 = 2;
                } else {
                    i12 = i11;
                }
                i13 = i12 * (2 - (d3 ? 1 : 0));
            }
            i16 -= (h10 + h11) * i6;
            i17 -= (h12 + h13) * i13;
        }
        float f2 = 1.0f;
        if (c3110Gy1.d()) {
            if (c3110Gy1.d()) {
                int e5 = c3110Gy1.e(8);
                if (e5 == 255) {
                    int i19 = i7;
                    int e6 = c3110Gy1.e(i19);
                    int e7 = c3110Gy1.e(i19);
                    if (e6 != 0 && e7 != 0) {
                        f2 = e6 / e7;
                    }
                } else {
                    float[] fArr = k;
                    if (e5 < fArr.length) {
                        f2 = fArr[e5];
                    } else {
                        I31.n(a, "Unexpected aspect_ratio_idc value: " + e5);
                    }
                }
            }
            if (c3110Gy1.d()) {
                c3110Gy1.k();
            }
            if (c3110Gy1.d()) {
                c3110Gy1.l(3);
                if (c3110Gy1.d()) {
                    i18 = 1;
                }
                if (c3110Gy1.d()) {
                    int e8 = c3110Gy1.e(8);
                    int e9 = c3110Gy1.e(8);
                    c3110Gy1.l(8);
                    i9 = IF.i(e8);
                    i10 = IF.j(e9);
                    return new c(e2, e3, e4, h3, h7, i16, i17, f2, z2, d3, h4, h5, i8, z3, i9, i18, i10);
                }
                i9 = -1;
                i10 = -1;
                return new c(e2, e3, e4, h3, h7, i16, i17, f2, z2, d3, h4, h5, i8, z3, i9, i18, i10);
            }
        }
        i9 = -1;
        i18 = -1;
        i10 = -1;
        return new c(e2, e3, e4, h3, h7, i16, i17, f2, z2, d3, h4, h5, i8, z3, i9, i18, i10);
    }

    public static void n(C3110Gy1 c3110Gy1) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (!c3110Gy1.d()) {
                    c3110Gy1.h();
                } else {
                    int min = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        c3110Gy1.g();
                    }
                    for (int i5 = 0; i5 < min; i5++) {
                        c3110Gy1.g();
                    }
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    public static void o(C3110Gy1 c3110Gy1, int i2) {
        int i3 = 8;
        int i4 = 8;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i3 != 0) {
                i3 = ((c3110Gy1.g() + i4) + 256) % 256;
            }
            if (i3 != 0) {
                i4 = i3;
            }
        }
    }

    public static void p(C3110Gy1 c3110Gy1) {
        int i2;
        int i3;
        int h2 = c3110Gy1.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < h2; i6++) {
            if (i6 != 0 && c3110Gy1.d()) {
                int i7 = i4 + i5;
                int h3 = (1 - ((c3110Gy1.d() ? 1 : 0) * 2)) * (c3110Gy1.h() + 1);
                int i8 = i7 + 1;
                boolean[] zArr = new boolean[i8];
                for (int i9 = 0; i9 <= i7; i9++) {
                    if (!c3110Gy1.d()) {
                        zArr[i9] = c3110Gy1.d();
                    } else {
                        zArr[i9] = true;
                    }
                }
                int[] iArr3 = new int[i8];
                int[] iArr4 = new int[i8];
                int i10 = 0;
                for (int i11 = i5 - 1; i11 >= 0; i11--) {
                    int i12 = iArr2[i11] + h3;
                    if (i12 < 0 && zArr[i4 + i11]) {
                        iArr3[i10] = i12;
                        i10++;
                    }
                }
                if (h3 < 0 && zArr[i7]) {
                    iArr3[i10] = h3;
                    i10++;
                }
                for (int i13 = 0; i13 < i4; i13++) {
                    int i14 = iArr[i13] + h3;
                    if (i14 < 0 && zArr[i13]) {
                        iArr3[i10] = i14;
                        i10++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i10);
                int i15 = 0;
                for (int i16 = i4 - 1; i16 >= 0; i16--) {
                    int i17 = iArr[i16] + h3;
                    if (i17 > 0 && zArr[i16]) {
                        iArr4[i15] = i17;
                        i15++;
                    }
                }
                if (h3 > 0 && zArr[i7]) {
                    iArr4[i15] = h3;
                    i15++;
                }
                for (int i18 = 0; i18 < i5; i18++) {
                    int i19 = iArr2[i18] + h3;
                    if (i19 > 0 && zArr[i4 + i18]) {
                        iArr4[i15] = i19;
                        i15++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i15);
                iArr = copyOf;
                i4 = i10;
                i5 = i15;
            } else {
                int h4 = c3110Gy1.h();
                int h5 = c3110Gy1.h();
                int[] iArr5 = new int[h4];
                for (int i20 = 0; i20 < h4; i20++) {
                    if (i20 > 0) {
                        i3 = iArr5[i20 - 1];
                    } else {
                        i3 = 0;
                    }
                    iArr5[i20] = i3 - (c3110Gy1.h() + 1);
                    c3110Gy1.k();
                }
                int[] iArr6 = new int[h5];
                for (int i21 = 0; i21 < h5; i21++) {
                    if (i21 > 0) {
                        i2 = iArr6[i21 - 1];
                    } else {
                        i2 = 0;
                    }
                    iArr6[i21] = i2 + c3110Gy1.h() + 1;
                    c3110Gy1.k();
                }
                i4 = h4;
                iArr = iArr5;
                i5 = h5;
                iArr2 = iArr6;
            }
        }
    }

    public static int q(byte[] bArr, int i2) {
        int i3;
        synchronized (f852o) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                try {
                    i4 = d(bArr, i4, i2);
                    if (i4 < i2) {
                        int[] iArr = p;
                        if (iArr.length <= i5) {
                            p = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        p[i5] = i4;
                        i4 += 3;
                        i5++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = p[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }
}
