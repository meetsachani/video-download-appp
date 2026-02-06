package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;
import o.UE;

/* loaded from: classes2.dex */
public final class zzgif {
    @InterfaceC10571ws1
    public zzgih a;
    @InterfaceC10571ws1
    public String b;
    @InterfaceC10571ws1
    public zzgig c;
    @InterfaceC10571ws1
    public zzgfl d;

    private zzgif() {
        throw null;
    }

    public final zzgif a(zzgfl zzgflVar) {
        this.d = zzgflVar;
        return this;
    }

    public final zzgif b(zzgig zzgigVar) {
        this.c = zzgigVar;
        return this;
    }

    public final zzgif c(String str) {
        this.b = str;
        return this;
    }

    public final zzgif d(zzgih zzgihVar) {
        this.a = zzgihVar;
        return this;
    }

    public final zzgij e() throws GeneralSecurityException {
        if (this.a == null) {
            this.a = zzgih.c;
        }
        if (this.b != null) {
            zzgig zzgigVar = this.c;
            if (zzgigVar != null) {
                zzgfl zzgflVar = this.d;
                if (zzgflVar != null) {
                    if (!zzgflVar.a()) {
                        if ((zzgigVar.equals(zzgig.b) && (zzgflVar instanceof zzggx)) || ((zzgigVar.equals(zzgig.d) && (zzgflVar instanceof zzgho)) || ((zzgigVar.equals(zzgig.c) && (zzgflVar instanceof zzgjl)) || ((zzgigVar.equals(zzgig.e) && (zzgflVar instanceof zzggc)) || ((zzgigVar.equals(zzgig.f) && (zzgflVar instanceof zzggm)) || (zzgigVar.equals(zzgig.g) && (zzgflVar instanceof zzghi))))))) {
                            return new zzgij(this.a, this.b, this.c, this.d, null);
                        }
                        String zzgigVar2 = this.c.toString();
                        String valueOf = String.valueOf(this.d);
                        throw new GeneralSecurityException("Cannot use parsing strategy " + zzgigVar2 + " when new keys are picked according to " + valueOf + UE.h);
                    }
                    throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                }
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        throw new GeneralSecurityException("kekUri must be set");
    }

    public /* synthetic */ zzgif(zzgii zzgiiVar) {
    }
}
