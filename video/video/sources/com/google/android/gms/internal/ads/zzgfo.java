package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzgfo implements zzgee {
    public final zzgnx a;

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzgfn zzgfnVar : this.a.a(bArr)) {
            try {
                byte[] a = zzgfnVar.a.a(bArr, bArr2);
                int length = bArr.length;
                return a;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
