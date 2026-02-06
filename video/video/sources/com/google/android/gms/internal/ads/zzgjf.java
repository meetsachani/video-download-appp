package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgjf extends zzgfk {
    public final zzgjl a;
    public final zzgwq b;
    public final zzgwp c;
    @InterfaceC10571ws1
    public final Integer d;

    public zzgjf(zzgjl zzgjlVar, zzgwq zzgwqVar, zzgwp zzgwpVar, @InterfaceC10571ws1 Integer num) {
        this.a = zzgjlVar;
        this.b = zzgwqVar;
        this.c = zzgwpVar;
        this.d = num;
    }

    public static zzgjf c(zzgjk zzgjkVar, zzgwq zzgwqVar, @InterfaceC10571ws1 Integer num) throws GeneralSecurityException {
        zzgwp b;
        zzgjk zzgjkVar2 = zzgjk.d;
        if (zzgjkVar != zzgjkVar2 && num == null) {
            String obj = zzgjkVar.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgjkVar == zzgjkVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzgwqVar.a() == 32) {
                zzgjl c = zzgjl.c(zzgjkVar);
                if (c.b() == zzgjkVar2) {
                    b = zzgnk.a;
                } else if (c.b() == zzgjk.c) {
                    b = zzgnk.a(num.intValue());
                } else if (c.b() == zzgjk.b) {
                    b = zzgnk.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(c.b().toString()));
                }
                return new zzgjf(c, zzgwqVar, b, num);
            }
            int a = zzgwqVar.a();
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk, com.google.android.gms.internal.ads.zzgek
    public final /* synthetic */ zzgex a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final zzgwp b() {
        return this.c;
    }

    public final zzgjl d() {
        return this.a;
    }

    public final zzgwq e() {
        return this.b;
    }

    @InterfaceC10571ws1
    public final Integer f() {
        return this.d;
    }
}
