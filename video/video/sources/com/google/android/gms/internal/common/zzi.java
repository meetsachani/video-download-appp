package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class zzi extends Handler {
    public final Looper a;

    public zzi() {
        this.a = Looper.getMainLooper();
    }

    public zzi(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public zzi(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
