package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgov {
    @InterfaceC10571ws1
    public zzgpf a = null;
    @InterfaceC10571ws1
    public zzgwq b = null;
    @InterfaceC10571ws1
    public Integer c = null;

    private zzgov() {
    }

    public final zzgov a(zzgwq zzgwqVar) throws GeneralSecurityException {
        this.b = zzgwqVar;
        return this;
    }

    public final zzgov b(@InterfaceC10571ws1 Integer num) {
        this.c = num;
        return this;
    }

    public final zzgov c(zzgpf zzgpfVar) {
        this.a = zzgpfVar;
        return this;
    }

    public final zzgox d() throws GeneralSecurityException {
        zzgwq zzgwqVar;
        zzgwp a;
        zzgpf zzgpfVar = this.a;
        if (zzgpfVar != null && (zzgwqVar = this.b) != null) {
            if (zzgpfVar.c() == zzgwqVar.a()) {
                if (zzgpfVar.a() && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.a.a() && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.a.f() == zzgpd.e) {
                    a = zzgnk.a;
                } else if (this.a.f() != zzgpd.d && this.a.f() != zzgpd.c) {
                    if (this.a.f() == zzgpd.b) {
                        a = zzgnk.b(this.c.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.a.f())));
                    }
                } else {
                    a = zzgnk.a(this.c.intValue());
                }
                return new zzgox(this.a, this.b, a, this.c, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgov(zzgow zzgowVar) {
    }
}
