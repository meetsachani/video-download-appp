package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzbec {
    public MotionEvent a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    public MotionEvent b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    public final ScheduledExecutorService c;

    public zzbec(Context context, ScheduledExecutorService scheduledExecutorService, zzbee zzbeeVar, zzfhn zzfhnVar) {
        this.c = scheduledExecutorService;
    }

    public final InterfaceFutureC8411o11 a() {
        return (zzgcp) zzgcy.o(zzgcp.A(zzgcy.h(null)), ((Long) zzbeu.c.e()).longValue(), TimeUnit.MILLISECONDS, this.c);
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.a.getEventTime()) {
            this.a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.b.getEventTime()) {
            this.b = MotionEvent.obtain(motionEvent);
        }
    }
}
