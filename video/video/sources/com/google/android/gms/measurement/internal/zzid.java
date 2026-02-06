package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import o.JK1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzid implements zzif {
    public final zzhf a;

    public zzid(zzhf zzhfVar) {
        Preconditions.r(zzhfVar);
        this.a = zzhfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public Context a() {
        return this.a.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public Clock b() {
        return this.a.b();
    }

    @JK1
    public zzaf d() {
        return this.a.z();
    }

    @JK1
    public zzba e() {
        return this.a.A();
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public zzae f() {
        return this.a.f();
    }

    @JK1
    public zzfq g() {
        return this.a.D();
    }

    @JK1
    public zzgd h() {
        return this.a.F();
    }

    @JK1
    public zznd i() {
        return this.a.L();
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public zzfr j() {
        return this.a.j();
    }

    public void k() {
        this.a.l().k();
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public zzgy l() {
        return this.a.l();
    }

    public void m() {
        this.a.Q();
    }

    public void n() {
        this.a.l().n();
    }
}
