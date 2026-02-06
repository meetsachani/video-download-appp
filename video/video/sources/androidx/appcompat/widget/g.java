package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.legacy.app.ActionBarDrawerToggle;
import o.AbstractC4051Qo1;
import o.C2872Ep2;
import o.C3220Ic;
import o.C3611Mc;
import o.C5537cI2;
import o.C6516gH2;
import o.InterfaceC10728xW;
import o.OL1;
import o.S4;
import o.ZH2;

/* loaded from: classes.dex */
public class g implements InterfaceC10728xW {
    public static final String s = "ToolbarWidgetWrapper";
    public static final int t = 3;
    public static final long u = 200;
    public Toolbar a;
    public int b;
    public View c;
    public Spinner d;
    public View e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public boolean i;
    public CharSequence j;
    public CharSequence k;
    public CharSequence l;
    public Window.Callback m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public androidx.appcompat.widget.a f11o;
    public int p;
    public int q;
    public Drawable r;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final S4 X;

        public a() {
            this.X = new S4(g.this.a.getContext(), 0, ActionBarDrawerToggle.p, 0, 0, g.this.j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g gVar = g.this;
            Window.Callback callback = gVar.m;
            if (callback != null && gVar.n) {
                callback.onMenuItemSelected(0, this.X);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends C5537cI2 {
        public boolean a = false;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // o.C5537cI2, o.InterfaceC5295bI2
        public void a(View view) {
            this.a = true;
        }

        @Override // o.C5537cI2, o.InterfaceC5295bI2
        public void b(View view) {
            if (!this.a) {
                g.this.a.setVisibility(this.b);
            }
        }

        @Override // o.C5537cI2, o.InterfaceC5295bI2
        public void c(View view) {
            g.this.a.setVisibility(0);
        }
    }

    public g(Toolbar toolbar, boolean z) {
        this(toolbar, z, OL1.k.b, OL1.f.v);
    }

    @Override // o.InterfaceC10728xW
    public int A() {
        Spinner spinner = this.d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // o.InterfaceC10728xW
    public void B(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // o.InterfaceC10728xW
    public void C(int i) {
        if (i != this.q) {
            this.q = i;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                y(this.q);
            }
        }
    }

    @Override // o.InterfaceC10728xW
    public void D() {
        this.a.f();
    }

    @Override // o.InterfaceC10728xW
    public View E() {
        return this.e;
    }

    @Override // o.InterfaceC10728xW
    public void F(e eVar) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = eVar;
        if (eVar != null && this.p == 2) {
            this.a.addView(eVar, 0);
            Toolbar.g gVar = (Toolbar.g) this.c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) gVar).width = -2;
            ((ViewGroup.MarginLayoutParams) gVar).height = -2;
            gVar.a = 8388691;
            eVar.setAllowCollapse(true);
        }
    }

    @Override // o.InterfaceC10728xW
    public void G(Drawable drawable) {
        this.g = drawable;
        Z();
    }

    @Override // o.InterfaceC10728xW
    public void H(Drawable drawable) {
        if (this.r != drawable) {
            this.r = drawable;
            Y();
        }
    }

    @Override // o.InterfaceC10728xW
    public void I(SparseArray<Parcelable> sparseArray) {
        this.a.saveHierarchyState(sparseArray);
    }

    @Override // o.InterfaceC10728xW
    public boolean J() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10728xW
    public void K(int i) {
        ZH2 t2 = t(i, 200L);
        if (t2 != null) {
            t2.x();
        }
    }

    @Override // o.InterfaceC10728xW
    public void L(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C3220Ic.b(getContext(), i);
        } else {
            drawable = null;
        }
        T(drawable);
    }

    @Override // o.InterfaceC10728xW
    public void M(j.a aVar, e.a aVar2) {
        this.a.Q(aVar, aVar2);
    }

