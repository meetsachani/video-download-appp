package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeit implements zzedf {
    public final Context a;
    public final zzcpu b;
    @InterfaceC11300zs1
    public final zzbdq c;
    public final zzgdj d;
    public final zzfgt e;

    public zzeit(Context context, zzcpu zzcpuVar, zzfgt zzfgtVar, zzgdj zzgdjVar, @InterfaceC11300zs1 zzbdq zzbdqVar) {
        this.a = context;
        this.b = zzcpuVar;
        this.e = zzfgtVar;
        this.d = zzgdjVar;
        this.c = zzbdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final boolean a(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        zzfbz zzfbzVar;
        if (this.c != null && (zzfbzVar = zzfbuVar.s) != null && zzfbzVar.a != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final InterfaceFutureC8411o11 b(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        zzeir zzeirVar = new zzeir(this, new View(this.a), null, new zzcqv() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzcqv
            public final com.google.android.gms.ads.internal.client.zzea a() {
                return null;
            }
        }, (zzfbv) zzfbuVar.u.get(0));
        zzcoq a = this.b.a(new zzcrn(zzfcgVar, zzfbuVar, null), zzeirVar);
        zzeis l = a.l();
        zzfbz zzfbzVar = zzfbuVar.s;
        final zzbdl zzbdlVar = new zzbdl(l, zzfbzVar.b, zzfbzVar.a);
        zzfgn zzfgnVar = zzfgn.CUSTOM_RENDER_SYN;
        return zzfgd.d(new zzffy() { // from class: com.google.android.gms.internal.ads.zzeiq
            @Override // com.google.android.gms.internal.ads.zzffy
            public final void a() {
                zzeit.this.c.h7(zzbdlVar);
            }
        }, this.d, zzfgnVar, this.e).b(zzfgn.CUSTOM_RENDER_ACK).d(zzgcy.h(a.h())).a();
    }
}
