package o;

import java.text.DecimalFormat;

/* renamed from: o.cW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5588cW {
    public static final char a = 65520;
    public static final char b = 65521;
    public static final char c = 65522;
    public static final char d = 65523;
    public static final char e = 65524;
    public static final char f = 65525;
    public static final char g = 65526;
    public static final char h = 65527;
    public static final char i = 65528;
    public static final char j = 65529;
    public static final char k = 65530;
    public static final char l = 65531;
    public static final char m = 65532;
    public static final char n = 28;

    /* renamed from: o  reason: collision with root package name */
    public static final char f706o = 29;
    public static final char p = 30;
    public static final String[] q = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    public static C9753tW a(byte[] bArr, int i2) {
        String h2;
        StringBuilder sb = new StringBuilder((int) C3503Kz.h0);
        if (i2 != 2 && i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    sb.append(e(bArr, 1, 77));
                }
            } else {
                sb.append(e(bArr, 1, 93));
            }
        } else {
            if (i2 == 2) {
                h2 = new DecimalFormat("0000000000".substring(0, g(bArr))).format(f(bArr));
            } else {
                h2 = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(c(bArr));
            String format2 = decimalFormat.format(i(bArr));
            sb.append(e(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, h2 + f706o + format + f706o + format2 + f706o);
            } else {
                sb.insert(0, h2 + f706o + format + f706o + format2 + f706o);
            }
        }
        return new C9753tW(bArr, sb.toString(), null, String.valueOf(i2));
    }

    public static int b(int i2, byte[] bArr) {
        int i3 = i2 - 1;
        if (((1 << (5 - (i3 % 6))) & bArr[i3 / 6]) != 0) {
            return 1;
        }
        return 0;
    }

    public static int c(byte[] bArr) {
        return d(bArr, new byte[]{53, 54, C3307Iz.c0, C3307Iz.d0, C3307Iz.e0, C3307Iz.f0, 47, 48, C3307Iz.X, C3307Iz.Y});
    }

    public static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                i2 += b(bArr2[i3], bArr) << ((bArr2.length - i3) - 1);
            }
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static String e(byte[] bArr, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        int i4 = i2;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        while (i4 < i2 + i3) {
            char charAt = q[i6].charAt(bArr[i4]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i7 = i6;
                    i6 = charAt - a;
                    i5 = 1;
                    break;
                case 65525:
                    i5 = 2;
                    i7 = i6;
                    i6 = 0;
                    break;
                case 65526:
                    i5 = 3;
                    i7 = i6;
                    i6 = 0;
                    break;
                case 65527:
                    i5 = -1;
                    i6 = 0;
                    break;
                case 65528:
                    i5 = -1;
                    i6 = 1;
                    break;
                case 65529:
                    i5 = -1;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    break;
                case 65531:
                    i4 += 5;
                    sb.append(new DecimalFormat("000000000").format((bArr[i4 + 1] << C8077mf.B) + (bArr[i4 + 2] << C8077mf.u) + (bArr[i4 + 3] << C8077mf.n) + (bArr[i4 + 4] << 6) + bArr[i4]));
                    break;
            }
            int i8 = i5 - 1;
            if (i5 == 0) {
                i6 = i7;
            }
            i4++;
            i5 = i8;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static int f(byte[] bArr) {
        return d(bArr, new byte[]{C3307Iz.V, 34, 35, 36, C8077mf.C, C8077mf.D, C8077mf.E, 28, C8077mf.G, C8077mf.H, 19, C8077mf.x, C8077mf.y, C8077mf.z, C8077mf.A, C8077mf.B, 13, C8077mf.p, C8077mf.q, C8077mf.r, 17, C8077mf.u, 7, 8, 9, 10, C8077mf.m, C8077mf.n, 1, 2});
    }

    public static int g(byte[] bArr) {
        return d(bArr, new byte[]{C3307Iz.Z, 40, C3307Iz.a0, 42, 31, 32});
    }

    public static String h(byte[] bArr) {
        String[] strArr = q;
        return String.valueOf(new char[]{strArr[0].charAt(d(bArr, new byte[]{C3307Iz.Z, 40, C3307Iz.a0, 42, 31, 32})), strArr[0].charAt(d(bArr, new byte[]{C3307Iz.V, 34, 35, 36, C8077mf.C, C8077mf.D})), strArr[0].charAt(d(bArr, new byte[]{C8077mf.E, 28, C8077mf.G, C8077mf.H, 19, C8077mf.x})), strArr[0].charAt(d(bArr, new byte[]{C8077mf.y, C8077mf.z, C8077mf.A, C8077mf.B, 13, C8077mf.p})), strArr[0].charAt(d(bArr, new byte[]{C8077mf.q, C8077mf.r, 17, C8077mf.u, 7, 8})), strArr[0].charAt(d(bArr, new byte[]{9, 10, C8077mf.m, C8077mf.n, 1, 2}))});
    }

    public static int i(byte[] bArr) {
        return d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
