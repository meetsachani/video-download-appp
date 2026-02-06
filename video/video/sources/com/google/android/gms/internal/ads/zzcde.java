package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcde implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Y0;
    public final /* synthetic */ int Z;
    public final /* synthetic */ long Z0;
    public final /* synthetic */ long a1;
    public final /* synthetic */ boolean b1;
    public final /* synthetic */ int c1;
    public final /* synthetic */ int d1;
    public final /* synthetic */ zzcdi e1;

    public zzcde(zzcdi zzcdiVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.X = str;
        this.Y = str2;
        this.Z = i;
        this.Y0 = i2;
        this.Z0 = j;
        this.a1 = j2;
        this.b1 = z;
        this.c1 = i3;
        this.d1 = i4;
        this.e1 = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.X);
        hashMap.put("cachedSrc", this.Y);
        hashMap.put("bytesLoaded", Integer.toString(this.Z));
        hashMap.put("totalBytes", Integer.toString(this.Y0));
        hashMap.put("bufferedDuration", Long.toString(this.Z0));
        hashMap.put("totalDuration", Long.toString(this.a1));
        if (true != this.b1) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("cacheReady", str);
        hashMap.put("playerCount", Integer.toString(this.c1));
        hashMap.put("playerPreparedCount", Integer.toString(this.d1));
        zzcdi.k(this.e1, "onPrecacheEvent", hashMap);
    }
}
