package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcve implements zzhfv {
    public final zzcvc a;
    public final zzhge b;

    public zzcve(zzcvc zzcvcVar, zzhge zzhgeVar) {
        this.a = zzcvcVar;
        this.b = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        Context b = this.a.b(((zzchi) this.b).a());
        zzhgd.b(b);
        return b;
    }
}
