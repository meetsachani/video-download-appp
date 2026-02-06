package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzggm extends zzgfl {
    public final int a;
    public final int b;
    public final int c = 16;
    public final zzggk d;

    public /* synthetic */ zzggm(int i, int i2, int i3, zzggk zzggkVar, zzggl zzgglVar) {
        this.a = i;
        this.b = i2;
        this.d = zzggkVar;
    }

    public static zzggj d() {
        return new zzggj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.d != zzggk.d;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final zzggk e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggm)) {
            return false;
        }
        zzggm zzggmVar = (zzggm) obj;
        if (zzggmVar.a != this.a || zzggmVar.b != this.b || zzggmVar.d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzggm.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        return "AesEax Parameters (variant: " + valueOf + C6566gU0.h + this.b + "-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
