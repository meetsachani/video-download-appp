package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzahe implements zzau {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public zzahe(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void a(zzar zzarVar) {
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahe.class == obj.getClass()) {
            zzahe zzaheVar = (zzahe) obj;
            if (this.a == zzaheVar.a && this.b == zzaheVar.b && this.c == zzaheVar.c && this.d == zzaheVar.d && this.e == zzaheVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.e;
        long j3 = this.d;
        long j4 = this.c;
        long j5 = this.b;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
