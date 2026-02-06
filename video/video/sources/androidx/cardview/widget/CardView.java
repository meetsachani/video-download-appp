package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.C6683gz;
import o.EL1;
import o.InterfaceC7167iz;
import o.InterfaceC7410jz;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] f1 = {16842801};
    public static final InterfaceC7410jz g1;
    public boolean Y0;
    public boolean Z0;
    public int a1;
    public int b1;
    public final Rect c1;
    public final Rect d1;
    public final InterfaceC7167iz e1;

    /* loaded from: classes.dex */
    public class a implements InterfaceC7167iz {
        public Drawable a;

        public a() {
        }

        @Override // o.InterfaceC7167iz
        public void b(int i, int i2, int i3, int i4) {
            CardView.this.d1.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.c1;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // o.InterfaceC7167iz
        public void c(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // o.InterfaceC7167iz
        public boolean d() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // o.InterfaceC7167iz
        public Drawable e() {
            return this.a;
        }

        @Override // o.InterfaceC7167iz
        public void f(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.a1) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.b1) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        @Override // o.InterfaceC7167iz
        public boolean g() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // o.InterfaceC7167iz
        public View h() {
            return CardView.this;
        }
    }

    static {
        C6683gz c6683gz = new C6683gz();
        g1 = c6683gz;
        c6683gz.n();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return g1.e(this.e1);
    }

    public float getCardElevation() {
        return g1.l(this.e1);
    }

    public int getContentPaddingBottom() {
        return this.c1.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c1.left;
    }

    public int getContentPaddingRight() {
        return this.c1.right;
    }

    public int getContentPaddingTop() {
        return this.c1.top;
    }

    public float getMaxCardElevation() {
        return g1.f(this.e1);
    }

    public boolean getPreventCornerOverlap() {
        return this.Z0;
    }

    public float getRadius() {
        return g1.c(this.e1);
    }

    public boolean getUseCompatPadding() {
        return this.Y0;
    }

    public void h(int i, int i2, int i3, int i4) {
        this.c1.set(i, i2, i3, i4);
        g1.k(this.e1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC7410jz interfaceC7410jz = g1;
        if (!(interfaceC7410jz instanceof C6683gz)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC7410jz.a(this.e1)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC7410jz.g(this.e1)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        g1.o(this.e1, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        g1.d(this.e1, f);
    }

    public void setMaxCardElevation(float f) {
        g1.m(this.e1, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.b1 = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.a1 = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.Z0) {
            this.Z0 = z;
            g1.b(this.e1);
        }
    }

    public void setRadius(float f) {
        g1.h(this.e1, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.Y0 != z) {
            this.Y0 = z;
            g1.i(this.e1);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, EL1.a.g);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        g1.o(this.e1, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c1 = rect;
        this.d1 = new Rect();
        a aVar = new a();
        this.e1 = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EL1.e.a, i, EL1.d.b);
        int i2 = EL1.e.d;
        if (obtainStyledAttributes.hasValue(i2)) {
            valueOf = obtainStyledAttributes.getColorStateList(i2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(EL1.b.b);
            } else {
                color = getResources().getColor(EL1.b.a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(EL1.e.e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(EL1.e.f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(EL1.e.g, 0.0f);
        this.Y0 = obtainStyledAttributes.getBoolean(EL1.e.i, false);
        this.Z0 = obtainStyledAttributes.getBoolean(EL1.e.h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(EL1.e.j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(EL1.e.l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(EL1.e.n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(EL1.e.m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(EL1.e.k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.a1 = obtainStyledAttributes.getDimensionPixelSize(EL1.e.b, 0);
        this.b1 = obtainStyledAttributes.getDimensionPixelSize(EL1.e.c, 0);
        obtainStyledAttributes.recycle();
        g1.j(aVar, context, colorStateList, dimension, dimension2, f);
    }
}
