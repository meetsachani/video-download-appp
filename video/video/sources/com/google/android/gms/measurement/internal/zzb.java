package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;
import o.C2531Be;
import o.InterfaceC10697xN2;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzb extends zzf {
    public final Map<String, Long> b;
    public final Map<String, Integer> c;
    public long d;

    public zzb(zzhf zzhfVar) {
        super(zzhfVar);
        this.c = new C2531Be();
        this.b = new C2531Be();
    }

    public static /* synthetic */ void C(zzb zzbVar, String str, long j) {
        zzbVar.n();
        Preconditions.l(str);
        Integer num = zzbVar.c.get(str);
        if (num != null) {
            zzki C = zzbVar.s().C(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzbVar.c.remove(str);
                Long l = zzbVar.b.get(str);
                if (l == null) {
                    zzbVar.j().G().a("First ad unit exposure time was never set");
                } else {
                    zzbVar.b.remove(str);
                    zzbVar.A(str, j - l.longValue(), C);
                }
                if (zzbVar.c.isEmpty()) {
                    long j2 = zzbVar.d;
                    if (j2 == 0) {
                        zzbVar.j().G().a("First ad exposure time was never set");
                        return;
                    }
                    zzbVar.w(j - j2, C);
                    zzbVar.d = 0L;
                    return;
                }
                return;
            }
            zzbVar.c.put(str, Integer.valueOf(intValue));
            return;
        }
        zzbVar.j().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    public static /* synthetic */ void y(zzb zzbVar, String str, long j) {
        zzbVar.n();
        Preconditions.l(str);
        if (zzbVar.c.isEmpty()) {
            zzbVar.d = j;
        }
        Integer num = zzbVar.c.get(str);
        if (num != null) {
            zzbVar.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzbVar.c.size() >= 100) {
            zzbVar.j().L().a("Too many ads visible");
        } else {
            zzbVar.c.put(str, 1);
            zzbVar.b.put(str, Long.valueOf(j));
        }
    }

    @InterfaceC10697xN2
    public final void A(String str, long j, zzki zzkiVar) {
        if (zzkiVar == null) {
            j().K().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            j().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zznd.W(zzkiVar, bundle, true);
            r().A0("am", "_xu", bundle);
        }
    }

    @InterfaceC10697xN2
    public final void B(long j) {
        for (String str : this.b.keySet()) {
            this.b.put(str, Long.valueOf(j));
        }
        if (!this.b.isEmpty()) {
            this.d = j;
        }
    }

    public final void D(String str, long j) {
        if (str != null && str.length() != 0) {
            l().D(new zzd(this, str, j));
        } else {
            j().G().a("Ad unit id must be a non-empty string");
        }
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

    @InterfaceC10697xN2
    public final void v(long j) {
        zzki C = s().C(false);
        for (String str : this.b.keySet()) {
            A(str, j - this.b.get(str).longValue(), C);
        }
        if (!this.b.isEmpty()) {
            w(j - this.d, C);
        }
        B(j);
    }

    @InterfaceC10697xN2
    public final void w(long j, zzki zzkiVar) {
        if (zzkiVar == null) {
            j().K().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            j().K().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zznd.W(zzkiVar, bundle, true);
            r().A0("am", "_xa", bundle);
        }
    }

    public final void z(String str, long j) {
        if (str != null && str.length() != 0) {
            l().D(new zza(this, str, j));
        } else {
            j().G().a("Ad unit id must be a non-empty string");
        }
    }
}
