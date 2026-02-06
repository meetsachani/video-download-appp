package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

/* renamed from: o.uh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC10039uh2 extends MenuItem {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 4;
    public static final int k = 8;

    U4 a();

    boolean b();

    InterfaceMenuItemC10039uh2 c(U4 u4);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i2);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC10039uh2 setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int i2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c2, int i2, int i3);

    @Override // android.view.MenuItem
    void setShowAsAction(int i2);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC10039uh2 setTooltipText(CharSequence charSequence);
}
