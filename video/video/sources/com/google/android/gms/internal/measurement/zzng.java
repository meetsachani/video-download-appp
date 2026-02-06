package com.google.android.gms.internal.measurement;

import o.C5865df1;

/* loaded from: classes3.dex */
public final class zzng implements zznh {
    public static final zzgn<String> A;
    public static final zzgn<String> B;
    public static final zzgn<String> C;
    public static final zzgn<String> D;
    public static final zzgn<Long> E;
    public static final zzgn<Long> F;
    public static final zzgn<Long> G;
    public static final zzgn<Long> H;
    public static final zzgn<Long> I;
    public static final zzgn<Long> J;
    public static final zzgn<Long> K;
    public static final zzgn<Long> L;
    public static final zzgn<Long> M;
    public static final zzgn<Long> N;
    public static final zzgn<Long> O;
    public static final zzgn<Long> P;
    public static final zzgn<Long> Q;
    public static final zzgn<Long> R;
    public static final zzgn<Long> S;
    public static final zzgn<Long> T;
    public static final zzgn<Long> U;
    public static final zzgn<String> V;
    public static final zzgn<Long> W;
    public static final zzgn<String> X;
    public static final zzgn<Long> a;
    public static final zzgn<Long> b;
    public static final zzgn<Long> c;
    public static final zzgn<Long> d;
    public static final zzgn<String> e;
    public static final zzgn<String> f;
    public static final zzgn<String> g;
    public static final zzgn<Long> h;
    public static final zzgn<String> i;
    public static final zzgn<Long> j;
    public static final zzgn<Long> k;
    public static final zzgn<Long> l;
    public static final zzgn<Long> m;
    public static final zzgn<Long> n;

    /* renamed from: o  reason: collision with root package name */
    public static final zzgn<Long> f308o;
    public static final zzgn<Long> p;
    public static final zzgn<Long> q;
    public static final zzgn<Long> r;
    public static final zzgn<Long> s;
    public static final zzgn<String> t;
    public static final zzgn<Long> u;
    public static final zzgn<Long> v;
    public static final zzgn<Long> w;
    public static final zzgn<Long> x;
    public static final zzgn<String> y;
    public static final zzgn<Long> z;

    static {
        zzgv e2 = new zzgv(zzgk.a("com.google.android.gms.measurement")).f().e();
        a = e2.b("measurement.ad_id_cache_time", 10000L);
        b = e2.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        c = e2.b("measurement.max_bundles_per_iteration", 100L);
        d = e2.b("measurement.config.cache_time", 86400000L);
        e = e2.c("measurement.log_tag", "FA");
        f = e2.c("measurement.config.url_authority", "app-measurement.com");
        g = e2.c("measurement.config.url_scheme", "https");
        h = e2.b("measurement.upload.debug_upload_interval", 1000L);
        i = e2.c("measurement.rb.attribution.event_params", "value|currency");
        j = e2.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        k = e2.b("measurement.upload.max_event_parameter_value_length", 100L);
        l = e2.b("measurement.store.max_stored_events_per_app", 100000L);
        m = e2.b("measurement.experiment.max_ids", 50L);
        n = e2.b("measurement.audience.filter_result_max_count", 200L);
        f308o = e2.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        p = e2.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        q = e2.b("measurement.alarm_manager.minimum_interval", 60000L);
        r = e2.b("measurement.upload.minimum_delay", 500L);
        s = e2.b("measurement.monitoring.sample_period_millis", 86400000L);
        t = e2.c("measurement.rb.attribution.app_allowlist", "");
        u = e2.b("measurement.upload.realtime_upload_interval", 10000L);
        v = e2.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        w = e2.b("measurement.config.cache_time.service", 3600000L);
        x = e2.b("measurement.service_client.idle_disconnect_millis", 5000L);
        y = e2.c("measurement.log_tag.service", "FA-SVC");
        z = e2.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        A = e2.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        B = e2.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        C = e2.c("measurement.rb.attribution.query_parameters_to_remove", "");
        D = e2.c("measurement.rb.attribution.uri_scheme", "https");
        E = e2.b("measurement.sdk.attribution.cache.ttl", 604800000L);
        F = e2.b("measurement.redaction.app_instance_id.ttl", 7200000L);
        G = e2.b("measurement.upload.backoff_period", 43200000L);
        H = e2.b("measurement.upload.initial_upload_delay_time", 15000L);
        I = e2.b("measurement.upload.interval", 3600000L);
        J = e2.b("measurement.upload.max_bundle_size", 65536L);
        K = e2.b("measurement.upload.max_bundles", 100L);
        L = e2.b("measurement.upload.max_conversions_per_day", 500L);
        M = e2.b("measurement.upload.max_error_events_per_day", 1000L);
        N = e2.b("measurement.upload.max_events_per_bundle", 1000L);
        O = e2.b("measurement.upload.max_events_per_day", 100000L);
        P = e2.b("measurement.upload.max_public_events_per_day", C5865df1.d.u);
        Q = e2.b("measurement.upload.max_queue_time", 2419200000L);
        R = e2.b("measurement.upload.max_realtime_events_per_day", 10L);
        S = e2.b("measurement.upload.max_batch_size", 65536L);
        T = e2.b("measurement.upload.retry_count", 6L);
        U = e2.b("measurement.upload.retry_time", 1800000L);
        V = e2.c("measurement.upload.url", "https://app-measurement.com/a");
        W = e2.b("measurement.upload.window_interval", 3600000L);
        X = e2.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long B() {
        return H.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long C() {
        return K.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long W() {
        return S.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long Y() {
        return Q.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String Z() {
        return g.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long a() {
        return a.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long a0() {
        return N.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long b() {
        return b.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long b0() {
        return O.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long c() {
        return c.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long c0() {
        return L.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long d() {
        return h.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long e() {
        return j.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long e0() {
        return M.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long f() {
        return d.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long f0() {
        return R.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long g() {
        return k.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long g0() {
        return P.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long h() {
        return l.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long i() {
        return m.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long j() {
        return n.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String j0() {
        return f.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long k() {
        return f308o.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long k0() {
        return U.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long l() {
        return p.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long m() {
        return q.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long m0() {
        return T.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long n() {
        return r.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String n0() {
        return A.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long o() {
        return u.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String o0() {
        return B.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long p() {
        return s.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String p0() {
        return i.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long q() {
        return G.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String q0() {
        return t.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long r() {
        return v.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String r0() {
        return V.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long s() {
        return z.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long t() {
        return F.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String t0() {
        return X.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long v() {
        return E.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String v0() {
        return C.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long w() {
        return J.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final String w0() {
        return D.e();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long x() {
        return x.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long y() {
        return I.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final long y0() {
        return W.e().longValue();
    }
}
