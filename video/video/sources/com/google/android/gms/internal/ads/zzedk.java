package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzedk {
    public final String c;
    @InterfaceC11300zs1
    public zzfbx d = null;
    @InterfaceC11300zs1
    public zzfbu e = null;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zzv f = null;
    public final Map b = Collections.synchronizedMap(new HashMap());
    public final List a = Collections.synchronizedList(new ArrayList());

    public zzedk(String str) {
        this.c = str;
    }

    public static String j(zzfbu zzfbuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R3)).booleanValue()) {
            return zzfbuVar.p0;
        }
        return zzfbuVar.w;
    }

    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzv a() {
        return this.f;
    }

    public final zzcvm b() {
        return new zzcvm(this.e, "", this, this.d, this.c);
    }

    public final List c() {
        return this.a;
    }

    public final void d(zzfbu zzfbuVar) {
        k(zzfbuVar, this.a.size());
    }

    public final void e(zzfbu zzfbuVar) {
        Map map = this.b;
        Object obj = map.get(j(zzfbuVar));
        List list = this.a;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.f);
        }
        if (indexOf >= 0 && indexOf < map.size()) {
            this.f = (com.google.android.gms.ads.internal.client.zzv) list.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < list.size()) {
                    com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(indexOf);
                    zzvVar.Y = 0L;
                    zzvVar.Z = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(zzfbu zzfbuVar, long j, @InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zze zzeVar) {
        l(zzfbuVar, j, zzeVar, false);
    }

    public final void g(zzfbu zzfbuVar, long j, @InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zze zzeVar) {
        l(zzfbuVar, j, null, true);
    }

    public final synchronized void h(String str, List list) {
        Map map = this.b;
        if (map.containsKey(str)) {
            List list2 = this.a;
            int indexOf = list2.indexOf((com.google.android.gms.ads.internal.client.zzv) map.get(str));
            try {
                list2.remove(indexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((zzfbu) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void i(zzfbx zzfbxVar) {
        this.d = zzfbxVar;
    }

    public final synchronized void k(zzfbu zzfbuVar, int i) {
        Map map = this.b;
        String j = j(zzfbuVar);
        if (map.containsKey(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfbuVar.v;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfbuVar.E, 0L, null, bundle, zzfbuVar.F, zzfbuVar.G, zzfbuVar.H, zzfbuVar.I);
        try {
            this.a.add(i, zzvVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.b.put(j, zzvVar);
    }

    public final void l(zzfbu zzfbuVar, long j, @InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        Map map = this.b;
        String j2 = j(zzfbuVar);
        if (map.containsKey(j2)) {
            if (this.e == null) {
                this.e = zzfbuVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(j2);
            zzvVar.Y = j;
            zzvVar.Z = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U6)).booleanValue() && z) {
                this.f = zzvVar;
            }
        }
    }
}
