package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgoj implements zzgom {
    public final zzgwp a;
    public final zzgtq b;

    public zzgoj(zzgtq zzgtqVar, zzgwp zzgwpVar) {
        this.b = zzgtqVar;
        this.a = zzgwpVar;
    }

    public static zzgoj a(zzgtq zzgtqVar) throws GeneralSecurityException {
        return new zzgoj(zzgtqVar, zzgou.a(zzgtqVar.z2()));
    }

    public static zzgoj b(zzgtq zzgtqVar) {
        return new zzgoj(zzgtqVar, zzgou.b(zzgtqVar.z2()));
    }

    public final zzgtq c() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final zzgwp f() {
        return this.a;
    }
}
