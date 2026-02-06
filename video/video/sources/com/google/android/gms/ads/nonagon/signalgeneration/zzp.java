package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.firebase.analytics.FirebaseAnalytics;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzp extends QueryInfoGenerationCallback {
    public final zzo a;
    public final zzdsi b;
    public final boolean c;
    public final int d;
    public final long e = com.google.android.gms.ads.internal.zzv.d().a();
    @InterfaceC11300zs1
    public final Boolean f;

    public zzp(zzo zzoVar, boolean z, int i, @InterfaceC11300zs1 Boolean bool, zzdsi zzdsiVar) {
        this.a = zzoVar;
        this.c = z;
        this.d = i;
        this.f = bool;
        this.b = zzdsiVar;
    }

    public static long c() {
        return com.google.android.gms.ads.internal.zzv.d().a() + ((Long) zzbfa.h.e()).longValue();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void a(String str) {
        String str2;
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(FirebaseAnalytics.Param.b, AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(d()));
        int i = this.d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        if (true != z) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        zzaa.d(this.b, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", str2));
        this.a.f(z, new zzq(null, str, c(), i));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void b(QueryInfo queryInfo) {
        String str;
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair(FirebaseAnalytics.Param.b, AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(d()));
        int i = this.d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        zzaa.d(this.b, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", str));
        this.a.f(z, new zzq(queryInfo, "", c(), i));
    }

    public final long d() {
        return com.google.android.gms.ads.internal.zzv.d().a() - this.e;
    }
}
