package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import o.U4;

/* renamed from: o.qi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuItemC9064qi1 extends AbstractC10784xl implements MenuItem {
    public static final String q = "MenuItemWrapper";

    /* renamed from: o  reason: collision with root package name */
    public final InterfaceMenuItemC10039uh2 f840o;
    public Method p;

    /* renamed from: o.qi1$a */
    /* loaded from: classes.dex */
    public class a extends U4 implements ActionProvider.VisibilityListener {
        public U4.b e;
        public final ActionProvider f;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f = actionProvider;
        }

        @Override // o.U4
        public boolean b() {
            return this.f.hasSubMenu();
        }

        @Override // o.U4
        public boolean c() {
            return this.f.isVisible();
        }

        @Override // o.U4
        public View d() {
            return this.f.onCreateActionView();
        }

        @Override // o.U4
        public View e(MenuItem menuItem) {
            return this.f.onCreateActionView(menuItem);
        }

        @Override // o.U4
        public boolean f() {
            return this.f.onPerformDefaultAction();
        }

        @Override // o.U4
        public void g(SubMenu subMenu) {
            this.f.onPrepareSubMenu(MenuItemC9064qi1.this.f(subMenu));
        }

        @Override // o.U4
        public boolean h() {
            return this.f.overridesItemVisibility();
        }

        @Override // o.U4
        public void i() {
            this.f.refreshVisibility();
        }

        @Override // o.U4
        public void l(U4.b bVar) {
            a aVar;
            this.e = bVar;
            ActionProvider actionProvider = this.f;
            if (bVar != null) {
                aVar = this;
            } else {
                aVar = null;
            }
            actionProvider.setVisibilityListener(aVar);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            U4.b bVar = this.e;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: o.qi1$b */
    /* loaded from: classes.dex */
    public static class b extends FrameLayout implements WE {
        public final CollapsibleActionView Y0;

        public b(View view) {
            super(view.getContext());
            this.Y0 = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.Y0;
        }

        @Override // o.WE
        public void onActionViewCollapsed() {
            this.Y0.onActionViewCollapsed();
        }

        @Override // o.WE
        public void onActionViewExpanded() {
            this.Y0.onActionViewExpanded();
        }
    }

    /* renamed from: o.qi1$c */
    /* loaded from: classes.dex */
    public class c implements MenuItem.OnActionExpandListener {
        public final MenuItem.OnActionExpandListener a;

        public c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(MenuItemC9064qi1.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(MenuItemC9064qi1.this.e(menuItem));
        }
    }

    /* renamed from: o.qi1$d */
    /* loaded from: classes.dex */
    public class d implements MenuItem.OnMenuItemClickListener {
        public final MenuItem.OnMenuItemClickListener a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(MenuItemC9064qi1.this.e(menuItem));
        }
    }

    public MenuItemC9064qi1(Context context, InterfaceMenuItemC10039uh2 interfaceMenuItemC10039uh2) {
        super(context);
        if (interfaceMenuItemC10039uh2 != null) {
            this.f840o = interfaceMenuItemC10039uh2;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f840o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f840o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        U4 a2 = this.f840o.a();
        if (a2 instanceof a) {
            return ((a) a2).f;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f840o.getActionView();
        if (actionView instanceof b) {
            return ((b) actionView).a();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f840o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f840o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f840o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f840o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f840o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f840o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f840o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f840o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f840o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f840o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f840o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f840o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f840o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f840o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f840o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f840o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f840o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f840o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f840o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f840o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f840o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f840o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f840o.isVisible();
    }

    public void j(boolean z) {
        try {
            if (this.p == null) {
                this.p = this.f840o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.p.invoke(this.f840o, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w(q, "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.l, actionProvider);
        InterfaceMenuItemC10039uh2 interfaceMenuItemC10039uh2 = this.f840o;
        if (actionProvider == null) {
            aVar = null;
        }
        interfaceMenuItemC10039uh2.c(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f840o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f840o.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f840o.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f840o.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f840o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f840o.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f840o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f840o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f840o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f840o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f840o.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        c cVar;
        InterfaceMenuItemC10039uh2 interfaceMenuItemC10039uh2 = this.f840o;
        if (onActionExpandListener != null) {
            cVar = new c(onActionExpandListener);
        } else {
            cVar = null;
        }
        interfaceMenuItemC10039uh2.setOnActionExpandListener(cVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        d dVar;
        InterfaceMenuItemC10039uh2 interfaceMenuItemC10039uh2 = this.f840o;
        if (onMenuItemClickListener != null) {
            dVar = new d(onMenuItemClickListener);
        } else {
            dVar = null;
        }
        interfaceMenuItemC10039uh2.setOnMenuItemClickListener(dVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f840o.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f840o.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f840o.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f840o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f840o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f840o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f840o.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f840o.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f840o.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f840o.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f840o.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f840o.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f840o.setActionView(i);
        View actionView = this.f840o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f840o.setActionView(new b(actionView));
        }
        return this;
    }
}
