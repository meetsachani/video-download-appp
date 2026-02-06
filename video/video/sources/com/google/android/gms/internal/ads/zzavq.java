package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzavq extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzavr a;

    public zzavq(zzavr zzavrVar) {
        this.a = zzavrVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzavr.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzavr.class) {
            this.a.a = null;
        }
    }
}
