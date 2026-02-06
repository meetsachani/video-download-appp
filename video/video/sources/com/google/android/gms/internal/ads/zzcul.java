package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzcul implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzcul(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        final Context context = (Context) this.a.b();
        final VersionInfoParcel a = ((zzchw) this.b).a();
        final zzfcp a2 = ((zzcvk) this.c).a();
        return new zzfur() { // from class: com.google.android.gms.internal.ads.zzcuk
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                zzfbu zzfbuVar = (zzfbu) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.p(zzfbuVar.B);
                zzauVar.q(zzfbuVar.C.toString());
                zzauVar.o(a.X);
                zzauVar.n(a2.f);
                return zzauVar;
            }
        };
    }
}
