package com.google.android.gms.ads.internal.util.client;

/* loaded from: classes2.dex */
final class zzd extends Thread {
    public final /* synthetic */ String X;

    public zzd(zzf zzfVar, String str) {
        this.X = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(null).w(this.X);
    }
}
