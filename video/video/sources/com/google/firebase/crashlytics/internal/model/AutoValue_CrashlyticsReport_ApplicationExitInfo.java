package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> i;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {
        public Integer a;
        public String b;
        public Integer c;
        public Integer d;
        public Long e;
        public Long f;
        public Long g;
        public String h;
        public List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo a() {
            String str = "";
            if (this.a == null) {
                str = " pid";
            }
            if (this.b == null) {
                str = str + " processName";
            }
            if (this.c == null) {
                str = str + " reasonCode";
            }
            if (this.d == null) {
                str = str + " importance";
            }
            if (this.e == null) {
                str = str + " pss";
            }
            if (this.f == null) {
                str = str + " rss";
            }
            if (this.g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.a.intValue(), this.b, this.c.intValue(), this.d.intValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder b(@InterfaceC11300zs1 List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
            this.i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder c(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder f(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder g(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder i(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder j(@InterfaceC11300zs1 String str) {
            this.h = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @InterfaceC11300zs1
    public List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> b() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @InterfaceC5670cr1
    public int c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @InterfaceC5670cr1
    public int d() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @InterfaceC5670cr1
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.ApplicationExitInfo) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
            if (this.a == applicationExitInfo.d() && this.b.equals(applicationExitInfo.e()) && this.c == applicationExitInfo.g() && this.d == applicationExitInfo.c() && this.e == applicationExitInfo.f() && this.f == applicationExitInfo.h() && this.g == applicationExitInfo.i() && ((str = this.h) != null ? str.equals(applicationExitInfo.j()) : applicationExitInfo.j() == null) && ((list = this.i) != null ? list.equals(applicationExitInfo.b()) : applicationExitInfo.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @InterfaceC5670cr1
    public long f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @InterfaceC5670cr1
    public int g() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @InterfaceC5670cr1
    public long h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode;
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        int hashCode2 = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.i;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @InterfaceC5670cr1
    public long i() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @InterfaceC11300zs1
    public String j() {
        return this.h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo(int i, String str, int i2, int i3, long j, long j2, long j3, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }
}
