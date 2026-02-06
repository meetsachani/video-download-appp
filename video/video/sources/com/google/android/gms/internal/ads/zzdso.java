package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzdso {
    public final String e;
    public final zzdsi f;
    @InterfaceC8710pF0("this")
    public final List b = new ArrayList();
    @InterfaceC8710pF0("this")
    public boolean c = false;
    @InterfaceC8710pF0("this")
    public boolean d = false;
    public final com.google.android.gms.ads.internal.util.zzg a = com.google.android.gms.ads.internal.zzv.t().j();

    public zzdso(String str, zzdsi zzdsiVar) {
        this.e = str;
        this.f = zzdsiVar;
    }

    public final synchronized void a(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l2)).booleanValue()) {
            return;
        }
        Map g = g();
        g.put("action", "aaia");
        g.put("aair", "MalformedJson");
        this.b.add(g);
    }

    public final synchronized void b(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l2)).booleanValue()) {
            return;
        }
        Map g = g();
        g.put("action", "adapter_init_finished");
        g.put("ancn", str);
        g.put("rqe", str2);
        this.b.add(g);
    }

    public final synchronized void c(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l2)).booleanValue()) {
            return;
        }
        Map g = g();
        g.put("action", "adapter_init_started");
        g.put("ancn", str);
        this.b.add(g);
    }

    public final synchronized void d(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l2)).booleanValue()) {
            return;
        }
        Map g = g();
        g.put("action", "adapter_init_finished");
        g.put("ancn", str);
        this.b.add(g);
    }

    public final synchronized void e() {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l2)).booleanValue() && !this.d) {
                Map g = g();
                g.put("action", "init_finished");
                List<Map> list = this.b;
                list.add(g);
                for (Map map : list) {
                    this.f.g(map);
                }
                this.d = true;
            }
        } finally {
        }
    }

    public final synchronized void f() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l2)).booleanValue() && !this.c) {
            Map g = g();
            g.put("action", "init_started");
            this.b.add(g);
            this.c = true;
        }
    }

    public final Map g() {
        String str;
        Map i = this.f.i();
        i.put("tms", Long.toString(com.google.android.gms.ads.internal.zzv.d().b(), 10));
        if (this.a.M()) {
            str = "";
        } else {
            str = this.e;
        }
        i.put("tid", str);
        return i;
    }
}
