package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class zzgln implements zzgee {
    public static final ThreadLocal a = new zzglm();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzgll] */
    public static zzgee b(zzgha zzghaVar) throws GeneralSecurityException {
        return zzgkd.c(zzghaVar, new Object() { // from class: com.google.android.gms.internal.ads.zzgll
        });
    }

    public static /* synthetic */ Cipher c() {
        try {
            Cipher cipher = (Cipher) a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
