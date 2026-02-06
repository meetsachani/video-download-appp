package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public class KH2<V extends View> extends CoordinatorLayout.c<V> {
    public LH2 X;
    public int Y;
    public int Z;

    public KH2() {
        this.Y = 0;
        this.Z = 0;
    }

    public int N() {
        LH2 lh2 = this.X;
        if (lh2 != null) {
            return lh2.d();
        }
        return 0;
    }

    public int O() {
        LH2 lh2 = this.X;
        if (lh2 != null) {
            return lh2.e();
        }
        return 0;
    }

    public boolean P() {
        LH2 lh2 = this.X;
        if (lh2 != null && lh2.f()) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        LH2 lh2 = this.X;
        if (lh2 != null && lh2.g()) {
            return true;
        }
        return false;
    }

    public void R(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i) {
        coordinatorLayout.N(v, i);
    }

    public void S(boolean z) {
        LH2 lh2 = this.X;
        if (lh2 != null) {
            lh2.i(z);
        }
    }

    public boolean T(int i) {
        LH2 lh2 = this.X;
        if (lh2 != null) {
            return lh2.j(i);
        }
        this.Z = i;
        return false;
    }

    public boolean U(int i) {
        LH2 lh2 = this.X;
        if (lh2 != null) {
            return lh2.k(i);
        }
        this.Y = i;
        return false;
    }

    public void V(boolean z) {
        LH2 lh2 = this.X;
        if (lh2 != null) {
            lh2.l(z);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i) {
        R(coordinatorLayout, v, i);
        if (this.X == null) {
            this.X = new LH2(v);
        }
        this.X.h();
        this.X.a();
        int i2 = this.Y;
        if (i2 != 0) {
            this.X.k(i2);
            this.Y = 0;
        }
        int i3 = this.Z;
        if (i3 != 0) {
            this.X.j(i3);
            this.Z = 0;
            return true;
        }
        return true;
    }

    public KH2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y = 0;
        this.Z = 0;
    }
}
