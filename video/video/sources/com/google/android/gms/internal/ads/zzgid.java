package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgid {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzghz
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgid.d((zzghy) zzgexVar);
            }
        }, zzghy.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzgia
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgid.b((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgib
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgid.c((zzghw) zzgekVar, zzgeyVar);
            }
        }, zzghw.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgic
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgid.a((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzghw a(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzgug u2 = zzgug.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    return zzghw.c(zzghy.c(u2.v2().w2(), f(zzgoiVar.c())), zzgoiVar.e());
                }
                String valueOf = String.valueOf(u2);
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + valueOf);
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzghy b(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzghy.c(zzguj.v2(zzgojVar.c().y2(), zzgyc.a()).w2(), f(zzgojVar.c().x2()));
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static /* synthetic */ zzgoi c(zzghw zzghwVar, zzgey zzgeyVar) {
        zzgue s2 = zzgug.s2();
        zzguh s22 = zzguj.s2();
        s22.Y1(zzghwVar.d().d());
        s2.Y1((zzguj) s22.V1());
        return zzgoi.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgug) s2.V1()).Q0(), zzgtk.REMOTE, g(zzghwVar.d().b()), zzghwVar.e());
    }

    public static /* synthetic */ zzgoj d(zzghy zzghyVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzguh s22 = zzguj.s2();
        s22.Y1(zzghyVar.d());
        s2.a2(((zzguj) s22.V1()).Q0());
        s2.Y1(g(zzghyVar.b()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzghx f(zzguq zzguqVar) throws GeneralSecurityException {
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return zzghx.c;
            }
            int a2 = zzguqVar.a();
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a2);
        }
        return zzghx.b;
    }

    public static zzguq g(zzghx zzghxVar) throws GeneralSecurityException {
        if (zzghx.b.equals(zzghxVar)) {
            return zzguq.TINK;
        }
        if (zzghx.c.equals(zzghxVar)) {
            return zzguq.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghxVar.toString()));
    }
}
