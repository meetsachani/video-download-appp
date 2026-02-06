package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdk {
    public final List a = new LinkedList();
    public final Map b;
    public final Object c;

    public zzbdk(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.b, str2);
    }

    public static final zzbdh f() {
        return new zzbdh(com.google.android.gms.ads.internal.zzv.d().b(), null, null);
    }

    public final zzbdj a() {
        zzbdj zzbdjVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.c) {
            try {
                List<zzbdh> list = this.a;
                for (zzbdh zzbdhVar : list) {
                    long a = zzbdhVar.a();
                    String c = zzbdhVar.c();
                    zzbdh b = zzbdhVar.b();
                    if (b != null && a > 0) {
                        sb.append(c);
                        sb.append('.');
                        sb.append(a - b.a());
                        sb.append(',');
                        if (booleanValue) {
                            if (!hashMap.containsKey(Long.valueOf(b.a()))) {
                                hashMap.put(Long.valueOf(b.a()), new StringBuilder(c));
                            } else {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b.a()));
                                sb2.append('+');
                                sb2.append(c);
                            }
                        }
                    }
                }
                list.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(com.google.android.gms.ads.internal.zzv.d().a() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzv.d().b()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                zzbdjVar = new zzbdj(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbdjVar;
    }

    @InterfaceC5056aJ2
    public final Map b() {
        Map map;
        synchronized (this.c) {
            com.google.android.gms.ads.internal.zzv.t().h();
            map = this.b;
        }
        return map;
    }

    public final void c(@InterfaceC11300zs1 zzbdk zzbdkVar) {
        synchronized (this.c) {
        }
    }

    public final void d(String str, String str2) {
        zzbda h;
        if (!TextUtils.isEmpty(str2) && (h = com.google.android.gms.ads.internal.zzv.t().h()) != null) {
            synchronized (this.c) {
                zzbdg a = h.a(str);
                Map map = this.b;
                map.put(str, a.a((String) map.get(str), str2));
            }
        }
    }

    public final boolean e(zzbdh zzbdhVar, long j, String... strArr) {
        synchronized (this.c) {
            this.a.add(new zzbdh(j, strArr[0], zzbdhVar));
        }
        return true;
    }
}
