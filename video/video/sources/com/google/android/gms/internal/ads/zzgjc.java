package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgjc {
    public static final zzgmy a = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgja
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            return zzgiz.c((zzgje) zzgexVar, zzgwq.c(32), num);
        }
    };
    public static final zzgob b = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgjb
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgkz.b((zzgiz) zzgekVar);
        }
    }, zzgiz.class, zzgee.class);

    public static void a(boolean z) throws GeneralSecurityException {
        int i = zzgle.f;
        zzgle.e(zzgnj.c());
        zzgnf b2 = zzgnf.b();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzgiy.g);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzgiy.h);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzgiy.i);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzgiy.j);
        b2.d(Collections.unmodifiableMap(hashMap));
        zzgng.a().c(b);
        zzgmz.b().c(a, zzgje.class);
    }
}
