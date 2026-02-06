package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfgd {
    public static final zzfgj a(Callable callable, Object obj, zzfgl zzfglVar) {
        zzgdj zzgdjVar;
        zzgdjVar = zzfglVar.a;
        return b(callable, zzgdjVar, obj, zzfglVar);
    }

    public static final zzfgj b(Callable callable, zzgdj zzgdjVar, Object obj, zzfgl zzfglVar) {
        InterfaceFutureC8411o11 interfaceFutureC8411o11;
        interfaceFutureC8411o11 = zzfgl.d;
        return new zzfgj(zzfglVar, obj, interfaceFutureC8411o11, Collections.EMPTY_LIST, zzgdjVar.I2(callable));
    }

    public static final zzfgj c(InterfaceFutureC8411o11 interfaceFutureC8411o11, Object obj, zzfgl zzfglVar) {
        InterfaceFutureC8411o11 interfaceFutureC8411o112;
        interfaceFutureC8411o112 = zzfgl.d;
        return new zzfgj(zzfglVar, obj, interfaceFutureC8411o112, Collections.EMPTY_LIST, interfaceFutureC8411o11);
    }

    public static final zzfgj d(final zzffy zzffyVar, zzgdj zzgdjVar, Object obj, zzfgl zzfglVar) {
        return b(new Callable() { // from class: com.google.android.gms.internal.ads.zzfgc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzffy.this.a();
                return null;
            }
        }, zzgdjVar, obj, zzfglVar);
    }
}
