package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC10697xN2;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzkp extends zze {
    public final zzlm c;
    public zzfk d;
    public volatile Boolean e;
    public final zzaw f;
    public final zzmi g;
    public final List<Runnable> h;
    public final zzaw i;

    public zzkp(zzhf zzhfVar) {
        super(zzhfVar);
        this.h = new ArrayList();
        this.g = new zzmi(zzhfVar.b());
        this.c = new zzlm(this);
        this.f = new zzks(this, zzhfVar);
        this.i = new zzlb(this, zzhfVar);
    }

    public static /* synthetic */ void M(zzkp zzkpVar, ComponentName componentName) {
        zzkpVar.n();
        if (zzkpVar.d != null) {
            zzkpVar.d = null;
            zzkpVar.j().K().b("Disconnected from device MeasurementService", componentName);
            zzkpVar.n();
            zzkpVar.Z();
        }
    }

    @InterfaceC10697xN2
    private final void P(Runnable runnable) throws IllegalStateException {
        n();
        if (d0()) {
            runnable.run();
        } else if (this.h.size() >= 1000) {
            j().G().a("Discarding data. Max runnable queue size reached");
        } else {
            this.h.add(runnable);
            this.i.b(60000L);
            Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC10697xN2
    public final void g0() {
        n();
        j().K().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        for (Runnable runnable : this.h) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                j().G().b("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC10697xN2
    public final void h0() {
        n();
        this.g.c();
        this.f.b(zzbi.L.a(null).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean i0() {
        boolean z;
        n();
        v();
        if (this.e == null) {
            n();
            v();
            Boolean K = h().K();
            boolean z2 = true;
            if (K == null || !K.booleanValue()) {
                boolean z3 = false;
                if (p().C() != 1) {
                    j().K().a("Checking service availability");
                    int u = i().u(GooglePlayServicesUtilLight.a);
                    if (u != 0) {
                        if (u != 1) {
                            if (u != 2) {
                                if (u != 3) {
                                    if (u != 9) {
                                        if (u != 18) {
                                            j().L().b("Unexpected service status", Integer.valueOf(u));
                                        } else {
                                            j().L().a("Service updating");
                                        }
                                    } else {
                                        j().L().a("Service invalid");
                                    }
                                } else {
                                    j().L().a("Service disabled");
                                }
                                z = false;
                                z2 = false;
                            } else {
                                j().F().a("Service container out of date");
                                if (i().G0() >= 17443) {
                                    if (K != null) {
                                        z2 = false;
                                    }
                                    z = false;
                                }
                            }
                            if (z2 && d().S()) {
                                j().G().a("No way to upload. Consider using the full version of Analytics");
                            } else {
                                z3 = z;
                            }
                            if (z3) {
                                h().w(z2);
                            }
                        } else {
                            j().K().a("Service missing");
                        }
                        z = true;
                        z2 = false;
                        if (z2) {
                        }
                        z3 = z;
                        if (z3) {
                        }
                    } else {
                        j().K().a("Service available");
                    }
                }
                z = true;
                if (z2) {
                }
                z3 = z;
                if (z3) {
                }
            }
            this.e = Boolean.valueOf(z2);
        }
        return this.e.booleanValue();
    }

    public static /* synthetic */ void m0(zzkp zzkpVar) {
        zzkpVar.n();
        if (zzkpVar.d0()) {
            zzkpVar.j().K().a("Inactivity, disconnecting from the service");
            zzkpVar.a0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final boolean A() {
        return false;
    }

    @InterfaceC10697xN2
    public final void C(Bundle bundle) {
        n();
        v();
        P(new zzlc(this, k0(false), bundle));
    }

    @InterfaceC10697xN2
    public final void D(com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        n();
        v();
        P(new zzkx(this, k0(false), zzcvVar));
    }

    @InterfaceC10697xN2
    public final void E(com.google.android.gms.internal.measurement.zzcv zzcvVar, zzbg zzbgVar, String str) {
        n();
        v();
        if (i().u(GooglePlayServicesUtilLight.a) != 0) {
            j().L().a("Not bundling data. Service unavailable or out of date");
            i().U(zzcvVar, new byte[0]);
            return;
        }
        P(new zzle(this, zzbgVar, str, zzcvVar));
    }

    @InterfaceC10697xN2
    public final void F(com.google.android.gms.internal.measurement.zzcv zzcvVar, String str, String str2) {
        n();
        v();
        P(new zzlk(this, str, str2, k0(false), zzcvVar));
    }

    @InterfaceC10697xN2
    public final void G(com.google.android.gms.internal.measurement.zzcv zzcvVar, String str, String str2, boolean z) {
        n();
        v();
        P(new zzkr(this, str, str2, k0(false), z, zzcvVar));
    }

    @InterfaceC10697xN2
    public final void H(zzad zzadVar) {
        Preconditions.r(zzadVar);
        n();
        v();
        P(new zzli(this, true, k0(true), q().E(zzadVar), new zzad(zzadVar), zzadVar));
    }

    @InterfaceC10697xN2
    public final void I(zzbg zzbgVar, String str) {
        Preconditions.r(zzbgVar);
        n();
        v();
        P(new zzlf(this, true, k0(true), q().F(zzbgVar), zzbgVar, str));
    }

    @InterfaceC10697xN2
    public final void J(zzfk zzfkVar) {
        n();
        Preconditions.r(zzfkVar);
        this.d = zzfkVar;
        h0();
        g0();
    }

    @InterfaceC10697xN2
    public final void K(zzfk zzfkVar, AbstractSafeParcelable abstractSafeParcelable, zzo zzoVar) {
        int i;
        n();
        v();
        int i2 = 100;
        int i3 = 0;
        while (i3 < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> C = q().C(100);
            if (C != null) {
                arrayList.addAll(C);
                i = C.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzbg) {
                    try {
                        zzfkVar.W5((zzbg) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e) {
                        j().G().b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zznc) {
                    try {
                        zzfkVar.K7((zznc) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e2) {
                        j().G().b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzad) {
                    try {
                        zzfkVar.J7((zzad) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e3) {
                        j().G().b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    j().G().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i2 = i;
        }
    }

    @InterfaceC10697xN2
    public final void L(zzki zzkiVar) {
        n();
        v();
        P(new zzkz(this, zzkiVar));
    }

    @InterfaceC10697xN2
    public final void O(zznc zzncVar) {
        n();
        v();
        P(new zzkw(this, k0(true), q().G(zzncVar), zzncVar));
    }

    @InterfaceC10697xN2
    public final void Q(AtomicReference<String> atomicReference) {
        n();
        v();
        P(new zzky(this, atomicReference, k0(false)));
    }

    @InterfaceC10697xN2
    public final void R(AtomicReference<List<zzmh>> atomicReference, Bundle bundle) {
        n();
        v();
        P(new zzkt(this, atomicReference, k0(false), bundle));
    }

    @InterfaceC10697xN2
    public final void S(AtomicReference<List<zzad>> atomicReference, String str, String str2, String str3) {
        n();
        v();
        P(new zzlh(this, atomicReference, str, str2, str3, k0(false)));
    }

    @InterfaceC10697xN2
    public final void T(AtomicReference<List<zznc>> atomicReference, String str, String str2, String str3, boolean z) {
        n();
        v();
        P(new zzlj(this, atomicReference, str, str2, str3, k0(false), z));
    }

    @InterfaceC10697xN2
    public final void U(AtomicReference<List<zznc>> atomicReference, boolean z) {
        n();
        v();
        P(new zzku(this, atomicReference, k0(false), z));
    }

    @InterfaceC10697xN2
    public final void V(boolean z) {
        n();
        v();
        if (z) {
            q().H();
        }
        if (f0()) {
            P(new zzlg(this, k0(false)));
        }
    }

    @InterfaceC10697xN2
    public final zzam W() {
        n();
        v();
        zzfk zzfkVar = this.d;
        if (zzfkVar == null) {
            Z();
            j().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzo k0 = k0(false);
        Preconditions.r(k0);
        try {
            zzam A3 = zzfkVar.A3(k0);
            h0();
            return A3;
        } catch (RemoteException e) {
            j().G().b("Failed to get consents; remote exception", e);
            return null;
        }
    }

    public final Boolean X() {
        return this.e;
    }

    @InterfaceC10697xN2
    public final void Y() {
        n();
        v();
        zzo k0 = k0(true);
        q().I();
        P(new zzla(this, k0));
    }

    @InterfaceC10697xN2
    public final void Z() {
        n();
        v();
        if (!d0()) {
            if (i0()) {
                this.c.a();
            } else if (!d().S()) {
                List<ResolveInfo> queryIntentServices = a().getPackageManager().queryIntentServices(new Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
                    this.c.b(intent);
                    return;
                }
                j().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @InterfaceC10697xN2
    public final void a0() {
        n();
        v();
        this.c.d();
        try {
            ConnectionTracker.b().c(a(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    @InterfaceC10697xN2
    public final void b0() {
        n();
        v();
        zzo k0 = k0(false);
        q().H();
        P(new zzkv(this, k0));
    }

    @InterfaceC10697xN2
    public final void c0() {
        n();
        v();
        P(new zzld(this, k0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @InterfaceC10697xN2
    public final boolean d0() {
        n();
        v();
        if (this.d != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    @InterfaceC10697xN2
    public final boolean e0() {
        n();
        v();
        if (!i0() || i().G0() >= 200900) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @InterfaceC10697xN2
    public final boolean f0() {
        n();
        v();
        if (!i0() || i().G0() >= zzbi.r0.a(null).intValue()) {
            return true;
        }
        return false;
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

    @InterfaceC10697xN2
    public final zzo k0(boolean z) {
        String str;
        zzfl p = p();
        if (z) {
            str = j().O();
        } else {
            str = null;
        }
        return p.B(str);
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
