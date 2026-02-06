package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class AndroidLogHandler extends Handler {
    @NotNull
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(@NotNull LogRecord logRecord) {
        C6562gT0.p(logRecord, "record");
        AndroidLog androidLog = AndroidLog.INSTANCE;
        String loggerName = logRecord.getLoggerName();
        C6562gT0.o(loggerName, "record.loggerName");
        int access$getAndroidLevel = AndroidLogKt.access$getAndroidLevel(logRecord);
        String message = logRecord.getMessage();
        C6562gT0.o(message, "record.message");
        androidLog.androidLog$okhttp(loggerName, access$getAndroidLevel, message, logRecord.getThrown());
    }
}
