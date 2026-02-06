package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import o.C10323vs;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabb implements zzach {
    public zzfyc a;
    @InterfaceC11300zs1
    public zzz b;
    public long c;
    public final /* synthetic */ zzabh d;

    public zzabb(zzabh zzabhVar, Context context, int i) {
        this.d = zzabhVar;
        zzeu.l(context);
        this.a = zzfyc.F();
        this.c = C10323vs.b;
    }

    public static final void a(zzz zzzVar) {
        zzk b;
        zzx b2 = zzzVar.b();
        b = zzabh.b(zzzVar.C);
        b2.d(b);
        b2.K();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void B() {
        long j;
        long j2;
        zzabh zzabhVar = this.d;
        zzabhVar.q = this.c;
        j = zzabhVar.p;
        j2 = zzabhVar.q;
        if (j >= j2) {
            zzabhVar.g.B();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean Q() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean R() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void S(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f) {
        this.d.g.S(f);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean T(zzz zzzVar) throws zzacg {
        return zzabh.B(this.d, zzzVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean U(boolean z) {
        boolean U;
        U = this.d.g.U(false);
        return U;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void V(Surface surface, zzel zzelVar) {
        this.d.v(surface, zzelVar);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void W(long j, long j2) throws zzacg {
        this.d.g.W(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean X(long j, zzacf zzacfVar) {
        zzdc.f(false);
        if (!zzabh.a(this.d)) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void Y(zzabi zzabiVar) {
        this.d.g.Y(zzabiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void Z(zzace zzaceVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void a0(List list) {
        if (!this.a.equals(list)) {
            this.a = zzfyc.B(list);
            zzz zzzVar = this.b;
            if (zzzVar != null) {
                a(zzzVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final Surface b() {
        zzdc.f(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void b0(int i, zzz zzzVar, long j, int i2, List list) {
        long j2;
        zzeq zzeqVar;
        zzdc.f(false);
        this.a = zzfyc.B(list);
        this.b = zzzVar;
        zzabh zzabhVar = this.d;
        zzabhVar.q = C10323vs.b;
        a(zzzVar);
        long j3 = this.c;
        if (j3 == C10323vs.b) {
            j2 = 0;
        } else {
            j2 = 1 + j3;
        }
        long j4 = j2;
        zzeqVar = zzabhVar.j;
        zzeqVar.d(j4, new zzabf(j, i2, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void c0(boolean z) {
        boolean z2;
        zzabh zzabhVar = this.d;
        z2 = zzabhVar.f;
        if (z2) {
            zzabhVar.g.c0(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void d0(int i) {
        this.d.g.d0(i);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void e0(long j) {
        this.d.g.e0(j);
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0021 */
    @Override // com.google.android.gms.internal.ads.zzach
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        zzeq zzeqVar;
        zzeq zzeqVar2;
        zzeq zzeqVar3;
        zzabh zzabhVar = this.d;
        zzeqVar = zzabhVar.j;
        if (zzeqVar.a() == 0) {
            zzabhVar.g.h();
            return;
        }
        zzeq zzeqVar4 = new zzeq(10);
        boolean z = true;
        while (zzeqVar2.a() > 0) {
            zzeqVar3 = zzabhVar.j;
            zzabf zzabfVar = (zzabf) zzeqVar3.b();
            zzabfVar.getClass();
            if (z) {
                int i = zzabfVar.b;
                if (i != 0 && i != 1) {
                    zzabhVar.g.h();
                } else {
                    zzabfVar = new zzabf(zzabfVar.a, 0, zzabfVar.c);
                }
            }
            zzeqVar4.d(zzabfVar.c, zzabfVar);
            z = false;
        }
        zzabhVar.j = zzeqVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void i() {
        this.d.t();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void n() {
        this.d.u();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void n0(boolean z) {
        this.c = C10323vs.b;
        zzabh.l(this.d, z);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void w() {
        boolean z;
        zzabh zzabhVar = this.d;
        z = zzabhVar.f;
        if (z) {
            zzabhVar.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void y() {
        boolean z;
        zzabh zzabhVar = this.d;
        z = zzabhVar.f;
        if (z) {
            zzabhVar.x();
        }
    }
}
