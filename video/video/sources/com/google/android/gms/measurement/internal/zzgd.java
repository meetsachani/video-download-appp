package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.measurement.internal.zzih;
import com.google.firebase.messaging.GmsRpc;
import o.C9755tW1;
import o.InterfaceC10697xN2;
import o.InterfaceC5299bJ2;
import o.InterfaceC8557od0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgd extends zzic {
    public static final Pair<String, Long> z = new Pair<>("", 0L);
    public SharedPreferences c;
    public zzgh d;
    public final zzgi e;
    public final zzgi f;
    public final zzgj g;
    public String h;
    public boolean i;
    public long j;
    public final zzgi k;
    public final zzgg l;
    public final zzgj m;
    public final zzgf n;

    /* renamed from: o  reason: collision with root package name */
    public final zzgg f313o;
    public final zzgi p;
    public final zzgi q;
    public boolean r;
    public zzgg s;
    public zzgg t;
    public zzgi u;
    public final zzgj v;
    public final zzgj w;
    public final zzgi x;
    public final zzgf y;

    public zzgd(zzhf zzhfVar) {
        super(zzhfVar);
        this.k = new zzgi(this, "session_timeout", 1800000L);
        this.l = new zzgg(this, "start_new_session", true);
        this.p = new zzgi(this, "last_pause_time", 0L);
        this.q = new zzgi(this, C9755tW1.p, 0L);
        this.m = new zzgj(this, "non_personalized_ads", null);
        this.n = new zzgf(this, "last_received_uri_timestamps_by_source", null);
        this.f313o = new zzgg(this, "allow_remote_dynamite", false);
        this.e = new zzgi(this, "first_open_time", 0L);
        this.f = new zzgi(this, "app_install_time", 0L);
        this.g = new zzgj(this, "app_instance_id", null);
        this.s = new zzgg(this, "app_backgrounded", false);
        this.t = new zzgg(this, "deep_link_retrieval_complete", false);
        this.u = new zzgi(this, "deep_link_retrieval_attempts", 0L);
        this.v = new zzgj(this, "firebase_feature_rollouts", null);
        this.w = new zzgj(this, "deferred_attribution_cache", null);
        this.x = new zzgi(this, "deferred_attribution_cache_timestamp", 0L);
        this.y = new zzgf(this, "default_event_parameters", null);
    }

    @InterfaceC10697xN2
    public final boolean A(zzih zzihVar) {
        n();
        int b = zzihVar.b();
        if (x(b)) {
            SharedPreferences.Editor edit = F().edit();
            edit.putString("consent_settings", zzihVar.v());
            edit.putInt("consent_source", b);
            edit.apply();
            return true;
        }
        return false;
    }

    @InterfaceC10697xN2
    public final boolean B() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    @InterfaceC10697xN2
    public final void C(Boolean bool) {
        n();
        SharedPreferences.Editor edit = F().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    @InterfaceC10697xN2
    public final void D(String str) {
        n();
        SharedPreferences.Editor edit = F().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    @InterfaceC10697xN2
    public final void E(boolean z2) {
        n();
        j().K().b("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = F().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    @InterfaceC5299bJ2
    @InterfaceC10697xN2
    public final SharedPreferences F() {
        n();
        o();
        Preconditions.r(this.c);
        return this.c;
    }

    @InterfaceC10697xN2
    public final void G(String str) {
        n();
        SharedPreferences.Editor edit = F().edit();
        edit.putString(GmsRpc.A, str);
        edit.apply();
    }

    public final SparseArray<Long> H() {
        Bundle a = this.n.a();
        if (a == null) {
            return new SparseArray<>();
        }
        int[] intArray = a.getIntArray("uriSources");
        long[] longArray = a.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                j().G().a("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray<>();
            }
            SparseArray<Long> sparseArray = new SparseArray<>();
            for (int i = 0; i < intArray.length; i++) {
                sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
            }
            return sparseArray;
        }
        return new SparseArray<>();
    }

    @InterfaceC10697xN2
    public final zzay I() {
        n();
        return zzay.c(F().getString("dma_consent_settings", null));
    }

    @InterfaceC10697xN2
    public final zzih J() {
        n();
        return zzih.f(F().getString("consent_settings", "G1"), F().getInt("consent_source", 100));
    }

    @InterfaceC10697xN2
    public final Boolean K() {
        n();
        if (!F().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(F().getBoolean("use_service", false));
    }

    @InterfaceC10697xN2
    public final Boolean L() {
        n();
        if (F().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(F().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    @InterfaceC10697xN2
    public final Boolean M() {
        n();
        if (F().contains("measurement_enabled")) {
            return Boolean.valueOf(F().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @InterfaceC10697xN2
    public final String N() {
        n();
        String string = F().getString("previous_os_version", null);
        e().o();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = F().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    @InterfaceC10697xN2
    public final String O() {
        n();
        return F().getString("admob_app_id", null);
    }

    @InterfaceC10697xN2
    public final String P() {
        n();
        return F().getString(GmsRpc.A, null);
    }

    @InterfaceC10697xN2
    public final void Q() {
        n();
        Boolean M = M();
        SharedPreferences.Editor edit = F().edit();
        edit.clear();
        edit.apply();
        if (M != null) {
            v(M);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    public final boolean s() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    @InterfaceC8557od0.a({@InterfaceC8557od0({"this.preferences"}), @InterfaceC8557od0({"this.monitoringSample"})})
    @InterfaceC10697xN2
    public final void t() {
        SharedPreferences sharedPreferences = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.r = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.d = new zzgh(this, "health_monitor", Math.max(0L, zzbi.e.a(null).longValue()));
    }

    @InterfaceC10697xN2
    public final Pair<String, Boolean> u(String str) {
        n();
        if (zznw.a() && d().s(zzbi.R0) && !J().l(zzih.zza.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long b = b().b();
        if (this.h != null && b < this.j) {
            return new Pair<>(this.h, Boolean.valueOf(this.i));
        }
        this.j = b + d().C(str);
        AdvertisingIdClient.d(true);
        try {
            AdvertisingIdClient.Info a = AdvertisingIdClient.a(a());
            this.h = "";
            String a2 = a.a();
            if (a2 != null) {
                this.h = a2;
            }
            this.i = a.b();
        } catch (Exception e) {
            j().F().b("Unable to get advertising id", e);
            this.h = "";
        }
        AdvertisingIdClient.d(false);
        return new Pair<>(this.h, Boolean.valueOf(this.i));
    }

    @InterfaceC10697xN2
    public final void v(Boolean bool) {
        n();
        SharedPreferences.Editor edit = F().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @InterfaceC10697xN2
    public final void w(boolean z2) {
        n();
        SharedPreferences.Editor edit = F().edit();
        edit.putBoolean("use_service", z2);
        edit.apply();
    }

    @InterfaceC10697xN2
    public final boolean x(int i) {
        return zzih.k(i, F().getInt("consent_source", 100));
    }

    public final boolean y(long j) {
        if (j - this.k.a() > this.p.a()) {
            return true;
        }
        return false;
    }

    @InterfaceC10697xN2
    public final boolean z(zzay zzayVar) {
        n();
        if (zzih.k(zzayVar.a(), I().a())) {
            SharedPreferences.Editor edit = F().edit();
            edit.putString("dma_consent_settings", zzayVar.i());
            edit.apply();
            return true;
        }
        return false;
    }
}
