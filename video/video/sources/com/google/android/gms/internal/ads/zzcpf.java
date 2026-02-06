package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzcpf implements zzhfv {
    public final zzcow a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;

    public zzcpf(zzcow zzcowVar, zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzcowVar;
        this.b = zzhgeVar;
        this.c = zzhgeVar2;
        this.d = zzhgeVar3;
        this.e = zzhgeVar4;
    }

    public static zzddq a(zzcow zzcowVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfbu zzfbuVar, final zzfcp zzfcpVar) {
        return new zzddq(new zzcxh() { // from class: com.google.android.gms.internal.ads.zzcou
            @Override // com.google.android.gms.internal.ads.zzcxh
            public final void v() {
                com.google.android.gms.ads.internal.util.zzay y = com.google.android.gms.ads.internal.zzv.y();
                Context context2 = context;
                zzfcp zzfcpVar2 = zzfcpVar;
                y.n(context2, versionInfoParcel.X, zzfbuVar.C.toString(), zzfcpVar2.f);
            }
        }, zzcaa.g);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        VersionInfoParcel a = ((zzchw) this.c).a();
        zzfbu a2 = ((zzcro) this.d).a();
        zzfcp a3 = ((zzcvk) this.e).a();
        return a(this.a, (Context) this.b.b(), a, a2, a3);
    }
}
