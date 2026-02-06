package com.google.android.gms.internal.ads;

import java.util.List;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
final class zzbxp implements zzgcu {
    public final /* synthetic */ InterfaceFutureC8411o11 a;

    public zzbxp(zzbxq zzbxqVar, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        this.a = interfaceFutureC8411o11;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        List list;
        list = zzbxq.l;
        list.remove(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List list;
        Void r2 = (Void) obj;
        list = zzbxq.l;
        list.remove(this.a);
    }
}
