package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzble;
import o.ES1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@ES1(api = 21)
/* loaded from: classes2.dex */
public final class H5AdsWebViewClient extends zzbkr {
    public final zzble a;

    public H5AdsWebViewClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 WebView webView) {
        this.a = new zzble(context, webView);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    @InterfaceC5670cr1
    public WebViewClient a() {
        return this.a;
    }

    public void b() {
        this.a.b();
    }

    @InterfaceC11300zs1
    public WebViewClient c() {
        return this.a.a();
    }

    public void d(@InterfaceC11300zs1 WebViewClient webViewClient) {
        this.a.c(webViewClient);
    }
}
