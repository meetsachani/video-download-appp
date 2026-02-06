package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzggj {
    @InterfaceC10571ws1
    public Integer a = null;
    @InterfaceC10571ws1
    public Integer b = null;
    @InterfaceC10571ws1
    public Integer c = null;
    public zzggk d = zzggk.d;

    private zzggj() {
    }

    public final zzggj a(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
        return this;
    }

    public final zzggj b(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final zzggj c(int i) throws GeneralSecurityException {
        this.c = 16;
        return this;
    }

    public final zzggj d(zzggk zzggkVar) {
        this.d = zzggkVar;
        return this;
    }

    public final zzggm e() throws GeneralSecurityException {
        Integer num = this.a;
        if (num != null) {
            if (this.b != null) {
                if (this.d != null) {
                    if (this.c != null) {
                        int intValue = num.intValue();
                        int intValue2 = this.b.intValue();
                        this.c.getClass();
                        return new zzggm(intValue, intValue2, 16, this.d, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("IV size is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzggj(zzggl zzgglVar) {
    }
}
