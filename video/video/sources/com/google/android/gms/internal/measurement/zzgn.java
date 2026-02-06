package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzgj;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC4468Uv1;
import o.C10664xF1;
import o.C8818ph2;
import o.InterfaceC10571ws1;
import o.InterfaceC8331nh2;
import o.YA0;

/* loaded from: classes3.dex */
public abstract class zzgn<T> {
    @InterfaceC10571ws1
    public static volatile zzgu h = null;
    public static volatile boolean i = false;
    public final zzgv a;
    public final String b;
    public final T c;
    public volatile int d;
    public volatile T e;
    public final boolean f;
    public static final Object g = new Object();
    public static final AtomicReference<Collection<zzgn<?>>> j = new AtomicReference<>();
    public static zzgy k = new zzgy(new zzhb() { // from class: com.google.android.gms.internal.measurement.zzgo
        @Override // com.google.android.gms.internal.measurement.zzhb
        public final boolean a() {
            return zzgn.n();
        }
    });
    public static final AtomicInteger l = new AtomicInteger();

    public static /* synthetic */ zzgn a(zzgv zzgvVar, String str, Boolean bool, boolean z) {
        return new zzgq(zzgvVar, str, bool, true);
    }

    public static /* synthetic */ zzgn b(zzgv zzgvVar, String str, Double d, boolean z) {
        return new zzgt(zzgvVar, str, d, true);
    }

    public static /* synthetic */ zzgn c(zzgv zzgvVar, String str, Long l2, boolean z) {
        return new zzgr(zzgvVar, str, l2, true);
    }

    public static /* synthetic */ zzgn d(zzgv zzgvVar, String str, String str2, boolean z) {
        return new zzgs(zzgvVar, str, str2, true);
    }

    public static void l(final Context context) {
        if (h == null && context != null) {
            Object obj = g;
            synchronized (obj) {
                try {
                    if (h == null) {
                        synchronized (obj) {
                            zzgu zzguVar = h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzguVar != null) {
                                if (zzguVar.a() != context) {
                                }
                            }
                            zzfy.d();
                            zzgw.c();
                            zzgg.b();
                            h = new zzfv(context, C8818ph2.b(new InterfaceC8331nh2() { // from class: com.google.android.gms.internal.measurement.zzgp
                                @Override // o.InterfaceC8331nh2
                                public final Object get() {
                                    AbstractC4468Uv1 a;
                                    a = zzgj.zza.a(context);
                                    return a;
                                }
                            }));
                            l.incrementAndGet();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static void m() {
        l.incrementAndGet();
    }

    public static /* synthetic */ boolean n() {
        return true;
    }

    public final T e() {
        boolean z;
        T j2;
        if (!this.f) {
            C10664xF1.h0(k.a(this.b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i2 = l.get();
        if (this.d < i2) {
            synchronized (this) {
                try {
                    if (this.d < i2) {
                        zzgu zzguVar = h;
                        AbstractC4468Uv1<zzgh> a = AbstractC4468Uv1.a();
                        String str = null;
                        if (zzguVar != null) {
                            a = zzguVar.b().get();
                            if (a.e()) {
                                zzgv zzgvVar = this.a;
                                str = a.d().a(zzgvVar.b, zzgvVar.a, zzgvVar.d, this.b);
                            }
                        }
                        if (zzguVar != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C10664xF1.h0(z, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (!this.a.f ? (j2 = j(zzguVar)) == null && (j2 = f(zzguVar)) == null : (j2 = f(zzguVar)) == null && (j2 = j(zzguVar)) == null) {
                            j2 = this.c;
                        }
                        if (a.e()) {
                            if (str == null) {
                                j2 = this.c;
                            } else {
                                j2 = g(str);
                            }
                        }
                        this.e = j2;
                        this.d = i2;
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    @InterfaceC10571ws1
    public final T f(zzgu zzguVar) {
        YA0<Context, Boolean> ya0;
        String h2;
        zzgv zzgvVar = this.a;
        if (!zzgvVar.e && ((ya0 = zzgvVar.i) == null || ya0.apply(zzguVar.a()).booleanValue())) {
            zzgg a = zzgg.a(zzguVar.a());
            zzgv zzgvVar2 = this.a;
            if (zzgvVar2.e) {
                h2 = null;
            } else {
                h2 = h(zzgvVar2.c);
            }
            Object w = a.w(h2);
            if (w != null) {
                return g(w);
            }
        }
        return null;
    }

    public abstract T g(Object obj);

    public final String h(String str) {
        if (str != null && str.isEmpty()) {
            return this.b;
        }
        String str2 = this.b;
        return str + str2;
    }

    @InterfaceC10571ws1
    public final T j(zzgu zzguVar) {
        zzgb b;
        Object w;
        if (this.a.b != null) {
            if (zzgl.b(zzguVar.a(), this.a.b)) {
                if (this.a.h) {
                    b = zzfy.a(zzguVar.a().getContentResolver(), zzgk.a(zzgk.b(zzguVar.a(), this.a.b.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzgn.m();
                        }
                    });
                } else {
                    b = zzfy.a(zzguVar.a().getContentResolver(), this.a.b, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzgn.m();
                        }
                    });
                }
            } else {
                b = null;
            }
        } else {
            b = zzgw.b(zzguVar.a(), this.a.a, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgm
                @Override // java.lang.Runnable
                public final void run() {
                    zzgn.m();
                }
            });
        }
        if (b == null || (w = b.w(k())) == null) {
            return null;
        }
        return g(w);
    }

    public final String k() {
        return h(this.a.d);
    }

    public zzgn(zzgv zzgvVar, String str, T t, boolean z) {
        this.d = -1;
        String str2 = zzgvVar.a;
        if (str2 == null && zzgvVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzgvVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = zzgvVar;
        this.b = str;
        this.c = t;
        this.f = z;
    }
}
