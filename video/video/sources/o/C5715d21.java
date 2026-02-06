package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C7025iN1;
import o.OL1;

/* renamed from: o.d21  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5715d21 {
    public boolean a;
    @PK1
    public int b;
    @PK1
    public int c;
    @PK1
    public int d;
    @InterfaceC5670cr1
    public int[] e;
    @JF
    public int f;

    public C5715d21(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.loadingIndicatorStyle);
    }

    public final void a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray) {
        int i = C7025iN1.o.K4;
        if (!typedArray.hasValue(i)) {
            this.e = new int[]{C9179r91.b(context, OL1.b.J0, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.e = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.e = intArray;
            if (intArray.length != 0) {
                return;
            }
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public void b(boolean z) {
        this.a = z;
    }

    public C5715d21(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i) {
        this(context, attributeSet, i, Z11.a1);
    }

    public C5715d21(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        this.a = false;
        this.e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7025iN1.f.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C7025iN1.f.m3_loading_indicator_container_size);
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.G4, i, i2, new int[0]);
        this.b = k.getDimensionPixelSize(C7025iN1.o.L4, dimensionPixelSize);
        this.c = k.getDimensionPixelSize(C7025iN1.o.J4, dimensionPixelSize2);
        this.d = k.getDimensionPixelSize(C7025iN1.o.I4, dimensionPixelSize2);
        a(context, k);
        this.f = k.getColor(C7025iN1.o.H4, 0);
        k.recycle();
    }
}
