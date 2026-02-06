package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8223nF0;
import org.json.JSONException;

@KeepForSdk
/* loaded from: classes2.dex */
public class Storage {
    public static final Lock c = new ReentrantLock();
    @InterfaceC11300zs1
    @InterfaceC8223nF0("sLk")
    public static Storage d;
    public final Lock a = new ReentrantLock();
    @InterfaceC8223nF0("mLk")
    public final SharedPreferences b;

    @VisibleForTesting
    public Storage(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static Storage b(@InterfaceC5670cr1 Context context) {
        Preconditions.r(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new Storage(context.getApplicationContext());
            }
            Storage storage = d;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public static final String k(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @KeepForSdk
    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.a.unlock();
        }
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public GoogleSignInAccount c() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g2) && (g = g(k("googleSignInAccount", g2))) != null) {
            try {
                return GoogleSignInAccount.T1(g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public GoogleSignInOptions d() {
        String g;
        String g2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g2) && (g = g(k("googleSignInOptions", g2))) != null) {
            try {
                return GoogleSignInOptions.V0(g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String e() {
        return g("refreshToken");
    }

    @KeepForSdk
    public void f(@InterfaceC5670cr1 GoogleSignInAccount googleSignInAccount, @InterfaceC5670cr1 GoogleSignInOptions googleSignInOptions) {
        Preconditions.r(googleSignInAccount);
        Preconditions.r(googleSignInOptions);
        j("defaultGoogleSignInAccount", googleSignInAccount.c2());
        Preconditions.r(googleSignInAccount);
        Preconditions.r(googleSignInOptions);
        String c2 = googleSignInAccount.c2();
        j(k("googleSignInAccount", c2), googleSignInAccount.i2());
        j(k("googleSignInOptions", c2), googleSignInOptions.I1());
    }

    @InterfaceC11300zs1
    public final String g(@InterfaceC5670cr1 String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final void h(@InterfaceC5670cr1 String str) {
        this.a.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            this.a.unlock();
        }
    }

    public final void i() {
        String g = g("defaultGoogleSignInAccount");
        h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g)) {
            return;
        }
        h(k("googleSignInAccount", g));
        h(k("googleSignInOptions", g));
    }

    public final void j(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
