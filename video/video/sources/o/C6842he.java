package o;

import java.io.IOException;
import o.C9740tS0;
import o.IC0;
import o.IM2;

/* renamed from: o.he  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6842he {

    /* renamed from: o.he$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IM2.b.values().length];
            a = iArr;
            try {
                iArr[IM2.b.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IM2.b.Y0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IM2.b.Z0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IM2.b.a1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IM2.b.b1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IM2.b.j1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IM2.b.c1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IM2.b.m1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[IM2.b.d1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[IM2.b.l1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[IM2.b.e1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[IM2.b.n1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[IM2.b.o1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[IM2.b.k1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[IM2.b.i1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[IM2.b.f1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[IM2.b.g1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[IM2.b.h1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static int A(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) {
        C6299fR0 c6299fR0 = (C6299fR0) kVar;
        int I = I(bArr, i2, bVar);
        c6299fR0.H3(KE.b(bVar.a));
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.a) {
                break;
            }
            I = I(bArr, I2, bVar);
            c6299fR0.H3(KE.b(bVar.a));
        }
        return I;
    }

    public static int B(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) {
        B41 b41 = (B41) kVar;
        int L = L(bArr, i2, bVar);
        b41.i4(KE.c(bVar.b));
        while (L < i3) {
            int I = I(bArr, L, bVar);
            if (i != bVar.a) {
                break;
            }
            L = L(bArr, I, bVar);
            b41.i4(KE.c(bVar.b));
        }
        return L;
    }

    public static int C(byte[] bArr, int i, b bVar) throws C9258rT0 {
        int I = I(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                bVar.c = "";
                return I;
            }
            bVar.c = new String(bArr, I, i2, C9740tS0.a);
            return I + i2;
        }
        throw C9258rT0.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int D(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) throws C9258rT0 {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.a;
        if (i4 >= 0) {
            if (i4 == 0) {
                kVar.add("");
                while (I < i3) {
                    int I2 = I(bArr, I, bVar);
                    if (i != bVar.a) {
                        break;
                    }
                    I = I(bArr, I2, bVar);
                    i4 = bVar.a;
                    if (i4 >= 0) {
                        if (i4 == 0) {
                            kVar.add("");
                        } else {
                            kVar.add(new String(bArr, I, i4, C9740tS0.a));
                            I += i4;
                            while (I < i3) {
                            }
                        }
                    } else {
                        throw C9258rT0.g();
                    }
                }
                return I;
            }
            kVar.add(new String(bArr, I, i4, C9740tS0.a));
            I += i4;
            while (I < i3) {
            }
            return I;
        }
        throw C9258rT0.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int E(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) throws C9258rT0 {
        int i4;
        int I = I(bArr, i2, bVar);
        int i5 = bVar.a;
        if (i5 >= 0) {
            if (i5 == 0) {
                kVar.add("");
                while (I < i3) {
                    int I2 = I(bArr, I, bVar);
                    if (i != bVar.a) {
                        break;
                    }
                    I = I(bArr, I2, bVar);
                    int i6 = bVar.a;
                    if (i6 >= 0) {
                        if (i6 == 0) {
                            kVar.add("");
                        } else {
                            i4 = I + i6;
                            if (BD2.u(bArr, I, i4)) {
                                kVar.add(new String(bArr, I, i6, C9740tS0.a));
                                I = i4;
                                while (I < i3) {
                                }
                            } else {
                                throw C9258rT0.d();
                            }
                        }
                    } else {
                        throw C9258rT0.g();
                    }
                }
                return I;
            }
            i4 = I + i5;
            if (BD2.u(bArr, I, i4)) {
                kVar.add(new String(bArr, I, i5, C9740tS0.a));
                I = i4;
                while (I < i3) {
                }
                return I;
            }
            throw C9258rT0.d();
        }
        throw C9258rT0.g();
    }

    public static int F(byte[] bArr, int i, b bVar) throws C9258rT0 {
        int I = I(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                bVar.c = "";
                return I;
            }
            bVar.c = BD2.h(bArr, I, i2);
            return I + i2;
        }
        throw C9258rT0.g();
    }

    public static int G(int i, byte[] bArr, int i2, int i3, C10888yA2 c10888yA2, b bVar) throws C9258rT0 {
        if (IM2.a(i) != 0) {
            int b2 = IM2.b(i);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 == 5) {
                                c10888yA2.r(i, Integer.valueOf(h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw C9258rT0.c();
                        }
                        C10888yA2 p = C10888yA2.p();
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int I = I(bArr, i2, bVar);
                            i5 = bVar.a;
                            if (i5 == i4) {
                                i2 = I;
                                break;
                            }
                            i2 = G(i5, bArr, I, i3, p, bVar);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            c10888yA2.r(i, p);
                            return i2;
                        }
                        throw C9258rT0.h();
                    }
                    int I2 = I(bArr, i2, bVar);
                    int i6 = bVar.a;
                    if (i6 >= 0) {
                        if (i6 <= bArr.length - I2) {
                            if (i6 == 0) {
                                c10888yA2.r(i, AbstractC8616os.Z0);
                            } else {
                                c10888yA2.r(i, AbstractC8616os.G(bArr, I2, i6));
                            }
                            return I2 + i6;
                        }
                        throw C9258rT0.l();
                    }
                    throw C9258rT0.g();
                }
                c10888yA2.r(i, Long.valueOf(j(bArr, i2)));
                return i2 + 8;
            }
            int L = L(bArr, i2, bVar);
            c10888yA2.r(i, Long.valueOf(bVar.b));
            return L;
        }
        throw C9258rT0.c();
    }

    public static int H(int i, byte[] bArr, int i2, b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            bVar.a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            bVar.a = i5 | (b3 << C8077mf.p);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            bVar.a = i7 | (b4 << C8077mf.y);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            bVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                bVar.a = i11;
                return i12;
            }
        }
    }

    public static int I(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            bVar.a = b2;
            return i2;
        }
        return H(b2, bArr, i2, bVar);
    }

    public static int J(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) {
        C6299fR0 c6299fR0 = (C6299fR0) kVar;
        int I = I(bArr, i2, bVar);
        c6299fR0.H3(bVar.a);
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.a) {
                break;
            }
            I = I(bArr, I2, bVar);
            c6299fR0.H3(bVar.a);
        }
        return I;
    }

    public static int K(long j, byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b2 < 0) {
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            i3 += 7;
            j2 |= (b3 & Byte.MAX_VALUE) << i3;
            i2 = i4;
            b2 = b3;
        }
        bVar.b = j2;
        return i2;
    }

    public static int L(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            bVar.b = j;
            return i2;
        }
        return K(j, bArr, i2, bVar);
    }

    public static int M(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) {
        B41 b41 = (B41) kVar;
        int L = L(bArr, i2, bVar);
        b41.i4(bVar.b);
        while (L < i3) {
            int I = I(bArr, L, bVar);
            if (i != bVar.a) {
                break;
            }
            L = L(bArr, I, bVar);
            b41.i4(bVar.b);
        }
        return L;
    }

    public static int N(int i, byte[] bArr, int i2, int i3, b bVar) throws C9258rT0 {
        if (IM2.a(i) != 0) {
            int b2 = IM2.b(i);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 == 5) {
                                return i2 + 4;
                            }
                            throw C9258rT0.c();
                        }
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (i2 < i3) {
                            i2 = I(bArr, i2, bVar);
                            i5 = bVar.a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = N(i5, bArr, i2, i3, bVar);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw C9258rT0.h();
                    }
                    return I(bArr, i2, bVar) + bVar.a;
                }
                return i2 + 8;
            }
            return L(bArr, i2, bVar);
        }
        throw C9258rT0.c();
    }

    public static int a(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) {
        boolean z;
        boolean z2;
        C3170Ho c3170Ho = (C3170Ho) kVar;
        int L = L(bArr, i2, bVar);
        if (bVar.b != 0) {
            z = true;
        } else {
            z = false;
        }
        c3170Ho.C1(z);
        while (L < i3) {
            int I = I(bArr, L, bVar);
            if (i != bVar.a) {
                break;
            }
            L = L(bArr, I, bVar);
            if (bVar.b != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c3170Ho.C1(z2);
        }
        return L;
    }

    public static int b(byte[] bArr, int i, b bVar) throws C9258rT0 {
        int I = I(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - I) {
                if (i2 == 0) {
                    bVar.c = AbstractC8616os.Z0;
                    return I;
                }
                bVar.c = AbstractC8616os.G(bArr, I, i2);
                return I + i2;
            }
            throw C9258rT0.l();
        }
        throw C9258rT0.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) throws C9258rT0 {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.a;
        if (i4 >= 0) {
            if (i4 <= bArr.length - I) {
                if (i4 == 0) {
                    kVar.add(AbstractC8616os.Z0);
                    while (I < i3) {
                        int I2 = I(bArr, I, bVar);
                        if (i != bVar.a) {
                            break;
                        }
                        I = I(bArr, I2, bVar);
                        i4 = bVar.a;
                        if (i4 >= 0) {
                            if (i4 <= bArr.length - I) {
                                if (i4 == 0) {
                                    kVar.add(AbstractC8616os.Z0);
                                } else {
                                    kVar.add(AbstractC8616os.G(bArr, I, i4));
                                    I += i4;
                                    while (I < i3) {
                                    }
                                }
                            } else {
                                throw C9258rT0.l();
                            }
                        } else {
                            throw C9258rT0.g();
                        }
                    }
                    return I;
                }
                kVar.add(AbstractC8616os.G(bArr, I, i4));
                I += i4;
                while (I < i3) {
                }
                return I;
            }
            throw C9258rT0.l();
        }
        throw C9258rT0.g();
    }

    public static double d(byte[] bArr, int i) {
        return Double.longBitsToDouble(j(bArr, i));
    }

    public static int e(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) {
        X40 x40 = (X40) kVar;
        x40.v4(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            x40.v4(d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    public static int f(int i, byte[] bArr, int i2, int i3, IC0.e<?, ?> eVar, IC0.h<?, ?> hVar, AbstractC10645xA2<C10888yA2, C10888yA2> abstractC10645xA2, b bVar) throws IOException {
        int i4;
        int i5;
        boolean z;
        Object u;
        C11040yo0<IC0.g> c11040yo0 = eVar.extensions;
        int i6 = i >>> 3;
        Object obj = null;
        if (hVar.d.g3() && hVar.d.A5()) {
            switch (a.a[hVar.b().ordinal()]) {
                case 1:
                    X40 x40 = new X40();
                    int s = s(bArr, i2, x40, bVar);
                    c11040yo0.O(hVar.d, x40);
                    return s;
                case 2:
                    C6413fv0 c6413fv0 = new C6413fv0();
                    int v = v(bArr, i2, c6413fv0, bVar);
                    c11040yo0.O(hVar.d, c6413fv0);
                    return v;
                case 3:
                case 4:
                    B41 b41 = new B41();
                    int z2 = z(bArr, i2, b41, bVar);
                    c11040yo0.O(hVar.d, b41);
                    return z2;
                case 5:
                case 6:
                    C6299fR0 c6299fR0 = new C6299fR0();
                    int y = y(bArr, i2, c6299fR0, bVar);
                    c11040yo0.O(hVar.d, c6299fR0);
                    return y;
                case 7:
                case 8:
                    B41 b412 = new B41();
                    int u2 = u(bArr, i2, b412, bVar);
                    c11040yo0.O(hVar.d, b412);
                    return u2;
                case 9:
                case 10:
                    C6299fR0 c6299fR02 = new C6299fR0();
                    int t = t(bArr, i2, c6299fR02, bVar);
                    c11040yo0.O(hVar.d, c6299fR02);
                    return t;
                case 11:
                    C3170Ho c3170Ho = new C3170Ho();
                    int r = r(bArr, i2, c3170Ho, bVar);
                    c11040yo0.O(hVar.d, c3170Ho);
                    return r;
                case 12:
                    C6299fR0 c6299fR03 = new C6299fR0();
                    int w = w(bArr, i2, c6299fR03, bVar);
                    c11040yo0.O(hVar.d, c6299fR03);
                    return w;
                case 13:
                    B41 b413 = new B41();
                    int x = x(bArr, i2, b413, bVar);
                    c11040yo0.O(hVar.d, b413);
                    return x;
                case 14:
                    C6299fR0 c6299fR04 = new C6299fR0();
                    int y2 = y(bArr, i2, c6299fR04, bVar);
                    C10888yA2 c10888yA2 = eVar.unknownFields;
                    if (c10888yA2 != C10888yA2.e()) {
                        obj = c10888yA2;
                    }
                    C10888yA2 c10888yA22 = (C10888yA2) C11222zY1.B(i6, c6299fR04, hVar.d.Z0(), obj, abstractC10645xA2);
                    if (c10888yA22 != null) {
                        eVar.unknownFields = c10888yA22;
                    }
                    c11040yo0.O(hVar.d, c6299fR04);
                    return y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hVar.d.y3());
            }
        }
        if (hVar.b() == IM2.b.k1) {
            i2 = I(bArr, i2, bVar);
            if (hVar.d.Z0().a(bVar.a) == null) {
                C10888yA2 c10888yA23 = eVar.unknownFields;
                if (c10888yA23 == C10888yA2.e()) {
                    c10888yA23 = C10888yA2.p();
                    eVar.unknownFields = c10888yA23;
                }
                C11222zY1.Q(i6, bVar.a, c10888yA23, abstractC10645xA2);
                return i2;
            }
            obj = Integer.valueOf(bVar.a);
        } else {
            switch (a.a[hVar.b().ordinal()]) {
                case 1:
                    i4 = i2;
                    obj = Double.valueOf(d(bArr, i4));
                    i2 = i4 + 8;
                    break;
                case 2:
                    i5 = i2;
                    obj = Float.valueOf(l(bArr, i5));
                    i2 = i5 + 4;
                    break;
                case 3:
                case 4:
                    i2 = L(bArr, i2, bVar);
                    obj = Long.valueOf(bVar.b);
                    break;
                case 5:
                case 6:
                    i2 = I(bArr, i2, bVar);
                    obj = Integer.valueOf(bVar.a);
                    break;
                case 7:
                case 8:
                    i4 = i2;
                    obj = Long.valueOf(j(bArr, i4));
                    i2 = i4 + 8;
                    break;
                case 9:
                case 10:
                    i5 = i2;
                    obj = Integer.valueOf(h(bArr, i5));
                    i2 = i5 + 4;
                    break;
                case 11:
                    i2 = L(bArr, i2, bVar);
                    if (bVar.b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    obj = Boolean.valueOf(z);
                    break;
                case 12:
                    i2 = I(bArr, i2, bVar);
                    obj = Integer.valueOf(KE.b(bVar.a));
                    break;
                case 13:
                    i2 = L(bArr, i2, bVar);
                    obj = Long.valueOf(KE.c(bVar.b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = b(bArr, i2, bVar);
                    obj = bVar.c;
                    break;
                case 16:
                    i2 = C(bArr, i2, bVar);
                    obj = bVar.c;
                    break;
                case 17:
                    i2 = n(XJ1.a().i(hVar.c().getClass()), bArr, i2, i3, (i6 << 3) | 4, bVar);
                    obj = bVar.c;
                    break;
                case 18:
                    i2 = p(XJ1.a().i(hVar.c().getClass()), bArr, i2, i3, bVar);
                    obj = bVar.c;
                    break;
            }
        }
        if (hVar.f()) {
            c11040yo0.h(hVar.d, obj);
            return i2;
        }
        int i7 = a.a[hVar.b().ordinal()];
        if ((i7 == 17 || i7 == 18) && (u = c11040yo0.u(hVar.d)) != null) {
            obj = C9740tS0.v(u, obj);
        }
        c11040yo0.O(hVar.d, obj);
        return i2;
    }

    public static int g(int i, byte[] bArr, int i2, int i3, Object obj, InterfaceC3540Li1 interfaceC3540Li1, AbstractC10645xA2<C10888yA2, C10888yA2> abstractC10645xA2, b bVar) throws IOException {
        IC0.h c = bVar.d.c(interfaceC3540Li1, i >>> 3);
        if (c == null) {
            return G(i, bArr, i2, i3, C3833Oi1.w(obj), bVar);
        }
        IC0.e eVar = (IC0.e) obj;
        eVar.z2();
        return f(i, bArr, i2, i3, eVar, c, abstractC10645xA2, bVar);
    }

    public static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int i(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) {
        C6299fR0 c6299fR0 = (C6299fR0) kVar;
        c6299fR0.H3(h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            c6299fR0.H3(h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static long j(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int k(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) {
        B41 b41 = (B41) kVar;
        b41.i4(j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            b41.i4(j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    public static float l(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    public static int m(int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) {
        C6413fv0 c6413fv0 = (C6413fv0) kVar;
        c6413fv0.D0(l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.a) {
                break;
            }
            c6413fv0.D0(l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static int n(InterfaceC9026qY1 interfaceC9026qY1, byte[] bArr, int i, int i2, int i3, b bVar) throws IOException {
        C3833Oi1 c3833Oi1 = (C3833Oi1) interfaceC9026qY1;
        Object b2 = c3833Oi1.b();
        int e0 = c3833Oi1.e0(b2, bArr, i, i2, i3, bVar);
        c3833Oi1.d(b2);
        bVar.c = b2;
        return e0;
    }

    public static int o(InterfaceC9026qY1 interfaceC9026qY1, int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int n = n(interfaceC9026qY1, bArr, i2, i3, i4, bVar);
        kVar.add(bVar.c);
        while (n < i3) {
            int I = I(bArr, n, bVar);
            if (i != bVar.a) {
                break;
            }
            n = n(interfaceC9026qY1, bArr, I, i3, i4, bVar);
            kVar.add(bVar.c);
        }
        return n;
    }

    public static int p(InterfaceC9026qY1 interfaceC9026qY1, byte[] bArr, int i, int i2, b bVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = H(i4, bArr, i3, bVar);
            i4 = bVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object b2 = interfaceC9026qY1.b();
            int i6 = i5 + i4;
            interfaceC9026qY1.c(b2, bArr, i5, i6, bVar);
            interfaceC9026qY1.d(b2);
            bVar.c = b2;
            return i6;
        }
        throw C9258rT0.l();
    }

    public static int q(InterfaceC9026qY1<?> interfaceC9026qY1, int i, byte[] bArr, int i2, int i3, C9740tS0.k<?> kVar, b bVar) throws IOException {
        int p = p(interfaceC9026qY1, bArr, i2, i3, bVar);
        kVar.add(bVar.c);
        while (p < i3) {
            int I = I(bArr, p, bVar);
            if (i != bVar.a) {
                break;
            }
            p = p(interfaceC9026qY1, bArr, I, i3, bVar);
            kVar.add(bVar.c);
        }
        return p;
    }

    public static int r(byte[] bArr, int i, C9740tS0.k<?> kVar, b bVar) throws IOException {
        boolean z;
        C3170Ho c3170Ho = (C3170Ho) kVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            if (bVar.b != 0) {
                z = true;
            } else {
                z = false;
            }
            c3170Ho.C1(z);
        }
        if (I == i2) {
            return I;
        }
        throw C9258rT0.l();
    }

    public static int s(byte[] bArr, int i, C9740tS0.k<?> kVar, b bVar) throws IOException {
        X40 x40 = (X40) kVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            x40.v4(d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw C9258rT0.l();
    }

    public static int t(byte[] bArr, int i, C9740tS0.k<?> kVar, b bVar) throws IOException {
        C6299fR0 c6299fR0 = (C6299fR0) kVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            c6299fR0.H3(h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw C9258rT0.l();
    }

    public static int u(byte[] bArr, int i, C9740tS0.k<?> kVar, b bVar) throws IOException {
        B41 b41 = (B41) kVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            b41.i4(j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw C9258rT0.l();
    }

    public static int v(byte[] bArr, int i, C9740tS0.k<?> kVar, b bVar) throws IOException {
        C6413fv0 c6413fv0 = (C6413fv0) kVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            c6413fv0.D0(l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw C9258rT0.l();
    }

    public static int w(byte[] bArr, int i, C9740tS0.k<?> kVar, b bVar) throws IOException {
        C6299fR0 c6299fR0 = (C6299fR0) kVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            c6299fR0.H3(KE.b(bVar.a));
        }
        if (I == i2) {
            return I;
        }
        throw C9258rT0.l();
    }

    public static int x(byte[] bArr, int i, C9740tS0.k<?> kVar, b bVar) throws IOException {
        B41 b41 = (B41) kVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            b41.i4(KE.c(bVar.b));
        }
        if (I == i2) {
            return I;
        }
        throw C9258rT0.l();
    }

    public static int y(byte[] bArr, int i, C9740tS0.k<?> kVar, b bVar) throws IOException {
        C6299fR0 c6299fR0 = (C6299fR0) kVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            c6299fR0.H3(bVar.a);
        }
        if (I == i2) {
            return I;
        }
        throw C9258rT0.l();
    }

    public static int z(byte[] bArr, int i, C9740tS0.k<?> kVar, b bVar) throws IOException {
        B41 b41 = (B41) kVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            b41.i4(bVar.b);
        }
        if (I == i2) {
            return I;
        }
        throw C9258rT0.l();
    }

    /* renamed from: o.he$b */
    /* loaded from: classes.dex */
    public static final class b {
        public int a;
        public long b;
        public Object c;
        public final C3151Hj0 d;

        public b() {
            this.d = C3151Hj0.d();
        }

        public b(C3151Hj0 c3151Hj0) {
            c3151Hj0.getClass();
            this.d = c3151Hj0;
        }
    }
}
