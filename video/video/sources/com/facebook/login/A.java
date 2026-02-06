package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.common.b;
import com.facebook.login.w;
import o.AbstractC8052mY0;
import o.ActivityC4864Yy0;
import o.BY0;
import o.C6562gT0;
import o.C7458kA2;
import o.C9516sY;
import o.G5;
import o.H5;
import o.HA0;
import o.P5;
import o.X5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class A extends Fragment {
    @NotNull
    public static final a m2 = new a(null);
    @NotNull
    public static final String n2 = "com.facebook.LoginFragment:Result";
    @NotNull
    public static final String o2 = "com.facebook.LoginFragment:Request";
    @NotNull
    public static final String p2 = "request";
    @NotNull
    public static final String q2 = "LoginFragment";
    @NotNull
    public static final String r2 = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
    @NotNull
    public static final String s2 = "loginClient";
    @Nullable
    public String h2;
    @Nullable
    public w.e i2;
    public w j2;
    public X5<Intent> k2;
    public View l2;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<G5, C7458kA2> {
        public final /* synthetic */ ActivityC4864Yy0 Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ActivityC4864Yy0 activityC4864Yy0) {
            super(1);
            this.Y = activityC4864Yy0;
        }

        public final void c(@NotNull G5 g5) {
            C6562gT0.p(g5, "result");
            if (g5.b() == -1) {
                A.this.N2().L(w.h1.b(), g5.b(), g5.a());
            } else {
                this.Y.finish();
            }
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(G5 g5) {
            c(g5);
            return C7458kA2.a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements w.a {
        public c() {
        }

        @Override // com.facebook.login.w.a
        public void a() {
            A.this.W2();
        }

        @Override // com.facebook.login.w.a
        public void b() {
            A.this.P2();
        }
    }

    public static final void R2(A a2, w.f fVar) {
        C6562gT0.p(a2, "this$0");
        C6562gT0.p(fVar, "outcome");
        a2.T2(fVar);
    }

    public static final void S2(HA0 ha0, G5 g5) {
        C6562gT0.p(ha0, "$tmp0");
        ha0.invoke(g5);
    }

    @Override // androidx.fragment.app.Fragment
    public void I0(int i, int i2, @Nullable Intent intent) {
        super.I0(i, i2, intent);
        N2().L(i, i2, intent);
    }

    @NotNull
    public w K2() {
        return new w(this);
    }

    @NotNull
    public final X5<Intent> L2() {
        X5<Intent> x5 = this.k2;
        if (x5 != null) {
            return x5;
        }
        C6562gT0.S("launcher");
        throw null;
    }

    @BY0
    public int M2() {
        return b.k.G;
    }

    @Override // androidx.fragment.app.Fragment
    public void N0(@Nullable Bundle bundle) {
        w wVar;
        Bundle bundleExtra;
        super.N0(bundle);
        if (bundle == null) {
            wVar = null;
        } else {
            wVar = (w) bundle.getParcelable(s2);
        }
        if (wVar != null) {
            wVar.S(this);
        } else {
            wVar = K2();
        }
        this.j2 = wVar;
        N2().X(new w.d() { // from class: com.facebook.login.y
            @Override // com.facebook.login.w.d
            public final void a(w.f fVar) {
                A.R2(A.this, fVar);
            }
        });
        ActivityC4864Yy0 o3 = o();
        if (o3 == null) {
            return;
        }
        Q2(o3);
        Intent intent = o3.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra(o2)) != null) {
            this.i2 = (w.e) bundleExtra.getParcelable("request");
        }
        P5.m mVar = new P5.m();
        final HA0<G5, C7458kA2> O2 = O2(o3);
        X5<Intent> X = X(mVar, new H5() { // from class: com.facebook.login.z
            @Override // o.H5
            public final void a(Object obj) {
                A.S2(HA0.this, (G5) obj);
            }
        });
        C6562gT0.o(X, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.k2 = X;
    }

    @NotNull
    public final w N2() {
        w wVar = this.j2;
        if (wVar != null) {
            return wVar;
        }
        C6562gT0.S(s2);
        throw null;
    }

    public final HA0<G5, C7458kA2> O2(ActivityC4864Yy0 activityC4864Yy0) {
        return new b(activityC4864Yy0);
    }

    public final void P2() {
        View view = this.l2;
        if (view != null) {
            view.setVisibility(8);
            U2();
            return;
        }
        C6562gT0.S("progressBar");
        throw null;
    }

    public final void Q2(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.h2 = callingActivity.getPackageName();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View R0(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C6562gT0.p(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(M2(), viewGroup, false);
        View findViewById = inflate.findViewById(b.h.w0);
        C6562gT0.o(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.l2 = findViewById;
        N2().N(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void S0() {
        N2().d();
        super.S0();
    }

    public final void T2(w.f fVar) {
        int i;
        this.i2 = null;
        if (fVar.X == w.f.a.CANCEL) {
            i = 0;
        } else {
            i = -1;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(n2, fVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        ActivityC4864Yy0 o3 = o();
        if (v0() && o3 != null) {
            o3.setResult(i, intent);
            o3.finish();
        }
    }

    public void U2() {
    }

    public void V2() {
    }

    public final void W2() {
        View view = this.l2;
        if (view != null) {
            view.setVisibility(0);
            V2();
            return;
        }
        C6562gT0.S("progressBar");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void d1() {
        View findViewById;
        super.d1();
        View n0 = n0();
        if (n0 == null) {
            findViewById = null;
        } else {
            findViewById = n0.findViewById(b.h.w0);
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i1() {
        super.i1();
        if (this.h2 == null) {
            Log.e(q2, r2);
            ActivityC4864Yy0 o3 = o();
            if (o3 == null) {
                return;
            }
            o3.finish();
            return;
        }
        N2().Z(this.i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(@NotNull Bundle bundle) {
        C6562gT0.p(bundle, "outState");
        super.j1(bundle);
        bundle.putParcelable(s2, N2());
    }
}
