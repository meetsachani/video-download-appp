package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import o.C2638Cg0;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.ay  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1319ay extends WebView {
    public static byte[] A01;
    public static final String A02;
    public boolean A00;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A01 = new byte[]{C2638Cg0.C7, -4, 4, 7, 0, -1, -69, C8077mf.q, 10, -69, 4, 9, 4, C8077mf.q, 4, -4, 7, 4, C8077mf.y, 0, -69, -34, 10, 10, 6, 4, 0, -24, -4, 9, -4, 2, 0, 13, C2638Cg0.v7, -70, -71, -125, C2638Cg0.t7, -43, -60, -42, C2638Cg0.x7, -56, C2638Cg0.u7, ED2.a, 54, 75, 54, 72, 56, 71, 62, 69, 73, C8077mf.q, -4, -22, -25, -28, -5, -18, -22, -4};
    }

    public abstract WebChromeClient A0G();

    public abstract WebViewClient A0H();

    static {
        A0C();
        A02 = AbstractC1319ay.class.getSimpleName();
    }

    public AbstractC1319ay(Activity activity, C1673gi c1673gi) {
        super(activity);
        A0E(c1673gi);
    }

    public AbstractC1319ay(C1673gi c1673gi) {
        super(c1673gi);
        A0E(c1673gi);
    }

    public static void A0D(int i) {
        C1669ge context = T7.A00();
        if (context != null) {
            context.A08().ABC(A0B(56, 8, 37), i, new C1086Te(A0B(35, 10, 3)));
        }
    }

    private void A0E(T8 t8) {
        setWebChromeClient(A0G());
        setWebViewClient(A0H());
        AbstractC1325b4.A04(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        if (t8.A05().AAO()) {
            setWebContentsDebuggingEnabled(true);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        } catch (Exception unused) {
            Log.w(A02, A0B(0, 35, 59));
        }
    }

    private void A0F(String str) {
        loadUrl(A0B(45, 11, 117) + str);
    }

    public final void A0I(String str) {
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            A0F(str);
        }
    }

    public final boolean A0J() {
        return this.A00;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.A00 = true;
        super.destroy();
    }
}
