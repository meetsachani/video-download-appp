package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfod extends zzfnz {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;

    public /* synthetic */ zzfod(String str, boolean z, boolean z2, boolean z3, long j, boolean z4, long j2, zzfoc zzfocVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final long a() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final long b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final String d() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnz) {
            zzfnz zzfnzVar = (zzfnz) obj;
            if (this.a.equals(zzfnzVar.d()) && this.b == zzfnzVar.h() && this.c == zzfnzVar.g()) {
                zzfnzVar.f();
                if (this.d == zzfnzVar.b()) {
                    zzfnzVar.e();
                    if (this.e == zzfnzVar.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final boolean g() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i2 = 1231;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true != this.c) {
            i2 = 1237;
        }
        return ((((((((i3 ^ i2) * 1000003) ^ 1237) * 1000003) ^ ((int) this.d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.e);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.a + ", shouldGetAdvertisingId=" + this.b + ", isGooglePlayServicesAvailable=" + this.c + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.d + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.e + "}";
    }
}
