package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzggu {
    @InterfaceC10571ws1
    public Integer a = null;
    @InterfaceC10571ws1
    public Integer b = null;
    @InterfaceC10571ws1
    public Integer c = null;
    public zzggv d = zzggv.d;

    private zzggu() {
    }

    public final zzggu a(int i) throws GeneralSecurityException {
        this.b = 12;
        return this;
    }

    public final zzggu b(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final zzggu c(int i) throws GeneralSecurityException {
        this.c = 16;
        return this;
    }

    public final zzggu d(zzggv zzggvVar) {
        this.d = zzggvVar;
        return this;
    }

    public final zzggx e() throws GeneralSecurityException {
        Integer num = this.a;
        if (num != null) {
            if (this.d != null) {
                if (this.b != null) {
                    if (this.c != null) {
                        int intValue = num.intValue();
                        this.b.getClass();
                        this.c.getClass();
                        return new zzggx(intValue, 12, 16, this.d, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzggu(zzggw zzggwVar) {
    }
}
