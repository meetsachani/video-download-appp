package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzat implements zzgcu {
    public final /* synthetic */ zzau a;

    public zzat(zzau zzauVar) {
        this.a = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzdsi zzdsiVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        com.google.android.gms.ads.internal.zzv.t().x(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzau zzauVar = this.a;
        zzdsiVar = zzauVar.f1;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(FirebaseAnalytics.Param.b, AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        atomicInteger = zzauVar.x1;
        zzaa.d(zzdsiVar, null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.e("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y9)).booleanValue()) {
            atomicBoolean = zzauVar.w1;
            if (!atomicBoolean.get()) {
                atomicInteger2 = zzauVar.x1;
                if (atomicInteger2.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z9)).intValue()) {
                    zzauVar.q8();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(@InterfaceC11300zs1 Object obj) {
        zzdsi zzdsiVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        zzbk zzbkVar = (zzbk) obj;
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y9)).booleanValue()) {
            zzau zzauVar = this.a;
            zzdsiVar = zzauVar.f1;
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair(FirebaseAnalytics.Param.b, AdFormat.BANNER.name());
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", "true");
            atomicInteger = zzauVar.x1;
            zzaa.d(zzdsiVar, null, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = zzauVar.w1;
            atomicBoolean.set(true);
        }
    }
}
