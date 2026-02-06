package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class g extends b {
    public g(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    public void F(ConstraintLayout constraintLayout) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.v0.d2(0);
        bVar.v0.z1(0);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
    }

    @Override // androidx.constraintlayout.widget.b
    public void s(ConstraintLayout constraintLayout) {
        r(constraintLayout);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        q();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        q();
    }

    @Override // androidx.constraintlayout.widget.b
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.c1 = false;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
