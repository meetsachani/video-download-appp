package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import o.C2705Cy;
import o.HT1;
import o.O22;

/* loaded from: classes3.dex */
public class I81 extends FrameLayout implements F81, InterfaceC6946i32 {
    public static final int h1 = -1;
    public float Y0;
    public final RectF Z0;
    public final Rect a1;
    @InterfaceC11300zs1
    public InterfaceC4960Zu1 b1;
    @InterfaceC5670cr1
    public O22 c1;
    public final AbstractC7187j32 d1;
    @InterfaceC11300zs1
    public Boolean e1;
    @InterfaceC11300zs1
    public View.OnHoverListener f1;
    public boolean g1;

    public I81(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static /* synthetic */ YP a(YP yp) {
        if (yp instanceof M) {
            return VC.b((M) yp);
        }
        return yp;
    }

    public final void c() {
        this.d1.f(this, this.Z0);
        InterfaceC4960Zu1 interfaceC4960Zu1 = this.b1;
        if (interfaceC4960Zu1 != null) {
            interfaceC4960Zu1.a(this.Z0);
        }
    }

    public final void d() {
        if (this.Y0 != -1.0f) {
            float b = C5600ca.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.Y0);
            setMaskRectF(new RectF(b, 0.0f, getWidth() - b, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.d1.e(canvas, new C2705Cy.a() { // from class: o.H81
            @Override // o.C2705Cy.a
            public final void a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.Z0;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // o.F81
    @InterfaceC5670cr1
    public RectF getMaskRectF() {
        return this.Z0;
    }

    @Override // o.F81
    @Deprecated
    public float getMaskXPercentage() {
        return this.Y0;
    }

    @Override // o.InterfaceC6946i32
    @InterfaceC5670cr1
    public O22 getShapeAppearanceModel() {
        return this.c1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.e1;
        if (bool != null) {
            this.d1.h(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.e1 = Boolean.valueOf(this.d1.c());
        this.d1.h(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.Z0.isEmpty() && (action == 9 || action == 10 || action == 7)) {
            if (!this.Z0.contains(motionEvent.getX(), motionEvent.getY())) {
                if (this.g1 && this.f1 != null) {
                    motionEvent.setAction(10);
                    this.f1.onHover(this, motionEvent);
                }
                this.g1 = false;
                return false;
            }
        }
        if (this.f1 != null) {
            if (!this.g1 && action == 7) {
                motionEvent.setAction(9);
                this.g1 = true;
            }
            if (action == 7 || action == 9) {
                this.g1 = true;
            }
            this.f1.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.getBoundsInScreen(this.a1);
        if (getX() > 0.0f) {
            Rect rect = this.a1;
            rect.left = (int) (rect.left + this.Z0.left);
        }
        if (getY() > 0.0f) {
            Rect rect2 = this.a1;
            rect2.top = (int) (rect2.top + this.Z0.top);
        }
        Rect rect3 = this.a1;
        rect3.right = rect3.left + Math.round(this.Z0.width());
        Rect rect4 = this.a1;
        rect4.bottom = rect4.top + Math.round(this.Z0.height());
        accessibilityNodeInfo.setBoundsInScreen(this.a1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.Z0.isEmpty()) {
            if (!this.Z0.contains(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.Y0 != -1.0f) {
            d();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.Z0.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.Z0.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @HT1({HT1.a.Y})
    @InterfaceC5056aJ2
    public void setForceCompatClipping(boolean z) {
        this.d1.h(this, z);
    }

    @Override // o.F81
    public void setMaskRectF(@InterfaceC5670cr1 RectF rectF) {
        this.Z0.set(rectF);
        c();
    }

    @Override // o.F81
    @Deprecated
    public void setMaskXPercentage(float f) {
        float d = C9293rd1.d(f, 0.0f, 1.0f);
        if (this.Y0 != d) {
            this.Y0 = d;
            d();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(@InterfaceC11300zs1 View.OnHoverListener onHoverListener) {
        this.f1 = onHoverListener;
    }

    @Override // o.F81
    public void setOnMaskChangedListener(@InterfaceC11300zs1 InterfaceC4960Zu1 interfaceC4960Zu1) {
        this.b1 = interfaceC4960Zu1;
    }

    @Override // o.InterfaceC6946i32
    public void setShapeAppearanceModel(@InterfaceC5670cr1 O22 o22) {
        O22 z = o22.z(new O22.c() { // from class: o.G81
            @Override // o.O22.c
            public final YP a(YP yp) {
                return I81.a(yp);
            }
        });
        this.c1 = z;
        this.d1.g(this, z);
    }

    public I81(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public I81(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = -1.0f;
        this.Z0 = new RectF();
        this.a1 = new Rect();
        this.d1 = AbstractC7187j32.a(this);
        this.e1 = null;
        this.g1 = false;
        setShapeAppearanceModel(O22.f(context, attributeSet, i, 0, 0).m());
    }
}
