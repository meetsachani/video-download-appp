package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.zznj;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzon;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzou;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpl;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzpx;
import com.google.android.gms.internal.measurement.zzpy;
import com.google.android.gms.internal.measurement.zzqd;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.internal.measurement.zzqj;
import com.google.android.gms.internal.measurement.zzqk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzbi {
    public static final zzfi<Boolean> A0;
    public static final zzfi<Boolean> B0;
    public static final zzfi<Boolean> C0;
    public static final zzfi<Boolean> D0;
    public static final zzfi<Boolean> E0;
    public static final zzfi<Boolean> F0;
    public static final zzfi<Boolean> G0;
    public static final zzfi<Boolean> H0;
    public static final zzfi<Boolean> I0;
    public static final zzfi<Boolean> J0;
    public static final zzfi<Boolean> K0;
    public static final zzfi<Boolean> L0;
    public static final zzfi<Boolean> M;
    public static final zzfi<Boolean> M0;
    public static final zzfi<String> N;
    public static final zzfi<Boolean> N0;
    public static final zzfi<Long> O;
    public static final zzfi<Boolean> O0;
    public static final zzfi<Integer> P;
    public static final zzfi<Boolean> P0;
    public static final zzfi<Double> Q;
    public static final zzfi<Boolean> Q0;
    public static final zzfi<Integer> R;
    public static final zzfi<Boolean> R0;
    public static final zzfi<Integer> S;
    public static final zzfi<Boolean> S0;
    public static final zzfi<Integer> T;
    public static final zzfi<Boolean> T0;
    public static final zzfi<Integer> U;
    public static final zzfi<Boolean> U0;
    public static final zzfi<Long> V;
    public static final zzfi<Boolean> V0;
    public static final zzfi<Long> W;
    public static final zzfi<Boolean> W0;
    public static final zzfi<Integer> X;
    public static final zzfi<Boolean> X0;
    public static final zzfi<String> Y;
    public static final zzfi<Boolean> Y0;
    public static final zzfi<String> Z;
    public static final zzfi<Boolean> Z0;
    public static final zzfi<String> a0;
    public static final zzfi<Boolean> a1;
    public static final zzfi<String> b0;
    public static zzfi<Boolean> b1;
    public static final zzfi<String> c0;
    public static final zzfi<String> d0;
    public static final zzfi<String> e0;
    public static final zzfi<Boolean> f0;
    public static final zzfi<Boolean> g0;
    public static final zzfi<Boolean> h0;
    public static final zzfi<Boolean> i0;
    public static final zzfi<Boolean> j0;
    public static final zzfi<Boolean> k0;
    public static final zzfi<Boolean> l0;
    public static final zzfi<Boolean> m0;
    public static final zzfi<Boolean> n0;
    public static final zzfi<Boolean> o0;
    public static final zzfi<Boolean> p0;
    public static final zzfi<Boolean> q0;
    public static final zzfi<Integer> r0;
    public static final zzfi<Boolean> s0;
    public static final zzfi<Boolean> t0;
    public static final zzfi<Boolean> u0;
    public static final zzfi<Boolean> v0;
    public static final zzfi<Boolean> w0;
    public static final zzfi<Boolean> x0;
    public static final zzfi<Boolean> y0;
    public static final zzfi<Boolean> z0;
    public static final List<zzfi<?>> a = Collections.synchronizedList(new ArrayList());
    public static final Set<zzfi<?>> b = Collections.synchronizedSet(new HashSet());
    public static final zzfi<Long> c = a("measurement.ad_id_cache_time", 10000L, 10000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbk
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.a());
            return valueOf;
        }
    });
    public static final zzfi<Long> d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbo
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.w());
            return valueOf;
        }
    });
    public static final zzfi<Long> e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzca
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.J());
            return valueOf;
        }
    });
    public static final zzfi<Long> f = a("measurement.config.cache_time", 86400000L, 3600000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcm
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.y());
            return valueOf;
        }
    });
    public static final zzfi<String> g = a("measurement.config.url_scheme", "https", "https", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcy
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            String n2;
            n2 = com.google.android.gms.internal.measurement.zzne.n();
            return n2;
        }
    });
    public static final zzfi<String> h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdk
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            String m2;
            m2 = com.google.android.gms.internal.measurement.zzne.m();
            return m2;
        }
    });
    public static final zzfi<Integer> i = a("measurement.upload.max_bundles", 100, 100, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdw
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.U());
            return valueOf;
        }
    });
    public static final zzfi<Integer> j = a("measurement.upload.max_batch_size", 65536, 65536, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzei
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.i());
            return valueOf;
        }
    });
    public static final zzfi<Integer> k = a("measurement.upload.max_bundle_size", 65536, 65536, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzeu
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.T());
            return valueOf;
        }
    });
    public static final zzfi<Integer> l = a("measurement.upload.max_events_per_bundle", 1000, 1000, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbm
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.d());
            return valueOf;
        }
    });
    public static final zzfi<Integer> m = a("measurement.upload.max_events_per_day", 100000, 100000, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbw
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.e());
            return valueOf;
        }
    });
    public static final zzfi<Integer> n = a("measurement.upload.max_error_events_per_day", 1000, 1000, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcf
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.c());
            return valueOf;
        }
    });

    /* renamed from: o  reason: collision with root package name */
    public static final zzfi<Integer> f311o = a("measurement.upload.max_public_events_per_day", 50000, 50000, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcs
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.f());
            return valueOf;
        }
    });
    public static final zzfi<Integer> p = a("measurement.upload.max_conversions_per_day", 10000, 10000, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdb
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.b());
            return valueOf;
        }
    });
    public static final zzfi<Integer> q = a("measurement.upload.max_realtime_events_per_day", 10, 10, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdo
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.h());
            return valueOf;
        }
    });
    public static final zzfi<Integer> r = a("measurement.store.max_stored_events_per_app", 100000, 100000, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdx
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.C());
            return valueOf;
        }
    });
    public static final zzfi<String> s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzek
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            String u2;
            u2 = com.google.android.gms.internal.measurement.zzne.u();
            return u2;
        }
    });
    public static final zzfi<Long> t = a("measurement.upload.backoff_period", 43200000L, 43200000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzet
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.Q());
            return valueOf;
        }
    });
    public static final zzfi<Long> u = a("measurement.upload.window_interval", 3600000L, 3600000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbj
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.l());
            return valueOf;
        }
    });
    public static final zzfi<Long> v = a("measurement.upload.interval", 3600000L, 3600000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbl
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.S());
            return valueOf;
        }
    });
    public static final zzfi<Long> w = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbn
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.K());
            return valueOf;
        }
    });
    public static final zzfi<Long> x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbq
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.z());
            return valueOf;
        }
    });
    public static final zzfi<Long> y = a("measurement.upload.minimum_delay", 500L, 500L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbp
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.I());
            return valueOf;
        }
    });
    public static final zzfi<Long> z = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbs
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.H());
            return valueOf;
        }
    });
    public static final zzfi<Long> A = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbr
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.N());
            return valueOf;
        }
    });
    public static final zzfi<Long> B = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbu
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.L());
            return valueOf;
        }
    });
    public static final zzfi<Long> C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbt
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.R());
            return valueOf;
        }
    });
    public static final zzfi<Long> D = a("measurement.upload.retry_time", 1800000L, 1800000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbv
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.k());
            return valueOf;
        }
    });
    public static final zzfi<Integer> E = a("measurement.upload.retry_count", 6, 6, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzby
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.j());
            return valueOf;
        }
    });
    public static final zzfi<Long> F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbx
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.g());
            return valueOf;
        }
    });
    public static final zzfi<Integer> G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzbz
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.A());
            return valueOf;
        }
    });
    public static final zzfi<Integer> H = a("measurement.audience.filter_result_max_count", 200, 200, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcc
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.E());
            return valueOf;
        }
    });
    public static final zzfi<Integer> I = a("measurement.upload.max_public_user_properties", 25, 25, null);
    public static final zzfi<Integer> J = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
    public static final zzfi<Integer> K = a("measurement.upload.max_public_event_params", 25, 25, null);
    public static final zzfi<Long> L = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcb
        @Override // com.google.android.gms.measurement.internal.zzfg
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzne.M());
            return valueOf;
        }
    });

    static {
        Boolean bool = Boolean.FALSE;
        M = a("measurement.test.boolean_flag", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(zzpa.e());
                return valueOf;
            }
        });
        N = a("measurement.test.string_flag", "---", "---", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                String d2;
                d2 = zzpa.d();
                return d2;
            }
        });
        O = a("measurement.test.long_flag", -1L, -1L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Long valueOf;
                valueOf = Long.valueOf(zzpa.c());
                return valueOf;
            }
        });
        P = a("measurement.test.int_flag", -2, -2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Integer valueOf;
                valueOf = Integer.valueOf((int) zzpa.b());
                return valueOf;
            }
        });
        Double valueOf = Double.valueOf(-3.0d);
        Q = a("measurement.test.double_flag", valueOf, valueOf, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Double valueOf2;
                valueOf2 = Double.valueOf(zzpa.a());
                return valueOf2;
            }
        });
        R = a("measurement.experiment.max_ids", 50, 50, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.D());
                return valueOf2;
            }
        });
        S = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.F());
                return valueOf2;
            }
        });
        T = a("measurement.upload.max_event_parameter_value_length", 100, 100, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.B());
                return valueOf2;
            }
        });
        U = a("measurement.max_bundles_per_iteration", 100, 100, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.x());
                return valueOf2;
            }
        });
        V = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Long valueOf2;
                valueOf2 = Long.valueOf(com.google.android.gms.internal.measurement.zzne.O());
                return valueOf2;
            }
        });
        W = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Long valueOf2;
                valueOf2 = Long.valueOf(com.google.android.gms.internal.measurement.zzne.P());
                return valueOf2;
            }
        });
        X = a("measurement.rb.attribution.client.min_ad_services_version", 7, 7, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzne.G());
                return valueOf2;
            }
        });
        Y = a("measurement.rb.attribution.uri_scheme", "https", "https", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                String t2;
                t2 = com.google.android.gms.internal.measurement.zzne.t();
                return t2;
            }
        });
        Z = a("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                String q2;
                q2 = com.google.android.gms.internal.measurement.zzne.q();
                return q2;
            }
        });
        a0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                String r2;
                r2 = com.google.android.gms.internal.measurement.zzne.r();
                return r2;
            }
        });
        b0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,", "com.labpixies.flood,", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                String p2;
                p2 = com.google.android.gms.internal.measurement.zzne.p();
                return p2;
            }
        });
        c0 = a("measurement.rb.attribution.user_properties", "_npa,npa", "_npa,npa", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                String v2;
                v2 = com.google.android.gms.internal.measurement.zzne.v();
                return v2;
            }
        });
        d0 = a("measurement.rb.attribution.event_params", "value|currency", "value|currency", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                String o2;
                o2 = com.google.android.gms.internal.measurement.zzne.o();
                return o2;
            }
        });
        e0 = a("measurement.rb.attribution.query_parameters_to_remove", "", "", new zzfg() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                String s2;
                s2 = com.google.android.gms.internal.measurement.zzne.s();
                return s2;
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f0 = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpf.a());
                return valueOf2;
            }
        });
        g0 = a("measurement.quality.checksum", bool, bool, null);
        h0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzob.c());
                return valueOf2;
            }
        });
        i0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzob.b());
                return valueOf2;
            }
        });
        j0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzob.d());
                return valueOf2;
            }
        });
        k0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzqj.a());
                return valueOf2;
            }
        });
        l0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzou.a());
                return valueOf2;
            }
        });
        m0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzoz.a());
                return valueOf2;
            }
        });
        n0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzqe.b());
                return valueOf2;
            }
        });
        o0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzqk.a());
                return valueOf2;
            }
        });
        p0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznv.b());
                return valueOf2;
            }
        });
        q0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzoh.b());
                return valueOf2;
            }
        });
        r0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) zznj.a());
                return valueOf2;
            }
        });
        s0 = a("measurement.client.click_identifier_control.dev", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzmy.a());
                return valueOf2;
            }
        });
        t0 = a("measurement.service.click_identifier_control", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznd.a());
                return valueOf2;
            }
        });
        u0 = a("measurement.service.store_null_safelist", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzds
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznq.b());
                return valueOf2;
            }
        });
        v0 = a("measurement.service.store_safelist", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznq.c());
                return valueOf2;
            }
        });
        w0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdu
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzps.c());
                return valueOf2;
            }
        });
        x0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdt
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzps.b());
                return valueOf2;
            }
        });
        y0 = a("measurement.session_stitching_token_enabled", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdv
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzps.d());
                return valueOf2;
            }
        });
        z0 = a("measurement.sgtm.client.dev", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdy
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzqd.b());
                return valueOf2;
            }
        });
        A0 = a("measurement.sgtm.service", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzea
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzqd.c());
                return valueOf2;
            }
        });
        B0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzdz
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpl.a());
                return valueOf2;
            }
        });
        C0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzec
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpl.b());
                return valueOf2;
            }
        });
        D0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzeb
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpr.b());
                return valueOf2;
            }
        });
        E0 = a("measurement.sfmc.client", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzee
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpy.b());
                return valueOf2;
            }
        });
        F0 = a("measurement.sfmc.service", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzed
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpy.c());
                return valueOf2;
            }
        });
        G0 = a("measurement.gmscore_feature_tracking", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzeg
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzon.b());
                return valueOf2;
            }
        });
        H0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzef
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzoc.b());
                return valueOf2;
            }
        });
        I0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzeh
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzot.b());
                return valueOf2;
            }
        });
        J0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzej
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzot.c());
                return valueOf2;
            }
        });
        K0 = a("measurement.remove_app_background.client", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzem
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpm.b());
                return valueOf2;
            }
        });
        L0 = a("measurement.rb.attribution.service", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzel
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpg.d());
                return valueOf2;
            }
        });
        M0 = a("measurement.rb.attribution.client2", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzeo
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpg.b());
                return valueOf2;
            }
        });
        N0 = a("measurement.rb.attribution.uuid_generation", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzen
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpg.f());
                return valueOf2;
            }
        });
        O0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzeq
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpg.e());
                return valueOf2;
            }
        });
        P0 = a("measurement.rb.attribution.followup1.service", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzep
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzpg.c());
                return valueOf2;
            }
        });
        Q0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzes
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                return Boolean.valueOf(zzpx.a());
            }
        });
        R0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzer
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                return Boolean.valueOf(zznw.b());
            }
        });
        S0 = a("measurement.dma_consent.client", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzew
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznp.b());
                return valueOf2;
            }
        });
        T0 = a("measurement.dma_consent.service", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzev
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznp.d());
                return valueOf2;
            }
        });
        U0 = a("measurement.dma_consent.client_bow_check", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzey
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznp.c());
                return valueOf2;
            }
        });
        V0 = a("measurement.dma_consent.service_gcs_v2", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzex
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznp.e());
                return valueOf2;
            }
        });
        W0 = a("measurement.dma_consent.service_npa_remote_default", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzfa
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznp.f());
                return valueOf2;
            }
        });
        X0 = a("measurement.dma_consent.service_split_batch_on_consent", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzez
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznp.g());
                return valueOf2;
            }
        });
        Y0 = a("measurement.service.deferred_first_open", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzfc
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zznk.b());
                return valueOf2;
            }
        });
        Z0 = a("measurement.gbraid_campaign.gbraid.client.dev", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzfb
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzoi.b());
                return valueOf2;
            }
        });
        a1 = a("measurement.gbraid_campaign.gbraid.service", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzfe
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzoi.c());
                return valueOf2;
            }
        });
        b1 = a("measurement.increase_param_lengths", bool, bool, new zzfg() { // from class: com.google.android.gms.measurement.internal.zzfd
            @Override // com.google.android.gms.measurement.internal.zzfg
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zzoo.b());
                return valueOf2;
            }
        });
    }

    @InterfaceC5299bJ2
    public static <V> zzfi<V> a(String str, V v2, V v3, zzfg<V> zzfgVar) {
        zzfi<V> zzfiVar = new zzfi<>(str, v2, v3, zzfgVar);
        a.add(zzfiVar);
        return zzfiVar;
    }

    public static Map<String, String> c(Context context) {
        com.google.android.gms.internal.measurement.zzfy a2 = com.google.android.gms.internal.measurement.zzfy.a(context.getContentResolver(), com.google.android.gms.internal.measurement.zzgk.a("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzbh
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.measurement.zzgn.m();
            }
        });
        if (a2 == null) {
            return Collections.EMPTY_MAP;
        }
        return a2.b();
    }
}
