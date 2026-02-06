package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.Session.Event.Log {
    public final String a;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Log.Builder {
        public String a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log a() {
            String str = "";
            if (this.a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Log(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log.Builder b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    @InterfaceC5670cr1
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.a.equals(((CrashlyticsReport.Session.Event.Log) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Log(String str) {
        this.a = str;
    }
}
