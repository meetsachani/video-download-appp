package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzghe {
    public static final zzgob a = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzghb
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgln.b((zzgha) zzgekVar);
        }
    }, zzgha.class, zzgee.class);
    public static final zzgmy b = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzghc
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            zzghi zzghiVar = (zzghi) zzgexVar;
            int i = zzghe.e;
            zzggy zzggyVar = new zzggy(null);
            zzggyVar.c(zzghiVar);
            zzggyVar.a(num);
            zzggyVar.b(zzgwq.c(zzghiVar.b()));
            return zzggyVar.d();
        }
    };
    public static final zzgna c = new zzgna() { // from class: com.google.android.gms.internal.ads.zzghd
    };
    public static final zzgel d = zzgmk.d("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgee.class, zzgtk.SYMMETRIC, zzgsp.w2());
    public static final /* synthetic */ int e = 0;

    public static void a(boolean z) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            int i = zzgki.f;
            zzgki.e(zzgnj.c());
            zzgnf b2 = zzgnf.b();
            HashMap hashMap = new HashMap();
            zzghf zzghfVar = new zzghf(null);
            zzghfVar.a(16);
            zzghg zzghgVar = zzghg.b;
            zzghfVar.b(zzghgVar);
            hashMap.put("AES128_GCM_SIV", zzghfVar.c());
            zzghf zzghfVar2 = new zzghf(null);
            zzghfVar2.a(16);
            zzghg zzghgVar2 = zzghg.d;
            zzghfVar2.b(zzghgVar2);
            hashMap.put("AES128_GCM_SIV_RAW", zzghfVar2.c());
            zzghf zzghfVar3 = new zzghf(null);
            zzghfVar3.a(32);
            zzghfVar3.b(zzghgVar);
            hashMap.put("AES256_GCM_SIV", zzghfVar3.c());
            zzghf zzghfVar4 = new zzghf(null);
            zzghfVar4.a(32);
            zzghfVar4.b(zzghgVar2);
            hashMap.put("AES256_GCM_SIV_RAW", zzghfVar4.c());
            b2.d(Collections.unmodifiableMap(hashMap));
            zzgnb.a().b(c, zzghi.class);
            zzgmz.b().c(b, zzghi.class);
            zzgng.a().c(a);
            zzgma.c().d(d, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
    }
}
