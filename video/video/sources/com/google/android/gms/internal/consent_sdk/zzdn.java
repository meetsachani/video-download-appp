package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes3.dex */
public final class zzdn implements zzdr {
    public static final Object c = new Object();
    public volatile zzdr a;
    public volatile Object b = c;

    public zzdn(zzdr zzdrVar) {
        this.a = zzdrVar;
    }

    public static zzdr b(zzdr zzdrVar) {
        return zzdrVar instanceof zzdn ? zzdrVar : new zzdn(zzdrVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object a() {
        Object obj = this.b;
        if (obj == c) {
            return c();
        }
        return obj;
    }

    public final synchronized Object c() {
        try {
            Object obj = this.b;
            Object obj2 = c;
            if (obj == obj2) {
                Object a = this.a.a();
                Object obj3 = this.b;
                if (obj3 != obj2 && obj3 != a) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + a + ". This is likely due to a circular dependency.");
                }
                this.b = a;
                this.a = null;
                return a;
            }
            return obj;
        } catch (Throwable th) {
            throw th;
        }
    }
}
