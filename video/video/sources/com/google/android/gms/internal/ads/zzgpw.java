package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzgpw extends zzgpz {
    public final int a;
    public final int b;
    public final zzgpu c;
    public final zzgpt d;

    public /* synthetic */ zzgpw(int i, int i2, zzgpu zzgpuVar, zzgpt zzgptVar, zzgpv zzgpvVar) {
        this.a = i;
        this.b = i2;
        this.c = zzgpuVar;
        this.d = zzgptVar;
    }

    public static zzgps e() {
        return new zzgps(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.c != zzgpu.e;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        zzgpu zzgpuVar = this.c;
        if (zzgpuVar == zzgpu.e) {
            return this.b;
        }
        if (zzgpuVar == zzgpu.b || zzgpuVar == zzgpu.c || zzgpuVar == zzgpu.d) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpw)) {
            return false;
        }
        zzgpw zzgpwVar = (zzgpw) obj;
        if (zzgpwVar.a != this.a || zzgpwVar.d() != d() || zzgpwVar.c != this.c || zzgpwVar.d != this.d) {
            return false;
        }
        return true;
    }

    public final zzgpt f() {
        return this.d;
    }

    public final zzgpu g() {
        return this.c;
    }

    public final int hashCode() {
        return Objects.hash(zzgpw.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        zzgpt zzgptVar = this.d;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(zzgptVar);
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + C6566gU0.h + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
