package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzekr implements AppEventListener, zzcyv, zzcxh, zzcvw, zzcwn, com.google.android.gms.ads.internal.client.zza, zzcvt, zzcyf, zzcwj, zzddy {
    @InterfaceC11300zs1
    public final zzdsd d1;
    public final AtomicReference X = new AtomicReference();
    public final AtomicReference Y = new AtomicReference();
    public final AtomicReference Z = new AtomicReference();
    public final AtomicReference Y0 = new AtomicReference();
    public final AtomicReference Z0 = new AtomicReference();
    public final AtomicBoolean a1 = new AtomicBoolean(true);
    public final AtomicBoolean b1 = new AtomicBoolean(false);
    public final AtomicBoolean c1 = new AtomicBoolean(false);
    @InterfaceC5056aJ2
    public final BlockingQueue e1 = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g9)).intValue());

    public zzekr(@InterfaceC11300zs1 zzdsd zzdsdVar) {
        this.d1 = zzdsdVar;
    }

    private final void p() {
        if (this.b1.get() && this.c1.get()) {
            BlockingQueue<Pair> blockingQueue = this.e1;
            for (final Pair pair : blockingQueue) {
                zzeyz.a(this.Y, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekc
                    @Override // com.google.android.gms.internal.ads.zzeyy
                    public final void b(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).n1((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.a1.set(false);
        }
    }

    public final void B(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.Z.set(zzdqVar);
    }

    public final void C(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.Y.set(zzclVar);
        this.b1.set(true);
        p();
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void C0(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyy zzeyyVar = new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).G(com.google.android.gms.ads.internal.client.zze.this);
            }
        };
        AtomicReference atomicReference = this.X;
        zzeyz.a(atomicReference, zzeyyVar);
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).E(com.google.android.gms.ads.internal.client.zze.this.X);
            }
        });
        zzeyz.a(this.Y0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekf
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbn) obj).d1(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.a1.set(false);
        this.e1.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
    }

    public final void Q(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.Z0.set(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void X0() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.bb)).booleanValue()) {
            zzeyz.a(this.X, new zzekp());
        }
        zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void a() {
        zzeyz.a(this.X, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzejz
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).f();
            }
        });
        zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void b() {
        zzeyz.a(this.X, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).h();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void c() {
        zzeyz.a(this.X, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekm
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).j();
            }
        });
        zzeyy zzeyyVar = new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).e();
            }
        };
        AtomicReference atomicReference = this.Z0;
        zzeyz.a(atomicReference, zzeyyVar);
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzeko
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(zzfcg zzfcgVar) {
        this.a1.set(true);
        this.c1.set(false);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbk g() {
        return (com.google.android.gms.ads.internal.client.zzbk) this.X.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void h(@InterfaceC5670cr1 final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzeyz.a(this.Z, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).a7(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void k(zzbvx zzbvxVar, String str, String str2) {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcl n() {
        return (com.google.android.gms.ads.internal.client.zzcl) this.Y.get();
    }

    public final void q(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.X.set(zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void s() {
        zzeyz.a(this.X, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzejy
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).g();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void t() {
        zzeyz.a(this.X, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).k();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void u(final String str, final String str2) {
        if (this.a1.get()) {
            if (!this.e1.offer(new Pair(str, str2))) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("The queue for app events is full, dropping the new event.");
                zzdsd zzdsdVar = this.d1;
                if (zzdsdVar != null) {
                    zzdsc a = zzdsdVar.a();
                    a.b("action", "dae_action");
                    a.b("dae_name", str);
                    a.b("dae_data", str2);
                    a.j();
                    return;
                }
            }
            return;
        }
        zzeyz.a(this.Y, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcl) obj).n1(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void v() {
        zzeyz.a(this.X, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekg
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).i();
            }
        });
        zzeyz.a(this.Y0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekh
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbn) obj).c();
            }
        });
        this.c1.set(true);
        p();
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void w(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzeki
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).D0(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    public final void x(com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
        this.Y0.set(zzbnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void y() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.bb)).booleanValue()) {
            zzeyz.a(this.X, new zzekp());
        }
    }
}
