package com.google.firebase.sessions.api;

import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface SessionSubscriber {

    /* loaded from: classes3.dex */
    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* loaded from: classes3.dex */
    public static final class SessionDetails {
        @NotNull
        public final String a;

        public SessionDetails(@NotNull String str) {
            C6562gT0.p(str, "sessionId");
            this.a = str;
        }

        public static /* synthetic */ SessionDetails c(SessionDetails sessionDetails, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionDetails.a;
            }
            return sessionDetails.b(str);
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        @NotNull
        public final SessionDetails b(@NotNull String str) {
            C6562gT0.p(str, "sessionId");
            return new SessionDetails(str);
        }

        @NotNull
        public final String d() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && C6562gT0.g(this.a, ((SessionDetails) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SessionDetails(sessionId=" + this.a + ')';
        }
    }

    boolean a();

    @NotNull
    Name b();

    void c(@NotNull SessionDetails sessionDetails);
}
