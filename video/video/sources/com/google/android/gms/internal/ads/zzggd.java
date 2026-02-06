package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzggd {
    @InterfaceC10571ws1
    public zzggm a = null;
    @InterfaceC10571ws1
    public zzgwq b = null;
    @InterfaceC10571ws1
    public Integer c = null;

    private zzggd() {
    }

    public final zzggd a(@InterfaceC10571ws1 Integer num) {
        this.c = num;
        return this;
    }

    public final zzggd b(zzgwq zzgwqVar) {
        this.b = zzgwqVar;
        return this;
    }

    public final zzggd c(zzggm zzggmVar) {
        this.a = zzggmVar;
        return this;
    }

    public final zzggf d() throws GeneralSecurityException {
        zzgwq zzgwqVar;
        zzgwp b;
        zzggm zzggmVar = this.a;
        if (zzggmVar != null && (zzgwqVar = this.b) != null) {
            if (zzggmVar.c() == zzgwqVar.a()) {
                if (zzggmVar.a() && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.a.a() && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.a.e() == zzggk.d) {
                    b = zzgnk.a;
                } else if (this.a.e() == zzggk.c) {
                    b = zzgnk.a(this.c.intValue());
                } else if (this.a.e() == zzggk.b) {
                    b = zzgnk.b(this.c.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.a.e())));
                }
                return new zzggf(this.a, this.b, b, this.c, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzggd(zzgge zzggeVar) {
    }
}
