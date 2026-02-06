package com.google.firebase.sessions.settings;

import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SessionConfigs {
    @Nullable
    public final Boolean a;
    @Nullable
    public final Double b;
    @Nullable
    public final Integer c;
    @Nullable
    public final Integer d;
    @Nullable
    public final Long e;

    public SessionConfigs(@Nullable Boolean bool, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public static /* synthetic */ SessionConfigs g(SessionConfigs sessionConfigs, Boolean bool, Double d, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sessionConfigs.a;
        }
        if ((i & 2) != 0) {
            d = sessionConfigs.b;
        }
        if ((i & 4) != 0) {
            num = sessionConfigs.c;
        }
        if ((i & 8) != 0) {
            num2 = sessionConfigs.d;
        }
        if ((i & 16) != 0) {
            l = sessionConfigs.e;
        }
        Long l2 = l;
        Integer num3 = num;
        return sessionConfigs.f(bool, d, num3, num2, l2);
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final Double b() {
        return this.b;
    }

    @Nullable
    public final Integer c() {
        return this.c;
    }

    @Nullable
    public final Integer d() {
        return this.d;
    }

    @Nullable
    public final Long e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionConfigs) {
            SessionConfigs sessionConfigs = (SessionConfigs) obj;
            return C6562gT0.g(this.a, sessionConfigs.a) && C6562gT0.g(this.b, sessionConfigs.b) && C6562gT0.g(this.c, sessionConfigs.c) && C6562gT0.g(this.d, sessionConfigs.d) && C6562gT0.g(this.e, sessionConfigs.e);
        }
        return false;
    }

    @NotNull
    public final SessionConfigs f(@Nullable Boolean bool, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l) {
        return new SessionConfigs(bool, d, num, num2, l);
    }

    @Nullable
    public final Integer h() {
        return this.d;
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    @Nullable
    public final Long i() {
        return this.e;
    }

    @Nullable
    public final Boolean j() {
        return this.a;
    }

    @Nullable
    public final Integer k() {
        return this.c;
    }

    @Nullable
    public final Double l() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionRestartTimeout=" + this.c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.e + ')';
    }
}
