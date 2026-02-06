package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzgma {
    public static final Logger c = Logger.getLogger(zzgma.class.getName());
    public static final zzgma d = new zzgma();
    public final ConcurrentMap a = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();

    public static zzgma c() {
        return d;
    }

    public final zzgel a(String str, Class cls) throws GeneralSecurityException {
        zzgel g = g(str);
        if (g.b().equals(cls)) {
            return g;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(g.getClass());
        String obj = g.b().toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", which only supports: " + obj);
    }

    public final zzgel b(String str) throws GeneralSecurityException {
        return g(str);
    }

    public final synchronized void d(zzgel zzgelVar, boolean z) throws GeneralSecurityException {
        f(zzgelVar, 1, true);
    }

    public final boolean e(String str) {
        return ((Boolean) this.b.get(str)).booleanValue();
    }

    public final synchronized void f(zzgel zzgelVar, int i, boolean z) throws GeneralSecurityException {
        if (zzglr.a(i)) {
            h(zzgelVar, false, true);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }

    public final synchronized zzgel g(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.a;
        if (concurrentMap.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (zzgel) concurrentMap.get(str);
    }

    public final synchronized void h(zzgel zzgelVar, boolean z, boolean z2) throws GeneralSecurityException {
        try {
            String str = ((zzgmk) zzgelVar).a;
            ConcurrentMap concurrentMap = this.b;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            ConcurrentMap concurrentMap2 = this.a;
            zzgel zzgelVar2 = (zzgel) concurrentMap2.get(str);
            if (zzgelVar2 != null && !zzgelVar2.getClass().equals(zzgelVar.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzgelVar2.getClass().getName(), zzgelVar.getClass().getName()));
            }
            concurrentMap2.putIfAbsent(str, zzgelVar);
            concurrentMap.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }
}
