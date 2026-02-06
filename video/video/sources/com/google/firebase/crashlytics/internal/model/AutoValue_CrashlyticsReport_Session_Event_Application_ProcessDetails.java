package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends CrashlyticsReport.Session.Event.Application.ProcessDetails {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {
        public String a;
        public Integer b;
        public Integer c;
        public Boolean d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails a() {
            String str = "";
            if (this.a == null) {
                str = " processName";
            }
            if (this.b == null) {
                str = str + " pid";
            }
            if (this.c == null) {
                str = str + " importance";
            }
            if (this.d == null) {
                str = str + " defaultProcess";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(this.a, this.b.intValue(), this.c.intValue(), this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    @InterfaceC5670cr1
    public String d() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails) {
            CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
            if (this.a.equals(processDetails.d()) && this.b == processDetails.c() && this.c == processDetails.b() && this.d == processDetails.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
