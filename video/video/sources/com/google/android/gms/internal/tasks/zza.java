package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class zza extends Handler {
    public final Looper a;

    public zza() {
        this.a = Looper.getMainLooper();
    }

    public zza(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }
}
