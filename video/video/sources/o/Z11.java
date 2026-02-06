package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import java.util.Arrays;
import o.C7025iN1;
import o.HT1;
import o.OL1;

/* loaded from: classes3.dex */
public final class Z11 extends View implements Drawable.Callback {
    public static final int a1 = C7025iN1.n.Widget_Material3_LoadingIndicator;
    @InterfaceC5670cr1
    public final C5230b21 Y0;
    @InterfaceC5670cr1
    public final C5715d21 Z0;

    public Z11(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public boolean a() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    public boolean b() {
        if (isAttachedToWindow() && getWindowVisibility() == 0 && a()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    @InterfaceC5670cr1
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @JF
    public int getContainerColor() {
        return this.Z0.f;
    }

    @PK1
    public int getContainerHeight() {
        return this.Z0.d;
    }

    @PK1
    public int getContainerWidth() {
        return this.Z0.c;
    }

    @InterfaceC5670cr1
    public C5230b21 getDrawable() {
        return this.Y0;
    }

    @InterfaceC5670cr1
    public int[] getIndicatorColor() {
        return this.Z0.e;
    }

    @PK1
    public int getIndicatorSize() {
        return this.Z0.b;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@InterfaceC5670cr1 Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@InterfaceC5670cr1 Canvas canvas) {
        super.onDraw(canvas);
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        this.Y0.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        C5472c21 c = this.Y0.c();
        int e = c.e() + getPaddingLeft() + getPaddingRight();
        int d = c.d() + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(size, e), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(e, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, d), 1073741824);
        } else if (mode2 == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(d, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Y0.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@InterfaceC5670cr1 View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        C5230b21 c5230b21 = this.Y0;
        boolean b = b();
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        c5230b21.i(b, false, z);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        C5230b21 c5230b21 = this.Y0;
        boolean b = b();
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        c5230b21.i(b, false, z);
    }

    @HT1({HT1.a.Y})
    @InterfaceC5056aJ2
    public void setAnimatorDurationScaleProvider(@InterfaceC5670cr1 C6085ea c6085ea) {
        this.Y0.X = c6085ea;
    }

    public void setContainerColor(@JF int i) {
        C5715d21 c5715d21 = this.Z0;
        if (c5715d21.f != i) {
            c5715d21.f = i;
            invalidate();
        }
    }

    public void setContainerHeight(@PK1 int i) {
        C5715d21 c5715d21 = this.Z0;
        if (c5715d21.d != i) {
            c5715d21.d = i;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(@PK1 int i) {
        C5715d21 c5715d21 = this.Z0;
        if (c5715d21.c != i) {
            c5715d21.c = i;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(@JF int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C9179r91.b(getContext(), OL1.b.J0, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.Z0.e = iArr;
            this.Y0.b().h();
            invalidate();
        }
    }

    public void setIndicatorSize(@PK1 int i) {
        C5715d21 c5715d21 = this.Z0;
        if (c5715d21.b != i) {
            c5715d21.b = i;
            requestLayout();
            invalidate();
        }
    }

    public Z11(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.loadingIndicatorStyle);
    }

    public Z11(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i) {
        super(C6597gd1.d(context, attributeSet, i, a1), attributeSet, i);
        Context context2 = getContext();
        C5230b21 a = C5230b21.a(context2, new C5715d21(context2, attributeSet, i));
        this.Y0 = a;
        a.setCallback(this);
        this.Z0 = a.c().a;
        setAnimatorDurationScaleProvider(new C6085ea());
    }
}
