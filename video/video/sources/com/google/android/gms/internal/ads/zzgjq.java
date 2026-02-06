package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgjq {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgjm
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgjq.d((zzggc) zzgexVar);
            }
        }, zzggc.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzgjn
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgjq.b((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgjo
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgjq.c((zzgft) zzgekVar, zzgeyVar);
            }
        }, zzgft.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgjp
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgjq.a((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzgft a(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgrl u2 = zzgrl.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    if (u2.v2().a() == 0) {
                        if (u2.w2().a() == 0) {
                            zzgfy f2 = zzggc.f();
                            f2.a(u2.v2().w2().i());
                            f2.c(u2.w2().x2().i());
                            f2.d(u2.v2().v2().a());
                            f2.e(u2.w2().w2().a());
                            f2.b(f(u2.w2().w2().s2()));
                            f2.f(g(zzgoiVar.c()));
                            zzggc g = f2.g();
                            zzgfr c2 = zzgft.c();
                            c2.d(g);
                            c2.a(zzgwq.b(u2.v2().w2().d(), zzgeyVar));
                            c2.b(zzgwq.b(u2.w2().x2().d(), zzgeyVar));
                            c2.c(zzgoiVar.e());
                            return c2.e();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzggc b(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgro u2 = zzgro.u2(zzgojVar.c().y2(), zzgyc.a());
                if (u2.w2().b() == 0) {
                    zzgfy f2 = zzggc.f();
                    f2.a(u2.v2().a());
                    f2.c(u2.w2().a());
                    f2.d(u2.v2().v2().a());
                    f2.e(u2.w2().w2().a());
                    f2.b(f(u2.w2().w2().s2()));
                    f2.f(g(zzgojVar.c().x2()));
                    return f2.g();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static /* synthetic */ zzgoi c(zzgft zzgftVar, zzgey zzgeyVar) {
        zzgrj s2 = zzgrl.s2();
        zzgrp s22 = zzgrr.s2();
        zzgrv s23 = zzgrx.s2();
        s23.Y1(zzgftVar.d().d());
        s22.Z1((zzgrx) s23.V1());
        byte[] d2 = zzgftVar.e().d(zzgeyVar);
        s22.Y1(zzgxk.U(d2, 0, d2.length));
        s2.Y1((zzgrr) s22.V1());
        zzgta s24 = zzgtc.s2();
        s24.Z1(h(zzgftVar.d()));
        byte[] d3 = zzgftVar.f().d(zzgeyVar);
        s24.Y1(zzgxk.U(d3, 0, d3.length));
        s2.Z1((zzgtc) s24.V1());
        return zzgoi.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgrl) s2.V1()).Q0(), zzgtk.SYMMETRIC, i(zzgftVar.d().h()), zzgftVar.g());
    }

    public static /* synthetic */ zzgoj d(zzggc zzggcVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgrm s22 = zzgro.s2();
        zzgrs s23 = zzgru.s2();
        zzgrv s24 = zzgrx.s2();
        s24.Y1(zzggcVar.d());
        s23.Z1((zzgrx) s24.V1());
        s23.Y1(zzggcVar.b());
        s22.Y1((zzgru) s23.V1());
        zzgtd s25 = zzgtf.s2();
        s25.Z1(h(zzggcVar));
        s25.Y1(zzggcVar.c());
        s22.Z1((zzgtf) s25.V1());
        s2.a2(((zzgro) s22.V1()).Q0());
        s2.Y1(i(zzggcVar.h()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzgfz f(zzgsz zzgszVar) throws GeneralSecurityException {
        int ordinal = zzgszVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return zzgfz.c;
                        }
                        int a2 = zzgszVar.a();
                        throw new GeneralSecurityException("Unable to parse HashType: " + a2);
                    }
                    return zzgfz.f;
                }
                return zzgfz.d;
            }
            return zzgfz.e;
        }
        return zzgfz.b;
    }

    public static zzgga g(zzguq zzguqVar) throws GeneralSecurityException {
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        int a2 = zzguqVar.a();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a2);
                    }
                } else {
                    return zzgga.d;
                }
            }
            return zzgga.c;
        }
        return zzgga.b;
    }

    public static zzgti h(zzggc zzggcVar) throws GeneralSecurityException {
        zzgsz zzgszVar;
        zzgtg t2 = zzgti.t2();
        t2.Z1(zzggcVar.e());
        zzgfz g = zzggcVar.g();
        if (zzgfz.b.equals(g)) {
            zzgszVar = zzgsz.SHA1;
        } else if (zzgfz.c.equals(g)) {
            zzgszVar = zzgsz.SHA224;
        } else if (zzgfz.d.equals(g)) {
            zzgszVar = zzgsz.SHA256;
        } else if (zzgfz.e.equals(g)) {
            zzgszVar = zzgsz.SHA384;
        } else if (zzgfz.f.equals(g)) {
            zzgszVar = zzgsz.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(g)));
        }
        t2.Y1(zzgszVar);
        return (zzgti) t2.V1();
    }

    public static zzguq i(zzgga zzggaVar) throws GeneralSecurityException {
        if (zzgga.b.equals(zzggaVar)) {
            return zzguq.TINK;
        }
        if (zzgga.c.equals(zzggaVar)) {
            return zzguq.CRUNCHY;
        }
        if (zzgga.d.equals(zzggaVar)) {
            return zzguq.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggaVar)));
    }
}
