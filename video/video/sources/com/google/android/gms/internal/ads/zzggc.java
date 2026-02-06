package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzggc extends zzgfl {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final zzgga e;
    public final zzgfz f;

    public /* synthetic */ zzggc(int i, int i2, int i3, int i4, zzgga zzggaVar, zzgfz zzgfzVar, zzggb zzggbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = zzggaVar;
        this.f = zzgfzVar;
    }

    public static zzgfy f() {
        return new zzgfy(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.e != zzgga.d;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggc)) {
            return false;
        }
        zzggc zzggcVar = (zzggc) obj;
        if (zzggcVar.a != this.a || zzggcVar.b != this.b || zzggcVar.c != this.c || zzggcVar.d != this.d || zzggcVar.e != this.e || zzggcVar.f != this.f) {
            return false;
        }
        return true;
    }

    public final zzgfz g() {
        return this.f;
    }

    public final zzgga h() {
        return this.e;
    }

    public final int hashCode() {
        return Objects.hash(zzggc.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        zzgfz zzgfzVar = this.f;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(zzgfzVar);
        return "AesCtrHmacAead Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + C6566gU0.h + this.c + "-byte IV, and " + this.d + "-byte tags, and " + this.a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }
}
