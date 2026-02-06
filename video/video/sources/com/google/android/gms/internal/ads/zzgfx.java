package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgfx {
    public static final zzgob a = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgfu
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgvr.b((zzgft) zzgekVar);
        }
    }, zzgft.class, zzgee.class);
    public static final zzgel b = zzgmk.d("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgee.class, zzgtk.SYMMETRIC, zzgrl.x2());
    public static final zzgna c = new zzgna() { // from class: com.google.android.gms.internal.ads.zzgfv
    };
    public static final zzgmy d = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgfw
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            zzggc zzggcVar = (zzggc) zzgexVar;
            int i = zzgfx.f;
            if (zzggcVar.b() != 16 && zzggcVar.b() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            zzgfr zzgfrVar = new zzgfr(null);
            zzgfrVar.d(zzggcVar);
            zzgfrVar.c(num);
            zzgfrVar.a(zzgwq.c(zzggcVar.b()));
            zzgfrVar.b(zzgwq.c(zzggcVar.c()));
            return zzgfrVar.e();
        }
    };
    public static final int e = 2;
    public static final /* synthetic */ int f = 0;

    public static void a(boolean z) throws GeneralSecurityException {
        int i = e;
        if (zzglr.a(i)) {
            int i2 = zzgjq.f;
            zzgjq.e(zzgnj.c());
            zzgng.a().c(a);
            zzgnf b2 = zzgnf.b();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", zzgiy.e);
            zzgfy zzgfyVar = new zzgfy(null);
            zzgfyVar.a(16);
            zzgfyVar.c(32);
            zzgfyVar.e(16);
            zzgfyVar.d(16);
            zzgfz zzgfzVar = zzgfz.d;
            zzgfyVar.b(zzgfzVar);
            zzgga zzggaVar = zzgga.d;
            zzgfyVar.f(zzggaVar);
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzgfyVar.g());
            hashMap.put("AES256_CTR_HMAC_SHA256", zzgiy.f);
            zzgfy zzgfyVar2 = new zzgfy(null);
            zzgfyVar2.a(32);
            zzgfyVar2.c(32);
            zzgfyVar2.e(32);
            zzgfyVar2.d(16);
            zzgfyVar2.b(zzgfzVar);
            zzgfyVar2.f(zzggaVar);
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzgfyVar2.g());
            b2.d(Collections.unmodifiableMap(hashMap));
            zzgnb.a().b(c, zzggc.class);
            zzgmz.b().c(d, zzggc.class);
            zzgma.c().f(b, i, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
