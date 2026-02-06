package o;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Ko1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3466Ko1 {
    public final androidx.appcompat.view.menu.e a;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public final List<MenuItem> b = new ArrayList();

    public C3466Ko1(androidx.appcompat.view.menu.e eVar) {
        this.a = eVar;
        f();
    }

    public int a() {
        return this.c;
    }

    @InterfaceC5670cr1
    public MenuItem b(int i) {
        return this.b.get(i);
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public boolean e(@InterfaceC5670cr1 MenuItem menuItem, @InterfaceC5670cr1 androidx.appcompat.view.menu.j jVar, int i) {
        return this.a.Q(menuItem, jVar, i);
    }

    public void f() {
        List<MenuItem> list;
        List<MenuItem> list2;
        List<MenuItem> list3;
        this.b.clear();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        for (int i = 0; i < this.a.size(); i++) {
            MenuItem item = this.a.getItem(i);
            if (item.hasSubMenu()) {
                if (!this.b.isEmpty()) {
                    if (!(this.b.get(list3.size() - 1) instanceof H40) && item.isVisible()) {
                        this.b.add(new H40());
                    }
                }
                this.b.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.b.add(item2);
                    this.c++;
                    if (item2.isVisible()) {
                        this.d++;
                    }
                }
                this.b.add(new H40());
            } else {
                this.b.add(item);
                this.c++;
                if (item.isVisible()) {
                    this.d++;
                    this.e++;
                }
            }
        }
        if (!this.b.isEmpty()) {
            if (this.b.get(list.size() - 1) instanceof H40) {
                this.b.remove(list2.size() - 1);
            }
        }
    }

    public int g() {
        return this.b.size();
    }
}
