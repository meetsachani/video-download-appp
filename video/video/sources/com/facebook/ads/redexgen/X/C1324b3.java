package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C9276rZ;
import o.ED2;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.b3  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1324b3 extends WebViewClient {
    public static byte[] A0B;
    public static String[] A0C = {"zsPwasR1y7408", "ZGgsKLkccpHpwEVEMRkr0P5MO", "FzTF8imkK53ZXE3O7c0sd3pyoR5CtRCL", "JPkvHHHSAaAEWhLae7UVRehZAXg5QbZs", "c", "Jl8ZDZjQ485DOmiNP3uI8E", "DJVtCfMEOJ4BXbKH6y5pb3wK31xmWsao", "K"};
    public Date A00;
    public boolean A01 = false;
    public final C1673gi A02;
    public final WeakReference<LV> A03;
    public final WeakReference<InterfaceC1322b1> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<Y2> A06;
    public final WeakReference<C1618fp> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;
    public final boolean A0A;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {8, C3307Iz.Y, 40, C3307Iz.e0, 42, -14, 8, 52, 51, 57, 55, 52, 49, -69, -36, -27, -32, -36, -37, 28, 77, 56, 67, 76, 56, 75, 64, 69, 62, -9, C3307Iz.d0, C3307Iz.a0, 32, -9, C3307Iz.Z, 56, 75, ED2.a, -9, C4715Xk.i, 70, 73, -9, C8077mf.G, 64, 67, 60, -9, C8077mf.B, 58, 58, 60, 74, 74, -9, -46, 5, 1, -1, -18, -83, -15, -18, 1, -18, C2638Cg0.u7, -83, 60, 72, 72, 68, C8077mf.x, 57, 102, 102, 99, 102, 59, 84, 89, 71, 76, 75, 6, 56, 75, 87, 91, 75, 89, 90, 6, 76, 85, 88, 6, C3307Iz.d0, 79, 82, 75, 6, C3307Iz.Z, 73, 73, 75, 89, 89, 6, 34, 59, 64, C3307Iz.f0, 51, 50, -19, 31, 50, 62, 66, 50, 64, 65, -19, 51, 60, ED2.a, -19, 19, 54, 57, 50, -19, C8077mf.p, 48, 48, 50, 64, 64, -19, 49, 50, 59, 54, 50, 49, 67, 68, 77, 72, 68, 67, 62, 84, 81, 72, 62, 79, 64, 83, 71, 64, 59, 80, 67, C4715Xk.i, 73, 72, 8, 67, C4715Xk.i, 73, C3307Iz.a0, C3307Iz.d0, 47, 40, C8077mf.A, C8077mf.p, C8077mf.G, -29, -29, -18, -5, -5, 8, -18, -10, -7, -3, 2, 8, -5, -18, -4, -7, -8, -9, -4, -18, C8077mf.E, 28, C2638Cg0.B7, 32, C3307Iz.V, 28, 31, C8077mf.u, 98, 85, 97, 101, 85, 99, 100, 79, 89, 84, 78, ED2.a, 82, 78, 9, 74, 70, 59, 67, 72, 5, -16, -5, -8, -13, -18, -1, -16, 3, -9, 55, C3307Iz.X, 34, 31, 54, C3307Iz.a0, C3307Iz.X, 55};
        String[] strArr = A0C;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[3] = "rhE0g4ovzatryzU62WuE8blUNequGZ6x";
        strArr2[6] = "8iaaY9YuVC21lqcoOxYFj2DPKFldlJdP";
        A0B = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A09(String str, List<String> list) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        for (String str2 : list) {
            if (lowerCase.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    static {
        A02();
    }

    public C1324b3(C1673gi c1673gi, WeakReference<InterfaceC1322b1> weakReference, WeakReference<C1618fp> weakReference2, WeakReference<Y2> weakReference3, WeakReference<AtomicBoolean> checkAssetsByJavascriptBridge, WeakReference<LV> weakReference4, AtomicInteger atomicInteger, AtomicReference<String> requestId, boolean z) {
        this.A02 = c1673gi;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = checkAssetsByJavascriptBridge;
        this.A03 = weakReference4;
        this.A08 = atomicInteger;
        this.A09 = requestId;
        this.A0A = z;
    }

    private WebResourceResponse A00() {
        return new WebResourceResponse(A01(216, 10, 100), StandardCharsets.UTF_8.name(), 403, A01(13, 6, 1), Collections.singletonMap(A01(0, 13, 79), A01(198, 8, 55)), new ByteArrayInputStream(A01(13, 6, 1).getBytes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(int i, String str) {
        if (A01(175, 23, 51).equals(str)) {
            this.A02.A0F().AKx();
            return;
        }
        this.A02.A0F().AKy(i, str);
        if (this.A04.get() != null) {
            this.A04.get().ADu(i, str);
        }
    }

    private final void A04(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A01(160, 11, 100))) {
            return;
        }
        this.A02.A0F().AL2(webResourceResponse.getStatusCode(), AbstractC1182Xb.A01(webResourceResponse.getStatusCode(), A01(67, 10, 126), A01(0, 0, 53) + webResourceRequest.getUrl()));
    }

    private void A06(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(C3503Kz.i0, 15, 105), str);
            jSONObject.put(A01(C9276rZ.p, 10, 25), str2);
            jSONObject.put(A01(206, 10, 122), this.A09.get());
        } catch (JSONException unused) {
        }
        if (this.A02 != null) {
            this.A02.A08().ABC(A01(236, 8, 74), AbstractC1085Td.A2c, new C1086Te(AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r4 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        r4 = new java.lang.StringBuilder();
        r0 = A01(19, 36, 97);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
        r5 = com.facebook.ads.redexgen.X.C1079Sx.A09(r7.A02);
        r6 = A09(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
        r4 = new java.lang.StringBuilder();
        r0 = A01(77, 31, 112);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
        r4 = com.facebook.ads.redexgen.X.LV.A0H;
        r0 = A01(108, 37, 87);
        android.util.Log.w(r4, r0);
        r0 = r5.toString();
        A06(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r4 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A07(Uri uri) {
        String path = uri.getPath();
        String scheme = uri.getScheme();
        if (path == null || scheme == null) {
            return true;
        }
        String[] strArr = A0C;
        String scheme2 = strArr[3];
        String path2 = strArr[6];
        if (scheme2.length() != path2.length()) {
            throw new RuntimeException();
        }
        A0C[5] = "5na5yijD7UxFpHVkXXcSH2RW6Zg";
        String path3 = A01(171, 4, 77);
        if (scheme.equals(path3)) {
            boolean isDebug = BuildConfigApi.isDebug();
            String[] strArr2 = A0C;
            String scheme3 = strArr2[3];
            String path4 = strArr2[6];
            if (scheme3.length() == path4.length()) {
                A0C[5] = "2SO0ZWlaSU1SnxqLnXbiPhTsGSHCmzPH";
            }
        } else {
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A02.A0F().AKz(this.A03.get() != null);
        if (this.A03.get() != null) {
            AtomicBoolean atomicBoolean = this.A05.get();
            String[] strArr = A0C;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[3] = "U2DnXjrenRRLx1oMUBfcSIJQu5ANNJpT";
            strArr2[6] = "L4ZmgD3GCXt8DfDAt3P3IJDf6GSeHMJn";
            if (atomicBoolean != null && !this.A05.get().get()) {
                this.A03.get().A0K();
            }
        }
        if (this.A04.get() != null) {
            this.A04.get().AF8();
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0F().AL0();
        this.A00 = new Date();
        new Handler().postDelayed(new LW(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01 = true;
        A03(i, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean A12 = C1123Up.A12(this.A02);
        String A01 = A01(0, 0, 53);
        if (A12 || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A03(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()));
            return;
        }
        this.A02.A0F().AL1(AbstractC1182Xb.A01(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()), A01 + webResourceRequest.getUrl()));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A04(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0F().AL3();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1319ay.A0D(AbstractC1085Td.A2b);
        InterfaceC1322b1 adWebViewListener = this.A04.get();
        if (adWebViewListener != null) {
            adWebViewListener.AGg();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A07(url)) {
            WebResourceResponse A00 = A00();
            A04(webResourceRequest, A00);
            return A00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().ADN(str, new C1330b9().A03(this.A07.get()).A02(this.A06.get()).A05());
        }
        if (A0C[2].charAt(27) != 'C') {
            throw new RuntimeException();
        }
        A0C[5] = "jV60qdj1rgKoRn";
        return true;
    }
}
