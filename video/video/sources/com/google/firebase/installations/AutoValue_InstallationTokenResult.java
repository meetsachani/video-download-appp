package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    public final String a;
    public final long b;
    public final long c;

    /* loaded from: classes3.dex */
    public static final class Builder extends InstallationTokenResult.Builder {
        public String a;
        public Long b;
        public Long c;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult a() {
            String str = "";
            if (this.a == null) {
                str = " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public Builder() {
        }

        public Builder(InstallationTokenResult installationTokenResult) {
            this.a = installationTokenResult.b();
            this.b = Long.valueOf(installationTokenResult.d());
            this.c = Long.valueOf(installationTokenResult.c());
        }
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @InterfaceC5670cr1
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @InterfaceC5670cr1
    public long c() {
        return this.c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @InterfaceC5670cr1
    public long d() {
        return this.b;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder e() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationTokenResult) {
            InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
            if (this.a.equals(installationTokenResult.b()) && this.b == installationTokenResult.d() && this.c == installationTokenResult.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }

    public AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
