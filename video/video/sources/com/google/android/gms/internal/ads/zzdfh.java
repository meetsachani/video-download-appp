package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzdfh implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;

    public zzdfh(zzdfa zzdfaVar, zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        final Context context = (Context) this.a.b();
        final VersionInfoParcel a = ((zzchw) this.b).a();
        final zzfbu a2 = ((zzcro) this.c).a();
        final zzfcp a3 = ((zzcvk) this.d).a();
        return new zzddq(new zzcxh() { // from class: com.google.android.gms.internal.ads.zzdey
            @Override // com.google.android.gms.internal.ads.zzcxh
            public final void v() {
                com.google.android.gms.ads.internal.util.zzay y = com.google.android.gms.ads.internal.zzv.y();
                Context context2 = context;
                zzfcp zzfcpVar = a3;
                y.n(context2, a.X, a2.C.toString(), zzfcpVar.f);
            }
        }, zzcaa.g);
    }
}
