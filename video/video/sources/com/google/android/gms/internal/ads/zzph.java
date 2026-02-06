package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class zzph extends BroadcastReceiver {
    public final /* synthetic */ zzpj a;

    public /* synthetic */ zzph(zzpj zzpjVar, zzpi zzpiVar) {
        this.a = zzpjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            zzpj zzpjVar = this.a;
            zzpj.f(zzpjVar, zzpe.d(context, intent, zzpj.b(zzpjVar), zzpj.d(zzpjVar)));
        }
    }
}
