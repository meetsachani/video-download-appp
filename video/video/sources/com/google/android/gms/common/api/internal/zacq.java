package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zacq implements Runnable {
    public final /* synthetic */ zact X;

    public zacq(zact zactVar) {
        this.X = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zacs zacsVar;
        zacsVar = this.X.b1;
        zacsVar.c(new ConnectionResult(4));
    }
}
