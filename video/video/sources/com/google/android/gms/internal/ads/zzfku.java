package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfku {
    public final Context a;
    public final VersionInfoParcel b;
    public final ScheduledExecutorService c;
    public final ClientApi d = new ClientApi();
    public zzbpl e;
    public final Clock f;

    public zzfku(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = scheduledExecutorService;
        this.f = clock;
    }

    public static zzfjx c() {
        return new zzfjx(((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A)).longValue(), 0.2d);
    }

    @InterfaceC11300zs1
    public final zzfkt a(com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat e = AdFormat.e(zzfpVar.Y);
        if (e != null) {
            int ordinal = e.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 5) {
                        return null;
                    }
                    return new zzfjw(this.d, this.a, this.b.Z, this.e, zzfpVar, zzceVar, this.c, c(), this.f);
                }
                return new zzfkx(this.d, this.a, this.b.Z, this.e, zzfpVar, zzceVar, this.c, c(), this.f);
            }
            return new zzfjz(this.d, this.a, this.b.Z, this.e, zzfpVar, zzceVar, this.c, c(), this.f);
        }
        return null;
    }

    public final void b(zzbpl zzbplVar) {
        this.e = zzbplVar;
    }
}
