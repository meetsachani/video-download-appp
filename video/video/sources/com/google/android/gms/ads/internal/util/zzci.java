package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbcv;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zzci {
    public boolean d;
    public Context e;
    public boolean c = false;
    public final Map b = new WeakHashMap();
    public final BroadcastReceiver a = new zzch(this);

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void b(Context context) {
        try {
            if (this.c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.e = applicationContext;
            if (applicationContext == null) {
                this.e = context;
            }
            zzbcv.a(this.e);
            this.d = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e4)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ob)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
                this.e.registerReceiver(this.a, intentFilter, 4);
            } else {
                this.e.registerReceiver(this.a, intentFilter);
            }
            this.c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.d) {
            this.b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbcv.a(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ob)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void e(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
