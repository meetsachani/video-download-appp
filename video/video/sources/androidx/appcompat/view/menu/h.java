package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import o.C3220Ic;
import o.D60;
import o.InterfaceMenuItemC10039uh2;
import o.OL1;
import o.U4;

/* loaded from: classes.dex */
public final class h implements InterfaceMenuItemC10039uh2 {
    public static final String Q = "MenuItemImpl";
    public static final int R = 3;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 4;
    public static final int V = 8;
    public static final int W = 16;
    public static final int X = 32;
    public static final int Y = 0;
    public Runnable A;
    public MenuItem.OnMenuItemClickListener B;
    public CharSequence C;
    public CharSequence D;
    public int K;
    public View L;
    public U4 M;
    public MenuItem.OnActionExpandListener N;
    public ContextMenu.ContextMenuInfo P;
    public final int l;
    public final int m;
    public final int n;

    /* renamed from: o */
    public final int f9o;
    public CharSequence p;
    public CharSequence q;
    public Intent r;
    public char s;
    public char u;
    public Drawable w;
    public e y;
    public m z;
    public int t = 4096;
    public int v = 4096;
    public int x = 0;
    public ColorStateList E = null;
    public PorterDuff.Mode F = null;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public int J = 16;
    public boolean O = false;

    /* loaded from: classes.dex */
    public class a implements U4.b {
        public a() {
            h.this = r1;
        }

        @Override // o.U4.b
        public void onActionProviderVisibilityChanged(boolean z) {
            h hVar = h.this;
            hVar.y.N(hVar);
        }
    }

    public h(e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.y = eVar;
        this.l = i2;
        this.m = i;
        this.n = i3;
        this.f9o = i4;
        this.p = charSequence;
        this.K = i5;
    }

