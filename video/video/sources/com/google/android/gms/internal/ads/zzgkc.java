package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgkc {
    public static final zzgwp a;
    public static final zzgns b;
    public static final zzgno c;
    public static final zzgmi d;
    public static final zzgme e;
    public static final /* synthetic */ int f = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = b2;
        b = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgjy
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgkc.d((zzggx) zzgexVar);
            }
        }, zzggx.class, zzgoj.class);
        c = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzgjz
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgkc.b((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        d = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgka
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgkc.c((zzggp) zzgekVar, zzgeyVar);
            }
        }, zzggp.class, zzgoi.class);
        e = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgkb
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgkc.a((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzggp a(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgsj u2 = zzgsj.u2(zzgoiVar.d(), zzgyc.a());
                if (u2.a() == 0) {
                    zzggu c2 = zzggx.c();
                    c2.b(u2.v2().i());
                    c2.a(12);
                    c2.c(16);
                    c2.d(f(zzgoiVar.c()));
                    zzggx e2 = c2.e();
                    zzggn c3 = zzggp.c();
                    c3.c(e2);
                    c3.b(zzgwq.b(u2.v2().d(), zzgeyVar));
                    c3.a(zzgoiVar.e());
                    return c3.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzggx b(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgsm u2 = zzgsm.u2(zzgojVar.c().y2(), zzgyc.a());
                if (u2.b() == 0) {
                    zzggu c2 = zzggx.c();
                    c2.b(u2.a());
                    c2.a(12);
                    c2.c(16);
                    c2.d(f(zzgojVar.c().x2()));
                    return c2.e();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzh e2) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static /* synthetic */ zzgoi c(zzggp zzggpVar, zzgey zzgeyVar) {
        zzgsh s2 = zzgsj.s2();
        byte[] d2 = zzggpVar.e().d(zzgeyVar);
        s2.Y1(zzgxk.U(d2, 0, d2.length));
        return zzgoi.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgsj) s2.V1()).Q0(), zzgtk.SYMMETRIC, g(zzggpVar.d().d()), zzggpVar.f());
    }

    public static /* synthetic */ zzgoj d(zzggx zzggxVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgsk s22 = zzgsm.s2();
        s22.Y1(zzggxVar.b());
        s2.a2(((zzgsm) s22.V1()).Q0());
        s2.Y1(g(zzggxVar.d()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(b);
        zzgnjVar.h(c);
        zzgnjVar.g(d);
        zzgnjVar.f(e);
    }

    public static zzggv f(zzguq zzguqVar) throws GeneralSecurityException {
        int ordinal = zzguqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        int a2 = zzguqVar.a();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a2);
                    }
                } else {
                    return zzggv.d;
                }
            }
            return zzggv.c;
        }
        return zzggv.b;
    }

    public static zzguq g(zzggv zzggvVar) throws GeneralSecurityException {
        if (zzggv.b.equals(zzggvVar)) {
            return zzguq.TINK;
        }
        if (zzggv.c.equals(zzggvVar)) {
            return zzguq.CRUNCHY;
        }
        if (zzggv.d.equals(zzggvVar)) {
            return zzguq.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggvVar)));
    }
}
