package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzggx extends zzgfl {
    public final int a;
    public final int b = 12;
    public final int c = 16;
    public final zzggv d;

    public /* synthetic */ zzggx(int i, int i2, int i3, zzggv zzggvVar, zzggw zzggwVar) {
        this.a = i;
        this.d = zzggvVar;
    }

    public static zzggu c() {
        return new zzggu(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.d != zzggv.d;
    }

    public final int b() {
        return this.a;
    }

    public final zzggv d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggx)) {
            return false;
        }
        zzggx zzggxVar = (zzggx) obj;
        if (zzggxVar.a != this.a || zzggxVar.d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzggx.class, Integer.valueOf(this.a), 12, 16, this.d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        return "AesGcm Parameters (variant: " + valueOf + C6566gU0.h + "12-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
