package com.google.firebase;

/* loaded from: classes3.dex */
final class AutoValue_StartupTime extends StartupTime {
    public final long a;
    public final long b;
    public final long c;

    public AutoValue_StartupTime(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // com.google.firebase.StartupTime
    public long b() {
        return this.b;
    }

    @Override // com.google.firebase.StartupTime
    public long c() {
        return this.a;
    }

    @Override // com.google.firebase.StartupTime
    public long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartupTime) {
            StartupTime startupTime = (StartupTime) obj;
            if (this.a == startupTime.c() && this.b == startupTime.b() && this.c == startupTime.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}
