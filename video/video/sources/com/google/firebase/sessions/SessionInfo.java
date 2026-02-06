package com.google.firebase.sessions;

import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SessionInfo {
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    public final int c;
    public final long d;
    @NotNull
    public final DataCollectionStatus e;
    @NotNull
    public final String f;

    public SessionInfo(@NotNull String str, @NotNull String str2, int i, long j, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String str3) {
        C6562gT0.p(str, "sessionId");
        C6562gT0.p(str2, "firstSessionId");
        C6562gT0.p(dataCollectionStatus, "dataCollectionStatus");
        C6562gT0.p(str3, "firebaseInstallationId");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = dataCollectionStatus;
        this.f = str3;
    }

    public static /* synthetic */ SessionInfo h(SessionInfo sessionInfo, String str, String str2, int i, long j, DataCollectionStatus dataCollectionStatus, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sessionInfo.a;
        }
        if ((i2 & 2) != 0) {
            str2 = sessionInfo.b;
        }
        if ((i2 & 4) != 0) {
            i = sessionInfo.c;
        }
        if ((i2 & 8) != 0) {
            j = sessionInfo.d;
        }
        if ((i2 & 16) != 0) {
            dataCollectionStatus = sessionInfo.e;
        }
        if ((i2 & 32) != 0) {
            str3 = sessionInfo.f;
        }
        long j2 = j;
        int i3 = i;
        return sessionInfo.g(str, str2, i3, j2, dataCollectionStatus, str3);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    @NotNull
    public final DataCollectionStatus e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionInfo) {
            SessionInfo sessionInfo = (SessionInfo) obj;
            return C6562gT0.g(this.a, sessionInfo.a) && C6562gT0.g(this.b, sessionInfo.b) && this.c == sessionInfo.c && this.d == sessionInfo.d && C6562gT0.g(this.e, sessionInfo.e) && C6562gT0.g(this.f, sessionInfo.f);
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.f;
    }

    @NotNull
    public final SessionInfo g(@NotNull String str, @NotNull String str2, int i, long j, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String str3) {
        C6562gT0.p(str, "sessionId");
        C6562gT0.p(str2, "firstSessionId");
        C6562gT0.p(dataCollectionStatus, "dataCollectionStatus");
        C6562gT0.p(str3, "firebaseInstallationId");
        return new SessionInfo(str, str2, i, j, dataCollectionStatus, str3);
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @NotNull
    public final DataCollectionStatus i() {
        return this.e;
    }

    public final long j() {
        return this.d;
    }

    @NotNull
    public final String k() {
        return this.f;
    }

    @NotNull
    public final String l() {
        return this.b;
    }

    @NotNull
    public final String m() {
        return this.a;
    }

    public final int n() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ')';
    }

    public /* synthetic */ SessionInfo(String str, String str2, int i, long j, DataCollectionStatus dataCollectionStatus, String str3, int i2, C9516sY c9516sY) {
        this(str, str2, i, j, (i2 & 16) != 0 ? new DataCollectionStatus(null, null, 0.0d, 7, null) : dataCollectionStatus, (i2 & 32) != 0 ? "" : str3);
    }
}
