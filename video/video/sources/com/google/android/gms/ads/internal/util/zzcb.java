package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbcv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzcb {
    @InterfaceC8710pF0("this")
    public final Map a = new HashMap();
    @InterfaceC8710pF0("this")
    public final List b = new ArrayList();
    public final Context c;

    public zzcb(Context context) {
        this.c = context;
    }

    public final synchronized void b(String str) {
        SharedPreferences sharedPreferences;
        try {
            Map map = this.a;
            if (map.containsKey(str)) {
                return;
            }
            if (Objects.equals(str, "__default__")) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
            } else {
                sharedPreferences = this.c.getSharedPreferences(str, 0);
            }
            zzca zzcaVar = new zzca(this, str);
            map.put(str, zzcaVar);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzcaVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ja)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.v();
        Map c0 = zzs.c0((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Oa));
        for (String str : c0.keySet()) {
            b(str);
        }
        d(new zzbz(c0));
    }

    public final synchronized void d(zzbz zzbzVar) {
        this.b.add(zzbzVar);
    }
}
