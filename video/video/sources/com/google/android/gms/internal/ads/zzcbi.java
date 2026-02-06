package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcbi implements Runnable {
    public final /* synthetic */ zzcbk X;

    public zzcbi(zzcbk zzcbkVar) {
        this.X = zzcbkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.X.t("surfaceDestroyed", new String[0]);
    }
}
