package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.InterfaceC10389w71;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;
import o.JK1;
import o.M82;

/* loaded from: classes3.dex */
public final class zzkh extends zze {
    public volatile zzki c;
    public volatile zzki d;
    @InterfaceC5056aJ2
    public zzki e;
    public final Map<Activity, zzki> f;
    @InterfaceC8710pF0("activityLock")
    public Activity g;
    @InterfaceC8710pF0("activityLock")
    public volatile boolean h;
    public volatile zzki i;
    public zzki j;
    @InterfaceC8710pF0("activityLock")
    public boolean k;
    public final Object l;

    public zzkh(zzhf zzhfVar) {
        super(zzhfVar);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    public static /* synthetic */ void J(zzkh zzkhVar, Bundle bundle, zzki zzkiVar, zzki zzkiVar2, long j) {
        if (bundle != null) {
            bundle.remove(FirebaseAnalytics.Param.p0);
            bundle.remove(FirebaseAnalytics.Param.o0);
        }
        zzkhVar.N(zzkiVar, zzkiVar2, j, true, zzkhVar.i().E(null, FirebaseAnalytics.Event.A, bundle, null, false));
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final boolean A() {
        return false;
    }

    @InterfaceC10697xN2
    public final zzki C(boolean z) {
        v();
        n();
        if (!z) {
            return this.e;
        }
        zzki zzkiVar = this.e;
        if (zzkiVar != null) {
            return zzkiVar;
        }
        return this.j;
    }

    @InterfaceC5056aJ2
    public final String D(Class<?> cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        if (split.length > 0) {
            str2 = split[split.length - 1];
        } else {
            str2 = "";
        }
        if (str2.length() > d().t(null)) {
            return str2.substring(0, d().t(null));
        }
        return str2;
    }

    @InterfaceC10389w71
    public final void E(Activity activity) {
        synchronized (this.l) {
            try {
                if (activity == this.g) {
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!d().Q()) {
            return;
        }
        this.f.remove(activity);
    }

    @InterfaceC10389w71
    public final void F(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!d().Q() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new zzki(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @InterfaceC10389w71
    public final void G(Activity activity, zzki zzkiVar, boolean z) {
        zzki zzkiVar2;
        zzki zzkiVar3;
        String str;
        if (this.c == null) {
            zzkiVar2 = this.d;
        } else {
            zzkiVar2 = this.c;
        }
        zzki zzkiVar4 = zzkiVar2;
        if (zzkiVar.b == null) {
            if (activity != null) {
                str = D(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            zzkiVar3 = new zzki(zzkiVar.a, str, zzkiVar.c, zzkiVar.e, zzkiVar.f);
        } else {
            zzkiVar3 = zzkiVar;
        }
        this.d = this.c;
        this.c = zzkiVar3;
        l().D(new zzkm(this, zzkiVar3, zzkiVar4, b().b(), z));
    }

    @Deprecated
    public final void H(@InterfaceC5670cr1 Activity activity, @M82(max = 36, min = 1) String str, @M82(max = 36, min = 1) String str2) {
        String str3;
        if (!d().Q()) {
            j().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzki zzkiVar = this.c;
        if (zzkiVar == null) {
            j().M().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f.get(activity) == null) {
            j().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = D(activity.getClass(), "Activity");
            }
            boolean a = zzkk.a(zzkiVar.b, str2);
            boolean a2 = zzkk.a(zzkiVar.a, str);
            if (a && a2) {
                j().M().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > d().t(null))) {
                j().M().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > d().t(null))) {
                j().M().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                zzft K = j().K();
                if (str == null) {
                    str3 = "null";
                } else {
                    str3 = str;
                }
                K.c("Setting current screen to name, class", str3, str2);
                zzki zzkiVar2 = new zzki(str, str2, i().P0());
                this.f.put(activity, zzkiVar2);
                G(activity, zzkiVar2, true);
            }
        }
    }

    public final void I(Bundle bundle, long j) {
        String str;
        String str2;
        String str3;
        zzki zzkiVar;
        synchronized (this.l) {
            try {
                if (!this.k) {
                    j().M().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String str4 = null;
                if (bundle != null) {
                    String string = bundle.getString(FirebaseAnalytics.Param.p0);
                    if (string != null && (string.length() <= 0 || string.length() > d().t(null))) {
                        j().M().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString(FirebaseAnalytics.Param.o0);
                    if (string2 != null && (string2.length() <= 0 || string2.length() > d().t(null))) {
                        j().M().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str4 = string2;
                        str = string;
                    }
                } else {
                    str = null;
                }
                if (str4 == null) {
                    Activity activity = this.g;
                    if (activity != null) {
                        str4 = D(activity.getClass(), "Activity");
                    } else {
                        str4 = "Activity";
                    }
                }
                String str5 = str4;
                zzki zzkiVar2 = this.c;
                if (this.h && zzkiVar2 != null) {
                    this.h = false;
                    boolean a = zzkk.a(zzkiVar2.b, str5);
                    boolean a2 = zzkk.a(zzkiVar2.a, str);
                    if (a && a2) {
                        j().M().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzft K = j().K();
                if (str == null) {
                    str2 = "null";
                } else {
                    str2 = str;
                }
                if (str5 == null) {
                    str3 = "null";
                } else {
                    str3 = str5;
                }
                K.c("Logging screen view with name, class", str2, str3);
                if (this.c == null) {
                    zzkiVar = this.d;
                } else {
                    zzkiVar = this.c;
                }
                zzki zzkiVar3 = new zzki(str, str5, i().P0(), true, j);
                this.c = zzkiVar3;
                this.d = zzkiVar;
                this.i = zzkiVar3;
                l().D(new zzkj(this, bundle, zzkiVar3, zzkiVar, b().b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.os.BaseBundle, long] */
    @InterfaceC10697xN2
    public final void N(zzki zzkiVar, zzki zzkiVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        Bundle bundle2;
        String str;
        long j2;
        Bundle bundle3;
        n();
        boolean z3 = false;
        if (zzkiVar2 != null && zzkiVar2.c == zzkiVar.c && zzkk.a(zzkiVar2.b, zzkiVar.b) && zzkk.a(zzkiVar2.a, zzkiVar.a)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && this.e != null) {
            z3 = true;
        }
        if (z2) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            zznd.W(zzkiVar, bundle2, true);
            if (zzkiVar2 != null) {
                String str2 = zzkiVar2.a;
                if (str2 != null) {
                    "_pn".putString("_pn", str2);
                }
                String str3 = zzkiVar2.b;
                if (str3 != null) {
                    "_pc".putString("_pc", str3);
                }
                ?? r7 = zzkiVar2.c;
                r7.putLong("_pi", r7);
            }
            ?? r72 = 0;
            if (z3) {
                long a = u().f.a(j);
                if (a > 0) {
                    i().L(null, a);
                }
            }
            if (!d().Q()) {
                r72.putLong("_mst", 1L);
            }
            if (zzkiVar.e) {
                str = FirebaseMessaging.r;
            } else {
                str = "auto";
            }
            String str4 = str;
            long a2 = b().a();
            if (zzkiVar.e) {
                long j3 = zzkiVar.f;
                int i = (j3 > j3 ? 1 : (j3 == j3 ? 0 : -1));
                r72 = j3;
                if (i != 0) {
                    j2 = j3;
                    bundle3 = j3;
                    r().V(str4, "_vs", j2, bundle3);
                }
            }
            j2 = a2;
            bundle3 = r72;
            r().V(str4, "_vs", j2, bundle3);
        }
        if (z3) {
            O(this.e, true, j);
        }
        this.e = zzkiVar;
        if (zzkiVar.e) {
            this.j = zzkiVar;
        }
        t().L(zzkiVar);
    }

    @InterfaceC10697xN2
    public final void O(zzki zzkiVar, boolean z, long j) {
        boolean z2;
        o().v(b().b());
        if (zzkiVar != null && zzkiVar.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (u().E(z2, z, j) && zzkiVar != null) {
            zzkiVar.d = false;
        }
    }

    public final zzki P() {
        return this.c;
    }

    @InterfaceC10389w71
    public final void Q(Activity activity) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
        }
        long b = b().b();
        if (!d().Q()) {
            this.c = null;
            l().D(new zzko(this, b));
            return;
        }
        zzki T = T(activity);
        this.d = this.c;
        this.c = null;
        l().D(new zzkn(this, T, b));
    }

    @InterfaceC10389w71
    public final void R(Activity activity, Bundle bundle) {
        zzki zzkiVar;
        if (!d().Q() || bundle == null || (zzkiVar = this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzkiVar.c);
        bundle2.putString("name", zzkiVar.a);
        bundle2.putString("referrer_name", zzkiVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @InterfaceC10389w71
    public final void S(Activity activity) {
        synchronized (this.l) {
            this.k = true;
            if (activity != this.g) {
                synchronized (this.l) {
                    this.g = activity;
                    this.h = false;
                }
                if (d().Q()) {
                    this.i = null;
                    l().D(new zzkq(this));
                }
            }
        }
        if (!d().Q()) {
            this.c = this.i;
            l().D(new zzkl(this));
            return;
        }
        G(activity, T(activity), false);
        zzb o2 = o();
        o2.l().D(new zzc(o2, o2.b().b()));
    }

    @InterfaceC10389w71
    public final zzki T(@InterfaceC5670cr1 Activity activity) {
        Preconditions.r(activity);
        zzki zzkiVar = this.f.get(activity);
        if (zzkiVar == null) {
            zzki zzkiVar2 = new zzki(null, D(activity.getClass(), "Activity"), i().P0());
            this.f.put(activity, zzkiVar2);
            zzkiVar = zzkiVar2;
        }
        if (this.i != null) {
            return this.i;
        }
        return zzkiVar;
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
}
