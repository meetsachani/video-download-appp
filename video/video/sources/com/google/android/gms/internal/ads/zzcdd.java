package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdd implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ long Y0;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long Z0;
    public final /* synthetic */ long a1;
    public final /* synthetic */ long b1;
    public final /* synthetic */ boolean c1;
    public final /* synthetic */ int d1;
    public final /* synthetic */ int e1;
    public final /* synthetic */ zzcdi f1;

    public zzcdd(zzcdi zzcdiVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.X = str;
        this.Y = str2;
        this.Z = j;
        this.Y0 = j2;
        this.Z0 = j3;
        this.a1 = j4;
        this.b1 = j5;
        this.c1 = z;
        this.d1 = i;
        this.e1 = i2;
        this.f1 = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.X);
        hashMap.put("cachedSrc", this.Y);
        hashMap.put("bufferedDuration", Long.toString(this.Z));
        hashMap.put("totalDuration", Long.toString(this.Y0));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.Z0));
            hashMap.put("qoeCachedBytes", Long.toString(this.a1));
            hashMap.put("totalBytes", Long.toString(this.b1));
            hashMap.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzv.d().a()));
        }
        if (true != this.c1) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("cacheReady", str);
        hashMap.put("playerCount", Integer.toString(this.d1));
        hashMap.put("playerPreparedCount", Integer.toString(this.e1));
        zzcdi.k(this.f1, "onPrecacheEvent", hashMap);
    }
}
