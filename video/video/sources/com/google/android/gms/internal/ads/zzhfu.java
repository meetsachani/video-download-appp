package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfu implements zzhge, zzhfp {
    public static final Object c = new Object();
    public volatile zzhge a;
    public volatile Object b = c;

    public zzhfu(zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    public static zzhfp a(zzhge zzhgeVar) {
        if (zzhgeVar instanceof zzhfp) {
            return (zzhfp) zzhgeVar;
        }
        return new zzhfu(zzhgeVar);
    }

    public static zzhge c(zzhge zzhgeVar) {
        return zzhgeVar instanceof zzhfu ? zzhgeVar : new zzhfu(zzhgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final Object b() {
        Object obj = this.b;
        if (obj == c) {
            return d();
        }
        return obj;
    }

    public final synchronized Object d() {
        try {
            Object obj = this.b;
            Object obj2 = c;
            if (obj == obj2) {
                Object b = this.a.b();
                Object obj3 = this.b;
                if (obj3 != obj2 && obj3 != b) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + b + ". This is likely due to a circular dependency.");
                }
                this.b = b;
                this.a = null;
                return b;
            }
            return obj;
        } catch (Throwable th) {
            throw th;
        }
    }
}
