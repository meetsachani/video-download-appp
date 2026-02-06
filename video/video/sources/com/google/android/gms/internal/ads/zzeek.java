package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeek implements zzedl {
    public final Context a;
    public final zzcpu b;
    public final Executor c;

    public zzeek(Context context, zzcpu zzcpuVar, Executor executor) {
        this.a = context;
        this.b = zzcpuVar;
        this.c = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        com.google.android.gms.ads.internal.client.zzr a;
        zzfcp zzfcpVar = zzfcgVar.a.a;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfcpVar.e;
        if (zzrVar.i1) {
            a = new com.google.android.gms.ads.internal.client.zzr(this.a, com.google.android.gms.ads.zzc.d(zzrVar.Z0, zzrVar.Y));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e8)).booleanValue() && zzfbuVar.g0) {
                a = new com.google.android.gms.ads.internal.client.zzr(this.a, com.google.android.gms.ads.zzc.e(zzrVar.Z0, zzrVar.Y));
            } else {
                a = zzfcv.a(this.a, zzfbuVar.u);
            }
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = a;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e8)).booleanValue() && zzfbuVar.g0) {
            ((zzfdn) zzediVar.b).s(this.a, zzrVar2, zzfcpVar.d, zzfbuVar.v.toString(), com.google.android.gms.ads.internal.util.zzbs.m(zzfbuVar.s), (zzbpr) zzediVar.c);
            return;
        }
        ((zzfdn) zzediVar.b).r(this.a, zzrVar2, zzfcpVar.d, zzfbuVar.v.toString(), com.google.android.gms.ads.internal.util.zzbs.m(zzfbuVar.s), (zzbpr) zzediVar.c);
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, final zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw, zzegy {
        final View f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e8)).booleanValue() && zzfbuVar.g0) {
            zzbpu h = ((zzfdn) zzediVar.b).h();
            if (h != null) {
                try {
                    f = (View) ObjectWrapper.o1(h.d());
                    boolean e = h.e();
                    if (f != null) {
                        if (e) {
                            try {
                                f = (View) zzgcy.n(zzgcy.h(null), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeei
                                    @Override // com.google.android.gms.internal.ads.zzgcf
                                    public final InterfaceFutureC8411o11 b(Object obj) {
                                        InterfaceFutureC8411o11 h2;
                                        h2 = zzgcy.h(zzcqj.a(zzeek.this.a, f, zzfbuVar));
                                        return h2;
                                    }
                                }, zzcaa.f).get();
                            } catch (InterruptedException | ExecutionException e2) {
                                throw new zzfcw(e2);
                            }
                        }
                    } else {
                        throw new zzfcw(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                } catch (RemoteException e3) {
                    throw new zzfcw(e3);
                }
            } else {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcw(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            f = ((zzfdn) zzediVar.b).f();
        }
        zzcpu zzcpuVar = this.b;
        zzcrn zzcrnVar = new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a);
        final zzfdn zzfdnVar = (zzfdn) zzediVar.b;
        Objects.requireNonNull(zzfdnVar);
        zzcoq a = zzcpuVar.a(zzcrnVar, new zzcow(f, null, new zzcqv() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzcqv
            public final com.google.android.gms.ads.internal.client.zzea a() {
                return zzfdn.this.g();
            }
        }, (zzfbv) zzfbuVar.u.get(0)));
        a.i().n1(f);
        a.c().c1(new zzcmd(zzfdnVar), this.c);
        ((zzeew) zzediVar.c).X7(a.g());
        return a.h();
    }
}
