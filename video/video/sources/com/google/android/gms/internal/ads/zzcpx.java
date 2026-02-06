package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcpx implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzcpx(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar2;
        this.b = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        boolean booleanValue = Boolean.valueOf(zzcpv.a()).booleanValue();
        zzegm b = ((zzegn) this.a).b();
        zzeim b2 = ((zzein) this.b).b();
        if (true == booleanValue) {
            return b;
        }
        return b2;
    }
}
