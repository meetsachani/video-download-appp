package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcbj implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ zzcbk Y;

    public zzcbj(zzcbk zzcbkVar, boolean z) {
        this.X = z;
        this.Y = zzcbkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.t("windowVisibilityChanged", "isVisible", String.valueOf(this.X));
    }
}
