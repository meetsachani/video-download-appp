package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgmk implements zzgel {
    public final String a;
    public final Class b;
    public final zzgtk c;

    public zzgmk(String str, Class cls, zzgtk zzgtkVar, zzhal zzhalVar) {
        this.a = str;
        this.b = cls;
        this.c = zzgtkVar;
    }

    public static zzgel d(String str, Class cls, zzgtk zzgtkVar, zzhal zzhalVar) {
        return new zzgmk(str, cls, zzgtkVar, zzhalVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final Object a(zzgxk zzgxkVar) throws GeneralSecurityException {
        return zzgng.a().b(zzgnj.c().a(zzgoi.a(this.a, zzgxkVar, this.c, zzguq.RAW, null), zzgej.a()), this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final Class b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final zzgtm c(zzgxk zzgxkVar) throws GeneralSecurityException {
        zzgto s2 = zzgtq.s2();
        s2.Z1(this.a);
        s2.a2(zzgxkVar);
        s2.Y1(zzguq.RAW);
        zzgoi zzgoiVar = (zzgoi) zzgnj.c().d(zzgmz.b().a(zzgnj.c().b(zzgoj.a((zzgtq) s2.V1())), null), zzgoi.class, zzgej.a());
        zzgtj s22 = zzgtm.s2();
        s22.Z1(zzgoiVar.g());
        s22.a2(zzgoiVar.d());
        s22.Y1(zzgoiVar.b());
        return (zzgtm) s22.V1();
    }
}
