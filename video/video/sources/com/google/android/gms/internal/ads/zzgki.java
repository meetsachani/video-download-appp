package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgki {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgke
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgki.d((zzghi) zzgexVar);
            }
        }, zzghi.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzgkf
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgki.b((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgkg
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgki.c((zzgha) zzgekVar, zzgeyVar);
            }
        }, zzgha.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgkh
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgki.a((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzgha a(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgsp u2 = zzgsp.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    zzghf c2 = zzghi.c();
                    c2.a(u2.v2().i());
                    c2.b(f(zzgoiVar.c()));
                    zzghi c3 = c2.c();
                    zzggy c4 = zzgha.c();
                    c4.c(c3);
                    c4.b(zzgwq.b(u2.v2().d(), zzgeyVar));
                    c4.a(zzgoiVar.e());
                    return c4.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzghi b(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgss u2 = zzgss.u2(zzgojVar.c().y2(), zzgyc.a());
                if (u2.b() == 0) {
                    zzghf c2 = zzghi.c();
                    c2.a(u2.a());
                    c2.b(f(zzgojVar.c().x2()));
                    return c2.c();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static /* synthetic */ zzgoi c(zzgha zzghaVar, zzgey zzgeyVar) {
        zzgsn s2 = zzgsp.s2();
        byte[] d2 = zzghaVar.e().d(zzgeyVar);
        s2.Y1(zzgxk.U(d2, 0, d2.length));
        return zzgoi.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgsp) s2.V1()).Q0(), zzgtk.SYMMETRIC, g(zzghaVar.d().d()), zzghaVar.f());
    }

    public static /* synthetic */ zzgoj d(zzghi zzghiVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgsq s22 = zzgss.s2();
        s22.Y1(zzghiVar.b());
        s2.a2(((zzgss) s22.V1()).Q0());
        s2.Y1(g(zzghiVar.d()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzghg f(zzguq zzguqVar) throws GeneralSecurityException {
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        int a2 = zzguqVar.a();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a2);
                    }
                } else {
                    return zzghg.d;
                }
            }
            return zzghg.c;
        }
        return zzghg.b;
    }

    public static zzguq g(zzghg zzghgVar) throws GeneralSecurityException {
        if (zzghg.b.equals(zzghgVar)) {
            return zzguq.TINK;
        }
        if (zzghg.c.equals(zzghgVar)) {
            return zzguq.CRUNCHY;
        }
        if (zzghg.d.equals(zzghgVar)) {
            return zzguq.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzghgVar)));
    }
}
