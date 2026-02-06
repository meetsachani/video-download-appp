package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import o.LayoutInflater$Factory2C6093ec;
import o.O4;

/* renamed from: o.oq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8611oq2 extends O4 {
    public final InterfaceC10728xW i;
    public final Window.Callback j;
    public final LayoutInflater$Factory2C6093ec.i k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<O4.d> f832o = new ArrayList<>();
    public final Runnable p = new a();
    public final Toolbar.h q;

    /* renamed from: o.oq2$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8611oq2.this.E0();
        }
    }

    /* renamed from: o.oq2$b */
    /* loaded from: classes.dex */
    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C8611oq2.this.j.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: o.oq2$c */
    /* loaded from: classes.dex */
    public final class c implements j.a {
        public boolean X;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (this.X) {
                return;
            }
            this.X = true;
            C8611oq2.this.i.D();
            C8611oq2.this.j.onPanelClosed(108, eVar);
            this.X = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            C8611oq2.this.j.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: o.oq2$d */
    /* loaded from: classes.dex */
    public final class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (C8611oq2.this.i.h()) {
                C8611oq2.this.j.onPanelClosed(108, eVar);
            } else if (C8611oq2.this.j.onPreparePanel(0, null, eVar)) {
                C8611oq2.this.j.onMenuOpened(108, eVar);
            }
        }
    }

    /* renamed from: o.oq2$e */
    /* loaded from: classes.dex */
    public class e implements LayoutInflater$Factory2C6093ec.i {
        public e() {
        }

        @Override // o.LayoutInflater$Factory2C6093ec.i
        public boolean a(int i) {
            if (i == 0) {
                C8611oq2 c8611oq2 = C8611oq2.this;
                if (!c8611oq2.l) {
                    c8611oq2.i.i();
                    C8611oq2.this.l = true;
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // o.LayoutInflater$Factory2C6093ec.i
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C8611oq2.this.i.getContext());
            }
            return null;
        }
    }

    public C8611oq2(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.q = bVar;
        C10907yF1.l(toolbar);
        androidx.appcompat.widget.g gVar = new androidx.appcompat.widget.g(toolbar, false);
        this.i = gVar;
        this.j = (Window.Callback) C10907yF1.l(callback);
        gVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        gVar.setWindowTitle(charSequence);
        this.k = new e();
    }

    @Override // o.O4
    public CharSequence A() {
        return this.i.getTitle();
    }

    @Override // o.O4
    public void A0(CharSequence charSequence) {
        this.i.setWindowTitle(charSequence);
    }

    @Override // o.O4
    public void B() {
        this.i.setVisibility(8);
    }

    @Override // o.O4
    public void B0() {
        this.i.setVisibility(0);
    }

    @Override // o.O4
    public boolean C() {
        this.i.v().removeCallbacks(this.p);
        C6516gH2.w1(this.i.v(), this.p);
        return true;
    }

    public final Menu D0() {
        if (!this.m) {
            this.i.M(new c(), new d());
            this.m = true;
        }
        return this.i.r();
    }

    @Override // o.O4
    public boolean E() {
        if (this.i.c() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E0() {
        androidx.appcompat.view.menu.e eVar;
        Menu D0 = D0();
        if (D0 instanceof androidx.appcompat.view.menu.e) {
            eVar = (androidx.appcompat.view.menu.e) D0;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.n0();
        }
        try {
            D0.clear();
            if (this.j.onCreatePanelMenu(0, D0)) {
                if (!this.j.onPreparePanel(0, null, D0)) {
                }
                if (eVar == null) {
                    eVar.m0();
                    return;
                }
                return;
            }
            D0.clear();
            if (eVar == null) {
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.m0();
            }
            throw th;
        }
    }

    @Override // o.O4
    public boolean F() {
        return super.F();
    }

    @Override // o.O4
    public O4.f G() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public void H(Configuration configuration) {
        super.H(configuration);
    }

    @Override // o.O4
    public void I() {
        this.i.v().removeCallbacks(this.p);
    }

    @Override // o.O4
    public boolean J(int i, KeyEvent keyEvent) {
        int i2;
        Menu D0 = D0();
        if (D0 == null) {
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
        D0.setQwertyMode(z);
        return D0.performShortcut(i, keyEvent, 0);
    }

    @Override // o.O4
    public boolean K(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            L();
        }
        return true;
    }

    @Override // o.O4
    public boolean L() {
        return this.i.f();
    }

    @Override // o.O4
    public void M() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public void N(O4.d dVar) {
        this.f832o.remove(dVar);
    }

    @Override // o.O4
    public void O(O4.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public void P(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public boolean Q() {
        ViewGroup v = this.i.v();
        if (v != null && !v.hasFocus()) {
            v.requestFocus();
            return true;
        }
        return false;
    }

    @Override // o.O4
    public void R(O4.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public void S(Drawable drawable) {
        this.i.a(drawable);
    }

    @Override // o.O4
    public void T(int i) {
        U(LayoutInflater.from(this.i.getContext()).inflate(i, this.i.v(), false));
    }

    @Override // o.O4
    public void U(View view) {
        V(view, new O4.b(-2, -2));
    }

    @Override // o.O4
    public void V(View view, O4.b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.i.R(view);
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
        Z(i, -1);
    }

    @Override // o.O4
    public void Z(int i, int i2) {
        this.i.n((i & i2) | ((~i2) & this.i.Q()));
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

    @Override // o.O4
    public void d0(boolean z) {
        Z(z ? 1 : 0, 1);
    }

    @Override // o.O4
    public void e0(float f) {
        C6516gH2.W1(this.i.v(), f);
    }

    @Override // o.O4
    public void f(O4.d dVar) {
        this.f832o.add(dVar);
    }

    @Override // o.O4
    public void g(O4.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public void h(O4.f fVar, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public void h0(int i) {
        this.i.y(i);
    }

    @Override // o.O4
    public void i(O4.f fVar, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public void i0(CharSequence charSequence) {
        this.i.o(charSequence);
    }

    @Override // o.O4
    public void j(O4.f fVar, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public void j0(int i) {
        this.i.L(i);
    }

    @Override // o.O4
    public boolean k() {
        return this.i.e();
    }

    @Override // o.O4
    public void k0(Drawable drawable) {
        this.i.T(drawable);
    }

    @Override // o.O4
    public boolean l() {
        if (this.i.l()) {
            this.i.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // o.O4
    public void m(boolean z) {
        if (z != this.n) {
            this.n = z;
            int size = this.f832o.size();
            for (int i = 0; i < size; i++) {
                this.f832o.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    @Override // o.O4
    public void m0(int i) {
        this.i.setIcon(i);
    }

    @Override // o.O4
    public View n() {
        return this.i.E();
    }

    @Override // o.O4
    public void n0(Drawable drawable) {
        this.i.setIcon(drawable);
    }

    @Override // o.O4
    public int o() {
        return this.i.Q();
    }

    @Override // o.O4
    public void o0(SpinnerAdapter spinnerAdapter, O4.e eVar) {
        this.i.N(spinnerAdapter, new C2769Do1(eVar));
    }

    @Override // o.O4
    public float p() {
        return C6516gH2.V(this.i.v());
    }

    @Override // o.O4
    public void p0(int i) {
        this.i.setLogo(i);
    }

    @Override // o.O4
    public int q() {
        return this.i.getHeight();
    }

    @Override // o.O4
    public void q0(Drawable drawable) {
        this.i.G(drawable);
    }

    @Override // o.O4
    public void r0(int i) {
        if (i != 2) {
            this.i.u(i);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    @Override // o.O4
    public int s() {
        return 0;
    }

    @Override // o.O4
    public void s0(int i) {
        if (this.i.s() == 1) {
            this.i.q(i);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    @Override // o.O4
    public int t() {
        return 0;
    }

    @Override // o.O4
    public int u() {
        return -1;
    }

    @Override // o.O4
    public O4.f v() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public CharSequence w() {
        return this.i.P();
    }

    @Override // o.O4
    public void w0(int i) {
        CharSequence charSequence;
        InterfaceC10728xW interfaceC10728xW = this.i;
        if (i != 0) {
            charSequence = interfaceC10728xW.getContext().getText(i);
        } else {
            charSequence = null;
        }
        interfaceC10728xW.p(charSequence);
    }

    @Override // o.O4
    public O4.f x(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // o.O4
    public void x0(CharSequence charSequence) {
        this.i.p(charSequence);
    }

    @Override // o.O4
    public int y() {
        return 0;
    }

    @Override // o.O4
    public void y0(int i) {
        CharSequence charSequence;
        InterfaceC10728xW interfaceC10728xW = this.i;
        if (i != 0) {
            charSequence = interfaceC10728xW.getContext().getText(i);
        } else {
            charSequence = null;
        }
        interfaceC10728xW.setTitle(charSequence);
    }

    @Override // o.O4
    public Context z() {
        return this.i.getContext();
    }

    @Override // o.O4
    public void z0(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // o.O4
    public void W(boolean z) {
    }

    @Override // o.O4
    public void l0(boolean z) {
    }

    @Override // o.O4
    public void t0(boolean z) {
    }

    @Override // o.O4
    public void u0(Drawable drawable) {
    }

    @Override // o.O4
    public void v0(Drawable drawable) {
    }
}
