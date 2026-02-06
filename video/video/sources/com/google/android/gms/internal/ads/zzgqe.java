package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgqe implements zzgoh {
    public static final zzgqe a = new zzgqe();
    public static final zzgob b = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgqa
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgqy.a((zzgmo) zzgekVar);
        }
    }, zzgmo.class, zzgew.class);

    public static void d() throws GeneralSecurityException {
        zzgng.a().d(a);
        zzgng.a().c(b);
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final Class a() {
        return zzgew.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgoh
    public final Class b() {
        return zzgew.class;
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
                zzgew zzgewVar = (zzgew) zzgocVar.a(b2);
                zzgek b3 = b2.b();
                if (b3 instanceof zzgpy) {
                    c = ((zzgpy) b3).b();
                } else if (b3 instanceof zzgmo) {
                    c = ((zzgmo) b3).c();
                } else {
                    String name = b3.getClass().getName();
                    String valueOf = String.valueOf(b3.a());
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + name + " with parameters " + valueOf);
                }
                zzgnuVar.a(c, new zzgqb(zzgewVar, b2.a()));
            }
        }
        if (!zzgmsVar.a()) {
            zzgmu a2 = zzgne.b().a();
            zzgmt a3 = a2.a(zzgmjVar, zzgmsVar, "mac", "compute");
            zzgmtVar2 = a2.a(zzgmjVar, zzgmsVar, "mac", "verify");
            zzgmtVar = a3;
        } else {
            zzgmtVar = zzgmw.a;
            zzgmtVar2 = zzgmtVar;
        }
        zzget zzgetVar = (zzget) zzgmjVar;
        return new zzgqc(new zzgqb((zzgew) zzgocVar.a(zzgetVar.c()), zzgetVar.c().a()), zzgnuVar.b(), zzgmtVar, zzgmtVar2, null);
    }
}
