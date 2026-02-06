package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.Metadata;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzv {
    public final Context a;
    public int b;
    public int c = 0;

    public zzv(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = Wrappers.a(this.a).f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public final synchronized int b() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        if (Wrappers.a(context).b(Metadata.f, "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!PlatformVersion.n()) {
            Intent intent = new Intent(Metadata.i);
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.c = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent(Metadata.h);
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i2 = 2;
            this.c = i2;
            return i2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == PlatformVersion.n()) {
            i2 = 2;
        }
        this.c = i2;
        return i2;
    }
}
