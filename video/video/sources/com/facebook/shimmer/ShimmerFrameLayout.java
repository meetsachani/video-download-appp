package com.facebook.shimmer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.b;
import com.facebook.shimmer.c;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint Y0;
    public final d Z0;
    public boolean a1;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.Y0 = new Paint();
        this.Z0 = new d();
        this.a1 = true;
        b(context, null);
    }

    public void a() {
        if (!this.a1) {
            return;
        }
        h();
        this.a1 = false;
        invalidate();
    }

    public final void b(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        c.b aVar;
        setWillNotDraw(false);
        this.Z0.setCallback(this);
        if (attributeSet == null) {
            e(new c.a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.a, 0, 0);
        try {
            int i = b.c.f;
            if (obtainStyledAttributes.hasValue(i) && obtainStyledAttributes.getBoolean(i, false)) {
                aVar = new c.C0091c();
            } else {
                aVar = new c.a();
            }
            e(aVar.d(obtainStyledAttributes).a());
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public boolean c() {
        return this.Z0.a();
    }

    public boolean d() {
        return this.a1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.a1) {
            this.Z0.draw(canvas);
        }
    }

    public ShimmerFrameLayout e(@InterfaceC11300zs1 c cVar) {
        this.Z0.d(cVar);
        if (cVar != null && cVar.f159o) {
            setLayerType(2, this.Y0);
            return this;
        }
        setLayerType(0, null);
        return this;
    }

    public void f(boolean z) {
        if (!this.a1) {
            this.a1 = true;
            if (z) {
                g();
            }
        }
    }

    public void g() {
        this.Z0.e();
    }

    public void h() {
        this.Z0.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z0.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.Z0.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public boolean verifyDrawable(@InterfaceC5670cr1 Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.Z0) {
            return false;
        }
        return true;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new Paint();
        this.Z0 = new d();
        this.a1 = true;
        b(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = new Paint();
        this.Z0 = new d();
        this.a1 = true;
        b(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Y0 = new Paint();
        this.Z0 = new d();
        this.a1 = true;
        b(context, attributeSet);
    }
}
