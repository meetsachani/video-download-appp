package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzcrf implements zzegv {
    public final List a;

    public zzcrf(List list) {
        this.a = list;
    }

    @Override // com.google.android.gms.internal.ads.zzegv
    public final void r() {
        for (InterfaceFutureC8411o11 interfaceFutureC8411o11 : this.a) {
            zzgcy.r(interfaceFutureC8411o11, new zzcre(this), zzgdq.c());
        }
    }

    public zzcrf(zzcqx zzcqxVar) {
        this.a = Collections.singletonList(zzgcy.h(zzcqxVar));
    }
}
