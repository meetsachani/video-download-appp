package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {
    public final String a;
    public final String b;
    public final String c;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {
        public String a;
        public String b;
        public String c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch a() {
            String str = "";
            if (this.a == null) {
                str = " arch";
            }
            if (this.b == null) {
                str = str + " libraryName";
            }
            if (this.c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @InterfaceC5670cr1
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @InterfaceC5670cr1
    public String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @InterfaceC5670cr1
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) {
            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
            if (this.a.equals(buildIdMappingForArch.b()) && this.b.equals(buildIdMappingForArch.d()) && this.c.equals(buildIdMappingForArch.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.a + ", libraryName=" + this.b + ", buildId=" + this.c + "}";
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
