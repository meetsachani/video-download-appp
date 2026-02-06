package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfgb {
    public final Object a;
    public final List b;
    public final /* synthetic */ zzfgl c;

    public /* synthetic */ zzfgb(zzfgl zzfglVar, Object obj, List list, zzfgk zzfgkVar) {
        this.c = zzfglVar;
        this.a = obj;
        this.b = list;
    }

    public final zzfgj a(Callable callable) {
        zzgdj zzgdjVar;
        List list = this.b;
        zzgcw b = zzgcy.b(list);
        InterfaceFutureC8411o11 a = b.a(new Callable() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcaa.g);
        zzfgl zzfglVar = this.c;
        zzgdjVar = zzfglVar.a;
        return new zzfgj(zzfglVar, this.a, a, list, b.a(callable, zzgdjVar));
    }
}
