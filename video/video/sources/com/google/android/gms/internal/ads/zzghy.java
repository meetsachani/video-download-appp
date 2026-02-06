package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C9811tl1;

/* loaded from: classes2.dex */
public final class zzghy extends zzgfl {
    public final String a;
    public final zzghx b;

    public zzghy(String str, zzghx zzghxVar) {
        this.a = str;
        this.b = zzghxVar;
    }

    public static zzghy c(String str, zzghx zzghxVar) {
        return new zzghy(str, zzghxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.b != zzghx.c;
    }

    public final zzghx b() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghy)) {
            return false;
        }
        zzghy zzghyVar = (zzghy) obj;
        if (!zzghyVar.a.equals(this.a) || !zzghyVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzghy.class, this.a, this.b);
    }

    public final String toString() {
        String obj = this.b.toString();
        return "LegacyKmsAead Parameters (keyUri: " + this.a + ", variant: " + obj + C9811tl1.d;
    }
}
