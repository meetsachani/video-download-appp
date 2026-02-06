package o;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* renamed from: o.kA0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7456kA0 extends ServiceWorkerClient {
    public final N12 a;

    public C7456kA0(N12 n12) {
        this.a = n12;
    }

    @Override // android.webkit.ServiceWorkerClient
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.a.a(webResourceRequest);
    }
}
