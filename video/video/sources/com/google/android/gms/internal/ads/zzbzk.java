package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbzk extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzbzn a;

    public zzbzk(zzbzn zzbznVar) {
        this.a = zzbznVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.f234o;
        atomicBoolean.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.f234o;
        atomicBoolean.set(false);
    }
}
