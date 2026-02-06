package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C7025iN1;

/* loaded from: classes3.dex */
public final class KC extends AbstractC2755Dl {

    /* renamed from: o  reason: collision with root package name */
    public int f508o;
    @PK1
    public int p;
    @PK1
    public int q;
    public int r;
    public boolean s;

    public KC(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.circularProgressIndicatorStyle);
    }

    public KC(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i) {
        this(context, attributeSet, i, JC.y1);
    }

    public KC(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_progress_circular_inset_medium);
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.w2, i, i2, new int[0]);
        this.f508o = k.getInt(C7025iN1.o.x2, 0);
        this.p = Math.max(C4297Tc1.d(context, k, C7025iN1.o.B2, dimensionPixelSize), this.a * 2);
        this.q = C4297Tc1.d(context, k, C7025iN1.o.A2, dimensionPixelSize2);
        this.r = k.getInt(C7025iN1.o.z2, 0);
        this.s = k.getBoolean(C7025iN1.o.y2, true);
        k.recycle();
        h();
    }
}
