package com.google.android.gms.ads.internal.util.client;

/* loaded from: classes2.dex */
final class zzn extends zzx {
    public final int a;
    public final int b;
    public final double c;
    public final boolean d;

    public zzn(int i, int i2, double d, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = d;
        this.d = z;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double a() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int c() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.a == zzxVar.c() && this.b == zzxVar.b() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(zzxVar.a()) && this.d == zzxVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        double d = this.c;
        long doubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((int) doubleToLongBits) ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ i;
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.a + ", initialBackoffMs=" + this.b + ", backoffMultiplier=" + this.c + ", bufferAfterMaxAttempts=" + this.d + "}";
    }
}
