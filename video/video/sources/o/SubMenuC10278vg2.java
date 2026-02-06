package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.vg2 */
/* loaded from: classes.dex */
public class SubMenuC10278vg2 extends MenuC10531wi1 implements SubMenu {
    public final InterfaceSubMenuC2644Ch2 p;

    public SubMenuC10278vg2(Context context, InterfaceSubMenuC2644Ch2 interfaceSubMenuC2644Ch2) {
        super(context, interfaceSubMenuC2644Ch2);
        this.p = interfaceSubMenuC2644Ch2;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.p.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return e(this.p.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.p.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.p.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.p.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.p.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.p.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.p.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.p.setIcon(drawable);
        return this;
    }
}
