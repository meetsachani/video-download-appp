package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzawu extends BroadcastReceiver {
    public final /* synthetic */ zzawv a;

    public zzawu(zzawv zzawvVar) {
        this.a = zzawvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.f();
    }
}
