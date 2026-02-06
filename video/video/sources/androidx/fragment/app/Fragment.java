package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.A5;
import o.AbstractC5216az0;
import o.AbstractC5244b6;
import o.AbstractC5701cz0;
import o.AbstractC6553gR;
import o.ActivityC4864Yy0;
import o.C10434wI2;
import o.C10735xY0;
import o.C2513Az0;
import o.C3504Kz0;
import o.C3946Pm1;
import o.C7341jh2;
import o.C7364jn1;
import o.C7654kz0;
import o.C9216rI2;
import o.C9811tl1;
import o.C9945uI2;
import o.GH2;
import o.H5;
import o.HH2;
import o.I5;
import o.InterfaceC5486c6;
import o.InterfaceC6490gB0;
import o.KZ0;
import o.NX1;
import o.O5;
import o.OX1;
import o.TD0;
import o.U32;
import o.V11;
import o.X5;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, KZ0, HH2, androidx.lifecycle.e, OX1, I5 {
    public static final Object X1 = new Object();
    public static final int Y1 = -1;
    public static final int Z1 = 0;
    public static final int a2 = 1;
    public static final int b2 = 2;
    public static final int c2 = 3;
    public static final int d2 = 4;
    public static final int e2 = 5;
    public static final int f2 = 6;
    public static final int g2 = 7;
    public boolean A1;
    public boolean B1;
    public ViewGroup C1;
    public View D1;
    public boolean E1;
    public boolean F1;
    public j G1;
    public Handler H1;
    public Runnable I1;
    public boolean J1;
    public LayoutInflater K1;
    public boolean L1;
    public String M1;
    public f.b N1;
    public androidx.lifecycle.j O1;
    public C3504Kz0 P1;
    public C7364jn1<KZ0> Q1;
    public u.b R1;
    public NX1 S1;
    public int T1;
    public final AtomicInteger U1;
    public final ArrayList<m> V1;
    public final m W1;
    public int X;
    public Bundle Y;
    public Bundle Y0;
    public SparseArray<Parcelable> Z;
    public Boolean Z0;
    public String a1;
    public Bundle b1;
    public Fragment c1;
    public String d1;
    public int e1;
    public Boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    public FragmentManager o1;
    public AbstractC5701cz0<?> p1;
    public FragmentManager q1;
    public Fragment r1;
    public int s1;
    public int t1;
    public String u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends X5<I> {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ O5 b;

        public a(AtomicReference atomicReference, O5 o5) {
            this.a = atomicReference;
            this.b = o5;
        }

        @Override // o.X5
        public O5<I, ?> a() {
            return this.b;
        }

        @Override // o.X5
        public void c(I i, A5 a5) {
            X5 x5 = (X5) this.a.get();
            if (x5 != null) {
                x5.c(i, a5);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // o.X5
        public void d() {
            X5 x5 = (X5) this.a.getAndSet(null);
            if (x5 != null) {
                x5.d();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.E2();
        }
    }

    /* loaded from: classes.dex */
    public class c extends m {
        public c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.m
        public void a() {
            Bundle bundle;
            Fragment.this.S1.c();
            q.c(Fragment.this);
            Bundle bundle2 = Fragment.this.Y;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(androidx.fragment.app.h.i);
            } else {
                bundle = null;
            }
            Fragment.this.S1.d(bundle);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.i(false);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ androidx.fragment.app.k X;

        public e(androidx.fragment.app.k kVar) {
            this.X = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.k();
        }
    }

    /* loaded from: classes.dex */
    public class f extends AbstractC5216az0 {
        public f() {
        }

        @Override // o.AbstractC5216az0
        public View d(int i) {
            View view = Fragment.this.D1;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // o.AbstractC5216az0
        public boolean e() {
            if (Fragment.this.D1 != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class g implements InterfaceC6490gB0<Void, AbstractC5244b6> {
        public g() {
        }

        @Override // o.InterfaceC6490gB0
        /* renamed from: a */
        public AbstractC5244b6 apply(Void r3) {
            Fragment fragment = Fragment.this;
            AbstractC5701cz0<?> abstractC5701cz0 = fragment.p1;
            if (abstractC5701cz0 instanceof InterfaceC5486c6) {
                return ((InterfaceC5486c6) abstractC5701cz0).x();
            }
            return fragment.S1().x();
        }
    }

    /* loaded from: classes.dex */
    public class h implements InterfaceC6490gB0<Void, AbstractC5244b6> {
        public final /* synthetic */ AbstractC5244b6 a;

        public h(AbstractC5244b6 abstractC5244b6) {
            this.a = abstractC5244b6;
        }

        @Override // o.InterfaceC6490gB0
        /* renamed from: a */
        public AbstractC5244b6 apply(Void r1) {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class i extends m {
        public final /* synthetic */ InterfaceC6490gB0 a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ O5 c;
        public final /* synthetic */ H5 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC6490gB0 interfaceC6490gB0, AtomicReference atomicReference, O5 o5, H5 h5) {
            super(null);
            this.a = interfaceC6490gB0;
            this.b = atomicReference;
            this.c = o5;
            this.d = h5;
        }

        @Override // androidx.fragment.app.Fragment.m
        public void a() {
            this.b.set(((AbstractC5244b6) this.a.apply(null)).o(Fragment.this.n(), Fragment.this, this.c, this.d));
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public View a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public ArrayList<String> h;
        public ArrayList<String> i;
        public Object j = null;
        public Object k;
        public Object l;
        public Object m;
        public Object n;

        /* renamed from: o  reason: collision with root package name */
        public Object f31o;
        public Boolean p;
        public Boolean q;
        public U32 r;
        public U32 s;
        public float t;
        public View u;
        public boolean v;

        public j() {
            Object obj = Fragment.X1;
            this.k = obj;
            this.l = null;
            this.m = obj;
            this.n = null;
            this.f31o = obj;
            this.r = null;
            this.s = null;
            this.t = 1.0f;
            this.u = null;
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        public m() {
        }

        public abstract void a();

        public /* synthetic */ m(b bVar) {
            this();
        }
    }

    public Fragment() {
        this.X = -1;
        this.a1 = UUID.randomUUID().toString();
        this.d1 = null;
        this.f1 = null;
        this.q1 = new C7654kz0();
        this.A1 = true;
        this.F1 = true;
        this.I1 = new b();
        this.N1 = f.b.RESUMED;
        this.Q1 = new C7364jn1<>();
        this.U1 = new AtomicInteger();
        this.V1 = new ArrayList<>();
        this.W1 = new c();
        r0();
    }

    public static /* synthetic */ void h(Fragment fragment) {
        fragment.P1.e(fragment.Y0);
        fragment.Y0 = null;
    }

    @Deprecated
    public static Fragment t0(Context context, String str) {
        return u0(context, str, null);
    }

    @Deprecated
    public static Fragment u0(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.e.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.f2(bundle);
                return newInstance;
            }
            return newInstance;
        } catch (IllegalAccessException e3) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    @Override // o.HH2
    public GH2 A() {
        if (this.o1 != null) {
            if (L() != f.b.INITIALIZED.ordinal()) {
                return this.o1.S0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean A0() {
        if (this.A1) {
            FragmentManager fragmentManager = this.o1;
            if (fragmentManager == null || fragmentManager.b1(this.r1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void A1(boolean z) {
        a1(z);
    }

    public void A2(Intent intent) {
        B2(intent, null);
    }

    public Object B() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        return jVar.l;
    }

    public boolean B0() {
        j jVar = this.G1;
        if (jVar == null) {
            return false;
        }
        return jVar.v;
    }

    public boolean B1(MenuItem menuItem) {
        if (!this.v1) {
            if (this.z1 && this.A1 && b1(menuItem)) {
                return true;
            }
            return this.q1.R(menuItem);
        }
        return false;
    }

    public void B2(Intent intent, Bundle bundle) {
        AbstractC5701cz0<?> abstractC5701cz0 = this.p1;
        if (abstractC5701cz0 != null) {
            abstractC5701cz0.t(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public U32 C() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        return jVar.s;
    }

    public final boolean C0() {
        return this.h1;
    }

    public void C1(Menu menu) {
        if (!this.v1) {
            if (this.z1 && this.A1) {
                c1(menu);
            }
            this.q1.S(menu);
        }
    }

    @Deprecated
    public void C2(Intent intent, int i2, Bundle bundle) {
        if (this.p1 != null) {
            O().g1(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public View D() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        return jVar.u;
    }

    public final boolean D0() {
        if (this.X >= 7) {
            return true;
        }
        return false;
    }

    public void D1() {
        this.q1.U();
        if (this.D1 != null) {
            this.P1.a(f.a.ON_PAUSE);
        }
        this.O1.l(f.a.ON_PAUSE);
        this.X = 6;
        this.B1 = false;
        d1();
        if (this.B1) {
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onPause()");
    }

    @Deprecated
    public void D2(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Bundle bundle2;
        if (this.p1 != null) {
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                sb.append(i2);
                sb.append(" IntentSender: ");
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                sb.append(intent);
                sb.append(" options: ");
                bundle2 = bundle;
                sb.append(bundle2);
                Log.v("FragmentManager", sb.toString());
            } else {
                bundle2 = bundle;
            }
            O().h1(this, intentSender, i2, intent, i3, i4, i5, bundle2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // o.OX1
    public final androidx.savedstate.a E() {
        return this.S1.b();
    }

    public final boolean E0() {
        FragmentManager fragmentManager = this.o1;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.e1();
    }

    public void E1(boolean z) {
        e1(z);
    }

    public void E2() {
        if (this.G1 != null && l().v) {
            if (this.p1 == null) {
                l().v = false;
            } else if (Looper.myLooper() != this.p1.h().getLooper()) {
                this.p1.h().postAtFrontOfQueue(new d());
            } else {
                i(true);
            }
        }
    }

    @Deprecated
    public final FragmentManager F() {
        return this.o1;
    }

    public final boolean F0() {
        View view;
        if (v0() && !x0() && (view = this.D1) != null && view.getWindowToken() != null && this.D1.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean F1(Menu menu) {
        boolean z = false;
        if (this.v1) {
            return false;
        }
        if (this.z1 && this.A1) {
            f1(menu);
            z = true;
        }
        return this.q1.W(menu) | z;
    }

    public void F2(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final Object G() {
        AbstractC5701cz0<?> abstractC5701cz0 = this.p1;
        if (abstractC5701cz0 == null) {
            return null;
        }
        return abstractC5701cz0.j();
    }

    public void G0() {
        this.q1.j1();
    }

    public void G1() {
        boolean c1 = this.o1.c1(this);
        Boolean bool = this.f1;
        if (bool != null && bool.booleanValue() == c1) {
            return;
        }
        this.f1 = Boolean.valueOf(c1);
        g1(c1);
        this.q1.X();
    }

    public final int H() {
        return this.s1;
    }

    @Deprecated
    public void H0(Bundle bundle) {
        this.B1 = true;
    }

    public void H1() {
        this.q1.j1();
        this.q1.j0(true);
        this.X = 7;
        this.B1 = false;
        i1();
        if (this.B1) {
            androidx.lifecycle.j jVar = this.O1;
            f.a aVar = f.a.ON_RESUME;
            jVar.l(aVar);
            if (this.D1 != null) {
                this.P1.a(aVar);
            }
            this.q1.Y();
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onResume()");
    }

    public final LayoutInflater I() {
        LayoutInflater layoutInflater = this.K1;
        if (layoutInflater == null) {
            return y1(null);
        }
        return layoutInflater;
    }

    @Deprecated
    public void I0(int i2, int i3, Intent intent) {
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void I1(Bundle bundle) {
        j1(bundle);
    }

    @Deprecated
    public LayoutInflater J(Bundle bundle) {
        AbstractC5701cz0<?> abstractC5701cz0 = this.p1;
        if (abstractC5701cz0 != null) {
            LayoutInflater k2 = abstractC5701cz0.k();
            C10735xY0.d(k2, this.q1.L0());
            return k2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void J0(Activity activity) {
        this.B1 = true;
    }

    public void J1() {
        this.q1.j1();
        this.q1.j0(true);
        this.X = 5;
        this.B1 = false;
        k1();
        if (this.B1) {
            androidx.lifecycle.j jVar = this.O1;
            f.a aVar = f.a.ON_START;
            jVar.l(aVar);
            if (this.D1 != null) {
                this.P1.a(aVar);
            }
            this.q1.Z();
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onStart()");
    }

    @Deprecated
    public V11 K() {
        return V11.d(this);
    }

    public void K0(Context context) {
        Activity f3;
        this.B1 = true;
        AbstractC5701cz0<?> abstractC5701cz0 = this.p1;
        if (abstractC5701cz0 == null) {
            f3 = null;
        } else {
            f3 = abstractC5701cz0.f();
        }
        if (f3 != null) {
            this.B1 = false;
            J0(f3);
        }
    }

    public void K1() {
        this.q1.b0();
        if (this.D1 != null) {
            this.P1.a(f.a.ON_STOP);
        }
        this.O1.l(f.a.ON_STOP);
        this.X = 4;
        this.B1 = false;
        l1();
        if (this.B1) {
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onStop()");
    }

    public final int L() {
        f.b bVar = this.N1;
        if (bVar != f.b.INITIALIZED && this.r1 != null) {
            return Math.min(bVar.ordinal(), this.r1.L());
        }
        return bVar.ordinal();
    }

    @Deprecated
    public void L0(Fragment fragment) {
    }

    public void L1() {
        Bundle bundle;
        Bundle bundle2 = this.Y;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(androidx.fragment.app.h.h);
        } else {
            bundle = null;
        }
        m1(this.D1, bundle);
        this.q1.c0();
    }

    public int M() {
        j jVar = this.G1;
        if (jVar == null) {
            return 0;
        }
        return jVar.g;
    }

    public boolean M0(MenuItem menuItem) {
        return false;
    }

    public void M1() {
        l().v = true;
    }

    public final Fragment N() {
        return this.r1;
    }

    public void N0(Bundle bundle) {
        this.B1 = true;
        Z1();
        if (!this.q1.d1(1)) {
            this.q1.J();
        }
    }

    public final void N1(long j2, TimeUnit timeUnit) {
        l().v = true;
        Handler handler = this.H1;
        if (handler != null) {
            handler.removeCallbacks(this.I1);
        }
        FragmentManager fragmentManager = this.o1;
        if (fragmentManager != null) {
            this.H1 = fragmentManager.K0().h();
        } else {
            this.H1 = new Handler(Looper.getMainLooper());
        }
        this.H1.removeCallbacks(this.I1);
        this.H1.postDelayed(this.I1, timeUnit.toMillis(j2));
    }

    public final FragmentManager O() {
        FragmentManager fragmentManager = this.o1;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Animation O0(int i2, boolean z, int i3) {
        return null;
    }

    public final <I, O> X5<I> O1(O5<I, O> o5, InterfaceC6490gB0<Void, AbstractC5244b6> interfaceC6490gB0, H5<O> h5) {
        if (this.X <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            Q1(new i(interfaceC6490gB0, atomicReference, o5, h5));
            return new a(atomicReference, o5);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public boolean P() {
        j jVar = this.G1;
        if (jVar == null) {
            return false;
        }
        return jVar.b;
    }

    public Animator P0(int i2, boolean z, int i3) {
        return null;
    }

    public void P1(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public int Q() {
        j jVar = this.G1;
        if (jVar == null) {
            return 0;
        }
        return jVar.e;
    }

    @Deprecated
    public void Q0(Menu menu, MenuInflater menuInflater) {
    }

    public final void Q1(m mVar) {
        if (this.X >= 0) {
            mVar.a();
        } else {
            this.V1.add(mVar);
        }
    }

    public View R0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.T1;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    @Deprecated
    public final void R1(String[] strArr, int i2) {
        if (this.p1 != null) {
            O().f1(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public int S() {
        j jVar = this.G1;
        if (jVar == null) {
            return 0;
        }
        return jVar.f;
    }

    public void S0() {
        this.B1 = true;
    }

    public final ActivityC4864Yy0 S1() {
        ActivityC4864Yy0 o2 = o();
        if (o2 != null) {
            return o2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // androidx.lifecycle.e
    public u.b T() {
        Application application;
        if (this.o1 != null) {
            if (this.R1 == null) {
                Context applicationContext = U1().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && FragmentManager.X0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + U1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.R1 = new r(application, this, s());
            }
            return this.R1;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Deprecated
    public void T0() {
    }

    public final Bundle T1() {
        Bundle s = s();
        if (s != null) {
            return s;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @Override // androidx.lifecycle.e
    public AbstractC6553gR U() {
        Application application;
        Context applicationContext = U1().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && FragmentManager.X0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + U1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C3946Pm1 c3946Pm1 = new C3946Pm1();
        if (application != null) {
            c3946Pm1.c(u.a.i, application);
        }
        c3946Pm1.c(q.c, this);
        c3946Pm1.c(q.d, this);
        if (s() != null) {
            c3946Pm1.c(q.e, s());
        }
        return c3946Pm1;
    }

    public void U0() {
        this.B1 = true;
    }

    public final Context U1() {
        Context v = v();
        if (v != null) {
            return v;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public float V() {
        j jVar = this.G1;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.t;
    }

    public void V0() {
        this.B1 = true;
    }

    @Deprecated
    public final FragmentManager V1() {
        return O();
    }

    public Object W() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.m;
        if (obj == X1) {
            return B();
        }
        return obj;
    }

    public LayoutInflater W0(Bundle bundle) {
        return J(bundle);
    }

    public final Object W1() {
        Object G = G();
        if (G != null) {
            return G;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @Override // o.I5
    public final <I, O> X5<I> X(O5<I, O> o5, H5<O> h5) {
        return O1(o5, new g(), h5);
    }

    public void X0(boolean z) {
    }

    public final Fragment X1() {
        Fragment N = N();
        if (N == null) {
            if (v() == null) {
                throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + v());
        }
        return N;
    }

    public final Resources Y() {
        return U1().getResources();
    }

    @Deprecated
    public void Y0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.B1 = true;
    }

    public final View Y1() {
        View n0 = n0();
        if (n0 != null) {
            return n0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Deprecated
    public final boolean Z() {
        C2513Az0.k(this);
        return this.x1;
    }

    public void Z0(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity f3;
        this.B1 = true;
        AbstractC5701cz0<?> abstractC5701cz0 = this.p1;
        if (abstractC5701cz0 == null) {
            f3 = null;
        } else {
            f3 = abstractC5701cz0.f();
        }
        if (f3 != null) {
            this.B1 = false;
            Y0(f3, attributeSet, bundle);
        }
    }

    public void Z1() {
        Bundle bundle;
        Bundle bundle2 = this.Y;
        if (bundle2 != null && (bundle = bundle2.getBundle(androidx.fragment.app.h.j)) != null) {
            this.q1.I1(bundle);
            this.q1.J();
        }
    }

    public Object a0() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.k;
        if (obj == X1) {
            return x();
        }
        return obj;
    }

    public void a1(boolean z) {
    }

    public final void a2() {
        Bundle bundle;
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.D1 != null) {
            Bundle bundle2 = this.Y;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(androidx.fragment.app.h.h);
            } else {
                bundle = null;
            }
            b2(bundle);
        }
        this.Y = null;
    }

    @Override // o.KZ0
    public androidx.lifecycle.f b() {
        return this.O1;
    }

    public Object b0() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        return jVar.n;
    }

    @Deprecated
    public boolean b1(MenuItem menuItem) {
        return false;
    }

    public final void b2(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.Z;
        if (sparseArray != null) {
            this.D1.restoreHierarchyState(sparseArray);
            this.Z = null;
        }
        this.B1 = false;
        n1(bundle);
        if (this.B1) {
            if (this.D1 != null) {
                this.P1.a(f.a.ON_CREATE);
                return;
            }
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public Object c0() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f31o;
        if (obj == X1) {
            return b0();
        }
        return obj;
    }

    @Deprecated
    public void c1(Menu menu) {
    }

    public void c2(boolean z) {
        l().q = Boolean.valueOf(z);
    }

    public ArrayList<String> d0() {
        ArrayList<String> arrayList;
        j jVar = this.G1;
        if (jVar != null && (arrayList = jVar.h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public void d1() {
        this.B1 = true;
    }

    public void d2(boolean z) {
        l().p = Boolean.valueOf(z);
    }

    public ArrayList<String> e0() {
        ArrayList<String> arrayList;
        j jVar = this.G1;
        if (jVar != null && (arrayList = jVar.i) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public void e1(boolean z) {
    }

    public void e2(int i2, int i3, int i4, int i5) {
        if (this.G1 == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        l().c = i2;
        l().d = i3;
        l().e = i4;
        l().f = i5;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final String f0(int i2) {
        return Y().getString(i2);
    }

    @Deprecated
    public void f1(Menu menu) {
    }

    public void f2(Bundle bundle) {
        if (this.o1 != null && E0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.b1 = bundle;
    }

    public final String g0(int i2, Object... objArr) {
        return Y().getString(i2, objArr);
    }

    public void g1(boolean z) {
    }

    public void g2(U32 u32) {
        l().r = u32;
    }

    public final String h0() {
        return this.u1;
    }

    @Deprecated
    public void h1(int i2, String[] strArr, int[] iArr) {
    }

    public void h2(Object obj) {
        l().j = obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.G1;
        if (jVar != null) {
            jVar.v = false;
        }
        if (this.D1 != null && (viewGroup = this.C1) != null && (fragmentManager = this.o1) != null) {
            androidx.fragment.app.k r = androidx.fragment.app.k.r(viewGroup, fragmentManager);
            r.t();
            if (z) {
                this.p1.h().post(new e(r));
            } else {
                r.k();
            }
            Handler handler = this.H1;
            if (handler != null) {
                handler.removeCallbacks(this.I1);
                this.H1 = null;
            }
        }
    }

    @Deprecated
    public final Fragment i0() {
        return j0(true);
    }

    public void i1() {
        this.B1 = true;
    }

    public void i2(U32 u32) {
        l().s = u32;
    }

    public AbstractC5216az0 j() {
        return new f();
    }

    public final Fragment j0(boolean z) {
        String str;
        if (z) {
            C2513Az0.m(this);
        }
        Fragment fragment = this.c1;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.o1;
        if (fragmentManager != null && (str = this.d1) != null) {
            return fragmentManager.o0(str);
        }
        return null;
    }

    public void j1(Bundle bundle) {
    }

    public void j2(Object obj) {
        l().l = obj;
    }

    public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.s1));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.t1));
        printWriter.print(" mTag=");
        printWriter.println(this.u1);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.X);
        printWriter.print(" mWho=");
        printWriter.print(this.a1);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.n1);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.g1);
        printWriter.print(" mRemoving=");
        printWriter.print(this.h1);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.j1);
        printWriter.print(" mInLayout=");
        printWriter.println(this.k1);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.v1);
        printWriter.print(" mDetached=");
        printWriter.print(this.w1);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.A1);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.z1);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.x1);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.F1);
        if (this.o1 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.o1);
        }
        if (this.p1 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.p1);
        }
        if (this.r1 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.r1);
        }
        if (this.b1 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.b1);
        }
        if (this.Y != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.Y);
        }
        if (this.Z != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.Z);
        }
        if (this.Y0 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.Y0);
        }
        Fragment j0 = j0(false);
        if (j0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(j0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.e1);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(P());
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(w());
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(z());
        }
        if (Q() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(Q());
        }
        if (S() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(S());
        }
        if (this.C1 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.C1);
        }
        if (this.D1 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.D1);
        }
        if (r() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(r());
        }
        if (v() != null) {
            V11.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.q1 + ":");
        FragmentManager fragmentManager = this.q1;
        fragmentManager.e0(str + TD0.a.Y0, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public final int k0() {
        C2513Az0.l(this);
        return this.e1;
    }

    public void k1() {
        this.B1 = true;
    }

    public void k2(View view) {
        l().u = view;
    }

    public final j l() {
        if (this.G1 == null) {
            this.G1 = new j();
        }
        return this.G1;
    }

    public final CharSequence l0(int i2) {
        return Y().getText(i2);
    }

    public void l1() {
        this.B1 = true;
    }

    @Deprecated
    public void l2(boolean z) {
        if (this.z1 != z) {
            this.z1 = z;
            if (v0() && !x0()) {
                this.p1.v();
            }
        }
    }

    public Fragment m(String str) {
        if (str.equals(this.a1)) {
            return this;
        }
        return this.q1.t0(str);
    }

    @Deprecated
    public boolean m0() {
        return this.F1;
    }

    public void m1(View view, Bundle bundle) {
    }

    public void m2(n nVar) {
        if (this.o1 == null) {
            this.Y = (nVar == null || (r2 = nVar.X) == null) ? null : null;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public String n() {
        return FragmentManager.V + this.a1 + "_rq#" + this.U1.getAndIncrement();
    }

    public View n0() {
        return this.D1;
    }

    public void n1(Bundle bundle) {
        this.B1 = true;
    }

    public void n2(boolean z) {
        if (this.A1 != z) {
            this.A1 = z;
            if (this.z1 && v0() && !x0()) {
                this.p1.v();
            }
        }
    }

    public final ActivityC4864Yy0 o() {
        AbstractC5701cz0<?> abstractC5701cz0 = this.p1;
        if (abstractC5701cz0 == null) {
            return null;
        }
        return (ActivityC4864Yy0) abstractC5701cz0.f();
    }

    public KZ0 o0() {
        C3504Kz0 c3504Kz0 = this.P1;
        if (c3504Kz0 != null) {
            return c3504Kz0;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public void o1(Bundle bundle) {
        this.q1.j1();
        this.X = 3;
        this.B1 = false;
        H0(bundle);
        if (this.B1) {
            a2();
            this.q1.F();
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void o2(int i2) {
        if (this.G1 == null && i2 == 0) {
            return;
        }
        l();
        this.G1.g = i2;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.B1 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        S1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.B1 = true;
    }

    public boolean p() {
        Boolean bool;
        j jVar = this.G1;
        if (jVar != null && (bool = jVar.q) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public LiveData<KZ0> p0() {
        return this.Q1;
    }

    public void p1() {
        Iterator<m> it = this.V1.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.V1.clear();
        this.q1.s(this.p1, j(), this);
        this.X = 0;
        this.B1 = false;
        K0(this.p1.g());
        if (this.B1) {
            this.o1.P(this);
            this.q1.G();
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void p2(boolean z) {
        if (this.G1 == null) {
            return;
        }
        l().b = z;
    }

    public boolean q() {
        Boolean bool;
        j jVar = this.G1;
        if (jVar != null && (bool = jVar.p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean q0() {
        return this.z1;
    }

    public void q1(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void q2(float f3) {
        l().t = f3;
    }

    public View r() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        return jVar.a;
    }

    public final void r0() {
        this.O1 = new androidx.lifecycle.j(this);
        this.S1 = NX1.a(this);
        this.R1 = null;
        if (!this.V1.contains(this.W1)) {
            Q1(this.W1);
        }
    }

    public boolean r1(MenuItem menuItem) {
        if (!this.v1) {
            if (M0(menuItem)) {
                return true;
            }
            return this.q1.I(menuItem);
        }
        return false;
    }

    public void r2(Object obj) {
        l().m = obj;
    }

    public final Bundle s() {
        return this.b1;
    }

    public void s0() {
        r0();
        this.M1 = this.a1;
        this.a1 = UUID.randomUUID().toString();
        this.g1 = false;
        this.h1 = false;
        this.j1 = false;
        this.k1 = false;
        this.l1 = false;
        this.n1 = 0;
        this.o1 = null;
        this.q1 = new C7654kz0();
        this.p1 = null;
        this.s1 = 0;
        this.t1 = 0;
        this.u1 = null;
        this.v1 = false;
        this.w1 = false;
    }

    public void s1(Bundle bundle) {
        this.q1.j1();
        this.X = 1;
        this.B1 = false;
        this.O1.a(new androidx.lifecycle.i() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.i
            public void i(KZ0 kz0, f.a aVar) {
                View view;
                if (aVar == f.a.ON_STOP && (view = Fragment.this.D1) != null) {
                    k.a(view);
                }
            }
        });
        N0(bundle);
        this.L1 = true;
        if (this.B1) {
            this.O1.l(f.a.ON_CREATE);
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onCreate()");
    }

    @Deprecated
    public void s2(boolean z) {
        C2513Az0.o(this);
        this.x1 = z;
        FragmentManager fragmentManager = this.o1;
        if (fragmentManager != null) {
            if (z) {
                fragmentManager.q(this);
                return;
            } else {
                fragmentManager.C1(this);
                return;
            }
        }
        this.y1 = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        C2(intent, i2, null);
    }

    @Override // o.I5
    public final <I, O> X5<I> t(O5<I, O> o5, AbstractC5244b6 abstractC5244b6, H5<O> h5) {
        return O1(o5, new h(abstractC5244b6), h5);
    }

    public boolean t1(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.v1) {
            return false;
        }
        if (this.z1 && this.A1) {
            Q0(menu, menuInflater);
            z = true;
        }
        return this.q1.K(menu, menuInflater) | z;
    }

    public void t2(Object obj) {
        l().k = obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.a1);
        if (this.s1 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.s1));
        }
        if (this.u1 != null) {
            sb.append(" tag=");
            sb.append(this.u1);
        }
        sb.append(C9811tl1.d);
        return sb.toString();
    }

    public final FragmentManager u() {
        if (this.p1 != null) {
            return this.q1;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void u1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.q1.j1();
        this.m1 = true;
        this.P1 = new C3504Kz0(this, A(), new Runnable() { // from class: o.Ty0
            @Override // java.lang.Runnable
            public final void run() {
                Fragment.h(Fragment.this);
            }
        });
        View R0 = R0(layoutInflater, viewGroup, bundle);
        this.D1 = R0;
        if (R0 != null) {
            this.P1.c();
            if (FragmentManager.X0(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.D1 + " for Fragment " + this);
            }
            C9216rI2.b(this.D1, this.P1);
            C10434wI2.b(this.D1, this.P1);
            C9945uI2.b(this.D1, this.P1);
            this.Q1.r(this.P1);
        } else if (!this.P1.d()) {
            this.P1 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void u2(Object obj) {
        l().n = obj;
    }

    public Context v() {
        AbstractC5701cz0<?> abstractC5701cz0 = this.p1;
        if (abstractC5701cz0 == null) {
            return null;
        }
        return abstractC5701cz0.g();
    }

    public final boolean v0() {
        if (this.p1 != null && this.g1) {
            return true;
        }
        return false;
    }

    public void v1() {
        this.q1.L();
        this.O1.l(f.a.ON_DESTROY);
        this.X = 0;
        this.B1 = false;
        this.L1 = false;
        S0();
        if (this.B1) {
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void v2(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        l();
        j jVar = this.G1;
        jVar.h = arrayList;
        jVar.i = arrayList2;
    }

    public int w() {
        j jVar = this.G1;
        if (jVar == null) {
            return 0;
        }
        return jVar.c;
    }

    public final boolean w0() {
        return this.w1;
    }

    public void w1() {
        this.q1.M();
        if (this.D1 != null && this.P1.b().b().g(f.b.CREATED)) {
            this.P1.a(f.a.ON_DESTROY);
        }
        this.X = 1;
        this.B1 = false;
        U0();
        if (this.B1) {
            V11.d(this).h();
            this.m1 = false;
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void w2(Object obj) {
        l().f31o = obj;
    }

    public Object x() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        return jVar.j;
    }

    public final boolean x0() {
        if (!this.v1) {
            FragmentManager fragmentManager = this.o1;
            if (fragmentManager == null || !fragmentManager.a1(this.r1)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void x1() {
        this.X = -1;
        this.B1 = false;
        V0();
        this.K1 = null;
        if (this.B1) {
            if (!this.q1.W0()) {
                this.q1.L();
                this.q1 = new C7654kz0();
                return;
            }
            return;
        }
        throw new C7341jh2("Fragment " + this + " did not call through to super.onDetach()");
    }

    @Deprecated
    public void x2(Fragment fragment, int i2) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            C2513Az0.p(this, fragment, i2);
        }
        FragmentManager fragmentManager2 = this.o1;
        if (fragment != null) {
            fragmentManager = fragment.o1;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.j0(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.d1 = null;
            this.c1 = null;
        } else if (this.o1 != null && fragment.o1 != null) {
            this.d1 = fragment.a1;
            this.c1 = null;
        } else {
            this.d1 = null;
            this.c1 = fragment;
        }
        this.e1 = i2;
    }

    public U32 y() {
        j jVar = this.G1;
        if (jVar == null) {
            return null;
        }
        return jVar.r;
    }

    public final boolean y0() {
        if (this.n1 > 0) {
            return true;
        }
        return false;
    }

    public LayoutInflater y1(Bundle bundle) {
        LayoutInflater W0 = W0(bundle);
        this.K1 = W0;
        return W0;
    }

    @Deprecated
    public void y2(boolean z) {
        boolean z2;
        C2513Az0.q(this, z);
        if (!this.F1 && z && this.X < 5 && this.o1 != null && v0() && this.L1) {
            FragmentManager fragmentManager = this.o1;
            fragmentManager.m1(fragmentManager.D(this));
        }
        this.F1 = z;
        if (this.X < 5 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.E1 = z2;
        if (this.Y != null) {
            this.Z0 = Boolean.valueOf(z);
        }
    }

    public int z() {
        j jVar = this.G1;
        if (jVar == null) {
            return 0;
        }
        return jVar.d;
    }

    public final boolean z0() {
        return this.k1;
    }

    public void z1() {
        onLowMemory();
    }

    public boolean z2(String str) {
        AbstractC5701cz0<?> abstractC5701cz0 = this.p1;
        if (abstractC5701cz0 != null) {
            return abstractC5701cz0.p(str);
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();
        public final Bundle X;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public n[] newArray(int i) {
                return new n[i];
            }
        }

        public n(Bundle bundle) {
            this.X = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.X);
        }

        public n(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.X = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    public Fragment(int i2) {
        this();
        this.T1 = i2;
    }
}
