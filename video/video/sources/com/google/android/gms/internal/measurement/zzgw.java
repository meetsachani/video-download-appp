package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public final class zzgw implements zzgb {
    @InterfaceC8710pF0("SharedPreferencesLoader.class")
    public static final Map<String, zzgw> g = new C2531Be();
    public final SharedPreferences a;
    public final Runnable b;
    public final SharedPreferences.OnSharedPreferenceChangeListener c;
    public final Object d;
    public volatile Map<String, ?> e;
    @InterfaceC8710pF0("this")
    public final List<zzfz> f;

    public zzgw(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.zzgz
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                zzgw.this.d(sharedPreferences2, str);
            }
        };
        this.c = onSharedPreferenceChangeListener;
        this.d = new Object();
        this.f = new ArrayList();
        this.a = sharedPreferences;
        this.b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (zzfw.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences;
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    @InterfaceC11300zs1
    public static zzgw b(Context context, String str, Runnable runnable) {
        boolean z;
        zzgw zzgwVar;
        if (zzfw.a() && !str.startsWith("direct_boot:")) {
            z = zzfw.c(context);
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        synchronized (zzgw.class) {
            try {
                Map<String, zzgw> map = g;
                zzgwVar = map.get(str);
                if (zzgwVar == null) {
                    zzgwVar = new zzgw(a(context, str), runnable);
                    map.put(str, zzgwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgwVar;
    }

    public static synchronized void c() {
        synchronized (zzgw.class) {
            try {
                for (zzgw zzgwVar : g.values()) {
                    zzgwVar.a.unregisterOnSharedPreferenceChangeListener(zzgwVar.c);
                }
                g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.d) {
            this.e = null;
            this.b.run();
        }
        synchronized (this) {
            try {
                for (zzfz zzfzVar : this.f) {
                    zzfzVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    @InterfaceC11300zs1
    public final Object w(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                try {
                    map = this.e;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        Map<String, ?> all = this.a.getAll();
                        this.e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
