package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import o.C6562gT0;
import o.C7458kA2;
import o.C9516sY;
import o.C9998uW1;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2328b {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    public static final String e = "com.facebook.AccessTokenManager.CachedAccessToken";
    @NotNull
    public final SharedPreferences a;
    @NotNull
    public final C0075b b;
    @Nullable
    public a0 c;

    /* renamed from: com.facebook.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0075b {
        @NotNull
        public final a0 a() {
            M m = M.a;
            return new a0(M.n(), null, 2, null);
        }
    }

    public C2328b(@NotNull SharedPreferences sharedPreferences, @NotNull C0075b c0075b) {
        C6562gT0.p(sharedPreferences, "sharedPreferences");
        C6562gT0.p(c0075b, "tokenCachingStrategyFactory");
        this.a = sharedPreferences;
        this.b = c0075b;
    }

    public final void a() {
        this.a.edit().remove(e).apply();
        if (h()) {
            d().a();
        }
    }

    public final C0376a b() {
        String string = this.a.getString(e, null);
        if (string == null) {
            return null;
        }
        try {
            return C0376a.g1.d(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final C0376a c() {
        Bundle l = d().l();
        if (l != null && a0.c.j(l)) {
            return C0376a.g1.e(l);
        }
        return null;
    }

    public final a0 d() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            if (this.c == null) {
                synchronized (this) {
                    if (this.c == null) {
                        this.c = this.b.a();
                    }
                    C7458kA2 c7458kA2 = C7458kA2.a;
                }
            }
            a0 a0Var = this.c;
            if (a0Var != null) {
                return a0Var;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean e() {
        return this.a.contains(e);
    }

    @Nullable
    public final C0376a f() {
        if (e()) {
            return b();
        }
        if (h()) {
            C0376a c = c();
            if (c != null) {
                g(c);
                d().a();
            }
            return c;
        }
        return null;
    }

    public final void g(@NotNull C0376a c0376a) {
        C6562gT0.p(c0376a, C9998uW1.m);
        try {
            this.a.edit().putString(e, c0376a.L().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final boolean h() {
        M m = M.a;
        return M.O();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2328b() {
        this(r0, new C0075b());
        M m = M.a;
        SharedPreferences sharedPreferences = M.n().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C6562gT0.o(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
    }
}
