package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
final class zzgkj extends ThreadLocal {
    @InterfaceC10571ws1
    public static final Cipher a() {
        boolean f;
        try {
            Cipher cipher = (Cipher) zzgvx.b.a("ChaCha20-Poly1305");
            f = zzgkk.f(cipher);
            if (!f) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    @InterfaceC10571ws1
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
