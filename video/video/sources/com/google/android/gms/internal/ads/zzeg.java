package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeg extends BroadcastReceiver {
    public final /* synthetic */ zzei a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        Executor executor;
        executor = this.a.a;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzef
            @Override // java.lang.Runnable
            public final void run() {
                zzei.d(zzeg.this.a, context);
            }
        });
    }
}
