package o;

import android.graphics.Matrix;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class J22 {
    public static final void a(Shader shader, HA0<? super Matrix, C7458kA2> ha0) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        ha0.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
