package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfrl;

/* loaded from: classes2.dex */
public final class zzf extends zzfrl {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.zzfrl
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.v();
            zzs.n(com.google.android.gms.ads.internal.zzv.t().e(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "AdMobHandler.handleMessage");
        }
    }
}
