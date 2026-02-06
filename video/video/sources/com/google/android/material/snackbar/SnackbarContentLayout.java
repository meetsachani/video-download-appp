package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.C5600ca;
import o.C7025iN1;
import o.C9179r91;
import o.C9811tl1;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8494oM;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC8494oM {
    public TextView Y0;
    public Button Z0;
    public final TimeInterpolator a1;
    public int b1;

    public SnackbarContentLayout(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static void d(@InterfaceC5670cr1 View view, int i, int i2) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // o.InterfaceC8494oM
    public void a(int i, int i2) {
        this.Y0.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.Y0.animate().alpha(1.0f).setDuration(j).setInterpolator(this.a1).setStartDelay(j2).start();
        if (this.Z0.getVisibility() == 0) {
            this.Z0.setAlpha(0.0f);
            this.Z0.animate().alpha(1.0f).setDuration(j).setInterpolator(this.a1).setStartDelay(j2).start();
        }
    }

    @Override // o.InterfaceC8494oM
    public void b(int i, int i2) {
        this.Y0.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.Y0.animate().alpha(0.0f).setDuration(j).setInterpolator(this.a1).setStartDelay(j2).start();
        if (this.Z0.getVisibility() == 0) {
            this.Z0.setAlpha(1.0f);
            this.Z0.animate().alpha(0.0f).setDuration(j).setInterpolator(this.a1).setStartDelay(j2).start();
        }
    }

    public void c(float f) {
        if (f != 1.0f) {
            this.Z0.setTextColor(C9179r91.t(C9179r91.d(this, C7025iN1.c.colorSurface), this.Z0.getCurrentTextColor(), f));
        }
    }

    public final boolean e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.Y0.getPaddingTop() == i2 && this.Y0.getPaddingBottom() == i3) {
            return z;
        }
        d(this.Y0, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.Z0;
    }

    public TextView getMessageView() {
        return this.Y0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.Y0 = (TextView) findViewById(C7025iN1.h.snackbar_text);
        this.Z0 = (Button) findViewById(C7025iN1.h.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C7025iN1.f.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C7025iN1.f.design_snackbar_padding_vertical);
            Layout layout = this.Y0.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.b1 > 0 && this.Z0.getMeasuredWidth() > this.b1) {
                if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.b1 = i;
    }

    public SnackbarContentLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a1 = C9811tl1.g(context, C7025iN1.c.motionEasingEmphasizedInterpolator, C5600ca.b);
    }
}
