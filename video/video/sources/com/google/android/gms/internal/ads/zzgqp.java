package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgqp {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgql
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgqp.b((zzgpf) zzgexVar);
            }
        }, zzgpf.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzgqm
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgqp.d((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgqn
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgqp.a((zzgox) zzgekVar, zzgeyVar);
            }
        }, zzgox.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgqo
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgqp.c((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzgoi a(zzgox zzgoxVar, zzgey zzgeyVar) {
        zzgra s2 = zzgrc.s2();
        s2.Z1(g(zzgoxVar.d()));
        byte[] d2 = zzgoxVar.e().d(zzgeyVar);
        s2.Y1(zzgxk.U(d2, 0, d2.length));
        return zzgoi.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgrc) s2.V1()).Q0(), zzgtk.SYMMETRIC, h(zzgoxVar.d().f()), zzgoxVar.f());
    }

    public static /* synthetic */ zzgoj b(zzgpf zzgpfVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgrd s22 = zzgrf.s2();
        s22.Z1(g(zzgpfVar));
        s22.Y1(zzgpfVar.c());
        s2.a2(((zzgrf) s22.V1()).Q0());
        s2.Y1(h(zzgpfVar.f()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static /* synthetic */ zzgox c(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgrc u2 = zzgrc.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    zzgpc e2 = zzgpf.e();
                    e2.a(u2.w2().i());
                    e2.b(u2.v2().a());
                    e2.c(f(zzgoiVar.c()));
                    zzgpf d2 = e2.d();
                    zzgov c2 = zzgox.c();
                    c2.c(d2);
                    c2.a(zzgwq.b(u2.w2().d(), zzgeyVar));
                    c2.b(zzgoiVar.e());
                    return c2.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgpf d(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgrf u2 = zzgrf.u2(zzgojVar.c().y2(), zzgyc.a());
                zzgpc e2 = zzgpf.e();
                e2.a(u2.a());
                e2.b(u2.v2().a());
                e2.c(f(zzgojVar.c().x2()));
                return e2.d();
            } catch (zzgzh e3) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e3);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzgpd f(zzguq zzguqVar) throws GeneralSecurityException {
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return zzgpd.c;
                    }
                    int a2 = zzguqVar.a();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a2);
                }
                return zzgpd.e;
            }
            return zzgpd.d;
        }
        return zzgpd.b;
    }

    public static zzgri g(zzgpf zzgpfVar) {
        zzgrg s2 = zzgri.s2();
        s2.Y1(zzgpfVar.b());
        return (zzgri) s2.V1();
    }

    public static zzguq h(zzgpd zzgpdVar) throws GeneralSecurityException {
        if (zzgpd.b.equals(zzgpdVar)) {
            return zzguq.TINK;
        }
        if (zzgpd.c.equals(zzgpdVar)) {
            return zzguq.CRUNCHY;
        }
        if (zzgpd.e.equals(zzgpdVar)) {
            return zzguq.RAW;
        }
        if (zzgpd.d.equals(zzgpdVar)) {
            return zzguq.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgpdVar)));
    }
}
