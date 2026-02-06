package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzcmn {
    public final Context a;
    public final com.google.android.gms.ads.internal.util.zzg b;
    public final zzedb c;
    public final zzdpi d;
    public final zzgdj e;
    public final Executor f;
    public final ScheduledExecutorService g;
    @InterfaceC5056aJ2
    public zzbuk h;
    @InterfaceC5056aJ2
    public zzbuk i;

    public zzcmn(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzedb zzedbVar, zzdpi zzdpiVar, zzgdj zzgdjVar, zzgdj zzgdjVar2, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = zzgVar;
        this.c = zzedbVar;
        this.d = zzdpiVar;
        this.e = zzgdjVar;
        this.f = zzgdjVar2;
        this.g = scheduledExecutorService;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b(zzcmn zzcmnVar, final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Aa), "1");
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.za), "12");
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ba))) {
                buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ca));
            }
            return (zzgcp) zzgcy.n(zzgcp.A(zzcmnVar.c.b(buildUpon.build(), inputEvent)), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzcmj
                @Override // com.google.android.gms.internal.ads.zzgcf
                public final InterfaceFutureC8411o11 b(Object obj) {
                    zzbcm zzbcmVar = zzbcv.za;
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar), "12");
                    return zzgcy.h(builder2.toString());
                }
            }, zzcmnVar.f);
        }
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.za), "10");
        return zzgcy.h(builder.toString());
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(final zzcmn zzcmnVar, String str, final Throwable th) {
        zzcmnVar.e.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmg
            @Override // java.lang.Runnable
            public final void run() {
                zzcmn.g(zzcmn.this, th);
            }
        });
        return zzgcy.h(str);
    }

    public static /* synthetic */ InterfaceFutureC8411o11 d(final zzcmn zzcmnVar, Uri.Builder builder, final Throwable th) {
        zzcmnVar.e.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmf
            @Override // java.lang.Runnable
            public final void run() {
                zzcmn.h(zzcmn.this, th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.za), "9");
        return zzgcy.h(builder.toString());
    }

    public static /* synthetic */ void g(zzcmn zzcmnVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ea)).booleanValue()) {
            zzbuk e = zzbui.e(zzcmnVar.a);
            zzcmnVar.i = e;
            e.b(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
            return;
        }
        zzbuk c = zzbui.c(zzcmnVar.a);
        zzcmnVar.h = c;
        c.b(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
    }

    public static /* synthetic */ void h(zzcmn zzcmnVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ea)).booleanValue()) {
            zzbuk e = zzbui.e(zzcmnVar.a);
            zzcmnVar.i = e;
            e.b(th, "AttributionReporting");
            return;
        }
        zzbuk c = zzbui.c(zzcmnVar.a);
        zzcmnVar.h = c;
        c.b(th, "AttributionReportingSampled");
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xa));
    }

    public final InterfaceFutureC8411o11 e(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgcy.h(str);
        }
        return zzgcy.f(k(str, this.d.a(), random), Throwable.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzcme
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzcmn.c(zzcmn.this, str, (Throwable) obj);
            }
        }, this.e);
    }

    public final void i(String str, zzfjr zzfjrVar, Random random, @InterfaceC11300zs1 com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        InterfaceFutureC8411o11 k = k(str, this.d.a(), random);
        zzbcm zzbcmVar = zzbcv.Da;
        zzgcy.r(zzgcy.o(k, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), TimeUnit.MILLISECONDS, this.g), new zzcmm(this, zzfjrVar, str, zzvVar), this.e);
    }

    public final InterfaceFutureC8411o11 k(final String str, @InterfaceC11300zs1 final InputEvent inputEvent, Random random) {
        try {
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xa)) && !this.b.M()) {
                final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ya), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
                if (inputEvent == null) {
                    buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.za), "11");
                    return zzgcy.h(buildUpon.toString());
                }
                return (zzgcp) zzgcy.f((zzgcp) zzgcy.n(zzgcp.A(this.c.a()), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzcmh
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        return zzcmn.b(zzcmn.this, buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.f), Throwable.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzcmi
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        return zzcmn.d(zzcmn.this, buildUpon, (Throwable) obj);
                    }
                }, this.e);
            }
            return zzgcy.h(str);
        } catch (Exception e) {
            return zzgcy.g(e);
        }
    }
}
