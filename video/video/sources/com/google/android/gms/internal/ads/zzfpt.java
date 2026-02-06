package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import o.AD1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.S92;

/* loaded from: classes2.dex */
public final class zzfpt {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final zzfpu b;
    public final zzfnx c;
    public final zzfns d;
    @InterfaceC11300zs1
    public zzfpi e;
    public final Object f = new Object();

    public zzfpt(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 zzfpu zzfpuVar, @InterfaceC5670cr1 zzfnx zzfnxVar, @InterfaceC5670cr1 zzfns zzfnsVar, boolean z) {
        this.a = context;
        this.b = zzfpuVar;
        this.c = zzfnxVar;
        this.d = zzfnsVar;
    }

    @InterfaceC11300zs1
    public final zzfoa a() {
        zzfpi zzfpiVar;
        synchronized (this.f) {
            zzfpiVar = this.e;
        }
        return zzfpiVar;
    }

    @InterfaceC11300zs1
    public final zzfpj b() {
        synchronized (this.f) {
            try {
                zzfpi zzfpiVar = this.e;
                if (zzfpiVar != null) {
                    return zzfpiVar.f();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(@InterfaceC5670cr1 zzfpj zzfpjVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfpi zzfpiVar = new zzfpi(d(zzfpjVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", zzfpjVar.e(), null, new Bundle(), 2), zzfpjVar, this.b, this.c, false);
                if (zzfpiVar.h()) {
                    int e = zzfpiVar.e();
                    if (e == 0) {
                        synchronized (this.f) {
                            zzfpi zzfpiVar2 = this.e;
                            if (zzfpiVar2 != null) {
                                try {
                                    zzfpiVar2.g();
                                } catch (zzfps e2) {
                                    this.c.c(e2.a(), -1L, e2);
                                }
                            }
                            this.e = zzfpiVar;
                        }
                        this.c.d(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzfps((int) AD1.p1, "ci: " + e);
                }
                throw new zzfps((int) S92.y, "init failed");
            } catch (Exception e3) {
                throw new zzfps(2004, e3);
            }
        } catch (zzfps e4) {
            this.c.c(e4.a(), System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.c.c(4010, System.currentTimeMillis() - currentTimeMillis, e5);
            return false;
        }
    }

    public final synchronized Class d(@InterfaceC5670cr1 zzfpj zzfpjVar) throws zzfps {
        try {
            String A2 = zzfpjVar.a().A2();
            HashMap hashMap = g;
            Class cls = (Class) hashMap.get(A2);
            if (cls != null) {
                return cls;
            }
            try {
                if (this.d.a(zzfpjVar.c())) {
                    try {
                        File b = zzfpjVar.b();
                        if (!b.exists()) {
                            b.mkdirs();
                        }
                        Class<?> loadClass = new DexClassLoader(zzfpjVar.c().getAbsolutePath(), b.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                        hashMap.put(A2, loadClass);
                        return loadClass;
                    } catch (ClassNotFoundException e) {
                        e = e;
                        throw new zzfps(2008, e);
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        throw new zzfps(2008, e);
                    } catch (SecurityException e3) {
                        e = e3;
                        throw new zzfps(2008, e);
                    }
                }
                throw new zzfps(2026, "VM did not pass signature verification");
            } catch (GeneralSecurityException e4) {
                throw new zzfps(2026, e4);
            }
        } finally {
        }
    }
}
