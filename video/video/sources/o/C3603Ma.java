package o;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import o.C6273fK2;
import o.SJ2;

/* renamed from: o.Ma  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3603Ma {

    /* renamed from: o.Ma$a */
    /* loaded from: classes.dex */
    public class a extends WebMessagePort.WebMessageCallback {
        public final /* synthetic */ SJ2.a a;

        public a(SJ2.a aVar) {
            this.a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.a.a(new TJ2(webMessagePort), TJ2.i(webMessage));
        }
    }

    /* renamed from: o.Ma$b */
    /* loaded from: classes.dex */
    public class b extends WebMessagePort.WebMessageCallback {
        public final /* synthetic */ SJ2.a a;

        public b(SJ2.a aVar) {
            this.a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.a.a(new TJ2(webMessagePort), TJ2.i(webMessage));
        }
    }

    /* renamed from: o.Ma$c */
    /* loaded from: classes.dex */
    public class c extends WebView.VisualStateCallback {
        public final /* synthetic */ C6273fK2.a a;

        public c(C6273fK2.a aVar) {
            this.a = aVar;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j) {
            this.a.onComplete(j);
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(PJ2 pj2) {
        return new WebMessage(pj2.c(), TJ2.h(pj2.d()));
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static PJ2 d(WebMessage webMessage) {
        return new PJ2(webMessage.getData(), TJ2.l(webMessage.getPorts()));
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j, C6273fK2.a aVar) {
        webView.postVisualStateCallback(j, new c(aVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    public static void l(WebMessagePort webMessagePort, SJ2.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, SJ2.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(aVar), handler);
    }
}
