package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzot;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.InterfaceC8557od0;
import o.JK1;
import o.M82;

/* loaded from: classes3.dex */
public final class zzaf extends zzid {
    public Boolean b;
    public zzah c;
    public Boolean d;

    public zzaf(zzhf zzhfVar) {
        super(zzhfVar);
        this.c = new zzah() { // from class: com.google.android.gms.measurement.internal.zzai
            @Override // com.google.android.gms.measurement.internal.zzah
            public final String c(String str, String str2) {
                return null;
            }
        };
    }

    public static long G() {
        return zzbi.f.a(null).longValue();
    }

    public static long M() {
        return zzbi.F.a(null).longValue();
    }

    private final String c(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            Preconditions.r(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            j().G().b("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            j().G().b("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            j().G().b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            j().G().b("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    @InterfaceC10697xN2
    public final int A(@M82(min = 1) String str) {
        return u(str, zzbi.q);
    }

    public final boolean B(String str, zzfi<Boolean> zzfiVar) {
        return D(str, zzfiVar);
    }

    @InterfaceC10697xN2
    public final long C(String str) {
        return x(str, zzbi.c);
    }

    @InterfaceC10697xN2
    public final boolean D(String str, zzfi<Boolean> zzfiVar) {
        if (str == null) {
            return zzfiVar.a(null).booleanValue();
        }
        String c = this.c.c(str, zzfiVar.b());
        if (TextUtils.isEmpty(c)) {
            return zzfiVar.a(null).booleanValue();
        }
        return zzfiVar.a(Boolean.valueOf("1".equals(c))).booleanValue();
    }

    public final int E() {
        if (i().b0(201500000, true)) {
            return 100;
        }
        return 25;
    }

    @InterfaceC5056aJ2
    public final Boolean F(@M82(min = 1) String str) {
        Preconditions.l(str);
        Bundle U = U();
        if (U == null) {
            j().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!U.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(U.getBoolean(str));
        }
    }

    @InterfaceC10697xN2
    public final String H(String str) {
        return z(str, zzbi.N);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @InterfaceC5056aJ2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> I(@M82(min = 1) String str) {
        Integer valueOf;
        Preconditions.l(str);
        Bundle U = U();
        if (U == null) {
            j().G().a("Failed to load metadata: Metadata bundle is null");
        } else if (U.containsKey(str)) {
            valueOf = Integer.valueOf(U.getInt(str));
            if (valueOf != null) {
                return null;
            }
            try {
                String[] stringArray = a().getResources().getStringArray(valueOf.intValue());
                if (stringArray == null) {
                    return null;
                }
                return Arrays.asList(stringArray);
            } catch (Resources.NotFoundException e) {
                j().G().b("Failed to load string array from metadata: resource not found", e);
                return null;
            }
        }
        valueOf = null;
        if (valueOf != null) {
        }
    }

    @InterfaceC10697xN2
    public final boolean J(String str) {
        return D(str, zzbi.M);
    }

    public final boolean K(String str) {
        return "1".equals(this.c.c(str, "gaia_collection_enabled"));
    }

    public final boolean L(String str) {
        return "1".equals(this.c.c(str, "measurement.event_sampling_enabled"));
    }

    public final String N() {
        return c("debug.firebase.analytics.app", "");
    }

    public final String O() {
        return c("debug.deferred.deeplink", "");
    }

    public final boolean P() {
        Boolean F = F("google_analytics_adid_collection_enabled");
        if (F != null && !F.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        Boolean F = F("google_analytics_automatic_screen_reporting_enabled");
        if (F != null && !F.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean R() {
        Boolean F = F("firebase_analytics_collection_deactivated");
        if (F != null && F.booleanValue()) {
            return true;
        }
        return false;
    }

    @InterfaceC10697xN2
    public final boolean S() {
        if (this.b == null) {
            Boolean F = F("app_measurement_lite");
            this.b = F;
            if (F == null) {
                this.b = Boolean.FALSE;
            }
        }
        if (!this.b.booleanValue() && this.a.t()) {
            return false;
        }
        return true;
    }

    @InterfaceC8557od0({"this.isMainProcess"})
    public final boolean T() {
        boolean z;
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        ApplicationInfo applicationInfo = a().getApplicationInfo();
                        String a = ProcessUtils.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            if (str != null && str.equals(a)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.d = Boolean.valueOf(z);
                        }
                        if (this.d == null) {
                            this.d = Boolean.TRUE;
                            j().G().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.d.booleanValue();
    }

    @InterfaceC5056aJ2
    public final Bundle U() {
        try {
            if (a().getPackageManager() == null) {
                j().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = Wrappers.a(a()).c(a().getPackageName(), 128);
            if (c == null) {
                j().G().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            j().G().b("Failed to load metadata: Package name not found", e);
            return null;
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

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @InterfaceC10697xN2
    public final double o(String str, zzfi<Double> zzfiVar) {
        if (str == null) {
            return zzfiVar.a(null).doubleValue();
        }
        String c = this.c.c(str, zzfiVar.b());
        if (TextUtils.isEmpty(c)) {
            return zzfiVar.a(null).doubleValue();
        }
        try {
            return zzfiVar.a(Double.valueOf(Double.parseDouble(c))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzfiVar.a(null).doubleValue();
        }
    }

    public final int p(@M82(min = 1) String str) {
        return q(str, zzbi.J, 500, 2000);
    }

    @InterfaceC10697xN2
    public final int q(String str, zzfi<Integer> zzfiVar, int i, int i2) {
        return Math.max(Math.min(u(str, zzfiVar), i2), i);
    }

    public final void r(zzah zzahVar) {
        this.c = zzahVar;
    }

    public final boolean s(zzfi<Boolean> zzfiVar) {
        return D(null, zzfiVar);
    }

    public final int t(String str) {
        if (zzoo.a() && d().D(null, zzbi.b1)) {
            return 500;
        }
        return 100;
    }

    @InterfaceC10697xN2
    public final int u(String str, zzfi<Integer> zzfiVar) {
        if (str == null) {
            return zzfiVar.a(null).intValue();
        }
        String c = this.c.c(str, zzfiVar.b());
        if (TextUtils.isEmpty(c)) {
            return zzfiVar.a(null).intValue();
        }
        try {
            return zzfiVar.a(Integer.valueOf(Integer.parseInt(c))).intValue();
        } catch (NumberFormatException unused) {
            return zzfiVar.a(null).intValue();
        }
    }

    public final int v() {
        if (!zzot.a() || !d().D(null, zzbi.I0) || !i().b0(231100000, true)) {
            return 0;
        }
        return 35;
    }

    public final int w(String str) {
        return Math.max(t(str), 256);
    }

    @InterfaceC10697xN2
    public final long x(String str, zzfi<Long> zzfiVar) {
        if (str == null) {
            return zzfiVar.a(null).longValue();
        }
        String c = this.c.c(str, zzfiVar.b());
        if (TextUtils.isEmpty(c)) {
            return zzfiVar.a(null).longValue();
        }
        try {
            return zzfiVar.a(Long.valueOf(Long.parseLong(c))).longValue();
        } catch (NumberFormatException unused) {
            return zzfiVar.a(null).longValue();
        }
    }

    public final int y(@M82(min = 1) String str) {
        return q(str, zzbi.K, 25, 100);
    }

    @InterfaceC10697xN2
    public final String z(String str, zzfi<String> zzfiVar) {
        if (str == null) {
            return zzfiVar.a(null);
        }
        return zzfiVar.a(this.c.c(str, zzfiVar.b()));
    }
}
