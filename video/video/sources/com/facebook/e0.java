package com.facebook;

import android.content.SharedPreferences;
import com.google.android.gms.common.Scopes;
import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e0 {
    @NotNull
    public static final a b = new a(null);
    @NotNull
    public static final String c = "com.facebook.ProfileManager.CachedProfile";
    @NotNull
    public static final String d = "com.facebook.AccessTokenManager.SharedPreferences";
    @NotNull
    public final SharedPreferences a;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public e0() {
        M m = M.a;
        SharedPreferences sharedPreferences = M.n().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C6562gT0.o(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final void a() {
        this.a.edit().remove(c).apply();
    }

    @Nullable
    public final d0 b() {
        String string = this.a.getString(c, null);
        if (string != null) {
            try {
                return new d0(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(@NotNull d0 d0Var) {
        C6562gT0.p(d0Var, Scopes.a);
        JSONObject q = d0Var.q();
        if (q != null) {
            this.a.edit().putString(c, q.toString()).apply();
        }
    }
}
