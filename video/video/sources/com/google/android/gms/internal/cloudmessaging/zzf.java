package com.google.android.gms.internal.cloudmessaging;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class zzf extends Handler {
    public final Looper a;

    public zzf() {
        this.a = Looper.getMainLooper();
    }

    public zzf(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public zzf(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
