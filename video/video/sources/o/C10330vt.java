package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import o.C7025iN1;

/* renamed from: o.vt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10330vt {
    @InterfaceC5670cr1
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final O22 f;

    public C10330vt(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, O22 o22, @InterfaceC5670cr1 Rect rect) {
        C10907yF1.i(rect.left);
        C10907yF1.i(rect.top);
        C10907yF1.i(rect.right);
        C10907yF1.i(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = o22;
    }

    @InterfaceC5670cr1
    public static C10330vt a(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7025iN1.o.i6);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.j6, 0), obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.l6, 0), obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.k6, 0), obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.m6, 0));
        ColorStateList a = C4297Tc1.a(context, obtainStyledAttributes, C7025iN1.o.n6);
        ColorStateList a2 = C4297Tc1.a(context, obtainStyledAttributes, C7025iN1.o.s6);
        ColorStateList a3 = C4297Tc1.a(context, obtainStyledAttributes, C7025iN1.o.q6);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.r6, 0);
        O22 m = O22.b(context, obtainStyledAttributes.getResourceId(C7025iN1.o.o6, 0), obtainStyledAttributes.getResourceId(C7025iN1.o.p6, 0)).m();
        obtainStyledAttributes.recycle();
        return new C10330vt(a, a2, a3, dimensionPixelSize, m, rect);
    }

    public int b() {
        return this.a.bottom;
    }

    public int c() {
        return this.a.left;
    }

    public int d() {
        return this.a.right;
    }

    public int e() {
        return this.a.top;
    }

    public void f(@InterfaceC5670cr1 TextView textView) {
        g(textView, null, null);
    }

    public void g(@InterfaceC5670cr1 TextView textView, @InterfaceC11300zs1 ColorStateList colorStateList, @InterfaceC11300zs1 ColorStateList colorStateList2) {
        C4394Uc1 c4394Uc1 = new C4394Uc1();
        C4394Uc1 c4394Uc12 = new C4394Uc1();
        c4394Uc1.setShapeAppearanceModel(this.f);
        c4394Uc12.setShapeAppearanceModel(this.f);
        if (colorStateList == null) {
            colorStateList = this.c;
        }
        c4394Uc1.y0(colorStateList);
        c4394Uc1.Q0(this.e, this.d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), c4394Uc1, c4394Uc12);
        Rect rect = this.a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
