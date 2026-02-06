package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzalp implements zzakg {
    public final zzali a;
    public final long[] b;
    public final Map c;
    public final Map d;
    public final Map e;

    public zzalp(zzali zzaliVar, Map map, Map map2, Map map3) {
        this.a = zzaliVar;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        this.b = zzaliVar.h();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final int a() {
        return this.b.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final List b(long j) {
        return this.a.e(j, this.c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final long z(int i) {
        return this.b[i];
    }
}
