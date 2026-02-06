package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: o.wi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC10531wi1 extends AbstractC10784xl implements Menu {

    /* renamed from: o  reason: collision with root package name */
    public final InterfaceMenuC9553sh2 f905o;

    public MenuC10531wi1(Context context, InterfaceMenuC9553sh2 interfaceMenuC9553sh2) {
        super(context);
        if (interfaceMenuC9553sh2 != null) {
            this.f905o = interfaceMenuC9553sh2;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return e(this.f905o.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.f905o.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = e(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.f905o.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        g();
        this.f905o.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f905o.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return e(this.f905o.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return e(this.f905o.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f905o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f905o.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f905o.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f905o.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        h(i);
        this.f905o.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        i(i);
        this.f905o.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f905o.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f905o.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f905o.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f905o.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f905o.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return e(this.f905o.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return f(this.f905o.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return e(this.f905o.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return f(this.f905o.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return e(this.f905o.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return f(this.f905o.addSubMenu(i, i2, i3, i4));
    }
}
