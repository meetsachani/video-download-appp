package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.y91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10883y91 {
    @InterfaceC5670cr1
    public static Rect a(@InterfaceC5670cr1 Context context, @InterfaceC8568og int i, int i2) {
        int i3;
        TypedArray k = C7608kn2.k(context, null, C7025iN1.o.M4, i, i2, new int[0]);
        int dimensionPixelSize = k.getDimensionPixelSize(C7025iN1.o.P4, context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = k.getDimensionPixelSize(C7025iN1.o.Q4, context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = k.getDimensionPixelSize(C7025iN1.o.O4, context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = k.getDimensionPixelSize(C7025iN1.o.N4, context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_alert_dialog_background_inset_bottom));
        k.recycle();
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection == 1) {
            i3 = dimensionPixelSize3;
        } else {
            i3 = dimensionPixelSize;
        }
        if (layoutDirection != 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(i3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4);
    }

    @InterfaceC5670cr1
    public static InsetDrawable b(@InterfaceC11300zs1 Drawable drawable, @InterfaceC5670cr1 Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
