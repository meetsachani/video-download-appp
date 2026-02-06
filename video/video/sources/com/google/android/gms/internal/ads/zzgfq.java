package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgfq implements zzgoh {
    public static final zzgfq a = new zzgfq();
    public static final zzgob b = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgfm
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgkx.b((zzgmo) zzgekVar);
        }
    }, zzgmo.class, zzgee.class);

    public static void d() throws GeneralSecurityException {
        zzgng.a().d(a);
        zzgng.a().c(b);
    }

    public static void e(zzgod zzgodVar) throws GeneralSecurityException {
        zzgodVar.b(a);
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final Class a() {
        return zzgee.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final Class b() {
        return zzgee.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final /* bridge */ /* synthetic */ Object c(zzgmj zzgmjVar, zzgms zzgmsVar, zzgoc zzgocVar) throws GeneralSecurityException {
        zzgmt zzgmtVar;
        zzgmt zzgmtVar2;
        zzgwp c;
        zzgnu zzgnuVar = new zzgnu();
        for (int i = 0; i < zzgmjVar.a(); i++) {
            zzger b2 = ((zzget) zzgmjVar).b(i);
            if (b2.c().equals(zzgem.b)) {
                zzgek b3 = b2.b();
                if (b3 instanceof zzgfk) {
                    c = ((zzgfk) b3).b();
                } else if (b3 instanceof zzgmo) {
                    c = ((zzgmo) b3).c();
                } else {
                    String name = b3.getClass().getName();
                    String valueOf = String.valueOf(b3.a());
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + name + " with parameters " + valueOf);
                }
                zzgnuVar.a(c, new zzgfn((zzgee) zzgocVar.a(b2), b2.a()));
            }
        }
        if (!zzgmsVar.a()) {
            zzgmu a2 = zzgne.b().a();
            zzgmt a3 = a2.a(zzgmjVar, zzgmsVar, "aead", "encrypt");
            zzgmtVar2 = a2.a(zzgmjVar, zzgmsVar, "aead", "decrypt");
            zzgmtVar = a3;
        } else {
            zzgmtVar = zzgmw.a;
            zzgmtVar2 = zzgmtVar;
        }
        zzget zzgetVar = (zzget) zzgmjVar;
        return new zzgfo(new zzgfn((zzgee) zzgocVar.a(zzgetVar.c()), zzgetVar.c().a()), zzgnuVar.b(), zzgmtVar, zzgmtVar2, null);
    }
}
