package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeoi implements zzetv {
    @InterfaceC11300zs1
    public final zzeys a;

    public zzeoi(@InterfaceC11300zs1 zzeys zzeysVar) {
        this.a = zzeysVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        zzeys zzeysVar = this.a;
        if (zzeysVar == null) {
            return zzgcy.h(new zzeoh(null));
        }
        String a = zzeysVar.a();
        if (Strings.b(a)) {
            return zzgcy.h(new zzeoh(null));
        }
        return zzgcy.h(new zzeoh(a));
    }
}
