package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgqx {
    public static final zzgwp a;
    public static final zzglw b;
    public static final zzglw c;
    public static final zzgns d;
    public static final zzgno e;
    public static final zzgmi f;
    public static final zzgme g;
    public static final /* synthetic */ int h = 0;

    static {
        zzgwp b2 = zzgou.b("type.googleapis.com/google.crypto.tink.HmacKey");
        a = b2;
        zzglu a2 = zzglw.a();
        a2.a(zzguq.RAW, zzgpu.e);
        a2.a(zzguq.TINK, zzgpu.b);
        a2.a(zzguq.LEGACY, zzgpu.d);
        a2.a(zzguq.CRUNCHY, zzgpu.c);
        b = a2.b();
        zzglu a3 = zzglw.a();
        a3.a(zzgsz.SHA1, zzgpt.b);
        a3.a(zzgsz.SHA224, zzgpt.c);
        a3.a(zzgsz.SHA256, zzgpt.d);
        a3.a(zzgsz.SHA384, zzgpt.e);
        a3.a(zzgsz.SHA512, zzgpt.f);
        c = a3.b();
        d = zzgns.b(new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgqt
            @Override // com.google.android.gms.internal.ads.zzgnq
            public final zzgom a(zzgex zzgexVar) {
                return zzgqx.b((zzgpw) zzgexVar);
            }
        }, zzgpw.class, zzgoj.class);
        e = zzgno.b(new zzgnm() { // from class: com.google.android.gms.internal.ads.zzgqu
            @Override // com.google.android.gms.internal.ads.zzgnm
            public final zzgex a(zzgom zzgomVar) {
                return zzgqx.d((zzgoj) zzgomVar);
            }
        }, b2, zzgoj.class);
        f = zzgmi.b(new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgqv
            @Override // com.google.android.gms.internal.ads.zzgmg
            public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                return zzgqx.a((zzgpm) zzgekVar, zzgeyVar);
            }
        }, zzgpm.class, zzgoi.class);
        g = zzgme.b(new zzgmc() { // from class: com.google.android.gms.internal.ads.zzgqw
            @Override // com.google.android.gms.internal.ads.zzgmc
            public final zzgek a(zzgom zzgomVar, zzgey zzgeyVar) {
                return zzgqx.c((zzgoi) zzgomVar, zzgeyVar);
            }
        }, b2, zzgoi.class);
    }

    public static /* synthetic */ zzgoi a(zzgpm zzgpmVar, zzgey zzgeyVar) {
        zzgta s2 = zzgtc.s2();
        s2.Z1(f(zzgpmVar.d()));
        byte[] d2 = zzgpmVar.e().d(zzgeyVar);
        s2.Y1(zzgxk.U(d2, 0, d2.length));
        return zzgoi.a("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgtc) s2.V1()).Q0(), zzgtk.SYMMETRIC, (zzguq) b.b(zzgpmVar.d().g()), zzgpmVar.f());
    }

    public static /* synthetic */ zzgoj b(zzgpw zzgpwVar) {
        zzgto s2 = zzgtq.s2();
        s2.Z1("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgtd s22 = zzgtf.s2();
        s22.Z1(f(zzgpwVar));
        s22.Y1(zzgpwVar.c());
        s2.a2(((zzgtf) s22.V1()).Q0());
        s2.Y1((zzguq) b.b(zzgpwVar.g()));
        return zzgoj.b((zzgtq) s2.V1());
    }

    public static /* synthetic */ zzgpm c(zzgoi zzgoiVar, zzgey zzgeyVar) {
        if (zzgoiVar.g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgtc v2 = zzgtc.v2(zzgoiVar.d(), zzgyc.a());
                if (v2.a() == 0) {
                    zzgps e2 = zzgpw.e();
                    e2.b(v2.x2().i());
                    e2.c(v2.w2().a());
                    e2.a((zzgpt) c.c(v2.w2().s2()));
                    e2.d((zzgpu) b.c(zzgoiVar.c()));
                    zzgpw e3 = e2.e();
                    zzgpk c2 = zzgpm.c();
                    c2.c(e3);
                    c2.b(zzgwq.b(v2.x2().d(), zzgeyVar));
                    c2.a(zzgoiVar.e());
                    return c2.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzh | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgpw d(zzgoj zzgojVar) {
        if (zzgojVar.c().z2().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgtf v2 = zzgtf.v2(zzgojVar.c().y2(), zzgyc.a());
                if (v2.b() == 0) {
                    zzgps e2 = zzgpw.e();
                    e2.b(v2.a());
                    e2.c(v2.w2().a());
                    e2.a((zzgpt) c.c(v2.w2().s2()));
                    e2.d((zzgpu) b.c(zzgojVar.c().x2()));
                    return e2.e();
                }
                int b2 = v2.b();
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + b2);
            } catch (zzgzh e3) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e3);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgojVar.c().z2())));
    }

    public static void e(zzgnj zzgnjVar) throws GeneralSecurityException {
        zzgnjVar.i(d);
        zzgnjVar.h(e);
        zzgnjVar.g(f);
        zzgnjVar.f(g);
    }

    public static zzgti f(zzgpw zzgpwVar) throws GeneralSecurityException {
        zzgtg t2 = zzgti.t2();
        t2.Z1(zzgpwVar.b());
        t2.Y1((zzgsz) c.b(zzgpwVar.f()));
        return (zzgti) t2.V1();
    }
}
