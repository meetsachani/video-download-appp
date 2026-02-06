package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfkf extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzfkg a;

    public zzfkf(zzfkg zzfkgVar) {
        this.a = zzfkgVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.r(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.r(false);
    }
}
