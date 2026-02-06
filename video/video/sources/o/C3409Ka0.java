package o;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* renamed from: o.Ka0 */
/* loaded from: classes.dex */
public class C3409Ka0 implements TransformationMethod {
    public final TransformationMethod X;

    public C3409Ka0(TransformationMethod transformationMethod) {
        this.X = transformationMethod;
    }

    public TransformationMethod a() {
        return this.X;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.X;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && androidx.emoji2.text.c.c().i() == 1) {
            return androidx.emoji2.text.c.c().x(charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.X;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
