package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.C5918dt;
import o.C9811tl1;

/* loaded from: classes2.dex */
public final class zzcfa extends WebChromeClient {
    public final zzcfb a;

    public zzcfa(zzcfb zzcfbVar) {
        this.a = zzcfbVar;
    }

    public static final Context b(WebView webView) {
        if (!(webView instanceof zzcfb)) {
            return webView.getContext();
        }
        zzcfb zzcfbVar = (zzcfb) webView;
        Activity i = zzcfbVar.i();
        if (i != null) {
            return i;
        }
        return zzcfbVar.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzcfb zzcfbVar;
        com.google.android.gms.ads.internal.zzb f;
        try {
            zzcfbVar = this.a;
        } catch (WindowManager.BadTokenException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Fail to display Dialog.", e);
        }
        if (zzcfbVar != null && zzcfbVar.M() != null && zzcfbVar.M().f() != null && (f = zzcfbVar.M().f()) != null && !f.c()) {
            f.b("window." + str + "('" + str3 + "')");
            return false;
        }
        com.google.android.gms.ads.internal.zzv.v();
        AlertDialog.Builder l = com.google.android.gms.ads.internal.util.zzs.l(context);
        l.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            l.setView(linearLayout).setPositiveButton(17039370, new zzcey(jsPromptResult, editText)).setNegativeButton(17039360, new zzcex(jsPromptResult)).setOnCancelListener(new zzcew(jsPromptResult)).create().show();
        } else {
            l.setMessage(str3).setPositiveButton(17039370, new zzcev(jsResult)).setNegativeButton(17039360, new zzceu(jsResult)).setOnCancelListener(new zzcet(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcfb)) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm J = ((zzcfb) webView).J();
        if (J == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Tried to close an AdWebView not associated with an overlay.");
            return;
        }
        J.b();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + C9811tl1.d;
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzcez.a[consoleMessage.messageLevel().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i != 5) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.f(str);
                    } else {
                        int i3 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.b(str);
                    }
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.f(str);
                }
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g(str);
            }
        } else {
            int i6 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzcfb zzcfbVar = this.a;
        if (zzcfbVar.P() != null) {
            webView2.setWebViewClient(zzcfbVar.P());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = C5918dt.k - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min((long) PlaybackStateCompat.y1, j4), 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzcfb zzcfbVar = this.a;
            com.google.android.gms.ads.internal.zzv.v();
            if (!com.google.android.gms.ads.internal.util.zzs.b(zzcfbVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                com.google.android.gms.ads.internal.zzv.v();
                if (!com.google.android.gms.ads.internal.util.zzs.b(zzcfbVar.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ud)).booleanValue()) {
                        callback.invoke(str, false, true);
                    } else {
                        callback.invoke(str, z, true);
                    }
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.vd)).booleanValue()) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.b("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
                        return;
                    }
                    return;
                }
            }
            z = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ud)).booleanValue()) {
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.vd)).booleanValue()) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm J = this.a.J();
        if (J == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not get ad overlay when hiding custom view.");
            return;
        }
        J.g();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm J = this.a.J();
        if (J == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        J.Z7(view, customViewCallback);
        J.X7(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
