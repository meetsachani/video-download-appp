package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes3.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.c = str;
            if (str2 != null) {
                this.d = str2;
                if (str3 != null) {
                    this.e = str3;
                    if (str4 != null) {
                        this.f = str4;
                        this.g = j;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutAssignment) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            if (this.c.equals(rolloutAssignment.e()) && this.d.equals(rolloutAssignment.c()) && this.e.equals(rolloutAssignment.d()) && this.f.equals(rolloutAssignment.g()) && this.g == rolloutAssignment.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public long f() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String g() {
        return this.f;
    }

    public int hashCode() {
        long j = this.g;
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.c + ", parameterKey=" + this.d + ", parameterValue=" + this.e + ", variantId=" + this.f + ", templateVersion=" + this.g + "}";
    }
}
