package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class zzsl extends Handler {
    public final /* synthetic */ zzsn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsl(zzsn zzsnVar, Looper looper) {
        super(looper);
        this.a = zzsnVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzsn.f(this.a, message);
    }
}
