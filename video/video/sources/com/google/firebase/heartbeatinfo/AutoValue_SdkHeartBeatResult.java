package com.google.firebase.heartbeatinfo;

/* loaded from: classes3.dex */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    public final String X;
    public final long Y;

    public AutoValue_SdkHeartBeatResult(String str, long j) {
        if (str != null) {
            this.X = str;
            this.Y = j;
            return;
        }
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkHeartBeatResult) {
            SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
            if (this.X.equals(sdkHeartBeatResult.i()) && this.Y == sdkHeartBeatResult.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long h() {
        return this.Y;
    }

    public int hashCode() {
        long j = this.Y;
        return ((this.X.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String i() {
        return this.X;
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.X + ", millis=" + this.Y + "}";
    }
}
