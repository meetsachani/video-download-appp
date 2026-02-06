package com.google.android.gms.common.api.internal;

/* loaded from: classes2.dex */
final class zacr implements Runnable {
    public final /* synthetic */ com.google.android.gms.signin.internal.zak X;
    public final /* synthetic */ zact Y;

    public zacr(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.Y = zactVar;
        this.X = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.B5(this.Y, this.X);
    }
}
