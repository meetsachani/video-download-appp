package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzgno {
    public final zzgwp a;
    public final Class b;

    public /* synthetic */ zzgno(zzgwp zzgwpVar, Class cls, zzgnn zzgnnVar) {
        this.a = zzgwpVar;
        this.b = cls;
    }

    public static zzgno b(zzgnm zzgnmVar, zzgwp zzgwpVar, Class cls) {
        return new zzgnl(zzgwpVar, cls, zzgnmVar);
    }

    public abstract zzgex a(zzgom zzgomVar) throws GeneralSecurityException;

    public final zzgwp c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
