package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class IdManager implements InstallIdProvider {
    public static final String g = "0.0";
    public static final String h = "crashlytics.advertising.id";
    public static final String i = "crashlytics.installation.id";
    public static final String j = "firebase.installation.id";
    public static final String k = "crashlytics.installation.id";
    public static final String m = "SYN_";
    public final InstallerPackageNameProvider a;
    public final Context b;
    public final String c;
    public final FirebaseInstallationsApi d;
    public final DataCollectionArbiter e;
    public InstallIdProvider.InstallIds f;
    public static final Pattern l = Pattern.compile("[^\\p{Alnum}]");
    public static final String n = Pattern.quote(RemoteSettings.i);

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context != null) {
            if (str != null) {
                this.b = context;
                this.c = str;
                this.d = firebaseInstallationsApi;
                this.e = dataCollectionArbiter;
                this.a = new InstallerPackageNameProvider();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public static String c() {
        return m + UUID.randomUUID().toString();
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return l.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        if (str != null && str.startsWith(m)) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    @InterfaceC5670cr1
    public synchronized InstallIdProvider.InstallIds a() {
        if (!n()) {
            return this.f;
        }
        Logger.f().k("Determining Crashlytics installation ID...");
        SharedPreferences r = CommonUtils.r(this.b);
        String string = r.getString(j, null);
        Logger f = Logger.f();
        f.k("Cached Firebase Installation ID: " + string);
        if (this.e.d()) {
            String d = d();
            Logger f2 = Logger.f();
            f2.k("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                if (string == null) {
                    d = c();
                } else {
                    d = string;
                }
            }
            if (d.equals(string)) {
                this.f = InstallIdProvider.InstallIds.a(l(r), d);
            } else {
                this.f = InstallIdProvider.InstallIds.a(b(d, r), d);
            }
        } else if (k(string)) {
            this.f = InstallIdProvider.InstallIds.b(l(r));
        } else {
            this.f = InstallIdProvider.InstallIds.b(b(c(), r));
        }
        Logger f3 = Logger.f();
        f3.k("Install IDs: " + this.f);
        return this.f;
    }

    @InterfaceC5670cr1
    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = e(UUID.randomUUID().toString());
        Logger f = Logger.f();
        f.k("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString(j, str).apply();
        return e;
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2(otherwise = 3)
    public String d() {
        try {
            return (String) Utils.f(this.d.getId());
        } catch (Exception e) {
            Logger.f().n("Failed to retrieve Firebase Installation ID.", e);
            return null;
        }
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, com.facebook.share.c.g, m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String str) {
        return str.replaceAll(n, "");
    }

    public final boolean n() {
        InstallIdProvider.InstallIds installIds = this.f;
        if (installIds != null) {
            if (installIds.d() != null || !this.e.d()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
