package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzeqi implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzeqi(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        Object b = ((zzesk) this.a).b();
        Object obj = (zzeon) this.b.b();
        if (true == ((List) this.c.b()).contains("29")) {
            b = obj;
        }
        zzhgd.b(b);
        return b;
    }
}
