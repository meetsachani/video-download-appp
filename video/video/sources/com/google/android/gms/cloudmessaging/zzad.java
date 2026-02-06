package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzad extends com.google.android.gms.internal.cloudmessaging.zzf {
    public final /* synthetic */ Rpc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(Rpc rpc, Looper looper) {
        super(looper);
        this.b = rpc;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Rpc.e(this.b, message);
    }
}
