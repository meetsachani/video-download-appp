package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzawf extends zzaub {
    public Long b;
    public Boolean c;
    public Boolean d;

    public zzawf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.b);
        hashMap.put(1, this.c);
        hashMap.put(2, this.d);
        return hashMap;
    }

    public zzawf(String str) {
        HashMap a = zzaub.a(str);
        if (a != null) {
            this.b = (Long) a.get(0);
            this.c = (Boolean) a.get(1);
            this.d = (Boolean) a.get(2);
        }
    }
}
