package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class zzhs extends BroadcastReceiver {
    public final zzdq a;

    public zzhs(zzhu zzhuVar, zzdq zzdqVar, zzht zzhtVar) {
        this.a = zzdqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.a.h(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzhr
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
