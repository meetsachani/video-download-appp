package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ev0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2893Ev0 extends AbstractC8476oH1<float[]> {
    @NotNull
    public final float[] d;

    public C2893Ev0(int i) {
        super(i);
        this.d = new float[i];
    }

    public final void h(float f) {
        float[] fArr = this.d;
        int b = b();
        e(b + 1);
        fArr[b] = f;
    }

    @Override // o.AbstractC8476oH1
    /* renamed from: i */
    public int c(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return fArr.length;
    }

    @NotNull
    public final float[] j() {
        return g(this.d, new float[f()]);
    }
}
