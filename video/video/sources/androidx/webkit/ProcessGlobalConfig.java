package androidx.webkit;

import android.content.Context;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import o.C6515gH1;
import o.C6771hK2;
import o.C8304nb;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* loaded from: classes.dex */
public class ProcessGlobalConfig {
    public String a;
    public String b;
    public String c;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();
    public static final Object d = new Object();
    public static boolean e = false;

    public static void a(ProcessGlobalConfig processGlobalConfig) {
        synchronized (d) {
            if (!e) {
                e = true;
            } else {
                throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
        }
        HashMap hashMap = new HashMap();
        if (!d()) {
            if (processGlobalConfig.a != null) {
                if (C6771hK2.M.e()) {
                    C8304nb.e(processGlobalConfig.a);
                } else {
                    hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, processGlobalConfig.a);
                }
            }
            String str = processGlobalConfig.b;
            if (str != null) {
                hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str);
            }
            String str2 = processGlobalConfig.c;
            if (str2 != null) {
                hashMap.put(ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str2);
            }
            if (C6515gH1.a(sProcessGlobalConfig, null, hashMap)) {
                return;
            }
            throw new RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
        }
        throw new IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
    }

    public static boolean d() {
        Field declaredField;
        try {
            declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        if (declaredField.get(null) == null) {
            return false;
        }
        return true;
    }

    public ProcessGlobalConfig b(Context context, String str) {
        if (C6771hK2.M.d(context)) {
            if (!str.equals("")) {
                if (str.indexOf(File.separatorChar) < 0) {
                    this.a = str;
                    return this;
                }
                throw new IllegalArgumentException("Suffix " + str + " contains a path separator");
            }
            throw new IllegalArgumentException("Suffix cannot be an empty string");
        }
        throw C6771hK2.a();
    }

    public ProcessGlobalConfig c(Context context, File file, File file2) {
        if (C6771hK2.N.d(context)) {
            if (file.isAbsolute()) {
                if (file2.isAbsolute()) {
                    this.b = file.getAbsolutePath();
                    this.c = file2.getAbsolutePath();
                    return this;
                }
                throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
            }
            throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
        }
        throw C6771hK2.a();
    }
}
