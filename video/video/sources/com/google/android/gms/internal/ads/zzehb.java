package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzehb implements zzgcf {
    public final zzfgt a;
    public final zzcvv b;
    public final zzfjn c;
    public final zzfjr d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final zzcra g;
    public final zzegu h;
    public final zzedk i;
    public final Context j;
    public final zzfhn k;
    public final zzege l;
    public final zzdrx m;

    public zzehb(Context context, zzfgt zzfgtVar, zzegu zzeguVar, zzcvv zzcvvVar, zzfjn zzfjnVar, zzfjr zzfjrVar, zzcra zzcraVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzedk zzedkVar, zzfhn zzfhnVar, zzege zzegeVar, zzdrx zzdrxVar) {
        this.j = context;
        this.a = zzfgtVar;
        this.h = zzeguVar;
        this.b = zzcvvVar;
        this.c = zzfjnVar;
        this.d = zzfjrVar;
        this.g = zzcraVar;
        this.e = executor;
        this.f = scheduledExecutorService;
        this.i = zzedkVar;
        this.k = zzfhnVar;
        this.l = zzegeVar;
        this.m = zzdrxVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 a(zzehb zzehbVar, zzfbu zzfbuVar, zzfcg zzfcgVar, zzedf zzedfVar, Throwable th) {
        zzfhc a = zzfhb.a(zzehbVar.j, 12);
        a.p0(zzfbuVar.E);
        a.i();
        InterfaceFutureC8411o11 o2 = zzgcy.o(zzedfVar.b(zzfcgVar, zzfbuVar), zzfbuVar.R, TimeUnit.MILLISECONDS, zzehbVar.f);
        zzehbVar.h.f(zzfcgVar, zzfbuVar, o2, zzehbVar.c);
        zzfhm.a(o2, zzehbVar.k, a);
        return o2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.M5)).booleanValue() == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(zzfcg zzfcgVar) {
        String str;
        zzfbw zzfbwVar;
        String str2 = "No fill.";
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N5)).booleanValue()) {
            str = "No fill.";
        } else {
            str = "No ad config.";
        }
        zzfbx zzfbxVar = zzfcgVar.b.b;
        int i = zzfbxVar.f;
        if (i != 0) {
            if (i >= 200 && i < 300) {
            } else if (i >= 300 && i < 400) {
                str2 = "No location header to follow redirect or too many redirects.";
            } else {
                str2 = "Received error HTTP response code: " + i;
            }
            zzfbwVar = zzfbxVar.j;
            if (zzfbwVar == null) {
                return zzfbwVar.a();
            }
            return str2;
        }
        str2 = str;
        zzfbwVar = zzfbxVar.j;
        if (zzfbwVar == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* synthetic */ InterfaceFutureC8411o11 b(Object obj) throws Exception {
        int i;
        Bundle bundle;
        final zzfcg zzfcgVar = (zzfcg) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && (bundle = zzfcgVar.b.d) != null) {
            this.m.a().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r2)).booleanValue()) {
            this.m.a().putLong(zzdrl.RENDERING_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        String d = d(zzfcgVar);
        zzedk zzedkVar = this.i;
        zzfcf zzfcfVar = zzfcgVar.b;
        zzfbx zzfbxVar = zzfcfVar.b;
        zzedkVar.i(zzfbxVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D8)).booleanValue() && (i = zzfbxVar.f) != 0 && (i < 200 || i >= 300)) {
            return zzgcy.g(new zzegy(3, d));
        }
        String str = zzfbxVar.q;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R3)).booleanValue() && !TextUtils.isEmpty(str)) {
            zzedkVar.h(str, zzfcfVar.a);
        } else {
            for (zzfbu zzfbuVar : zzfcfVar.a) {
                zzedkVar.d(zzfbuVar);
                Iterator it = zzfbuVar.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzedf g = this.g.g(zzfbuVar.b, (String) it.next());
                        if (g == null || !g.a(zzfcgVar, zzfbuVar)) {
                        }
                    } else {
                        zzedkVar.f(zzfbuVar, 0L, zzfdq.d(1, null, null));
                        break;
                    }
                }
            }
        }
        zzcvv zzcvvVar = this.b;
        zzcmr zzcmrVar = new zzcmr(zzfcgVar, this.d, this.c);
        Executor executor = this.e;
        zzcvvVar.c1(zzcmrVar, executor);
        if (zzfbxVar.r > 1) {
            return this.l.b(zzfcgVar);
        }
        String d2 = d(zzfcgVar);
        zzfgt zzfgtVar = this.a;
        zzffz a = zzfgd.c(zzgcy.g(new zzegy(3, d2)), zzfgn.RENDER_CONFIG_INIT, zzfgtVar).a();
        final zzegu zzeguVar = this.h;
        zzeguVar.l();
        int i2 = 0;
        for (final zzfbu zzfbuVar2 : zzfcfVar.a) {
            Iterator it2 = zzfbuVar2.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzedf g2 = this.g.g(zzfbuVar2.b, str2);
                if (g2 != null && g2.a(zzfcgVar, zzfbuVar2)) {
                    zzfgj b = zzfgtVar.b(zzfgn.RENDER_CONFIG_WATERFALL, a);
                    a = b.h("render-config-" + i2 + "-" + str2).c(Throwable.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzegz
                        @Override // com.google.android.gms.internal.ads.zzgcf
                        public final InterfaceFutureC8411o11 b(Object obj2) {
                            return zzehb.a(zzehb.this, zzfbuVar2, zzfcgVar, g2, (Throwable) obj2);
                        }
                    }).a();
                    break;
                }
            }
            i2++;
        }
        a.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeha
            @Override // java.lang.Runnable
            public final void run() {
                zzegu.this.j();
            }
        }, executor);
        return a;
    }
}
