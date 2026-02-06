package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: o.g30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC6458g30 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final int A2 = 3;
    public static final String B2 = "android:savedDialogState";
    public static final String C2 = "android:style";
    public static final String D2 = "android:theme";
    public static final String E2 = "android:cancelable";
    public static final String F2 = "android:showsDialog";
    public static final String G2 = "android:backStackId";
    public static final String H2 = "android:dialogShowing";
    public static final int x2 = 0;
    public static final int y2 = 1;
    public static final int z2 = 2;
    public Handler h2;
    public Runnable i2;
    public DialogInterface.OnCancelListener j2;
    public DialogInterface.OnDismissListener k2;
    public int l2;
    public int m2;
    public boolean n2;
    public boolean o2;
    public int p2;
    public boolean q2;
    public InterfaceC3583Lt1<KZ0> r2;
    public Dialog s2;
    public boolean t2;
    public boolean u2;
    public boolean v2;
    public boolean w2;

    /* renamed from: o.g30$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterface$OnCancelListenerC6458g30.this.k2.onDismiss(DialogInterface$OnCancelListenerC6458g30.this.s2);
        }
    }

    /* renamed from: o.g30$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC6458g30.this.s2 != null) {
                DialogInterface$OnCancelListenerC6458g30 dialogInterface$OnCancelListenerC6458g30 = DialogInterface$OnCancelListenerC6458g30.this;
                dialogInterface$OnCancelListenerC6458g30.onCancel(dialogInterface$OnCancelListenerC6458g30.s2);
            }
        }
    }

    /* renamed from: o.g30$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC6458g30.this.s2 != null) {
                DialogInterface$OnCancelListenerC6458g30 dialogInterface$OnCancelListenerC6458g30 = DialogInterface$OnCancelListenerC6458g30.this;
                dialogInterface$OnCancelListenerC6458g30.onDismiss(dialogInterface$OnCancelListenerC6458g30.s2);
            }
        }
    }

    /* renamed from: o.g30$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC3583Lt1<KZ0> {
        public d() {
        }

        @Override // o.InterfaceC3583Lt1
        /* renamed from: a */
        public void b(KZ0 kz0) {
            if (kz0 != null && DialogInterface$OnCancelListenerC6458g30.this.o2) {
                View Y1 = DialogInterface$OnCancelListenerC6458g30.this.Y1();
                if (Y1.getParent() == null) {
                    if (DialogInterface$OnCancelListenerC6458g30.this.s2 != null) {
                        if (FragmentManager.X0(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterface$OnCancelListenerC6458g30.this.s2);
                        }
                        DialogInterface$OnCancelListenerC6458g30.this.s2.setContentView(Y1);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    /* renamed from: o.g30$e */
    /* loaded from: classes.dex */
    public class e extends AbstractC5216az0 {
        public final /* synthetic */ AbstractC5216az0 X;

        public e(AbstractC5216az0 abstractC5216az0) {
            this.X = abstractC5216az0;
        }

        @Override // o.AbstractC5216az0
        public View d(int i) {
            if (this.X.e()) {
                return this.X.d(i);
            }
            return DialogInterface$OnCancelListenerC6458g30.this.S2(i);
        }

        @Override // o.AbstractC5216az0
        public boolean e() {
            if (!this.X.e() && !DialogInterface$OnCancelListenerC6458g30.this.T2()) {
                return false;
            }
            return true;
        }
    }

    public DialogInterface$OnCancelListenerC6458g30() {
        this.i2 = new a();
        this.j2 = new b();
        this.k2 = new c();
        this.l2 = 0;
        this.m2 = 0;
        this.n2 = true;
        this.o2 = true;
        this.p2 = -1;
        this.r2 = new d();
        this.w2 = false;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void H0(Bundle bundle) {
        super.H0(bundle);
    }

    public void J2() {
        L2(false, false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void K0(Context context) {
        super.K0(context);
        p0().l(this.r2);
        if (!this.v2) {
            this.u2 = false;
        }
    }

    public void K2() {
        L2(true, false, false);
    }

    public final void L2(boolean z, boolean z3, boolean z4) {
        if (this.u2) {
            return;
        }
        this.u2 = true;
        this.v2 = false;
        Dialog dialog = this.s2;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.s2.dismiss();
            if (!z3) {
                if (Looper.myLooper() == this.h2.getLooper()) {
                    onDismiss(this.s2);
                } else {
                    this.h2.post(this.i2);
                }
            }
        }
        this.t2 = true;
        if (this.p2 >= 0) {
            if (z4) {
                O().s1(this.p2, 1);
            } else {
                O().p1(this.p2, 1, z);
            }
            this.p2 = -1;
            return;
        }
        androidx.fragment.app.j u = O().u();
        u.M(true);
        u.x(this);
        if (z4) {
            u.o();
        } else if (z) {
            u.n();
        } else {
            u.m();
        }
    }

    public void M2() {
        L2(false, false, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void N0(Bundle bundle) {
        boolean z;
        super.N0(bundle);
        this.h2 = new Handler();
        if (this.t1 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.o2 = z;
        if (bundle != null) {
            this.l2 = bundle.getInt(C2, 0);
            this.m2 = bundle.getInt(D2, 0);
            this.n2 = bundle.getBoolean(E2, true);
            this.o2 = bundle.getBoolean(F2, this.o2);
            this.p2 = bundle.getInt(G2, -1);
        }
    }

    public Dialog N2() {
        return this.s2;
    }

    public boolean O2() {
        return this.o2;
    }

    public int P2() {
        return this.m2;
    }

    public boolean Q2() {
        return this.n2;
    }

    public Dialog R2(Bundle bundle) {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC11160zI(U1(), P2());
    }

    public View S2(int i) {
        Dialog dialog = this.s2;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean T2() {
        return this.w2;
    }

    @Override // androidx.fragment.app.Fragment
    public void U0() {
        super.U0();
        Dialog dialog = this.s2;
        if (dialog != null) {
            this.t2 = true;
            dialog.setOnDismissListener(null);
            this.s2.dismiss();
            if (!this.u2) {
                onDismiss(this.s2);
            }
            this.s2 = null;
            this.w2 = false;
        }
    }

    public final void U2(Bundle bundle) {
        if (this.o2 && !this.w2) {
            try {
                this.q2 = true;
                Dialog R2 = R2(bundle);
                this.s2 = R2;
                if (this.o2) {
                    a3(R2, this.l2);
                    Context v = v();
                    if (v instanceof Activity) {
                        this.s2.setOwnerActivity((Activity) v);
                    }
                    this.s2.setCancelable(this.n2);
                    this.s2.setOnCancelListener(this.j2);
                    this.s2.setOnDismissListener(this.k2);
                    this.w2 = true;
                } else {
                    this.s2 = null;
                }
                this.q2 = false;
            } catch (Throwable th) {
                this.q2 = false;
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void V0() {
        super.V0();
        if (!this.v2 && !this.u2) {
            this.u2 = true;
        }
        p0().p(this.r2);
    }

    public final DialogC11160zI V2() {
        Dialog W2 = W2();
        if (W2 instanceof DialogC11160zI) {
            return (DialogC11160zI) W2;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + W2);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater W0(Bundle bundle) {
        LayoutInflater W0 = super.W0(bundle);
        if (this.o2 && !this.q2) {
            U2(bundle);
            if (FragmentManager.X0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.s2;
            if (dialog != null) {
                return W0.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.X0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.o2) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return W0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return W0;
    }

    public final Dialog W2() {
        Dialog N2 = N2();
        if (N2 != null) {
            return N2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void X2(boolean z) {
        this.n2 = z;
        Dialog dialog = this.s2;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void Y2(boolean z) {
        this.o2 = z;
    }

    public void Z2(int i, int i2) {
        if (FragmentManager.X0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + C6566gU0.h + i2);
        }
        this.l2 = i;
        if (i == 2 || i == 3) {
            this.m2 = 16973913;
        }
        if (i2 != 0) {
            this.m2 = i2;
        }
    }

    public void a3(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int b3(androidx.fragment.app.j jVar, String str) {
        this.u2 = false;
        this.v2 = true;
        jVar.g(this, str);
        this.t2 = false;
        int m = jVar.m();
        this.p2 = m;
        return m;
    }

    public void c3(FragmentManager fragmentManager, String str) {
        this.u2 = false;
        this.v2 = true;
        androidx.fragment.app.j u = fragmentManager.u();
        u.M(true);
        u.g(this, str);
        u.m();
    }

    public void d3(FragmentManager fragmentManager, String str) {
        this.u2 = false;
        this.v2 = true;
        androidx.fragment.app.j u = fragmentManager.u();
        u.M(true);
        u.g(this, str);
        u.o();
    }

    @Override // androidx.fragment.app.Fragment
    public AbstractC5216az0 j() {
        return new e(super.j());
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Bundle bundle) {
        super.j1(bundle);
        Dialog dialog = this.s2;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(H2, false);
            bundle.putBundle(B2, onSaveInstanceState);
        }
        int i = this.l2;
        if (i != 0) {
            bundle.putInt(C2, i);
        }
        int i2 = this.m2;
        if (i2 != 0) {
            bundle.putInt(D2, i2);
        }
        boolean z = this.n2;
        if (!z) {
            bundle.putBoolean(E2, z);
        }
        boolean z3 = this.o2;
        if (!z3) {
            bundle.putBoolean(F2, z3);
        }
        int i3 = this.p2;
        if (i3 != -1) {
            bundle.putInt(G2, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void k1() {
        super.k1();
        Dialog dialog = this.s2;
        if (dialog != null) {
            this.t2 = false;
            dialog.show();
            View decorView = this.s2.getWindow().getDecorView();
            C9216rI2.b(decorView, this);
            C10434wI2.b(decorView, this);
            C9945uI2.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void l1() {
        super.l1();
        Dialog dialog = this.s2;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        Bundle bundle2;
        super.n1(bundle);
        if (this.s2 != null && bundle != null && (bundle2 = bundle.getBundle(B2)) != null) {
            this.s2.onRestoreInstanceState(bundle2);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.t2) {
            if (FragmentManager.X0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            L2(true, true, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void u1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.u1(layoutInflater, viewGroup, bundle);
        if (this.D1 == null && this.s2 != null && bundle != null && (bundle2 = bundle.getBundle(B2)) != null) {
            this.s2.onRestoreInstanceState(bundle2);
        }
    }

    public DialogInterface$OnCancelListenerC6458g30(int i) {
        super(i);
        this.i2 = new a();
        this.j2 = new b();
        this.k2 = new c();
        this.l2 = 0;
        this.m2 = 0;
        this.n2 = true;
        this.o2 = true;
        this.p2 = -1;
        this.r2 = new d();
        this.w2 = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
