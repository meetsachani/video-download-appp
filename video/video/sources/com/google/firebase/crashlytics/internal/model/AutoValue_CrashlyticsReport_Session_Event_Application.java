package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {
    public final CrashlyticsReport.Session.Event.Application.Execution a;
    public final List<CrashlyticsReport.CustomAttribute> b;
    public final List<CrashlyticsReport.CustomAttribute> c;
    public final Boolean d;
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails e;
    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> f;
    public final int g;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {
        public CrashlyticsReport.Session.Event.Application.Execution a;
        public List<CrashlyticsReport.CustomAttribute> b;
        public List<CrashlyticsReport.CustomAttribute> c;
        public Boolean d;
        public CrashlyticsReport.Session.Event.Application.ProcessDetails e;
        public List<CrashlyticsReport.Session.Event.Application.ProcessDetails> f;
        public Integer g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application a() {
            String str = "";
            if (this.a == null) {
                str = " execution";
            }
            if (this.g == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.a, this.b, this.c, this.d, this.e, this.f, this.g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder b(@InterfaceC11300zs1 List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list) {
            this.f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder c(@InterfaceC11300zs1 Boolean bool) {
            this.d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder d(@InterfaceC11300zs1 CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.e = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder e(List<CrashlyticsReport.CustomAttribute> list) {
            this.b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder f(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution != null) {
                this.a = execution;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder g(List<CrashlyticsReport.CustomAttribute> list) {
            this.c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder h(int i) {
            this.g = Integer.valueOf(i);
            return this;
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport.Session.Event.Application application) {
            this.a = application.f();
            this.b = application.e();
            this.c = application.g();
            this.d = application.c();
            this.e = application.d();
            this.f = application.b();
            this.g = Integer.valueOf(application.h());
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @InterfaceC11300zs1
    public List<CrashlyticsReport.Session.Event.Application.ProcessDetails> b() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @InterfaceC11300zs1
    public Boolean c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @InterfaceC11300zs1
    public CrashlyticsReport.Session.Event.Application.ProcessDetails d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @InterfaceC11300zs1
    public List<CrashlyticsReport.CustomAttribute> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        List<CrashlyticsReport.CustomAttribute> list;
        List<CrashlyticsReport.CustomAttribute> list2;
        Boolean bool;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails;
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application) {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
            if (this.a.equals(application.f()) && ((list = this.b) != null ? list.equals(application.e()) : application.e() == null) && ((list2 = this.c) != null ? list2.equals(application.g()) : application.g() == null) && ((bool = this.d) != null ? bool.equals(application.c()) : application.c() == null) && ((processDetails = this.e) != null ? processDetails.equals(application.d()) : application.d() == null) && ((list3 = this.f) != null ? list3.equals(application.b()) : application.b() == null) && this.g == application.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @InterfaceC5670cr1
    public CrashlyticsReport.Session.Event.Application.Execution f() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @InterfaceC11300zs1
    public List<CrashlyticsReport.CustomAttribute> g() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public int h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.a.hashCode() ^ 1000003) * 1000003;
        List<CrashlyticsReport.CustomAttribute> list = this.b;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        List<CrashlyticsReport.CustomAttribute> list2 = this.c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.e;
        if (processDetails == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = processDetails.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3 = this.f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return ((i5 ^ i) * 1000003) ^ this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Builder i() {
        return new Builder(this);
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ", uiOrientation=" + this.g + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, @InterfaceC11300zs1 List<CrashlyticsReport.CustomAttribute> list, @InterfaceC11300zs1 List<CrashlyticsReport.CustomAttribute> list2, @InterfaceC11300zs1 Boolean bool, @InterfaceC11300zs1 CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, @InterfaceC11300zs1 List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3, int i) {
        this.a = execution;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = processDetails;
        this.f = list3;
        this.g = i;
    }
}
