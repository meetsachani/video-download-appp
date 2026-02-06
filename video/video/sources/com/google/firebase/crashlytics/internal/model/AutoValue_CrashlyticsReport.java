package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport extends CrashlyticsReport {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final CrashlyticsReport.Session j;
    public final CrashlyticsReport.FilesPayload k;
    public final CrashlyticsReport.ApplicationExitInfo l;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Builder {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public CrashlyticsReport.Session i;
        public CrashlyticsReport.FilesPayload j;
        public CrashlyticsReport.ApplicationExitInfo k;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport a() {
            String str = "";
            if (this.a == null) {
                str = " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.d == null) {
                str = str + " installationUuid";
            }
            if (this.g == null) {
                str = str + " buildVersion";
            }
            if (this.h == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.k = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder c(@InterfaceC11300zs1 String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder d(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder e(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder f(@InterfaceC11300zs1 String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder h(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder i(CrashlyticsReport.FilesPayload filesPayload) {
            this.j = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder j(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder k(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder l(CrashlyticsReport.Session session) {
            this.i = session;
            return this;
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport crashlyticsReport) {
            this.a = crashlyticsReport.l();
            this.b = crashlyticsReport.h();
            this.c = Integer.valueOf(crashlyticsReport.k());
            this.d = crashlyticsReport.i();
            this.e = crashlyticsReport.g();
            this.f = crashlyticsReport.d();
            this.g = crashlyticsReport.e();
            this.h = crashlyticsReport.f();
            this.i = crashlyticsReport.m();
            this.j = crashlyticsReport.j();
            this.k = crashlyticsReport.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC11300zs1
    public CrashlyticsReport.ApplicationExitInfo c() {
        return this.l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC11300zs1
    public String d() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC5670cr1
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        CrashlyticsReport.Session session;
        CrashlyticsReport.FilesPayload filesPayload;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            if (this.b.equals(crashlyticsReport.l()) && this.c.equals(crashlyticsReport.h()) && this.d == crashlyticsReport.k() && this.e.equals(crashlyticsReport.i()) && ((str = this.f) != null ? str.equals(crashlyticsReport.g()) : crashlyticsReport.g() == null) && ((str2 = this.g) != null ? str2.equals(crashlyticsReport.d()) : crashlyticsReport.d() == null) && this.h.equals(crashlyticsReport.e()) && this.i.equals(crashlyticsReport.f()) && ((session = this.j) != null ? session.equals(crashlyticsReport.m()) : crashlyticsReport.m() == null) && ((filesPayload = this.k) != null ? filesPayload.equals(crashlyticsReport.j()) : crashlyticsReport.j() == null) && ((applicationExitInfo = this.l) != null ? applicationExitInfo.equals(crashlyticsReport.c()) : crashlyticsReport.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC5670cr1
    public String f() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC11300zs1
    public String g() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC5670cr1
    public String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i2 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.j;
        if (session == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = session.hashCode();
        }
        int i3 = (hashCode6 ^ hashCode3) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.k;
        if (filesPayload == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = filesPayload.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.l;
        if (applicationExitInfo != null) {
            i = applicationExitInfo.hashCode();
        }
        return i4 ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC5670cr1
    public String i() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC11300zs1
    public CrashlyticsReport.FilesPayload j() {
        return this.k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int k() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC5670cr1
    public String l() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @InterfaceC11300zs1
    public CrashlyticsReport.Session m() {
        return this.j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.Builder o() {
        return new Builder(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", appQualitySessionId=" + this.g + ", buildVersion=" + this.h + ", displayVersion=" + this.i + ", session=" + this.j + ", ndkPayload=" + this.k + ", appExitInfo=" + this.l + "}";
    }

    public AutoValue_CrashlyticsReport(String str, String str2, int i, String str3, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 String str5, String str6, String str7, @InterfaceC11300zs1 CrashlyticsReport.Session session, @InterfaceC11300zs1 CrashlyticsReport.FilesPayload filesPayload, @InterfaceC11300zs1 CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = session;
        this.k = filesPayload;
        this.l = applicationExitInfo;
    }
}
