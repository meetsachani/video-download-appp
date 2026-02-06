package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.C6200f21;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AuthenticationTokenManager {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    public static final String e = "AuthenticationTokenManager";
    @NotNull
    public static final String f = "com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED";
    @NotNull
    public static final String g = "com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN";
    @NotNull
    public static final String h = "com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN";
    @NotNull
    public static final String i = "com.facebook.AuthenticationTokenManager.SharedPreferences";
    @Nullable
    public static AuthenticationTokenManager j;
    @NotNull
    public final C6200f21 a;
    @NotNull
    public final C2382k b;
    @Nullable
    public C2381j c;

    /* loaded from: classes2.dex */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            C6562gT0.p(context, "context");
            C6562gT0.p(intent, C9998uW1.R);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.j;
            if (authenticationTokenManager2 == null) {
                synchronized (this) {
                    authenticationTokenManager = AuthenticationTokenManager.j;
                    if (authenticationTokenManager == null) {
                        M m = M.a;
                        C6200f21 b = C6200f21.b(M.n());
                        C6562gT0.o(b, "getInstance(applicationContext)");
                        AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(b, new C2382k());
                        a aVar = AuthenticationTokenManager.d;
                        AuthenticationTokenManager.j = authenticationTokenManager3;
                        authenticationTokenManager = authenticationTokenManager3;
                    }
                }
                return authenticationTokenManager;
            }
            return authenticationTokenManager2;
        }

        public a() {
        }
    }

    public AuthenticationTokenManager(@NotNull C6200f21 c6200f21, @NotNull C2382k c2382k) {
        C6562gT0.p(c6200f21, "localBroadcastManager");
        C6562gT0.p(c2382k, "authenticationTokenCache");
        this.a = c6200f21;
        this.b = c2382k;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final AuthenticationTokenManager e() {
        return d.a();
    }

    public final void c() {
        g(d(), d());
    }

    @Nullable
    public final C2381j d() {
        return this.c;
    }

    public final boolean f() {
        C2381j d2 = this.b.d();
        if (d2 == null) {
            return false;
        }
        i(d2, false);
        return true;
    }

    public final void g(C2381j c2381j, C2381j c2381j2) {
        M m = M.a;
        Intent intent = new Intent(M.n(), CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction(f);
        intent.putExtra(g, c2381j);
        intent.putExtra(h, c2381j2);
        this.a.d(intent);
    }

    public final void h(@Nullable C2381j c2381j) {
        i(c2381j, true);
    }

    public final void i(C2381j c2381j, boolean z) {
        C2381j d2 = d();
        this.c = c2381j;
        if (z) {
            if (c2381j != null) {
                this.b.e(c2381j);
            } else {
                this.b.a();
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                M m = M.a;
                com.facebook.internal.l0.i(M.n());
            }
        }
        com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
        if (!com.facebook.internal.l0.e(d2, c2381j)) {
            g(d2, c2381j);
        }
    }
}
