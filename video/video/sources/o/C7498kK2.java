package o;

import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import o.C6273fK2;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: o.kK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7498kK2 {
    public WebViewProviderBoundaryInterface a;

    public C7498kK2(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.a = webViewProviderBoundaryInterface;
    }

    public RY1 a(String str, String[] strArr) {
        return RY1.a(this.a.addDocumentStartJavaScript(str, strArr));
    }

    public void b(String str, String[] strArr, C6273fK2.b bVar) {
        this.a.addWebMessageListener(str, strArr, C7128ip.d(new QJ2(bVar)));
    }

    public SJ2[] c() {
        InvocationHandler[] createWebMessageChannel = this.a.createWebMessageChannel();
        SJ2[] sj2Arr = new SJ2[createWebMessageChannel.length];
        for (int i = 0; i < createWebMessageChannel.length; i++) {
            sj2Arr[i] = new TJ2(createWebMessageChannel[i]);
        }
        return sj2Arr;
    }

    public EI1 d() {
        return new FI1((ProfileBoundaryInterface) C7128ip.a(ProfileBoundaryInterface.class, this.a.getProfile()));
    }

    public WebChromeClient e() {
        return this.a.getWebChromeClient();
    }

    public WebViewClient f() {
        return this.a.getWebViewClient();
    }

    public AbstractC8245nK2 g() {
        return C9467sK2.c(this.a.getWebViewRenderer());
    }

    public AbstractC8489oK2 h() {
        InvocationHandler webViewRendererClient = this.a.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((C8732pK2) C7128ip.g(webViewRendererClient)).a();
    }

    public void i(long j, C6273fK2.a aVar) {
        this.a.insertVisualStateCallback(j, C7128ip.d(new C5541cJ2(aVar)));
    }

    public boolean j() {
        return this.a.isAudioMuted();
    }

    public void k(PJ2 pj2, Uri uri) {
        this.a.postMessageToMainFrame(C7128ip.d(new NJ2(pj2)), uri);
    }

    public void l(String str) {
        this.a.removeWebMessageListener(str);
    }

    public void m(boolean z) {
        this.a.setAudioMuted(z);
    }

    public void n(String str) {
        this.a.setProfile(str);
    }

    public void o(Executor executor, AbstractC8489oK2 abstractC8489oK2) {
        InvocationHandler invocationHandler;
        if (abstractC8489oK2 != null) {
            invocationHandler = C7128ip.d(new C8732pK2(executor, abstractC8489oK2));
        } else {
            invocationHandler = null;
        }
        this.a.setWebViewRendererClient(invocationHandler);
    }
}
