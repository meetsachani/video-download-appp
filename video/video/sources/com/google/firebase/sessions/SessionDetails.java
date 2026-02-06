package com.google.firebase.sessions;

import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SessionDetails {
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    public final int c;
    public final long d;

    public SessionDetails(@NotNull String str, @NotNull String str2, int i, long j) {
        C6562gT0.p(str, "sessionId");
        C6562gT0.p(str2, "firstSessionId");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public static /* synthetic */ SessionDetails f(SessionDetails sessionDetails, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sessionDetails.a;
        }
        if ((i2 & 2) != 0) {
            str2 = sessionDetails.b;
        }
        if ((i2 & 4) != 0) {
            i = sessionDetails.c;
        }
        if ((i2 & 8) != 0) {
            j = sessionDetails.d;
        }
        int i3 = i;
        return sessionDetails.e(str, str2, i3, j);
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
    public final SessionDetails e(@NotNull String str, @NotNull String str2, int i, long j) {
        C6562gT0.p(str, "sessionId");
        C6562gT0.p(str2, "firstSessionId");
        return new SessionDetails(str, str2, i, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionDetails) {
            SessionDetails sessionDetails = (SessionDetails) obj;
            return C6562gT0.g(this.a, sessionDetails.a) && C6562gT0.g(this.b, sessionDetails.b) && this.c == sessionDetails.c && this.d == sessionDetails.d;
        }
        return false;
    }

    @NotNull
    public final String g() {
        return this.b;
    }

    @NotNull
    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + Long.hashCode(this.d);
    }

    public final int i() {
        return this.c;
    }

    public final long j() {
        return this.d;
    }

    @NotNull
    public String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
