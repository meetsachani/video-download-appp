package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
final class zzcdc implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Y0;
    public final /* synthetic */ int Z;
    public final /* synthetic */ zzcdi Z0;

    public zzcdc(zzcdi zzcdiVar, String str, String str2, int i, int i2, boolean z) {
        this.X = str;
        this.Y = str2;
        this.Z = i;
        this.Y0 = i2;
        this.Z0 = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.X);
        hashMap.put("cachedSrc", this.Y);
        hashMap.put("bytesLoaded", Integer.toString(this.Z));
        hashMap.put("totalBytes", Integer.toString(this.Y0));
        hashMap.put("cacheReady", "0");
        zzcdi.k(this.Z0, "onPrecacheEvent", hashMap);
    }
}
