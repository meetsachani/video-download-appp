package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import o.C7025iN1;

/* renamed from: o.fd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6342fd1 extends AppCompatTextView {
    public C6342fd1(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static boolean I(Context context) {
        return X81.b(context, C7025iN1.c.textAppearanceLineHeightEnabled, true);
    }

    public static int J(@InterfaceC5670cr1 Resources.Theme theme, @InterfaceC11300zs1 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7025iN1.o.z7, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C7025iN1.o.A7, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int L(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 @InterfaceC5670cr1 int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C4297Tc1.d(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    public static boolean M(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Resources.Theme theme, @InterfaceC11300zs1 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7025iN1.o.z7, i, i2);
        int L = L(context, obtainStyledAttributes, C7025iN1.o.B7, C7025iN1.o.C7);
        obtainStyledAttributes.recycle();
        if (L != -1) {
            return true;
        }
        return false;
    }

    public final void H(@InterfaceC5670cr1 Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C7025iN1.o.t7);
        int L = L(getContext(), obtainStyledAttributes, C7025iN1.o.w7, C7025iN1.o.y7);
        obtainStyledAttributes.recycle();
        if (L >= 0) {
            setLineHeight(L);
        }
    }

    public final void K(@InterfaceC11300zs1 AttributeSet attributeSet, int i, int i2) {
        int J;
        Context context = getContext();
        if (I(context)) {
            Resources.Theme theme = context.getTheme();
            if (!M(context, theme, attributeSet, i, i2) && (J = J(theme, attributeSet, i, i2)) != -1) {
                H(theme, J);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@InterfaceC5670cr1 Context context, int i) {
        super.setTextAppearance(context, i);
        if (I(context)) {
            H(context.getTheme(), i);
        }
    }

    public C6342fd1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C6342fd1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, 0), attributeSet, i);
        K(attributeSet, i, 0);
    }

    @Deprecated
    public C6342fd1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i, int i2) {
        super(C6597gd1.d(context, attributeSet, i, i2), attributeSet, i);
        K(attributeSet, i, i2);
    }
}
