package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {
    public final long a;
    public final String b;
    public final CrashlyticsReport.Session.Event.Application c;
    public final CrashlyticsReport.Session.Event.Device d;
    public final CrashlyticsReport.Session.Event.Log e;
    public final CrashlyticsReport.Session.Event.RolloutsState f;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Builder {
        public Long a;
        public String b;
        public CrashlyticsReport.Session.Event.Application c;
        public CrashlyticsReport.Session.Event.Device d;
        public CrashlyticsReport.Session.Event.Log e;
        public CrashlyticsReport.Session.Event.RolloutsState f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event a() {
            String str = "";
            if (this.a == null) {
                str = " timestamp";
            }
            if (this.b == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " app";
            }
            if (this.d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.a.longValue(), this.b, this.c, this.d, this.e, this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder b(CrashlyticsReport.Session.Event.Application application) {
            if (application != null) {
                this.c = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder c(CrashlyticsReport.Session.Event.Device device) {
            if (device != null) {
                this.d = device;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder d(CrashlyticsReport.Session.Event.Log log) {
            this.e = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder e(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.f = rolloutsState;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport.Session.Event event) {
            this.a = Long.valueOf(event.f());
            this.b = event.g();
            this.c = event.b();
            this.d = event.c();
            this.e = event.d();
            this.f = event.e();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @InterfaceC5670cr1
    public CrashlyticsReport.Session.Event.Application b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @InterfaceC5670cr1
    public CrashlyticsReport.Session.Event.Device c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @InterfaceC11300zs1
    public CrashlyticsReport.Session.Event.Log d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @InterfaceC11300zs1
    public CrashlyticsReport.Session.Event.RolloutsState e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.Session.Event.Log log;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event) {
            CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
            if (this.a == event.f() && this.b.equals(event.g()) && this.c.equals(event.b()) && this.d.equals(event.c()) && ((log = this.e) != null ? log.equals(event.d()) : event.d() == null) && ((rolloutsState = this.f) != null ? rolloutsState.equals(event.e()) : event.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public long f() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @InterfaceC5670cr1
    public String g() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public CrashlyticsReport.Session.Event.Builder h() {
        return new Builder(this);
    }

    public int hashCode() {
        int hashCode;
        long j = this.a;
        int hashCode2 = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log = this.e;
        int i = 0;
        if (log == null) {
            hashCode = 0;
        } else {
            hashCode = log.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f;
        if (rolloutsState != null) {
            i = rolloutsState.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, @InterfaceC11300zs1 CrashlyticsReport.Session.Event.Log log, @InterfaceC11300zs1 CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.a = j;
        this.b = str;
        this.c = application;
        this.d = device;
        this.e = log;
        this.f = rolloutsState;
    }
}
