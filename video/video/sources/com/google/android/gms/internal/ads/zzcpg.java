package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcpg implements zzhfv {
    public final zzcow a;
    public final zzhge b;

    public zzcpg(zzcow zzcowVar, zzhge zzhgeVar) {
        this.a = zzcowVar;
        this.b = zzhgeVar;
    }

    public static Set a(zzcow zzcowVar, zzcqm zzcqmVar) {
        Set singleton = Collections.singleton(new zzddq(zzcqmVar, zzcaa.g));
        zzhgd.b(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return a(this.a, (zzcqm) this.b.b());
    }
}
