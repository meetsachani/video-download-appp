package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class MU1 extends AbstractC8911q42 {
    public final SideSheetBehavior<? extends View> a;

    public MU1(@InterfaceC5670cr1 SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // o.AbstractC8911q42
    public int a(@InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // o.AbstractC8911q42
    public float b(int i) {
        float e = e();
        return (e - i) / (e - d());
    }

    @Override // o.AbstractC8911q42
    public int c(@InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // o.AbstractC8911q42
    public int d() {
        return Math.max(0, (e() - this.a.m0()) - this.a.t0());
    }

    @Override // o.AbstractC8911q42
    public int e() {
        return this.a.x0();
    }

    @Override // o.AbstractC8911q42
    public int f() {
        return this.a.x0();
    }

    @Override // o.AbstractC8911q42
    public int g() {
        return d();
    }

    @Override // o.AbstractC8911q42
    public <V extends View> int h(@InterfaceC5670cr1 V v) {
        return v.getLeft() - this.a.t0();
    }

    @Override // o.AbstractC8911q42
    public int i(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // o.AbstractC8911q42
    public int j() {
        return 0;
    }

    @Override // o.AbstractC8911q42
    public boolean k(float f) {
        if (f < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8911q42
    public boolean l(@InterfaceC5670cr1 View view) {
        if (view.getLeft() > (e() + d()) / 2) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8911q42
    public boolean m(float f, float f2) {
        if (C9646t42.a(f, f2) && Math.abs(f) > this.a.y0()) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8911q42
    public boolean n(@InterfaceC5670cr1 View view, float f) {
        if (Math.abs(view.getRight() + (f * this.a.r0())) > this.a.s0()) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8911q42
    public void o(@InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // o.AbstractC8911q42
    public void p(@InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int x0 = this.a.x0();
        if (i <= x0) {
            marginLayoutParams.rightMargin = x0 - i;
        }
    }
}
