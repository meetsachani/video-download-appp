package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.x50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10623x50 extends AbstractC8476oH1<double[]> {
    @NotNull
    public final double[] d;

    public C10623x50(int i) {
        super(i);
        this.d = new double[i];
    }

    public final void h(double d) {
        double[] dArr = this.d;
        int b = b();
        e(b + 1);
        dArr[b] = d;
    }

    @Override // o.AbstractC8476oH1
    /* renamed from: i */
    public int c(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return dArr.length;
    }

    @NotNull
    public final double[] j() {
        return g(this.d, new double[f()]);
    }
}
