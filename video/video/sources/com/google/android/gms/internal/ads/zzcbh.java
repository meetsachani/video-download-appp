package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcbh implements Runnable {
    public final /* synthetic */ zzcbk X;

    public zzcbh(zzcbk zzcbkVar) {
        this.X = zzcbkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.X.t("surfaceCreated", new String[0]);
    }
}
