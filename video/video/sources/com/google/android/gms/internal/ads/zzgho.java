package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C9811tl1;

/* loaded from: classes2.dex */
public final class zzgho extends zzgfl {
    public final zzghn a;

    public zzgho(zzghn zzghnVar) {
        this.a = zzghnVar;
    }

    public static zzgho c(zzghn zzghnVar) {
        return new zzgho(zzghnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.a != zzghn.d;
    }

    public final zzghn b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgho) || ((zzgho) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgho.class, this.a);
    }

    public final String toString() {
        String obj = this.a.toString();
        return "ChaCha20Poly1305 Parameters (variant: " + obj + C9811tl1.d;
    }
}