    public static void f(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public void A(m mVar) {
        this.z = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    public boolean B(boolean z) {
        int i;
        int i2 = this.J;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.J = i4;
        if (i2 == i4) {
            return false;
        }
        return true;
    }

    public boolean C() {
        return this.y.D();
    }

    public boolean D() {
        if (this.y.L() && j() != 0) {
            return true;
        }
        return false;
    }

    public boolean E() {
        if ((this.K & 4) == 4) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceMenuItemC10039uh2
    public U4 a() {
        return this.M;
    }

    @Override // o.InterfaceMenuItemC10039uh2
    public boolean b() {
        if ((this.K & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceMenuItemC10039uh2
    public InterfaceMenuItemC10039uh2 c(U4 u4) {
        U4 u42 = this.M;
        if (u42 != null) {
            u42.j();
        }
        this.L = null;
        this.M = u4;
        this.y.O(true);
        U4 u43 = this.M;
        if (u43 != null) {
            u43.l(new a());
        }
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.y.g(this);
    }

    @Override // o.InterfaceMenuItemC10039uh2
    public boolean d() {
        if (!b() && !q()) {
            return true;
        }
        return false;
    }

    public void e() {
        this.y.M(this);
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.y.n(this);
    }

    public final Drawable g(Drawable drawable) {
        if (drawable != null && this.I && (this.G || this.H)) {
            drawable = D60.r(drawable).mutate();
            if (this.G) {
                D60.o(drawable, this.E);
            }
            if (this.H) {
                D60.p(drawable, this.F);
            }
            this.I = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public View getActionView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        U4 u4 = this.M;
        if (u4 != null) {
            View e = u4.e(this);
            this.L = e;
            return e;
        }
        return null;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.u;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.x != 0) {
            Drawable b = C3220Ic.b(this.y.x(), this.x);
            this.x = 0;
            this.w = b;
            return g(b);
        }
        return null;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public int getNumericModifiers() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.q;
        if (charSequence != null) {
            return charSequence;
        }
        return this.p;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.D;
    }

    public Runnable h() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        if (this.z != null) {
            return true;
        }
        return false;
    }

    public int i() {
        return this.f9o;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.J & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.J & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.J & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        U4 u4 = this.M;
        if (u4 != null && u4.h()) {
            if ((this.J & 8) != 0 || !this.M.c()) {
                return false;
            }
            return true;
        } else if ((this.J & 8) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public char j() {
        if (this.y.K()) {
            return this.u;
        }
        return this.s;
    }

    public String k() {
        int i;
        char j = j();
        if (j == 0) {
            return "";
        }
        Resources resources = this.y.x().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.y.x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(OL1.k.r));
        }
        if (this.y.K()) {
            i = this.v;
        } else {
            i = this.t;
        }
        f(sb, i, 65536, resources.getString(OL1.k.n));
        f(sb, i, 4096, resources.getString(OL1.k.j));
        f(sb, i, 2, resources.getString(OL1.k.i));
        f(sb, i, 1, resources.getString(OL1.k.f570o));
        f(sb, i, 4, resources.getString(OL1.k.q));
        f(sb, i, 8, resources.getString(OL1.k.m));
        if (j != '\b') {
            if (j != '\n') {
                if (j != ' ') {
                    sb.append(j);
                } else {
                    sb.append(resources.getString(OL1.k.p));
                }
            } else {
                sb.append(resources.getString(OL1.k.l));
            }
        } else {
            sb.append(resources.getString(OL1.k.k));
        }
        return sb.toString();
    }

    public CharSequence l(k.a aVar) {
        if (aVar != null && aVar.r()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    public boolean m() {
        U4 u4;
        if ((this.K & 8) != 0) {
            if (this.L == null && (u4 = this.M) != null) {
                this.L = u4.e(this);
            }
            if (this.L != null) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.y;
        if (eVar.i(eVar, this)) {
            return true;
        }
        Runnable runnable = this.A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.r != null) {
            try {
                this.y.x().startActivity(this.r);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e(Q, "Can't find activity to handle intent; ignoring", e);
            }
        }
        U4 u4 = this.M;
        if (u4 != null && u4.f()) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if ((this.J & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if ((this.J & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean q() {
        if ((this.K & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    /* renamed from: r */
    public InterfaceMenuItemC10039uh2 setActionView(int i) {
        Context x = this.y.x();
        setActionView(LayoutInflater.from(x).inflate(i, (ViewGroup) new LinearLayout(x), false));
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    /* renamed from: s */
    public InterfaceMenuItemC10039uh2 setActionView(View view) {
        int i;
        this.L = view;
        this.M = null;
        if (view != null && view.getId() == -1 && (i = this.l) > 0) {
            view.setId(i);
        }
        this.y.M(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.u == c) {
            return this;
        }
        this.u = Character.toLowerCase(c);
        this.y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.J;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.J = i2;
        if (i != i2) {
            this.y.O(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.J & 4) != 0) {
            this.y.b0(this);
            return this;
        }
        v(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.J |= 16;
        } else {
            this.J &= -17;
        }
        this.y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.x = 0;
        this.w = drawable;
        this.I = true;
        this.y.O(false);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.E = colorStateList;
        this.G = true;
        this.I = true;
        this.y.O(false);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.F = mode;
        this.H = true;
        this.I = true;
        this.y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.s == c) {
            return this;
        }
        this.s = c;
        this.y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.N = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.B = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.s = c;
        this.u = Character.toLowerCase(c2);
        this.y.O(false);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = i;
        this.y.M(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.p = charSequence;
        this.y.O(false);
        m mVar = this.z;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.q = charSequence;
        this.y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (B(z)) {
            this.y.N(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.O = z;
        this.y.O(false);
    }

    public String toString() {
        CharSequence charSequence = this.p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.A = runnable;
        return this;
    }

    public void v(boolean z) {
        int i;
        int i2 = this.J;
        int i3 = i2 & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.J = i4;
        if (i2 != i4) {
            this.y.O(false);
        }
    }

    public void w(boolean z) {
        int i;
        int i2 = this.J & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.J = i | i2;
    }

    public void x(boolean z) {
        if (z) {
            this.J |= 32;
        } else {
            this.J &= -33;
        }
    }

    public void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.P = contextMenuInfo;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    /* renamed from: z */
    public InterfaceMenuItemC10039uh2 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public InterfaceMenuItemC10039uh2 setContentDescription(CharSequence charSequence) {
        this.C = charSequence;
        this.y.O(false);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public InterfaceMenuItemC10039uh2 setTooltipText(CharSequence charSequence) {
        this.D = charSequence;
        this.y.O(false);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.u == c && this.v == i) {
            return this;
        }
        this.u = Character.toLowerCase(c);
        this.v = KeyEvent.normalizeMetaState(i);
        this.y.O(false);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.s == c && this.t == i) {
            return this;
        }
        this.s = c;
        this.t = KeyEvent.normalizeMetaState(i);
        this.y.O(false);
        return this;
    }

    @Override // o.InterfaceMenuItemC10039uh2, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.s = c;
        this.t = KeyEvent.normalizeMetaState(i);
        this.u = Character.toLowerCase(c2);
        this.v = KeyEvent.normalizeMetaState(i2);
        this.y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.w = null;
        this.x = i;
        this.I = true;
        this.y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.y.x().getString(i));
    }
}
