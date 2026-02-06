package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzexs implements zzcvw, zzcxs, zzezi, com.google.android.gms.ads.internal.overlay.zzr, zzcyf, zzcwj, zzddy {
    public final zzfdy X;
    public final AtomicReference Y = new AtomicReference();
    public final AtomicReference Z = new AtomicReference();
    public final AtomicReference Y0 = new AtomicReference();
    public final AtomicReference Z0 = new AtomicReference();
    public final AtomicReference a1 = new AtomicReference();
    public final AtomicReference b1 = new AtomicReference();
    @InterfaceC11300zs1
    public zzexs c1 = null;

    public zzexs(zzfdy zzfdyVar) {
        this.X = zzfdyVar;
    }

    public static zzexs a(zzexs zzexsVar) {
        zzexs zzexsVar2 = new zzexs(zzexsVar.X);
        zzexsVar2.c1 = zzexsVar;
        return zzexsVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void C0(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.C0(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.Y;
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexn
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbaq) obj).k1(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexo
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbaq) obj).z(com.google.android.gms.ads.internal.client.zze.this.X);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void S7() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void V3() {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.V3();
        } else {
            zzeyz.a(this.a1, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexg
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).V3();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void X0() {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.X0();
        } else {
            zzeyz.a(this.Y0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexj
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((zzbau) obj).b();
                }
            });
        }
    }

    public final void b() {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.b();
            return;
        }
        this.X.a();
        zzeyz.a(this.Z, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexk
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbar) obj).a();
            }
        });
        zzeyz.a(this.Y0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexl
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbau) obj).c();
            }
        });
    }

    public final void c(final zzban zzbanVar) {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.c(zzbanVar);
        } else {
            zzeyz.a(this.Y, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexi
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((zzbaq) obj).x4(zzban.this);
                }
            });
        }
    }

    public final void e(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.a1.set(zzrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxs
    public final void g() {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.g();
        } else {
            zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexp
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((zzcxs) obj).g();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void h(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.h(zztVar);
        } else {
            zzeyz.a(this.b1, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexd
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).a7(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void h5(final int i) {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.h5(i);
        } else {
            zzeyz.a(this.a1, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexm
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).h5(i);
                }
            });
        }
    }

    public final void k(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.b1.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzezi
    public final void n(zzezi zzeziVar) {
        this.c1 = (zzexs) zzeziVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void o1() {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.o1();
        } else {
            zzeyz.a(this.a1, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexq
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).o1();
                }
            });
        }
    }

    public final void q(zzbaq zzbaqVar) {
        this.Y.set(zzbaqVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void r4() {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.r4();
            return;
        }
        zzeyz.a(this.a1, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexr
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzr) obj).r4();
            }
        });
        AtomicReference atomicReference = this.Y0;
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbau) obj).e();
            }
        });
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexf
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbau) obj).d();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void s7() {
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void t() {
    }

    public final void u(zzbau zzbauVar) {
        this.Y0.set(zzbauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void w(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexs zzexsVar = this.c1;
        if (zzexsVar != null) {
            zzexsVar.w(zzeVar);
        } else {
            zzeyz.a(this.Y0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzexh
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((zzbau) obj).D0(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }
}
