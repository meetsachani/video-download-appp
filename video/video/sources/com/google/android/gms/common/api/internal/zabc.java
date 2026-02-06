package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zabc extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ zabe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabeVar, Looper looper) {
        super(looper);
        this.a = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
            }
            zabe.P(this.a);
            return;
        }
        zabe.Q(this.a);
    }
}
