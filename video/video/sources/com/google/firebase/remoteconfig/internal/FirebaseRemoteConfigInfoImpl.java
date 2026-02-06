package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {
    public final long a;
    public final int b;
    public final FirebaseRemoteConfigSettings c;

    /* loaded from: classes3.dex */
    public static class Builder {
        public long a;
        public int b;
        public FirebaseRemoteConfigSettings c;

        public FirebaseRemoteConfigInfoImpl a() {
            return new FirebaseRemoteConfigInfoImpl(this.a, this.b, this.c);
        }

        public Builder b(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.c = firebaseRemoteConfigSettings;
            return this;
        }

        public Builder c(int i) {
            this.b = i;
            return this;
        }

        public Builder d(long j) {
            this.a = j;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder d() {
        return new Builder();
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long a() {
        return this.a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public FirebaseRemoteConfigSettings b() {
        return this.c;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int c() {
        return this.b;
    }

    public FirebaseRemoteConfigInfoImpl(long j, int i, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.a = j;
        this.b = i;
        this.c = firebaseRemoteConfigSettings;
    }
}
