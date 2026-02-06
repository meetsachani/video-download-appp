package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzggt {
    public static final zzgob a = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzggq
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgvo.b((zzggp) zzgekVar);
        }
    }, zzggp.class, zzgee.class);
    public static final zzgel b = zzgmk.d("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgee.class, zzgtk.SYMMETRIC, zzgsj.w2());
    public static final zzgna c = new zzgna() { // from class: com.google.android.gms.internal.ads.zzggr
    };
    public static final zzgmy d = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzggs
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            zzggx zzggxVar = (zzggx) zzgexVar;
            int i = zzggt.f;
            if (zzggxVar.b() != 24) {
                zzggn zzggnVar = new zzggn(null);
                zzggnVar.c(zzggxVar);
                zzggnVar.a(num);
                zzggnVar.b(zzgwq.c(zzggxVar.b()));
                return zzggnVar.d();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };
    public static final int e = 2;
    public static final /* synthetic */ int f = 0;

    public static void a(boolean z) throws GeneralSecurityException {
        int i = e;
        if (zzglr.a(i)) {
            int i2 = zzgkc.f;
            zzgkc.e(zzgnj.c());
            zzgng.a().c(a);
            zzgnf b2 = zzgnf.b();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzgiy.a);
            zzggu zzgguVar = new zzggu(null);
            zzgguVar.a(12);
            zzgguVar.b(16);
            zzgguVar.c(16);
            zzggv zzggvVar = zzggv.d;
            zzgguVar.d(zzggvVar);
            hashMap.put("AES128_GCM_RAW", zzgguVar.e());
            hashMap.put("AES256_GCM", zzgiy.b);
            zzggu zzgguVar2 = new zzggu(null);
            zzgguVar2.a(12);
            zzgguVar2.b(32);
            zzgguVar2.c(16);
            zzgguVar2.d(zzggvVar);
            hashMap.put("AES256_GCM_RAW", zzgguVar2.e());
            b2.d(Collections.unmodifiableMap(hashMap));
            zzgnb.a().b(c, zzggx.class);
            zzgmz.b().c(d, zzggx.class);
            zzgma.c().f(b, i, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
