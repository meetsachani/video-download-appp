package o;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class MI2 extends LI2 {
    @Override // o.DI2
    public float c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // o.HI2, o.DI2
    public void e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // o.JI2, o.DI2
    public void f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o.DI2
    public void g(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // o.LI2, o.DI2
    public void h(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // o.HI2, o.DI2
    public void i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // o.HI2, o.DI2
    public void j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
