package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o.C6200f21;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2405n {
    @NotNull
    public static final a d = new a(null);
    public static final String e = AbstractC2405n.class.getSimpleName();
    @NotNull
    public final BroadcastReceiver a;
    @NotNull
    public final C6200f21 b;
    public boolean c;

    /* renamed from: com.facebook.n$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.n$b */
    /* loaded from: classes2.dex */
    public final class b extends BroadcastReceiver {
        public final /* synthetic */ AbstractC2405n a;

        public b(AbstractC2405n abstractC2405n) {
            C6562gT0.p(abstractC2405n, "this$0");
            this.a = abstractC2405n;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            C6562gT0.p(context, "context");
            C6562gT0.p(intent, C9998uW1.R);
            if (C6562gT0.g(AuthenticationTokenManager.f, intent.getAction())) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                com.facebook.internal.l0.m0(AbstractC2405n.e, "AuthenticationTokenChanged");
                this.a.d((C2381j) intent.getParcelableExtra(AuthenticationTokenManager.g), (C2381j) intent.getParcelableExtra(AuthenticationTokenManager.h));
            }
        }
    }

    public AbstractC2405n() {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.w();
        this.a = new b(this);
        M m = M.a;
        C6200f21 b2 = C6200f21.b(M.n());
        C6562gT0.o(b2, "getInstance(FacebookSdk.getApplicationContext())");
        this.b = b2;
        e();
    }

    public final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AuthenticationTokenManager.f);
        this.b.c(this.a, intentFilter);
    }

    public final boolean c() {
        return this.c;
    }

    public abstract void d(@Nullable C2381j c2381j, @Nullable C2381j c2381j2);

    public final void e() {
        if (this.c) {
            return;
        }
        b();
        this.c = true;
    }

    public final void f() {
        if (!this.c) {
            return;
        }
        this.b.f(this.a);
        this.c = false;
    }
}
