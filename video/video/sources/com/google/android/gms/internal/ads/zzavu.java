package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzavu extends zzaub {
    public long b;
    public long c;

    public zzavu() {
        this.b = -1L;
        this.c = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.b));
        hashMap.put(1, Long.valueOf(this.c));
        return hashMap;
    }

    public zzavu(String str) {
        this.b = -1L;
        this.c = -1L;
        HashMap a = zzaub.a(str);
        if (a != null) {
            this.b = ((Long) a.get(0)).longValue();
            this.c = ((Long) a.get(1)).longValue();
        }
    }
}
