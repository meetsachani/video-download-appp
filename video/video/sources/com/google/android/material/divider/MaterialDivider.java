package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import o.C10201vM;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6509gG;
import o.InterfaceC9154r30;
import o.JF;
import o.PK1;

/* loaded from: classes3.dex */
public class MaterialDivider extends View {
    public static final int d1 = C7025iN1.n.Widget_MaterialComponents_MaterialDivider;
    @InterfaceC5670cr1
    public final C4394Uc1 Y0;
    public int Z0;
    @JF
    public int a1;
    public int b1;
    public int c1;

    public MaterialDivider(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.a1;
    }

    @PK1
    public int getDividerInsetEnd() {
        return this.c1;
    }

    @PK1
    public int getDividerInsetStart() {
        return this.b1;
    }

    public int getDividerThickness() {
        return this.Z0;
    }

    @Override // android.view.View
    public void onDraw(@InterfaceC5670cr1 Canvas canvas) {
        int i;
        int width;
        int i2;
        super.onDraw(canvas);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (z) {
            i = this.c1;
        } else {
            i = this.b1;
        }
        if (z) {
            width = getWidth();
            i2 = this.b1;
        } else {
            width = getWidth();
            i2 = this.c1;
        }
        this.Y0.setBounds(i, 0, width - i2, getBottom() - getTop());
        this.Y0.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i3 = this.Z0;
        if (i3 > 0 && measuredHeight != i3) {
            measuredHeight = i3;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(@JF int i) {
        if (this.a1 != i) {
            this.a1 = i;
            this.Y0.y0(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@InterfaceC6509gG int i) {
        setDividerColor(C10201vM.g(getContext(), i));
    }

    public void setDividerInsetEnd(@PK1 int i) {
        this.c1 = i;
    }

    public void setDividerInsetEndResource(@InterfaceC9154r30 int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@PK1 int i) {
        this.b1 = i;
    }

    public void setDividerInsetStartResource(@InterfaceC9154r30 int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@PK1 int i) {
        if (this.Z0 != i) {
            this.Z0 = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@InterfaceC9154r30 int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialDivider(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = d1;
        Context context2 = getContext();
        this.Y0 = new C4394Uc1();
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.W6, i, i2, new int[0]);
        this.Z0 = k.getDimensionPixelSize(C7025iN1.o.a7, getResources().getDimensionPixelSize(C7025iN1.f.material_divider_thickness));
        this.b1 = k.getDimensionPixelOffset(C7025iN1.o.Z6, 0);
        this.c1 = k.getDimensionPixelOffset(C7025iN1.o.Y6, 0);
        setDividerColor(C4297Tc1.a(context2, k, C7025iN1.o.X6).getDefaultColor());
        k.recycle();
    }
}
