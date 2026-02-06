package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends CrashlyticsReport.Session.Event.RolloutsState {
    public final List<CrashlyticsReport.Session.Event.RolloutAssignment> a;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutsState.Builder {
        public List<CrashlyticsReport.Session.Event.RolloutAssignment> a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState a() {
            String str = "";
            if (this.a == null) {
                str = " rolloutAssignments";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState.Builder b(@InterfaceC11300zs1 List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null rolloutAssignments");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    @InterfaceC5670cr1
    @Encodable.Field(name = "assignments")
    public List<CrashlyticsReport.Session.Event.RolloutAssignment> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.a.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
        this.a = list;
    }
}
