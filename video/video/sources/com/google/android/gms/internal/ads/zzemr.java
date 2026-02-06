package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.internal.C2378x;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzemr implements zzetv {
    public final zzgdj a;
    public final zzdpt b;
    public final zzduh c;
    public final zzemt d;

    public zzemr(zzgdj zzgdjVar, zzdpt zzdptVar, zzduh zzduhVar, zzemt zzemtVar) {
        this.a = zzgdjVar;
        this.b = zzdptVar;
        this.c = zzduhVar;
        this.d = zzemtVar;
    }

    public static /* synthetic */ zzems c(zzemr zzemrVar) {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfdn c = zzemrVar.b.c(str, new JSONObject());
                c.c();
                boolean t = zzemrVar.c.t();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ub)).booleanValue() || t) {
                    try {
                        zzbrz k = c.k();
                        if (k != null) {
                            bundle2.putString(C2378x.k, k.toString());
                        }
                    } catch (zzfcw unused) {
                    }
                }
                try {
                    zzbrz j = c.j();
                    if (j != null) {
                        bundle2.putString("adapter_version", j.toString());
                    }
                } catch (zzfcw unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfcw unused3) {
            }
        }
        zzems zzemsVar = new zzems(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ub)).booleanValue()) {
            zzemrVar.d.b(zzemsVar);
        }
        return zzemsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        zzbcm zzbcmVar = zzbcv.Ub;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzemt zzemtVar = this.d;
            if (zzemtVar.a() != null) {
                zzems a = zzemtVar.a();
                a.getClass();
                return zzgcy.h(a);
            }
        }
        if (!zzfvt.d((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D1)) && (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue() || (!this.d.d() && this.c.t()))) {
            this.d.c(true);
            return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzemq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzemr.c(zzemr.this);
                }
            });
        }
        return zzgcy.h(new zzems(new Bundle()));
    }
}
