package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.measurement.internal.zzih;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import o.C2531Be;
import o.C5475c30;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.JK1;
import o.SQ0;
import o.Y61;

/* loaded from: classes3.dex */
public final class zzgp extends zzmo implements zzah {
    public final Map<String, Map<String, String>> d;
    @InterfaceC5056aJ2
    public final Map<String, Set<String>> e;
    @InterfaceC5056aJ2
    public final Map<String, Map<String, Boolean>> f;
    @InterfaceC5056aJ2
    public final Map<String, Map<String, Boolean>> g;
    public final Map<String, zzfc.zzd> h;
    public final Map<String, Map<String, Integer>> i;
    @InterfaceC5056aJ2
    public final Y61<String, com.google.android.gms.internal.measurement.zzb> j;
    public final com.google.android.gms.internal.measurement.zzv k;
    public final Map<String, String> l;
    public final Map<String, String> m;
    public final Map<String, String> n;

    public zzgp(zzmp zzmpVar) {
        super(zzmpVar);
        this.d = new C2531Be();
        this.e = new C2531Be();
        this.f = new C2531Be();
        this.g = new C2531Be();
        this.h = new C2531Be();
        this.l = new C2531Be();
        this.m = new C2531Be();
        this.n = new C2531Be();
        this.i = new C2531Be();
        this.j = new zzgv(this, 20);
        this.k = new zzgu(this);
    }

