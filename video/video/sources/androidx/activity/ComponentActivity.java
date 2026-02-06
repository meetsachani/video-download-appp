package androidx.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import androidx.savedstate.a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.A5;
import o.AA0;
import o.AbstractC5244b6;
import o.AbstractC6553gR;
import o.ActivityC8964qI;
import o.C10434wI2;
import o.C3946Pm1;
import o.C4248So1;
import o.C5240b5;
import o.C5534cI;
import o.C6399fr2;
import o.C6562gT0;
import o.C7458kA2;
import o.C8334ni1;
import o.C8967qI2;
import o.C8980qM;
import o.C9216rI2;
import o.C9254rS0;
import o.C9329rm1;
import o.C9459sI2;
import o.C9516sY;
import o.C9698tH2;
import o.C9702tI2;
import o.C9796th2;
import o.C9945uI2;
import o.C9998uW1;
import o.CA0;
import o.D30;
import o.EY0;
import o.FA0;
import o.GH2;
import o.H5;
import o.HH2;
import o.I5;
import o.InterfaceC10042ui1;
import o.InterfaceC10929yL;
import o.InterfaceC3294Iu1;
import o.InterfaceC3587Lu1;
import o.InterfaceC3783Nu1;
import o.InterfaceC4345To1;
import o.InterfaceC5201av1;
import o.InterfaceC5444bv1;
import o.InterfaceC5486c6;
import o.InterfaceC5928dv1;
import o.InterfaceC7587ki1;
import o.InterfaceC8386nv1;
import o.InterfaceC8737pM;
import o.InterfaceC8873pv1;
import o.InterfaceC9150r20;
import o.KZ0;
import o.NX1;
import o.O5;
import o.OX1;
import o.P5;
import o.WY0;
import o.X5;
import o.XC1;

