package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcqi implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzcqi(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzcqh b() {
        return new zzcqh(((zzcpn) this.a).a(), (Executor) this.b.b());
    }
}
