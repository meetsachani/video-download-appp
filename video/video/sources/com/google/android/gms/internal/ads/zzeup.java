package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C10807xq2;
import o.C5515cD0;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeup implements zzetv {
    public final com.google.android.gms.ads.internal.util.zzg a;
    public final Context b;
    public final zzgdj c;
    public final ScheduledExecutorService d;
    public final zzedd e;
    public final zzfcp f;
    public final VersionInfoParcel g;

    public zzeup(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgdj zzgdjVar, ScheduledExecutorService scheduledExecutorService, zzedd zzeddVar, zzfcp zzfcpVar, VersionInfoParcel versionInfoParcel) {
        this.a = zzgVar;
        this.b = context;
        this.c = zzgdjVar;
        this.d = scheduledExecutorService;
        this.e = zzeddVar;
        this.f = zzfcpVar;
        this.g = versionInfoParcel;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(zzeup zzeupVar, final Throwable th) {
        zzeur zzeurVar;
        zzeupVar.c.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ka)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzv.t().y(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzv.t().w(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof SecurityException) {
            zzeurVar = new zzeur("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzeurVar = new zzeur("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzeurVar = new zzeur("", 4, null);
        } else if (th instanceof TimeoutException) {
            zzeurVar = new zzeur("", 5, null);
        } else {
            zzeurVar = new zzeur("", 0, null);
        }
        return zzgcy.h(zzeurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.b.getPackageName()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r0.d.t1 != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.e()) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzetv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceFutureC8411o11 b() {
        InterfaceFutureC8411o11 g;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ja)).booleanValue() && this.a.H()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Na)).booleanValue()) {
                zzfcp zzfcpVar = this.f;
            }
            if (this.g.Z >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ha)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ia)).intValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Fa)).booleanValue()) {
                        String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ga);
                        if (!TextUtils.isEmpty(str)) {
                        }
                    }
                    try {
                        g = zzgcy.o(this.e.a(false), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.La)).intValue(), TimeUnit.MILLISECONDS, this.d);
                    } catch (Exception e) {
                        g = zzgcy.g(e);
                    }
                    zzgcp A = zzgcp.A(g);
                    zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeun
                        @Override // com.google.android.gms.internal.ads.zzgcf
                        public final InterfaceFutureC8411o11 b(Object obj) {
                            C5515cD0 c5515cD0 = (C5515cD0) obj;
                            if (c5515cD0 == null) {
                                return zzgcy.h(new zzeur("", 1, null));
                            }
                            zzhcf s2 = zzhcg.s2();
                            for (C10807xq2 c10807xq2 : c5515cD0.a()) {
                                zzhcd s22 = zzhce.s2();
                                s22.a2(c10807xq2.c());
                                s22.Y1(c10807xq2.a());
                                s22.Z1(c10807xq2.b());
                                s2.Y1((zzhce) s22.V1());
                            }
                            return zzgcy.h(new zzeur(Base64.encodeToString(((zzhcg) s2.V1()).b1(), 1), 1, null));
                        }
                    };
                    zzgdj zzgdjVar = this.c;
                    zzbcm zzbcmVar = zzbcv.La;
                    return zzgcy.o((zzgcp) zzgcy.f((zzgcp) zzgcy.n(A, zzgcfVar, zzgdjVar), Throwable.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeuo
                        @Override // com.google.android.gms.internal.ads.zzgcf
                        public final InterfaceFutureC8411o11 b(Object obj) {
                            return zzeup.c(zzeup.this, (Throwable) obj);
                        }
                    }, zzgdjVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), TimeUnit.MILLISECONDS, this.d);
                }
            }
        }
        return zzgcy.h(new zzeur("", -1, null));
    }
}
