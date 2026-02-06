package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgpr {
    public static final zzgob a = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgpn
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return new zzgqs((zzgpm) zzgekVar);
        }
    }, zzgpm.class, zzgpg.class);
    public static final zzgob b = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgpo
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgwm.b((zzgpm) zzgekVar);
        }
    }, zzgpm.class, zzgew.class);
    public static final zzgel c = zzgmk.d("type.googleapis.com/google.crypto.tink.HmacKey", zzgew.class, zzgtk.SYMMETRIC, zzgtc.y2());
    public static final zzgna d = new zzgna() { // from class: com.google.android.gms.internal.ads.zzgpp
    };
    public static final zzgmy e = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgpq
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            zzgpw zzgpwVar = (zzgpw) zzgexVar;
            int i = zzgpr.g;
            zzgpk zzgpkVar = new zzgpk(null);
            zzgpkVar.c(zzgpwVar);
            zzgpkVar.b(zzgwq.c(zzgpwVar.c()));
            zzgpkVar.a(num);
            return zzgpkVar.d();
        }
    };
    public static final int f = 2;
    public static final /* synthetic */ int g = 0;

    public static void a(boolean z) throws GeneralSecurityException {
        int i = f;
        if (zzglr.a(i)) {
            int i2 = zzgqx.h;
            zzgqx.e(zzgnj.c());
            zzgng.a().c(a);
            zzgng.a().c(b);
            zzgnf b2 = zzgnf.b();
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", zzgqk.a);
            zzgps zzgpsVar = new zzgps(null);
            zzgpsVar.b(32);
            zzgpsVar.c(16);
            zzgpu zzgpuVar = zzgpu.e;
            zzgpsVar.d(zzgpuVar);
            zzgpt zzgptVar = zzgpt.d;
            zzgpsVar.a(zzgptVar);
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgpsVar.e());
            zzgps zzgpsVar2 = new zzgps(null);
            zzgpsVar2.b(32);
            zzgpsVar2.c(32);
            zzgpu zzgpuVar2 = zzgpu.b;
            zzgpsVar2.d(zzgpuVar2);
            zzgpsVar2.a(zzgptVar);
            hashMap.put("HMAC_SHA256_256BITTAG", zzgpsVar2.e());
            zzgps zzgpsVar3 = new zzgps(null);
            zzgpsVar3.b(32);
            zzgpsVar3.c(32);
            zzgpsVar3.d(zzgpuVar);
            zzgpsVar3.a(zzgptVar);
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgpsVar3.e());
            zzgps zzgpsVar4 = new zzgps(null);
            zzgpsVar4.b(64);
            zzgpsVar4.c(16);
            zzgpsVar4.d(zzgpuVar2);
            zzgpt zzgptVar2 = zzgpt.f;
            zzgpsVar4.a(zzgptVar2);
            hashMap.put("HMAC_SHA512_128BITTAG", zzgpsVar4.e());
            zzgps zzgpsVar5 = new zzgps(null);
            zzgpsVar5.b(64);
            zzgpsVar5.c(16);
            zzgpsVar5.d(zzgpuVar);
            zzgpsVar5.a(zzgptVar2);
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgpsVar5.e());
            zzgps zzgpsVar6 = new zzgps(null);
            zzgpsVar6.b(64);
            zzgpsVar6.c(32);
            zzgpsVar6.d(zzgpuVar2);
            zzgpsVar6.a(zzgptVar2);
            hashMap.put("HMAC_SHA512_256BITTAG", zzgpsVar6.e());
            zzgps zzgpsVar7 = new zzgps(null);
            zzgpsVar7.b(64);
            zzgpsVar7.c(32);
            zzgpsVar7.d(zzgpuVar);
            zzgpsVar7.a(zzgptVar2);
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgpsVar7.e());
            hashMap.put("HMAC_SHA512_512BITTAG", zzgqk.b);
            zzgps zzgpsVar8 = new zzgps(null);
            zzgpsVar8.b(64);
            zzgpsVar8.c(64);
            zzgpsVar8.d(zzgpuVar);
            zzgpsVar8.a(zzgptVar2);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgpsVar8.e());
            b2.d(Collections.unmodifiableMap(hashMap));
            zzgmz.b().c(e, zzgpw.class);
            zzgnb.a().b(d, zzgpw.class);
            zzgma.c().f(c, i, true);
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
