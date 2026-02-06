package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class CrashlyticsReportWithSessionId {
    @InterfaceC5670cr1
    public static CrashlyticsReportWithSessionId a(CrashlyticsReport crashlyticsReport, String str, File file) {
        return new AutoValue_CrashlyticsReportWithSessionId(crashlyticsReport, str, file);
    }

    public abstract CrashlyticsReport b();

    public abstract File c();

    public abstract String d();
}
