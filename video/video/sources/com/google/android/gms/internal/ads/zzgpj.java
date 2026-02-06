package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgpj implements zzgoh {
    public static final zzgpj a = new zzgpj();

    private zzgpj() {
    }

    public static void d() throws GeneralSecurityException {
        zzgng.a().d(a);
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final Class a() {
        return zzgpg.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final Class b() {
        return zzgpg.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final /* bridge */ /* synthetic */ Object c(zzgmj zzgmjVar, zzgms zzgmsVar, zzgoc zzgocVar) throws GeneralSecurityException {
        zzgwp c;
        zzger c2 = ((zzget) zzgmjVar).c();
        zzgnu zzgnuVar = new zzgnu();
        for (int i = 0; i < zzgmjVar.a(); i++) {
            zzger b = ((zzget) zzgmjVar).b(i);
            if (b.c().equals(zzgem.b)) {
                zzgpg zzgpgVar = (zzgpg) zzgocVar.a(b);
                zzgek b2 = b.b();
                if (b2 instanceof zzgpy) {
                    c = ((zzgpy) b2).b();
                } else if (b2 instanceof zzgmo) {
                    c = ((zzgmo) b2).c();
                } else {
                    String name = b2.getClass().getName();
                    String valueOf = String.valueOf(b2.a());
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + name + " with parameters " + valueOf);
                }
                zzgnuVar.a(c, zzgpgVar);
            }
        }
        return new zzgph(zzgnuVar.b(), (zzgpg) zzgocVar.a(c2), null);
    }
}
