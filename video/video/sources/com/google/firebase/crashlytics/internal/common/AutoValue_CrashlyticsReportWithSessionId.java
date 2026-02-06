package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {
    public final CrashlyticsReport a;
    public final String b;
    public final File c;

    public AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport != null) {
            this.a = crashlyticsReport;
            if (str != null) {
                this.b = str;
                if (file != null) {
                    this.c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public CrashlyticsReport b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public File c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReportWithSessionId) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
            if (this.a.equals(crashlyticsReportWithSessionId.b()) && this.b.equals(crashlyticsReportWithSessionId.d()) && this.c.equals(crashlyticsReportWithSessionId.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
