package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C10763xf2;
import o.C2832Ef2;
import o.C6562gT0;
import o.C8926q81;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressSignatureCheck
/* loaded from: classes4.dex */
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;
    @NotNull
    private static final Map<String, String> knownLoggers;
    @NotNull
    public static final AndroidLog INSTANCE = new AndroidLog();
    @NotNull
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        if (r2 != null) {
            str = r2.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = OkHttpClient.class.getName();
        C6562gT0.o(name, "OkHttpClient::class.java.name");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = Http2.class.getName();
        C6562gT0.o(name2, "Http2::class.java.name");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = TaskRunner.class.getName();
        C6562gT0.o(name3, "TaskRunner::class.java.name");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = C8926q81.D0(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = knownLoggers.get(str);
        if (str2 == null) {
            return C2832Ef2.A9(str, 23);
        }
        return str2;
    }

    public final void androidLog$okhttp(@NotNull String str, int i, @NotNull String str2, @Nullable Throwable th) {
        int min;
        C6562gT0.p(str, "loggerName");
        C6562gT0.p(str2, "message");
        String loggerTag = loggerTag(str);
        if (Log.isLoggable(loggerTag, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            String str3 = str2;
            int length = str3.length();
            int i2 = 0;
            while (i2 < length) {
                int I3 = C10763xf2.I3(str3, '\n', i2, false, 4, null);
                if (I3 == -1) {
                    I3 = length;
                }
                while (true) {
                    min = Math.min(I3, i2 + 4000);
                    String substring = str3.substring(i2, min);
                    C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, loggerTag, substring);
                    if (min >= I3) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }
}
