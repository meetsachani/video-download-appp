package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgfy {
    @InterfaceC10571ws1
    public Integer a = null;
    @InterfaceC10571ws1
    public Integer b = null;
    @InterfaceC10571ws1
    public Integer c = null;
    @InterfaceC10571ws1
    public Integer d = null;
    public zzgfz e = null;
    public zzgga f = zzgga.d;

    private zzgfy() {
    }

    public final zzgfy a(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final zzgfy b(zzgfz zzgfzVar) {
        this.e = zzgfzVar;
        return this;
    }

    public final zzgfy c(int i) throws GeneralSecurityException {
        if (i >= 16) {
            this.b = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
    }

    public final zzgfy d(int i) throws GeneralSecurityException {
        if (i >= 12 && i <= 16) {
            this.c = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
    }

    public final zzgfy e(int i) throws GeneralSecurityException {
        if (i >= 10) {
            this.d = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
    }

    public final zzgfy f(zzgga zzggaVar) {
        this.f = zzggaVar;
        return this;
    }

    public final zzggc g() throws GeneralSecurityException {
        if (this.a != null) {
            if (this.b != null) {
                if (this.c != null) {
                    Integer num = this.d;
                    if (num != null) {
                        if (this.e != null) {
                            if (this.f != null) {
                                int intValue = num.intValue();
                                zzgfz zzgfzVar = this.e;
                                if (zzgfzVar == zzgfz.b) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                    }
                                } else if (zzgfzVar == zzgfz.c) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                    }
                                } else if (zzgfzVar == zzgfz.d) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                    }
                                } else if (zzgfzVar == zzgfz.e) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                    }
                                } else if (zzgfzVar == zzgfz.f) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                }
                                return new zzggc(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.f, this.e, null);
                            }
                            throw new GeneralSecurityException("variant is not set");
                        }
                        throw new GeneralSecurityException("hash type is not set");
                    }
                    throw new GeneralSecurityException("tag size is not set");
                }
                throw new GeneralSecurityException("iv size is not set");
            }
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        throw new GeneralSecurityException("AES key size is not set");
    }

    public /* synthetic */ zzgfy(zzggb zzggbVar) {
    }
}
