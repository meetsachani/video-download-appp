package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzghm {
    public static final zzgob a = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzghk
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            zzghj zzghjVar = (zzghj) zzgekVar;
            int i = zzghm.d;
            if (zzgkk.e()) {
                return zzgkk.b(zzghjVar);
            }
            return zzgvq.b(zzghjVar);
        }
    }, zzghj.class, zzgee.class);
    public static final zzgmy b = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzghl
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            int i = zzghm.d;
            return zzghj.c(((zzgho) zzgexVar).b(), zzgwq.c(32), num);
        }
    };
    public static final zzgel c = zzgmk.d("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgee.class, zzgtk.SYMMETRIC, zzgsv.w2());
    public static final /* synthetic */ int d = 0;

    public static void a(boolean z) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            int i = zzgkp.f;
            zzgkp.e(zzgnj.c());
            zzgng.a().c(a);
            zzgmz.b().c(b, zzgho.class);
            zzgnf b2 = zzgnf.b();
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", zzgho.c(zzghn.b));
            hashMap.put("CHACHA20_POLY1305_RAW", zzgho.c(zzghn.d));
            b2.d(Collections.unmodifiableMap(hashMap));
            zzgma.c().d(c, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
