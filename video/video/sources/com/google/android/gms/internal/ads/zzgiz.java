package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgiz extends zzgfk {
    public final zzgje a;
    public final zzgwq b;
    public final zzgwp c;
    @InterfaceC10571ws1
    public final Integer d;

    public zzgiz(zzgje zzgjeVar, zzgwq zzgwqVar, zzgwp zzgwpVar, @InterfaceC10571ws1 Integer num) {
        this.a = zzgjeVar;
        this.b = zzgwqVar;
        this.c = zzgwpVar;
        this.d = num;
    }

    public static zzgiz c(zzgje zzgjeVar, zzgwq zzgwqVar, @InterfaceC10571ws1 Integer num) throws GeneralSecurityException {
        zzgwp b;
        zzgjd c = zzgjeVar.c();
        zzgjd zzgjdVar = zzgjd.c;
        if (c != zzgjdVar && num == null) {
            String obj = zzgjeVar.c().toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgjeVar.c() == zzgjdVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzgwqVar.a() == 32) {
                if (zzgjeVar.c() == zzgjdVar) {
                    b = zzgnk.a;
                } else if (zzgjeVar.c() == zzgjd.b) {
                    b = zzgnk.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzgjeVar.c().toString()));
                }
                return new zzgiz(zzgjeVar, zzgwqVar, b, num);
            }
            int a = zzgwqVar.a();
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + a);
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

    public final zzgje d() {
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
