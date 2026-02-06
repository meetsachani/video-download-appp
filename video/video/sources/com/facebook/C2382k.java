package com.facebook;

import android.content.SharedPreferences;
import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2382k {
    @NotNull
    public static final a b = new a(null);
    @NotNull
    public static final String c = "com.facebook.AuthenticationManager.CachedAuthenticationToken";
    @NotNull
    public final SharedPreferences a;

    /* renamed from: com.facebook.k$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C2382k(@NotNull SharedPreferences sharedPreferences) {
        C6562gT0.p(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    public final void a() {
        this.a.edit().remove(c).apply();
    }

    public final C2381j b() {
        String string = this.a.getString(c, null);
        if (string == null) {
            return null;
        }
        try {
            return new C2381j(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean c() {
        return this.a.contains(c);
    }

    @Nullable
    public final C2381j d() {
        if (c()) {
            return b();
        }
        return null;
    }

    public final void e(@NotNull C2381j c2381j) {
        C6562gT0.p(c2381j, "authenticationToken");
        try {
            this.a.edit().putString(c, c2381j.k().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2382k() {
        this(r0);
        M m = M.a;
        SharedPreferences sharedPreferences = M.n().getSharedPreferences(AuthenticationTokenManager.i, 0);
        C6562gT0.o(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
    }
}