/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC8964qI implements InterfaceC8737pM, KZ0, HH2, androidx.lifecycle.e, OX1, InterfaceC3294Iu1, InterfaceC4345To1, InterfaceC5486c6, I5, InterfaceC3587Lu1, InterfaceC8386nv1, InterfaceC5444bv1, InterfaceC5201av1, InterfaceC5928dv1, InterfaceC8873pv1, InterfaceC7587ki1, CA0 {
    public static final a r1 = new a(null);
    public static final String s1 = "android:support:activity-result";
    public final C8334ni1 Y0;
    public final C8980qM Z;
    public final NX1 Z0;
    public GH2 a1;
    public final c b1;
    public final EY0 c1;
    public int d1;
    public final AtomicInteger e1;
    public final AbstractC5244b6 f1;
    public final CopyOnWriteArrayList<InterfaceC10929yL<Configuration>> g1;
    public final CopyOnWriteArrayList<InterfaceC10929yL<Integer>> h1;
    public final CopyOnWriteArrayList<InterfaceC10929yL<Intent>> i1;
    public final CopyOnWriteArrayList<InterfaceC10929yL<C9329rm1>> j1;
    public final CopyOnWriteArrayList<InterfaceC10929yL<XC1>> k1;
    public final CopyOnWriteArrayList<Runnable> l1;
    public boolean m1;
    public boolean n1;
    public final EY0 o1;
    public final EY0 p1;
    public final EY0 q1;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public Object a;
        public GH2 b;

        public final Object a() {
            return this.a;
        }

        public final GH2 b() {
            return this.b;
        }

        public final void c(Object obj) {
            this.a = obj;
        }

        public final void d(GH2 gh2) {
            this.b = gh2;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Executor {
        void I1(View view);

        void u0();
    }

    /* loaded from: classes.dex */
    public final class d implements c, ViewTreeObserver.OnDrawListener, Runnable {
        public final long X = SystemClock.uptimeMillis() + 10000;
        public Runnable Y;
        public boolean Z;

        public d() {
        }

        public static final void c(d dVar) {
            Runnable runnable = dVar.Y;
            if (runnable != null) {
                C6562gT0.m(runnable);
                runnable.run();
                dVar.Y = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.c
        public void I1(View view) {
            C6562gT0.p(view, C9698tH2.A);
            if (!this.Z) {
                this.Z = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public final Runnable d() {
            return this.Y;
        }

        public final long e() {
            return this.X;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C6562gT0.p(runnable, "runnable");
            this.Y = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            C6562gT0.o(decorView, "getDecorView(...)");
            if (this.Z) {
                if (C6562gT0.g(Looper.myLooper(), Looper.getMainLooper())) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new Runnable() { // from class: o.rI
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.d.c(ComponentActivity.d.this);
                }
            });
        }

        public final boolean f() {
            return this.Z;
        }

        public final void g(Runnable runnable) {
            this.Y = runnable;
        }

        public final void h(boolean z) {
            this.Z = z;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.Y;
            if (runnable != null) {
                runnable.run();
                this.Y = null;
                if (ComponentActivity.this.g().e()) {
                    this.Z = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.X) {
                this.Z = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.c
        public void u0() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends AbstractC5244b6 {
        public e() {
        }

        public static final void u(e eVar, int i, O5.a aVar) {
            eVar.g(i, aVar.a());
        }

        public static final void v(e eVar, int i, IntentSender.SendIntentException sendIntentException) {
            eVar.f(i, 0, new Intent().setAction(P5.n.b).putExtra(P5.n.d, sendIntentException));
        }

        @Override // o.AbstractC5244b6
        public <I, O> void k(final int i, O5<I, O> o5, I i2, A5 a5) {
            Bundle bundle;
            final int i3;
            C6562gT0.p(o5, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final O5.a<O> b = o5.b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.sI
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.e.u(ComponentActivity.e.this, i, b);
                    }
                });
                return;
            }
            Intent a = o5.a(componentActivity, i2);
            if (a.getExtras() != null) {
                Bundle extras = a.getExtras();
                C6562gT0.m(extras);
                if (extras.getClassLoader() == null) {
                    a.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (a.hasExtra(P5.m.b)) {
                bundle = a.getBundleExtra(P5.m.b);
                a.removeExtra(P5.m.b);
            } else if (a5 != null) {
                bundle = a5.p();
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            if (C6562gT0.g(P5.k.b, a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra(P5.k.c);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C5240b5.M(componentActivity, stringArrayExtra, i);
            } else if (C6562gT0.g(P5.n.b, a.getAction())) {
                C9254rS0 c9254rS0 = (C9254rS0) a.getParcelableExtra(P5.n.c);
                try {
                    C6562gT0.m(c9254rS0);
                    i3 = i;
                    try {
                        C5240b5.U(componentActivity, c9254rS0.d(), i3, c9254rS0.a(), c9254rS0.b(), c9254rS0.c(), 0, bundle2);
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    } catch (IntentSender.SendIntentException e) {
                        e = e;
                        final IntentSender.SendIntentException sendIntentException = e;
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.tI
                            @Override // java.lang.Runnable
                            public final void run() {
                                ComponentActivity.e.v(ComponentActivity.e.this, i3, sendIntentException);
                            }
                        });
                    }
                } catch (IntentSender.SendIntentException e2) {
                    e = e2;
                    i3 = i;
                }
            } else {
                C5240b5.T(componentActivity, a, i, bundle2);
            }
        }
    }

    public ComponentActivity() {
        this.Z = new C8980qM();
        this.Y0 = new C8334ni1(new Runnable() { // from class: o.hI
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.L0(ComponentActivity.this);
            }
        });
        NX1 a2 = NX1.d.a(this);
        this.Z0 = a2;
        this.b1 = C0();
        this.c1 = WY0.b(new FA0() { // from class: o.iI
            @Override // o.FA0
            public final Object invoke() {
                AA0 F0;
                F0 = ComponentActivity.F0(ComponentActivity.this);
                return F0;
            }
        });
        this.e1 = new AtomicInteger();
        this.f1 = new e();
        this.g1 = new CopyOnWriteArrayList<>();
        this.h1 = new CopyOnWriteArrayList<>();
        this.i1 = new CopyOnWriteArrayList<>();
        this.j1 = new CopyOnWriteArrayList<>();
        this.k1 = new CopyOnWriteArrayList<>();
        this.l1 = new CopyOnWriteArrayList<>();
        this.o1 = WY0.b(new FA0() { // from class: o.jI
            @Override // o.FA0
            public final Object invoke() {
                D30 P0;
                P0 = ComponentActivity.P0(ComponentActivity.this);
                return P0;
            }
        });
        if (b() != null) {
            b().a(new i() { // from class: o.kI
                @Override // androidx.lifecycle.i
                public final void i(KZ0 kz0, f.a aVar) {
                    ComponentActivity.v0(ComponentActivity.this, kz0, aVar);
                }
            });
            b().a(new i() { // from class: o.lI
                @Override // androidx.lifecycle.i
                public final void i(KZ0 kz0, f.a aVar) {
                    ComponentActivity.w0(ComponentActivity.this, kz0, aVar);
                }
            });
            b().a(new i() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.i
                public void i(KZ0 kz0, f.a aVar) {
                    C6562gT0.p(kz0, "source");
                    C6562gT0.p(aVar, "event");
                    ComponentActivity.this.E0();
                    ComponentActivity.this.b().d(this);
                }
            });
            a2.c();
            q.c(this);
            E().j(s1, new a.c() { // from class: o.mI
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    Bundle x0;
                    x0 = ComponentActivity.x0(ComponentActivity.this);
                    return x0;
                }
            });
            D(new InterfaceC3783Nu1() { // from class: o.nI
                @Override // o.InterfaceC3783Nu1
                public final void a(Context context) {
                    ComponentActivity.y0(ComponentActivity.this, context);
                }
            });
            this.p1 = WY0.b(new FA0() { // from class: o.oI
                @Override // o.FA0
                public final Object invoke() {
                    androidx.lifecycle.r D0;
                    D0 = ComponentActivity.D0(ComponentActivity.this);
                    return D0;
                }
            });
            this.q1 = WY0.b(new FA0() { // from class: o.pI
                @Override // o.FA0
                public final Object invoke() {
                    OnBackPressedDispatcher M0;
                    M0 = ComponentActivity.M0(ComponentActivity.this);
                    return M0;
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static final void B0(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "<unused var>");
        C6562gT0.p(aVar, "event");
        if (aVar == f.a.ON_CREATE) {
            OnBackInvokedDispatcher a2 = C5534cI.a(componentActivity);
            C6562gT0.o(a2, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.m(a2);
        }
    }

    public static final r D0(ComponentActivity componentActivity) {
        Bundle bundle;
        Application application = componentActivity.getApplication();
        if (componentActivity.getIntent() != null) {
            bundle = componentActivity.getIntent().getExtras();
        } else {
            bundle = null;
        }
        return new r(application, componentActivity, bundle);
    }

    public static final AA0 F0(final ComponentActivity componentActivity) {
        return new AA0(componentActivity.b1, new FA0() { // from class: o.gI
            @Override // o.FA0
            public final Object invoke() {
                C7458kA2 G0;
                G0 = ComponentActivity.G0(ComponentActivity.this);
                return G0;
            }
        });
    }

    public static final C7458kA2 G0(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return C7458kA2.a;
    }

    public static /* synthetic */ void J0() {
    }

    public static final void L0(ComponentActivity componentActivity) {
        componentActivity.a0();
    }

    public static final OnBackPressedDispatcher M0(final ComponentActivity componentActivity) {
        final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: o.dI
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.N0(ComponentActivity.this);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!C6562gT0.g(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.eI
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.O0(ComponentActivity.this, onBackPressedDispatcher);
                    }
                });
                return onBackPressedDispatcher;
            }
            componentActivity.A0(onBackPressedDispatcher);
        }
        return onBackPressedDispatcher;
    }

    public static final void N0(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (C6562gT0.g(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                return;
            }
            throw e2;
        } catch (NullPointerException e3) {
            if (!C6562gT0.g(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e3;
            }
        }
    }

    public static final void O0(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
        componentActivity.A0(onBackPressedDispatcher);
    }

    public static final D30 P0(ComponentActivity componentActivity) {
        D30 d30 = new D30();
        componentActivity.f().d(d30);
        return d30;
    }

    public static final void v0(ComponentActivity componentActivity, KZ0 kz0, f.a aVar) {
        Window window;
        View peekDecorView;
        C6562gT0.p(kz0, "<unused var>");
        C6562gT0.p(aVar, "event");
        if (aVar == f.a.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }

    public static final void w0(ComponentActivity componentActivity, KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "<unused var>");
        C6562gT0.p(aVar, "event");
        if (aVar == f.a.ON_DESTROY) {
            componentActivity.Z.b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.A().a();
            }
            componentActivity.b1.u0();
        }
    }

    public static final Bundle x0(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.f1.m(bundle);
        return bundle;
    }

    public static final void y0(ComponentActivity componentActivity, Context context) {
        C6562gT0.p(context, "it");
        Bundle b2 = componentActivity.E().b(s1);
        if (b2 != null) {
            componentActivity.f1.l(b2);
        }
    }

    @Override // o.HH2
    public GH2 A() {
        if (getApplication() != null) {
            E0();
            GH2 gh2 = this.a1;
            C6562gT0.m(gh2);
            return gh2;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void A0(final OnBackPressedDispatcher onBackPressedDispatcher) {
        b().a(new i() { // from class: o.fI
            @Override // androidx.lifecycle.i
            public final void i(KZ0 kz0, f.a aVar) {
                ComponentActivity.B0(OnBackPressedDispatcher.this, this, kz0, aVar);
            }
        });
    }

    @Override // o.InterfaceC7587ki1
    public void C(InterfaceC10042ui1 interfaceC10042ui1) {
        C6562gT0.p(interfaceC10042ui1, "provider");
        this.Y0.j(interfaceC10042ui1);
    }

    public final c C0() {
        return new d();
    }

    @Override // o.InterfaceC8737pM
    public final void D(InterfaceC3783Nu1 interfaceC3783Nu1) {
        C6562gT0.p(interfaceC3783Nu1, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.Z.a(interfaceC3783Nu1);
    }

    @Override // o.OX1
    public final androidx.savedstate.a E() {
        return this.Z0.b();
    }

    public final void E0() {
        if (this.a1 == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.a1 = bVar.b();
            }
            if (this.a1 == null) {
                this.a1 = new GH2();
            }
        }
    }

    @Override // o.InterfaceC3587Lu1
    public final void F(InterfaceC10929yL<Configuration> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.g1.add(interfaceC10929yL);
    }

    @Override // o.InterfaceC5928dv1
    public final void G(InterfaceC10929yL<XC1> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.k1.remove(interfaceC10929yL);
    }

    @Override // o.InterfaceC3587Lu1
    public final void H(InterfaceC10929yL<Configuration> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.g1.remove(interfaceC10929yL);
    }

    @InterfaceC9150r20(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object H0() {
        b bVar = (b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final D30 I0() {
        return (D30) this.o1.getValue();
    }

    @Override // o.InterfaceC8386nv1
    public final void J(InterfaceC10929yL<Integer> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.h1.add(interfaceC10929yL);
    }

    @Override // o.InterfaceC5201av1
    public final void K(InterfaceC10929yL<C9329rm1> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.j1.add(interfaceC10929yL);
    }

    public void K0() {
        View decorView = getWindow().getDecorView();
        C6562gT0.o(decorView, "getDecorView(...)");
        C9216rI2.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        C6562gT0.o(decorView2, "getDecorView(...)");
        C10434wI2.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        C6562gT0.o(decorView3, "getDecorView(...)");
        C9945uI2.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        C6562gT0.o(decorView4, "getDecorView(...)");
        C9702tI2.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        C6562gT0.o(decorView5, "getDecorView(...)");
        C8967qI2.b(decorView5, this);
        View decorView6 = getWindow().getDecorView();
        C6562gT0.o(decorView6, "getDecorView(...)");
        C9459sI2.b(decorView6, this);
    }

    @Override // o.InterfaceC5444bv1
    public final void M(InterfaceC10929yL<Intent> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.i1.remove(interfaceC10929yL);
    }

    @Override // o.InterfaceC7587ki1
    public void N(InterfaceC10042ui1 interfaceC10042ui1) {
        C6562gT0.p(interfaceC10042ui1, "provider");
        this.Y0.c(interfaceC10042ui1);
    }

    @Override // o.InterfaceC8737pM
    public final void O(InterfaceC3783Nu1 interfaceC3783Nu1) {
        C6562gT0.p(interfaceC3783Nu1, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.Z.e(interfaceC3783Nu1);
    }

    @InterfaceC9150r20(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object Q0() {
        return null;
    }

    @Override // o.InterfaceC3294Iu1
    public final OnBackPressedDispatcher R() {
        return (OnBackPressedDispatcher) this.q1.getValue();
    }

    @Override // o.InterfaceC8873pv1
    public final void S(Runnable runnable) {
        C6562gT0.p(runnable, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.l1.remove(runnable);
    }

    @Override // androidx.lifecycle.e
    public u.b T() {
        return (u.b) this.p1.getValue();
    }

    @Override // androidx.lifecycle.e
    public AbstractC6553gR U() {
        Bundle bundle = null;
        C3946Pm1 c3946Pm1 = new C3946Pm1(null, 1, null);
        if (getApplication() != null) {
            c3946Pm1.c(u.a.i, getApplication());
        }
        c3946Pm1.c(q.c, this);
        c3946Pm1.c(q.d, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            c3946Pm1.c(q.e, bundle);
        }
        return c3946Pm1;
    }

    @Override // o.InterfaceC7587ki1
    public void V(InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0, f.b bVar) {
        C6562gT0.p(interfaceC10042ui1, "provider");
        C6562gT0.p(kz0, "owner");
        C6562gT0.p(bVar, "state");
        this.Y0.e(interfaceC10042ui1, kz0, bVar);
    }

    @Override // o.I5
    public final <I, O> X5<I> X(O5<I, O> o5, H5<O> h5) {
        C6562gT0.p(o5, "contract");
        C6562gT0.p(h5, "callback");
        return t(o5, this.f1, h5);
    }

    @Override // o.InterfaceC5928dv1
    public final void Y(InterfaceC10929yL<XC1> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.k1.add(interfaceC10929yL);
    }

    @Override // o.InterfaceC8873pv1
    public final void Z(Runnable runnable) {
        C6562gT0.p(runnable, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.l1.add(runnable);
    }

    @Override // o.InterfaceC7587ki1
    public void a0() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K0();
        c cVar = this.b1;
        View decorView = getWindow().getDecorView();
        C6562gT0.o(decorView, "getDecorView(...)");
        cVar.I1(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // o.ActivityC8964qI, o.KZ0
    public f b() {
        return super.b();
    }

    @Override // o.InterfaceC4345To1
    public C4248So1 f() {
        return R().j();
    }

    @Override // o.CA0
    public AA0 g() {
        return (AA0) this.c1.getValue();
    }

    @Override // android.app.Activity
    @InterfaceC9150r20(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f1.f(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    @InterfaceC9150r20(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        I0().t();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C6562gT0.p(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC10929yL<Configuration>> it = this.g1.iterator();
        C6562gT0.o(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.Z0.d(bundle);
        this.Z.c(this);
        super.onCreate(bundle);
        o.Y.d(this);
        int i = this.d1;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        C6562gT0.p(menu, C9796th2.f);
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.Y0.f(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C6562gT0.p(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.Y0.h(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC9150r20(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z) {
        if (this.m1) {
            return;
        }
        Iterator<InterfaceC10929yL<C9329rm1>> it = this.j1.iterator();
        C6562gT0.o(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new C9329rm1(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        C6562gT0.p(intent, C9998uW1.R);
        super.onNewIntent(intent);
        Iterator<InterfaceC10929yL<Intent>> it = this.i1.iterator();
        C6562gT0.o(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        C6562gT0.p(menu, C9796th2.f);
        this.Y0.g(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @InterfaceC9150r20(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.n1) {
            return;
        }
        Iterator<InterfaceC10929yL<XC1>> it = this.k1.iterator();
        C6562gT0.o(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new XC1(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        C6562gT0.p(menu, C9796th2.f);
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            this.Y0.i(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC9150r20(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C6562gT0.p(strArr, "permissions");
        C6562gT0.p(iArr, "grantResults");
        if (!this.f1.f(i, -1, new Intent().putExtra(P5.k.c, strArr).putExtra(P5.k.d, iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object Q0 = Q0();
        GH2 gh2 = this.a1;
        if (gh2 == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            gh2 = bVar.b();
        }
        if (gh2 == null && Q0 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.c(Q0);
        bVar2.d(gh2);
        return bVar2;
    }

    @Override // o.ActivityC8964qI, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C6562gT0.p(bundle, "outState");
        if (b() instanceof j) {
            f b2 = b();
            C6562gT0.n(b2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((j) b2).s(f.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.Z0.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC10929yL<Integer>> it = this.h1.iterator();
        C6562gT0.o(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.l1.iterator();
        C6562gT0.o(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // o.InterfaceC7587ki1
    public void r(InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0) {
        C6562gT0.p(interfaceC10042ui1, "provider");
        C6562gT0.p(kz0, "owner");
        this.Y0.d(interfaceC10042ui1, kz0);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C6399fr2.i()) {
                C6399fr2.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            g().d();
            C6399fr2.f();
        } catch (Throwable th) {
            C6399fr2.f();
            throw th;
        }
    }

    @Override // o.InterfaceC8386nv1
    public final void s(InterfaceC10929yL<Integer> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.h1.remove(interfaceC10929yL);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        K0();
        c cVar = this.b1;
        View decorView = getWindow().getDecorView();
        C6562gT0.o(decorView, "getDecorView(...)");
        cVar.I1(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @InterfaceC9150r20(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i) {
        C6562gT0.p(intent, C9998uW1.R);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @InterfaceC9150r20(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        C6562gT0.p(intentSender, C9998uW1.R);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // o.I5
    public final <I, O> X5<I> t(O5<I, O> o5, AbstractC5244b6 abstractC5244b6, H5<O> h5) {
        C6562gT0.p(o5, "contract");
        C6562gT0.p(abstractC5244b6, "registry");
        C6562gT0.p(h5, "callback");
        return abstractC5244b6.o("activity_rq#" + this.e1.getAndIncrement(), this, o5, h5);
    }

    @Override // o.InterfaceC5444bv1
    public final void u(InterfaceC10929yL<Intent> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.i1.add(interfaceC10929yL);
    }

    @Override // o.InterfaceC8737pM
    public Context v() {
        return this.Z.d();
    }

    @Override // o.InterfaceC5201av1
    public final void w(InterfaceC10929yL<C9329rm1> interfaceC10929yL) {
        C6562gT0.p(interfaceC10929yL, ServiceSpecificExtraArgs.CastExtraArgs.a);
        this.j1.remove(interfaceC10929yL);
    }

    @Override // o.InterfaceC5486c6
    public final AbstractC5244b6 x() {
        return this.f1;
    }

    @Override // android.app.Activity
    @InterfaceC9150r20(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C6562gT0.p(intent, C9998uW1.R);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @InterfaceC9150r20(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        C6562gT0.p(intentSender, C9998uW1.R);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        C6562gT0.p(configuration, "newConfig");
        this.m1 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.m1 = false;
            Iterator<InterfaceC10929yL<C9329rm1>> it = this.j1.iterator();
            C6562gT0.o(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new C9329rm1(z, configuration));
            }
        } catch (Throwable th) {
            this.m1 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C6562gT0.p(configuration, "newConfig");
        this.n1 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.n1 = false;
            Iterator<InterfaceC10929yL<XC1>> it = this.k1.iterator();
            C6562gT0.o(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new XC1(z, configuration));
            }
        } catch (Throwable th) {
            this.n1 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        K0();
        c cVar = this.b1;
        View decorView = getWindow().getDecorView();
        C6562gT0.o(decorView, "getDecorView(...)");
        cVar.I1(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K0();
        c cVar = this.b1;
        View decorView = getWindow().getDecorView();
        C6562gT0.o(decorView, "getDecorView(...)");
        cVar.I1(decorView);
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.d1 = i;
    }
}
