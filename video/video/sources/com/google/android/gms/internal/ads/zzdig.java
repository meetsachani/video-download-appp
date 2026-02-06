package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdig implements zzayu {
    public final /* synthetic */ String X;
    public final /* synthetic */ zzdij Y;

    public zzdig(zzdij zzdijVar, String str) {
        this.X = str;
        this.Y = zzdijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void E0(zzayt zzaytVar) {
        zzdkm zzdkmVar;
        Map map;
        zzdkm zzdkmVar2;
        zzdkm zzdkmVar3;
        zzdkm zzdkmVar4;
        zzdkm zzdkmVar5;
        zzdkm zzdkmVar6;
        Map map2;
        zzdkm zzdkmVar7;
        zzdkm zzdkmVar8;
        zzdkm zzdkmVar9;
        zzdkm zzdkmVar10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V1)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zzaytVar.j) {
                        zzdij zzdijVar = this.Y;
                        zzdkmVar6 = zzdijVar.u;
                        if (zzdkmVar6 != null) {
                            map2 = zzdijVar.F;
                            map2.put(this.X, Boolean.TRUE);
                            zzdkmVar7 = zzdijVar.u;
                            if (zzdkmVar7 != null) {
                                zzdkmVar8 = zzdijVar.u;
                                View e = zzdkmVar8.e();
                                zzdkmVar9 = zzdijVar.u;
                                Map l = zzdkmVar9.l();
                                zzdkmVar10 = zzdijVar.u;
                                zzdijVar.j(e, l, zzdkmVar10.m(), true);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzaytVar.j) {
            zzdij zzdijVar2 = this.Y;
            zzdkmVar = zzdijVar2.u;
            if (zzdkmVar != null) {
                map = zzdijVar2.F;
                map.put(this.X, Boolean.TRUE);
                zzdkmVar2 = zzdijVar2.u;
                if (zzdkmVar2 != null) {
                    zzdkmVar3 = zzdijVar2.u;
                    View e2 = zzdkmVar3.e();
                    zzdkmVar4 = zzdijVar2.u;
                    Map l2 = zzdkmVar4.l();
                    zzdkmVar5 = zzdijVar2.u;
                    zzdijVar2.j(e2, l2, zzdkmVar5.m(), true);
                }
            }
        }
    }
}
