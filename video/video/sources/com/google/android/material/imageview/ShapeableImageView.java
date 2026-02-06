package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import o.C3220Ic;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C6597gd1;
import o.C7025iN1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6509gG;
import o.InterfaceC6946i32;
import o.InterfaceC9154r30;
import o.InterfaceC9397s30;
import o.O22;
import o.P22;

/* loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC6946i32 {
    public static final int t1 = C7025iN1.n.Widget_MaterialComponents_ShapeableImageView;
    public static final int u1 = Integer.MIN_VALUE;
    public final P22 b1;
    public final RectF c1;
    public final RectF d1;
    public final Paint e1;
    public final Paint f1;
    public final Path g1;
    @InterfaceC11300zs1
    public ColorStateList h1;
    @InterfaceC11300zs1
    public C4394Uc1 i1;
    public O22 j1;
    @InterfaceC9397s30
    public float k1;
    public Path l1;
    @InterfaceC9397s30
    public int m1;
    @InterfaceC9397s30
    public int n1;
    @InterfaceC9397s30
    public int o1;
    @InterfaceC9397s30
    public int p1;
    @InterfaceC9397s30
    public int q1;
    @InterfaceC9397s30
    public int r1;
    public boolean s1;

    /* loaded from: classes3.dex */
    public class a extends ViewOutlineProvider {
        public final Rect a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.j1 == null) {
                return;
            }
            if (ShapeableImageView.this.i1 == null) {
                ShapeableImageView.this.i1 = new C4394Uc1(ShapeableImageView.this.j1);
            }
            ShapeableImageView.this.c1.round(this.a);
            ShapeableImageView.this.i1.setBounds(this.a);
            ShapeableImageView.this.i1.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private boolean i() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void g(Canvas canvas) {
        if (this.h1 != null) {
            this.e1.setStrokeWidth(this.k1);
            int colorForState = this.h1.getColorForState(getDrawableState(), this.h1.getDefaultColor());
            if (this.k1 > 0.0f && colorForState != 0) {
                this.e1.setColor(colorForState);
                canvas.drawPath(this.g1, this.e1);
            }
        }
    }

    @InterfaceC9397s30
    public int getContentPaddingBottom() {
        return this.p1;
    }

    @InterfaceC9397s30
    public final int getContentPaddingEnd() {
        int i = this.r1;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i()) {
            return this.m1;
        }
        return this.o1;
    }

    @InterfaceC9397s30
    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (h()) {
            if (i() && (i2 = this.r1) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!i() && (i = this.q1) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.m1;
    }

    @InterfaceC9397s30
    public int getContentPaddingRight() {
        int i;
        int i2;
        if (h()) {
            if (i() && (i2 = this.q1) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!i() && (i = this.r1) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.o1;
    }

    @InterfaceC9397s30
    public final int getContentPaddingStart() {
        int i = this.q1;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i()) {
            return this.o1;
        }
        return this.m1;
    }

    @InterfaceC9397s30
    public int getContentPaddingTop() {
        return this.n1;
    }

    @Override // android.view.View
    @InterfaceC9397s30
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @InterfaceC9397s30
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @InterfaceC9397s30
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @InterfaceC9397s30
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @InterfaceC9397s30
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @InterfaceC9397s30
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // o.InterfaceC6946i32
    @InterfaceC5670cr1
    public O22 getShapeAppearanceModel() {
        return this.j1;
    }

    @InterfaceC11300zs1
    public ColorStateList getStrokeColor() {
        return this.h1;
    }

    @InterfaceC9397s30
    public float getStrokeWidth() {
        return this.k1;
    }

    public final boolean h() {
        if (this.q1 == Integer.MIN_VALUE && this.r1 == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public void j(@InterfaceC9397s30 int i, @InterfaceC9397s30 int i2, @InterfaceC9397s30 int i3, @InterfaceC9397s30 int i4) {
        this.q1 = Integer.MIN_VALUE;
        this.r1 = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.m1) + i, (super.getPaddingTop() - this.n1) + i2, (super.getPaddingRight() - this.o1) + i3, (super.getPaddingBottom() - this.p1) + i4);
        this.m1 = i;
        this.n1 = i2;
        this.o1 = i3;
        this.p1 = i4;
    }

    public void k(@InterfaceC9397s30 int i, @InterfaceC9397s30 int i2, @InterfaceC9397s30 int i3, @InterfaceC9397s30 int i4) {
        int i5;
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.n1) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.p1) + i4);
        if (i()) {
            i5 = i3;
        } else {
            i5 = i;
        }
        this.m1 = i5;
        this.n1 = i2;
        if (!i()) {
            i = i3;
        }
        this.o1 = i;
        this.p1 = i4;
    }

    public final void l(int i, int i2) {
        this.c1.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.b1.d(this.j1, 1.0f, this.c1, this.g1);
        this.l1.rewind();
        this.l1.addPath(this.g1);
        this.d1.set(0.0f, 0.0f, i, i2);
        this.l1.addRect(this.d1, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.l1, this.f1);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.s1 || !isLayoutDirectionResolved()) {
            return;
        }
        this.s1 = true;
        if (!isPaddingRelative() && !h()) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        l(i, i2);
    }

    @Override // android.view.View
    public void setPadding(@InterfaceC9397s30 int i, @InterfaceC9397s30 int i2, @InterfaceC9397s30 int i3, @InterfaceC9397s30 int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(@InterfaceC9397s30 int i, @InterfaceC9397s30 int i2, @InterfaceC9397s30 int i3, @InterfaceC9397s30 int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    @Override // o.InterfaceC6946i32
    public void setShapeAppearanceModel(@InterfaceC5670cr1 O22 o22) {
        this.j1 = o22;
        C4394Uc1 c4394Uc1 = this.i1;
        if (c4394Uc1 != null) {
            c4394Uc1.setShapeAppearanceModel(o22);
        }
        l(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.h1 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@InterfaceC6509gG int i) {
        setStrokeColor(C3220Ic.a(getContext(), i));
    }

    public void setStrokeWidth(@InterfaceC9397s30 float f) {
        if (this.k1 != f) {
            this.k1 = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@InterfaceC9154r30 int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShapeableImageView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r0), attributeSet, i);
        int i2 = t1;
        this.b1 = P22.l();
        this.g1 = new Path();
        this.s1 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f1 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.c1 = new RectF();
        this.d1 = new RectF();
        this.l1 = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C7025iN1.o.Va, i, i2);
        setLayerType(2, null);
        this.h1 = C4297Tc1.a(context2, obtainStyledAttributes, C7025iN1.o.fb);
        this.k1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.gb, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.Wa, 0);
        this.m1 = dimensionPixelSize;
        this.n1 = dimensionPixelSize;
        this.o1 = dimensionPixelSize;
        this.p1 = dimensionPixelSize;
        this.m1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.Za, dimensionPixelSize);
        this.n1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.cb, dimensionPixelSize);
        this.o1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.ab, dimensionPixelSize);
        this.p1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.Xa, dimensionPixelSize);
        this.q1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.bb, Integer.MIN_VALUE);
        this.r1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.Ya, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.e1 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.j1 = O22.e(context2, attributeSet, i, i2).m();
        setOutlineProvider(new a());
    }
}
