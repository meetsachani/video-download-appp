package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzays extends BroadcastReceiver {
    public final /* synthetic */ zzayv a;

    public zzays(zzayv zzayvVar) {
        this.a = zzayvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.j(3);
    }
}
