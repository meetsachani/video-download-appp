package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzghj extends zzgfk {
    public final zzgho a;
    public final zzgwq b;
    public final zzgwp c;
    @InterfaceC10571ws1
    public final Integer d;

    public zzghj(zzgho zzghoVar, zzgwq zzgwqVar, zzgwp zzgwpVar, @InterfaceC10571ws1 Integer num) {
        this.a = zzghoVar;
        this.b = zzgwqVar;
        this.c = zzgwpVar;
        this.d = num;
    }

    public static zzghj c(zzghn zzghnVar, zzgwq zzgwqVar, @InterfaceC10571ws1 Integer num) throws GeneralSecurityException {
        zzgwp b;
        zzghn zzghnVar2 = zzghn.d;
        if (zzghnVar != zzghnVar2 && num == null) {
            String obj = zzghnVar.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzghnVar == zzghnVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzgwqVar.a() == 32) {
                zzgho c = zzgho.c(zzghnVar);
                if (c.b() == zzghnVar2) {
                    b = zzgnk.a;
                } else if (c.b() == zzghn.c) {
                    b = zzgnk.a(num.intValue());
                } else if (c.b() == zzghn.b) {
                    b = zzgnk.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(c.b().toString()));
                }
                return new zzghj(c, zzgwqVar, b, num);
            }
            int a = zzgwqVar.a();
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + a);
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

    public final zzgho d() {
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
