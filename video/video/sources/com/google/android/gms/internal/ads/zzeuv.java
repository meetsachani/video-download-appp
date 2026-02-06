package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeuv implements zzetv {
    public final Context a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final zzbze g;

    public zzeuv(zzbze zzbzeVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.g = zzbzeVar;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = executor;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.t3)).booleanValue() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.u3)).booleanValue() == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ zzeuw c(zzeuv zzeuvVar, AdvertisingIdClient.Info info) {
        zzfrp zzfrpVar = new zzfrp();
        if (!zzeuvVar.e) {
        }
        try {
            Context context = zzeuvVar.a;
            zzfrt k = zzfrt.k(context);
            Objects.requireNonNull(info);
            String a = info.a();
            Objects.requireNonNull(a);
            zzfrpVar = k.j(a, context.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z3)).longValue(), zzeuvVar.f);
        } catch (IOException | IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "AdIdInfoSignalSource.getPaidV1");
            zzfrpVar = new zzfrp();
        }
        return new zzeuw(info, null, zzfrpVar);
    }

    public static /* synthetic */ zzeuw d(zzeuv zzeuvVar, Throwable th) {
        String string;
        com.google.android.gms.ads.internal.client.zzbb.b();
        ContentResolver contentResolver = zzeuvVar.a.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzeuw(null, string, new zzfrp());
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        zzgcp A = zzgcp.A(this.g.a(this.a, this.d));
        zzfur zzfurVar = new zzfur() { // from class: com.google.android.gms.internal.ads.zzeut
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return zzeuv.c(zzeuv.this, (AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.c;
        return (zzgcp) zzgcy.e((zzgcp) zzgcy.o((zzgcp) zzgcy.m(A, zzfurVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i1)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new zzfur() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return zzeuv.d(zzeuv.this, (Throwable) obj);
            }
        }, executor);
    }
}
