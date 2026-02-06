package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgpb {
    public static final zzgmy a = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgoy
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            return zzgpb.b((zzgpf) zzgexVar, num);
        }
    };
    public static final zzgob b = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgoz
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgpb.c((zzgox) zzgekVar);
        }
    }, zzgox.class, zzgpg.class);
    public static final zzgob c = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgpa
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            return zzgpb.a((zzgox) zzgekVar);
        }
    }, zzgox.class, zzgew.class);
    public static final zzgel d = zzgmk.d("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgew.class, zzgtk.SYMMETRIC, zzgrc.x2());

    public static /* synthetic */ zzgew a(zzgox zzgoxVar) {
        e(zzgoxVar.d());
        return zzgwm.a(zzgoxVar);
    }

    public static /* synthetic */ zzgox b(zzgpf zzgpfVar, Integer num) {
        e(zzgpfVar);
        zzgov zzgovVar = new zzgov(null);
        zzgovVar.c(zzgpfVar);
        zzgovVar.a(zzgwq.c(zzgpfVar.c()));
        zzgovVar.b(num);
        return zzgovVar.d();
    }

    public static /* synthetic */ zzgpg c(zzgox zzgoxVar) {
        e(zzgoxVar.d());
        return new zzgqr(zzgoxVar);
    }

    public static void d(boolean z) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            int i = zzgqp.f;
            zzgqp.e(zzgnj.c());
            zzgmz.b().c(a, zzgpf.class);
            zzgng.a().c(b);
            zzgng.a().c(c);
            zzgnf b2 = zzgnf.b();
            HashMap hashMap = new HashMap();
            zzgpf zzgpfVar = zzgqk.c;
            hashMap.put("AES_CMAC", zzgpfVar);
            hashMap.put("AES256_CMAC", zzgpfVar);
            zzgpc zzgpcVar = new zzgpc(null);
            zzgpcVar.a(32);
            zzgpcVar.b(16);
            zzgpcVar.c(zzgpd.e);
            hashMap.put("AES256_CMAC_RAW", zzgpcVar.d());
            b2.d(Collections.unmodifiableMap(hashMap));
            zzgma.c().d(d, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    public static void e(zzgpf zzgpfVar) throws GeneralSecurityException {
        if (zzgpfVar.c() == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
