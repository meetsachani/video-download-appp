package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {
    public final String a;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.User.Builder {
        public String a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_User(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User.Builder b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    @InterfaceC5670cr1
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.a.equals(((CrashlyticsReport.Session.User) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.a + "}";
    }

    public AutoValue_CrashlyticsReport_Session_User(String str) {
        this.a = str;
    }
}
