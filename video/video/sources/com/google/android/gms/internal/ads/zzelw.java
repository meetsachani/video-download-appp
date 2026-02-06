package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzelw implements zzetv {
    public final Clock a;
    public final zzfcp b;

    public zzelw(Clock clock, zzfcp zzfcpVar) {
        this.a = clock;
        this.b = zzfcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return zzgcy.h(new zzelx(this.b, this.a.a()));
    }
}
