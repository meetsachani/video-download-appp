package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Application_Organization extends CrashlyticsReport.Session.Application.Organization {
    public final String a;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Application.Organization.Builder {
        public String a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization a() {
            String str = "";
            if (this.a == null) {
                str = " clsId";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Application_Organization(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization.Builder b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null clsId");
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport.Session.Application.Organization organization) {
            this.a = organization.b();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    @InterfaceC5670cr1
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public CrashlyticsReport.Session.Application.Organization.Builder c() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.a.equals(((CrashlyticsReport.Session.Application.Organization) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.a + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Application_Organization(String str) {
        this.a = str;
    }
}
