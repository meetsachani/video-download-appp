package o;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import o.WE2;

/* renamed from: o.Db0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2716Db0 {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final String b = "ISO-8859-1";

    /* renamed from: o.Db0$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC6625gk1.values().length];
            a = iArr;
            try {
                iArr[EnumC6625gk1.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC6625gk1.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC6625gk1.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC6625gk1.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(String str, C10792xn c10792xn, String str2) throws PN2 {
        try {
            for (byte b2 : str.getBytes(str2)) {
                c10792xn.d(b2, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new PN2(e);
        }
    }

    public static void b(CharSequence charSequence, C10792xn c10792xn) throws PN2 {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int r = r(charSequence.charAt(i));
            if (r != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int r2 = r(charSequence.charAt(i2));
                    if (r2 != -1) {
                        c10792xn.d((r * 45) + r2, 11);
                        i += 2;
                    } else {
                        throw new PN2();
                    }
                } else {
                    c10792xn.d(r, 6);
                    i = i2;
                }
            } else {
                throw new PN2();
            }
        }
    }

    public static void c(String str, EnumC6625gk1 enumC6625gk1, C10792xn c10792xn, String str2) throws PN2 {
        int i = a.a[enumC6625gk1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        e(str, c10792xn);
                        return;
                    }
                    throw new PN2("Invalid mode: ".concat(String.valueOf(enumC6625gk1)));
                }
                a(str, c10792xn, str2);
                return;
            }
            b(str, c10792xn);
            return;
        }
        h(str, c10792xn);
    }

    public static void d(EnumC10403wB enumC10403wB, C10792xn c10792xn) {
        c10792xn.d(EnumC6625gk1.ECI.g(), 4);
        c10792xn.d(enumC10403wB.h(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(String str, C10792xn c10792xn) throws PN2 {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
                int i4 = 33088;
                if (i3 < 33088 || i3 > 40956) {
                    if (i3 >= 57408 && i3 <= 60351) {
                        i4 = 49472;
                    } else {
                        i = -1;
                        if (i == -1) {
                            c10792xn.d(((i >> 8) * CK1.x) + (i & 255), 13);
                        } else {
                            throw new PN2("Invalid byte sequence");
                        }
                    }
                }
                i = i3 - i4;
                if (i == -1) {
                }
            }
        } catch (UnsupportedEncodingException e) {
            throw new PN2(e);
        }
    }

    public static void f(int i, WE2 we2, EnumC6625gk1 enumC6625gk1, C10792xn c10792xn) throws PN2 {
        int h = enumC6625gk1.h(we2);
        int i2 = 1 << h;
        if (i < i2) {
            c10792xn.d(i, h);
            return;
        }
        throw new PN2(i + " is bigger than " + (i2 - 1));
    }

    public static void g(EnumC6625gk1 enumC6625gk1, C10792xn c10792xn) {
        c10792xn.d(enumC6625gk1.g(), 4);
    }

    public static void h(CharSequence charSequence, C10792xn c10792xn) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                c10792xn.d((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    c10792xn.d((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    c10792xn.d(charAt, 4);
                }
            }
        }
    }

    public static int i(EnumC6625gk1 enumC6625gk1, C10792xn c10792xn, C10792xn c10792xn2, WE2 we2) {
        return c10792xn.m() + enumC6625gk1.h(we2) + c10792xn2.m();
    }

    public static int j(C5672cs c5672cs) {
        return E81.a(c5672cs) + E81.c(c5672cs) + E81.d(c5672cs) + E81.e(c5672cs);
    }

    public static int k(C10792xn c10792xn, EnumC8074me0 enumC8074me0, WE2 we2, C5672cs c5672cs) throws PN2 {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C10265vd1.a(c10792xn, enumC8074me0, we2, i3, c5672cs);
            int j = j(c5672cs);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    public static EnumC6625gk1 l(String str) {
        return m(str, null);
    }

    public static EnumC6625gk1 m(String str, String str2) {
        if ("Shift_JIS".equals(str2) && u(str)) {
            return EnumC6625gk1.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (r(charAt) != -1) {
                z = true;
            } else {
                return EnumC6625gk1.BYTE;
            }
        }
        if (z) {
            return EnumC6625gk1.ALPHANUMERIC;
        }
        if (z2) {
            return EnumC6625gk1.NUMERIC;
        }
        return EnumC6625gk1.BYTE;
    }

    public static WE2 n(int i, EnumC8074me0 enumC8074me0) throws PN2 {
        for (int i2 = 1; i2 <= 40; i2++) {
            WE2 i3 = WE2.i(i2);
            if (x(i, i3, enumC8074me0)) {
                return i3;
            }
        }
        throw new PN2("Data too big");
    }

    public static TK1 o(String str, EnumC8074me0 enumC8074me0) throws PN2 {
        return p(str, enumC8074me0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TK1 p(String str, EnumC8074me0 enumC8074me0, Map<EnumC9284rb0, ?> map) throws PN2 {
        boolean z;
        String str2;
        WE2 v;
        int length;
        EnumC10403wB e;
        if (map != null && map.containsKey(EnumC9284rb0.CHARACTER_SET)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = map.get(EnumC9284rb0.CHARACTER_SET).toString();
        } else {
            str2 = "ISO-8859-1";
        }
        EnumC6625gk1 m = m(str, str2);
        C10792xn c10792xn = new C10792xn();
        EnumC6625gk1 enumC6625gk1 = EnumC6625gk1.BYTE;
        if (m == enumC6625gk1 && z && (e = EnumC10403wB.e(str2)) != null) {
            d(e, c10792xn);
        }
        if (map != null) {
            EnumC9284rb0 enumC9284rb0 = EnumC9284rb0.GS1_FORMAT;
            if (map.containsKey(enumC9284rb0) && Boolean.valueOf(map.get(enumC9284rb0).toString()).booleanValue()) {
                g(EnumC6625gk1.FNC1_FIRST_POSITION, c10792xn);
            }
        }
        g(m, c10792xn);
        C10792xn c10792xn2 = new C10792xn();
        c(str, m, c10792xn2, str2);
        if (map != null) {
            EnumC9284rb0 enumC9284rb02 = EnumC9284rb0.QR_VERSION;
            if (map.containsKey(enumC9284rb02)) {
                v = WE2.i(Integer.parseInt(map.get(enumC9284rb02).toString()));
                if (!x(i(m, c10792xn, c10792xn2, v), v, enumC8074me0)) {
                    throw new PN2("Data too big for requested version");
                }
                C10792xn c10792xn3 = new C10792xn();
                c10792xn3.c(c10792xn);
                if (m != enumC6625gk1) {
                    length = c10792xn2.n();
                } else {
                    length = str.length();
                }
                f(length, v, m, c10792xn3);
                c10792xn3.c(c10792xn2);
                WE2.b f = v.f(enumC8074me0);
                int h = v.h() - f.d();
                w(h, c10792xn3);
                C10792xn t = t(c10792xn3, v.h(), h, f.c());
                TK1 tk1 = new TK1();
                tk1.g(enumC8074me0);
                tk1.j(m);
                tk1.k(v);
                int e2 = v.e();
                C5672cs c5672cs = new C5672cs(e2, e2);
                int k = k(t, enumC8074me0, v, c5672cs);
                tk1.h(k);
                C10265vd1.a(t, enumC8074me0, v, k, c5672cs);
                tk1.i(c5672cs);
                return tk1;
            }
        }
        v = v(enumC8074me0, m, c10792xn, c10792xn2);
        C10792xn c10792xn32 = new C10792xn();
        c10792xn32.c(c10792xn);
        if (m != enumC6625gk1) {
        }
        f(length, v, m, c10792xn32);
        c10792xn32.c(c10792xn2);
        WE2.b f2 = v.f(enumC8074me0);
        int h2 = v.h() - f2.d();
        w(h2, c10792xn32);
        C10792xn t2 = t(c10792xn32, v.h(), h2, f2.c());
        TK1 tk12 = new TK1();
        tk12.g(enumC8074me0);
        tk12.j(m);
        tk12.k(v);
        int e22 = v.e();
        C5672cs c5672cs2 = new C5672cs(e22, e22);
        int k2 = k(t2, enumC8074me0, v, c5672cs2);
        tk12.h(k2);
        C10265vd1.a(t2, enumC8074me0, v, k2, c5672cs2);
        tk12.i(c5672cs2);
        return tk12;
    }

    public static byte[] q(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new LP1(LC0.l).b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    public static int r(int i) {
        int[] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    public static void s(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws PN2 {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 == i12) {
                if (i3 == i6 + i5) {
                    if (i == ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                        if (i4 < i6) {
                            iArr[0] = i9;
                            iArr2[0] = i11;
                            return;
                        }
                        iArr[0] = i10;
                        iArr2[0] = i12;
                        return;
                    }
                    throw new PN2("Total bytes mismatch");
                }
                throw new PN2("RS blocks mismatch");
            }
            throw new PN2("EC bytes mismatch");
        }
        throw new PN2("Block ID too large");
    }

    public static C10792xn t(C10792xn c10792xn, int i, int i2, int i3) throws PN2 {
        if (c10792xn.n() == i2) {
            ArrayList<C9086qo> arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i4 < i3) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int i8 = i;
                int i9 = i2;
                int i10 = i3;
                s(i8, i9, i10, i4, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                c10792xn.u(i5 << 3, bArr, 0, i11);
                byte[] q = q(bArr, iArr2[0]);
                arrayList.add(new C9086qo(bArr, q));
                i6 = Math.max(i6, i11);
                i7 = Math.max(i7, q.length);
                i5 += iArr[0];
                i4++;
                i = i8;
                i2 = i9;
                i3 = i10;
            }
            int i12 = i;
            if (i2 == i5) {
                C10792xn c10792xn2 = new C10792xn();
                for (int i13 = 0; i13 < i6; i13++) {
                    for (C9086qo c9086qo : arrayList) {
                        byte[] a2 = c9086qo.a();
                        if (i13 < a2.length) {
                            c10792xn2.d(a2[i13], 8);
                        }
                    }
                }
                for (int i14 = 0; i14 < i7; i14++) {
                    for (C9086qo c9086qo2 : arrayList) {
                        byte[] b2 = c9086qo2.b();
                        if (i14 < b2.length) {
                            c10792xn2.d(b2[i14], 8);
                        }
                    }
                }
                if (i12 == c10792xn2.n()) {
                    return c10792xn2;
                }
                throw new PN2("Interleaving error: " + i12 + " and " + c10792xn2.n() + " differ.");
            }
            throw new PN2("Data bytes does not match offset");
        }
        throw new PN2("Number of bits and data bytes does not match");
    }

    public static boolean u(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static WE2 v(EnumC8074me0 enumC8074me0, EnumC6625gk1 enumC6625gk1, C10792xn c10792xn, C10792xn c10792xn2) throws PN2 {
        return n(i(enumC6625gk1, c10792xn, c10792xn2, n(i(enumC6625gk1, c10792xn, c10792xn2, WE2.i(1)), enumC8074me0)), enumC8074me0);
    }

    public static void w(int i, C10792xn c10792xn) throws PN2 {
        int i2;
        int i3 = i << 3;
        if (c10792xn.m() <= i3) {
            for (int i4 = 0; i4 < 4 && c10792xn.m() < i3; i4++) {
                c10792xn.b(false);
            }
            int m = c10792xn.m() & 7;
            if (m > 0) {
                while (m < 8) {
                    c10792xn.b(false);
                    m++;
                }
            }
            int n = i - c10792xn.n();
            for (int i5 = 0; i5 < n; i5++) {
                if ((i5 & 1) == 0) {
                    i2 = 236;
                } else {
                    i2 = 17;
                }
                c10792xn.d(i2, 8);
            }
            if (c10792xn.m() == i3) {
                return;
            }
            throw new PN2("Bits size does not equal capacity");
        }
        throw new PN2("data bits cannot fit in the QR Code" + c10792xn.m() + " > " + i3);
    }

    public static boolean x(int i, WE2 we2, EnumC8074me0 enumC8074me0) {
        if (we2.h() - we2.f(enumC8074me0).d() >= (i + 7) / 8) {
            return true;
        }
        return false;
    }
}
