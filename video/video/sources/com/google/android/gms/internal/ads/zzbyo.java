package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbyo {
    @InterfaceC8710pF0("this")
    public final Map a = new HashMap();
    @InterfaceC8710pF0("this")
    public final List b = new ArrayList();
    public final Context c;
    public final zzbya d;

    public zzbyo(Context context, zzbya zzbyaVar) {
        this.c = context;
        this.d = zzbyaVar;
    }

    public static /* synthetic */ void b(zzbyo zzbyoVar, Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            zzbyoVar.d.d();
        }
    }

    public final synchronized void c(String str) {
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
            zzbyn zzbynVar = new zzbyn(this, str);
            map.put(str, zzbynVar);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzbynVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(zzbym zzbymVar) {
        this.b.add(zzbymVar);
    }
}
