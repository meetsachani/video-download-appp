package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;

/* renamed from: o.jQ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7276jQ {
    public static final String a = "_COROUTINE";

    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(a + '.' + str, CrashlyticsReportPersistence.m, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final String c() {
        return a;
    }
}
