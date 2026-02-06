package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbca;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzdqs implements zzcyv, zzcxh, zzcvw, zzcwn, com.google.android.gms.ads.internal.client.zza, zzdbh {
    public final zzbbt X;
    public boolean Y = false;

    public zzdqs(zzbbt zzbbtVar, @InterfaceC10571ws1 zzezp zzezpVar) {
        this.X = zzbbtVar;
        zzbbtVar.c(2);
        if (zzezpVar != null) {
            zzbbtVar.c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void B(final zzbca.zzb zzbVar) {
        zzbbs zzbbsVar = new zzbbs() { // from class: com.google.android.gms.internal.ads.zzdqr
            @Override // com.google.android.gms.internal.ads.zzbbs
            public final void a(zzbca.zzt.zza zzaVar) {
                zzaVar.h2(zzbca.zzb.this);
            }
        };
        zzbbt zzbbtVar = this.X;
        zzbbtVar.b(zzbbsVar);
        zzbbtVar.c(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.X) {
            case 1:
                this.X.c(101);
                return;
            case 2:
                this.X.c(102);
                return;
            case 3:
                this.X.c(5);
                return;
            case 4:
                this.X.c(103);
                return;
            case 5:
                this.X.c(104);
                return;
            case 6:
                this.X.c(105);
                return;
            case 7:
                this.X.c(106);
                return;
            default:
                this.X.c(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void Q0(boolean z) {
        int i;
        if (true != z) {
            i = 1108;
        } else {
            i = 1107;
        }
        this.X.c(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void S(final zzbca.zzb zzbVar) {
        zzbbs zzbbsVar = new zzbbs() { // from class: com.google.android.gms.internal.ads.zzdqp
            @Override // com.google.android.gms.internal.ads.zzbbs
            public final void a(zzbca.zzt.zza zzaVar) {
                zzaVar.h2(zzbca.zzb.this);
            }
        };
        zzbbt zzbbtVar = this.X;
        zzbbtVar.b(zzbbsVar);
        zzbbtVar.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void a0(boolean z) {
        int i;
        if (true != z) {
            i = 1106;
        } else {
            i = 1105;
        }
        this.X.c(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(final zzfcg zzfcgVar) {
        this.X.b(new zzbbs() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // com.google.android.gms.internal.ads.zzbbs
            public final void a(zzbca.zzt.zza zzaVar) {
                zzbca.zza.zzb s1 = zzaVar.d().s1();
                zzbca.zzi.zza s12 = zzaVar.d().b0().s1();
                s12.m2(zzfcg.this.b.b.b);
                s1.t2(s12);
                zzaVar.e2(s1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void h() {
        this.X.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void r0(final zzbca.zzb zzbVar) {
        zzbbs zzbbsVar = new zzbbs() { // from class: com.google.android.gms.internal.ads.zzdqq
            @Override // com.google.android.gms.internal.ads.zzbbs
            public final void a(zzbca.zzt.zza zzaVar) {
                zzaVar.h2(zzbca.zzb.this);
            }
        };
        zzbbt zzbbtVar = this.X;
        zzbbtVar.b(zzbbsVar);
        zzbbtVar.c(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void s() {
        this.X.c(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        this.X.c(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void y() {
        if (!this.Y) {
            this.X.c(7);
            this.Y = true;
            return;
        }
        this.X.c(8);
    }
}
