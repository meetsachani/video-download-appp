package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: o.mZ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8055mZ0 extends AbstractC8911q42 {
    public final SideSheetBehavior<? extends View> a;

    public C8055mZ0(@InterfaceC5670cr1 SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // o.AbstractC8911q42
    public int a(@InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // o.AbstractC8911q42
    public float b(int i) {
        float e = e();
        return (i - e) / (d() - e);
    }

    @Override // o.AbstractC8911q42
    public int c(@InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // o.AbstractC8911q42
    public int d() {
        return Math.max(0, this.a.w0() + this.a.t0());
    }

    @Override // o.AbstractC8911q42
    public int e() {
        return (-this.a.m0()) - this.a.t0();
    }

    @Override // o.AbstractC8911q42
    public int f() {
        return this.a.t0();
    }

    @Override // o.AbstractC8911q42
    public int g() {
        return -this.a.m0();
    }

    @Override // o.AbstractC8911q42
    public <V extends View> int h(@InterfaceC5670cr1 V v) {
        return v.getRight() + this.a.t0();
    }

    @Override // o.AbstractC8911q42
    public int i(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // o.AbstractC8911q42
    public int j() {
        return 1;
    }

    @Override // o.AbstractC8911q42
    public boolean k(float f) {
        if (f > 0.0f) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8911q42
    public boolean l(@InterfaceC5670cr1 View view) {
        if (view.getRight() < (d() - e()) / 2) {
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
        if (Math.abs(view.getLeft() + (f * this.a.r0())) > this.a.s0()) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8911q42
    public void o(@InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // o.AbstractC8911q42
    public void p(@InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.x0()) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
