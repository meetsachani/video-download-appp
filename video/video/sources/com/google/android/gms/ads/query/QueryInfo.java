package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbuc;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class QueryInfo {
    public final zzew a;

    public QueryInfo(zzew zzewVar) {
        this.a = zzewVar;
    }

    public static void a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AdFormat adFormat, @InterfaceC11300zs1 AdRequest adRequest, @InterfaceC5670cr1 QueryInfoGenerationCallback queryInfoGenerationCallback) {
        f(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    public static void b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AdFormat adFormat, @InterfaceC11300zs1 AdRequest adRequest, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.s(str, "AdUnitId cannot be null.");
        f(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }

    public static void f(final Context context, final AdFormat adFormat, @InterfaceC11300zs1 final AdRequest adRequest, @InterfaceC11300zs1 final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzeh j;
        zzbcv.a(context);
        if (((Boolean) zzbet.j.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeh j2;
                        AdRequest adRequest2 = adRequest;
                        if (adRequest2 == null) {
                            j2 = null;
                        } else {
                            j2 = adRequest2.j();
                        }
                        QueryInfoGenerationCallback queryInfoGenerationCallback2 = queryInfoGenerationCallback;
                        String str2 = str;
                        new zzbuc(context, adFormat, j2, str2).b(queryInfoGenerationCallback2);
                    }
                });
                return;
            }
        }
        if (adRequest == null) {
            j = null;
        } else {
            j = adRequest.j();
        }
        new zzbuc(context, adFormat, j, str).b(queryInfoGenerationCallback);
    }

    @InterfaceC5670cr1
    public String c() {
        return this.a.b();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Bundle d() {
        return this.a.a();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String e() {
        return this.a.c();
    }
}
