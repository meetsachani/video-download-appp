package com.tuyenmonkey.mkloader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.tuyenmonkey.mkloader.a;
import o.InterfaceC9744tT0;
import o.U11;
import o.X11;

/* loaded from: classes3.dex */
public class MKLoader extends View implements InterfaceC9744tT0 {
    public X11 Y0;

    public MKLoader(Context context) {
        super(context);
        b(context, null, 0);
    }

    @Override // o.InterfaceC9744tT0
    public void a() {
        invalidate();
    }

    public final void b(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.l.d4);
        X11 a = U11.a(obtainStyledAttributes.getInt(a.l.f4, -1));
        this.Y0 = a;
        a.g(obtainStyledAttributes.getColor(a.l.e4, Color.parseColor("#ffffff")));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        X11 x11 = this.Y0;
        if (x11 != null && x11.e()) {
            this.Y0.h(this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        X11 x11 = this.Y0;
        if (x11 != null) {
            x11.f();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.Y0.a(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.Y0.i(getWidth(), getHeight());
        this.Y0.d();
        this.Y0.j();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(this.Y0.c(), i), View.resolveSize(this.Y0.b(), i2));
    }

    public MKLoader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet, 0);
    }

    public MKLoader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, attributeSet, i);
    }
}
