package o;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* renamed from: o.nb */
/* loaded from: classes.dex */
public class C8304nb {
    public static TracingController a() {
        TracingController tracingController;
        tracingController = TracingController.getInstance();
        return tracingController;
    }

    public static ClassLoader b() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    public static Looper c(WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }

    public static boolean d(TracingController tracingController) {
        boolean isTracing;
        isTracing = tracingController.isTracing();
        return isTracing;
    }

    public static void e(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(TracingController tracingController, C7867lr2 c7867lr2) {
        TracingConfig.Builder addCategories;
        TracingConfig.Builder addCategories2;
        TracingConfig.Builder tracingMode;
        TracingConfig build;
        addCategories = C5847db.a().addCategories(c7867lr2.b());
        addCategories2 = addCategories.addCategories(c7867lr2.a());
        tracingMode = addCategories2.setTracingMode(c7867lr2.c());
        build = tracingMode.build();
        tracingController.start(build);
    }

    public static boolean g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        boolean stop;
        stop = tracingController.stop(outputStream, executor);
        return stop;
    }
}
