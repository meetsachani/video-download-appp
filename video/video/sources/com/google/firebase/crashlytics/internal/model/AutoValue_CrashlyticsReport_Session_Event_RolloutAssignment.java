package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant a;
    public final String b;
    public final String c;
    public final long d;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant a;
        public String b;
        public String c;
        public Long d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment a() {
            String str = "";
            if (this.a == null) {
                str = " rolloutVariant";
            }
            if (this.b == null) {
                str = str + " parameterKey";
            }
            if (this.c == null) {
                str = str + " parameterValue";
            }
            if (this.d == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(this.a, this.b, this.c, this.d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder d(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant != null) {
                this.a = rolloutVariant;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder e(long j) {
            this.d = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @InterfaceC5670cr1
    public String b() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @InterfaceC5670cr1
    public String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @InterfaceC5670cr1
    public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant d() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @InterfaceC5670cr1
    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment) {
            CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
            if (this.a.equals(rolloutAssignment.d()) && this.b.equals(rolloutAssignment.b()) && this.c.equals(rolloutAssignment.c()) && this.d == rolloutAssignment.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.d;
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.a + ", parameterKey=" + this.b + ", parameterValue=" + this.c + ", templateVersion=" + this.d + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j) {
        this.a = rolloutVariant;
        this.b = str;
        this.c = str2;
        this.d = j;
    }
}
