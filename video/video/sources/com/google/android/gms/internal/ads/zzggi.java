package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzggi {
    public static final zzgob a = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzggg
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgvn.b((zzggf) zzgekVar);
        }
    }, zzggf.class, zzgee.class);
    public static final zzgel b = zzgmk.d("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgee.class, zzgtk.SYMMETRIC, zzgsa.x2());
    public static final zzgmy c = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzggh
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            zzggm zzggmVar = (zzggm) zzgexVar;
            int i = zzggi.d;
            if (zzggmVar.c() != 24) {
                zzggd zzggdVar = new zzggd(null);
                zzggdVar.c(zzggmVar);
                zzggdVar.a(num);
                zzggdVar.b(zzgwq.c(zzggmVar.c()));
                return zzggdVar.d();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };
    public static final /* synthetic */ int d = 0;

    public static void a(boolean z) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            int i = zzgjv.f;
            zzgjv.e(zzgnj.c());
            zzgng.a().c(a);
            zzgnf b2 = zzgnf.b();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzgiy.c);
            zzggj zzggjVar = new zzggj(null);
            zzggjVar.a(16);
            zzggjVar.b(16);
            zzggjVar.c(16);
            zzggk zzggkVar = zzggk.d;
            zzggjVar.d(zzggkVar);
            hashMap.put("AES128_EAX_RAW", zzggjVar.e());
            hashMap.put("AES256_EAX", zzgiy.d);
            zzggj zzggjVar2 = new zzggj(null);
            zzggjVar2.a(16);
            zzggjVar2.b(32);
            zzggjVar2.c(16);
            zzggjVar2.d(zzggkVar);
            hashMap.put("AES256_EAX_RAW", zzggjVar2.e());
            b2.d(Collections.unmodifiableMap(hashMap));
            zzgmz.b().c(c, zzggm.class);
            zzgma.c().d(b, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
