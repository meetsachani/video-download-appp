package o;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: o.ji1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7344ji1 {

    /* renamed from: o.ji1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    public static void a(Menu menu, boolean z) {
        if (menu instanceof InterfaceMenuC9553sh2) {
            ((InterfaceMenuC9553sh2) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a.a(menu, z);
        }
    }

    @JR1(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void b(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }
}
