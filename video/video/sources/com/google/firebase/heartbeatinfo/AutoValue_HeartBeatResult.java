package com.google.firebase.heartbeatinfo;

import java.util.List;

/* loaded from: classes3.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {
    public final String a;
    public final List<String> b;

    public AutoValue_HeartBeatResult(String str, List<String> list) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List<String> b() {
        return this.b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeartBeatResult) {
            HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
            if (this.a.equals(heartBeatResult.c()) && this.b.equals(heartBeatResult.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
