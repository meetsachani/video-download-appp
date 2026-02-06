package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzavp extends zzaub {
    public Long b;
    public Long c;
    public Long d;

    public zzavp() {
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.b);
        hashMap.put(1, this.c);
        hashMap.put(2, this.d);
        return hashMap;
    }

    public zzavp(String str) {
        HashMap a = zzaub.a(str);
        if (a != null) {
            this.b = (Long) a.get(0);
            this.c = (Long) a.get(1);
            this.d = (Long) a.get(2);
        }
    }
}
