package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C7025iN1;
import o.OL1;

/* renamed from: o.Sc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4200Sc1 extends C2926Fc {
    public static final int e1 = C7025iN1.n.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] f1 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @InterfaceC11300zs1
    public ColorStateList c1;
    public boolean d1;

    public C4200Sc1(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.c1 == null) {
            int d = C9179r91.d(this, OL1.b.F0);
            int d2 = C9179r91.d(this, C7025iN1.c.colorOnSurface);
            int d3 = C9179r91.d(this, C7025iN1.c.colorSurface);
            int[][] iArr = f1;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C9179r91.t(d3, d, 1.0f);
            iArr2[1] = C9179r91.t(d3, d2, 0.54f);
            iArr2[2] = C9179r91.t(d3, d2, 0.38f);
            iArr2[3] = C9179r91.t(d3, d2, 0.38f);
            this.c1 = new ColorStateList(iArr, iArr2);
        }
        return this.c1;
    }

    public boolean a() {
        return this.d1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d1 && ZI.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.d1 = z;
        if (z) {
            ZI.d(this, getMaterialThemeColorsTintList());
        } else {
            ZI.d(this, null);
        }
    }

    public C4200Sc1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.H2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4200Sc1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = e1;
        Context context2 = getContext();
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.c7, i, i2, new int[0]);
        int i3 = C7025iN1.o.d7;
        if (k.hasValue(i3)) {
            ZI.d(this, C4297Tc1.a(context2, k, i3));
        }
        this.d1 = k.getBoolean(C7025iN1.o.e7, false);
        k.recycle();
    }
}
