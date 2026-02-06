package com.google.firebase.sessions;

import com.google.firebase.encoders.annotations.Encodable;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Encodable
/* loaded from: classes3.dex */
public final class SessionEvent {
    @NotNull
    public final EventType a;
    @NotNull
    public final SessionInfo b;
    @NotNull
    public final ApplicationInfo c;

    public SessionEvent(@NotNull EventType eventType, @NotNull SessionInfo sessionInfo, @NotNull ApplicationInfo applicationInfo) {
        C6562gT0.p(eventType, "eventType");
        C6562gT0.p(sessionInfo, "sessionData");
        C6562gT0.p(applicationInfo, "applicationInfo");
        this.a = eventType;
        this.b = sessionInfo;
        this.c = applicationInfo;
    }

    public static /* synthetic */ SessionEvent e(SessionEvent sessionEvent, EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = sessionEvent.a;
        }
        if ((i & 2) != 0) {
            sessionInfo = sessionEvent.b;
        }
        if ((i & 4) != 0) {
            applicationInfo = sessionEvent.c;
        }
        return sessionEvent.d(eventType, sessionInfo, applicationInfo);
    }

    @NotNull
    public final EventType a() {
        return this.a;
    }

    @NotNull
    public final SessionInfo b() {
        return this.b;
    }

    @NotNull
    public final ApplicationInfo c() {
        return this.c;
    }

    @NotNull
    public final SessionEvent d(@NotNull EventType eventType, @NotNull SessionInfo sessionInfo, @NotNull ApplicationInfo applicationInfo) {
        C6562gT0.p(eventType, "eventType");
        C6562gT0.p(sessionInfo, "sessionData");
        C6562gT0.p(applicationInfo, "applicationInfo");
        return new SessionEvent(eventType, sessionInfo, applicationInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionEvent) {
            SessionEvent sessionEvent = (SessionEvent) obj;
            return this.a == sessionEvent.a && C6562gT0.g(this.b, sessionEvent.b) && C6562gT0.g(this.c, sessionEvent.c);
        }
        return false;
    }

    @NotNull
    public final ApplicationInfo f() {
        return this.c;
    }

    @NotNull
    public final EventType g() {
        return this.a;
    }

    @NotNull
    public final SessionInfo h() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionEvent(eventType=" + this.a + ", sessionData=" + this.b + ", applicationInfo=" + this.c + ')';
    }
}
