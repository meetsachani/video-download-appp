package o;

import android.animation.TypeEvaluator;

/* renamed from: o.ev0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6170ev0 implements TypeEvaluator<float[]> {
    public float[] a;

    public C6170ev0(float[] fArr) {
        this.a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
