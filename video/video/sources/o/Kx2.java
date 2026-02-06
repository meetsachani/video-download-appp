package o;

/* loaded from: classes3.dex */
public final class Kx2 extends Ix2 {
    public static final int[] l = {1, 1, 1, 1, 1, 1};
    public static final int[][] m = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    public final int[] k = new int[4];

    public static String s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    public static void t(StringBuilder sb, int i) throws C9349rr1 {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == m[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C9349rr1.a();
    }

    @Override // o.Ix2
    public boolean h(String str) throws C2605Bx0 {
        return super.h(s(str));
    }

    @Override // o.Ix2
    public int[] k(C10792xn c10792xn, int i) throws C9349rr1 {
        return Ix2.n(c10792xn, i, true, l);
    }

    @Override // o.Ix2
    public int l(C10792xn c10792xn, int[] iArr, StringBuilder sb) throws C9349rr1 {
        int[] iArr2 = this.k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m2 = c10792xn.m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < m2; i3++) {
            int j = Ix2.j(c10792xn, iArr2, i, Ix2.j);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        t(sb, i2);
        return i;
    }

    @Override // o.Ix2
    public EnumC3839Ok q() {
        return EnumC3839Ok.UPC_E;
    }
}
