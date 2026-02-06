package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzgns {
    public final Class a;
    public final Class b;

    public /* synthetic */ zzgns(Class cls, Class cls2, zzgnr zzgnrVar) {
        this.a = cls;
        this.b = cls2;
    }

    public static zzgns b(zzgnq zzgnqVar, Class cls, Class cls2) {
        return new zzgnp(cls, cls2, zzgnqVar);
    }

    public abstract zzgom a(zzgex zzgexVar) throws GeneralSecurityException;

    public final Class c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
