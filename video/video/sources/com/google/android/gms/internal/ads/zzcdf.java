package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdf implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zzcdi Y0;
    public final /* synthetic */ int Z;

    public zzcdf(zzcdi zzcdiVar, String str, String str2, int i) {
        this.X = str;
        this.Y = str2;
        this.Z = i;
        this.Y0 = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.X);
        hashMap.put("cachedSrc", this.Y);
        hashMap.put("totalBytes", Integer.toString(this.Z));
        zzcdi.k(this.Y0, "onPrecacheEvent", hashMap);
    }
}
