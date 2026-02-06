package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* renamed from: o.oi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8578oi1 {
    public static final String a = "MenuItemCompat";
    @Deprecated
    public static final int b = 0;
    @Deprecated
    public static final int c = 1;
    @Deprecated
    public static final int d = 2;
    @Deprecated
    public static final int e = 4;
    @Deprecated
    public static final int f = 8;

    /* renamed from: o.oi1$a */
    /* loaded from: classes.dex */
    public class a implements MenuItem.OnActionExpandListener {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(menuItem);
        }
    }

    /* renamed from: o.oi1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        public static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        public static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        public static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        public static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        public static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        public static MenuItem g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        public static MenuItem k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        public static MenuItem l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    /* renamed from: o.oi1$c */
    /* loaded from: classes.dex */
    public interface c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @JR1(expression = "item.collapseActionView()")
    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @JR1(expression = "item.expandActionView()")
    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    public static U4 c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            return ((InterfaceMenuItemC10039uh2) menuItem).a();
        }
        Log.w(a, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @JR1(expression = "item.getActionView()")
    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            return ((InterfaceMenuItemC10039uh2) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(menuItem);
        }
        return 0;
    }

    public static CharSequence f(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            return ((InterfaceMenuItemC10039uh2) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(menuItem);
        }
        return null;
    }

    public static ColorStateList g(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            return ((InterfaceMenuItemC10039uh2) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(menuItem);
        }
        return null;
    }

    public static PorterDuff.Mode h(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            return ((InterfaceMenuItemC10039uh2) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.d(menuItem);
        }
        return null;
    }

    public static int i(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            return ((InterfaceMenuItemC10039uh2) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.e(menuItem);
        }
        return 0;
    }

    public static CharSequence j(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            return ((InterfaceMenuItemC10039uh2) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(menuItem);
        }
        return null;
    }

    @JR1(expression = "item.isActionViewExpanded()")
    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    public static MenuItem l(MenuItem menuItem, U4 u4) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            return ((InterfaceMenuItemC10039uh2) menuItem).c(u4);
        }
        Log.w(a, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @JR1(expression = "item.setActionView(resId)")
    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @JR1(expression = "item.setActionView(view)")
    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            ((InterfaceMenuItemC10039uh2) menuItem).setAlphabeticShortcut(c2, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.g(menuItem, c2, i);
        }
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            ((InterfaceMenuItemC10039uh2) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.h(menuItem, charSequence);
        }
    }

    public static void q(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            ((InterfaceMenuItemC10039uh2) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.i(menuItem, colorStateList);
        }
    }

    public static void r(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            ((InterfaceMenuItemC10039uh2) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.j(menuItem, mode);
        }
    }

    public static void s(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            ((InterfaceMenuItemC10039uh2) menuItem).setNumericShortcut(c2, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.k(menuItem, c2, i);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, c cVar) {
        return menuItem.setOnActionExpandListener(new a(cVar));
    }

    public static void u(MenuItem menuItem, char c2, char c3, int i, int i2) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            ((InterfaceMenuItemC10039uh2) menuItem).setShortcut(c2, c3, i, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.l(menuItem, c2, c3, i, i2);
        }
    }

    @JR1(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void v(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    public static void w(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC10039uh2) {
            ((InterfaceMenuItemC10039uh2) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.m(menuItem, charSequence);
        }
    }
}
