package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzghv {
    public static final zzgel a = zzgmk.d("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgee.class, zzgtk.SYMMETRIC, zzgum.w2());
    public static final zzgmy b = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzght
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            int i = zzghv.d;
            return zzgie.c((zzgij) zzgexVar, num);
        }
    };
    public static final zzgob c = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzghu
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            zzgie zzgieVar = (zzgie) zzgekVar;
            int i = zzghv.d;
            String d2 = zzgieVar.d().d();
            zzgfl b2 = zzgieVar.d().b();
            zzgee b3 = zzgev.a(d2).b();
            int i2 = zzghs.e;
            try {
                return zzgkx.c(new zzghs(zzgtq.w2(zzgez.b(b2), zzgyc.a()), b3), zzgieVar.b());
            } catch (zzgzh e) {
                throw new GeneralSecurityException(e);
            }
        }
    }, zzgie.class, zzgee.class);
    public static final /* synthetic */ int d = 0;

    public static void a(boolean z) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            int i = zzgio.f;
            zzgio.e(zzgnj.c());
            zzgmz.b().c(b, zzgij.class);
            zzgng.a().c(c);
            zzgma.c().d(a, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
