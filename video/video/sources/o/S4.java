package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class S4 implements InterfaceMenuItemC10039uh2 {
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 4;
    public static final int I = 8;
    public static final int J = 16;
    public final int l;
    public final int m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f604o;
    public CharSequence p;
    public Intent q;
    public char r;
    public char t;
    public Drawable v;
    public Context w;
    public MenuItem.OnMenuItemClickListener x;
    public CharSequence y;
    public CharSequence z;
    public int s = 4096;
    public int u = 4096;
    public ColorStateList A = null;
    public PorterDuff.Mode B = null;
    public boolean C = false;
    public boolean D = false;
    public int E = 16;

    public S4(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.w = context;
        this.l = i2;
        this.m = i;
        this.n = i4;
        this.f604o = charSequence;
    }

    @Override // o.InterfaceMenuItemC10039uh2
    public U4 a() {
        return null;
    }

    @Override // o.InterfaceMenuItemC10039uh2
    public boolean b() {
        return true;
    }

    @Override // o.InterfaceMenuItemC10039uh2
    public InterfaceMenuItemC10039uh2 c(U4 u4) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // o.InterfaceMenuItemC10039uh2
    public boolean d() {
        return false;
    }

    public final void e() {
        Drawable drawable = this.v;
        if (drawable != null) {
            if (this.C || this.D) {
                Drawable r = D60.r(drawable);
                this.v = r;
                Drawable mutate = r.mutate();
                this.v = mutate;
                if (this.C) {
                    D60.o(mutate, this.A);
                }
                if (this.D) {
                    D60.p(this.v, this.B);
                }
            }
        }
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.q;
        if (intent != null) {
            this.w.startActivity(intent);
            return true;
        }
        return false;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    /* renamed from: g */
    public InterfaceMenuItemC10039uh2 setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.t;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.v;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.A;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public int getNumericModifiers() {
        return this.s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f604o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.p;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f604o;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.z;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    /* renamed from: h */
    public InterfaceMenuItemC10039uh2 setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public S4 i(boolean z) {
        int i;
        int i2 = this.E & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.E = i | i2;
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.E & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.E & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.E & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        if ((this.E & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    /* renamed from: j */
    public InterfaceMenuItemC10039uh2 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.t = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.E = (z ? 1 : 0) | (this.E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.E & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.E = i | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.E & (-17);
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.E = i | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.v = drawable;
        e();
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        e();
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.r = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.r = c;
        this.t = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f604o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.E & 8;
        if (z) {
            i = 0;
        }
        this.E = i2 | i;
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.t = Character.toLowerCase(c);
        this.u = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public InterfaceMenuItemC10039uh2 setContentDescription(CharSequence charSequence) {
        this.y = charSequence;
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.r = c;
        this.s = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f604o = this.w.getResources().getString(i);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public InterfaceMenuItemC10039uh2 setTooltipText(CharSequence charSequence) {
        this.z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.v = C10201vM.l(this.w, i);
        e();
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.r = c;
        this.s = KeyEvent.normalizeMetaState(i);
        this.t = Character.toLowerCase(c2);
        this.u = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public void setShowAsAction(int i) {
    }
}
