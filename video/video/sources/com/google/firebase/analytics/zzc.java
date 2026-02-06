package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zzjz;
import java.util.List;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
final class zzc implements zzjz {
    public final /* synthetic */ zzdf a;

    public zzc(zzdf zzdfVar) {
        this.a = zzdfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void I(String str) {
        this.a.H(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void Q(String str) {
        this.a.N(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final long a() {
        return this.a.b();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void b(String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 Bundle bundle) {
        this.a.x(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final List<Bundle> c(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        return this.a.i(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void d(String str, String str2, Bundle bundle) {
        this.a.J(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    @InterfaceC11300zs1
    public final String e() {
        return this.a.U();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void e1(String str, String str2, Bundle bundle, long j) {
        this.a.y(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void f(zzil zzilVar) {
        this.a.s(zzilVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    @InterfaceC11300zs1
    public final String g() {
        return this.a.V();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    @InterfaceC11300zs1
    public final String h() {
        return this.a.W();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    @InterfaceC11300zs1
    public final String i() {
        return this.a.X();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final Map<String, Object> j(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, boolean z) {
        return this.a.j(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void k(zzil zzilVar) {
        this.a.G(zzilVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void l(zzim zzimVar) {
        this.a.t(zzimVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    @InterfaceC11300zs1
    public final Object u(int i) {
        return this.a.h(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void v0(Bundle bundle) {
        this.a.n(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final int w(String str) {
        return this.a.a(str);
    }
}
