package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zznp;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceC5056aJ2;
import o.InterfaceC9817tn;

/* loaded from: classes3.dex */
public final class zzhj extends zzfj {
    public final zzmp Y;
    public String Y0;
    public Boolean Z;

    public zzhj(zzmp zzmpVar) {
        this(zzmpVar, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final zzam A3(zzo zzoVar) {
        B5(zzoVar, false);
        Preconditions.l(zzoVar.X);
        if (zznp.a()) {
            try {
                return (zzam) this.Y.l().B(new zzhu(this, zzoVar)).get(10000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                this.Y.j().G().c("Failed to get consent. appId", zzfr.v(zzoVar.X), e);
                return new zzam(null);
            }
        }
        return new zzam(null);
    }

    @InterfaceC9817tn
    public final void B5(zzo zzoVar, boolean z) {
        Preconditions.r(zzoVar);
        Preconditions.l(zzoVar.X);
        r4(zzoVar.X, false);
        this.Y.n0().j0(zzoVar.Y, zzoVar.l1);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void F4(zzo zzoVar) {
        Preconditions.l(zzoVar.X);
        r4(zzoVar.X, false);
        o1(new zzhs(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final String J5(zzo zzoVar) {
        B5(zzoVar, false);
        return this.Y.R(zzoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void J7(zzad zzadVar, zzo zzoVar) {
        Preconditions.r(zzadVar);
        Preconditions.r(zzadVar.Z);
        B5(zzoVar, false);
        zzad zzadVar2 = new zzad(zzadVar);
        zzadVar2.X = zzoVar.X;
        o1(new zzhm(this, zzadVar2, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void K7(zznc zzncVar, zzo zzoVar) {
        Preconditions.r(zzncVar);
        B5(zzoVar, false);
        o1(new zzhy(this, zzncVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void O2(long j, String str, String str2, String str3) {
        o1(new zzhn(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final List<zzad> R2(String str, String str2, String str3) {
        r4(str, true);
        try {
            return (List) this.Y.l().w(new zzht(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.Y.j().G().b("Failed to get conditional user properties as", e);
            return Collections.EMPTY_LIST;
        }
    }

    public final void S7(zzbg zzbgVar, zzo zzoVar) {
        this.Y.o0();
        this.Y.t(zzbgVar, zzoVar);
    }

    public final /* synthetic */ void V3(String str, Bundle bundle) {
        this.Y.e0().h0(str, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void W5(zzbg zzbgVar, zzo zzoVar) {
        Preconditions.r(zzbgVar);
        B5(zzoVar, false);
        o1(new zzhx(this, zzbgVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final List<zznc> X1(String str, String str2, String str3, boolean z) {
        r4(str, true);
        try {
            List<zzne> list = (List) this.Y.l().w(new zzhr(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzne zzneVar : list) {
                if (!z && zznd.H0(zzneVar.c)) {
                }
                arrayList.add(new zznc(zzneVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.Y.j().G().c("Failed to get user properties as. appId", zzfr.v(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.Y.j().G().c("Failed to get user properties as. appId", zzfr.v(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final List<zznc> e7(String str, String str2, boolean z, zzo zzoVar) {
        B5(zzoVar, false);
        String str3 = zzoVar.X;
        Preconditions.r(str3);
        try {
            List<zzne> list = (List) this.Y.l().w(new zzho(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzne zzneVar : list) {
                if (!z && zznd.H0(zzneVar.c)) {
                }
                arrayList.add(new zznc(zzneVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.Y.j().G().c("Failed to query user properties. appId", zzfr.v(zzoVar.X), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.Y.j().G().c("Failed to query user properties. appId", zzfr.v(zzoVar.X), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final List<zzmh> f4(zzo zzoVar, Bundle bundle) {
        B5(zzoVar, false);
        Preconditions.r(zzoVar.X);
        try {
            return (List) this.Y.l().w(new zzib(this, zzoVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.Y.j().G().c("Failed to get trigger URIs. appId", zzfr.v(zzoVar.X), e);
            return Collections.EMPTY_LIST;
        }
    }

    @InterfaceC5056aJ2
    public final zzbg h5(zzbg zzbgVar, zzo zzoVar) {
        zzbb zzbbVar;
        if (Constants.ScionAnalytics.l.equals(zzbgVar.X) && (zzbbVar = zzbgVar.Y) != null && zzbbVar.m0() != 0) {
            String O0 = zzbgVar.Y.O0("_cis");
            if (!"referrer broadcast".equals(O0) && !"referrer API".equals(O0)) {
                return zzbgVar;
            }
            this.Y.j().J().b("Event has been filtered ", zzbgVar.toString());
            return new zzbg("_cmpx", zzbgVar.Y, zzbgVar.Z, zzbgVar.Y0);
        }
        return zzbgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final byte[] i6(zzbg zzbgVar, String str) {
        Preconditions.l(str);
        Preconditions.r(zzbgVar);
        r4(str, true);
        this.Y.j().F().b("Log and bundle. event", this.Y.f0().c(zzbgVar.X));
        long nanoTime = this.Y.b().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.Y.l().B(new zzhz(this, zzbgVar, str)).get();
            if (bArr == null) {
                this.Y.j().G().b("Log and bundle returned null. appId", zzfr.v(str));
                bArr = new byte[0];
            }
            this.Y.j().F().d("Log and bundle processed. event, size, time_ms", this.Y.f0().c(zzbgVar.X), Integer.valueOf(bArr.length), Long.valueOf((this.Y.b().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            this.Y.j().G().d("Failed to log and bundle. appId, event, error", zzfr.v(str), this.Y.f0().c(zzbgVar.X), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.Y.j().G().d("Failed to log and bundle. appId, event, error", zzfr.v(str), this.Y.f0().c(zzbgVar.X), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final List<zznc> l4(zzo zzoVar, boolean z) {
        B5(zzoVar, false);
        String str = zzoVar.X;
        Preconditions.r(str);
        try {
            List<zzne> list = (List) this.Y.l().w(new zzia(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzne zzneVar : list) {
                if (!z && zznd.H0(zzneVar.c)) {
                }
                arrayList.add(new zznc(zzneVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.Y.j().G().c("Failed to get user properties. appId", zzfr.v(zzoVar.X), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.Y.j().G().c("Failed to get user properties. appId", zzfr.v(zzoVar.X), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void l5(zzo zzoVar) {
        Preconditions.l(zzoVar.X);
        Preconditions.r(zzoVar.q1);
        zzhv zzhvVar = new zzhv(this, zzoVar);
        Preconditions.r(zzhvVar);
        if (this.Y.l().J()) {
            zzhvVar.run();
        } else {
            this.Y.l().G(zzhvVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void l6(zzo zzoVar) {
        B5(zzoVar, false);
        o1(new zzhk(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void l7(zzbg zzbgVar, String str, String str2) {
        Preconditions.r(zzbgVar);
        Preconditions.l(str);
        r4(str, true);
        o1(new zzhw(this, zzbgVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void n5(final Bundle bundle, zzo zzoVar) {
        B5(zzoVar, false);
        final String str = zzoVar.X;
        Preconditions.r(str);
        o1(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhi
            @Override // java.lang.Runnable
            public final void run() {
                zzhj.this.V3(str, bundle);
            }
        });
    }

    @InterfaceC5056aJ2
    public final void o1(Runnable runnable) {
        Preconditions.r(runnable);
        if (this.Y.l().J()) {
            runnable.run();
        } else {
            this.Y.l().D(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void o5(zzo zzoVar) {
        B5(zzoVar, false);
        o1(new zzhl(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final void p3(zzad zzadVar) {
        Preconditions.r(zzadVar);
        Preconditions.r(zzadVar.Z);
        Preconditions.l(zzadVar.X);
        r4(zzadVar.X, true);
        o1(new zzhp(this, new zzad(zzadVar)));
    }

    @InterfaceC9817tn
    public final void r4(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.Z == null) {
                        if (!"com.google.android.gms".equals(this.Y0) && !UidVerifier.a(this.Y.a(), Binder.getCallingUid()) && !GoogleSignatureVerifier.a(this.Y.a()).d(Binder.getCallingUid())) {
                            z2 = false;
                            this.Z = Boolean.valueOf(z2);
                        }
                        z2 = true;
                        this.Z = Boolean.valueOf(z2);
                    }
                    if (this.Z.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.Y.j().G().b("Measurement Service called with invalid calling package. appId", zzfr.v(str));
                    throw e;
                }
            }
            if (this.Y0 == null && GooglePlayServicesUtilLight.t(this.Y.a(), Binder.getCallingUid(), str)) {
                this.Y0 = str;
            }
            if (str.equals(this.Y0)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.Y.j().G().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void s7(zzbg zzbgVar, zzo zzoVar) {
        com.google.android.gms.internal.measurement.zzb f;
        boolean z;
        if (!this.Y.h0().W(zzoVar.X)) {
            S7(zzbgVar, zzoVar);
            return;
        }
        this.Y.j().K().b("EES config found for", zzoVar.X);
        zzgp h0 = this.Y.h0();
        String str = zzoVar.X;
        if (TextUtils.isEmpty(str)) {
            f = null;
        } else {
            f = h0.j.f(str);
        }
        if (f == null) {
            this.Y.j().K().b("EES not loaded for", zzoVar.X);
            S7(zzbgVar, zzoVar);
            return;
        }
        try {
            Map<String, Object> O = this.Y.m0().O(zzbgVar.Y.G0(), true);
            String a = zzii.a(zzbgVar.X);
            if (a == null) {
                a = zzbgVar.X;
            }
            z = f.d(new com.google.android.gms.internal.measurement.zzad(a, zzbgVar.Y0, O));
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            this.Y.j().G().c("EES error. appId, eventName", zzoVar.Y, zzbgVar.X);
            z = false;
        }
        if (!z) {
            this.Y.j().K().b("EES was not applied to event", zzbgVar.X);
            S7(zzbgVar, zzoVar);
            return;
        }
        if (f.g()) {
            this.Y.j().K().b("EES edited event", zzbgVar.X);
            S7(this.Y.m0().G(f.a().d()), zzoVar);
        } else {
            S7(zzbgVar, zzoVar);
        }
        if (f.f()) {
            for (com.google.android.gms.internal.measurement.zzad zzadVar : f.a().f()) {
                this.Y.j().K().b("EES logging created event", zzadVar.e());
                S7(this.Y.m0().G(zzadVar), zzoVar);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfk
    @InterfaceC9817tn
    public final List<zzad> u1(String str, String str2, zzo zzoVar) {
        B5(zzoVar, false);
        String str3 = zzoVar.X;
        Preconditions.r(str3);
        try {
            return (List) this.Y.l().w(new zzhq(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.Y.j().G().b("Failed to get conditional user properties", e);
            return Collections.EMPTY_LIST;
        }
    }

    public zzhj(zzmp zzmpVar, String str) {
        Preconditions.r(zzmpVar);
        this.Y = zzmpVar;
        this.Y0 = null;
    }
}
