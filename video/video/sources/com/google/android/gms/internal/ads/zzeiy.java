package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeiy implements zzedf {
    @InterfaceC11300zs1
    public final zzbdq a;
    public final zzgdj b;
    public final zzfgt c;
    public final zzejh d;

    public zzeiy(zzfgt zzfgtVar, zzgdj zzgdjVar, @InterfaceC11300zs1 zzbdq zzbdqVar, zzejh zzejhVar) {
        this.c = zzfgtVar;
        this.b = zzgdjVar;
        this.a = zzbdqVar;
        this.d = zzejhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final boolean a(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        zzfbz zzfbzVar;
        if (this.a != null && (zzfbzVar = zzfbuVar.s) != null && zzfbzVar.a != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final InterfaceFutureC8411o11 b(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        zzcaf zzcafVar = new zzcaf();
        zzejd zzejdVar = new zzejd();
        zzejdVar.d(new zzeix(this, zzcafVar, zzfcgVar, zzfbuVar, zzejdVar));
        zzfbz zzfbzVar = zzfbuVar.s;
        final zzbdl zzbdlVar = new zzbdl(zzejdVar, zzfbzVar.b, zzfbzVar.a);
        zzfgn zzfgnVar = zzfgn.CUSTOM_RENDER_SYN;
        return zzfgd.d(new zzffy() { // from class: com.google.android.gms.internal.ads.zzeiw
            @Override // com.google.android.gms.internal.ads.zzffy
            public final void a() {
                zzeiy.this.a.h7(zzbdlVar);
            }
        }, this.b, zzfgnVar, this.c).b(zzfgn.CUSTOM_RENDER_ACK).d(zzcafVar).a();
    }
}
