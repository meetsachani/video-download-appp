package o;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* renamed from: o.nJ2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8241nJ2 {
    public static final String a = "VorbisUtil";

    /* renamed from: o.nJ2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final String[] b;
        public final int c;

        public a(String str, String[] strArr, int i) {
            this.a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    /* renamed from: o.nJ2$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public b(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* renamed from: o.nJ2$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = z;
            this.j = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static long b(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    @InterfaceC11300zs1
    public static C4224Si1 c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] K1 = TD2.K1(str, "=");
            if (K1.length != 2) {
                I31.n(a, "Failed to parse Vorbis comment: " + str);
            } else if (K1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(WC1.a(new C3012Fy1(Base64.decode(K1[1], 0))));
                } catch (RuntimeException e) {
                    I31.o(a, "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C7737lJ2(K1[0], K1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4224Si1(arrayList);
    }

    public static void d(C7251jJ2 c7251jJ2) throws C3989Py1 {
        int e = c7251jJ2.e(6) + 1;
        for (int i = 0; i < e; i++) {
            int e2 = c7251jJ2.e(16);
            if (e2 != 0) {
                if (e2 == 1) {
                    int e3 = c7251jJ2.e(5);
                    int[] iArr = new int[e3];
                    int i2 = -1;
                    for (int i3 = 0; i3 < e3; i3++) {
                        int e4 = c7251jJ2.e(4);
                        iArr[i3] = e4;
                        if (e4 > i2) {
                            i2 = e4;
                        }
                    }
                    int i4 = i2 + 1;
                    int[] iArr2 = new int[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        iArr2[i5] = c7251jJ2.e(3) + 1;
                        int e5 = c7251jJ2.e(2);
                        if (e5 > 0) {
                            c7251jJ2.h(8);
                        }
                        for (int i6 = 0; i6 < (1 << e5); i6++) {
                            c7251jJ2.h(8);
                        }
                    }
                    c7251jJ2.h(2);
                    int e6 = c7251jJ2.e(4);
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 0; i9 < e3; i9++) {
                        i7 += iArr2[iArr[i9]];
                        while (i8 < i7) {
                            c7251jJ2.h(e6);
                            i8++;
                        }
                    }
                } else {
                    throw C3989Py1.a("floor type greater than 1 not decodable: " + e2, null);
                }
            } else {
                c7251jJ2.h(8);
                c7251jJ2.h(16);
                c7251jJ2.h(16);
                c7251jJ2.h(6);
                c7251jJ2.h(8);
                int e7 = c7251jJ2.e(4) + 1;
                for (int i10 = 0; i10 < e7; i10++) {
                    c7251jJ2.h(8);
                }
            }
        }
    }

    public static void e(int i, C7251jJ2 c7251jJ2) throws C3989Py1 {
        int i2;
        int e = c7251jJ2.e(6) + 1;
        for (int i3 = 0; i3 < e; i3++) {
            int e2 = c7251jJ2.e(16);
            if (e2 != 0) {
                I31.d(a, "mapping type other than 0 not supported: " + e2);
            } else {
                if (c7251jJ2.d()) {
                    i2 = c7251jJ2.e(4) + 1;
                } else {
                    i2 = 1;
                }
                if (c7251jJ2.d()) {
                    int e3 = c7251jJ2.e(8) + 1;
                    for (int i4 = 0; i4 < e3; i4++) {
                        int i5 = i - 1;
                        c7251jJ2.h(a(i5));
                        c7251jJ2.h(a(i5));
                    }
                }
                if (c7251jJ2.e(2) == 0) {
                    if (i2 > 1) {
                        for (int i6 = 0; i6 < i; i6++) {
                            c7251jJ2.h(4);
                        }
                    }
                    for (int i7 = 0; i7 < i2; i7++) {
                        c7251jJ2.h(8);
                        c7251jJ2.h(8);
                        c7251jJ2.h(8);
                    }
                } else {
                    throw C3989Py1.a("to reserved bits must be zero after mapping coupling steps", null);
                }
            }
        }
    }

    public static b[] f(C7251jJ2 c7251jJ2) {
        int e = c7251jJ2.e(6) + 1;
        b[] bVarArr = new b[e];
        for (int i = 0; i < e; i++) {
            bVarArr[i] = new b(c7251jJ2.d(), c7251jJ2.e(16), c7251jJ2.e(16), c7251jJ2.e(8));
        }
        return bVarArr;
    }

    public static void g(C7251jJ2 c7251jJ2) throws C3989Py1 {
        int i;
        int e = c7251jJ2.e(6) + 1;
        for (int i2 = 0; i2 < e; i2++) {
            if (c7251jJ2.e(16) <= 2) {
                c7251jJ2.h(24);
                c7251jJ2.h(24);
                c7251jJ2.h(24);
                int e2 = c7251jJ2.e(6) + 1;
                c7251jJ2.h(8);
                int[] iArr = new int[e2];
                for (int i3 = 0; i3 < e2; i3++) {
                    int e3 = c7251jJ2.e(3);
                    if (c7251jJ2.d()) {
                        i = c7251jJ2.e(5);
                    } else {
                        i = 0;
                    }
                    iArr[i3] = (i * 8) + e3;
                }
                for (int i4 = 0; i4 < e2; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        if ((iArr[i4] & (1 << i5)) != 0) {
                            c7251jJ2.h(8);
                        }
                    }
                }
            } else {
                throw C3989Py1.a("residueType greater than 2 is not decodable", null);
            }
        }
    }

    public static a h(C3012Fy1 c3012Fy1) throws C3989Py1 {
        return i(c3012Fy1, true, true);
    }

    public static a i(C3012Fy1 c3012Fy1, boolean z, boolean z2) throws C3989Py1 {
        if (z) {
            m(3, c3012Fy1, false);
        }
        String I = c3012Fy1.I((int) c3012Fy1.A());
        int length = I.length();
        long A = c3012Fy1.A();
        String[] strArr = new String[(int) A];
        int i = length + 15;
        for (int i2 = 0; i2 < A; i2++) {
            String I2 = c3012Fy1.I((int) c3012Fy1.A());
            strArr[i2] = I2;
            i = i + 4 + I2.length();
        }
        if (z2 && (c3012Fy1.L() & 1) == 0) {
            throw C3989Py1.a("framing bit expected to be set", null);
        }
        return new a(I, strArr, i + 1);
    }

    public static c j(C3012Fy1 c3012Fy1) throws C3989Py1 {
        boolean z;
        m(1, c3012Fy1, false);
        int C = c3012Fy1.C();
        int L = c3012Fy1.L();
        int C2 = c3012Fy1.C();
        int w = c3012Fy1.w();
        if (w <= 0) {
            w = -1;
        }
        int w2 = c3012Fy1.w();
        if (w2 <= 0) {
            w2 = -1;
        }
        int w3 = c3012Fy1.w();
        if (w3 <= 0) {
            w3 = -1;
        }
        int L2 = c3012Fy1.L();
        int pow = (int) Math.pow(2.0d, L2 & 15);
        int pow2 = (int) Math.pow(2.0d, (L2 & 240) >> 4);
        if ((c3012Fy1.L() & 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        return new c(C, L, C2, w, w2, w3, pow, pow2, z, Arrays.copyOf(c3012Fy1.e(), c3012Fy1.g()));
    }

    public static b[] k(C3012Fy1 c3012Fy1, int i) throws C3989Py1 {
        m(5, c3012Fy1, false);
        int L = c3012Fy1.L() + 1;
        C7251jJ2 c7251jJ2 = new C7251jJ2(c3012Fy1.e());
        c7251jJ2.h(c3012Fy1.f() * 8);
        for (int i2 = 0; i2 < L; i2++) {
            l(c7251jJ2);
        }
        int e = c7251jJ2.e(6) + 1;
        for (int i3 = 0; i3 < e; i3++) {
            if (c7251jJ2.e(16) != 0) {
                throw C3989Py1.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        d(c7251jJ2);
        g(c7251jJ2);
        e(i, c7251jJ2);
        b[] f = f(c7251jJ2);
        if (c7251jJ2.d()) {
            return f;
        }
        throw C3989Py1.a("framing bit after modes not set as expected", null);
    }

    public static void l(C7251jJ2 c7251jJ2) throws C3989Py1 {
        long j;
        if (c7251jJ2.e(24) == 5653314) {
            int e = c7251jJ2.e(16);
            int e2 = c7251jJ2.e(24);
            int i = 0;
            if (!c7251jJ2.d()) {
                boolean d = c7251jJ2.d();
                while (i < e2) {
                    if (d) {
                        if (c7251jJ2.d()) {
                            c7251jJ2.h(5);
                        }
                    } else {
                        c7251jJ2.h(5);
                    }
                    i++;
                }
            } else {
                c7251jJ2.h(5);
                while (i < e2) {
                    i += c7251jJ2.e(a(e2 - i));
                }
            }
            int e3 = c7251jJ2.e(4);
            if (e3 <= 2) {
                if (e3 != 1 && e3 != 2) {
                    return;
                }
                c7251jJ2.h(32);
                c7251jJ2.h(32);
                int e4 = c7251jJ2.e(4) + 1;
                c7251jJ2.h(1);
                if (e3 == 1) {
                    if (e != 0) {
                        j = b(e2, e);
                    } else {
                        j = 0;
                    }
                } else {
                    j = e * e2;
                }
                c7251jJ2.h((int) (j * e4));
                return;
            }
            throw C3989Py1.a("lookup type greater than 2 not decodable: " + e3, null);
        }
        throw C3989Py1.a("expected code book to start with [0x56, 0x43, 0x42] at " + c7251jJ2.c(), null);
    }

    public static boolean m(int i, C3012Fy1 c3012Fy1, boolean z) throws C3989Py1 {
        if (c3012Fy1.a() < 7) {
            if (z) {
                return false;
            }
            throw C3989Py1.a("too short header: " + c3012Fy1.a(), null);
        } else if (c3012Fy1.L() != i) {
            if (z) {
                return false;
            }
            throw C3989Py1.a("expected header type " + Integer.toHexString(i), null);
        } else if (c3012Fy1.L() == 118 && c3012Fy1.L() == 111 && c3012Fy1.L() == 114 && c3012Fy1.L() == 98 && c3012Fy1.L() == 105 && c3012Fy1.L() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw C3989Py1.a("expected characters 'vorbis'", null);
        }
    }
}
