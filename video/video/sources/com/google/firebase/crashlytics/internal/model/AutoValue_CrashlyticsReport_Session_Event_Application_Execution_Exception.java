package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception extends CrashlyticsReport.Session.Event.Application.Execution.Exception {
    public final String a;
    public final String b;
    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> c;
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception d;
    public final int e;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {
        public String a;
        public String b;
        public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> c;
        public CrashlyticsReport.Session.Event.Application.Execution.Exception d;
        public Integer e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception a() {
            String str = "";
            if (this.a == null) {
                str = " type";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (this.e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder b(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.d = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder c(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder d(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder e(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @InterfaceC11300zs1
    public CrashlyticsReport.Session.Event.Application.Execution.Exception b() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @InterfaceC5670cr1
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public int d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @InterfaceC11300zs1
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
            if (this.a.equals(exception2.f()) && ((str = this.b) != null ? str.equals(exception2.e()) : exception2.e() == null) && this.c.equals(exception2.c()) && ((exception = this.d) != null ? exception.equals(exception2.b()) : exception2.b() == null) && this.e == exception2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @InterfaceC5670cr1
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.d;
        if (exception != null) {
            i = exception.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(String str, @InterfaceC11300zs1 String str2, List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list, @InterfaceC11300zs1 CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = exception;
        this.e = i;
    }
}
