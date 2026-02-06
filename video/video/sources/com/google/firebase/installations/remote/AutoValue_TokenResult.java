package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_TokenResult extends TokenResult {
    public final String a;
    public final long b;
    public final TokenResult.ResponseCode c;

    /* loaded from: classes3.dex */
    public static final class Builder extends TokenResult.Builder {
        public String a;
        public Long b;
        public TokenResult.ResponseCode c;

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult a() {
            String str = "";
            if (this.b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder b(TokenResult.ResponseCode responseCode) {
            this.c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public Builder() {
        }

        public Builder(TokenResult tokenResult) {
            this.a = tokenResult.c();
            this.b = Long.valueOf(tokenResult.d());
            this.c = tokenResult.b();
        }
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @InterfaceC11300zs1
    public TokenResult.ResponseCode b() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @InterfaceC11300zs1
    public String c() {
        return this.a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @InterfaceC5670cr1
    public long d() {
        return this.b;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.Builder e() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        TokenResult.ResponseCode responseCode;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TokenResult) {
            TokenResult tokenResult = (TokenResult) obj;
            String str = this.a;
            if (str != null ? str.equals(tokenResult.c()) : tokenResult.c() == null) {
                if (this.b == tokenResult.d() && ((responseCode = this.c) != null ? responseCode.equals(tokenResult.b()) : tokenResult.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.c;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }

    public AutoValue_TokenResult(@InterfaceC11300zs1 String str, long j, @InterfaceC11300zs1 TokenResult.ResponseCode responseCode) {
        this.a = str;
        this.b = j;
        this.c = responseCode;
    }
}
