package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zzdds extends zzdbo implements zzayu {
    public final Map Y;
    public final zzfbu Y0;
    public final Context Z;

    public zzdds(Context context, Set set, zzfbu zzfbuVar) {
        super(set);
        this.Y = new WeakHashMap(1);
        this.Z = context;
        this.Y0 = zzfbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final synchronized void E0(final zzayt zzaytVar) {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzddr
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzayu) obj).E0(zzayt.this);
            }
        });
    }

    public final synchronized void n1(View view) {
        try {
            Map map = this.Y;
            zzayv zzayvVar = (zzayv) map.get(view);
            if (zzayvVar == null) {
                zzayv zzayvVar2 = new zzayv(this.Z, view);
                zzayvVar2.d(this);
                map.put(view, zzayvVar2);
                zzayvVar = zzayvVar2;
            }
            if (this.Y0.X) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B1)).booleanValue()) {
                    zzayvVar.g(((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A1)).longValue());
                    return;
                }
            }
            zzayvVar.f();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void t1(View view) {
        Map map = this.Y;
        if (map.containsKey(view)) {
            ((zzayv) map.get(view)).e(this);
            map.remove(view);
        }
    }
}
