package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.j;
import o.UI2;

/* loaded from: classes.dex */
public abstract class n extends b {
    public boolean i1;
    public boolean j1;

    public n(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i1 || this.j1) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.Z0; i++) {
                    View w = constraintLayout.w(this.Y0[i]);
                    if (w != null) {
                        if (this.i1) {
                            w.setVisibility(visibility);
                        }
                        if (this.j1 && elevation > 0.0f) {
                            w.setTranslationZ(w.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.O1) {
                    this.i1 = true;
                } else if (index == j.c.e2) {
                    this.j1 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void L(UI2 ui2, int i, int i2) {
    }
}
