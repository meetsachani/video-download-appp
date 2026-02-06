package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzggn {
    @InterfaceC10571ws1
    public zzggx a = null;
    @InterfaceC10571ws1
    public zzgwq b = null;
    @InterfaceC10571ws1
    public Integer c = null;

    private zzggn() {
    }

    public final zzggn a(@InterfaceC10571ws1 Integer num) {
        this.c = num;
        return this;
    }

    public final zzggn b(zzgwq zzgwqVar) {
        this.b = zzgwqVar;
        return this;
    }

    public final zzggn c(zzggx zzggxVar) {
        this.a = zzggxVar;
        return this;
    }

    public final zzggp d() throws GeneralSecurityException {
        zzgwq zzgwqVar;
        zzgwp b;
        zzggx zzggxVar = this.a;
        if (zzggxVar != null && (zzgwqVar = this.b) != null) {
            if (zzggxVar.b() == zzgwqVar.a()) {
                if (zzggxVar.a() && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.a.a() && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.a.d() == zzggv.d) {
                    b = zzgnk.a;
                } else if (this.a.d() == zzggv.c) {
                    b = zzgnk.a(this.c.intValue());
                } else if (this.a.d() == zzggv.b) {
                    b = zzgnk.b(this.c.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.a.d())));
                }
                return new zzggp(this.a, this.b, b, this.c, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzggn(zzggo zzggoVar) {
    }
}
