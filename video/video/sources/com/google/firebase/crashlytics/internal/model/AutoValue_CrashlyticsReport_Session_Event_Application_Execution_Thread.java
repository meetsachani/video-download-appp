package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread extends CrashlyticsReport.Session.Event.Application.Execution.Thread {
    public final String a;
    public final int b;
    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> c;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {
        public String a;
        public Integer b;
        public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " importance";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder b(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @InterfaceC5670cr1
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @InterfaceC5670cr1
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
            if (this.a.equals(thread.d()) && this.b == thread.c() && this.c.equals(thread.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String str, int i, List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }
}
