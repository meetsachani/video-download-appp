package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbyn implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final /* synthetic */ zzbyo b;

    public zzbyn(zzbyo zzbyoVar, String str) {
        this.b = zzbyoVar;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbym> list;
        zzbyo zzbyoVar = this.b;
        synchronized (zzbyoVar) {
            try {
                list = zzbyoVar.b;
                for (zzbym zzbymVar : list) {
                    zzbyo.b(zzbymVar.a, zzbymVar.b, sharedPreferences, this.a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
