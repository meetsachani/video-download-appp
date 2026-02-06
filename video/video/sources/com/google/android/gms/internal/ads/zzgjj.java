package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgjj {
    public static final zzgob a = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgjg
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            zzgjf zzgjfVar = (zzgjf) zzgekVar;
            int i = zzgjj.e;
            if (zzglf.c()) {
                return zzglf.b(zzgjfVar);
            }
            return zzgwo.b(zzgjfVar);
        }
    }, zzgjf.class, zzgee.class);
    public static final zzgel b = zzgmk.d("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgee.class, zzgtk.SYMMETRIC, zzgvf.w2());
    public static final zzgna c = new zzgna() { // from class: com.google.android.gms.internal.ads.zzgjh
    };
    public static final zzgmy d = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgji
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            int i = zzgjj.e;
            return zzgjf.c(((zzgjl) zzgexVar).b(), zzgwq.c(32), num);
        }
    };
    public static final /* synthetic */ int e = 0;

    public static void a(boolean z) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            int i = zzglk.f;
            zzglk.e(zzgnj.c());
            zzgng.a().c(a);
            zzgnf b2 = zzgnf.b();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzgjl.c(zzgjk.b));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzgjl.c(zzgjk.d));
            b2.d(Collections.unmodifiableMap(hashMap));
            zzgmz.b().c(d, zzgjl.class);
            zzgnb.a().b(c, zzgjl.class);
            zzgma.c().d(b, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
