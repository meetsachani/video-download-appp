package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: o.yM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10933yM {
    public static final /* synthetic */ <T> T a(Context context) {
        C6562gT0.y(4, "T");
        return (T) C10201vM.s(context, Object.class);
    }

    public static final void b(Context context, int i, int[] iArr, HA0<? super TypedArray, C7458kA2> ha0) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        ha0.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, HA0<? super TypedArray, C7458kA2> ha0) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        ha0.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        ha0.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
