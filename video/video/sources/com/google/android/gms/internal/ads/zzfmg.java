package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfmg extends BroadcastReceiver {
    public final /* synthetic */ zzfmh a;

    public zzfmg(zzfmh zzfmhVar) {
        this.a = zzfmhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        boolean z2;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfmh zzfmhVar = this.a;
            z2 = zzfmhVar.c;
            zzfmhVar.d(true, z2);
            zzfmhVar.b = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfmh zzfmhVar2 = this.a;
            z = zzfmhVar2.c;
            zzfmhVar2.d(false, z);
            zzfmhVar2.b = false;
        }
    }
}
