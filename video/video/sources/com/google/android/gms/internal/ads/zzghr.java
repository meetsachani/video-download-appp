package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzghr {
    public static final zzgob a = zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzghp
        @Override // com.google.android.gms.internal.ads.zzgnz
        public final Object a(zzgek zzgekVar) {
            zzghw zzghwVar = (zzghw) zzgekVar;
            int i = zzghr.d;
            return zzgkx.c(zzgev.a(zzghwVar.d().d()).b(), zzghwVar.b());
        }
    }, zzghw.class, zzgee.class);
    public static final zzgel b = zzgmk.d("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgee.class, zzgtk.REMOTE, zzgug.w2());
    public static final zzgmy c = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzghq
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            int i = zzghr.d;
            return zzghw.c((zzghy) zzgexVar, num);
        }
    };
    public static final /* synthetic */ int d = 0;

    public static void a(boolean z) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            int i = zzgid.f;
            zzgid.e(zzgnj.c());
            zzgng.a().c(a);
            zzgmz.b().c(c, zzghy.class);
            zzgma.c().d(b, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
