package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

/* loaded from: classes.dex */
public class m extends e implements SubMenu {
    public e Q;
    public h R;

    public m(Context context, e eVar, h hVar) {
        super(context);
        this.Q = eVar;
        this.R = hVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e G() {
        return this.Q.G();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean J() {
        return this.Q.J();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean K() {
        return this.Q.K();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean L() {
        return this.Q.L();
    }

    @Override // androidx.appcompat.view.menu.e
    public void Y(e.a aVar) {
        this.Q.Y(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean g(h hVar) {
        return this.Q.g(hVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.R;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean i(e eVar, MenuItem menuItem) {
        if (!super.i(eVar, menuItem) && !this.Q.i(eVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.e
    public void k0(boolean z) {
        this.Q.k0(z);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean n(h hVar) {
        return this.Q.n(hVar);
    }

    public Menu o0() {
        return this.Q;
    }

    @Override // androidx.appcompat.view.menu.e, o.InterfaceMenuC9553sh2, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.Q.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.d0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.g0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.h0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.R.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.Q.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.e
    public String w() {
        int i;
        h hVar = this.R;
        if (hVar != null) {
            i = hVar.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.w() + ":" + i;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.c0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.f0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.R.setIcon(i);
        return this;
    }
}
