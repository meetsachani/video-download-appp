package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzglk {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzglk.d((zzgjl) zzgexVar);
            }
        }, zzgjl.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzglh
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzglk.b((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgli
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzglk.c((zzgjf) zzgekVar, zzgeyVar);
            }
        }, zzgjf.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzglj
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzglk.a((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzgjf a(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzgvf u2 = zzgvf.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    return zzgjf.c(f(zzgoiVar.c()), zzgwq.b(u2.v2().d(), zzgeyVar), zzgoiVar.e());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgjl b(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzgvi.u2(zzgojVar.c().y2(), zzgyc.a()).a() == 0) {
                    return zzgjl.c(f(zzgojVar.c().x2()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static /* synthetic */ zzgoi c(zzgjf zzgjfVar, zzgey zzgeyVar) {
        zzgvd s2 = zzgvf.s2();
        byte[] d2 = zzgjfVar.e().d(zzgeyVar);
        s2.Y1(zzgxk.U(d2, 0, d2.length));
        return zzgoi.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgvf) s2.V1()).Q0(), zzgtk.SYMMETRIC, g(zzgjfVar.d().b()), zzgjfVar.f());
    }

    public static /* synthetic */ zzgoj d(zzgjl zzgjlVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        s2.a2(zzgvi.t2().Q0());
        s2.Y1(g(zzgjlVar.b()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzgjk f(zzguq zzguqVar) throws GeneralSecurityException {
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        int a2 = zzguqVar.a();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a2);
                    }
                } else {
                    return zzgjk.d;
                }
            }
            return zzgjk.c;
        }
        return zzgjk.b;
    }

    public static zzguq g(zzgjk zzgjkVar) throws GeneralSecurityException {
        if (zzgjk.b.equals(zzgjkVar)) {
            return zzguq.TINK;
        }
        if (zzgjk.c.equals(zzgjkVar)) {
            return zzguq.CRUNCHY;
        }
        if (zzgjk.d.equals(zzgjkVar)) {
            return zzguq.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjkVar.toString()));
    }
}
