package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfe implements zzau {
    public final long a;
    public final long b;
    public final long c;

    public zzfe(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void a(zzar zzarVar) {
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfe)) {
            return false;
        }
        zzfe zzfeVar = (zzfe) obj;
        if (this.a == zzfeVar.a && this.b == zzfeVar.b && this.c == zzfeVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) this.c);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
