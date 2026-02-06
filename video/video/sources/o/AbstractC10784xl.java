package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: o.xl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10784xl {
    public final Context l;
    public C9654t62<InterfaceMenuItemC10039uh2, MenuItem> m;
    public C9654t62<InterfaceSubMenuC2644Ch2, SubMenu> n;

    public AbstractC10784xl(Context context) {
        this.l = context;
    }

    public final MenuItem e(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            InterfaceMenuItemC10039uh2 interfaceMenuItemC10039uh2 = (InterfaceMenuItemC10039uh2) menuItem;
            if (this.m == null) {
                this.m = new C9654t62<>();
            }
            MenuItem menuItem2 = this.m.get(interfaceMenuItemC10039uh2);
            if (menuItem2 == null) {
                MenuItemC9064qi1 menuItemC9064qi1 = new MenuItemC9064qi1(this.l, interfaceMenuItemC10039uh2);
                this.m.put(interfaceMenuItemC10039uh2, menuItemC9064qi1);
                return menuItemC9064qi1;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu f(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuC2644Ch2) {
            InterfaceSubMenuC2644Ch2 interfaceSubMenuC2644Ch2 = (InterfaceSubMenuC2644Ch2) subMenu;
            if (this.n == null) {
                this.n = new C9654t62<>();
            }
            SubMenu subMenu2 = this.n.get(interfaceSubMenuC2644Ch2);
            if (subMenu2 == null) {
                SubMenuC10278vg2 subMenuC10278vg2 = new SubMenuC10278vg2(this.l, interfaceSubMenuC2644Ch2);
                this.n.put(interfaceSubMenuC2644Ch2, subMenuC10278vg2);
                return subMenuC10278vg2;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public final void g() {
        C9654t62<InterfaceMenuItemC10039uh2, MenuItem> c9654t62 = this.m;
        if (c9654t62 != null) {
            c9654t62.clear();
        }
        C9654t62<InterfaceSubMenuC2644Ch2, SubMenu> c9654t622 = this.n;
        if (c9654t622 != null) {
            c9654t622.clear();
        }
    }

    public final void h(int i) {
        if (this.m != null) {
            int i2 = 0;
            while (i2 < this.m.size()) {
                if (this.m.g(i2).getGroupId() == i) {
                    this.m.j(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    public final void i(int i) {
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                if (this.m.g(i2).getItemId() == i) {
                    this.m.j(i2);
                    return;
                }
            }
        }
    }
}
