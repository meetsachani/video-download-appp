package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeoe implements zzetv {
    public final zzgdj a;
    public final Context b;

    public zzeoe(zzgdj zzgdjVar, Context context) {
        this.a = zzgdjVar;
        this.b = context;
    }

    public static /* synthetic */ zzeof c(zzeoe zzeoeVar) {
        boolean z;
        double d = -1.0d;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.oc)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) zzeoeVar.b.getSystemService("batterymanager");
            if (batteryManager != null) {
                d = batteryManager.getIntProperty(4) / 100.0d;
            }
            if (batteryManager != null) {
                z = batteryManager.isCharging();
            } else {
                z = e(zzeoeVar.d());
            }
        } else {
            Intent d2 = zzeoeVar.d();
            boolean e = e(d2);
            if (d2 != null) {
                d = d2.getIntExtra(FirebaseAnalytics.Param.t, -1) / d2.getIntExtra("scale", -1);
            }
            z = e;
        }
        return new zzeof(d, z);
    }

    public static final boolean e(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    @SuppressLint({"UnprotectedReceiver"})
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzeod
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeoe.c(zzeoe.this);
            }
        });
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final Intent d() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ob)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = this.b.registerReceiver(null, intentFilter, 4);
            return registerReceiver;
        }
        return this.b.registerReceiver(null, intentFilter);
    }
}
