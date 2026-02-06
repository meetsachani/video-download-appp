package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.O4;
import o.OL1;
import o.T4;

/* renamed from: o.nL2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8249nL2 extends O4 implements ActionBarOverlayLayout.d {
    public static final String N = "WindowDecorActionBar";
    public static final Interpolator O = new AccelerateInterpolator();
    public static final Interpolator P = new DecelerateInterpolator();
    public static final int Q = -1;
    public static final long R = 100;
    public static final long S = 200;
    public boolean A;
    public boolean D;
    public boolean E;
    public boolean F;
    public C5052aI2 H;
    public boolean I;
    public boolean J;
    public Context i;
    public Context j;
    public Activity k;
    public ActionBarOverlayLayout l;
    public ActionBarContainer m;
    public InterfaceC10728xW n;

    /* renamed from: o  reason: collision with root package name */
    public ActionBarContextView f823o;
    public View p;
    public androidx.appcompat.widget.e q;
    public e s;
    public boolean u;
    public d v;
    public T4 w;
    public T4.a x;
    public boolean y;
    public ArrayList<e> r = new ArrayList<>();
    public int t = -1;
    public ArrayList<O4.d> z = new ArrayList<>();
    public int B = 0;
    public boolean C = true;
    public boolean G = true;
    public final InterfaceC5295bI2 K = new a();
    public final InterfaceC5295bI2 L = new b();
    public final InterfaceC5780dI2 M = new c();

    /* renamed from: o.nL2$a */
    /* loaded from: classes.dex */
    public class a extends C5537cI2 {
        public a() {
        }

        @Override // o.C5537cI2, o.InterfaceC5295bI2
        public void b(View view) {
            View view2;
            C8249nL2 c8249nL2 = C8249nL2.this;
            if (c8249nL2.C && (view2 = c8249nL2.p) != null) {
                view2.setTranslationY(0.0f);
                C8249nL2.this.m.setTranslationY(0.0f);
            }
            C8249nL2.this.m.setVisibility(8);
            C8249nL2.this.m.setTransitioning(false);
            C8249nL2 c8249nL22 = C8249nL2.this;
            c8249nL22.H = null;
            c8249nL22.G0();
            ActionBarOverlayLayout actionBarOverlayLayout = C8249nL2.this.l;
            if (actionBarOverlayLayout != null) {
                C6516gH2.C1(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: o.nL2$b */
    /* loaded from: classes.dex */
    public class b extends C5537cI2 {
        public b() {
        }

        @Override // o.C5537cI2, o.InterfaceC5295bI2
        public void b(View view) {
            C8249nL2 c8249nL2 = C8249nL2.this;
            c8249nL2.H = null;
            c8249nL2.m.requestLayout();
        }
    }

    /* renamed from: o.nL2$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC5780dI2 {
        public c() {
        }

        @Override // o.InterfaceC5780dI2
        public void a(View view) {
            ((View) C8249nL2.this.m.getParent()).invalidate();
        }
    }

    /* renamed from: o.nL2$e */
    /* loaded from: classes.dex */
    public class e extends O4.f {
        public O4.g b;
        public Object c;
        public Drawable d;
        public CharSequence e;
        public CharSequence f;
        public int g = -1;
        public View h;

        public e() {
        }

        @Override // o.O4.f
        public CharSequence a() {
            return this.f;
        }

        @Override // o.O4.f
        public View b() {
            return this.h;
        }

        @Override // o.O4.f
        public Drawable c() {
            return this.d;
        }

        @Override // o.O4.f
        public int d() {
            return this.g;
        }

        @Override // o.O4.f
        public Object e() {
            return this.c;
        }

        @Override // o.O4.f
        public CharSequence f() {
            return this.e;
        }

        @Override // o.O4.f
        public void g() {
            C8249nL2.this.R(this);
        }

        @Override // o.O4.f
        public O4.f h(int i) {
            return i(C8249nL2.this.i.getResources().getText(i));
        }

        @Override // o.O4.f
        public O4.f i(CharSequence charSequence) {
            this.f = charSequence;
            int i = this.g;
            if (i >= 0) {
                C8249nL2.this.q.m(i);
            }
            return this;
        }

        @Override // o.O4.f
        public O4.f j(int i) {
            return k(LayoutInflater.from(C8249nL2.this.z()).inflate(i, (ViewGroup) null));
        }

        @Override // o.O4.f
        public O4.f k(View view) {
            this.h = view;
            int i = this.g;
            if (i >= 0) {
                C8249nL2.this.q.m(i);
            }
            return this;
        }

        @Override // o.O4.f
        public O4.f l(int i) {
            return m(C3220Ic.b(C8249nL2.this.i, i));
        }

        @Override // o.O4.f
        public O4.f m(Drawable drawable) {
            this.d = drawable;
            int i = this.g;
            if (i >= 0) {
                C8249nL2.this.q.m(i);
            }
            return this;
        }

        @Override // o.O4.f
        public O4.f n(O4.g gVar) {
            this.b = gVar;
            return this;
        }

        @Override // o.O4.f
        public O4.f o(Object obj) {
            this.c = obj;
            return this;
        }

        @Override // o.O4.f
        public O4.f p(int i) {
            return q(C8249nL2.this.i.getResources().getText(i));
        }

        @Override // o.O4.f
        public O4.f q(CharSequence charSequence) {
            this.e = charSequence;
            int i = this.g;
            if (i >= 0) {
                C8249nL2.this.q.m(i);
            }
            return this;
        }

        public O4.g r() {
            return this.b;
        }

        public void s(int i) {
            this.g = i;
        }
    }

    public C8249nL2(Activity activity, boolean z) {
        this.k = activity;
        View decorView = activity.getWindow().getDecorView();
        P0(decorView);
        if (z) {
            return;
        }
        this.p = decorView.findViewById(16908290);
    }

    public static boolean E0(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (!z && !z2) {
            return true;
        }
        return false;
    }

    @Override // o.O4
    public CharSequence A() {
        return this.n.getTitle();
    }

    @Override // o.O4
    public void A0(CharSequence charSequence) {
        this.n.setWindowTitle(charSequence);
    }

    @Override // o.O4
    public void B() {
        if (!this.D) {
            this.D = true;
            T0(false);
        }
    }

    @Override // o.O4
    public void B0() {
        if (this.D) {
            this.D = false;
            T0(false);
        }
    }

    @Override // o.O4
    public T4 C0(T4.a aVar) {
        d dVar = this.v;
        if (dVar != null) {
            dVar.c();
        }
        this.l.setHideOnContentScrollEnabled(false);
        this.f823o.t();
        d dVar2 = new d(this.f823o.getContext(), aVar);
        if (dVar2.u()) {
            this.v = dVar2;
            dVar2.k();
            this.f823o.q(dVar2);
            D0(true);
            return dVar2;
        }
        return null;
    }

    @Override // o.O4
    public boolean D() {
        return this.l.B();
    }

    public void D0(boolean z) {
        ZH2 t;
        ZH2 n;
        if (z) {
            S0();
        } else {
            O0();
        }
        if (R0()) {
            if (z) {
                n = this.n.t(4, 100L);
                t = this.f823o.n(0, 200L);
            } else {
                t = this.n.t(0, 200L);
                n = this.f823o.n(8, 100L);
            }
            C5052aI2 c5052aI2 = new C5052aI2();
            c5052aI2.d(n, t);
            c5052aI2.h();
        } else if (z) {
            this.n.setVisibility(4);
            this.f823o.setVisibility(0);
        } else {
            this.n.setVisibility(0);
            this.f823o.setVisibility(8);
        }
    }

    @Override // o.O4
    public boolean E() {
        int q = q();
        if (this.G) {
            if (q == 0 || r() < q) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.O4
    public boolean F() {
        InterfaceC10728xW interfaceC10728xW = this.n;
        if (interfaceC10728xW != null && interfaceC10728xW.m()) {
            return true;
        }
        return false;
    }

    public final void F0() {
        if (this.s != null) {
            R(null);
        }
        this.r.clear();
        androidx.appcompat.widget.e eVar = this.q;
        if (eVar != null) {
            eVar.k();
        }
        this.t = -1;
    }

    @Override // o.O4
    public O4.f G() {
        return new e();
    }

    public void G0() {
        T4.a aVar = this.x;
        if (aVar != null) {
            aVar.b(this.w);
            this.w = null;
            this.x = null;
        }
    }

    @Override // o.O4
    public void H(Configuration configuration) {
        Q0(R4.b(this.i).g());
    }

    public final void H0(O4.f fVar, int i) {
        e eVar = (e) fVar;
        if (eVar.r() != null) {
            eVar.s(i);
            this.r.add(i, eVar);
            int size = this.r.size();
            while (true) {
                i++;
                if (i < size) {
                    this.r.get(i).s(i);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    public void I0(boolean z) {
        View view;
        int[] iArr;
        C5052aI2 c5052aI2 = this.H;
        if (c5052aI2 != null) {
            c5052aI2.a();
        }
        if (this.B == 0 && (this.I || z)) {
            this.m.setAlpha(1.0f);
            this.m.setTransitioning(true);
            C5052aI2 c5052aI22 = new C5052aI2();
            float f = -this.m.getHeight();
            if (z) {
                this.m.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            ZH2 A = C6516gH2.h(this.m).A(f);
            A.w(this.M);
            c5052aI22.c(A);
            if (this.C && (view = this.p) != null) {
                c5052aI22.c(C6516gH2.h(view).A(f));
            }
            c5052aI22.f(O);
            c5052aI22.e(250L);
            c5052aI22.g(this.K);
            this.H = c5052aI22;
            c5052aI22.h();
            return;
        }
        this.K.b(null);
    }

    @Override // o.O4
    public boolean J(int i, KeyEvent keyEvent) {
        Menu e2;
        int i2;
        d dVar = this.v;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        e2.setQwertyMode(z);
        return e2.performShortcut(i, keyEvent, 0);
    }

    public void J0(boolean z) {
        View view;
        View view2;
        int[] iArr;
        C5052aI2 c5052aI2 = this.H;
        if (c5052aI2 != null) {
            c5052aI2.a();
        }
        this.m.setVisibility(0);
        if (this.B == 0 && (this.I || z)) {
            this.m.setTranslationY(0.0f);
            float f = -this.m.getHeight();
            if (z) {
                this.m.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.m.setTranslationY(f);
            C5052aI2 c5052aI22 = new C5052aI2();
            ZH2 A = C6516gH2.h(this.m).A(0.0f);
            A.w(this.M);
            c5052aI22.c(A);
            if (this.C && (view2 = this.p) != null) {
                view2.setTranslationY(f);
                c5052aI22.c(C6516gH2.h(this.p).A(0.0f));
            }
            c5052aI22.f(P);
            c5052aI22.e(250L);
            c5052aI22.g(this.L);
            this.H = c5052aI22;
            c5052aI22.h();
        } else {
            this.m.setAlpha(1.0f);
            this.m.setTranslationY(0.0f);
            if (this.C && (view = this.p) != null) {
                view.setTranslationY(0.0f);
            }
            this.L.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.l;
        if (actionBarOverlayLayout != null) {
            C6516gH2.C1(actionBarOverlayLayout);
        }
    }

    public final void K0() {
        if (this.q != null) {
            return;
        }
        androidx.appcompat.widget.e eVar = new androidx.appcompat.widget.e(this.i);
        if (this.A) {
            eVar.setVisibility(0);
            this.n.F(eVar);
        } else {
            if (t() == 2) {
                eVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.l;
                if (actionBarOverlayLayout != null) {
                    C6516gH2.C1(actionBarOverlayLayout);
                }
            } else {
                eVar.setVisibility(8);
            }
            this.m.setTabContainer(eVar);
        }
        this.q = eVar;
    }

    public final InterfaceC10728xW L0(View view) {
        String str;
        if (view instanceof InterfaceC10728xW) {
            return (InterfaceC10728xW) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    @Override // o.O4
    public void M() {
        F0();
    }

    public boolean M0() {
        return this.n.b();
    }

    @Override // o.O4
    public void N(O4.d dVar) {
        this.z.remove(dVar);
    }

    public boolean N0() {
        return this.n.j();
    }

    @Override // o.O4
    public void O(O4.f fVar) {
        P(fVar.d());
    }

    public final void O0() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T0(false);
        }
    }

    @Override // o.O4
    public void P(int i) {
        int i2;
        e eVar;
        if (this.q != null) {
            e eVar2 = this.s;
            if (eVar2 != null) {
                i2 = eVar2.d();
            } else {
                i2 = this.t;
            }
            this.q.l(i);
            e remove = this.r.remove(i);
            if (remove != null) {
                remove.s(-1);
            }
            int size = this.r.size();
            for (int i3 = i; i3 < size; i3++) {
                this.r.get(i3).s(i3);
            }
            if (i2 == i) {
                if (this.r.isEmpty()) {
                    eVar = null;
                } else {
                    eVar = this.r.get(Math.max(0, i - 1));
                }
                R(eVar);
            }
        }
    }

    public final void P0(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(OL1.g.x);
        this.l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.n = L0(view.findViewById(OL1.g.a));
        this.f823o = (ActionBarContextView) view.findViewById(OL1.g.h);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(OL1.g.c);
        this.m = actionBarContainer;
        InterfaceC10728xW interfaceC10728xW = this.n;
        if (interfaceC10728xW != null && this.f823o != null && actionBarContainer != null) {
            this.i = interfaceC10728xW.getContext();
            if ((this.n.Q() & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.u = true;
            }
            R4 b2 = R4.b(this.i);
            if (!b2.a() && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            l0(z2);
            Q0(b2.g());
            TypedArray obtainStyledAttributes = this.i.obtainStyledAttributes(null, OL1.m.a, OL1.b.f, 0);
            if (obtainStyledAttributes.getBoolean(OL1.m.p, false)) {
                g0(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(OL1.m.n, 0);
            if (dimensionPixelSize != 0) {
                e0(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    @Override // o.O4
    public boolean Q() {
        ViewGroup v = this.n.v();
        if (v != null && !v.hasFocus()) {
            v.requestFocus();
            return true;
        }
        return false;
    }

    public final void Q0(boolean z) {
        boolean z2;
        boolean z3;
        this.A = z;
        if (!z) {
            this.n.F(null);
            this.m.setTabContainer(this.q);
        } else {
            this.m.setTabContainer(null);
            this.n.F(this.q);
        }
        boolean z4 = true;
        if (t() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        androidx.appcompat.widget.e eVar = this.q;
        if (eVar != null) {
            if (z2) {
                eVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.l;
                if (actionBarOverlayLayout != null) {
                    C6516gH2.C1(actionBarOverlayLayout);
                }
            } else {
                eVar.setVisibility(8);
            }
        }
        InterfaceC10728xW interfaceC10728xW = this.n;
        if (!this.A && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        interfaceC10728xW.B(z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.l;
        if (this.A || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z4);
    }

    @Override // o.O4
    public void R(O4.f fVar) {
        androidx.fragment.app.j jVar;
        int i = -1;
        if (t() != 2) {
            if (fVar != null) {
                i = fVar.d();
            }
            this.t = i;
            return;
        }
        if ((this.k instanceof ActivityC4864Yy0) && !this.n.v().isInEditMode()) {
            jVar = ((ActivityC4864Yy0) this.k).W0().u().s();
        } else {
            jVar = null;
        }
        e eVar = this.s;
        if (eVar == fVar) {
            if (eVar != null) {
                eVar.r().c(this.s, jVar);
                this.q.c(fVar.d());
            }
        } else {
            androidx.appcompat.widget.e eVar2 = this.q;
            if (fVar != null) {
                i = fVar.d();
            }
            eVar2.setTabSelected(i);
            e eVar3 = this.s;
            if (eVar3 != null) {
                eVar3.r().b(this.s, jVar);
            }
            e eVar4 = (e) fVar;
            this.s = eVar4;
            if (eVar4 != null) {
                eVar4.r().a(this.s, jVar);
            }
        }
        if (jVar != null && !jVar.w()) {
            jVar.m();
        }
    }

    public final boolean R0() {
        return this.m.isLaidOut();
    }

    @Override // o.O4
    public void S(Drawable drawable) {
        this.m.setPrimaryBackground(drawable);
    }

    public final void S0() {
        if (!this.F) {
            this.F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            T0(false);
        }
    }

    @Override // o.O4
    public void T(int i) {
        U(LayoutInflater.from(z()).inflate(i, this.n.v(), false));
    }

    public final void T0(boolean z) {
        if (E0(this.D, this.E, this.F)) {
            if (!this.G) {
                this.G = true;
                J0(z);
            }
        } else if (this.G) {
            this.G = false;
            I0(z);
        }
    }

    @Override // o.O4
    public void U(View view) {
        this.n.R(view);
    }

    @Override // o.O4
    public void V(View view, O4.b bVar) {
        view.setLayoutParams(bVar);
        this.n.R(view);
    }

    @Override // o.O4
    public void W(boolean z) {
        if (!this.u) {
            X(z);
        }
    }

    @Override // o.O4
    public void X(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        Z(i, 4);
    }

    @Override // o.O4
    public void Y(int i) {
        if ((i & 4) != 0) {
            this.u = true;
        }
        this.n.n(i);
    }

    @Override // o.O4
    public void Z(int i, int i2) {
        int Q2 = this.n.Q();
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        this.n.n((i & i2) | ((~i2) & Q2));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.E) {
            this.E = false;
            T0(true);
        }
    }

    @Override // o.O4
    public void a0(boolean z) {
        int i;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        Z(i, 16);
    }

    @Override // o.O4
    public void b0(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        Z(i, 2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z) {
        this.C = z;
    }

    @Override // o.O4
    public void c0(boolean z) {
        int i;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        Z(i, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (!this.E) {
            this.E = true;
            T0(true);
        }
    }

    @Override // o.O4
    public void d0(boolean z) {
        Z(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        C5052aI2 c5052aI2 = this.H;
        if (c5052aI2 != null) {
            c5052aI2.a();
            this.H = null;
        }
    }

    @Override // o.O4
    public void e0(float f) {
        C6516gH2.W1(this.m, f);
    }

    @Override // o.O4
    public void f(O4.d dVar) {
        this.z.add(dVar);
    }

    @Override // o.O4
    public void f0(int i) {
        if (i != 0 && !this.l.C()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.l.setActionBarHideOffset(i);
    }

    @Override // o.O4
    public void g(O4.f fVar) {
        j(fVar, this.r.isEmpty());
    }

    @Override // o.O4
    public void g0(boolean z) {
        if (z && !this.l.C()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.J = z;
        this.l.setHideOnContentScrollEnabled(z);
    }

    @Override // o.O4
    public void h(O4.f fVar, int i) {
        i(fVar, i, this.r.isEmpty());
    }

    @Override // o.O4
    public void h0(int i) {
        this.n.y(i);
    }

    @Override // o.O4
    public void i(O4.f fVar, int i, boolean z) {
        K0();
        this.q.a(fVar, i, z);
        H0(fVar, i);
        if (z) {
            R(fVar);
        }
    }

    @Override // o.O4
    public void i0(CharSequence charSequence) {
        this.n.o(charSequence);
    }

    @Override // o.O4
    public void j(O4.f fVar, boolean z) {
        K0();
        this.q.b(fVar, z);
        H0(fVar, this.r.size());
        if (z) {
            R(fVar);
        }
    }

    @Override // o.O4
    public void j0(int i) {
        this.n.L(i);
    }

    @Override // o.O4
    public void k0(Drawable drawable) {
        this.n.T(drawable);
    }

    @Override // o.O4
    public boolean l() {
        InterfaceC10728xW interfaceC10728xW = this.n;
        if (interfaceC10728xW != null && interfaceC10728xW.l()) {
            this.n.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // o.O4
    public void l0(boolean z) {
        this.n.w(z);
    }

    @Override // o.O4
    public void m(boolean z) {
        if (z != this.y) {
            this.y = z;
            int size = this.z.size();
            for (int i = 0; i < size; i++) {
                this.z.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    @Override // o.O4
    public void m0(int i) {
        this.n.setIcon(i);
    }

    @Override // o.O4
    public View n() {
        return this.n.E();
    }

    @Override // o.O4
    public void n0(Drawable drawable) {
        this.n.setIcon(drawable);
    }

    @Override // o.O4
    public int o() {
        return this.n.Q();
    }

    @Override // o.O4
    public void o0(SpinnerAdapter spinnerAdapter, O4.e eVar) {
        this.n.N(spinnerAdapter, new C2769Do1(eVar));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i) {
        this.B = i;
    }

    @Override // o.O4
    public float p() {
        return C6516gH2.V(this.m);
    }

    @Override // o.O4
    public void p0(int i) {
        this.n.setLogo(i);
    }

    @Override // o.O4
    public int q() {
        return this.m.getHeight();
    }

    @Override // o.O4
    public void q0(Drawable drawable) {
        this.n.G(drawable);
    }

    @Override // o.O4
    public int r() {
        return this.l.getActionBarHideOffset();
    }

    @Override // o.O4
    public void r0(int i) {
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout;
        int s = this.n.s();
        if (s == 2) {
            this.t = u();
            R(null);
            this.q.setVisibility(8);
        }
        if (s != i && !this.A && (actionBarOverlayLayout = this.l) != null) {
            C6516gH2.C1(actionBarOverlayLayout);
        }
        this.n.u(i);
        boolean z2 = false;
        if (i == 2) {
            K0();
            this.q.setVisibility(0);
            int i2 = this.t;
            if (i2 != -1) {
                s0(i2);
                this.t = -1;
            }
        }
        InterfaceC10728xW interfaceC10728xW = this.n;
        if (i == 2 && !this.A) {
            z = true;
        } else {
            z = false;
        }
        interfaceC10728xW.B(z);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.l;
        if (i == 2 && !this.A) {
            z2 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    @Override // o.O4
    public int s() {
        int s = this.n.s();
        if (s != 1) {
            if (s != 2) {
                return 0;
            }
            return this.r.size();
        }
        return this.n.A();
    }

    @Override // o.O4
    public void s0(int i) {
        int s = this.n.s();
        if (s != 1) {
            if (s == 2) {
                R(this.r.get(i));
                return;
            }
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.n.q(i);
    }

    @Override // o.O4
    public int t() {
        return this.n.s();
    }

    @Override // o.O4
    public void t0(boolean z) {
        C5052aI2 c5052aI2;
        this.I = z;
        if (!z && (c5052aI2 = this.H) != null) {
            c5052aI2.a();
        }
    }

    @Override // o.O4
    public int u() {
        e eVar;
        int s = this.n.s();
        if (s != 1) {
            if (s != 2 || (eVar = this.s) == null) {
                return -1;
            }
            return eVar.d();
        }
        return this.n.x();
    }

    @Override // o.O4
    public O4.f v() {
        return this.s;
    }

    @Override // o.O4
    public void v0(Drawable drawable) {
        this.m.setStackedBackground(drawable);
    }

    @Override // o.O4
    public CharSequence w() {
        return this.n.P();
    }

    @Override // o.O4
    public void w0(int i) {
        x0(this.i.getString(i));
    }

    @Override // o.O4
    public O4.f x(int i) {
        return this.r.get(i);
    }

    @Override // o.O4
    public void x0(CharSequence charSequence) {
        this.n.p(charSequence);
    }

    @Override // o.O4
    public int y() {
        return this.r.size();
    }

    @Override // o.O4
    public void y0(int i) {
        z0(this.i.getString(i));
    }

    @Override // o.O4
    public Context z() {
        if (this.j == null) {
            TypedValue typedValue = new TypedValue();
            this.i.getTheme().resolveAttribute(OL1.b.k, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.j = new ContextThemeWrapper(this.i, i);
            } else {
                this.j = this.i;
            }
        }
        return this.j;
    }

    @Override // o.O4
    public void z0(CharSequence charSequence) {
        this.n.setTitle(charSequence);
    }

    public C8249nL2(Dialog dialog) {
        P0(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    /* renamed from: o.nL2$d */
    /* loaded from: classes.dex */
    public class d extends T4 implements e.a {
        public final androidx.appcompat.view.menu.e Y0;
        public final Context Z;
        public T4.a Z0;
        public WeakReference<View> a1;

        public d(Context context, T4.a aVar) {
            this.Z = context;
            this.Z0 = aVar;
            androidx.appcompat.view.menu.e a0 = new androidx.appcompat.view.menu.e(context).a0(1);
            this.Y0 = a0;
            a0.Y(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            T4.a aVar = this.Z0;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.Z0 == null) {
                return;
            }
            k();
            C8249nL2.this.f823o.o();
        }

        @Override // o.T4
        public void c() {
            C8249nL2 c8249nL2 = C8249nL2.this;
            if (c8249nL2.v != this) {
                return;
            }
            if (!C8249nL2.E0(c8249nL2.D, c8249nL2.E, false)) {
                C8249nL2 c8249nL22 = C8249nL2.this;
                c8249nL22.w = this;
                c8249nL22.x = this.Z0;
            } else {
                this.Z0.b(this);
            }
            this.Z0 = null;
            C8249nL2.this.D0(false);
            C8249nL2.this.f823o.p();
            C8249nL2 c8249nL23 = C8249nL2.this;
            c8249nL23.l.setHideOnContentScrollEnabled(c8249nL23.J);
            C8249nL2.this.v = null;
        }

        @Override // o.T4
        public View d() {
            WeakReference<View> weakReference = this.a1;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // o.T4
        public Menu e() {
            return this.Y0;
        }

        @Override // o.T4
        public MenuInflater f() {
            return new C9796th2(this.Z);
        }

        @Override // o.T4
        public CharSequence g() {
            return C8249nL2.this.f823o.getSubtitle();
        }

        @Override // o.T4
        public CharSequence i() {
            return C8249nL2.this.f823o.getTitle();
        }

        @Override // o.T4
        public void k() {
            if (C8249nL2.this.v != this) {
                return;
            }
            this.Y0.n0();
            try {
                this.Z0.d(this, this.Y0);
            } finally {
                this.Y0.m0();
            }
        }

        @Override // o.T4
        public boolean l() {
            return C8249nL2.this.f823o.s();
        }

        @Override // o.T4
        public void n(View view) {
            C8249nL2.this.f823o.setCustomView(view);
            this.a1 = new WeakReference<>(view);
        }

        @Override // o.T4
        public void o(int i) {
            p(C8249nL2.this.i.getResources().getString(i));
        }

        @Override // o.T4
        public void p(CharSequence charSequence) {
            C8249nL2.this.f823o.setSubtitle(charSequence);
        }

        @Override // o.T4
        public void r(int i) {
            s(C8249nL2.this.i.getResources().getString(i));
        }

        @Override // o.T4
        public void s(CharSequence charSequence) {
            C8249nL2.this.f823o.setTitle(charSequence);
        }

        @Override // o.T4
        public void t(boolean z) {
            super.t(z);
            C8249nL2.this.f823o.setTitleOptional(z);
        }

        public boolean u() {
            this.Y0.n0();
            try {
                return this.Z0.a(this, this.Y0);
            } finally {
                this.Y0.m0();
            }
        }

        public boolean x(androidx.appcompat.view.menu.m mVar) {
            if (this.Z0 == null) {
                return false;
            }
            if (!mVar.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.i(C8249nL2.this.z(), mVar).l();
            return true;
        }

        public void w(androidx.appcompat.view.menu.m mVar) {
        }

        public void v(androidx.appcompat.view.menu.e eVar, boolean z) {
        }
    }

    @Override // o.O4
    public void u0(Drawable drawable) {
    }

    public C8249nL2(View view) {
        P0(view);
    }
}
