package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfkg {
    public final ConcurrentMap a = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final zzfku c;
    public final zzfkc d;
    public final Context e;
    @InterfaceC11300zs1
    public volatile ConnectivityManager f;
    public final Clock g;
    public AtomicInteger h;

    public zzfkg(zzfku zzfkuVar, zzfkc zzfkcVar, Context context, Clock clock) {
        this.c = zzfkuVar;
        this.d = zzfkcVar;
        this.e = context;
        this.g = clock;
    }

    public static String d(String str, @InterfaceC11300zs1 AdFormat adFormat) {
        String name;
        if (adFormat == null) {
            name = "NULL";
        } else {
            name = adFormat.name();
        }
        return str + "#" + name;
    }

    @InterfaceC11300zs1
    public final synchronized zzban a(String str) {
        return (zzban) n(zzban.class, str, AdFormat.APP_OPEN_AD);
    }

    @InterfaceC11300zs1
    public final synchronized com.google.android.gms.ads.internal.client.zzbx b(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) n(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }

    @InterfaceC11300zs1
    public final synchronized zzbwq c(String str) {
        return (zzbwq) n(zzbwq.class, str, AdFormat.REWARDED);
    }

    public final void g(zzbpl zzbplVar) {
        this.c.b(zzbplVar);
    }

    public final synchronized void h(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        try {
            List<com.google.android.gms.ads.internal.client.zzfp> o2 = o(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzfp zzfpVar : o2) {
                String str = zzfpVar.X;
                AdFormat e = AdFormat.e(zzfpVar.Y);
                zzfkt a = this.c.a(zzfpVar, zzceVar);
                if (e != null && a != null) {
                    AtomicInteger atomicInteger = this.h;
                    if (atomicInteger != null) {
                        a.C(atomicInteger.get());
                    }
                    zzfkc zzfkcVar = this.d;
                    a.E(zzfkcVar);
                    p(d(str, e), a);
                    enumMap.put((EnumMap) e, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.j(enumMap, e, 0)).intValue() + 1));
                    zzfkcVar.i(zzfpVar.Y0, this.g.a(), new zzfkk(new zzfki(str, e), null));
                }
            }
            this.d.h(enumMap, this.g.a());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    try {
                        this.f = (ConnectivityManager) this.e.getSystemService("connectivity");
                    } catch (ClassCastException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.h("Failed to get connectivity manager", e);
                    }
                }
            }
        }
        if (PlatformVersion.n() && this.f != null) {
            try {
                this.f.registerDefaultNetworkCallback(new zzfkf(this));
            } catch (RuntimeException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Failed to register network callback", e2);
                this.h = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B)).intValue());
            }
        } else {
            this.h = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B)).intValue());
        }
        com.google.android.gms.ads.internal.zzv.f().c(new zzfke(this));
    }

    public final synchronized boolean j(String str) {
        return s(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean k(String str) {
        return s(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized boolean l(String str) {
        return s(str, AdFormat.REWARDED);
    }

    @InterfaceC11300zs1
    public final synchronized zzfkt m(String str, AdFormat adFormat) {
        return (zzfkt) this.a.get(d(str, adFormat));
    }

    @InterfaceC11300zs1
    public final synchronized Object n(Class cls, String str, AdFormat adFormat) {
        Object cast;
        zzfkk zzfkkVar = new zzfkk(new zzfki(str, adFormat), null);
        zzfkc zzfkcVar = this.d;
        Clock clock = this.g;
        zzfkcVar.e(clock.a(), zzfkkVar);
        zzfkt m = m(str, adFormat);
        if (m == null) {
            return null;
        }
        try {
            String u = m.u();
            Object s = m.s();
            if (s == null) {
                cast = null;
            } else {
                cast = cls.cast(s);
            }
            if (cast != null) {
                zzfkcVar.f(clock.a(), m.e.Y0, m.m(), u, zzfkkVar);
            }
            return cast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.l("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    public final synchronized List o(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) it.next();
                String d = d(zzfpVar.X, AdFormat.e(zzfpVar.Y));
                hashSet.add(d);
                ConcurrentMap concurrentMap = this.a;
                zzfkt zzfktVar = (zzfkt) concurrentMap.get(d);
                if (zzfktVar != null) {
                    if (!zzfktVar.e.equals(zzfpVar)) {
                        this.b.put(d, zzfktVar);
                        concurrentMap.remove(d);
                    } else {
                        zzfktVar.G(zzfpVar.Y0);
                    }
                } else {
                    ConcurrentMap concurrentMap2 = this.b;
                    if (concurrentMap2.containsKey(d)) {
                        zzfkt zzfktVar2 = (zzfkt) concurrentMap2.get(d);
                        if (zzfktVar2.e.equals(zzfpVar)) {
                            zzfktVar2.G(zzfpVar.Y0);
                            zzfktVar2.D();
                            concurrentMap.put(d, zzfktVar2);
                            concurrentMap2.remove(d);
                        }
                    } else {
                        arrayList.add(zzfpVar);
                    }
                }
            }
            Iterator it2 = this.a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.b.put((String) entry.getKey(), (zzfkt) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.b.entrySet().iterator();
            while (it3.hasNext()) {
                zzfkt zzfktVar3 = (zzfkt) ((Map.Entry) it3.next()).getValue();
                zzfktVar3.F();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x)).booleanValue()) {
                    zzfktVar3.A();
                }
                if (!zzfktVar3.H()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void p(String str, zzfkt zzfktVar) {
        zzfktVar.p();
        this.a.put(str, zzfktVar);
    }

    public final synchronized void q(boolean z) {
        try {
            if (z) {
                for (zzfkt zzfktVar : this.a.values()) {
                    zzfktVar.D();
                }
            } else {
                for (zzfkt zzfktVar2 : this.a.values()) {
                    zzfktVar2.f.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void r(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v)).booleanValue()) {
            q(z);
        }
    }

    public final synchronized boolean s(String str, AdFormat adFormat) {
        boolean z;
        Long l;
        int i;
        try {
            Clock clock = this.g;
            long a = clock.a();
            zzfkt m = m(str, adFormat);
            int i2 = 0;
            if (m != null && m.H()) {
                z = true;
            } else {
                z = false;
            }
            String str2 = null;
            if (z) {
                l = Long.valueOf(clock.a());
            } else {
                l = null;
            }
            zzfkk zzfkkVar = new zzfkk(new zzfki(str, adFormat), null);
            zzfkc zzfkcVar = this.d;
            if (m == null) {
                i = 0;
            } else {
                i = m.e.Y0;
            }
            if (m != null) {
                i2 = m.m();
            }
            if (m != null) {
                str2 = m.u();
            }
            zzfkcVar.b(i, i2, a, l, str2, zzfkkVar);
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }
}
