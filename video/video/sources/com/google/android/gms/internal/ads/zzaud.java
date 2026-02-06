package com.google.android.gms.internal.ads;

import java.util.HashMap;
import o.C2638Cg0;

/* loaded from: classes2.dex */
public final class zzaud extends zzaub {
    public String b;
    public long c;
    public String d;
    public String e;
    public String f;

    public zzaud() {
        this.b = C2638Cg0.S4;
        this.c = -1L;
        this.d = C2638Cg0.S4;
        this.e = C2638Cg0.S4;
        this.f = C2638Cg0.S4;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.b);
        hashMap.put(4, this.f);
        hashMap.put(3, this.e);
        hashMap.put(2, this.d);
        hashMap.put(1, Long.valueOf(this.c));
        return hashMap;
    }

    public zzaud(String str) {
        String str2 = C2638Cg0.S4;
        this.b = C2638Cg0.S4;
        this.c = -1L;
        this.d = C2638Cg0.S4;
        this.e = C2638Cg0.S4;
        this.f = C2638Cg0.S4;
        HashMap a = zzaub.a(str);
        if (a != null) {
            this.b = a.get(0) == null ? C2638Cg0.S4 : (String) a.get(0);
            this.c = a.get(1) != null ? ((Long) a.get(1)).longValue() : -1L;
            this.d = a.get(2) == null ? C2638Cg0.S4 : (String) a.get(2);
            this.e = a.get(3) == null ? C2638Cg0.S4 : (String) a.get(3);
            this.f = a.get(4) != null ? (String) a.get(4) : str2;
        }
    }
}
