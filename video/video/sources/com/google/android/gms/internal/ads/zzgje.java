package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import o.C9811tl1;

/* loaded from: classes2.dex */
public final class zzgje extends zzgfl {
    public final zzgjd a;
    public final int b;

    public zzgje(zzgjd zzgjdVar, int i) {
        this.a = zzgjdVar;
        this.b = i;
    }

    public static zzgje d(zzgjd zzgjdVar, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new zzgje(zzgjdVar, i);
        }
        throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.a != zzgjd.c;
    }

    public final int b() {
        return this.b;
    }

    public final zzgjd c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgje)) {
            return false;
        }
        zzgje zzgjeVar = (zzgje) obj;
        if (zzgjeVar.a != this.a || zzgjeVar.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgje.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        String obj = this.a.toString();
        return "X-AES-GCM Parameters (variant: " + obj + "salt_size_bytes: " + this.b + C9811tl1.d;
    }
}
