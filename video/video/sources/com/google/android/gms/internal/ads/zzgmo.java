package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgmo extends zzgek {
    public final zzgoi a;
    public final zzgwp b;

    public zzgmo(zzgoi zzgoiVar, @InterfaceC10571ws1 zzgey zzgeyVar) throws GeneralSecurityException {
        zzgwp a;
        e(zzgoiVar, zzgeyVar);
        this.a = zzgoiVar;
        if (zzgoiVar.c().equals(zzguq.RAW)) {
            a = zzgwp.b(new byte[0]);
        } else if (zzgoiVar.c().equals(zzguq.TINK)) {
            a = zzgnk.b(zzgoiVar.e().intValue());
        } else if (!zzgoiVar.c().equals(zzguq.LEGACY) && !zzgoiVar.c().equals(zzguq.CRUNCHY)) {
            throw new GeneralSecurityException("Unknown output prefix type");
        } else {
            a = zzgnk.a(zzgoiVar.e().intValue());
        }
        this.b = a;
    }

    public static void e(zzgoi zzgoiVar, @InterfaceC10571ws1 zzgey zzgeyVar) throws GeneralSecurityException {
        int i = zzgml.b[zzgoiVar.b().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final zzgex a() {
        zzgoi zzgoiVar = this.a;
        return new zzgmm(zzgoiVar.g(), zzgoiVar.c(), null);
    }

    public final zzgoi b(@InterfaceC10571ws1 zzgey zzgeyVar) throws GeneralSecurityException {
        zzgoi zzgoiVar = this.a;
        e(zzgoiVar, zzgeyVar);
        return zzgoiVar;
    }

    public final zzgwp c() {
        return this.b;
    }

    @InterfaceC10571ws1
    public final Integer d() {
        return this.a.e();
    }
}
