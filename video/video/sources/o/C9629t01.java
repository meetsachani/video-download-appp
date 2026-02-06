package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import o.C7025iN1;

/* renamed from: o.t01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9629t01 extends AbstractC2755Dl {

    /* renamed from: o  reason: collision with root package name */
    public int f866o;
    public int p;
    public boolean q;
    @PK1
    public int r;
    @InterfaceC11300zs1
    public Integer s;
    @PK1
    public int t;
    public float u;
    public boolean v;
    public boolean w;

    public C9629t01(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.linearProgressIndicatorStyle);
    }

    @Override // o.AbstractC2755Dl
    public boolean g() {
        if (super.g() && i() == a()) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC2755Dl
    public void h() {
        super.h();
        if (this.r >= 0) {
            if (this.f866o == 0) {
                if ((a() <= 0 && (!this.w || i() <= 0)) || this.i != 0) {
                    if (this.e.length < 3) {
                        throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                    }
                    return;
                }
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            return;
        }
        throw new IllegalArgumentException("Stop indicator size must be >= 0.");
    }

    public int i() {
        if (!this.w) {
            return a();
        }
        if (this.v) {
            return (int) (this.a * this.u);
        }
        return this.t;
    }

    public C9629t01(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i) {
        this(context, attributeSet, i, C9386s01.y1);
    }

    public C9629t01(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        super(context, attributeSet, i, i2);
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.A4, C7025iN1.c.linearProgressIndicatorStyle, C9386s01.y1, new int[0]);
        this.f866o = k.getInt(C7025iN1.o.B4, 1);
        this.p = k.getInt(C7025iN1.o.C4, 0);
        this.r = Math.min(k.getDimensionPixelSize(C7025iN1.o.F4, 0), this.a);
        int i3 = C7025iN1.o.E4;
        if (k.hasValue(i3)) {
            this.s = Integer.valueOf(k.getDimensionPixelSize(i3, 0));
        }
        TypedValue peekValue = k.peekValue(C7025iN1.o.D4);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                this.t = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, k.getResources().getDisplayMetrics()), this.a / 2);
                this.v = false;
                this.w = true;
            } else if (i4 == 6) {
                this.u = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.v = true;
                this.w = true;
            }
        }
        k.recycle();
        h();
        this.q = this.p == 1;
    }
}
