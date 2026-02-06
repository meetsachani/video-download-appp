package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigSettings {
    public final long a;
    public final long b;

    /* loaded from: classes3.dex */
    public static class Builder {
        public long a = 60;
        public long b = ConfigFetchHandler.j;

        @InterfaceC5670cr1
        public FirebaseRemoteConfigSettings c() {
            return new FirebaseRemoteConfigSettings(this);
        }

        public long d() {
            return this.a;
        }

        public long e() {
            return this.b;
        }

        @InterfaceC5670cr1
        public Builder f(long j) throws IllegalArgumentException {
            if (j >= 0) {
                this.a = j;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
        }

        @InterfaceC5670cr1
        public Builder g(long j) {
            if (j >= 0) {
                this.b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    @InterfaceC5670cr1
    public Builder c() {
        Builder builder = new Builder();
        builder.f(a());
        builder.g(b());
        return builder;
    }

    public FirebaseRemoteConfigSettings(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }
}
