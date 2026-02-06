package o;

/* renamed from: o.d90  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5742d90 extends Ix2 {
    public final int[] k = new int[4];

    @Override // o.Ix2
    public int l(C10792xn c10792xn, int[] iArr, StringBuilder sb) throws C9349rr1 {
        int[] iArr2 = this.k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m = c10792xn.m();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < m; i2++) {
            sb.append((char) (Ix2.j(c10792xn, iArr2, i, Ix2.i) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = Ix2.n(c10792xn, i, true, Ix2.g)[1];
        for (int i5 = 0; i5 < 4 && i4 < m; i5++) {
            sb.append((char) (Ix2.j(c10792xn, iArr2, i4, Ix2.i) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // o.Ix2
    public EnumC3839Ok q() {
        return EnumC3839Ok.EAN_8;
    }
}
