package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzfax implements OnAdMetadataChangedListener, zzcxh, zzcvw, zzcvt, zzcwj, zzcyf, zzezi, zzddy {
    public final zzfdy X;
    public final AtomicReference Y = new AtomicReference();
    public final AtomicReference Z = new AtomicReference();
    public final AtomicReference Y0 = new AtomicReference();
    public final AtomicReference Z0 = new AtomicReference();
    public final AtomicReference a1 = new AtomicReference();
    public final AtomicReference b1 = new AtomicReference();
    public final AtomicReference c1 = new AtomicReference();
    public zzfax d1 = null;

    public zzfax(zzfdy zzfdyVar) {
        this.X = zzfdyVar;
    }

    @Deprecated
    public final void B(zzbwd zzbwdVar) {
        this.Z0.set(zzbwdVar);
    }

    @Deprecated
    public final void C(zzbvy zzbvyVar) {
        this.b1.set(zzbvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void C0(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.C0(zzeVar);
            return;
        }
        final int i = zzeVar.X;
        AtomicReference atomicReference = this.Z;
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfaq
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwx) obj).G(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfar
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwx) obj).E(i);
            }
        });
        zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfas
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwd) obj).A(i);
            }
        });
    }

    public final void Q(zzbwy zzbwyVar) {
        this.a1.set(zzbwyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void X0() {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.X0();
        } else {
            zzeyz.a(this.Y0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfam
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((zzbwt) obj).d();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void a() {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.a();
            return;
        }
        this.X.a();
        zzeyz.a(this.Y0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfat
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwt) obj).g();
            }
        });
        zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfau
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwd) obj).e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void b() {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.b();
        } else {
            zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfav
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((zzbwd) obj).h();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void c() {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.c();
            return;
        }
        AtomicReference atomicReference = this.Y0;
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfaf
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwt) obj).j();
            }
        });
        zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfag
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwd) obj).j();
            }
        });
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfah
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwt) obj).e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void d() {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.d();
        } else {
            zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfap
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((zzbwd) obj).k();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void e() {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.e();
        } else {
            zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfab
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((zzbwd) obj).l();
                }
            });
        }
    }

    public final void g(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.Y.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void h(@InterfaceC5670cr1 final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.h(zztVar);
        } else {
            zzeyz.a(this.c1, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfai
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).a7(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void k(final zzbvx zzbvxVar, final String str, final String str2) {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.k(zzbvxVar, str, str2);
            return;
        }
        zzeyz.a(this.Y0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfaw
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                zzbvx zzbvxVar2 = zzbvx.this;
                ((zzbwt) obj).x1(new zzbxh(zzbvxVar2.c(), zzbvxVar2.b()));
            }
        });
        zzeyz.a(this.a1, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfac
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                zzbvx zzbvxVar2 = zzbvx.this;
                ((zzbwy) obj).r4(new zzbxh(zzbvxVar2.c(), zzbvxVar2.b()), str, str2);
            }
        });
        zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfad
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwd) obj).i5(zzbvx.this);
            }
        });
        zzeyz.a(this.b1, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfae
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbvy) obj).r4(zzbvx.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezi
    public final void n(zzezi zzeziVar) {
        this.d1 = (zzfax) zzeziVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void q() {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.q();
        } else {
            zzeyz.a(this.Y, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfal
                @Override // com.google.android.gms.internal.ads.zzeyy
                public final void b(Object obj) {
                    ((OnAdMetadataChangedListener) obj).q();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void t() {
    }

    public final void u(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.c1.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.v();
            return;
        }
        zzeyz.a(this.Z, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfaj
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwx) obj).g();
            }
        });
        zzeyz.a(this.Z0, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwd) obj).i();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void w(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfax zzfaxVar = this.d1;
        if (zzfaxVar != null) {
            zzfaxVar.w(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.Y0;
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfan
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwt) obj).X3(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyz.a(atomicReference, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzfao
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((zzbwt) obj).W(com.google.android.gms.ads.internal.client.zze.this.X);
            }
        });
    }

    public final void x(zzbwt zzbwtVar) {
        this.Y0.set(zzbwtVar);
    }

    public final void y(zzbwx zzbwxVar) {
        this.Z.set(zzbwxVar);
    }
}
