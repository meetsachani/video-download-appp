package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public abstract class zzgmi {
    public final Class a;
    public final Class b;

    public /* synthetic */ zzgmi(Class cls, Class cls2, zzgmh zzgmhVar) {
        this.a = cls;
        this.b = cls2;
    }

    public static zzgmi b(zzgmg zzgmgVar, Class cls, Class cls2) {
        return new zzgmf(cls, cls2, zzgmgVar);
    }

    public abstract zzgom a(zzgek zzgekVar, @InterfaceC10571ws1 zzgey zzgeyVar) throws GeneralSecurityException;

    public final Class c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
