package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgfj {
    public static final zzglz a = b();
    public static final /* synthetic */ int b = 0;

    public static zzgei a() throws GeneralSecurityException {
        if (!zzgls.b()) {
            return a;
        }
        throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
    }

    public static zzglz b() {
        try {
            zzgod a2 = zzgog.a();
            zzgfq.e(a2);
            a2.a(zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgfc
                @Override // com.google.android.gms.internal.ads.zzgnz
                public final Object a(zzgek zzgekVar) {
                    return zzgvr.b((zzgft) zzgekVar);
                }
            }, zzgft.class, zzgee.class));
            a2.a(zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgfd
                @Override // com.google.android.gms.internal.ads.zzgnz
                public final Object a(zzgek zzgekVar) {
                    return zzgvo.b((zzggp) zzgekVar);
                }
            }, zzggp.class, zzgee.class));
            a2.a(zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgfe
                @Override // com.google.android.gms.internal.ads.zzgnz
                public final Object a(zzgek zzgekVar) {
                    return zzgln.b((zzgha) zzgekVar);
                }
            }, zzgha.class, zzgee.class));
            a2.a(zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgff
                @Override // com.google.android.gms.internal.ads.zzgnz
                public final Object a(zzgek zzgekVar) {
                    return zzgvn.b((zzggf) zzgekVar);
                }
            }, zzggf.class, zzgee.class));
            a2.a(zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgfg
                @Override // com.google.android.gms.internal.ads.zzgnz
                public final Object a(zzgek zzgekVar) {
                    zzghj zzghjVar = (zzghj) zzgekVar;
                    int i = zzgfj.b;
                    if (zzgkk.e()) {
                        return zzgkk.b(zzghjVar);
                    }
                    return zzgvq.b(zzghjVar);
                }
            }, zzghj.class, zzgee.class));
            a2.a(zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgfh
                @Override // com.google.android.gms.internal.ads.zzgnz
                public final Object a(zzgek zzgekVar) {
                    zzgjf zzgjfVar = (zzgjf) zzgekVar;
                    int i = zzgfj.b;
                    if (zzglf.c()) {
                        return zzglf.b(zzgjfVar);
                    }
                    return zzgwo.b(zzgjfVar);
                }
            }, zzgjf.class, zzgee.class));
            a2.a(zzgob.b(new zzgnz() { // from class: com.google.android.gms.internal.ads.zzgfi
                @Override // com.google.android.gms.internal.ads.zzgnz
                public final Object a(zzgek zzgekVar) {
                    return zzgkz.b((zzgiz) zzgekVar);
                }
            }, zzgiz.class, zzgee.class));
            return zzglz.b(a2.c());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
