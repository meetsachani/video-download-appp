package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C7025iN1;
import o.OL1;

/* renamed from: o.gd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6597gd1 {
    public static final int[] a = {16842752, OL1.b.z3};
    public static final int[] b = {C7025iN1.c.materialThemeOverlay};

    @InterfaceC4698Xf2
    public static int a(@InterfaceC5670cr1 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    @InterfaceC5670cr1
    public static int[] b(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC5670cr1 int[] iArr, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                iArr2[i3] = obtainStyledAttributes.getResourceId(i3, 0);
            }
            obtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    @InterfaceC4698Xf2
    public static int c(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        return b(context, attributeSet, b, i, i2)[0];
    }

    @InterfaceC5670cr1
    public static Context d(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        return e(context, attributeSet, i, i2, new int[0]);
    }

    @InterfaceC5670cr1
    public static Context e(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2, @InterfaceC5670cr1 int[] iArr) {
        boolean z;
        int[] b2;
        int c = c(context, attributeSet, i, i2);
        if ((context instanceof BM) && ((BM) context).c() == c) {
            z = true;
        } else {
            z = false;
        }
        if (c != 0 && !z) {
            BM bm = new BM(context, c);
            for (int i3 : b(context, attributeSet, iArr, i, i2)) {
                if (i3 != 0) {
                    bm.getTheme().applyStyle(i3, true);
                }
            }
            int a2 = a(context, attributeSet);
            if (a2 != 0) {
                bm.getTheme().applyStyle(a2, true);
            }
            return bm;
        }
        return context;
    }
}
