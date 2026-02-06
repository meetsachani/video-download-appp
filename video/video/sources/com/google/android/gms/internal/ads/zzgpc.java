package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgpc {
    @InterfaceC10571ws1
    public Integer a = null;
    @InterfaceC10571ws1
    public Integer b = null;
    public zzgpd c = zzgpd.e;

    private zzgpc() {
    }

    public final zzgpc a(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final zzgpc b(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.b = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    public final zzgpc c(zzgpd zzgpdVar) {
        this.c = zzgpdVar;
        return this;
    }

    public final zzgpf d() throws GeneralSecurityException {
        Integer num = this.a;
        if (num != null) {
            if (this.b != null) {
                if (this.c != null) {
                    return new zzgpf(num.intValue(), this.b.intValue(), this.c, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    public /* synthetic */ zzgpc(zzgpe zzgpeVar) {
    }
}
