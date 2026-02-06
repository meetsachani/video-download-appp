package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzch extends BroadcastReceiver {
    public final /* synthetic */ zzci a;

    public zzch(zzci zzciVar) {
        this.a = zzciVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.e(context, intent);
    }
}
