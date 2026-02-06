package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C7025iN1;
import o.OL1;

/* renamed from: o.hj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6865hj2 extends C6367fj2 {
    public static final int e2 = C7025iN1.n.Widget_MaterialComponents_CompoundButton_Switch;
    public static final int[][] f2 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @InterfaceC5670cr1
    public final C9523sa0 a2;
    @InterfaceC11300zs1
    public ColorStateList b2;
    @InterfaceC11300zs1
    public ColorStateList c2;
    public boolean d2;

    public C6865hj2(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.b2 == null) {
            int d = C9179r91.d(this, C7025iN1.c.colorSurface);
            int d2 = C9179r91.d(this, OL1.b.F0);
            float dimension = getResources().getDimension(C7025iN1.f.mtrl_switch_thumb_elevation);
            if (this.a2.l()) {
                dimension += C10920yI2.p(this);
            }
            int e = this.a2.e(d, dimension);
            int[][] iArr = f2;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C9179r91.t(d, d2, 1.0f);
            iArr2[1] = e;
            iArr2[2] = C9179r91.t(d, d2, 0.38f);
            iArr2[3] = e;
            this.b2 = new ColorStateList(iArr, iArr2);
        }
        return this.b2;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.c2 == null) {
            int[][] iArr = f2;
            int[] iArr2 = new int[iArr.length];
            int d = C9179r91.d(this, C7025iN1.c.colorSurface);
            int d2 = C9179r91.d(this, OL1.b.F0);
            int d3 = C9179r91.d(this, C7025iN1.c.colorOnSurface);
            iArr2[0] = C9179r91.t(d, d2, 0.54f);
            iArr2[1] = C9179r91.t(d, d3, 0.32f);
            iArr2[2] = C9179r91.t(d, d2, 0.12f);
            iArr2[3] = C9179r91.t(d, d3, 0.12f);
            this.c2 = new ColorStateList(iArr, iArr2);
        }
        return this.c2;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d2 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.d2 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public boolean s() {
        return this.d2;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.d2 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    public C6865hj2(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.l3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6865hj2(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = e2;
        Context context2 = getContext();
        this.a2 = new C9523sa0(context2);
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.xc, i, i2, new int[0]);
        this.d2 = k.getBoolean(C7025iN1.o.yc, false);
        k.recycle();
    }
}
