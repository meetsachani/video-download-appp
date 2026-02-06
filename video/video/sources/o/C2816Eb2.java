package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import o.T4;

/* renamed from: o.Eb2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2816Eb2 extends T4 implements e.a {
    public ActionBarContextView Y0;
    public Context Z;
    public T4.a Z0;
    public WeakReference<View> a1;
    public boolean b1;
    public boolean c1;
    public androidx.appcompat.view.menu.e d1;

    public C2816Eb2(Context context, ActionBarContextView actionBarContextView, T4.a aVar, boolean z) {
        this.Z = context;
        this.Y0 = actionBarContextView;
        this.Z0 = aVar;
        androidx.appcompat.view.menu.e a0 = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).a0(1);
        this.d1 = a0;
        a0.Y(this);
        this.c1 = z;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.Z0.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.Y0.o();
    }

    @Override // o.T4
    public void c() {
        if (this.b1) {
            return;
        }
        this.b1 = true;
        this.Z0.b(this);
    }

    @Override // o.T4
    public View d() {
        WeakReference<View> weakReference = this.a1;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // o.T4
    public Menu e() {
        return this.d1;
    }

    @Override // o.T4
    public MenuInflater f() {
        return new C9796th2(this.Y0.getContext());
    }

    @Override // o.T4
    public CharSequence g() {
        return this.Y0.getSubtitle();
    }

    @Override // o.T4
    public CharSequence i() {
        return this.Y0.getTitle();
    }

    @Override // o.T4
    public void k() {
        this.Z0.d(this, this.d1);
    }

    @Override // o.T4
    public boolean l() {
        return this.Y0.s();
    }

    @Override // o.T4
    public boolean m() {
        return this.c1;
    }

    @Override // o.T4
    public void n(View view) {
        WeakReference<View> weakReference;
        this.Y0.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.a1 = weakReference;
    }

    @Override // o.T4
    public void o(int i) {
        p(this.Z.getString(i));
    }

    @Override // o.T4
    public void p(CharSequence charSequence) {
        this.Y0.setSubtitle(charSequence);
    }

    @Override // o.T4
    public void r(int i) {
        s(this.Z.getString(i));
    }

    @Override // o.T4
    public void s(CharSequence charSequence) {
        this.Y0.setTitle(charSequence);
    }

    @Override // o.T4
    public void t(boolean z) {
        super.t(z);
        this.Y0.setTitleOptional(z);
    }

    public boolean w(androidx.appcompat.view.menu.m mVar) {
        if (!mVar.hasVisibleItems()) {
            return true;
        }
        new androidx.appcompat.view.menu.i(this.Y0.getContext(), mVar).l();
        return true;
    }

    public void v(androidx.appcompat.view.menu.m mVar) {
    }

    public void u(androidx.appcompat.view.menu.e eVar, boolean z) {
    }
}
