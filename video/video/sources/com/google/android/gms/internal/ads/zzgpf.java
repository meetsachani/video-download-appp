package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzgpf extends zzgpz {
    public final int a;
    public final int b;
    public final zzgpd c;

    public /* synthetic */ zzgpf(int i, int i2, zzgpd zzgpdVar, zzgpe zzgpeVar) {
        this.a = i;
        this.b = i2;
        this.c = zzgpdVar;
    }

    public static zzgpc e() {
        return new zzgpc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.c != zzgpd.e;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        zzgpd zzgpdVar = this.c;
        if (zzgpdVar == zzgpd.e) {
            return this.b;
        }
        if (zzgpdVar == zzgpd.b || zzgpdVar == zzgpd.c || zzgpdVar == zzgpd.d) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpf)) {
            return false;
        }
        zzgpf zzgpfVar = (zzgpf) obj;
        if (zzgpfVar.a != this.a || zzgpfVar.d() != d() || zzgpfVar.c != this.c) {
            return false;
        }
        return true;
    }

    public final zzgpd f() {
        return this.c;
    }

    public final int hashCode() {
        return Objects.hash(zzgpf.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        return "AES-CMAC Parameters (variant: " + valueOf + C6566gU0.h + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
