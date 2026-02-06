package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdmn {
    public final Executor a;
    public final zzcnu b;
    public final zzdds c;
    public final zzcmn d;

    public zzdmn(Executor executor, zzcnu zzcnuVar, zzdds zzddsVar, zzcmn zzcmnVar) {
        this.a = executor;
        this.c = zzddsVar;
        this.b = zzcnuVar;
        this.d = zzcmnVar;
    }

    public final void c(final zzcfb zzcfbVar) {
        if (zzcfbVar == null) {
            return;
        }
        zzdds zzddsVar = this.c;
        zzddsVar.n1(zzcfbVar.U());
        zzayu zzayuVar = new zzayu() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzayu
            public final void E0(zzayt zzaytVar) {
                zzcgt M = zzcfb.this.M();
                Rect rect = zzaytVar.d;
                M.o0(rect.left, rect.top, false);
            }
        };
        Executor executor = this.a;
        zzddsVar.c1(zzayuVar, executor);
        zzddsVar.c1(new zzayu() { // from class: com.google.android.gms.internal.ads.zzdmk
            @Override // com.google.android.gms.internal.ads.zzayu
            public final void E0(zzayt zzaytVar) {
                String str;
                HashMap hashMap = new HashMap();
                if (true != zzaytVar.j) {
                    str = "0";
                } else {
                    str = "1";
                }
                hashMap.put("isVisible", str);
                zzcfb.this.q("onAdVisibilityChanged", hashMap);
            }
        }, executor);
        zzcnu zzcnuVar = this.b;
        zzddsVar.c1(zzcnuVar, executor);
        zzcnuVar.e(zzcfbVar);
        zzcgt M = zzcfbVar.M();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.va)).booleanValue() && M != null) {
            zzcmn zzcmnVar = this.d;
            M.K0(zzcmnVar);
            M.T0(zzcmnVar, null, null);
        }
        zzcfbVar.r1("/trackActiveViewUnit", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdml
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzcfb zzcfbVar2 = (zzcfb) obj;
                zzdmn.this.b.c();
            }
        });
        zzcfbVar.r1("/untrackActiveViewUnit", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdmm
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzcfb zzcfbVar2 = (zzcfb) obj;
                zzdmn.this.b.b();
            }
        });
    }
}
