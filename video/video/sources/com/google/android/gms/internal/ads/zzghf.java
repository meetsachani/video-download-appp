package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzghf {
    @InterfaceC10571ws1
    public Integer a = null;
    public zzghg b = zzghg.d;

    private zzghf() {
    }

    public final zzghf a(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final zzghf b(zzghg zzghgVar) {
        this.b = zzghgVar;
        return this;
    }

    public final zzghi c() throws GeneralSecurityException {
        Integer num = this.a;
        if (num != null) {
            if (this.b != null) {
                return new zzghi(num.intValue(), this.b, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzghf(zzghh zzghhVar) {
    }
}
