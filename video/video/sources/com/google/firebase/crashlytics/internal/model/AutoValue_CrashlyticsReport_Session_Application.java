package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {
    public final String a;
    public final String b;
    public final String c;
    public final CrashlyticsReport.Session.Application.Organization d;
    public final String e;
    public final String f;
    public final String g;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Application.Builder {
        public String a;
        public String b;
        public String c;
        public CrashlyticsReport.Session.Application.Organization d;
        public String e;
        public String f;
        public String g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Application(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder b(@InterfaceC11300zs1 String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder c(@InterfaceC11300zs1 String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder f(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder g(CrashlyticsReport.Session.Application.Organization organization) {
            this.d = organization;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder h(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport.Session.Application application) {
            this.a = application.e();
            this.b = application.h();
            this.c = application.d();
            this.d = application.g();
            this.e = application.f();
            this.f = application.b();
            this.g = application.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @InterfaceC11300zs1
    public String b() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @InterfaceC11300zs1
    public String c() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @InterfaceC11300zs1
    public String d() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @InterfaceC5670cr1
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application) {
            CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
            if (this.a.equals(application.e()) && this.b.equals(application.h()) && ((str = this.c) != null ? str.equals(application.d()) : application.d() == null) && ((organization = this.d) != null ? organization.equals(application.g()) : application.g() == null) && ((str2 = this.e) != null ? str2.equals(application.f()) : application.f() == null) && ((str3 = this.f) != null ? str3.equals(application.b()) : application.b() == null) && ((str4 = this.g) != null ? str4.equals(application.c()) : application.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @InterfaceC11300zs1
    public String f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @InterfaceC11300zs1
    public CrashlyticsReport.Session.Application.Organization g() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @InterfaceC5670cr1
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization = this.d;
        if (organization == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = organization.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str3 = this.f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public CrashlyticsReport.Session.Application.Builder i() {
        return new Builder(this);
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + this.d + ", installationUuid=" + this.e + ", developmentPlatform=" + this.f + ", developmentPlatformVersion=" + this.g + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Application(String str, String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 CrashlyticsReport.Session.Application.Organization organization, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 String str5, @InterfaceC11300zs1 String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = organization;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }
}
