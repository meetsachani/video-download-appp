package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes2.dex */
final class zzfne implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfnh.k;
        if (handler != null) {
            handler2 = zzfnh.k;
            runnable = zzfnh.l;
            handler2.post(runnable);
            handler3 = zzfnh.k;
            runnable2 = zzfnh.m;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
