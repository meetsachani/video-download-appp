package o;

import android.content.Context;
import android.util.AttributeSet;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import o.C7025iN1;
import o.HT1;

/* renamed from: o.s01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9386s01 extends AbstractC2657Cl<C9629t01> {
    public static final int A1 = 1;
    public static final int B1 = 0;
    public static final int C1 = 1;
    public static final int D1 = 2;
    public static final int E1 = 3;
    public static final int y1 = C7025iN1.n.Widget_MaterialComponents_LinearProgressIndicator;
    public static final int z1 = 0;

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.s01$a */
    /* loaded from: classes3.dex */
    public @interface a {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.s01$b */
    /* loaded from: classes3.dex */
    public @interface b {
    }

    public C9386s01(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    private void v() {
        C6192f01 c6192f01 = new C6192f01((C9629t01) this.Y0);
        setIndeterminateDrawable(C6546gP0.D(getContext(), (C9629t01) this.Y0, c6192f01));
        setProgressDrawable(N20.J(getContext(), (C9629t01) this.Y0, c6192f01));
    }

    public int getIndeterminateAnimationType() {
        return ((C9629t01) this.Y0).f866o;
    }

    public int getIndicatorDirection() {
        return ((C9629t01) this.Y0).p;
    }

    @PK1
    public int getTrackInnerCornerRadius() {
        return ((C9629t01) this.Y0).t;
    }

    @InterfaceC11300zs1
    public Integer getTrackStopIndicatorPadding() {
        return ((C9629t01) this.Y0).s;
    }

    @PK1
    public int getTrackStopIndicatorSize() {
        return ((C9629t01) this.Y0).r;
    }

    @Override // o.AbstractC2657Cl, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.Y0;
        C9629t01 c9629t01 = (C9629t01) s;
        boolean z2 = true;
        if (((C9629t01) s).p != 1 && ((getLayoutDirection() != 1 || ((C9629t01) this.Y0).p != 2) && (getLayoutDirection() != 0 || ((C9629t01) this.Y0).p != 3))) {
            z2 = false;
        }
        c9629t01.q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        C6546gP0<C9629t01> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        N20<C9629t01> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // o.AbstractC2657Cl
    public void q(int i, boolean z) {
        S s = this.Y0;
        if (s != 0 && ((C9629t01) s).f866o == 0 && isIndeterminate()) {
            return;
        }
        super.q(i, z);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((C9629t01) this.Y0).f866o == i) {
            return;
        }
        if (t() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.Y0;
        ((C9629t01) s).f866o = i;
        ((C9629t01) s).h();
        if (i == 0) {
            getIndeterminateDrawable().I(new C6435g01((C9629t01) this.Y0));
        } else {
            getIndeterminateDrawable().I(new C6690h01(getContext(), (C9629t01) this.Y0));
        }
        p();
        invalidate();
    }

    @Override // o.AbstractC2657Cl
    public void setIndicatorColor(@InterfaceC5670cr1 int... iArr) {
        super.setIndicatorColor(iArr);
        ((C9629t01) this.Y0).h();
    }

    public void setIndicatorDirection(int i) {
        S s = this.Y0;
        ((C9629t01) s).p = i;
        C9629t01 c9629t01 = (C9629t01) s;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((C9629t01) this.Y0).p != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        c9629t01.q = z;
        invalidate();
    }

    @Override // o.AbstractC2657Cl
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((C9629t01) this.Y0).h();
        invalidate();
    }

    public void setTrackInnerCornerRadius(@PK1 int i) {
        S s = this.Y0;
        if (((C9629t01) s).t != i) {
            ((C9629t01) s).t = Math.round(Math.min(i, ((C9629t01) s).a / 2.0f));
            S s2 = this.Y0;
            ((C9629t01) s2).v = false;
            ((C9629t01) s2).w = true;
            ((C9629t01) s2).h();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        S s = this.Y0;
        if (((C9629t01) s).u != f) {
            ((C9629t01) s).u = Math.min(f, 0.5f);
            S s2 = this.Y0;
            ((C9629t01) s2).v = true;
            ((C9629t01) s2).w = true;
            ((C9629t01) s2).h();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(@InterfaceC11300zs1 Integer num) {
        if (!Objects.equals(((C9629t01) this.Y0).s, num)) {
            ((C9629t01) this.Y0).s = num;
            invalidate();
        }
    }

    public void setTrackStopIndicatorSize(@PK1 int i) {
        S s = this.Y0;
        if (((C9629t01) s).r != i) {
            ((C9629t01) s).r = Math.min(i, ((C9629t01) s).a);
            ((C9629t01) this.Y0).h();
            invalidate();
        }
    }

    @Override // o.AbstractC2657Cl
    /* renamed from: u */
    public C9629t01 i(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet) {
        return new C9629t01(context, attributeSet);
    }

    public C9386s01(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.linearProgressIndicatorStyle);
    }

    public C9386s01(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i) {
        super(context, attributeSet, i, y1);
        v();
        this.i1 = true;
    }
}
