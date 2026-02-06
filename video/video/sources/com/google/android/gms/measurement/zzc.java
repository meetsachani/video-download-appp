package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zzjz;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzc extends AppMeasurement.zza {
    public final zzjz a;

    public zzc(zzjz zzjzVar) {
        super();
        Preconditions.r(zzjzVar);
        this.a = zzjzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void I(String str) {
        this.a.I(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void Q(String str) {
        this.a.Q(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final long a() {
        return this.a.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void b(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final List<Bundle> c(String str, String str2) {
        return this.a.c(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void d(String str, String str2, Bundle bundle) {
        this.a.d(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final String e() {
        return this.a.e();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void e1(String str, String str2, Bundle bundle, long j) {
        this.a.e1(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void f(zzil zzilVar) {
        this.a.f(zzilVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final String g() {
        return this.a.g();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final String h() {
        return this.a.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final String i() {
        return this.a.i();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final Map<String, Object> j(String str, String str2, boolean z) {
        return this.a.j(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void k(zzil zzilVar) {
        this.a.k(zzilVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void l(zzim zzimVar) {
        this.a.l(zzimVar);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Map<String, Object> m(boolean z) {
        return this.a.j(null, null, z);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Boolean n() {
        return (Boolean) this.a.u(4);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Double o() {
        return (Double) this.a.u(2);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Integer p() {
        return (Integer) this.a.u(3);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Long q() {
        return (Long) this.a.u(1);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final String r() {
        return (String) this.a.u(0);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final Object u(int i) {
        return this.a.u(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void v0(Bundle bundle) {
        this.a.v0(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final int w(String str) {
        return this.a.w(str);
    }
}
