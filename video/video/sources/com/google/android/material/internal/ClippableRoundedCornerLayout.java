package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    @InterfaceC11300zs1
    public Path Y0;
    @InterfaceC5670cr1
    public float[] Z0;

    public ClippableRoundedCornerLayout(@InterfaceC5670cr1 Context context) {
        super(context);
        this.Z0 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void a() {
        this.Y0 = null;
        this.Z0 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        invalidate();
    }

    public void b(float f, float f2, float f3, float f4, @InterfaceC5670cr1 float[] fArr) {
        d(new RectF(f, f2, f3, f4), fArr);
    }

    public void c(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 float[] fArr) {
        b(rect.left, rect.top, rect.right, rect.bottom, fArr);
    }

    public void d(@InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 float[] fArr) {
        if (this.Y0 == null) {
            this.Y0 = new Path();
        }
        this.Z0 = fArr;
        this.Y0.reset();
        this.Y0.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.Y0.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.Y0 == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.Y0);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void e(@InterfaceC5670cr1 float[] fArr) {
        b(getLeft(), getTop(), getRight(), getBottom(), fArr);
    }

    @InterfaceC5670cr1
    public float[] getCornerRadii() {
        return this.Z0;
    }

    public ClippableRoundedCornerLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Z0 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public ClippableRoundedCornerLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Z0 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }
}
