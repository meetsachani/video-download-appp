package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;
import o.C9273rY;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeuk implements zzetv {
    public final zzgdj a;
    public final Context b;

    public zzeuk(zzgdj zzgdjVar, Context context) {
        this.a = zzgdjVar;
        this.b = context;
    }

    public static /* synthetic */ zzeui c(zzeuk zzeukVar) {
        boolean z;
        int i;
        Context context = zzeukVar.b;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzv.v();
        int i2 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.b(context, C9273rY.b)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i2 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
        } else {
            z = false;
            i = -2;
        }
        return new zzeui(networkOperator, i, com.google.android.gms.ads.internal.zzv.w().k(context), phoneType, z, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuk.c(zzeuk.this);
            }
        });
    }
}
