package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzen implements zzdp {
    @InterfaceC11300zs1
    public Message a;

    private zzen() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdp
    public final void a() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        this.a = null;
        zzep.b(this);
    }

    public final zzen b(Message message, zzep zzepVar) {
        this.a = message;
        return this;
    }

    public final boolean c(Handler handler) {
        Message message = this.a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.a = null;
        zzep.b(this);
        return sendMessageAtFrontOfQueue;
    }

    public /* synthetic */ zzen(zzeo zzeoVar) {
    }
}
