package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgpk {
    @InterfaceC10571ws1
    public zzgpw a = null;
    @InterfaceC10571ws1
    public zzgwq b = null;
    @InterfaceC10571ws1
    public Integer c = null;

    private zzgpk() {
    }

    public final zzgpk a(@InterfaceC10571ws1 Integer num) {
        this.c = num;
        return this;
    }

    public final zzgpk b(zzgwq zzgwqVar) {
        this.b = zzgwqVar;
        return this;
    }

    public final zzgpk c(zzgpw zzgpwVar) {
        this.a = zzgpwVar;
        return this;
    }

    public final zzgpm d() throws GeneralSecurityException {
        zzgwq zzgwqVar;
        zzgwp a;
        zzgpw zzgpwVar = this.a;
        if (zzgpwVar != null && (zzgwqVar = this.b) != null) {
            if (zzgpwVar.c() == zzgwqVar.a()) {
                if (zzgpwVar.a() && this.c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.a.a() && this.c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.a.g() == zzgpu.e) {
                    a = zzgnk.a;
                } else if (this.a.g() != zzgpu.d && this.a.g() != zzgpu.c) {
                    if (this.a.g() == zzgpu.b) {
                        a = zzgnk.b(this.c.intValue());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.a.g())));
                    }
                } else {
                    a = zzgnk.a(this.c.intValue());
                }
                return new zzgpm(this.a, this.b, a, this.c, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgpk(zzgpl zzgplVar) {
    }
}
