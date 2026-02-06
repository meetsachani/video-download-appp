package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C9811tl1;

/* loaded from: classes2.dex */
public final class zzgij extends zzgfl {
    public final zzgih a;
    public final String b;
    public final zzgig c;
    public final zzgfl d;

    public /* synthetic */ zzgij(zzgih zzgihVar, String str, zzgig zzgigVar, zzgfl zzgflVar, zzgii zzgiiVar) {
        this.a = zzgihVar;
        this.b = str;
        this.c = zzgigVar;
        this.d = zzgflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.a != zzgih.c;
    }

    public final zzgfl b() {
        return this.d;
    }

    public final zzgih c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgij)) {
            return false;
        }
        zzgij zzgijVar = (zzgij) obj;
        if (!zzgijVar.c.equals(this.c) || !zzgijVar.d.equals(this.d) || !zzgijVar.b.equals(this.b) || !zzgijVar.a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgij.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        zzgih zzgihVar = this.a;
        zzgfl zzgflVar = this.d;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(zzgflVar);
        String valueOf3 = String.valueOf(zzgihVar);
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + valueOf + ", dekParametersForNewKeys: " + valueOf2 + ", variant: " + valueOf3 + C9811tl1.d;
    }
}
