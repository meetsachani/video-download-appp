package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.common.b;
import com.facebook.internal.C2371p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.ActivityC4864Yy0;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import o.InterfaceC3905Pc0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class FacebookActivity extends ActivityC4864Yy0 {
    @NotNull
    public static final String B1 = "PassThrough";
    @NotNull
    public static final String C1 = "SingleFragment";
    @Nullable
    public Fragment z1;
    @NotNull
    public static final a A1 = new a(null);
    public static final String D1 = FacebookActivity.class.getName();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void dump(@NotNull String str, @Nullable FileDescriptor fileDescriptor, @NotNull PrintWriter printWriter, @Nullable String[] strArr) {
        Boolean valueOf;
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(str, "prefix");
                C6562gT0.p(printWriter, "writer");
                InterfaceC3905Pc0 a2 = InterfaceC3905Pc0.a.a();
                if (a2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(a2.a(str, printWriter, strArr));
                }
                if (C6562gT0.g(valueOf, Boolean.TRUE)) {
                    return;
                }
                super.dump(str, fileDescriptor, printWriter, strArr);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Nullable
    public final Fragment m1() {
        return this.z1;
    }

    @NotNull
    public Fragment n1() {
        Intent intent = getIntent();
        FragmentManager W0 = W0();
        C6562gT0.o(W0, "supportFragmentManager");
        Fragment s0 = W0.s0(C1);
        if (s0 == null) {
            if (C6562gT0.g(C2371p.K2, intent.getAction())) {
                C2371p c2371p = new C2371p();
                c2371p.s2(true);
                c2371p.c3(W0, C1);
                return c2371p;
            }
            com.facebook.login.A a2 = new com.facebook.login.A();
            a2.s2(true);
            W0.u().c(b.h.v0, a2, C1).m();
            return a2;
        }
        return s0;
    }

    public final void o1() {
        Intent intent = getIntent();
        com.facebook.internal.Z z = com.facebook.internal.Z.a;
        C6562gT0.o(intent, "requestIntent");
        C2416z u = com.facebook.internal.Z.u(com.facebook.internal.Z.z(intent));
        Intent intent2 = getIntent();
        C6562gT0.o(intent2, C9998uW1.R);
        setResult(0, com.facebook.internal.Z.n(intent2, null, u));
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        C6562gT0.p(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.z1;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(configuration);
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        M m = M.a;
        if (!M.N()) {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            com.facebook.internal.l0.m0(D1, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            C6562gT0.o(applicationContext, "applicationContext");
            M.V(applicationContext);
        }
        setContentView(b.k.E);
        if (C6562gT0.g(B1, intent.getAction())) {
            o1();
        } else {
            this.z1 = n1();
        }
    }
}
