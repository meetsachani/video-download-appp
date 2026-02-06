package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class PY1 extends FrameLayout {
    @InterfaceC11300zs1
    public Drawable Y0;
    public Rect Z0;
    public Rect a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;

    /* loaded from: classes3.dex */
    public class a implements InterfaceC10336vu1 {
        public a() {
        }

        @Override // o.InterfaceC10336vu1
        public RL2 a(View view, @InterfaceC5670cr1 RL2 rl2) {
            boolean z;
            PY1 py1 = PY1.this;
            if (py1.Z0 == null) {
                py1.Z0 = new Rect();
            }
            PY1.this.Z0.set(rl2.p(), rl2.r(), rl2.q(), rl2.o());
            PY1.this.h(rl2);
            PY1 py12 = PY1.this;
            if (rl2.w() && PY1.this.Y0 != null) {
                z = false;
            } else {
                z = true;
            }
            py12.setWillNotDraw(z);
            PY1.this.postInvalidateOnAnimation();
            return rl2.c();
        }
    }

    public PY1(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.Z0 != null && this.Y0 != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.b1) {
                this.a1.set(0, 0, width, this.Z0.top);
                this.Y0.setBounds(this.a1);
                this.Y0.draw(canvas);
            }
            if (this.c1) {
                this.a1.set(0, height - this.Z0.bottom, width, height);
                this.Y0.setBounds(this.a1);
                this.Y0.draw(canvas);
            }
            if (this.d1) {
                Rect rect = this.a1;
                Rect rect2 = this.Z0;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.Y0.setBounds(this.a1);
                this.Y0.draw(canvas);
            }
            if (this.e1) {
                Rect rect3 = this.a1;
                Rect rect4 = this.Z0;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.Y0.setBounds(this.a1);
                this.Y0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.Y0;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.Y0;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.c1 = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.d1 = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.e1 = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.b1 = z;
    }

    public void setScrimInsetForeground(@InterfaceC11300zs1 Drawable drawable) {
        this.Y0 = drawable;
    }

    public PY1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PY1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a1 = new Rect();
        this.b1 = true;
        this.c1 = true;
        this.d1 = true;
        this.e1 = true;
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.K9, i, C7025iN1.n.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.Y0 = k.getDrawable(C7025iN1.o.L9);
        k.recycle();
        setWillNotDraw(true);
        C6516gH2.l2(this, new a());
    }

    public void h(RL2 rl2) {
    }
}
