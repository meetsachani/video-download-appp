package o;

import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class XD1 implements WD1 {
    @Override // o.WD1
    public double a(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        double d3 = dArr[2] - dArr2[2];
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    @Override // o.WD1
    public int b(double[] dArr) {
        return C9448sG.b(dArr[0], dArr[1], dArr[2]);
    }

    @Override // o.WD1
    public double[] c(int i) {
        double[] l = C9448sG.l(i);
        return new double[]{l[0], l[1], l[2]};
    }
}
