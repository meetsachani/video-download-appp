package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzih;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import o.AbstractC10026ue1;
import o.C2531Be;
import o.C3855Oo;
import o.C6980iC0;
import o.C7458kA2;
import o.C9011qT2;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;
import o.InterfaceFutureC8411o11;
import o.JK1;

/* loaded from: classes3.dex */
public final class zziq extends zze {
    @InterfaceC5056aJ2
    public zzjx c;
    public zzim d;
    public final Set<zzil> e;
    public boolean f;
    public final AtomicReference<String> g;
    public final Object h;
    public boolean i;
    public PriorityQueue<zzmh> j;
    @InterfaceC8710pF0("consentLock")
    public zzih k;
    public final AtomicLong l;
    public long m;
    public final zzu n;
    @InterfaceC5056aJ2

    /* renamed from: o  reason: collision with root package name */
    public boolean f316o;
    public zzaw p;
    public final zznf q;

    public zziq(zzhf zzhfVar) {
        super(zzhfVar);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.i = false;
        this.f316o = true;
        this.q = new zzjp(this);
        this.g = new AtomicReference<>();
        this.k = zzih.c;
        this.m = -1L;
        this.l = new AtomicLong(0L);
        this.n = new zzu(zzhfVar);
    }

    public static /* synthetic */ void O(zziq zziqVar, zzih zzihVar, long j, boolean z, boolean z2) {
        zziqVar.n();
        zziqVar.v();
        zzih J = zziqVar.h().J();
        if (j <= zziqVar.m && zzih.k(J.b(), zzihVar.b())) {
            zziqVar.j().J().b("Dropped out-of-date consent setting, proposed settings", zzihVar);
        } else if (zziqVar.h().A(zzihVar)) {
            zziqVar.m = j;
            zziqVar.t().V(z);
            if (z2) {
                zziqVar.t().Q(new AtomicReference<>());
            }
        } else {
            zziqVar.j().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzihVar.b()));
        }
    }

    public static /* synthetic */ void P(zziq zziqVar, zzih zzihVar, zzih zzihVar2) {
        zzih.zza zzaVar = zzih.zza.ANALYTICS_STORAGE;
        zzih.zza zzaVar2 = zzih.zza.AD_STORAGE;
        boolean m = zzihVar.m(zzihVar2, zzaVar, zzaVar2);
        boolean r = zzihVar.r(zzihVar2, zzaVar, zzaVar2);
        if (!m && !r) {
            return;
        }
        zziqVar.p().I();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final boolean A() {
        return false;
    }

    @InterfaceC10697xN2
    public final void A0(String str, String str2, Bundle bundle) {
        n();
        V(str, str2, b().a(), bundle);
    }

    public final ArrayList<Bundle> C(String str, String str2) {
        if (l().J()) {
            j().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (zzae.a()) {
            j().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.l().v(atomicReference, 5000L, "get conditional user properties", new zzjo(this, atomicReference, null, str, str2));
            List list = (List) atomicReference.get();
            if (list == null) {
                j().G().b("Timed out waiting for get conditional user properties", null);
                return new ArrayList<>();
            }
            return zznd.t0(list);
        }
    }

    public final List<zznc> D(boolean z) {
        v();
        j().K().a("Getting user properties (FE)");
        if (l().J()) {
            j().G().a("Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        } else if (zzae.a()) {
            j().G().a("Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.l().v(atomicReference, 5000L, "get user properties", new zzji(this, atomicReference, z));
            List<zznc> list = (List) atomicReference.get();
            if (list == null) {
                j().G().b("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.EMPTY_LIST;
            }
            return list;
        }
    }

    public final Map<String, Object> E(String str, String str2, boolean z) {
        if (l().J()) {
            j().G().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        } else if (zzae.a()) {
            j().G().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.l().v(atomicReference, 5000L, "get user properties", new zzjn(this, atomicReference, null, str, str2, z));
            List<zznc> list = (List) atomicReference.get();
            if (list == null) {
                j().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.EMPTY_MAP;
            }
            C2531Be c2531Be = new C2531Be(list.size());
            for (zznc zzncVar : list) {
                Object m0 = zzncVar.m0();
                if (m0 != null) {
                    c2531Be.put(zzncVar.Y, m0);
                }
            }
            return c2531Be;
        }
    }

    public final void F(long j, boolean z) {
        n();
        v();
        j().F().a("Resetting analytics data (FE)");
        zzlx u = u();
        u.n();
        u.f.b();
        if (zzps.a() && d().s(zzbi.x0)) {
            p().I();
        }
        boolean p = this.a.p();
        zzgd h = h();
        h.e.b(j);
        if (!TextUtils.isEmpty(h.h().v.a())) {
            h.v.b(null);
        }
        if (zzoh.a() && h.d().s(zzbi.q0)) {
            h.p.b(0L);
        }
        h.q.b(0L);
        if (!h.d().R()) {
            h.E(!p);
        }
        h.w.b(null);
        h.x.b(0L);
        h.y.b(null);
        if (z) {
            t().b0();
        }
        if (zzoh.a() && d().s(zzbi.q0)) {
            u().e.a();
        }
        this.f316o = !p;
    }

    public final /* synthetic */ void G(Bundle bundle) {
        if (bundle == null) {
            h().y.b(new Bundle());
            return;
        }
        Bundle a = h().y.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                i();
                if (zznd.g0(obj)) {
                    i();
                    zznd.X(this.q, 27, null, null, 0);
                }
                j().M().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (zznd.H0(str)) {
                j().M().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else if (i().k0("param", str, d().t(this.a.B().F()), obj)) {
                i().N(a, str, obj);
            }
        }
        i();
        if (zznd.f0(a, d().E())) {
            i();
            zznd.X(this.q, 26, null, null, 0);
            j().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        h().y.b(a);
        t().C(a);
    }

    @InterfaceC5056aJ2
    public final void H(Bundle bundle, int i, long j) {
        v();
        String i2 = zzih.i(bundle);
        if (i2 != null) {
            j().M().b("Ignoring invalid consent setting", i2);
            j().M().a("Valid consent values are 'granted', 'denied'");
        }
        zzih c = zzih.c(bundle, i);
        if (zznp.a() && d().s(zzbi.S0)) {
            if (c.z()) {
                L(c, j);
            }
            zzay b = zzay.b(bundle, i);
            if (b.j()) {
                J(b);
            }
            Boolean d = zzay.d(bundle);
            if (d != null) {
                c0(FirebaseMessaging.r, FirebaseAnalytics.UserProperty.b, d.toString(), false);
                return;
            }
            return;
        }
        L(c, j);
    }

    public final void I(Bundle bundle, long j) {
        Preconditions.r(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            j().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.r(bundle2);
        zzie.a(bundle2, "app_id", String.class, null);
        zzie.a(bundle2, "origin", String.class, null);
        zzie.a(bundle2, "name", String.class, null);
        zzie.a(bundle2, "value", Object.class, null);
        zzie.a(bundle2, AppMeasurementSdk.ConditionalUserProperty.d, String.class, null);
        zzie.a(bundle2, AppMeasurementSdk.ConditionalUserProperty.e, Long.class, 0L);
        zzie.a(bundle2, AppMeasurementSdk.ConditionalUserProperty.f, String.class, null);
        zzie.a(bundle2, AppMeasurementSdk.ConditionalUserProperty.g, Bundle.class, null);
        zzie.a(bundle2, AppMeasurementSdk.ConditionalUserProperty.h, String.class, null);
        zzie.a(bundle2, AppMeasurementSdk.ConditionalUserProperty.i, Bundle.class, null);
        zzie.a(bundle2, AppMeasurementSdk.ConditionalUserProperty.j, Long.class, 0L);
        zzie.a(bundle2, AppMeasurementSdk.ConditionalUserProperty.k, String.class, null);
        zzie.a(bundle2, AppMeasurementSdk.ConditionalUserProperty.l, Bundle.class, null);
        Preconditions.l(bundle2.getString("name"));
        Preconditions.l(bundle2.getString("origin"));
        Preconditions.r(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.m, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (i().q0(string) != 0) {
            j().G().b("Invalid conditional user property name", g().g(string));
        } else if (i().w(string, obj) != 0) {
            j().G().c("Invalid conditional user property value", g().g(string), obj);
        } else {
            Object A0 = i().A0(string, obj);
            if (A0 == null) {
                j().G().c("Unable to normalize conditional user property value", g().g(string), obj);
                return;
            }
            zzie.b(bundle2, A0);
            long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.e);
            if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.d)) && (j2 > 15552000000L || j2 < 1)) {
                j().G().c("Invalid conditional user property timeout", g().g(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.j);
            if (j3 <= 15552000000L && j3 >= 1) {
                l().D(new zzjm(this, bundle2));
            } else {
                j().G().c("Invalid conditional user property time to live", g().g(string), Long.valueOf(j3));
            }
        }
    }

    public final void J(zzay zzayVar) {
        l().D(new zzjw(this, zzayVar));
    }

    @InterfaceC10697xN2
    public final void K(zzih zzihVar) {
        boolean z;
        n();
        if ((zzihVar.y() && zzihVar.x()) || t().f0()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.a.q()) {
            this.a.w(z);
            Boolean L = h().L();
            if (!z || L == null || L.booleanValue()) {
                T(Boolean.valueOf(z), false);
            }
        }
    }

    public final void L(zzih zzihVar, long j) {
        zzih zzihVar2;
        boolean z;
        boolean z2;
        boolean z3;
        zzih zzihVar3;
        v();
        int b = zzihVar.b();
        if (b != -10 && zzihVar.s() == null && zzihVar.u() == null) {
            j().M().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.h) {
            try {
                zzihVar2 = this.k;
                z = false;
                if (zzih.k(b, zzihVar2.b())) {
                    z2 = zzihVar.t(this.k);
                    if (zzihVar.y() && !this.k.y()) {
                        z = true;
                    }
                    zzihVar = zzihVar.p(this.k);
                    this.k = zzihVar;
                    z3 = z;
                    z = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
                zzihVar3 = zzihVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            j().J().b("Ignoring lower-priority consent settings, proposed settings", zzihVar3);
            return;
        }
        long andIncrement = this.l.getAndIncrement();
        if (z2) {
            U(null);
            l().G(new zzjv(this, zzihVar3, j, andIncrement, z3, zzihVar2));
            return;
        }
        zzjy zzjyVar = new zzjy(this, zzihVar3, andIncrement, z3, zzihVar2);
        if (b != 30 && b != -10) {
            l().D(zzjyVar);
        } else {
            l().G(zzjyVar);
        }
    }

    public final void M(zzil zzilVar) {
        v();
        Preconditions.r(zzilVar);
        if (!this.e.add(zzilVar)) {
            j().L().a("OnEventListener already registered");
        }
    }

    @InterfaceC10697xN2
    public final void N(zzim zzimVar) {
        zzim zzimVar2;
        boolean z;
        n();
        v();
        if (zzimVar != null && zzimVar != (zzimVar2 = this.d)) {
            if (zzimVar2 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.y(z, "EventInterceptor already set.");
        }
        this.d = zzimVar;
    }

    public final void S(Boolean bool) {
        v();
        l().D(new zzjt(this, bool));
    }

    @InterfaceC10697xN2
    public final void T(Boolean bool, boolean z) {
        n();
        v();
        j().F().b("Setting app measurement enabled (FE)", bool);
        h().v(bool);
        if (z) {
            h().C(bool);
        }
        if (!this.a.q() && (bool == null || bool.booleanValue())) {
            return;
        }
        u0();
    }

    public final void U(String str) {
        this.g.set(str);
    }

    @InterfaceC10697xN2
    public final void V(String str, String str2, long j, Bundle bundle) {
        boolean z;
        n();
        if (this.d != null && !zznd.H0(str2)) {
            z = false;
        } else {
            z = true;
        }
        W(str, str2, j, bundle, true, z, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01de  */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zziq zziqVar;
        zzki C;
        boolean z4;
        boolean z5;
        long j2;
        boolean b;
        long j3;
        String str4;
        String str5;
        zznd L;
        int i;
        Class<?> cls;
        zziq zziqVar2 = this;
        String str6 = str;
        Preconditions.l(str6);
        Preconditions.r(bundle);
        zziqVar2.n();
        zziqVar2.v();
        if (!zziqVar2.a.p()) {
            zziqVar2.j().F().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> H = zziqVar2.p().H();
        if (H != null && !H.contains(str2)) {
            zziqVar2.j().F().c("Dropping non-safelisted event. event name, origin", str2, str6);
            return;
        }
        String str7 = null;
        if (!zziqVar2.f) {
            zziqVar2.f = true;
            try {
                if (!zziqVar2.a.t()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zziqVar2.a().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, zziqVar2.a());
                } catch (Exception e) {
                    zziqVar2.j().L().b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                zziqVar2.j().J().a("Tag Manager is not found and thus will not be used");
            }
        }
        if (Constants.ScionAnalytics.l.equals(str2)) {
            if (bundle.containsKey("gclid")) {
                zziqVar2.b0("auto", "_lgclid", bundle.getString("gclid"), zziqVar2.b().a());
            }
            if (zzoi.a() && d().s(zzbi.Z0) && bundle.containsKey("gbraid")) {
                zziqVar2 = this;
                zziqVar2.b0("auto", "_gbraid", bundle.getString("gbraid"), b().a());
            } else {
                zziqVar = this;
                if (z && zznd.L0(str2)) {
                    zziqVar.i().M(bundle, zziqVar.h().y.a());
                }
                int i2 = 0;
                if (!z3 && !"_iap".equals(str2)) {
                    L = zziqVar.a.L();
                    i = 2;
                    if (L.C0("event", str2)) {
                        if (!L.o0("event", zzii.a, zzii.b, str2)) {
                            i = 13;
                        } else if (L.i0("event", 40, str2)) {
                            i = 0;
                        }
                    }
                    if (i != 0) {
                        zziqVar.j().H().b("Invalid public event name. Event will not be logged (FE)", zziqVar.g().c(str2));
                        zziqVar.a.L();
                        String I = zznd.I(str2, 40, true);
                        if (str2 != null) {
                            i2 = str2.length();
                        }
                        zziqVar.a.L();
                        zznd.X(zziqVar.q, i, "_ev", I, i2);
                        return;
                    }
                }
                C = zziqVar.s().C(false);
                if (C != null && !bundle.containsKey("_sc")) {
                    C.d = true;
                }
                if (!z && !z3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zznd.W(C, bundle, z4);
                boolean equals = "am".equals(str6);
                boolean H0 = zznd.H0(str2);
                if (!z && zziqVar.d != null && !H0 && !equals) {
                    zziqVar.j().F().c("Passing event to registered event handler (FE)", zziqVar.g().c(str2), zziqVar.g().a(bundle));
                    Preconditions.r(zziqVar.d);
                    zziqVar.d.a(str6, str2, bundle, j);
                    return;
                }
                long j4 = j;
                if (!zziqVar.a.s()) {
                    int v = zziqVar.i().v(str2);
                    if (v != 0) {
                        zziqVar.j().H().b("Invalid event name. Event will not be logged (FE)", zziqVar.g().c(str2));
                        zziqVar.i();
                        String I2 = zznd.I(str2, 40, true);
                        if (str2 != null) {
                            i2 = str2.length();
                        }
                        zziqVar.a.L();
                        zznd.Y(zziqVar.q, str3, v, "_ev", I2, i2);
                        return;
                    }
                    Bundle E = zziqVar.i().E(str3, str2, bundle, CollectionUtils.d(CrashlyticsAnalyticsListener.c, "_sn", "_sc", "_si"), z3);
                    Preconditions.r(E);
                    if (zziqVar.s().C(false) != null && "_ae".equals(str2)) {
                        zzmd zzmdVar = zziqVar.u().f;
                        j2 = 0;
                        long b2 = zzmdVar.d.b().b();
                        z5 = equals;
                        long j5 = b2 - zzmdVar.b;
                        zzmdVar.b = b2;
                        if (j5 > 0) {
                            zziqVar.i().L(E, j5);
                        }
                    } else {
                        z5 = equals;
                        j2 = 0;
                    }
                    if (zznv.a() && zziqVar.d().s(zzbi.p0)) {
                        if (!"auto".equals(str6) && "_ssr".equals(str2)) {
                            zznd i3 = zziqVar.i();
                            String string = E.getString("_ffr");
                            if (!Strings.b(string)) {
                                if (string != null) {
                                    str7 = string.trim();
                                } else {
                                    str7 = string;
                                }
                            }
                            if (zzng.a(str7, i3.h().v.a())) {
                                i3.j().F().a("Not logging duplicate session_start_with_rollout event");
                                return;
                            }
                            i3.h().v.b(str7);
                        } else if ("_ae".equals(str2)) {
                            String a = zziqVar.i().h().v.a();
                            if (!TextUtils.isEmpty(a)) {
                                E.putString("_ffr", a);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(E);
                    if (zziqVar.d().s(zzbi.Q0)) {
                        b = zziqVar.u().F();
                    } else {
                        b = zziqVar.h().s.b();
                    }
                    if (zziqVar.h().p.a() > j2 && zziqVar.h().y(j4) && b) {
                        zziqVar.j().K().a("Current session is expired, remove the session number, ID, and engagement time");
                        j3 = j2;
                        str4 = "_ae";
                        b0("auto", "_sid", null, zziqVar.b().a());
                        b0("auto", "_sno", null, b().a());
                        b0("auto", "_se", null, b().a());
                        zziqVar = this;
                        zziqVar.h().q.b(j3);
                    } else {
                        j3 = j2;
                        str4 = "_ae";
                    }
                    if (E.getLong(FirebaseAnalytics.Param.m, j3) == 1) {
                        zziqVar.j().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        zziqVar.a.K().e.b(j4, true);
                    }
                    ArrayList arrayList2 = new ArrayList(E.keySet());
                    Collections.sort(arrayList2);
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        String str8 = (String) obj;
                        if (str8 != null) {
                            zziqVar.i();
                            Bundle[] x0 = zznd.x0(E.get(str8));
                            if (x0 != null) {
                                E.putParcelableArray(str8, x0);
                            }
                        }
                    }
                    int i5 = 0;
                    while (i5 < arrayList.size()) {
                        Bundle bundle2 = (Bundle) arrayList.get(i5);
                        if (i5 != 0) {
                            str5 = "_ep";
                        } else {
                            str5 = str2;
                        }
                        bundle2.putString(CrashlyticsAnalyticsListener.c, str6);
                        if (z2) {
                            bundle2 = zziqVar.i().r0(bundle2);
                        }
                        Bundle bundle3 = bundle2;
                        zziqVar.t().I(new zzbg(str5, new zzbb(bundle3), str6, j4), str3);
                        if (!z5) {
                            for (zzil zzilVar : zziqVar.e) {
                                zzilVar.a(str, str2, new Bundle(bundle3), j);
                            }
                        }
                        i5++;
                        str6 = str;
                        j4 = j;
                    }
                    if (zziqVar.s().C(false) != null && str4.equals(str2)) {
                        zziqVar.u().E(true, true, zziqVar.b().b());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        zziqVar = zziqVar2;
        if (z) {
            zziqVar.i().M(bundle, zziqVar.h().y.a());
        }
        int i22 = 0;
        if (!z3) {
            L = zziqVar.a.L();
            i = 2;
            if (L.C0("event", str2)) {
            }
            if (i != 0) {
            }
        }
        C = zziqVar.s().C(false);
        if (C != null) {
            C.d = true;
        }
        if (!z) {
        }
        z4 = false;
        zznd.W(C, bundle, z4);
        boolean equals2 = "am".equals(str6);
        boolean H02 = zznd.H0(str2);
        if (!z) {
        }
        long j42 = j;
        if (!zziqVar.a.s()) {
        }
    }

    public final void X(String str, String str2, long j, Object obj) {
        l().D(new zzjf(this, str, str2, obj, j));
    }

    public final void Y(String str, String str2, Bundle bundle) {
        long a = b().a();
        Preconditions.l(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.m, a);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.k, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.l, bundle);
        }
        l().D(new zzjl(this, bundle2));
    }

    public final void Z(String str, String str2, Bundle bundle, String str3) {
        m();
        y0(str, str2, b().a(), bundle, false, true, true, str3);
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        boolean z3;
        if (str == null) {
            str = FirebaseMessaging.r;
        }
        String str3 = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (str2 != FirebaseAnalytics.Event.A && (str2 == null || !str2.equals(FirebaseAnalytics.Event.A))) {
            if (z2 && this.d != null && !zznd.H0(str2)) {
                z3 = false;
            } else {
                z3 = true;
            }
            y0(str3, str2, j, bundle2, z2, z3, z, null);
            return;
        }
        s().I(bundle2, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(String str, String str2, Object obj, long j) {
        String str3;
        Long l;
        long j2;
        Preconditions.l(str);
        Preconditions.l(str2);
        n();
        v();
        if (FirebaseAnalytics.UserProperty.b.equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    String lowerCase = str4.toLowerCase(Locale.ENGLISH);
                    String str5 = C3855Oo.a;
                    if (C3855Oo.a.equals(lowerCase)) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    Long valueOf = Long.valueOf(j2);
                    zzgj zzgjVar = h().m;
                    if (valueOf.longValue() == 1) {
                        str5 = "true";
                    }
                    zzgjVar.b(str5);
                    l = valueOf;
                    str3 = "_npa";
                    if (!this.a.p()) {
                        j().K().a("User property not set since app measurement is disabled");
                        return;
                    } else if (!this.a.s()) {
                        return;
                    } else {
                        t().O(new zznc(str3, j, l, str));
                        return;
                    }
                }
            }
            if (obj == null) {
                h().m.b("unset");
                l = obj;
                str3 = "_npa";
                if (!this.a.p()) {
                }
            }
        }
        str3 = str2;
        l = obj;
        if (!this.a.p()) {
        }
    }

    public final void c0(String str, String str2, Object obj, boolean z) {
        d0(str, str2, obj, z, b().a());
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    public final void d0(String str, String str2, Object obj, boolean z, long j) {
        int i;
        if (str == null) {
            str = FirebaseMessaging.r;
        }
        String str3 = str;
        int i2 = 0;
        if (z) {
            i = i().q0(str2);
        } else {
            zznd i3 = i();
            if (i3.C0("user property", str2)) {
                if (!i3.n0("user property", zzij.a, str2)) {
                    i = 15;
                } else if (i3.i0("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            i();
            String I = zznd.I(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.a.L();
            zznd.X(this.q, i, "_ev", I, i2);
        } else if (obj != null) {
            int w = i().w(str2, obj);
            if (w != 0) {
                i();
                String I2 = zznd.I(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.a.L();
                zznd.X(this.q, w, "_ev", I2, i2);
                return;
            }
            Object A0 = i().A0(str2, obj);
            if (A0 != null) {
                X(str3, str2, j, A0);
            }
        } else {
            X(str3, str2, j, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    public final /* synthetic */ void e0(List list) {
        n();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> H = h().H();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzmh zzmhVar = (zzmh) it.next();
                if (!C9011qT2.a(H, zzmhVar.Z) || H.get(zzmhVar.Z).longValue() < zzmhVar.Y) {
                    t0().add(zzmhVar);
                }
            }
            s0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    public final Boolean f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) l().v(atomicReference, 15000L, "boolean test flag value", new zzja(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    public final Double g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) l().v(atomicReference, 15000L, "double test flag value", new zzju(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    public final Integer h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) l().v(atomicReference, 15000L, "int test flag value", new zzjr(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    public final Long i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) l().v(atomicReference, 15000L, "long test flag value", new zzjs(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    public final String j0() {
        return this.g.get();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final String k0() {
        zzki P = this.a.I().P();
        if (P != null) {
            return P.b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    public final String l0() {
        zzki P = this.a.I().P();
        if (P != null) {
            return P.a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final String m0() {
        if (this.a.M() != null) {
            return this.a.M();
        }
        try {
            return new zzgz(a(), this.a.P()).b(FirebaseOptions.i);
        } catch (IllegalStateException e) {
            this.a.j().G().b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final String n0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) l().v(atomicReference, 15000L, "String test flag value", new zzjj(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb o() {
        return super.o();
    }

    @InterfaceC10697xN2
    public final void o0() {
        Boolean F;
        n();
        v();
        if (this.a.s()) {
            if (d().s(zzbi.k0) && (F = d().F("google_analytics_deferred_deep_link_enabled")) != null && F.booleanValue()) {
                j().F().a("Deferred Deep Link feature enabled.");
                l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zziq.this.r0();
                    }
                });
            }
            t().Y();
            this.f316o = false;
            String N = h().N();
            if (!TextUtils.isEmpty(N)) {
                e().o();
                if (!N.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", N);
                    A0("auto", "_ou", bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfl p() {
        return super.p();
    }

    public final void p0() {
        if ((a().getApplicationContext() instanceof Application) && this.c != null) {
            ((Application) a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfo q() {
        return super.q();
    }

    public final void q0() {
        if (zzpg.a() && d().s(zzbi.M0)) {
            if (l().J()) {
                j().G().a("Cannot get trigger URIs from analytics worker thread");
            } else if (zzae.a()) {
                j().G().a("Cannot get trigger URIs from main thread");
            } else {
                v();
                j().K().a("Getting trigger URIs (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                l().v(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzir
                    @Override // java.lang.Runnable
                    public final void run() {
                        zziq zziqVar = zziq.this;
                        AtomicReference<List<zzmh>> atomicReference2 = atomicReference;
                        Bundle a = zziqVar.h().n.a();
                        zzkp t = zziqVar.t();
                        if (a == null) {
                            a = new Bundle();
                        }
                        t.R(atomicReference2, a);
                    }
                });
                final List list = (List) atomicReference.get();
                if (list == null) {
                    j().G().a("Timed out waiting for get trigger URIs");
                } else {
                    l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zziq.this.e0(list);
                        }
                    });
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziq r() {
        return super.r();
    }

    @InterfaceC10697xN2
    public final void r0() {
        n();
        if (h().t.b()) {
            j().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = h().u.a();
        h().u.b(1 + a);
        if (a >= 5) {
            j().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            h().t.a(true);
        } else if (zznp.a() && d().s(zzbi.U0)) {
            if (this.p == null) {
                this.p = new zzjh(this, this.a);
            }
            this.p.b(0L);
        } else {
            this.a.u();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkh s() {
        return super.s();
    }

    @InterfaceC10697xN2
    @TargetApi(30)
    public final void s0() {
        zzmh poll;
        AbstractC10026ue1 Q0;
        n();
        if (!t0().isEmpty() && !this.i && (poll = t0().poll()) != null && (Q0 = i().Q0()) != null) {
            this.i = true;
            j().K().b("Registering trigger URI", poll.X);
            InterfaceFutureC8411o11<C7458kA2> e = Q0.e(Uri.parse(poll.X));
            if (e == null) {
                this.i = false;
                t0().add(poll);
                return;
            }
            SparseArray<Long> H = h().H();
            H.put(poll.Z, Long.valueOf(poll.Y));
            zzgd h = h();
            int[] iArr = new int[H.size()];
            long[] jArr = new long[H.size()];
            for (int i = 0; i < H.size(); i++) {
                iArr[i] = H.keyAt(i);
                jArr[i] = H.valueAt(i).longValue();
            }
            Bundle bundle = new Bundle();
            bundle.putIntArray("uriSources", iArr);
            bundle.putLongArray("uriTimestamps", jArr);
            h.n.b(bundle);
            C6980iC0.a(e, new zzjc(this, poll), new zziz(this));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkp t() {
        return super.t();
    }

    @TargetApi(30)
    public final PriorityQueue<zzmh> t0() {
        if (this.j == null) {
            this.j = new PriorityQueue<>(zzix.a(new Function() { // from class: com.google.android.gms.measurement.internal.zzip
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzmh) obj).Y);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzis
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (((Long) obj).longValue() > ((Long) obj2).longValue() ? 1 : (((Long) obj).longValue() == ((Long) obj2).longValue() ? 0 : -1));
                }
            }));
        }
        return this.j;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzlx u() {
        return super.u();
    }

    @InterfaceC10697xN2
    public final void u0() {
        zziq zziqVar;
        long j;
        n();
        String a = h().m.a();
        if (a != null) {
            if ("unset".equals(a)) {
                zziqVar = this;
                zziqVar.b0(FirebaseMessaging.r, "_npa", null, b().a());
            } else {
                if ("true".equals(a)) {
                    j = 1;
                } else {
                    j = 0;
                }
                b0(FirebaseMessaging.r, "_npa", Long.valueOf(j), b().a());
                zziqVar = this;
            }
        } else {
            zziqVar = this;
        }
        if (zziqVar.a.p() && zziqVar.f316o) {
            j().F().a("Recording app launch after enabling measurement for the first time (FE)");
            o0();
            if (zzoh.a() && d().s(zzbi.q0)) {
                u().e.a();
            }
            l().D(new zzje(this));
            return;
        }
        j().F().a("Updating Scion state (FE)");
        t().c0();
    }

    public final void v0(Bundle bundle) {
        I(bundle, b().a());
    }

    public final void w0(zzil zzilVar) {
        v();
        Preconditions.r(zzilVar);
        if (!this.e.remove(zzilVar)) {
            j().L().a("OnEventListener had not been registered");
        }
    }

    public final void y0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        l().D(new zzjg(this, str, str2, j, zznd.D(bundle), z, z2, z3, str3));
    }

    public final void z0(String str, String str2, Bundle bundle) {
        a0(str, str2, bundle, true, true, b().a());
    }
}
