package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
final class AutoValue_InstallationResponse extends InstallationResponse {
    public final String a;
    public final String b;
    public final String c;
    public final TokenResult d;
    public final InstallationResponse.ResponseCode e;

    /* loaded from: classes3.dex */
    public static final class Builder extends InstallationResponse.Builder {
        public String a;
        public String b;
        public String c;
        public TokenResult d;
        public InstallationResponse.ResponseCode e;

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse a() {
            return new AutoValue_InstallationResponse(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder b(TokenResult tokenResult) {
            this.d = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder e(InstallationResponse.ResponseCode responseCode) {
            this.e = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder f(String str) {
            this.a = str;
            return this;
        }

        public Builder() {
        }

        public Builder(InstallationResponse installationResponse) {
            this.a = installationResponse.f();
            this.b = installationResponse.c();
            this.c = installationResponse.d();
            this.d = installationResponse.b();
            this.e = installationResponse.e();
        }
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @InterfaceC11300zs1
    public TokenResult b() {
        return this.d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @InterfaceC11300zs1
    public String c() {
        return this.b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @InterfaceC11300zs1
    public String d() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @InterfaceC11300zs1
    public InstallationResponse.ResponseCode e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationResponse) {
            InstallationResponse installationResponse = (InstallationResponse) obj;
            String str = this.a;
            if (str != null ? str.equals(installationResponse.f()) : installationResponse.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(installationResponse.c()) : installationResponse.c() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(installationResponse.d()) : installationResponse.d() == null) {
                        TokenResult tokenResult = this.d;
                        if (tokenResult != null ? tokenResult.equals(installationResponse.b()) : installationResponse.b() == null) {
                            InstallationResponse.ResponseCode responseCode = this.e;
                            if (responseCode != null ? responseCode.equals(installationResponse.e()) : installationResponse.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @InterfaceC11300zs1
    public String f() {
        return this.a;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.Builder g() {
        return new Builder(this);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        TokenResult tokenResult = this.d;
        if (tokenResult == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = tokenResult.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i5 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }

    public AutoValue_InstallationResponse(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 TokenResult tokenResult, @InterfaceC11300zs1 InstallationResponse.ResponseCode responseCode) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tokenResult;
        this.e = responseCode;
    }
}
