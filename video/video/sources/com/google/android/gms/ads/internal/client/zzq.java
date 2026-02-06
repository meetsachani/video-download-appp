package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzq {
    public static final zzq a = new zzq();

    public final zzm a(Context context, zzeh zzehVar) {
        List list;
        String str;
        String i = zzehVar.i();
        Set n = zzehVar.n();
        if (!n.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(n));
        } else {
            list = null;
        }
        boolean q = zzehVar.q(context);
        Bundle f = zzehVar.f(AdMobAdapter.class);
        String j = zzehVar.j();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzbb.b();
            str = com.google.android.gms.ads.internal.util.client.zzf.w(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean p = zzehVar.p();
        RequestConfiguration g = zzet.j().g();
        return new zzm(8, -1L, f, -1, list, q, Math.max(zzehVar.b(), g.c()), false, j, null, null, i, zzehVar.g(), zzehVar.e(), Collections.unmodifiableList(new ArrayList(zzehVar.m())), zzehVar.k(), str, p, null, g.d(), (String) Collections.max(Arrays.asList(null, g.a()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = RequestConfiguration.q;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), zzehVar.l(), zzehVar.a(), zzehVar.h(), g.b().e(), zzehVar.c());
    }
}
