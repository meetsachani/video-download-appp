package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class Metadata {
    public static final String f = "com.google.android.c2dm.permission.SEND";
    public static final String g = "com.google.android.gms";
    public static final String h = "com.google.iid.TOKEN_REQUEST";
    public static final String i = "com.google.android.c2dm.intent.REGISTER";
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public final Context a;
    @InterfaceC8710pF0("this")
    public String b;
    @InterfaceC8710pF0("this")
    public String c;
    @InterfaceC8710pF0("this")
    public int d;
    @InterfaceC8710pF0("this")
    public int e = 0;

    public Metadata(Context context) {
        this.a = context;
    }

    public static String c(FirebaseApp firebaseApp) {
        String m = firebaseApp.s().m();
        if (m != null) {
            return m;
        }
        String j2 = firebaseApp.s().j();
        if (!j2.startsWith("1:")) {
            return j2;
        }
        String[] split = j2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String a() {
        try {
            if (this.b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public synchronized String b() {
        try {
            if (this.c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public synchronized int d() {
        PackageInfo f2;
        try {
            if (this.d == 0 && (f2 = f("com.google.android.gms")) != null) {
                this.d = f2.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public synchronized int e() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission(f, "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.n()) {
            Intent intent = new Intent(i);
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent(h);
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.n()) {
            this.e = 2;
        } else {
            this.e = 1;
        }
        return this.e;
    }

    public final PackageInfo f(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public boolean g() {
        if (e() != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void h() {
        PackageInfo f2 = f(this.a.getPackageName());
        if (f2 != null) {
            this.b = Integer.toString(f2.versionCode);
            this.c = f2.versionName;
        }
    }
}
