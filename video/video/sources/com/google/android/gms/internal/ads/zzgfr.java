package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgfr {
    @InterfaceC10571ws1
    public zzggc a = null;
    @InterfaceC10571ws1
    public zzgwq b = null;
    @InterfaceC10571ws1
    public zzgwq c = null;
    @InterfaceC10571ws1
    public Integer d = null;

    private zzgfr() {
    }

    public final zzgfr a(zzgwq zzgwqVar) {
        this.b = zzgwqVar;
        return this;
    }

    public final zzgfr b(zzgwq zzgwqVar) {
        this.c = zzgwqVar;
        return this;
    }

    public final zzgfr c(@InterfaceC10571ws1 Integer num) {
        this.d = num;
        return this;
    }

    public final zzgfr d(zzggc zzggcVar) {
        this.a = zzggcVar;
        return this;
    }

    public final zzgft e() throws GeneralSecurityException {
        zzgwp b;
        zzggc zzggcVar = this.a;
        if (zzggcVar != null) {
            zzgwq zzgwqVar = this.b;
            if (zzgwqVar != null && this.c != null) {
                if (zzggcVar.b() == zzgwqVar.a()) {
                    if (zzggcVar.c() == this.c.a()) {
                        if (this.a.a() && this.d == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.a.a() && this.d != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        if (this.a.h() == zzgga.d) {
                            b = zzgnk.a;
                        } else if (this.a.h() == zzgga.c) {
                            b = zzgnk.a(this.d.intValue());
                        } else if (this.a.h() == zzgga.b) {
                            b = zzgnk.b(this.d.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.a.h())));
                        }
                        return new zzgft(this.a, this.b, this.c, b, this.d, null);
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    public /* synthetic */ zzgfr(zzgfs zzgfsVar) {
    }
}
