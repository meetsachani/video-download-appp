package com.google.android.gms.internal.ads;

import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcqz implements zzcra {
    public final Map a;

    public zzcqz(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcra
    @InterfaceC11300zs1
    public final zzedf g(int i, String str) {
        return (zzedf) this.a.get(str);
    }
}
