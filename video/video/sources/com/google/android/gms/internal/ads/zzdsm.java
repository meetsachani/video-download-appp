package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class zzdsm {
    public final Map a;
    public final Context b;
    public final Executor c;
    public final com.google.android.gms.ads.internal.util.client.zzu d;
    public final boolean e;
    public final CsiUrlBuilder f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i;
    public final AtomicReference j;

    public zzdsm(Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        String str = (String) zzbep.a.e();
        this.a = new HashMap();
        this.i = new AtomicBoolean();
        this.j = new AtomicReference(new Bundle());
        this.c = executor;
        this.d = zzuVar;
        this.e = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j2)).booleanValue();
        this.f = csiUrlBuilder;
        this.g = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.o2)).booleanValue();
        this.h = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e7)).booleanValue();
        this.b = context;
    }

    public final void a(Map map) {
        if (map != null && !map.isEmpty()) {
            if (!this.i.getAndSet(true)) {
                final String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Pa);
                this.j.set(com.google.android.gms.ads.internal.util.zzad.a(this.b, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdsk
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        r0.j.set(com.google.android.gms.ads.internal.util.zzad.b(zzdsm.this.b, str));
                    }
                }));
            }
            Bundle bundle = (Bundle) this.j.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
            return;
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Empty or null paramMap.");
    }

    public final String b(Map map) {
        return this.f.a(map);
    }

    public final ConcurrentHashMap c() {
        return new ConcurrentHashMap(this.a);
    }

    public final void e(Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Empty paramMap.");
            return;
        }
        a(map);
        final String a = this.f.a(map);
        com.google.android.gms.ads.internal.util.zze.k(a);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.sd)).booleanValue() && !this.e) {
            return;
        }
        this.c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsl
            @Override // java.lang.Runnable
            public final void run() {
                zzdsm.this.d.w(a);
            }
        });
    }

    public final void f(Map map) {
        h(map, true);
    }

    public final void g(Map map) {
        h(map, false);
    }

    public final void h(Map map, boolean z) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Empty paramMap.");
            return;
        }
        a(map);
        final String a = this.f.a(map);
        com.google.android.gms.ads.internal.util.zze.k(a);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.e) {
            if (!z || this.g) {
                if (!parseBoolean || this.h) {
                    this.c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsj
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdsm.this.d.w(a);
                        }
                    });
                }
            }
        }
    }
}
