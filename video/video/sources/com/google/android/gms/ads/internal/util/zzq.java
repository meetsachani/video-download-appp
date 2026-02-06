package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzq extends BroadcastReceiver {
    public final /* synthetic */ zzs a;

    public /* synthetic */ zzq(zzs zzsVar, zzr zzrVar) {
        this.a = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            zzs.L(this.a, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzs.L(this.a, false);
        }
    }
}
