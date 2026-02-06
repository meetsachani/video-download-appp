package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdxm implements zzdyp {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    public final zzdwn a;
    public final zzgdj b;
    public final zzfcp c;
    public final ScheduledExecutorService d;
    public final zzeap e;
    public final zzfhn f;
    public final Context g;

    public zzdxm(Context context, zzfcp zzfcpVar, zzdwn zzdwnVar, zzgdj zzgdjVar, ScheduledExecutorService scheduledExecutorService, zzeap zzeapVar, zzfhn zzfhnVar) {
        this.g = context;
        this.c = zzfcpVar;
        this.a = zzdwnVar;
        this.b = zzgdjVar;
        this.d = scheduledExecutorService;
        this.e = zzeapVar;
        this.f = zzfhnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final InterfaceFutureC8411o11 a(zzbvl zzbvlVar) {
        Context context = this.g;
        InterfaceFutureC8411o11 c = this.a.c(zzbvlVar);
        zzfhc a = zzfhb.a(context, 11);
        zzfhm.d(c, a);
        InterfaceFutureC8411o11 n = zzgcy.n(c, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdxj
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                InterfaceFutureC8411o11 h2;
                h2 = zzgcy.h(new zzfcg(new zzfcd(zzdxm.this.c), zzfcf.a(new InputStreamReader(r2.b()), ((zzdyr) obj).a().h1)));
                return h2;
            }
        }, this.b);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O5)).booleanValue()) {
            zzbcm zzbcmVar = zzbcv.P5;
            n = zzgcy.f(zzgcy.o(n, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdxk
                @Override // com.google.android.gms.internal.ads.zzgcf
                public final InterfaceFutureC8411o11 b(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return zzgcy.g(new zzdwf(5));
                }
            }, zzcaa.g);
        }
        zzfhm.a(n, this.f, a);
        zzgcy.r(n, new zzdxl(this), zzcaa.g);
        return n;
    }
}