    @Override // o.InterfaceC10728xW
    public void N(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        V();
        this.d.setAdapter(spinnerAdapter);
        this.d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // o.InterfaceC10728xW
    public void O(SparseArray<Parcelable> sparseArray) {
        this.a.restoreHierarchyState(sparseArray);
    }

    @Override // o.InterfaceC10728xW
    public CharSequence P() {
        return this.a.getSubtitle();
    }

    @Override // o.InterfaceC10728xW
    public int Q() {
        return this.b;
    }

    @Override // o.InterfaceC10728xW
    public void R(View view) {
        View view2 = this.e;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.e = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    @Override // o.InterfaceC10728xW
    public void S() {
        Log.i(s, "Progress display unsupported");
    }

    @Override // o.InterfaceC10728xW
    public void T(Drawable drawable) {
        this.h = drawable;
        Y();
    }

    public final int U() {
        if (this.a.getNavigationIcon() != null) {
            this.r = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public final void V() {
        if (this.d == null) {
            this.d = new C3611Mc(getContext(), null, OL1.b.m);
            this.d.setLayoutParams(new Toolbar.g(-2, -2, AbstractC4051Qo1.o1));
        }
    }

    public final void W(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.i) {
                C6516gH2.L1(this.a.getRootView(), charSequence);
            }
        }
    }

    public final void X() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.a.setNavigationContentDescription(this.q);
            } else {
                this.a.setNavigationContentDescription(this.l);
            }
        }
    }

    public final void Y() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.h;
            if (drawable == null) {
                drawable = this.r;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    public final void Z() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                drawable = this.g;
                if (drawable == null) {
                    drawable = this.f;
                }
            } else {
                drawable = this.f;
            }
        } else {
            drawable = null;
        }
        this.a.setLogo(drawable);
    }

    @Override // o.InterfaceC10728xW
    public void a(Drawable drawable) {
        this.a.setBackground(drawable);
    }

    @Override // o.InterfaceC10728xW
    public boolean b() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10728xW
    public int c() {
        return this.a.getVisibility();
    }

    @Override // o.InterfaceC10728xW
    public void collapseActionView() {
        this.a.e();
    }

    @Override // o.InterfaceC10728xW
    public boolean d() {
        return this.a.d();
    }

    @Override // o.InterfaceC10728xW
    public boolean e() {
        return this.a.x();
    }

    @Override // o.InterfaceC10728xW
    public boolean f() {
        return this.a.X();
    }

    @Override // o.InterfaceC10728xW
    public void g(Menu menu, j.a aVar) {
        if (this.f11o == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(this.a.getContext());
            this.f11o = aVar2;
            aVar2.s(OL1.g.j);
        }
        this.f11o.d(aVar);
        this.a.P((androidx.appcompat.view.menu.e) menu, this.f11o);
    }

    @Override // o.InterfaceC10728xW
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // o.InterfaceC10728xW
    public int getHeight() {
        return this.a.getHeight();
    }

    @Override // o.InterfaceC10728xW
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // o.InterfaceC10728xW
    public boolean h() {
        return this.a.D();
    }

    @Override // o.InterfaceC10728xW
    public void i() {
        this.n = true;
    }

    @Override // o.InterfaceC10728xW
    public boolean j() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10728xW
    public boolean k() {
        return this.a.B();
    }

    @Override // o.InterfaceC10728xW
    public boolean l() {
        return this.a.w();
    }

    @Override // o.InterfaceC10728xW
    public boolean m() {
        return this.a.E();
    }

    @Override // o.InterfaceC10728xW
    public void n(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    X();
                }
                Y();
            }
            if ((i2 & 3) != 0) {
                Z();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.j);
                    this.a.setSubtitle(this.k);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.e) != null) {
                if ((i & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    @Override // o.InterfaceC10728xW
    public void o(CharSequence charSequence) {
        this.l = charSequence;
        X();
    }

    @Override // o.InterfaceC10728xW
    public void p(CharSequence charSequence) {
        this.k = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // o.InterfaceC10728xW
    public void q(int i) {
        Spinner spinner = this.d;
        if (spinner != null) {
            spinner.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    @Override // o.InterfaceC10728xW
    public Menu r() {
        return this.a.getMenu();
    }

    @Override // o.InterfaceC10728xW
    public int s() {
        return this.p;
    }

    @Override // o.InterfaceC10728xW
    public void setIcon(int i) {
        setIcon(i != 0 ? C3220Ic.b(getContext(), i) : null);
    }

    @Override // o.InterfaceC10728xW
    public void setLogo(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C3220Ic.b(getContext(), i);
        } else {
            drawable = null;
        }
        G(drawable);
    }

    @Override // o.InterfaceC10728xW
    public void setTitle(CharSequence charSequence) {
        this.i = true;
        W(charSequence);
    }

    @Override // o.InterfaceC10728xW
    public void setVisibility(int i) {
        this.a.setVisibility(i);
    }

    @Override // o.InterfaceC10728xW
    public void setWindowCallback(Window.Callback callback) {
        this.m = callback;
    }

    @Override // o.InterfaceC10728xW
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.i) {
            W(charSequence);
        }
    }

    @Override // o.InterfaceC10728xW
    public ZH2 t(int i, long j) {
        float f;
        ZH2 h = C6516gH2.h(this.a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return h.b(f).r(j).t(new b(i));
    }

    @Override // o.InterfaceC10728xW
    public void u(int i) {
        View view;
        int i2 = this.p;
        if (i != i2) {
            if (i2 != 1) {
                if (i2 == 2 && (view = this.c) != null) {
                    ViewParent parent = view.getParent();
                    Toolbar toolbar = this.a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.c);
                    }
                }
            } else {
                Spinner spinner = this.d;
                if (spinner != null) {
                    ViewParent parent2 = spinner.getParent();
                    Toolbar toolbar2 = this.a;
                    if (parent2 == toolbar2) {
                        toolbar2.removeView(this.d);
                    }
                }
            }
            this.p = i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        View view2 = this.c;
                        if (view2 != null) {
                            this.a.addView(view2, 0);
                            Toolbar.g gVar = (Toolbar.g) this.c.getLayoutParams();
                            ((ViewGroup.MarginLayoutParams) gVar).width = -2;
                            ((ViewGroup.MarginLayoutParams) gVar).height = -2;
                            gVar.a = 8388691;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Invalid navigation mode " + i);
                }
                V();
                this.a.addView(this.d, 0);
            }
        }
    }

    @Override // o.InterfaceC10728xW
    public ViewGroup v() {
        return this.a;
    }

    @Override // o.InterfaceC10728xW
    public void w(boolean z) {
    }

    @Override // o.InterfaceC10728xW
    public int x() {
        Spinner spinner = this.d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // o.InterfaceC10728xW
    public void y(int i) {
        String string;
        if (i == 0) {
            string = null;
        } else {
            string = getContext().getString(i);
        }
        o(string);
    }

    @Override // o.InterfaceC10728xW
    public void z() {
        Log.i(s, "Progress display unsupported");
    }

    public g(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.p = 0;
        this.q = 0;
        this.a = toolbar;
        this.j = toolbar.getTitle();
        this.k = toolbar.getSubtitle();
        this.i = this.j != null;
        this.h = toolbar.getNavigationIcon();
        C2872Ep2 G = C2872Ep2.G(toolbar.getContext(), null, OL1.m.a, OL1.b.f, 0);
        this.r = G.h(OL1.m.q);
        if (z) {
            CharSequence x = G.x(OL1.m.C);
            if (!TextUtils.isEmpty(x)) {
                setTitle(x);
            }
            CharSequence x2 = G.x(OL1.m.A);
            if (!TextUtils.isEmpty(x2)) {
                p(x2);
            }
            Drawable h = G.h(OL1.m.v);
            if (h != null) {
                G(h);
            }
            Drawable h2 = G.h(OL1.m.s);
            if (h2 != null) {
                setIcon(h2);
            }
            if (this.h == null && (drawable = this.r) != null) {
                T(drawable);
            }
            n(G.o(OL1.m.l, 0));
            int u2 = G.u(OL1.m.k, 0);
            if (u2 != 0) {
                R(LayoutInflater.from(this.a.getContext()).inflate(u2, (ViewGroup) this.a, false));
                n(this.b | 16);
            }
            int q = G.q(OL1.m.f572o, 0);
            if (q > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = q;
                this.a.setLayoutParams(layoutParams);
            }
            int f = G.f(OL1.m.i, -1);
            int f2 = G.f(OL1.m.e, -1);
            if (f >= 0 || f2 >= 0) {
                this.a.O(Math.max(f, 0), Math.max(f2, 0));
            }
            int u3 = G.u(OL1.m.D, 0);
            if (u3 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.T(toolbar2.getContext(), u3);
            }
            int u4 = G.u(OL1.m.B, 0);
            if (u4 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.R(toolbar3.getContext(), u4);
            }
            int u5 = G.u(OL1.m.x, 0);
            if (u5 != 0) {
                this.a.setPopupTheme(u5);
            }
        } else {
            this.b = U();
        }
        G.I();
        C(i);
        this.l = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // o.InterfaceC10728xW
    public void setIcon(Drawable drawable) {
        this.f = drawable;
        Z();
    }
}
