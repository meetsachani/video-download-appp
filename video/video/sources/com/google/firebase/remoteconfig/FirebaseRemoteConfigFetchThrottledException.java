package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {
    public final long Y;

    public FirebaseRemoteConfigFetchThrottledException(long j) {
        this("Fetch was throttled.", j);
    }

    public long b() {
        return this.Y;
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j) {
        super(str);
        this.Y = j;
    }
}
