package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import o.InterfaceC10697xN2;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzlx extends zze {
    public Handler c;
    public boolean d;
    public final zzmf e;
    public final zzmd f;
    public final zzmc g;

    public zzlx(zzhf zzhfVar) {
        super(zzhfVar);
        this.d = true;
        this.e = new zzmf(this);
        this.f = new zzmd(this);
        this.g = new zzmc(this);
    }

    public static /* synthetic */ void C(zzlx zzlxVar, long j) {
        zzlxVar.n();
        zzlxVar.G();
        zzlxVar.j().K().b("Activity paused, time", Long.valueOf(j));
        zzlxVar.g.b(j);
        if (zzlxVar.d().Q()) {
            zzlxVar.f.e(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC10697xN2
    public final void G() {
        n();
        if (this.c == null) {
            this.c = new com.google.android.gms.internal.measurement.zzcp(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void I(zzlx zzlxVar, long j) {
        zzlxVar.n();
        zzlxVar.G();
        zzlxVar.j().K().b("Activity resumed, time", Long.valueOf(j));
        if (zzlxVar.d().s(zzbi.Q0)) {
            if (zzlxVar.d().Q() || zzlxVar.d) {
                zzlxVar.f.f(j);
            }
        } else if (zzlxVar.d().Q() || zzlxVar.h().s.b()) {
            zzlxVar.f.f(j);
        }
        zzlxVar.g.a();
        zzmf zzmfVar = zzlxVar.e;
        zzmfVar.a.n();
        if (zzmfVar.a.a.p()) {
            zzmfVar.b(zzmfVar.a.b().a(), false);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final boolean A() {
        return false;
    }

    @InterfaceC10697xN2
    public final void D(boolean z) {
        n();
        this.d = z;
    }

    public final boolean E(boolean z, boolean z2, long j) {
        return this.f.d(z, z2, j);
    }

    @InterfaceC10697xN2
    public final boolean F() {
        n();
        return this.d;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfl p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfo q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziq r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkh s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkp t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzlx u() {
        return super.u();
    }
}
