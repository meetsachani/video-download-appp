package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcmz implements zzcvt, zzcxh, zzcwn, com.google.android.gms.ads.internal.client.zza, zzcwj, zzddp, zzcyj {
    public final Context X;
    public final Executor Y;
    public final ScheduledExecutorService Y0;
    public final Executor Z;
    public final zzfcg Z0;
    public final zzfbu a1;
    public final zzfjn b1;
    public final zzfdb c1;
    public final zzavl d1;
    public final zzbec e1;
    public final WeakReference f1;
    public final WeakReference g1;
    @InterfaceC11300zs1
    public final zzcut h1;
    public final zzcyd i1;
    public boolean j1;
    public final AtomicBoolean k1 = new AtomicBoolean();

    public zzcmz(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfcg zzfcgVar, zzfbu zzfbuVar, zzfjn zzfjnVar, zzfdb zzfdbVar, @InterfaceC11300zs1 View view, @InterfaceC11300zs1 zzcfb zzcfbVar, zzavl zzavlVar, zzbec zzbecVar, zzbee zzbeeVar, zzfhn zzfhnVar, @InterfaceC11300zs1 zzcut zzcutVar, zzcyd zzcydVar) {
        this.X = context;
        this.Y = executor;
        this.Z = executor2;
        this.Y0 = scheduledExecutorService;
        this.Z0 = zzfcgVar;
        this.a1 = zzfbuVar;
        this.b1 = zzfjnVar;
        this.c1 = zzfdbVar;
        this.d1 = zzavlVar;
        this.f1 = new WeakReference(view);
        this.g1 = new WeakReference(zzcfbVar);
        this.e1 = zzbecVar;
        this.h1 = zzcutVar;
        this.i1 = zzcydVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        String str;
        int i;
        zzfbu zzfbuVar = this.a1;
        List list = zzfbuVar.d;
        if (list != null && !list.isEmpty()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O3)).booleanValue()) {
                str = this.d1.c().i(this.X, (View) this.f1.get(), null);
            } else {
                str = null;
            }
            if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F0)).booleanValue() && this.Z0.b.b.h) || !((Boolean) zzbeu.h.e()).booleanValue()) {
                this.c1.a(this.b1.e(this.Z0, zzfbuVar, false, str, null, p0()), this.i1);
                return;
            }
            if (((Boolean) zzbeu.g.e()).booleanValue() && ((i = zzfbuVar.b) == 1 || i == 2 || i == 5)) {
                zzcfb zzcfbVar = (zzcfb) this.g1.get();
            }
            zzgcy.r((zzgcp) zzgcy.o(zzgcp.A(zzgcy.h(null)), ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i1)).longValue(), TimeUnit.MILLISECONDS, this.Y0), new zzcmy(this, str), this.Y);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void d() {
        zzfjn zzfjnVar = this.b1;
        zzfcg zzfcgVar = this.Z0;
        zzfdb zzfdbVar = this.c1;
        zzfbu zzfbuVar = this.a1;
        zzfdbVar.a(zzfjnVar.d(zzfcgVar, zzfbuVar, zzfbuVar.i), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void e() {
        zzfjn zzfjnVar = this.b1;
        zzfcg zzfcgVar = this.Z0;
        zzfdb zzfdbVar = this.c1;
        zzfbu zzfbuVar = this.a1;
        zzfdbVar.a(zzfjnVar.d(zzfcgVar, zzfbuVar, zzfbuVar.g), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void k(zzbvx zzbvxVar, String str, String str2) {
        zzfjn zzfjnVar = this.b1;
        zzfdb zzfdbVar = this.c1;
        zzfbu zzfbuVar = this.a1;
        zzfdbVar.a(zzfjnVar.f(zzfbuVar, zzfbuVar.h, zzbvxVar), null);
    }

    public final List p0() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ib)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.v();
            Context context = this.X;
            if (com.google.android.gms.ads.internal.util.zzs.c(context)) {
                com.google.android.gms.ads.internal.zzv.v();
                Integer Z = com.google.android.gms.ads.internal.util.zzs.Z(context);
                if (Z != null) {
                    int min = Math.min(Z.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    for (String str : this.a1.d) {
                        arrayList.add(Uri.parse(str).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.a1.d;
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void q() {
        zzfjn zzfjnVar = this.b1;
        zzfcg zzfcgVar = this.Z0;
        zzfdb zzfdbVar = this.c1;
        zzfbu zzfbuVar = this.a1;
        zzfdbVar.a(zzfjnVar.d(zzfcgVar, zzfbuVar, zzfbuVar.u0), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void s() {
        if (!this.k1.compareAndSet(false, true)) {
            return;
        }
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X3)).intValue();
        if (intValue > 0) {
            x0(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y3)).intValue());
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W3)).booleanValue()) {
            this.Z.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcms
                @Override // java.lang.Runnable
                public final void run() {
                    r0.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcmz.this.r0();
                        }
                    });
                }
            });
        } else {
            r0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void t() {
        zzfbu zzfbuVar = this.a1;
        if (zzfbuVar.e == 4) {
            this.c1.a(this.b1.d(this.Z0, zzfbuVar, zzfbuVar.A0), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void v() {
        zzcut zzcutVar;
        try {
            if (this.j1) {
                ArrayList arrayList = new ArrayList(p0());
                zzfbu zzfbuVar = this.a1;
                arrayList.addAll(zzfbuVar.f);
                this.c1.a(this.b1.e(this.Z0, zzfbuVar, true, null, null, arrayList), null);
            } else {
                zzfdb zzfdbVar = this.c1;
                zzfjn zzfjnVar = this.b1;
                zzfcg zzfcgVar = this.Z0;
                zzfbu zzfbuVar2 = this.a1;
                zzfdbVar.a(zzfjnVar.d(zzfcgVar, zzfbuVar2, zzfbuVar2.m), null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T3)).booleanValue() && (zzcutVar = this.h1) != null) {
                    List<String> list = zzcutVar.b().m;
                    String g = zzcutVar.a().g();
                    ArrayList<String> arrayList2 = new ArrayList();
                    for (String str : list) {
                        arrayList2.add(zzfjn.c(str, "@gw_adnetstatus@", g));
                    }
                    long a = zzcutVar.a().a();
                    ArrayList arrayList3 = new ArrayList();
                    for (String str2 : arrayList2) {
                        arrayList3.add(zzfjn.c(str2, "@gw_ttr@", Long.toString(a, 10)));
                    }
                    zzfdbVar.a(zzfjnVar.d(zzcutVar.c(), zzcutVar.b(), arrayList3), null);
                }
                zzfdbVar.a(zzfjnVar.d(zzfcgVar, zzfbuVar2, zzfbuVar2.f), null);
            }
            this.j1 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void w(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H1)).booleanValue()) {
            int i = zzeVar.X;
            zzfbu zzfbuVar = this.a1;
            ArrayList arrayList = new ArrayList();
            for (String str : zzfbuVar.f277o) {
                arrayList.add(zzfjn.c(str, "@gw_mpe@", "2." + i));
            }
            this.c1.a(this.b1.d(this.Z0, zzfbuVar, arrayList), null);
        }
    }

    public final void x0(final int i, final int i2) {
        View view;
        if (i > 0 && ((view = (View) this.f1.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.Y0.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmv
                @Override // java.lang.Runnable
                public final void run() {
                    r0.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmw
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcmz.this.x0(r2 - 1, r3);
                        }
                    });
                }
            }, i2, TimeUnit.MILLISECONDS);
        } else {
            r0();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void y() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F0)).booleanValue() || !this.Z0.b.b.h) && ((Boolean) zzbeu.d.e()).booleanValue()) {
            zzgcy.r((zzgcp) zzgcy.e(zzgcp.A(this.e1.a()), Throwable.class, new zzfur() { // from class: com.google.android.gms.internal.ads.zzcmt
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, zzcaa.g), new zzcmx(this), this.Y);
            return;
        }
        zzfdb zzfdbVar = this.c1;
        zzfjn zzfjnVar = this.b1;
        zzfcg zzfcgVar = this.Z0;
        zzfbu zzfbuVar = this.a1;
        Context context = this.X;
        List d = zzfjnVar.d(zzfcgVar, zzfbuVar, zzfbuVar.c);
        int i = 1;
        if (true == com.google.android.gms.ads.internal.zzv.t().a(context)) {
            i = 2;
        }
        zzfdbVar.c(d, i);
    }
}
