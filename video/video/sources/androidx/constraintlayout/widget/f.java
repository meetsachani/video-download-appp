package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;

/* loaded from: classes.dex */
public class f extends ViewGroup {
    public static final String Z0 = "Constraints";
    public e Y0;

    public f(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final void c() {
        Log.v(Z0, " ################# init");
    }

    public e getConstraintSet() {
        if (this.Y0 == null) {
            this.Y0 = new e();
        }
        this.Y0.J(this);
        return this.Y0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
        super.setVisibility(8);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
        super.setVisibility(8);
    }

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float V0;
        public boolean W0;
        public float X0;
        public float Y0;
        public float Z0;
        public float a1;
        public float b1;
        public float c1;
        public float d1;
        public float e1;
        public float f1;
        public float g1;
        public float h1;

        public a(int i, int i2) {
            super(i, i2);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 0.0f;
            this.b1 = 1.0f;
            this.c1 = 1.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            this.h1 = 0.0f;
        }

        public a(a aVar) {
            super(aVar);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 0.0f;
            this.b1 = 1.0f;
            this.c1 = 1.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            this.h1 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 0.0f;
            this.b1 = 1.0f;
            this.c1 = 1.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            this.h1 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.g6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.w6) {
                    this.V0 = obtainStyledAttributes.getFloat(index, this.V0);
                } else if (index == j.c.J6) {
                    this.X0 = obtainStyledAttributes.getFloat(index, this.X0);
                    this.W0 = true;
                } else if (index == j.c.E6) {
                    this.Z0 = obtainStyledAttributes.getFloat(index, this.Z0);
                } else if (index == j.c.F6) {
                    this.a1 = obtainStyledAttributes.getFloat(index, this.a1);
                } else if (index == j.c.D6) {
                    this.Y0 = obtainStyledAttributes.getFloat(index, this.Y0);
                } else if (index == j.c.B6) {
                    this.b1 = obtainStyledAttributes.getFloat(index, this.b1);
                } else if (index == j.c.C6) {
                    this.c1 = obtainStyledAttributes.getFloat(index, this.c1);
                } else if (index == j.c.x6) {
                    this.d1 = obtainStyledAttributes.getFloat(index, this.d1);
                } else if (index == j.c.y6) {
                    this.e1 = obtainStyledAttributes.getFloat(index, this.e1);
                } else if (index == j.c.z6) {
                    this.f1 = obtainStyledAttributes.getFloat(index, this.f1);
                } else if (index == j.c.A6) {
                    this.g1 = obtainStyledAttributes.getFloat(index, this.g1);
                } else if (index == j.c.I6) {
                    this.h1 = obtainStyledAttributes.getFloat(index, this.h1);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
