package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.f;
import androidx.savedstate.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.C5240b5;
import o.TD0;

/* renamed from: o.Yy0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC4864Yy0 extends ComponentActivity implements C5240b5.i, C5240b5.k {
    public static final String y1 = "android:support:lifecycle";
    public final C5458bz0 t1;
    public final androidx.lifecycle.j u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;

    /* renamed from: o.Yy0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5701cz0<ActivityC4864Yy0> implements InterfaceC3587Lu1, InterfaceC8386nv1, InterfaceC5201av1, InterfaceC5928dv1, HH2, InterfaceC3294Iu1, InterfaceC5486c6, OX1, InterfaceC8401nz0, InterfaceC7587ki1 {
        public a() {
            super(ActivityC4864Yy0.this);
        }

        @Override // o.HH2
        public GH2 A() {
            return ActivityC4864Yy0.this.A();
        }

        @Override // o.InterfaceC7587ki1
        public void C(InterfaceC10042ui1 interfaceC10042ui1) {
            ActivityC4864Yy0.this.C(interfaceC10042ui1);
        }

        @Override // o.OX1
        public androidx.savedstate.a E() {
            return ActivityC4864Yy0.this.E();
        }

        @Override // o.InterfaceC3587Lu1
        public void F(InterfaceC10929yL<Configuration> interfaceC10929yL) {
            ActivityC4864Yy0.this.F(interfaceC10929yL);
        }

        @Override // o.InterfaceC5928dv1
        public void G(InterfaceC10929yL<XC1> interfaceC10929yL) {
            ActivityC4864Yy0.this.G(interfaceC10929yL);
        }

        @Override // o.InterfaceC3587Lu1
        public void H(InterfaceC10929yL<Configuration> interfaceC10929yL) {
            ActivityC4864Yy0.this.H(interfaceC10929yL);
        }

        @Override // o.InterfaceC8386nv1
        public void J(InterfaceC10929yL<Integer> interfaceC10929yL) {
            ActivityC4864Yy0.this.J(interfaceC10929yL);
        }

        @Override // o.InterfaceC5201av1
        public void K(InterfaceC10929yL<C9329rm1> interfaceC10929yL) {
            ActivityC4864Yy0.this.K(interfaceC10929yL);
        }

        @Override // o.InterfaceC7587ki1
        public void N(InterfaceC10042ui1 interfaceC10042ui1) {
            ActivityC4864Yy0.this.N(interfaceC10042ui1);
        }

        @Override // o.InterfaceC3294Iu1
        public OnBackPressedDispatcher R() {
            return ActivityC4864Yy0.this.R();
        }

        @Override // o.InterfaceC7587ki1
        public void V(InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0, f.b bVar) {
            ActivityC4864Yy0.this.V(interfaceC10042ui1, kz0, bVar);
        }

        @Override // o.InterfaceC5928dv1
        public void Y(InterfaceC10929yL<XC1> interfaceC10929yL) {
            ActivityC4864Yy0.this.Y(interfaceC10929yL);
        }

        @Override // o.InterfaceC8401nz0
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            ActivityC4864Yy0.this.b1(fragment);
        }

        @Override // o.InterfaceC7587ki1
        public void a0() {
            ActivityC4864Yy0.this.a0();
        }

        @Override // o.KZ0
        public androidx.lifecycle.f b() {
            return ActivityC4864Yy0.this.u1;
        }

        @Override // o.AbstractC5701cz0, o.AbstractC5216az0
        public View d(int i) {
            return ActivityC4864Yy0.this.findViewById(i);
        }

        @Override // o.AbstractC5701cz0, o.AbstractC5216az0
        public boolean e() {
            Window window = ActivityC4864Yy0.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC5701cz0
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC4864Yy0.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // o.AbstractC5701cz0
        public LayoutInflater k() {
            return ActivityC4864Yy0.this.getLayoutInflater().cloneInContext(ActivityC4864Yy0.this);
        }

        @Override // o.AbstractC5701cz0
        public int l() {
            Window window = ActivityC4864Yy0.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // o.AbstractC5701cz0
        public boolean m() {
            if (ActivityC4864Yy0.this.getWindow() != null) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC5701cz0
        public boolean o(Fragment fragment) {
            return !ActivityC4864Yy0.this.isFinishing();
        }

        @Override // o.AbstractC5701cz0
        public boolean p(String str) {
            return C5240b5.S(ActivityC4864Yy0.this, str);
        }

        @Override // o.InterfaceC7587ki1
        public void r(InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0) {
            ActivityC4864Yy0.this.r(interfaceC10042ui1, kz0);
        }

        @Override // o.InterfaceC8386nv1
        public void s(InterfaceC10929yL<Integer> interfaceC10929yL) {
            ActivityC4864Yy0.this.s(interfaceC10929yL);
        }

        @Override // o.AbstractC5701cz0
        public void v() {
            a0();
        }

        @Override // o.InterfaceC5201av1
        public void w(InterfaceC10929yL<C9329rm1> interfaceC10929yL) {
            ActivityC4864Yy0.this.w(interfaceC10929yL);
        }

        @Override // o.InterfaceC5486c6
        public AbstractC5244b6 x() {
            return ActivityC4864Yy0.this.x();
        }

        @Override // o.AbstractC5701cz0
        /* renamed from: y */
        public ActivityC4864Yy0 j() {
            return ActivityC4864Yy0.this;
        }
    }

    public ActivityC4864Yy0() {
        this.t1 = C5458bz0.b(new a());
        this.u1 = new androidx.lifecycle.j(this);
        this.x1 = true;
        Y0();
    }

    public static /* synthetic */ Bundle T0(ActivityC4864Yy0 activityC4864Yy0) {
        activityC4864Yy0.Z0();
        activityC4864Yy0.u1.l(f.a.ON_STOP);
        return new Bundle();
    }

    public static boolean a1(FragmentManager fragmentManager, f.b bVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.J0()) {
            if (fragment != null) {
                if (fragment.G() != null) {
                    z |= a1(fragment.u(), bVar);
                }
                C3504Kz0 c3504Kz0 = fragment.P1;
                if (c3504Kz0 != null && c3504Kz0.b().b().g(f.b.STARTED)) {
                    fragment.P1.g(bVar);
                    z = true;
                }
                if (fragment.O1.b().g(f.b.STARTED)) {
                    fragment.O1.s(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View V0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.t1.G(view, str, context, attributeSet);
    }

    public FragmentManager W0() {
        return this.t1.D();
    }

    @Deprecated
    public V11 X0() {
        return V11.d(this);
    }

    public final void Y0() {
        E().j(y1, new a.c() { // from class: o.Uy0
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return ActivityC4864Yy0.T0(ActivityC4864Yy0.this);
            }
        });
        F(new InterfaceC10929yL() { // from class: o.Vy0
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                Configuration configuration = (Configuration) obj;
                ActivityC4864Yy0.this.t1.F();
            }
        });
        u(new InterfaceC10929yL() { // from class: o.Wy0
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                Intent intent = (Intent) obj;
                ActivityC4864Yy0.this.t1.F();
            }
        });
        D(new InterfaceC3783Nu1() { // from class: o.Xy0
            @Override // o.InterfaceC3783Nu1
            public final void a(Context context) {
                ActivityC4864Yy0.this.t1.a(null);
            }
        });
    }

    public void Z0() {
        do {
        } while (a1(W0(), f.b.CREATED));
    }

    public void c1() {
        this.u1.l(f.a.ON_RESUME);
        this.t1.r();
    }

    public void d1(U32 u32) {
        C5240b5.O(this, u32);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!g0(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + TD0.a.Y0;
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.v1);
        printWriter.print(" mResumed=");
        printWriter.print(this.w1);
        printWriter.print(" mStopped=");
        printWriter.print(this.x1);
        if (getApplication() != null) {
            V11.d(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.t1.D().e0(str, fileDescriptor, printWriter, strArr);
    }

    public void e1(U32 u32) {
        C5240b5.P(this, u32);
    }

    public void f1(Fragment fragment, Intent intent, int i) {
        g1(fragment, intent, i, null);
    }

    public void g1(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C5240b5.T(this, intent, -1, bundle);
        } else {
            fragment.C2(intent, i, bundle);
        }
    }

    @Deprecated
    public void h1(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C5240b5.U(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.D2(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void i1() {
        C5240b5.E(this);
    }

    @Deprecated
    public void j1() {
        a0();
    }

    public void k1() {
        C5240b5.J(this);
    }

    public void l1() {
        C5240b5.V(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.t1.F();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.u1.l(f.a.ON_CREATE);
        this.t1.f();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View V0 = V0(view, str, context, attributeSet);
        return V0 == null ? super.onCreateView(view, str, context, attributeSet) : V0;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.t1.h();
        this.u1.l(f.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.t1.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.w1 = false;
        this.t1.n();
        this.u1.l(f.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        c1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.t1.F();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.t1.F();
        super.onResume();
        this.w1 = true;
        this.t1.z();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.t1.F();
        super.onStart();
        this.x1 = false;
        if (!this.v1) {
            this.v1 = true;
            this.t1.c();
        }
        this.t1.z();
        this.u1.l(f.a.ON_START);
        this.t1.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.t1.F();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.x1 = true;
        Z0();
        this.t1.t();
        this.u1.l(f.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View V0 = V0(null, str, context, attributeSet);
        return V0 == null ? super.onCreateView(str, context, attributeSet) : V0;
    }

    public ActivityC4864Yy0(int i) {
        super(i);
        this.t1 = C5458bz0.b(new a());
        this.u1 = new androidx.lifecycle.j(this);
        this.x1 = true;
        Y0();
    }

    @Override // o.C5240b5.k
    @Deprecated
    public final void Q(int i) {
    }

    @Deprecated
    public void b1(Fragment fragment) {
    }
}
