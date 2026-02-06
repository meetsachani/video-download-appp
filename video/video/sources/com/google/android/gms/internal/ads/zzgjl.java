package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C9811tl1;

/* loaded from: classes2.dex */
public final class zzgjl extends zzgfl {
    public final zzgjk a;

    public zzgjl(zzgjk zzgjkVar) {
        this.a = zzgjkVar;
    }

    public static zzgjl c(zzgjk zzgjkVar) {
        return new zzgjl(zzgjkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.a != zzgjk.d;
    }

    public final zzgjk b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjl) || ((zzgjl) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgjl.class, this.a);
    }

    public final String toString() {
        String obj = this.a.toString();
        return "XChaCha20Poly1305 Parameters (variant: " + obj + C9811tl1.d;
    }
}
