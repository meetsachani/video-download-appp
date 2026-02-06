package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgjv {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgjr
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgjv.d((zzggm) zzgexVar);
            }
        }, zzggm.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgjv.b((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgjv.c((zzggf) zzgekVar, zzgeyVar);
            }
        }, zzggf.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgju
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgjv.a((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzggf a(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgsa u2 = zzgsa.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    zzggj d2 = zzggm.d();
                    d2.b(u2.w2().i());
                    d2.a(u2.v2().a());
                    d2.c(16);
                    d2.d(f(zzgoiVar.c()));
                    zzggm e2 = d2.e();
                    zzggd c2 = zzggf.c();
                    c2.c(e2);
                    c2.b(zzgwq.b(u2.w2().d(), zzgeyVar));
                    c2.a(zzgoiVar.e());
                    return c2.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzggm b(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgsd u2 = zzgsd.u2(zzgojVar.c().y2(), zzgyc.a());
                zzggj d2 = zzggm.d();
                d2.b(u2.a());
                d2.a(u2.v2().a());
                d2.c(16);
                d2.d(f(zzgojVar.c().x2()));
                return d2.e();
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static /* synthetic */ zzgoi c(zzggf zzggfVar, zzgey zzgeyVar) {
        zzgry s2 = zzgsa.s2();
        s2.Z1(g(zzggfVar.d()));
        byte[] d2 = zzggfVar.e().d(zzgeyVar);
        s2.Y1(zzgxk.U(d2, 0, d2.length));
        return zzgoi.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgsa) s2.V1()).Q0(), zzgtk.SYMMETRIC, h(zzggfVar.d().e()), zzggfVar.f());
    }

    public static /* synthetic */ zzgoj d(zzggm zzggmVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgsb s22 = zzgsd.s2();
        s22.Z1(g(zzggmVar));
        s22.Y1(zzggmVar.c());
        s2.a2(((zzgsd) s22.V1()).Q0());
        s2.Y1(h(zzggmVar.e()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzggk f(zzguq zzguqVar) throws GeneralSecurityException {
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        int a2 = zzguqVar.a();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a2);
                    }
                } else {
                    return zzggk.d;
                }
            }
            return zzggk.c;
        }
        return zzggk.b;
    }

    public static zzgsg g(zzggm zzggmVar) throws GeneralSecurityException {
        zzgse s2 = zzgsg.s2();
        s2.Y1(zzggmVar.b());
        return (zzgsg) s2.V1();
    }

    public static zzguq h(zzggk zzggkVar) throws GeneralSecurityException {
        if (zzggk.b.equals(zzggkVar)) {
            return zzguq.TINK;
        }
        if (zzggk.c.equals(zzggkVar)) {
            return zzguq.CRUNCHY;
        }
        if (zzggk.d.equals(zzggkVar)) {
            return zzguq.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggkVar)));
    }
}
