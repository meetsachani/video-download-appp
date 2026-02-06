package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.Session.Event.Application.Execution {
    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread> a;
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception b;
    public final CrashlyticsReport.ApplicationExitInfo c;
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal d;
    public final List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> e;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Builder {
        public List<CrashlyticsReport.Session.Event.Application.Execution.Thread> a;
        public CrashlyticsReport.Session.Event.Application.Execution.Exception b;
        public CrashlyticsReport.ApplicationExitInfo c;
        public CrashlyticsReport.Session.Event.Application.Execution.Signal d;
        public List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution a() {
            String str = "";
            if (this.d == null) {
                str = " signal";
            }
            if (this.e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.c = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder c(List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> list) {
            if (list != null) {
                this.e = list;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder d(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.b = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder e(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal != null) {
                this.d = signal;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder f(List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list) {
            this.a = list;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @InterfaceC11300zs1
    public CrashlyticsReport.ApplicationExitInfo b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @InterfaceC5670cr1
    public List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> c() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @InterfaceC11300zs1
    public CrashlyticsReport.Session.Event.Application.Execution.Exception d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @InterfaceC5670cr1
    public CrashlyticsReport.Session.Event.Application.Execution.Signal e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
            List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list = this.a;
            if (list != null ? list.equals(execution.f()) : execution.f() == null) {
                CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.b;
                if (exception != null ? exception.equals(execution.d()) : execution.d() == null) {
                    CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.c;
                    if (applicationExitInfo != null ? applicationExitInfo.equals(execution.b()) : execution.b() == null) {
                        if (this.d.equals(execution.e()) && this.e.equals(execution.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @InterfaceC11300zs1
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread> f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list = this.a;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.b;
        if (exception == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = exception.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.c;
        if (applicationExitInfo != null) {
            i = applicationExitInfo.hashCode();
        }
        return ((((i3 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution(@InterfaceC11300zs1 List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list, @InterfaceC11300zs1 CrashlyticsReport.Session.Event.Application.Execution.Exception exception, @InterfaceC11300zs1 CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> list2) {
        this.a = list;
        this.b = exception;
        this.c = applicationExitInfo;
        this.d = signal;
        this.e = list2;
    }
}
