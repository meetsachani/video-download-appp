package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;

    /* loaded from: classes3.dex */
    public static final class Builder extends RolloutAssignment.Builder {
        public String a;
        public String b;
        public String c;
        public String d;
        public long e;
        public byte f;

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment a() {
            if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
                return new AutoValue_RolloutAssignment(this.a, this.b, this.c, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutId");
            }
            if (this.b == null) {
                sb.append(" variantId");
            }
            if (this.c == null) {
                sb.append(" parameterKey");
            }
            if (this.d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder c(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder e(long j) {
            this.e = j;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @InterfaceC5670cr1
    public String d() {
        return this.i;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @InterfaceC5670cr1
    public String e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutAssignment) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            if (this.g.equals(rolloutAssignment.f()) && this.h.equals(rolloutAssignment.h()) && this.i.equals(rolloutAssignment.d()) && this.j.equals(rolloutAssignment.e()) && this.k == rolloutAssignment.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @InterfaceC5670cr1
    public String f() {
        return this.g;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public long g() {
        return this.k;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @InterfaceC5670cr1
    public String h() {
        return this.h;
    }

    public int hashCode() {
        long j = this.k;
        return ((((((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.g + ", variantId=" + this.h + ", parameterKey=" + this.i + ", parameterValue=" + this.j + ", templateVersion=" + this.k + "}";
    }

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = j;
    }
}
