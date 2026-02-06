package o;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: o.sd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9536sd1 implements TypeEvaluator<Matrix> {
    public final float[] a = new float[9];
    public final float[] b = new float[9];
    public final Matrix c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @InterfaceC5670cr1
    /* renamed from: a */
    public Matrix evaluate(float f, @InterfaceC5670cr1 Matrix matrix, @InterfaceC5670cr1 Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.b;
            float f2 = fArr[i];
            float f3 = this.a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.c.setValues(this.b);
        return this.c;
    }
}
