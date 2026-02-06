package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
final class zzglm extends ThreadLocal {
    @InterfaceC10571ws1
    public static final Cipher a() {
        try {
            Cipher cipher = (Cipher) zzgvx.b.a("AES/GCM-SIV/NoPadding");
            if (!zzgkd.b(cipher)) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    @InterfaceC10571ws1
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
