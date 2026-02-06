package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o.C6200f21;
import o.C6562gT0;
import o.C9998uW1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class g0 {
    @NotNull
    public final BroadcastReceiver a;
    @NotNull
    public final C6200f21 b;
    public boolean c;

    /* loaded from: classes2.dex */
    public final class a extends BroadcastReceiver {
        public final /* synthetic */ g0 a;

        public a(g0 g0Var) {
            C6562gT0.p(g0Var, "this$0");
            this.a = g0Var;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            C6562gT0.p(context, "context");
            C6562gT0.p(intent, C9998uW1.R);
            if (C6562gT0.g(f0.e, intent.getAction())) {
                this.a.c((d0) intent.getParcelableExtra(f0.f), (d0) intent.getParcelableExtra(f0.g));
            }
        }
    }

    public g0() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        this.a = new a(this);
        M m = M.a;
        C6200f21 b = C6200f21.b(M.n());
        C6562gT0.o(b, "getInstance(FacebookSdk.getApplicationContext())");
        this.b = b;
        d();
    }

    public final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f0.e);
        this.b.c(this.a, intentFilter);
    }

    public final boolean b() {
        return this.c;
    }

    public abstract void c(@Nullable d0 d0Var, @Nullable d0 d0Var2);

    public final void d() {
        if (this.c) {
            return;
        }
        a();
        this.c = true;
    }

    public final void e() {
        if (!this.c) {
            return;
        }
        this.b.f(this.a);
        this.c = false;
    }
}
