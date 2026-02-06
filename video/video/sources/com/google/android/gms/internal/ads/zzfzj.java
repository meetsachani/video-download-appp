package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzfzj extends zzfwe {
    public final transient zzfvu a1;

    public zzfzj(Map map, zzfvu zzfvuVar) {
        super(map);
        this.a1 = zzfvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwv, com.google.android.gms.internal.ads.zzfwy
    public final Map e() {
        return n();
    }

    @Override // com.google.android.gms.internal.ads.zzfwv, com.google.android.gms.internal.ads.zzfwy
    public final Set f() {
        return p();
    }

    @Override // com.google.android.gms.internal.ads.zzfwe, com.google.android.gms.internal.ads.zzfwv
    public final /* bridge */ /* synthetic */ Collection h() {
        return (List) this.a1.a();
    }
}
