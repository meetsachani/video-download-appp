package com.facebook;

import android.content.Intent;
import o.C6200f21;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class f0 {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    public static final String e = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";
    @NotNull
    public static final String f = "com.facebook.sdk.EXTRA_OLD_PROFILE";
    @NotNull
    public static final String g = "com.facebook.sdk.EXTRA_NEW_PROFILE";
    public static volatile f0 h;
    @NotNull
    public final C6200f21 a;
    @NotNull
    public final e0 b;
    @Nullable
    public d0 c;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final synchronized f0 a() {
            f0 f0Var;
            try {
                if (f0.h == null) {
                    M m = M.a;
                    C6200f21 b = C6200f21.b(M.n());
                    C6562gT0.o(b, "getInstance(applicationContext)");
                    f0.h = new f0(b, new e0());
                }
                f0Var = f0.h;
                if (f0Var == null) {
                    C6562gT0.S("instance");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return f0Var;
        }

        public a() {
        }
    }

    public f0(@NotNull C6200f21 c6200f21, @NotNull e0 e0Var) {
        C6562gT0.p(c6200f21, "localBroadcastManager");
        C6562gT0.p(e0Var, "profileCache");
        this.a = c6200f21;
        this.b = e0Var;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final synchronized f0 d() {
        f0 a2;
        synchronized (f0.class) {
            a2 = d.a();
        }
        return a2;
    }

    @Nullable
    public final d0 c() {
        return this.c;
    }

    public final boolean e() {
        d0 b = this.b.b();
        if (b == null) {
            return false;
        }
        h(b, false);
        return true;
    }

    public final void f(d0 d0Var, d0 d0Var2) {
        Intent intent = new Intent(e);
        intent.putExtra(f, d0Var);
        intent.putExtra(g, d0Var2);
        this.a.d(intent);
    }

    public final void g(@Nullable d0 d0Var) {
        h(d0Var, true);
    }

    public final void h(d0 d0Var, boolean z) {
        d0 d0Var2 = this.c;
        this.c = d0Var;
        if (z) {
            if (d0Var != null) {
                this.b.c(d0Var);
            } else {
                this.b.a();
            }
        }
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        if (!com.facebook.internal.l0.e(d0Var2, d0Var)) {
            f(d0Var2, d0Var);
        }
    }
}
