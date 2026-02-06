package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {
    public final String a;
    public final String b;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {
        public String a;
        public String b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant a() {
            String str = "";
            if (this.a == null) {
                str = " rolloutId";
            }
            if (this.b == null) {
                str = str + " variantId";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @InterfaceC5670cr1
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @InterfaceC5670cr1
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
            if (this.a.equals(rolloutVariant.b()) && this.b.equals(rolloutVariant.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.a + ", variantId=" + this.b + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
