package com.google.firebase.heartbeatinfo;

import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class SdkHeartBeatResult implements Comparable<SdkHeartBeatResult> {
    public static SdkHeartBeatResult g(String str, long j) {
        return new AutoValue_SdkHeartBeatResult(str, j);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(SdkHeartBeatResult sdkHeartBeatResult) {
        if (h() < sdkHeartBeatResult.h()) {
            return -1;
        }
        return 1;
    }

    public abstract long h();

    public abstract String i();
}
