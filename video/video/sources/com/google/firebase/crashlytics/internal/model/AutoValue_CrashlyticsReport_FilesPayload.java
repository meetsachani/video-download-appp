package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {
    public final List<CrashlyticsReport.FilesPayload.File> a;
    public final String b;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.FilesPayload.Builder {
        public List<CrashlyticsReport.FilesPayload.File> a;
        public String b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload a() {
            String str = "";
            if (this.a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder b(List<CrashlyticsReport.FilesPayload.File> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder c(String str) {
            this.b = str;
            return this;
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport.FilesPayload filesPayload) {
            this.a = filesPayload.b();
            this.b = filesPayload.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @InterfaceC5670cr1
    public List<CrashlyticsReport.FilesPayload.File> b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @InterfaceC11300zs1
    public String c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public CrashlyticsReport.FilesPayload.Builder d() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.FilesPayload) {
            CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
            if (this.a.equals(filesPayload.b()) && ((str = this.b) != null ? str.equals(filesPayload.c()) : filesPayload.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }

    public AutoValue_CrashlyticsReport_FilesPayload(List<CrashlyticsReport.FilesPayload.File> list, @InterfaceC11300zs1 String str) {
        this.a = list;
        this.b = str;
    }
}
