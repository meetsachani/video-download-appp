package o;

/* renamed from: o.b90  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5257b90 extends Ix2 {
    public static final int[] l = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    public final int[] k = new int[4];

    public static void s(StringBuilder sb, int i) throws C9349rr1 {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == l[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C9349rr1.a();
    }

    @Override // o.Ix2
    public int l(C10792xn c10792xn, int[] iArr, StringBuilder sb) throws C9349rr1 {
        int[] iArr2 = this.k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m = c10792xn.m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < m; i3++) {
            int j = Ix2.j(c10792xn, iArr2, i, Ix2.j);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        s(sb, i2);
        int i5 = Ix2.n(c10792xn, i, true, Ix2.g)[1];
        for (int i6 = 0; i6 < 6 && i5 < m; i6++) {
            sb.append((char) (Ix2.j(c10792xn, iArr2, i5, Ix2.i) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // o.Ix2
    public EnumC3839Ok q() {
        return EnumC3839Ok.EAN_13;
    }
}
