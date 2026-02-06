package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzgob {
    public final Class a;
    public final Class b;

    public /* synthetic */ zzgob(Class cls, Class cls2, zzgoa zzgoaVar) {
        this.a = cls;
        this.b = cls2;
    }

    public static zzgob b(zzgnz zzgnzVar, Class cls, Class cls2) {
        return new zzgny(cls, cls2, zzgnzVar);
    }

    public abstract Object a(zzgek zzgekVar) throws GeneralSecurityException;

    public final Class c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