    public static zzih.zza B(zzfc.zza.zze zzeVar) {
        int i = zzgw.b[zzeVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return zzih.zza.AD_PERSONALIZATION;
                }
                return zzih.zza.AD_USER_DATA;
            }
            return zzih.zza.ANALYTICS_STORAGE;
        }
        return zzih.zza.AD_STORAGE;
    }

    public static Map<String, String> D(zzfc.zzd zzdVar) {
        C2531Be c2531Be = new C2531Be();
        if (zzdVar != null) {
            for (zzfc.zzg zzgVar : zzdVar.W()) {
                c2531Be.put(zzgVar.G(), zzgVar.H());
            }
        }
        return c2531Be;
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzb z(zzgp zzgpVar, String str) {
        zzgpVar.u();
        Preconditions.l(str);
        if (!zzgpVar.W(str)) {
            return null;
        }
        if (zzgpVar.h.containsKey(str) && zzgpVar.h.get(str) != null) {
            zzgpVar.G(str, zzgpVar.h.get(str));
        } else {
            zzgpVar.g0(str);
        }
        return zzgpVar.j.q().get(str);
    }

    @InterfaceC10697xN2
    public final zzfc.zzd A(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return zzfc.zzd.O();
        }
        try {
            zzfc.zzd zzdVar = (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) ((zzfc.zzd.zza) zzmz.F(zzfc.zzd.M(), bArr)).e0());
            zzft K = j().K();
            String str2 = null;
            if (zzdVar.b0()) {
                l = Long.valueOf(zzdVar.K());
            } else {
                l = null;
            }
            if (zzdVar.Z()) {
                str2 = zzdVar.P();
            }
            K.c("Parsed config. version, gmp_app_id", l, str2);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzji e) {
            j().L().c("Unable to merge remote config. appId", zzfr.v(str), e);
            return zzfc.zzd.O();
        } catch (RuntimeException e2) {
            j().L().c("Unable to merge remote config. appId", zzfr.v(str), e2);
            return zzfc.zzd.O();
        }
    }

    @InterfaceC10697xN2
    public final zzih.zza C(String str, zzih.zza zzaVar) {
        n();
        g0(str);
        zzfc.zza J = J(str);
        if (J == null) {
            return null;
        }
        for (zzfc.zza.zzc zzcVar : J.J()) {
            if (zzaVar == B(zzcVar.H())) {
                return B(zzcVar.G());
            }
        }
        return null;
    }

    public final void F(String str, zzfc.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        C2531Be c2531Be = new C2531Be();
        C2531Be c2531Be2 = new C2531Be();
        C2531Be c2531Be3 = new C2531Be();
        if (zzaVar != null) {
            for (zzfc.zzb zzbVar : zzaVar.B()) {
                hashSet.add(zzbVar.G());
            }
            for (int i = 0; i < zzaVar.v(); i++) {
                zzfc.zzc.zza x = zzaVar.w(i).x();
                if (x.x().isEmpty()) {
                    j().L().a("EventConfig contained null event name");
                } else {
                    String x2 = x.x();
                    String b = zzii.b(x.x());
                    if (!TextUtils.isEmpty(b)) {
                        x = x.w(b);
                        zzaVar.x(i, x);
                    }
                    if (x.A() && x.y()) {
                        c2531Be.put(x2, Boolean.TRUE);
                    }
                    if (x.B() && x.z()) {
                        c2531Be2.put(x.x(), Boolean.TRUE);
                    }
                    if (x.C()) {
                        if (x.v() >= 2 && x.v() <= 65535) {
                            c2531Be3.put(x.x(), Integer.valueOf(x.v()));
                        } else {
                            j().L().c("Invalid sampling rate. Event name, sample rate", x.x(), Integer.valueOf(x.v()));
                        }
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f.put(str, c2531Be);
        this.g.put(str, c2531Be2);
        this.i.put(str, c2531Be3);
    }

    @InterfaceC10697xN2
    public final void G(final String str, zzfc.zzd zzdVar) {
        if (zzdVar.m() == 0) {
            this.j.l(str);
            return;
        }
        j().K().b("EES programs found", Integer.valueOf(zzdVar.m()));
        zzfp.zzc zzcVar = zzdVar.V().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.c("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzm("internal.remoteConfig", new zzgx(zzgp.this, str));
                }
            });
            zzbVar.c("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzgp zzgpVar = zzgp.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgr
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzgp zzgpVar2 = zzgp.this;
                            String str3 = str2;
                            zzh D0 = zzgpVar2.q().D0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 82001L);
                            if (D0 != null) {
                                String h = D0.h();
                                if (h != null) {
                                    hashMap.put("app_version", h);
                                }
                                hashMap.put("app_version_int", Long.valueOf(D0.z()));
                                hashMap.put("dynamite_version", Long.valueOf(D0.c0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzbVar.c("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzr(zzgp.this.k);
                }
            });
            zzbVar.b(zzcVar);
            this.j.j(str, zzbVar);
            j().K().c("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.F().m()));
            for (zzfp.zzb zzbVar2 : zzcVar.F().H()) {
                j().K().b("EES program activity", zzbVar2.G());
            }
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            j().G().b("Failed to load EES program. appId", str);
        }
    }

    @InterfaceC10697xN2
    public final boolean H(String str, byte[] bArr, String str2, String str3) {
        u();
        n();
        Preconditions.l(str);
        zzfc.zzd.zza x = A(str, bArr).x();
        if (x == null) {
            return false;
        }
        F(str, x);
        G(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) x.e0()));
        this.h.put(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) x.e0()));
        this.l.put(str, x.z());
        this.m.put(str, str2);
        this.n.put(str, str3);
        this.d.put(str, D((zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) x.e0())));
        q().Z(str, new ArrayList(x.A()));
        try {
            x.y();
            bArr = ((zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) x.e0())).k();
        } catch (RuntimeException e) {
            j().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", zzfr.v(str), e);
        }
        zzao q = q();
        Preconditions.l(str);
        q.n();
        q.u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (q.B().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                q.j().G().b("Failed to update remote config (got 0). appId", zzfr.v(str));
            }
        } catch (SQLiteException e2) {
            q.j().G().c("Error storing remote config. appId", zzfr.v(str), e2);
        }
        this.h.put(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) x.e0()));
        return true;
    }

    @InterfaceC10697xN2
    public final int I(String str, String str2) {
        Integer num;
        n();
        g0(str);
        Map<String, Integer> map = this.i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @InterfaceC10697xN2
    public final zzfc.zza J(String str) {
        n();
        g0(str);
        zzfc.zzd L = L(str);
        if (L != null && L.Y()) {
            return L.L();
        }
        return null;
    }

    @InterfaceC10697xN2
    public final boolean K(String str, zzih.zza zzaVar) {
        n();
        g0(str);
        zzfc.zza J = J(str);
        if (J == null) {
            return false;
        }
        Iterator<zzfc.zza.zzb> it = J.I().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfc.zza.zzb next = it.next();
            if (zzaVar == B(next.H())) {
                if (next.G() == zzfc.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    @InterfaceC10697xN2
    public final zzfc.zzd L(String str) {
        u();
        n();
        Preconditions.l(str);
        g0(str);
        return this.h.get(str);
    }

    @InterfaceC10697xN2
    public final boolean M(String str, String str2) {
        Boolean bool;
        n();
        g0(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.D.equals(str2) || FirebaseAnalytics.Event.E.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @InterfaceC10697xN2
    public final String N(String str) {
        n();
        return this.n.get(str);
    }

    @InterfaceC10697xN2
    public final boolean O(String str, String str2) {
        Boolean bool;
        n();
        g0(str);
        if (X(str) && zznd.H0(str2)) {
            return true;
        }
        if (Z(str) && zznd.J0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @InterfaceC10697xN2
    public final String P(String str) {
        n();
        return this.m.get(str);
    }

    @InterfaceC10697xN2
    public final String Q(String str) {
        n();
        g0(str);
        return this.l.get(str);
    }

    @InterfaceC10697xN2
    public final Set<String> R(String str) {
        n();
        g0(str);
        return this.e.get(str);
    }

    @InterfaceC10697xN2
    public final SortedSet<String> S(String str) {
        n();
        g0(str);
        TreeSet treeSet = new TreeSet();
        zzfc.zza J = J(str);
        if (J != null) {
            for (zzfc.zza.zzf zzfVar : J.H()) {
                treeSet.add(zzfVar.G());
            }
        }
        return treeSet;
    }

    @InterfaceC10697xN2
    public final void T(String str) {
        n();
        this.m.put(str, null);
    }

    @InterfaceC10697xN2
    public final void U(String str) {
        n();
        this.h.remove(str);
    }

    @InterfaceC10697xN2
    public final boolean V(String str) {
        n();
        zzfc.zzd L = L(str);
        if (L == null) {
            return false;
        }
        return L.X();
    }

    public final boolean W(String str) {
        zzfc.zzd zzdVar;
        if (TextUtils.isEmpty(str) || (zzdVar = this.h.get(str)) == null || zzdVar.m() == 0) {
            return false;
        }
        return true;
    }

    public final boolean X(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    @InterfaceC10697xN2
    public final boolean Y(String str) {
        n();
        g0(str);
        zzfc.zza J = J(str);
        if (J == null || !J.L() || J.K()) {
            return true;
        }
        return false;
    }

    public final boolean Z(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @InterfaceC10697xN2
    public final boolean a0(String str) {
        n();
        g0(str);
        if (this.e.get(str) != null && this.e.get(str).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    @InterfaceC10697xN2
    public final boolean b0(String str) {
        n();
        g0(str);
        if (this.e.get(str) != null) {
            if (this.e.get(str).contains(SQ0.m) || this.e.get(str).contains(C5475c30.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzah
    @InterfaceC10697xN2
    public final String c(String str, String str2) {
        n();
        g0(str);
        Map<String, String> map = this.d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @InterfaceC10697xN2
    public final boolean c0(String str) {
        n();
        g0(str);
        if (this.e.get(str) != null && this.e.get(str).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @InterfaceC10697xN2
    public final boolean d0(String str) {
        n();
        g0(str);
        if (this.e.get(str) != null && this.e.get(str).contains("google_signals")) {
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
    public final boolean e0(String str) {
        n();
        g0(str);
        if (this.e.get(str) != null) {
            if (this.e.get(str).contains("os_version") || this.e.get(str).contains(C5475c30.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @InterfaceC10697xN2
    public final boolean f0(String str) {
        n();
        g0(str);
        if (this.e.get(str) != null && this.e.get(str).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    @InterfaceC10697xN2
    public final void g0(String str) {
        u();
        n();
        Preconditions.l(str);
        if (this.h.get(str) == null) {
            zzaq E0 = q().E0(str);
            if (E0 == null) {
                this.d.put(str, null);
                this.f.put(str, null);
                this.e.put(str, null);
                this.g.put(str, null);
                this.h.put(str, null);
                this.l.put(str, null);
                this.m.put(str, null);
                this.n.put(str, null);
                this.i.put(str, null);
                return;
            }
            zzfc.zzd.zza x = A(str, E0.a).x();
            F(str, x);
            this.d.put(str, D((zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) x.e0())));
            this.h.put(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) x.e0()));
            G(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) x.e0()));
            this.l.put(str, x.z());
            this.m.put(str, E0.b);
            this.n.put(str, E0.c);
        }
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

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzt p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzao q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzgp r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzls s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmn t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean x() {
        return false;
    }

    @InterfaceC10697xN2
    public final long y(String str) {
        String c = c(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(c)) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e) {
                j().L().c("Unable to parse timezone offset. appId", zzfr.v(str), e);
                return 0L;
            }
        }
        return 0L;
    }
}
