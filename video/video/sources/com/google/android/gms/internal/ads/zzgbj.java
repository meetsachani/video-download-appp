package com.google.android.gms.internal.ads;

import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgbj extends zzgbl {
    public zzgbj(InterfaceFutureC8411o11 interfaceFutureC8411o11, Class cls, zzgcf zzgcfVar) {
        super(interfaceFutureC8411o11, cls, zzgcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final /* bridge */ /* synthetic */ Object B(Object obj, Throwable th) throws Exception {
        zzgcf zzgcfVar = (zzgcf) obj;
        InterfaceFutureC8411o11 b = zzgcfVar.b(th);
        zzfvc.d(b, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgcfVar);
        return b;
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final /* synthetic */ void C(Object obj) {
        v((InterfaceFutureC8411o11) obj);
    }
}
