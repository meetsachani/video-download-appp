package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C7025iN1;
import o.HT1;

/* loaded from: classes3.dex */
public class JC extends AbstractC2657Cl<KC> {
    public static final int A1 = 1;
    public static final int B1 = 0;
    public static final int C1 = 1;
    public static final int y1 = C7025iN1.n.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int z1 = 0;

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface b {
    }

    public JC(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public int getIndeterminateAnimationType() {
        return ((KC) this.Y0).f508o;
    }

    public int getIndicatorDirection() {
        return ((KC) this.Y0).r;
    }

    @PK1
    public int getIndicatorInset() {
        return ((KC) this.Y0).q;
    }

    @PK1
    public int getIndicatorSize() {
        return ((KC) this.Y0).p;
    }

    public void setIndeterminateAnimationType(int i) {
        AbstractC6291fP0<ObjectAnimator> ec;
        if (((KC) this.Y0).f508o == i) {
            return;
        }
        if (t() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.Y0;
        ((KC) s).f508o = i;
        ((KC) s).h();
        if (i == 1) {
            ec = new FC(getContext(), (KC) this.Y0);
        } else {
            ec = new EC((KC) this.Y0);
        }
        getIndeterminateDrawable().I(ec);
        p();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((KC) this.Y0).r = i;
        invalidate();
    }

    public void setIndicatorInset(@PK1 int i) {
        S s = this.Y0;
        if (((KC) s).q != i) {
            ((KC) s).q = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@PK1 int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.Y0;
        if (((KC) s).p != max) {
            ((KC) s).p = max;
            ((KC) s).h();
            requestLayout();
            invalidate();
        }
    }

    @Override // o.AbstractC2657Cl
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((KC) this.Y0).h();
    }

    @Override // o.AbstractC2657Cl
    /* renamed from: u */
    public KC i(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet) {
        return new KC(context, attributeSet);
    }

    public final void v() {
        AC ac = new AC((KC) this.Y0);
        setIndeterminateDrawable(C6546gP0.B(getContext(), (KC) this.Y0, ac));
        setProgressDrawable(N20.H(getContext(), (KC) this.Y0, ac));
    }

    public JC(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.circularProgressIndicatorStyle);
    }

    public JC(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i) {
        super(context, attributeSet, i, y1);
        v();
        this.i1 = true;
    }
}
