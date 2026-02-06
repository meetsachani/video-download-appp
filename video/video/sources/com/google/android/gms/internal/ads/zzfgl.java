package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public abstract class zzfgl {
    public static final InterfaceFutureC8411o11 d = zzgcy.h(null);
    public final zzgdj a;
    public final ScheduledExecutorService b;
    public final zzfgm c;

    public zzfgl(zzgdj zzgdjVar, ScheduledExecutorService scheduledExecutorService, zzfgm zzfgmVar) {
        this.a = zzgdjVar;
        this.b = scheduledExecutorService;
        this.c = zzfgmVar;
    }

    public final zzfgb a(Object obj, InterfaceFutureC8411o11... interfaceFutureC8411o11Arr) {
        return new zzfgb(this, obj, Arrays.asList(interfaceFutureC8411o11Arr), null);
    }

    public final zzfgj b(Object obj, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        return new zzfgj(this, obj, interfaceFutureC8411o11, Collections.singletonList(interfaceFutureC8411o11), interfaceFutureC8411o11);
    }

    public abstract String f(Object obj);
}
