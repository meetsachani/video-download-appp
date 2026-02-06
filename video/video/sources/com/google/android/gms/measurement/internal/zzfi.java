package com.google.android.gms.measurement.internal;

import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public final class zzfi<V> {
    public static final Object h = new Object();
    public final String a;
    public final zzfg<V> b;
    public final V c;
    public final V d;
    public final Object e;
    @InterfaceC8710pF0("overrideLock")
    public volatile V f;
    @InterfaceC8710pF0("cachingLock")
    public volatile V g;

    public final V a(V v) {
        V v2;
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (zzff.a == null) {
            return this.c;
        }
        synchronized (h) {
            try {
                if (zzae.a()) {
                    if (this.g == null) {
                        v2 = this.c;
                    } else {
                        v2 = this.g;
                    }
                    return v2;
                }
                try {
                    for (zzfi zzfiVar : zzbi.z0()) {
                        if (!zzae.a()) {
                            V v3 = null;
                            try {
                                zzfg<V> zzfgVar = zzfiVar.b;
                                if (zzfgVar != null) {
                                    v3 = zzfgVar.a();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (h) {
                                zzfiVar.g = v3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                zzfg<V> zzfgVar2 = this.b;
                if (zzfgVar2 == null) {
                    return this.c;
                }
                try {
                    return zzfgVar2.a();
                } catch (IllegalStateException unused3) {
                    return this.c;
                } catch (SecurityException unused4) {
                    return this.c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.a;
    }

    public zzfi(String str, V v, V v2, zzfg<V> zzfgVar) {
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.a = str;
        this.c = v;
        this.d = v2;
        this.b = zzfgVar;
    }
}
