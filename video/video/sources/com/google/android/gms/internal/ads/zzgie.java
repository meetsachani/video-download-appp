package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgie extends zzgfk {
    public final zzgij a;
    public final zzgwp b;
    @InterfaceC10571ws1
    public final Integer c;

    public zzgie(zzgij zzgijVar, zzgwp zzgwpVar, @InterfaceC10571ws1 Integer num) {
        this.a = zzgijVar;
        this.b = zzgwpVar;
        this.c = num;
    }

    public static zzgie c(zzgij zzgijVar, @InterfaceC10571ws1 Integer num) throws GeneralSecurityException {
        zzgwp b;
        if (zzgijVar.c() == zzgih.c) {
            if (num == null) {
                b = zzgnk.a;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzgijVar.c() == zzgih.b) {
            if (num != null) {
                b = zzgnk.b(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgijVar.c())));
        }
        return new zzgie(zzgijVar, b, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfk, com.google.android.gms.internal.ads.zzgek
    public final /* synthetic */ zzgex a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final zzgwp b() {
        return this.b;
    }

    public final zzgij d() {
        return this.a;
    }

    public final Integer e() {
        return this.c;
    }
}
