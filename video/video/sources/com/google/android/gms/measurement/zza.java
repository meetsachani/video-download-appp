package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zznc;
import java.util.List;
import java.util.Map;
import o.C2531Be;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zza extends AppMeasurement.zza {
    public final zzhf a;
    public final zziq b;

    public zza(@InterfaceC5670cr1 zzhf zzhfVar) {
        super();
        Preconditions.r(zzhfVar);
        this.a = zzhfVar;
        this.b = zzhfVar.H();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void I(String str) {
        this.a.y().z(str, this.a.b().b());
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void Q(String str) {
        this.a.y().D(str, this.a.b().b());
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final long a() {
        return this.a.L().P0();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void b(String str, String str2, Bundle bundle) {
        this.a.H().Y(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final List<Bundle> c(String str, String str2) {
        return this.b.C(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void d(String str, String str2, Bundle bundle) {
        this.b.z0(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final String e() {
        return this.b.j0();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void e1(String str, String str2, Bundle bundle, long j) {
        this.b.a0(str, str2, bundle, true, false, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void f(zzil zzilVar) {
        this.b.M(zzilVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final String g() {
        return this.b.k0();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final String h() {
        return this.b.l0();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final String i() {
        return this.b.j0();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final Map<String, Object> j(String str, String str2, boolean z) {
        return this.b.E(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void k(zzil zzilVar) {
        this.b.w0(zzilVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void l(zzim zzimVar) {
        this.b.N(zzimVar);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Map<String, Object> m(boolean z) {
        List<zznc> D = this.b.D(z);
        C2531Be c2531Be = new C2531Be(D.size());
        for (zznc zzncVar : D) {
            Object m0 = zzncVar.m0();
            if (m0 != null) {
                c2531Be.put(zzncVar.Y, m0);
            }
        }
        return c2531Be;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Boolean n() {
        return this.b.f0();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Double o() {
        return this.b.g0();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Integer p() {
        return this.b.h0();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Long q() {
        return this.b.i0();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final String r() {
        return this.b.n0();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final Object u(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return n();
                    }
                    return p();
                }
                return o();
            }
            return q();
        }
        return r();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void v0(Bundle bundle) {
        this.b.v0(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final int w(String str) {
        Preconditions.l(str);
        return 25;
    }
}
