package o;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: o.dW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5831dW {
    public static final char[] A = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    public static final char[] B = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    public static final BigInteger[] C;
    public static final int D = 2;
    public static final int a = 900;
    public static final int b = 901;
    public static final int c = 902;
    public static final int d = 924;
    public static final int e = 925;
    public static final int f = 926;
    public static final int g = 927;
    public static final int h = 928;
    public static final int i = 923;
    public static final int j = 922;
    public static final int k = 913;
    public static final int l = 15;
    public static final int m = 0;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f715o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final int r = 5;
    public static final int s = 6;
    public static final int t = 25;
    public static final int u = 27;
    public static final int v = 27;
    public static final int w = 28;
    public static final int x = 28;
    public static final int y = 29;
    public static final int z = 29;

    /* renamed from: o.dW$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o.dW$b */
    /* loaded from: classes3.dex */
    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        C = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i2 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = C;
            if (i2 < bigIntegerArr2.length) {
                bigIntegerArr2[i2] = bigIntegerArr2[i2 - 1].multiply(valueOf);
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i2, int[] iArr, Charset charset, int i3, StringBuilder sb) {
        int i4;
        int i5;
        int i6;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        if (i2 != 901) {
            if (i2 != 924) {
                i5 = i3;
            } else {
                i5 = i3;
                boolean z2 = false;
                int i8 = 0;
                long j2 = 0;
                while (i5 < iArr[i7] && !z2) {
                    int i9 = i5 + 1;
                    int i10 = iArr[i5];
                    if (i10 < 900) {
                        i8++;
                        j2 = (j2 * 900) + i10;
                    } else {
                        if (i10 != 928) {
                            switch (i10) {
                                default:
                                    switch (i10) {
                                    }
                                case 900:
                                case 901:
                                case 902:
                                    z2 = true;
                                    break;
                            }
                            if (i8 % 5 != 0 && i8 > 0) {
                                int i11 = i7;
                                while (i11 < 6) {
                                    byteArrayOutputStream.write((byte) (j2 >> ((5 - i11) * 8)));
                                    i11++;
                                    i7 = i7;
                                }
                                i6 = i7;
                                i8 = i6;
                                j2 = 0;
                            } else {
                                i6 = i7;
                            }
                            i7 = i6;
                        }
                        z2 = true;
                        if (i8 % 5 != 0) {
                        }
                        i6 = i7;
                        i7 = i6;
                    }
                    i5 = i9;
                    if (i8 % 5 != 0) {
                    }
                    i6 = i7;
                    i7 = i6;
                }
            }
        } else {
            int[] iArr2 = new int[6];
            int i12 = i3 + 1;
            int i13 = iArr[i3];
            boolean z3 = false;
            int i14 = 0;
            while (true) {
                long j3 = 0;
                while (true) {
                    i4 = iArr[0];
                    if (i12 < i4 && !z3) {
                        int i15 = i14 + 1;
                        iArr2[i14] = i13;
                        j3 = (j3 * 900) + i13;
                        int i16 = i12 + 1;
                        int i17 = iArr[i12];
                        if (i17 != 928) {
                            switch (i17) {
                                case 900:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i17) {
                                        case j /* 922 */:
                                        case i /* 923 */:
                                        case 924:
                                            break;
                                        default:
                                            if (i15 % 5 == 0 && i15 > 0) {
                                                for (int i18 = 0; i18 < 6; i18++) {
                                                    byteArrayOutputStream.write((byte) (j3 >> ((5 - i18) * 8)));
                                                }
                                                i12 = i16;
                                                i13 = i17;
                                                i14 = 0;
                                            } else {
                                                i12 = i16;
                                                i13 = i17;
                                                i14 = i15;
                                            }
                                    }
                            }
                        }
                        i13 = i17;
                        i14 = i15;
                        z3 = true;
                    }
                }
            }
            if (i12 == i4 && i13 < 900) {
                iArr2[i14] = i13;
                i14++;
            }
            for (int i19 = 0; i19 < i14; i19++) {
                byteArrayOutputStream.write((byte) iArr2[i19]);
            }
            i5 = i12;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C9753tW b(int[] iArr, String str) throws C2605Bx0 {
        int i2;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = iArr[1];
        C10102ux1 c10102ux1 = new C10102ux1();
        int i4 = 2;
        while (i4 < iArr[0]) {
            if (i3 != 913) {
                switch (i3) {
                    case 900:
                        i2 = g(iArr, i4, sb);
                        break;
                    case 901:
                        i2 = a(i3, iArr, charset, i4, sb);
                        break;
                    case 902:
                        i2 = f(iArr, i4, sb);
                        break;
                    default:
                        switch (i3) {
                            case j /* 922 */:
                            case i /* 923 */:
                                throw C2605Bx0.a();
                            case 924:
                                break;
                            case 925:
                                i2 = i4 + 1;
                                break;
                            case 926:
                                i2 = i4 + 2;
                                break;
                            case 927:
                                i2 = i4 + 1;
                                charset = Charset.forName(EnumC10403wB.g(iArr[i4]).name());
                                break;
                            case 928:
                                i2 = d(iArr, i4, c10102ux1);
                                break;
                            default:
                                i2 = g(iArr, i4 - 1, sb);
                                break;
                        }
                }
            } else {
                i2 = i4 + 1;
                sb.append((char) iArr[i4]);
            }
            if (i2 < iArr.length) {
                i4 = i2 + 1;
                i3 = iArr[i2];
            } else {
                throw C2605Bx0.a();
            }
        }
        if (sb.length() != 0) {
            C9753tW c9753tW = new C9753tW(null, sb.toString(), null, str);
            c9753tW.o(c10102ux1);
            return c9753tW;
        }
        throw C2605Bx0.a();
    }

    public static String c(int[] iArr, int i2) throws C2605Bx0 {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i3 = 0; i3 < i2; i3++) {
            bigInteger = bigInteger.add(C[(i2 - i3) - 1].multiply(BigInteger.valueOf(iArr[i3])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C2605Bx0.a();
    }

    public static int d(int[] iArr, int i2, C10102ux1 c10102ux1) throws C2605Bx0 {
        int i3;
        if (i2 + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i4 = 0;
            while (i4 < 2) {
                iArr2[i4] = iArr[i2];
                i4++;
                i2++;
            }
            c10102ux1.t(Integer.parseInt(c(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int g2 = g(iArr, i2, sb);
            c10102ux1.n(sb.toString());
            if (iArr[g2] == 923) {
                i3 = g2 + 1;
            } else {
                i3 = -1;
            }
            while (g2 < iArr[0]) {
                int i5 = iArr[g2];
                if (i5 != 922) {
                    if (i5 == 923) {
                        switch (iArr[g2 + 1]) {
                            case 0:
                                StringBuilder sb2 = new StringBuilder();
                                g2 = g(iArr, g2 + 2, sb2);
                                c10102ux1.o(sb2.toString());
                                continue;
                            case 1:
                                StringBuilder sb3 = new StringBuilder();
                                g2 = f(iArr, g2 + 2, sb3);
                                c10102ux1.s(Integer.parseInt(sb3.toString()));
                                continue;
                            case 2:
                                StringBuilder sb4 = new StringBuilder();
                                g2 = f(iArr, g2 + 2, sb4);
                                c10102ux1.v(Long.parseLong(sb4.toString()));
                                continue;
                            case 3:
                                StringBuilder sb5 = new StringBuilder();
                                g2 = g(iArr, g2 + 2, sb5);
                                c10102ux1.u(sb5.toString());
                                continue;
                            case 4:
                                StringBuilder sb6 = new StringBuilder();
                                g2 = g(iArr, g2 + 2, sb6);
                                c10102ux1.l(sb6.toString());
                                continue;
                            case 5:
                                StringBuilder sb7 = new StringBuilder();
                                g2 = f(iArr, g2 + 2, sb7);
                                c10102ux1.p(Long.parseLong(sb7.toString()));
                                continue;
                            case 6:
                                StringBuilder sb8 = new StringBuilder();
                                g2 = f(iArr, g2 + 2, sb8);
                                c10102ux1.m(Integer.parseInt(sb8.toString()));
                                continue;
                            default:
                                throw C2605Bx0.a();
                        }
                    } else {
                        throw C2605Bx0.a();
                    }
                } else {
                    g2++;
                    c10102ux1.q(true);
                }
            }
            if (i3 != -1) {
                int i6 = g2 - i3;
                if (c10102ux1.k()) {
                    i6--;
                }
                c10102ux1.r(Arrays.copyOfRange(iArr, i3, i6 + i3));
            }
            return g2;
        }
        throw C2605Bx0.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(int[] iArr, int[] iArr2, int i2, StringBuilder sb) {
        b bVar;
        int i3;
        b bVar2 = b.ALPHA;
        b bVar3 = bVar2;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = iArr[i4];
            char c2 = ' ';
            switch (a.a[bVar2.ordinal()]) {
                case 1:
                    if (i5 < 26) {
                        i3 = i5 + 65;
                        c2 = (char) i3;
                        break;
                    } else {
                        if (i5 != 900) {
                            if (i5 != 913) {
                                switch (i5) {
                                    case 27:
                                        bVar2 = b.LOWER;
                                        break;
                                    case 28:
                                        bVar2 = b.MIXED;
                                        break;
                                    case 29:
                                        bVar = b.PUNCT_SHIFT;
                                        b bVar4 = bVar;
                                        bVar3 = bVar2;
                                        bVar2 = bVar4;
                                        break;
                                }
                            } else {
                                sb.append((char) iArr2[i4]);
                            }
                        } else {
                            bVar2 = b.ALPHA;
                        }
                        c2 = 0;
                        break;
                    }
                case 2:
                    if (i5 < 26) {
                        i3 = i5 + 97;
                        c2 = (char) i3;
                        break;
                    } else {
                        if (i5 != 900) {
                            if (i5 != 913) {
                                switch (i5) {
                                    case 27:
                                        bVar = b.ALPHA_SHIFT;
                                        b bVar42 = bVar;
                                        bVar3 = bVar2;
                                        bVar2 = bVar42;
                                        break;
                                    case 28:
                                        bVar2 = b.MIXED;
                                        break;
                                    case 29:
                                        bVar = b.PUNCT_SHIFT;
                                        b bVar422 = bVar;
                                        bVar3 = bVar2;
                                        bVar2 = bVar422;
                                        break;
                                }
                            } else {
                                sb.append((char) iArr2[i4]);
                            }
                        } else {
                            bVar2 = b.ALPHA;
                        }
                        c2 = 0;
                        break;
                    }
                case 3:
                    if (i5 < 25) {
                        c2 = B[i5];
                        break;
                    } else {
                        if (i5 != 900) {
                            if (i5 != 913) {
                                switch (i5) {
                                    case 25:
                                        bVar2 = b.PUNCT;
                                        break;
                                    case 27:
                                        bVar2 = b.LOWER;
                                        break;
                                    case 28:
                                        bVar2 = b.ALPHA;
                                        break;
                                    case 29:
                                        bVar = b.PUNCT_SHIFT;
                                        b bVar4222 = bVar;
                                        bVar3 = bVar2;
                                        bVar2 = bVar4222;
                                        break;
                                }
                            } else {
                                sb.append((char) iArr2[i4]);
                            }
                        } else {
                            bVar2 = b.ALPHA;
                        }
                        c2 = 0;
                        break;
                    }
                    break;
                case 4:
                    if (i5 < 29) {
                        c2 = A[i5];
                        break;
                    } else {
                        if (i5 != 29) {
                            if (i5 != 900) {
                                if (i5 == 913) {
                                    sb.append((char) iArr2[i4]);
                                }
                            } else {
                                bVar2 = b.ALPHA;
                            }
                        } else {
                            bVar2 = b.ALPHA;
                        }
                        c2 = 0;
                        break;
                    }
                case 5:
                    if (i5 < 26) {
                        c2 = (char) (i5 + 65);
                    } else if (i5 != 26) {
                        if (i5 != 900) {
                            bVar2 = bVar3;
                        } else {
                            bVar2 = b.ALPHA;
                        }
                        c2 = 0;
                        break;
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i5 < 29) {
                        c2 = A[i5];
                    } else {
                        if (i5 != 29) {
                            if (i5 != 900) {
                                if (i5 == 913) {
                                    sb.append((char) iArr2[i4]);
                                }
                                c2 = 0;
                            } else {
                                bVar2 = b.ALPHA;
                            }
                        } else {
                            bVar2 = b.ALPHA;
                        }
                        c2 = 0;
                        break;
                    }
                    bVar2 = bVar3;
                    break;
                default:
                    c2 = 0;
                    break;
            }
            if (c2 != 0) {
                sb.append(c2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
        r10.append(c(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(int[] iArr, int i2, StringBuilder sb) throws C2605Bx0 {
        int[] iArr2 = new int[15];
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            int i4 = iArr[0];
            if (i2 < i4 && !z2) {
                int i5 = i2 + 1;
                int i6 = iArr[i2];
                if (i5 == i4) {
                    z2 = true;
                }
                if (i6 < 900) {
                    iArr2[i3] = i6;
                    i3++;
                } else {
                    if (i6 != 900 && i6 != 901 && i6 != 928) {
                        switch (i6) {
                        }
                        if (i3 % 15 == 0 || i6 == 902 || z2) {
                        }
                    }
                    z2 = true;
                    if (i3 % 15 == 0) {
                    }
                }
                i2 = i5;
                if (i3 % 15 == 0) {
                }
            }
        }
        return i2;
    }

    public static int g(int[] iArr, int i2, StringBuilder sb) {
        int i3 = iArr[0];
        int[] iArr2 = new int[(i3 - i2) << 1];
        int[] iArr3 = new int[(i3 - i2) << 1];
        boolean z2 = false;
        int i4 = 0;
        while (i2 < iArr[0] && !z2) {
            int i5 = i2 + 1;
            int i6 = iArr[i2];
            if (i6 < 900) {
                iArr2[i4] = i6 / 30;
                iArr2[i4 + 1] = i6 % 30;
                i4 += 2;
            } else if (i6 != 913) {
                if (i6 != 928) {
                    switch (i6) {
                        case 900:
                            iArr2[i4] = 900;
                            i4++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i6) {
                            }
                    }
                }
                z2 = true;
            } else {
                iArr2[i4] = 913;
                i2 += 2;
                iArr3[i4] = iArr[i5];
                i4++;
            }
            i2 = i5;
        }
        e(iArr2, iArr3, i4, sb);
        return i2;
    }
}
