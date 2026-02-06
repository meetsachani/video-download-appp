package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzca implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final /* synthetic */ zzcb b;

    public zzca(zzcb zzcbVar, String str) {
        this.b = zzcbVar;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbz> list;
        zzcb zzcbVar = this.b;
        synchronized (zzcbVar) {
            try {
                list = zzcbVar.b;
                for (zzbz zzbzVar : list) {
                    String str2 = this.a;
                    Map map = zzbzVar.a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        com.google.android.gms.ads.internal.zzv.t().j().e0(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
