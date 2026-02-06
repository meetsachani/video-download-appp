package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;

/* renamed from: o.uY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10003uY0 extends androidx.constraintlayout.widget.b {
    public static final String A1 = "Layer";
    public float i1;
    public float j1;
    public float k1;
    public ConstraintLayout l1;
    public float m1;
    public float n1;
    public float o1;
    public float p1;
    public float q1;
    public float r1;
    public float s1;
    public float t1;
    public boolean u1;
    public View[] v1;
    public float w1;
    public float x1;
    public boolean y1;
    public boolean z1;

    public C10003uY0(Context context) {
        super(context);
        this.i1 = Float.NaN;
        this.j1 = Float.NaN;
        this.k1 = Float.NaN;
        this.m1 = 1.0f;
        this.n1 = 1.0f;
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        this.q1 = Float.NaN;
        this.r1 = Float.NaN;
        this.s1 = Float.NaN;
        this.t1 = Float.NaN;
        this.u1 = true;
        this.v1 = null;
        this.w1 = 0.0f;
        this.x1 = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.b
    public void F(ConstraintLayout constraintLayout) {
        M();
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        UK b = ((ConstraintLayout.b) getLayoutParams()).b();
        b.d2(0);
        b.z1(0);
        L();
        layout(((int) this.s1) - getPaddingLeft(), ((int) this.t1) - getPaddingTop(), ((int) this.q1) + getPaddingRight(), ((int) this.r1) + getPaddingBottom());
        N();
    }

    @Override // androidx.constraintlayout.widget.b
    public void H(ConstraintLayout constraintLayout) {
        this.l1 = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.k1)) {
                this.k1 = rotation;
                return;
            }
            return;
        }
        this.k1 = rotation;
    }

    public void L() {
        if (this.l1 != null) {
            if (!this.u1 && !Float.isNaN(this.o1) && !Float.isNaN(this.p1)) {
                return;
            }
            if (!Float.isNaN(this.i1) && !Float.isNaN(this.j1)) {
                this.p1 = this.j1;
                this.o1 = this.i1;
                return;
            }
            View[] x = x(this.l1);
            int left = x[0].getLeft();
            int top = x[0].getTop();
            int right = x[0].getRight();
            int bottom = x[0].getBottom();
            for (int i = 0; i < this.Z0; i++) {
                View view = x[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.q1 = right;
            this.r1 = bottom;
            this.s1 = left;
            this.t1 = top;
            if (Float.isNaN(this.i1)) {
                this.o1 = (left + right) / 2;
            } else {
                this.o1 = this.i1;
            }
            if (Float.isNaN(this.j1)) {
                this.p1 = (top + bottom) / 2;
            } else {
                this.p1 = this.j1;
            }
        }
    }

    public final void M() {
        int i;
        if (this.l1 != null && (i = this.Z0) != 0) {
            View[] viewArr = this.v1;
            if (viewArr == null || viewArr.length != i) {
                this.v1 = new View[i];
            }
            for (int i2 = 0; i2 < this.Z0; i2++) {
                this.v1[i2] = this.l1.w(this.Y0[i2]);
            }
        }
    }

    public final void N() {
        double radians;
        if (this.l1 != null) {
            if (this.v1 == null) {
                M();
            }
            L();
            if (Float.isNaN(this.k1)) {
                radians = 0.0d;
            } else {
                radians = Math.toRadians(this.k1);
            }
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f = this.m1;
            float f2 = f * cos;
            float f3 = this.n1;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.Z0; i++) {
                View view = this.v1[i];
                float left = ((view.getLeft() + view.getRight()) / 2) - this.o1;
                float top = ((view.getTop() + view.getBottom()) / 2) - this.p1;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.w1);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.x1);
                view.setScaleY(this.n1);
                view.setScaleX(this.m1);
                if (!Float.isNaN(this.k1)) {
                    view.setRotation(this.k1);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l1 = (ConstraintLayout) getParent();
        if (this.y1 || this.z1) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.Z0; i++) {
                View w = this.l1.w(this.Y0[i]);
                if (w != null) {
                    if (this.y1) {
                        w.setVisibility(visibility);
                    }
                    if (this.z1 && elevation > 0.0f) {
                        w.setTranslationZ(w.getTranslationZ() + elevation);
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
    public void setPivotX(float f) {
        this.i1 = f;
        N();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.j1 = f;
        N();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.k1 = f;
        N();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.m1 = f;
        N();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.n1 = f;
        N();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.w1 = f;
        N();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.x1 = f;
        N();
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
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.O1) {
                    this.y1 = true;
                } else if (index == j.c.e2) {
                    this.z1 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C10003uY0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i1 = Float.NaN;
        this.j1 = Float.NaN;
        this.k1 = Float.NaN;
        this.m1 = 1.0f;
        this.n1 = 1.0f;
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        this.q1 = Float.NaN;
        this.r1 = Float.NaN;
        this.s1 = Float.NaN;
        this.t1 = Float.NaN;
        this.u1 = true;
        this.v1 = null;
        this.w1 = 0.0f;
        this.x1 = 0.0f;
    }

    public C10003uY0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i1 = Float.NaN;
        this.j1 = Float.NaN;
        this.k1 = Float.NaN;
        this.m1 = 1.0f;
        this.n1 = 1.0f;
        this.o1 = Float.NaN;
        this.p1 = Float.NaN;
        this.q1 = Float.NaN;
        this.r1 = Float.NaN;
        this.s1 = Float.NaN;
        this.t1 = Float.NaN;
        this.u1 = true;
        this.v1 = null;
        this.w1 = 0.0f;
        this.x1 = 0.0f;
    }
}
