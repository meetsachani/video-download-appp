package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgio {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgik
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgio.d((zzgij) zzgexVar);
            }
        }, zzgij.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzgil
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgio.b((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgim
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgio.c((zzgie) zzgekVar, zzgeyVar);
            }
        }, zzgie.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgin
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgio.a((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzgie a(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzgum u2 = zzgum.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    return zzgie.c(f(u2.v2(), zzgoiVar.c()), zzgoiVar.e());
                }
                String valueOf = String.valueOf(u2);
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + valueOf);
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgij b(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return f(zzgup.w2(zzgojVar.c().y2(), zzgyc.a()), zzgojVar.c().x2());
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static /* synthetic */ zzgoi c(zzgie zzgieVar, zzgey zzgeyVar) {
        zzguk s2 = zzgum.s2();
        s2.Y1(g(zzgieVar.d()));
        return zzgoi.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgum) s2.V1()).Q0(), zzgtk.REMOTE, h(zzgieVar.d().c()), zzgieVar.e());
    }

    public static /* synthetic */ zzgoj d(zzgij zzgijVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        s2.a2(g(zzgijVar).Q0());
        s2.Y1(h(zzgijVar.c()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzgij f(zzgup zzgupVar, zzguq zzguqVar) throws GeneralSecurityException {
        zzgig zzgigVar;
        zzgih zzgihVar;
        zzgto s2 = zzgtq.s2();
        s2.Z1(zzgupVar.s2().z2());
        s2.a2(zzgupVar.s2().y2());
        s2.Y1(zzguq.RAW);
        zzgex a2 = zzgez.a(((zzgtq) s2.V1()).b1());
        if (a2 instanceof zzggx) {
            zzgigVar = zzgig.b;
        } else if (a2 instanceof zzgho) {
            zzgigVar = zzgig.d;
        } else if (a2 instanceof zzgjl) {
            zzgigVar = zzgig.c;
        } else if (a2 instanceof zzggc) {
            zzgigVar = zzgig.e;
        } else if (a2 instanceof zzggm) {
            zzgigVar = zzgig.f;
        } else if (a2 instanceof zzghi) {
            zzgigVar = zzgig.g;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(a2.toString()));
        }
        zzgif zzgifVar = new zzgif(null);
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                zzgihVar = zzgih.c;
            } else {
                int a3 = zzguqVar.a();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a3);
            }
        } else {
            zzgihVar = zzgih.b;
        }
        zzgifVar.d(zzgihVar);
        zzgifVar.c(zzgupVar.x2());
        zzgifVar.a((zzgfl) a2);
        zzgifVar.b(zzgigVar);
        return zzgifVar.e();
    }

    public static zzgup g(zzgij zzgijVar) throws GeneralSecurityException {
        try {
            zzgtq w2 = zzgtq.w2(zzgez.b(zzgijVar.b()), zzgyc.a());
            zzgun t2 = zzgup.t2();
            t2.Z1(zzgijVar.d());
            t2.Y1(w2);
            return (zzgup) t2.V1();
        } catch (zzgzh e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    public static zzguq h(zzgih zzgihVar) throws GeneralSecurityException {
        if (zzgih.b.equals(zzgihVar)) {
            return zzguq.TINK;
        }
        if (zzgih.c.equals(zzgihVar)) {
            return zzguq.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgihVar)));
    }
}
