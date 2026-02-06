package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.internal.zzih;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.C10201vM;
import o.C9273rY;
import o.C9998uW1;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.JK1;
import o.V52;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zzhf implements zzif {
    public static volatile zzhf I;
    public volatile Boolean A;
    @InterfaceC5056aJ2
    public Boolean B;
    @InterfaceC5056aJ2
    public Boolean C;
    public volatile boolean D;
    public int E;
    public int F;
    @InterfaceC5056aJ2
    public final long H;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final zzae f;
    public final zzaf g;
    public final zzgd h;
    public final zzfr i;
    public final zzgy j;
    public final zzlx k;
    public final zznd l;
    public final zzfq m;
    public final Clock n;

    /* renamed from: o  reason: collision with root package name */
    public final zzkh f315o;
    public final zziq p;
    public final zzb q;
    public final zzkc r;
    public final String s;
    public zzfo t;
    public zzkp u;
    public zzba v;
    public zzfl w;
    public Boolean y;
    public long z;
    public boolean x = false;
    public AtomicInteger G = new AtomicInteger(0);

    public zzhf(zzio zzioVar) {
        long a;
        Bundle bundle;
        boolean z = false;
        Preconditions.r(zzioVar);
        zzae zzaeVar = new zzae(zzioVar.a);
        this.f = zzaeVar;
        zzff.a = zzaeVar;
        Context context = zzioVar.a;
        this.a = context;
        this.b = zzioVar.b;
        this.c = zzioVar.c;
        this.d = zzioVar.d;
        this.e = zzioVar.h;
        this.A = zzioVar.e;
        this.s = zzioVar.j;
        this.D = true;
        com.google.android.gms.internal.measurement.zzdd zzddVar = zzioVar.g;
        if (zzddVar != null && (bundle = zzddVar.b1) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzddVar.b1.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzgn.l(context);
        Clock d = DefaultClock.d();
        this.n = d;
        Long l = zzioVar.i;
        if (l != null) {
            a = l.longValue();
        } else {
            a = d.a();
        }
        this.H = a;
        this.g = new zzaf(this);
        zzgd zzgdVar = new zzgd(this);
        zzgdVar.p();
        this.h = zzgdVar;
        zzfr zzfrVar = new zzfr(this);
        zzfrVar.p();
        this.i = zzfrVar;
        zznd zzndVar = new zznd(this);
        zzndVar.p();
        this.l = zzndVar;
        this.m = new zzfq(new zzin(zzioVar, this));
        this.q = new zzb(this);
        zzkh zzkhVar = new zzkh(this);
        zzkhVar.w();
        this.f315o = zzkhVar;
        zziq zziqVar = new zziq(this);
        zziqVar.w();
        this.p = zziqVar;
        zzlx zzlxVar = new zzlx(this);
        zzlxVar.w();
        this.k = zzlxVar;
        zzkc zzkcVar = new zzkc(this);
        zzkcVar.p();
        this.r = zzkcVar;
        zzgy zzgyVar = new zzgy(this);
        zzgyVar.p();
        this.j = zzgyVar;
        com.google.android.gms.internal.measurement.zzdd zzddVar2 = zzioVar.g;
        if (zzddVar2 != null && zzddVar2.Y != 0) {
            z = true;
        }
        if (context.getApplicationContext() instanceof Application) {
            zziq H = H();
            if (H.a().getApplicationContext() instanceof Application) {
                Application application = (Application) H.a().getApplicationContext();
                if (H.c == null) {
                    H.c = new zzjx(H);
                }
                if (!z) {
                    application.unregisterActivityLifecycleCallbacks(H.c);
                    application.registerActivityLifecycleCallbacks(H.c);
                    H.j().K().a("Registered activity lifecycle callback");
                }
            }
        } else {
            j().L().a("Application context is not an Application");
        }
        zzgyVar.D(new zzhg(this, zzioVar));
    }

    public static zzhf c(Context context, com.google.android.gms.internal.measurement.zzdd zzddVar, Long l) {
        Bundle bundle;
        if (zzddVar != null && (zzddVar.Z0 == null || zzddVar.a1 == null)) {
            zzddVar = new com.google.android.gms.internal.measurement.zzdd(zzddVar.X, zzddVar.Y, zzddVar.Z, zzddVar.Y0, null, null, zzddVar.b1, null);
        }
        Preconditions.r(context);
        Preconditions.r(context.getApplicationContext());
        if (I == null) {
            synchronized (zzhf.class) {
                try {
                    if (I == null) {
                        I = new zzhf(new zzio(context, zzddVar, l));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.b1) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.r(I);
            I.m(zzddVar.b1.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.r(I);
        return I;
    }

    public static void e(zze zzeVar) {
        if (zzeVar != null) {
            if (zzeVar.z()) {
                return;
            }
            String valueOf = String.valueOf(zzeVar.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
        throw new IllegalStateException("Component not created");
    }

    public static /* synthetic */ void g(zzhf zzhfVar, zzio zzioVar) {
        zzhfVar.l().n();
        zzba zzbaVar = new zzba(zzhfVar);
        zzbaVar.p();
        zzhfVar.v = zzbaVar;
        zzfl zzflVar = new zzfl(zzhfVar, zzioVar.f);
        zzflVar.w();
        zzhfVar.w = zzflVar;
        zzfo zzfoVar = new zzfo(zzhfVar);
        zzfoVar.w();
        zzhfVar.t = zzfoVar;
        zzkp zzkpVar = new zzkp(zzhfVar);
        zzkpVar.w();
        zzhfVar.u = zzkpVar;
        zzhfVar.l.q();
        zzhfVar.h.q();
        zzhfVar.w.x();
        zzhfVar.j().J().b("App measurement initialized, version", 82001L);
        zzhfVar.j().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String F = zzflVar.F();
        if (TextUtils.isEmpty(zzhfVar.b)) {
            if (zzhfVar.L().F0(F)) {
                zzhfVar.j().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzft J = zzhfVar.j().J();
                J.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + F);
            }
        }
        zzhfVar.j().F().a("Debug-level message logging enabled");
        if (zzhfVar.E != zzhfVar.G.get()) {
            zzhfVar.j().G().c("Not all components initialized", Integer.valueOf(zzhfVar.E), Integer.valueOf(zzhfVar.G.get()));
        }
        zzhfVar.x = true;
    }

    public static void h(zzic zzicVar) {
        if (zzicVar != null) {
            if (zzicVar.r()) {
                return;
            }
            String valueOf = String.valueOf(zzicVar.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
        throw new IllegalStateException("Component not created");
    }

    public static void i(zzid zzidVar) {
        if (zzidVar != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    @JK1
    public final zzba A() {
        h(this.v);
        return this.v;
    }

    @JK1
    public final zzfl B() {
        e(this.w);
        return this.w;
    }

    @JK1
    public final zzfo C() {
        e(this.t);
        return this.t;
    }

    @JK1
    public final zzfq D() {
        return this.m;
    }

    public final zzfr E() {
        zzfr zzfrVar = this.i;
        if (zzfrVar != null && zzfrVar.r()) {
            return this.i;
        }
        return null;
    }

    @JK1
    public final zzgd F() {
        i(this.h);
        return this.h;
    }

    @V52
    public final zzgy G() {
        return this.j;
    }

    @JK1
    public final zziq H() {
        e(this.p);
        return this.p;
    }

    @JK1
    public final zzkh I() {
        e(this.f315o);
        return this.f315o;
    }

    @JK1
    public final zzkp J() {
        e(this.u);
        return this.u;
    }

    @JK1
    public final zzlx K() {
        e(this.k);
        return this.k;
    }

    @JK1
    public final zznd L() {
        i(this.l);
        return this.l;
    }

    @JK1
    public final String M() {
        return this.b;
    }

    @JK1
    public final String N() {
        return this.c;
    }

    @JK1
    public final String O() {
        return this.d;
    }

    @JK1
    public final String P() {
        return this.s;
    }

    public final void Q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void R() {
        this.G.incrementAndGet();
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public final Context a() {
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public final Clock b() {
        return this.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r1.z() != false) goto L23;
     */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        zzih zzihVar;
        Boolean d;
        l().n();
        if (zzpg.a() && this.g.s(zzbi.M0) && L().V0()) {
            zznd L = L();
            L.n();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            C10201vM.w(L.a(), new zzp(L.a), intentFilter, 2);
            L.j().F().a("Registered app receiver");
        }
        zzih J = F().J();
        int b = J.b();
        Boolean F = this.g.F("google_analytics_default_allow_ad_storage");
        Boolean F2 = this.g.F("google_analytics_default_allow_analytics_storage");
        if ((F != null || F2 != null) && F().x(-10)) {
            zzihVar = new zzih(F, F2, -10);
        } else {
            if (!TextUtils.isEmpty(B().G()) && (b == 0 || b == 30 || b == 10 || b == 30 || b == 30 || b == 40)) {
                H().L(new zzih(null, null, -10), this.H);
            } else if (TextUtils.isEmpty(B().G()) && zzddVar != null && zzddVar.b1 != null && F().x(30)) {
                zzihVar = zzih.c(zzddVar.b1, 30);
            }
            zzihVar = null;
        }
        if (zzihVar != null) {
            H().L(zzihVar, this.H);
            J = zzihVar;
        }
        H().K(J);
        if (zznp.a() && this.g.s(zzbi.S0)) {
            int a = F().I().a();
            Boolean F3 = this.g.F("google_analytics_default_allow_ad_user_data");
            if (F3 != null && zzih.k(-10, a)) {
                H().J(new zzay(F3, -10));
            } else if (!TextUtils.isEmpty(B().G()) && (a == 0 || a == 30)) {
                H().J(new zzay((Boolean) null, -10));
            } else {
                if (TextUtils.isEmpty(B().G()) && zzddVar != null && zzddVar.b1 != null && zzih.k(30, a)) {
                    zzay b2 = zzay.b(zzddVar.b1, 30);
                    if (b2.j()) {
                        H().J(b2);
                    }
                }
                if (TextUtils.isEmpty(B().G()) && zzddVar != null && zzddVar.b1 != null && F().m.a() == null && (d = zzay.d(zzddVar.b1)) != null) {
                    H().c0(zzddVar.Z0, FirebaseAnalytics.UserProperty.b, d.toString(), false);
                }
            }
        }
        if (F().e.a() == 0) {
            j().K().b("Persisting first open", Long.valueOf(this.H));
            F().e.b(this.H);
        }
        H().n.c();
        if (!s()) {
            if (p()) {
                if (!L().E0("android.permission.INTERNET")) {
                    j().G().a("App is missing INTERNET permission");
                }
                if (!L().E0(C9273rY.b)) {
                    j().G().a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.a(this.a).g() && !this.g.S()) {
                    if (!zznd.c0(this.a)) {
                        j().G().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zznd.d0(this.a, false)) {
                        j().G().a("AppMeasurementService not registered/enabled");
                    }
                }
                j().G().a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(B().G()) || !TextUtils.isEmpty(B().E())) {
                L();
                if (zznd.l0(B().G(), F().P(), B().E(), F().O())) {
                    j().J().a("Rechecking which service to use due to a GMP App Id change");
                    F().Q();
                    C().H();
                    this.u.a0();
                    this.u.Z();
                    F().e.b(this.H);
                    F().g.b(null);
                }
                F().G(B().G());
                F().D(B().E());
            }
            if (!F().J().l(zzih.zza.ANALYTICS_STORAGE)) {
                F().g.b(null);
            }
            H().U(F().g.a());
            if (zznv.a() && this.g.s(zzbi.p0) && !L().W0() && !TextUtils.isEmpty(F().v.a())) {
                j().L().a("Remote config removed with active feature rollouts");
                F().v.b(null);
            }
            if (!TextUtils.isEmpty(B().G()) || !TextUtils.isEmpty(B().E())) {
                boolean p = p();
                if (!F().B() && !this.g.R()) {
                    F().E(!p);
                }
                if (p) {
                    H().o0();
                }
                K().e.a();
                J().Q(new AtomicReference<>());
                J().C(F().y.a());
            }
        }
        if (zzpg.a() && this.g.s(zzbi.M0) && L().V0()) {
            final zziq H = H();
            H.getClass();
            new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhe
                @Override // java.lang.Runnable
                public final void run() {
                    zziq.this.q0();
                }
            }).start();
        }
        F().f313o.a(true);
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public final zzae f() {
        return this.f;
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public final zzfr j() {
        h(this.i);
        return this.i;
    }

    public final /* synthetic */ void k(String str, int i, Throwable th, byte[] bArr, Map map) {
        if ((i == 200 || i == 204 || i == 304) && th == null) {
            F().t.a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString(C9998uW1.o0, "");
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        j().F().a("Deferred Deep Link is empty.");
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (zzoi.a() && this.g.s(zzbi.Z0)) {
                        if (!L().K0(optString)) {
                            j().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                            return;
                        }
                        bundle.putString("gbraid", optString3);
                    } else if (!L().K0(optString)) {
                        j().L().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                        return;
                    }
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.p.A0("auto", Constants.ScionAnalytics.l, bundle);
                    zznd L = L();
                    if (!TextUtils.isEmpty(optString) && L.h0(optString, optDouble)) {
                        L.a().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    j().G().b("Failed to parse the Deferred Deep Link response. exception", e);
                    return;
                }
            }
            j().F().a("Deferred Deep Link response empty.");
            return;
        }
        j().L().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    @JK1
    public final zzgy l() {
        h(this.j);
        return this.j;
    }

    @InterfaceC10697xN2
    public final void m(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    public final void n() {
        this.E++;
    }

    @InterfaceC10697xN2
    public final boolean o() {
        if (this.A != null && this.A.booleanValue()) {
            return true;
        }
        return false;
    }

    @InterfaceC10697xN2
    public final boolean p() {
        if (x() == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC10697xN2
    public final boolean q() {
        l().n();
        return this.D;
    }

    @JK1
    public final boolean r() {
        return TextUtils.isEmpty(this.b);
    }

    @InterfaceC10697xN2
    public final boolean s() {
        boolean z;
        if (this.x) {
            l().n();
            Boolean bool = this.y;
            if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
                this.z = this.n.b();
                boolean z2 = true;
                if (L().E0("android.permission.INTERNET") && L().E0(C9273rY.b) && (Wrappers.a(this.a).g() || this.g.S() || (zznd.c0(this.a) && zznd.d0(this.a, false)))) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!L().j0(B().G(), B().E()) && TextUtils.isEmpty(B().E())) {
                        z2 = false;
                    }
                    this.y = Boolean.valueOf(z2);
                }
            }
            return this.y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @JK1
    public final boolean t() {
        return this.e;
    }

    @InterfaceC10697xN2
    public final boolean u() {
        Bundle bundle;
        int i;
        String str;
        l().n();
        h(v());
        String F = B().F();
        Pair<String, Boolean> u = F().u(F);
        boolean z = false;
        if (this.g.P() && !((Boolean) u.second).booleanValue() && !TextUtils.isEmpty((CharSequence) u.first)) {
            if (!v().w()) {
                j().L().a("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder sb = new StringBuilder();
            if (zznp.a() && this.g.s(zzbi.U0)) {
                zziq H = H();
                H.n();
                zzam W = H.t().W();
                if (W != null) {
                    bundle = W.X;
                } else {
                    bundle = null;
                }
                int i2 = 1;
                if (bundle == null) {
                    int i3 = this.F;
                    this.F = i3 + 1;
                    if (i3 < 10) {
                        z = true;
                    }
                    zzft F2 = j().F();
                    if (z) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    F2.b("Failed to retrieve DMA consent from the service, " + str + " retryCount", Integer.valueOf(this.F));
                    return z;
                }
                zzih c = zzih.c(bundle, 100);
                sb.append("&gcs=");
                sb.append(c.w());
                zzay b = zzay.b(bundle, 100);
                sb.append("&dma=");
                if (b.g() == Boolean.FALSE) {
                    i = 0;
                } else {
                    i = 1;
                }
                sb.append(i);
                if (!TextUtils.isEmpty(b.h())) {
                    sb.append("&dma_cps=");
                    sb.append(b.h());
                }
                if (zzay.d(bundle) == Boolean.TRUE) {
                    i2 = 0;
                }
                sb.append("&npa=");
                sb.append(i2);
                j().K().b("Consent query parameters to Bow", sb);
            }
            zznd L = L();
            B();
            URL J = L.J(82001L, F, (String) u.first, F().u.a() - 1, sb.toString());
            if (J != null) {
                zzkc v = v();
                zzkb zzkbVar = new zzkb() { // from class: com.google.android.gms.measurement.internal.zzhh
                    @Override // com.google.android.gms.measurement.internal.zzkb
                    public final void a(String str2, int i4, Throwable th, byte[] bArr, Map map) {
                        zzhf.this.k(str2, i4, th, bArr, map);
                    }
                };
                v.n();
                v.o();
                Preconditions.r(J);
                Preconditions.r(zzkbVar);
                v.l().z(new zzke(v, F, J, null, null, zzkbVar));
            }
            return false;
        }
        j().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    @JK1
    public final zzkc v() {
        h(this.r);
        return this.r;
    }

    @InterfaceC10697xN2
    public final void w(boolean z) {
        l().n();
        this.D = z;
    }

    @InterfaceC10697xN2
    public final int x() {
        l().n();
        if (this.g.R()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!q()) {
            return 8;
        }
        Boolean M = F().M();
        if (M != null) {
            if (M.booleanValue()) {
                return 0;
            }
            return 3;
        }
        Boolean F = this.g.F("firebase_analytics_collection_enabled");
        if (F != null) {
            if (F.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        } else if (this.A == null || this.A.booleanValue()) {
            return 0;
        } else {
            return 7;
        }
    }

    @JK1
    public final zzb y() {
        zzb zzbVar = this.q;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @JK1
    public final zzaf z() {
        return this.g;
    }
}
