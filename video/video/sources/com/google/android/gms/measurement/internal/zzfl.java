package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.measurement.internal.zzih;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.InterfaceC8557od0;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzfl extends zze {
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public long i;
    public List<String> j;
    public String k;
    public int l;
    public String m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public String f312o;
    public long p;
    public String q;

    public zzfl(zzhf zzhfVar, long j) {
        super(zzhfVar);
        this.p = 0L;
        this.q = null;
        this.i = j;
    }

    @InterfaceC5056aJ2
    @InterfaceC10697xN2
    private final String J() {
        if (zzqe.a() && d().s(zzbi.n0)) {
            j().K().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, a());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                } catch (Exception unused) {
                    j().M().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                j().N().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final boolean A() {
        return true;
    }

    @InterfaceC10697xN2
    public final zzo B(String str) {
        String str2;
        int i;
        String J;
        long j;
        long min;
        Boolean F;
        Boolean valueOf;
        String str3;
        String str4;
        boolean booleanValue;
        int i2;
        long j2;
        long j3;
        long j4;
        n();
        zzih J2 = h().J();
        if (zznp.a() && d().s(zzbi.S0)) {
            str2 = h().I().i();
            i = J2.b();
        } else {
            str2 = "";
            i = 100;
        }
        String str5 = str2;
        int i3 = i;
        String F2 = F();
        String G = G();
        v();
        String str6 = this.d;
        long D = D();
        v();
        Preconditions.r(this.f);
        String str7 = this.f;
        v();
        n();
        if (this.h == 0) {
            this.h = this.a.L().z(a(), a().getPackageName());
        }
        long j5 = this.h;
        boolean p = this.a.p();
        boolean z = !h().r;
        n();
        if (!this.a.p()) {
            J = null;
        } else {
            J = J();
        }
        zzhf zzhfVar = this.a;
        long a = zzhfVar.F().e.a();
        if (a == 0) {
            min = zzhfVar.H;
            j = 0;
        } else {
            j = 0;
            min = Math.min(zzhfVar.H, a);
        }
        int C = C();
        boolean P = d().P();
        zzgd h = h();
        h.n();
        boolean z2 = h.F().getBoolean("deferred_analytics_collection", false);
        String E = E();
        if (d().F("google_analytics_default_allow_ad_personalization_signals") == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(!F.booleanValue());
        }
        long j6 = this.i;
        List<String> list = this.j;
        String v = J2.v();
        if (this.k == null) {
            this.k = i().S0();
        }
        String str8 = this.k;
        if (zzps.a() && d().s(zzbi.x0)) {
            n();
            if (this.p != j) {
                str3 = F2;
                long a2 = b().a() - this.p;
                if (this.f312o != null && a2 > 86400000 && this.q == null) {
                    I();
                }
            } else {
                str3 = F2;
            }
            if (this.f312o == null) {
                I();
            }
            str4 = this.f312o;
        } else {
            str3 = F2;
            str4 = null;
        }
        Boolean F3 = d().F("google_analytics_sgtm_upload_enabled");
        if (F3 == null) {
            booleanValue = false;
        } else {
            booleanValue = F3.booleanValue();
        }
        long z0 = i().z0(F());
        if (zzpg.a() && d().s(zzbi.M0)) {
            i();
            i2 = zznd.y0();
        } else {
            i2 = 0;
        }
        if (zzpg.a() && d().s(zzbi.M0)) {
            j2 = j6;
            j3 = j5;
            j4 = i().I0();
        } else {
            j2 = j6;
            j3 = j5;
            j4 = j;
        }
        return new zzo(str3, G, str6, D, str7, 82001L, j3, str, p, z, J, 0L, min, C, P, z2, E, valueOf, j2, list, (String) null, v, str8, str4, booleanValue, z0, i3, str5, i2, j4);
    }

    @InterfaceC10697xN2
    public final int C() {
        v();
        return this.l;
    }

    @InterfaceC10697xN2
    public final int D() {
        v();
        return this.e;
    }

    @InterfaceC10697xN2
    public final String E() {
        v();
        return this.n;
    }

    @InterfaceC10697xN2
    public final String F() {
        v();
        Preconditions.r(this.c);
        return this.c;
    }

    @InterfaceC10697xN2
    public final String G() {
        n();
        v();
        Preconditions.r(this.m);
        return this.m;
    }

    @InterfaceC10697xN2
    public final List<String> H() {
        return this.j;
    }

    @InterfaceC10697xN2
    public final void I() {
        String format;
        String str;
        n();
        if (!h().J().l(zzih.zza.ANALYTICS_STORAGE)) {
            j().F().a("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            i().U0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzft F = j().F();
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        F.a(String.format("Resetting session stitching token to %s", str));
        this.f312o = format;
        this.p = b().a();
    }

    public final boolean K(String str) {
        boolean z;
        String str2 = this.q;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        } else {
            z = false;
        }
        this.q = str;
        return z;
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

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)(6:65|66|(1:68)(2:83|(1:85))|69|70|(21:72|(1:74)(1:81)|76|77|5|(1:64)(1:9)|10|11|(1:14)|15|(1:17)|18|19|(1:21)(1:51)|22|(1:24)|(3:26|(1:28)(1:31)|29)|32|(3:34|(1:36)(3:43|(3:46|(1:48)|44)|49)|(2:38|39)(2:41|42))|50|(0)(0)))|4|5|(1:7)|64|10|11|(0)|15|(0)|18|19|(0)(0)|22|(0)|(0)|32|(0)|50|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ac, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cd, code lost:
        j().G().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzfr.v(r0), r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194 A[Catch: IllegalStateException -> 0x01ac, TryCatch #3 {IllegalStateException -> 0x01ac, blocks: (B:50:0x016f, B:54:0x018c, B:56:0x0194, B:60:0x01b0, B:62:0x01c4, B:64:0x01c9, B:63:0x01c7), top: B:90:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0 A[Catch: IllegalStateException -> 0x01ac, TryCatch #3 {IllegalStateException -> 0x01ac, blocks: (B:50:0x016f, B:54:0x018c, B:56:0x0194, B:60:0x01b0, B:62:0x01c4, B:64:0x01c9, B:63:0x01c7), top: B:90:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    @Override // com.google.android.gms.measurement.internal.zze
    @InterfaceC8557od0({RemoteConfigConstants.RequestFieldKey.W, "appStore", "appName", "gmpAppId", "gaAppId"})
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        String str;
        String str2;
        PackageInfo packageInfo;
        boolean z;
        byte b;
        int x;
        List<String> I;
        String b2;
        String str3;
        String packageName = a().getPackageName();
        PackageManager packageManager = a().getPackageManager();
        String str4 = "";
        String str5 = "unknown";
        String str6 = "Unknown";
        int i = Integer.MIN_VALUE;
        if (packageManager == null) {
            j().G().b("PackageManager is null, app identity information might be inaccurate. appId", zzfr.v(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                j().G().b("Error retrieving app installer package name. appId", zzfr.v(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(a().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                if (TextUtils.isEmpty(applicationLabel)) {
                    str2 = "Unknown";
                } else {
                    str2 = applicationLabel.toString();
                }
                try {
                    str6 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str6;
                    str6 = str2;
                    j().G().c("Error retrieving package info. appId, appName", zzfr.v(packageName), str6);
                    str2 = str6;
                    str6 = str;
                    this.c = packageName;
                    this.f = str5;
                    this.d = str6;
                    this.e = i;
                    this.g = str2;
                    this.h = 0L;
                    z = true;
                    if (TextUtils.isEmpty(this.a.M())) {
                    }
                    b = 0;
                    x = this.a.x();
                    switch (x) {
                    }
                    if (x != 0) {
                    }
                    this.m = "";
                    this.n = "";
                    if (b != 0) {
                    }
                    b2 = new zzgz(a(), this.a.P()).b(FirebaseOptions.i);
                    if (!TextUtils.isEmpty(b2)) {
                    }
                    this.m = str4;
                    if (!TextUtils.isEmpty(b2)) {
                    }
                    if (z) {
                    }
                    this.j = null;
                    I = d().I("analytics.safelisted_events");
                    if (I != null) {
                    }
                    this.j = I;
                    if (packageManager == null) {
                    }
                }
                this.c = packageName;
                this.f = str5;
                this.d = str6;
                this.e = i;
                this.g = str2;
                this.h = 0L;
                z = true;
                if (TextUtils.isEmpty(this.a.M()) && "am".equals(this.a.N())) {
                    b = 1;
                } else {
                    b = 0;
                }
                x = this.a.x();
                switch (x) {
                    case 0:
                        j().K().a("App measurement collection enabled");
                        break;
                    case 1:
                        j().J().a("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        j().K().a("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        j().J().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        j().J().a("App measurement disabled via the manifest");
                        break;
                    case 5:
                        j().K().a("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        j().M().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        j().J().a("App measurement disabled via the global data collection setting");
                        break;
                    case 8:
                        j().J().a("App measurement disabled due to denied storage consent");
                        break;
                    default:
                        j().J().a("App measurement disabled");
                        j().I().a("Invalid scion state in identity");
                        break;
                }
                if (x != 0) {
                    z = false;
                }
                this.m = "";
                this.n = "";
                if (b != 0) {
                    this.n = this.a.M();
                }
                b2 = new zzgz(a(), this.a.P()).b(FirebaseOptions.i);
                if (!TextUtils.isEmpty(b2)) {
                    str4 = b2;
                }
                this.m = str4;
                if (!TextUtils.isEmpty(b2)) {
                    this.n = new zzgz(a(), this.a.P()).b("admob_app_id");
                }
                if (z) {
                    zzft K = j().K();
                    String str7 = this.c;
                    if (TextUtils.isEmpty(this.m)) {
                        str3 = this.n;
                    } else {
                        str3 = this.m;
                    }
                    K.c("App measurement enabled for app package, google app id", str7, str3);
                }
                this.j = null;
                I = d().I("analytics.safelisted_events");
                if (I != null) {
                    if (I.isEmpty()) {
                        j().M().a("Safelisted event list is empty. Ignoring");
                    } else {
                        for (String str8 : I) {
                            if (!i().w0("safelisted event", str8)) {
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.l = InstantApps.a(a()) ? 1 : 0;
                        return;
                    } else {
                        this.l = 0;
                        return;
                    }
                }
                this.j = I;
                if (packageManager == null) {
                }
            }
        }
        str2 = "Unknown";
        this.c = packageName;
        this.f = str5;
        this.d = str6;
        this.e = i;
        this.g = str2;
        this.h = 0L;
        z = true;
        if (TextUtils.isEmpty(this.a.M())) {
        }
        b = 0;
        x = this.a.x();
        switch (x) {
        }
        if (x != 0) {
        }
        this.m = "";
        this.n = "";
        if (b != 0) {
        }
        b2 = new zzgz(a(), this.a.P()).b(FirebaseOptions.i);
        if (!TextUtils.isEmpty(b2)) {
        }
        this.m = str4;
        if (!TextUtils.isEmpty(b2)) {
        }
        if (z) {
        }
        this.j = null;
        I = d().I("analytics.safelisted_events");
        if (I != null) {
        }
        this.j = I;
        if (packageManager == null) {
        }
    }
}
