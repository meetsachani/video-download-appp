package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public abstract class zzgme {
    public final zzgwp a;
    public final Class b;

    public /* synthetic */ zzgme(zzgwp zzgwpVar, Class cls, zzgmd zzgmdVar) {
        this.a = zzgwpVar;
        this.b = cls;
    }

    public static zzgme b(zzgmc zzgmcVar, zzgwp zzgwpVar, Class cls) {
        return new zzgmb(zzgwpVar, cls, zzgmcVar);
    }

    public abstract zzgek a(zzgom zzgomVar, @InterfaceC10571ws1 zzgey zzgeyVar) throws GeneralSecurityException;

    public final zzgwp c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
