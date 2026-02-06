package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final CrashlyticsReport.Session.Application g;
    public final CrashlyticsReport.Session.User h;
    public final CrashlyticsReport.Session.OperatingSystem i;
    public final CrashlyticsReport.Session.Device j;
    public final List<CrashlyticsReport.Session.Event> k;
    public final int l;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Builder {
        public String a;
        public String b;
        public String c;
        public Long d;
        public Long e;
        public Boolean f;
        public CrashlyticsReport.Session.Application g;
        public CrashlyticsReport.Session.User h;
        public CrashlyticsReport.Session.OperatingSystem i;
        public CrashlyticsReport.Session.Device j;
        public List<CrashlyticsReport.Session.Event> k;
        public Integer l;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session a() {
            String str = "";
            if (this.a == null) {
                str = " generator";
            }
            if (this.b == null) {
                str = str + " identifier";
            }
            if (this.d == null) {
                str = str + " startedAt";
            }
            if (this.f == null) {
                str = str + " crashed";
            }
            if (this.g == null) {
                str = str + " app";
            }
            if (this.l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session(this.a, this.b, this.c, this.d.longValue(), this.e, this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder b(CrashlyticsReport.Session.Application application) {
            if (application != null) {
                this.g = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder c(@InterfaceC11300zs1 String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder d(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder e(CrashlyticsReport.Session.Device device) {
            this.j = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder f(Long l) {
            this.e = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder g(List<CrashlyticsReport.Session.Event> list) {
            this.k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder h(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder i(int i) {
            this.l = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder j(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder l(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.i = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder m(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder n(CrashlyticsReport.Session.User user) {
            this.h = user;
            return this;
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport.Session session) {
            this.a = session.g();
            this.b = session.i();
            this.c = session.c();
            this.d = Long.valueOf(session.l());
            this.e = session.e();
            this.f = Boolean.valueOf(session.n());
            this.g = session.b();
            this.h = session.m();
            this.i = session.k();
            this.j = session.d();
            this.k = session.f();
            this.l = Integer.valueOf(session.h());
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @InterfaceC5670cr1
    public CrashlyticsReport.Session.Application b() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @InterfaceC11300zs1
    public String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @InterfaceC11300zs1
    public CrashlyticsReport.Session.Device d() {
        return this.j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @InterfaceC11300zs1
    public Long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        List<CrashlyticsReport.Session.Event> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session) {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            if (this.a.equals(session.g()) && this.b.equals(session.i()) && ((str = this.c) != null ? str.equals(session.c()) : session.c() == null) && this.d == session.l() && ((l = this.e) != null ? l.equals(session.e()) : session.e() == null) && this.f == session.n() && this.g.equals(session.b()) && ((user = this.h) != null ? user.equals(session.m()) : session.m() == null) && ((operatingSystem = this.i) != null ? operatingSystem.equals(session.k()) : session.k() == null) && ((device = this.j) != null ? device.equals(session.d()) : session.d() == null) && ((list = this.k) != null ? list.equals(session.f()) : session.f() == null) && this.l == session.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @InterfaceC11300zs1
    public List<CrashlyticsReport.Session.Event> f() {
        return this.k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @InterfaceC5670cr1
    public String g() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public int h() {
        return this.l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.d;
        int i3 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode7 = (((i4 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.h;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i5 = (hashCode7 ^ hashCode3) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.i;
        if (operatingSystem == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = operatingSystem.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        CrashlyticsReport.Session.Device device = this.j;
        if (device == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = device.hashCode();
        }
        int i7 = (i6 ^ hashCode5) * 1000003;
        List<CrashlyticsReport.Session.Event> list = this.k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((i7 ^ i2) * 1000003) ^ this.l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Encodable.Ignore
    @InterfaceC5670cr1
    public String i() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @InterfaceC11300zs1
    public CrashlyticsReport.Session.OperatingSystem k() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public long l() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @InterfaceC11300zs1
    public CrashlyticsReport.Session.User m() {
        return this.h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public boolean n() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Builder o() {
        return new Builder(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", appQualitySessionId=" + this.c + ", startedAt=" + this.d + ", endedAt=" + this.e + ", crashed=" + this.f + ", app=" + this.g + ", user=" + this.h + ", os=" + this.i + ", device=" + this.j + ", events=" + this.k + ", generatorType=" + this.l + "}";
    }

    public AutoValue_CrashlyticsReport_Session(String str, String str2, @InterfaceC11300zs1 String str3, long j, @InterfaceC11300zs1 Long l, boolean z, CrashlyticsReport.Session.Application application, @InterfaceC11300zs1 CrashlyticsReport.Session.User user, @InterfaceC11300zs1 CrashlyticsReport.Session.OperatingSystem operatingSystem, @InterfaceC11300zs1 CrashlyticsReport.Session.Device device, @InterfaceC11300zs1 List<CrashlyticsReport.Session.Event> list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = application;
        this.h = user;
        this.i = operatingSystem;
        this.j = device;
        this.k = list;
        this.l = i;
    }
}
