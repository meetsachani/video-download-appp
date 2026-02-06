package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzdrx;
import com.google.android.gms.internal.ads.zzdsi;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.C3855Oo;
import o.C9755tW1;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzv {
    public final zzdsi h;
    public Map i;
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final int a = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b7)).intValue();
    public final long b = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c7)).longValue();
    public final boolean c = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g7)).booleanValue();
    public final boolean d = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f7)).booleanValue();
    public final Map e = Collections.synchronizedMap(new zzt(this));

    public zzv(zzdsi zzdsiVar) {
        this.h = zzdsiVar;
    }

    public static /* synthetic */ void d(zzv zzvVar, zzdrx zzdrxVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzvVar.j(zzdrxVar, arrayDeque, "to");
        zzvVar.j(zzdrxVar, arrayDeque2, "of");
    }

    public static final void l(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    @InterfaceC11300zs1
    public final synchronized String b(String str, zzdrx zzdrxVar) {
        zzu zzuVar = (zzu) this.e.get(str);
        zzdrxVar.b().put(C9755tW1.f875o, str);
        if (zzuVar != null) {
            zzdrxVar.b().put("mhit", "true");
            return zzuVar.b;
        }
        zzdrxVar.b().put("mhit", C3855Oo.a);
        return null;
    }

    public final synchronized void e(String str, String str2, zzdrx zzdrxVar) {
        this.e.put(str, new zzu(Long.valueOf(com.google.android.gms.ads.internal.zzv.d().a()), str2, new HashSet()));
        k();
        i(zzdrxVar);
    }

    public final synchronized void f(String str) {
        this.e.remove(str);
    }

    public final synchronized boolean g(String str, String str2, int i) {
        zzu zzuVar = (zzu) this.e.get(str);
        if (zzuVar == null) {
            return false;
        }
        Set set = zzuVar.c;
        set.add(str2);
        if (set.size() >= i) {
            return false;
        }
        return true;
    }

    public final synchronized boolean h(String str, String str2) {
        zzu zzuVar = (zzu) this.e.get(str);
        if (zzuVar != null) {
            if (zzuVar.c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void i(final zzdrx zzdrxVar) {
        if (!this.c) {
            return;
        }
        ArrayDeque arrayDeque = this.g;
        final ArrayDeque clone = arrayDeque.clone();
        arrayDeque.clear();
        ArrayDeque arrayDeque2 = this.f;
        final ArrayDeque clone2 = arrayDeque2.clone();
        arrayDeque2.clear();
        zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.lang.Runnable
            public final void run() {
                zzv.d(zzv.this, zzdrxVar, clone, clone2);
            }
        });
    }

    public final void j(zzdrx zzdrxVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdrxVar.b());
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.b(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                l(this.i, "e_type", (String) pair.first);
                l(this.i, "e_agent", (String) pair.second);
            }
            this.h.g(this.i);
        }
    }

    public final synchronized void k() {
        long a = com.google.android.gms.ads.internal.zzv.d().a();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a - ((zzu) entry.getValue()).a.longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).b));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
