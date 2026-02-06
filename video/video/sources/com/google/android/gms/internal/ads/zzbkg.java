package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbkg implements com.google.android.gms.ads.internal.overlay.zzaa {
    public boolean a = false;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zza c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ Map e;

    public zzbkg(zzbki zzbkiVar, boolean z, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.b = z;
        this.c = zzaVar;
        this.d = map;
        this.e = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void O0(boolean z) {
        if (!this.a) {
            if (z && this.b) {
                ((zzddy) this.c).X0();
            }
            this.a = true;
            Map map = this.d;
            map.put((String) this.e.get("event_id"), Boolean.valueOf(z));
            ((zzbmr) this.c).q("openIntentAsync", map);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void z(int i) {
    }
}
