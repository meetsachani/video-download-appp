package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzghi extends zzgfl {
    public final int a;
    public final zzghg b;

    public /* synthetic */ zzghi(int i, zzghg zzghgVar, zzghh zzghhVar) {
        this.a = i;
        this.b = zzghgVar;
    }

    public static zzghf c() {
        return new zzghf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.b != zzghg.d;
    }

    public final int b() {
        return this.a;
    }

    public final zzghg d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghi)) {
            return false;
        }
        zzghi zzghiVar = (zzghi) obj;
        if (zzghiVar.a != this.a || zzghiVar.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzghi.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return "AesGcmSiv Parameters (variant: " + valueOf + C6566gU0.h + this.a + "-byte key)";
    }
}
