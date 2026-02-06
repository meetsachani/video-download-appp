package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgkp {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgkl
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgkp.d((zzgho) zzgexVar);
            }
        }, zzgho.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzgkm
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgkp.b((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgkn
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgkp.c((zzghj) zzgekVar, zzgeyVar);
            }
        }, zzghj.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgko
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgkp.a((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzghj a(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgsv u2 = zzgsv.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    return zzghj.c(f(zzgoiVar.c()), zzgwq.b(u2.v2().d(), zzgeyVar), zzgoiVar.e());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgho b(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgsy.u2(zzgojVar.c().y2(), zzgyc.a());
                return zzgho.c(f(zzgojVar.c().x2()));
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static /* synthetic */ zzgoi c(zzghj zzghjVar, zzgey zzgeyVar) {
        zzgst s2 = zzgsv.s2();
        byte[] d2 = zzghjVar.e().d(zzgeyVar);
        s2.Y1(zzgxk.U(d2, 0, d2.length));
        return zzgoi.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgsv) s2.V1()).Q0(), zzgtk.SYMMETRIC, g(zzghjVar.d().b()), zzghjVar.f());
    }

    public static /* synthetic */ zzgoj d(zzgho zzghoVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        s2.a2(zzgsy.t2().Q0());
        s2.Y1(g(zzghoVar.b()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzghn f(zzguq zzguqVar) throws GeneralSecurityException {
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        int a2 = zzguqVar.a();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a2);
                    }
                } else {
                    return zzghn.d;
                }
            }
            return zzghn.c;
        }
        return zzghn.b;
    }

    public static zzguq g(zzghn zzghnVar) throws GeneralSecurityException {
        if (zzghn.b.equals(zzghnVar)) {
            return zzguq.TINK;
        }
        if (zzghn.c.equals(zzghnVar)) {
            return zzguq.CRUNCHY;
        }
        if (zzghn.d.equals(zzghnVar)) {
            return zzguq.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghnVar.toString()));
    }
}
