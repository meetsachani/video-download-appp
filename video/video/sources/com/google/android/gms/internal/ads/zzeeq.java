package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeeq implements zzedl {
    public final Context a;
    public final zzcpu b;
    public View c;
    public zzbpu d;

    public zzeeq(Context context, zzcpu zzcpuVar) {
        this.a = context;
        this.b = zzcpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final void a(zzfcg zzfcgVar, zzfbu zzfbuVar, zzedi zzediVar) throws zzfcw {
        try {
            zzbrk zzbrkVar = (zzbrk) zzediVar.b;
            zzbrkVar.M0(zzfbuVar.Z);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e8)).booleanValue() && zzfbuVar.g0) {
                String str = zzfbuVar.U;
                String jSONObject = zzfbuVar.v.toString();
                zzfcp zzfcpVar = zzfcgVar.a.a;
                zzbrkVar.H7(str, jSONObject, zzfcpVar.d, ObjectWrapper.V3(this.a), new zzeeo(this, zzediVar, null), (zzbpr) zzediVar.c, zzfcpVar.e);
                return;
            }
            String str2 = zzfbuVar.U;
            String jSONObject2 = zzfbuVar.v.toString();
            zzfcp zzfcpVar2 = zzfcgVar.a.a;
            zzbrkVar.K6(str2, jSONObject2, zzfcpVar2.d, ObjectWrapper.V3(this.a), new zzeeo(this, zzediVar, null), (zzbpr) zzediVar.c, zzfcpVar2.e);
        } catch (RemoteException e) {
            throw new zzfcw(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final /* bridge */ /* synthetic */ Object b(zzfcg zzfcgVar, final zzfbu zzfbuVar, final zzedi zzediVar) throws zzfcw, zzegy {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e8)).booleanValue() && zzfbuVar.g0) {
            try {
                view = (View) ObjectWrapper.o1(this.d.d());
                boolean e = this.d.e();
                if (view != null) {
                    if (e) {
                        try {
                            view = (View) zzgcy.n(zzgcy.h(null), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeen
                                @Override // com.google.android.gms.internal.ads.zzgcf
                                public final InterfaceFutureC8411o11 b(Object obj) {
                                    InterfaceFutureC8411o11 h;
                                    h = zzgcy.h(zzcqj.a(zzeeq.this.a, view, zzfbuVar));
                                    return h;
                                }
                            }, zzcaa.f).get();
                        } catch (InterruptedException | ExecutionException e2) {
                            throw new zzfcw(e2);
                        }
                    }
                } else {
                    throw new zzfcw(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
            } catch (RemoteException e3) {
                throw new zzfcw(e3);
            }
        } else {
            view = this.c;
        }
        zzcoq a = this.b.a(new zzcrn(zzfcgVar, zzfbuVar, zzediVar.a), new zzcow(view, null, new zzcqv() { // from class: com.google.android.gms.internal.ads.zzeem
            @Override // com.google.android.gms.internal.ads.zzcqv
            public final com.google.android.gms.ads.internal.client.zzea a() {
                try {
                    return ((zzbrk) zzedi.this.b).d();
                } catch (RemoteException e4) {
                    throw new zzfcw(e4);
                }
            }
        }, (zzfbv) zzfbuVar.u.get(0)));
        a.i().n1(view);
        ((zzeew) zzediVar.c).X7(a.f());
        return a.h();
    }
}
