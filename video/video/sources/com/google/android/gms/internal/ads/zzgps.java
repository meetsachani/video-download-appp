package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgps {
    @InterfaceC10571ws1
    public Integer a = null;
    @InterfaceC10571ws1
    public Integer b = null;
    public zzgpt c = null;
    public zzgpu d = zzgpu.e;

    private zzgps() {
    }

    public final zzgps a(zzgpt zzgptVar) {
        this.c = zzgptVar;
        return this;
    }

    public final zzgps b(int i) throws GeneralSecurityException {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final zzgps c(int i) throws GeneralSecurityException {
        this.b = Integer.valueOf(i);
        return this;
    }

    public final zzgps d(zzgpu zzgpuVar) {
        this.d = zzgpuVar;
        return this;
    }

    public final zzgpw e() throws GeneralSecurityException {
        Integer num = this.a;
        if (num != null) {
            if (this.b != null) {
                if (this.c != null) {
                    if (this.d != null) {
                        if (num.intValue() >= 16) {
                            Integer num2 = this.b;
                            int intValue = num2.intValue();
                            zzgpt zzgptVar = this.c;
                            if (intValue >= 10) {
                                if (zzgptVar == zzgpt.b) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                                    }
                                } else if (zzgptVar == zzgpt.c) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                                    }
                                } else if (zzgptVar == zzgpt.d) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                                    }
                                } else if (zzgptVar == zzgpt.e) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                                    }
                                } else if (zzgptVar == zzgpt.f) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new zzgpw(this.a.intValue(), this.b.intValue(), this.d, this.c, null);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    public /* synthetic */ zzgps(zzgpv zzgpvVar) {
    }
}
