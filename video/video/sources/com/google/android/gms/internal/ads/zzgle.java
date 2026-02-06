package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzgle {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgla
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgle.d((zzgje) zzgexVar);
            }
        }, zzgje.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgle.b((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgle.c((zzgiz) zzgekVar, zzgeyVar);
            }
        }, zzgiz.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgld
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgle.a((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzgiz a(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzguw u2 = zzguw.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    if (u2.w2().i() == 32) {
                        return zzgiz.c(zzgje.d(f(zzgoiVar.c()), u2.v2().a()), zzgwq.b(u2.w2().d(), zzgeyVar), zzgoiVar.e());
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh unused) {
                throw new GeneralSecurityException("Parsing XAesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgje b(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzguz u2 = zzguz.u2(zzgojVar.c().y2(), zzgyc.a());
                if (u2.a() == 0) {
                    return zzgje.d(f(zzgojVar.c().x2()), u2.v2().a());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static /* synthetic */ zzgoi c(zzgiz zzgizVar, zzgey zzgeyVar) {
        zzguu s2 = zzguw.s2();
        byte[] d2 = zzgizVar.e().d(zzgeyVar);
        s2.Y1(zzgxk.U(d2, 0, d2.length));
        zzgva s22 = zzgvc.s2();
        s22.Y1(zzgizVar.d().b());
        s2.Z1((zzgvc) s22.V1());
        return zzgoi.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzguw) s2.V1()).Q0(), zzgtk.SYMMETRIC, g(zzgizVar.d().c()), zzgizVar.f());
    }

    public static /* synthetic */ zzgoj d(zzgje zzgjeVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzgux s22 = zzguz.s2();
        zzgva s23 = zzgvc.s2();
        s23.Y1(zzgjeVar.b());
        s22.Y1((zzgvc) s23.V1());
        s2.a2(((zzguz) s22.V1()).Q0());
        s2.Y1(g(zzgjeVar.c()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzgjd f(zzguq zzguqVar) throws GeneralSecurityException {
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return zzgjd.c;
            }
            int a2 = zzguqVar.a();
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a2);
        }
        return zzgjd.b;
    }

    public static zzguq g(zzgjd zzgjdVar) throws GeneralSecurityException {
        if (Objects.equals(zzgjdVar, zzgjd.b)) {
            return zzguq.TINK;
        }
        if (Objects.equals(zzgjdVar, zzgjd.c)) {
            return zzguq.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjdVar.toString()));
    }
}
