package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzety {
    public final Context a;
    public final Set b;
    public final Executor c;
    public final zzfhn d;
    public final zzdsd e;
    public long f = 0;
    @InterfaceC8710pF0("this")
    public int g = 0;

    public zzety(Context context, Executor executor, Set set, zzfhn zzfhnVar, zzdsd zzdsdVar) {
        this.a = context;
        this.c = executor;
        this.b = set;
        this.d = zzfhnVar;
        this.e = zzdsdVar;
    }

    public static /* synthetic */ void b(zzety zzetyVar, long j, zzetv zzetvVar, Bundle bundle) {
        long b = com.google.android.gms.ads.internal.zzv.d().b() - j;
        if (((Boolean) zzbex.a.e()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.k("Signal runtime (ms) : " + zzfvt.c(zzetvVar.getClass().getCanonicalName()) + " = " + b);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w2)).booleanValue()) {
                synchronized (zzetyVar) {
                    bundle.putLong("sig" + zzetvVar.a(), b);
                }
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.o2)).booleanValue()) {
            return;
        }
        zzdsc a = zzetyVar.e.a();
        a.b("action", "lat_ms");
        a.b("lat_grp", "sig_lat_grp");
        a.b("lat_id", String.valueOf(zzetvVar.a()));
        a.b("clat_ms", String.valueOf(b));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.p2)).booleanValue()) {
            synchronized (zzetyVar) {
                zzetyVar.g++;
            }
            a.b("seq_num", com.google.android.gms.ads.internal.zzv.t().i().c());
            synchronized (zzetyVar) {
                try {
                    if (zzetyVar.g == zzetyVar.b.size() && zzetyVar.f != 0) {
                        zzetyVar.g = 0;
                        String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzv.d().b() - zzetyVar.f);
                        if (zzetvVar.a() > 39 && zzetvVar.a() < 52) {
                            a.b("lat_gmssg", valueOf);
                        } else {
                            a.b("lat_clsg", valueOf);
                        }
                    }
                } finally {
                }
            }
        }
        a.k();
    }

    public final InterfaceFutureC8411o11 a(final Object obj, @InterfaceC11300zs1 final Bundle bundle, final boolean z) {
        zzfhc a = zzfhb.a(this.a, 8);
        a.i();
        Set<zzetv> set = this.b;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbcm zzbcmVar = zzbcv.Zb;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).split(","));
        }
        this.f = com.google.android.gms.ads.internal.zzv.d().b();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && bundle != null) {
            long a2 = com.google.android.gms.ads.internal.zzv.d().a();
            if (obj instanceof zzcuv) {
                bundle.putLong(zzdrl.CLIENT_SIGNALS_START.e(), a2);
            } else {
                bundle.putLong(zzdrl.GMS_SIGNALS_START.e(), a2);
            }
        }
        for (final zzetv zzetvVar : set) {
            if (!arrayList2.contains(String.valueOf(zzetvVar.a()))) {
                final long b = com.google.android.gms.ads.internal.zzv.d().b();
                InterfaceFutureC8411o11 b2 = zzetvVar.b();
                final Bundle bundle3 = bundle2;
                b2.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzety.b(zzety.this, b, zzetvVar, bundle3);
                    }
                }, zzcaa.g);
                arrayList.add(b2);
                bundle2 = bundle3;
            }
        }
        InterfaceFutureC8411o11 a3 = zzgcy.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzetx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzetu zzetuVar = (zzetu) ((InterfaceFutureC8411o11) it.next()).get();
                    if (zzetuVar != null) {
                        boolean z2 = z;
                        zzetuVar.c(obj2);
                        if (z2) {
                            zzetuVar.b(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long a4 = com.google.android.gms.ads.internal.zzv.d().a();
                    if (obj2 instanceof zzcuv) {
                        bundle4.putLong(zzdrl.CLIENT_SIGNALS_END.e(), a4);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(zzdrl.GMS_SIGNALS_END.e(), a4);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.c);
        if (zzfhq.a()) {
            zzfhm.a(a3, this.d, a);
        }
        return a3;
    }
}
