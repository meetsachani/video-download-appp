package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzggy {
    @InterfaceC10571ws1
    public zzghi a = null;
    @InterfaceC10571ws1
    public zzgwq b = null;
    @InterfaceC10571ws1
    public Integer c = null;

    private zzggy() {
    }

    public final zzggy a(@InterfaceC10571ws1 Integer num) {
        this.c = num;
        return this;
    }

    public final zzggy b(zzgwq zzgwqVar) {
        this.b = zzgwqVar;
        return this;
    }

    public final zzggy c(zzghi zzghiVar) {
        this.a = zzghiVar;
        return this;
    }

    public final zzgha d() throws GeneralSecurityException {
        zzgwq zzgwqVar;
        zzgwp b;
        zzghi zzghiVar = this.a;
        if (zzghiVar != null && (zzgwqVar = this.b) != null) {
            if (zzghiVar.b() == zzgwqVar.a()) {
                if (zzghiVar.a() && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.a.a() && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.a.d() == zzghg.d) {
                    b = zzgnk.a;
                } else if (this.a.d() == zzghg.c) {
                    b = zzgnk.a(this.c.intValue());
                } else if (this.a.d() == zzghg.b) {
                    b = zzgnk.b(this.c.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.a.d())));
                }
                return new zzgha(this.a, this.b, b, this.c, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzggy(zzggz zzggzVar) {
    }
}
