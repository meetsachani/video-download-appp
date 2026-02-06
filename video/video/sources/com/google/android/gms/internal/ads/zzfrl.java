package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import o.InterfaceC2591Bt;

/* loaded from: classes2.dex */
public class zzfrl extends Handler {
    public zzfrl() {
        Looper.getMainLooper();
    }

    @InterfaceC2591Bt
    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }

    public zzfrl(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
