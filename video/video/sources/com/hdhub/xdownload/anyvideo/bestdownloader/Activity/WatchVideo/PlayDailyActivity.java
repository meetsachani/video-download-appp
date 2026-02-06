package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WatchVideo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WatchVideo.PlayDailyActivity;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C5;
import o.C5036aE2;
import o.C6516gH2;
import o.C9246rQ0;
import o.InterfaceC10336vu1;
import o.RL2;

/* loaded from: classes3.dex */
public class PlayDailyActivity extends ActivityC3020Gb {
    public static final long D1 = 500;
    public C5 C1;

    /* loaded from: classes3.dex */
    public class a extends WebViewClient {
        public final /* synthetic */ WebView a;

        public a(WebView webView) {
            this.a = webView;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            PlayDailyActivity playDailyActivity = PlayDailyActivity.this;
            Toast.makeText(playDailyActivity, "Error loading video: " + str, 1).show();
            this.a.loadUrl("about:blank");
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC2891Eu1 {
        public b(boolean z) {
            super(z);
        }

        public static /* synthetic */ void k(b bVar) {
            if (PlayDailyActivity.this.C1 != null && PlayDailyActivity.this.C1.c != null) {
                PlayDailyActivity.this.C1.c.loadUrl("about:blank");
            }
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.xD1
                @Override // java.lang.Runnable
                public final void run() {
                    PlayDailyActivity.b.k(PlayDailyActivity.b.this);
                }
            }, 500L);
            C5036aE2.a(PlayDailyActivity.this);
        }
    }

    public static /* synthetic */ RL2 F1(View view, RL2 rl2) {
        int i;
        C9246rQ0 f = rl2.f(RL2.p.i());
        if (rl2.C(RL2.p.g())) {
            i = f.d;
        } else {
            i = 0;
        }
        view.setPadding(f.a, f.b, f.c, i);
        return rl2;
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5 c = C5.c(getLayoutInflater());
        this.C1 = c;
        setContentView(c.getRoot());
        C5 c5 = this.C1;
        if (c5 != null) {
            C6516gH2.l2(c5.getRoot(), new InterfaceC10336vu1() { // from class: o.wD1
                @Override // o.InterfaceC10336vu1
                public final RL2 a(View view, RL2 rl2) {
                    return PlayDailyActivity.F1(view, rl2);
                }
            });
            WebView webView = this.C1.c;
            if (webView != null) {
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(true);
                settings.setAllowFileAccess(true);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                webView.setLayerType(2, null);
                webView.setWebViewClient(new a(webView));
                webView.setWebChromeClient(new WebChromeClient());
                String stringExtra = getIntent().getStringExtra("video_url");
                if (stringExtra != null && !stringExtra.isEmpty()) {
                    if (stringExtra.contains("dailymotion.com/video/")) {
                        stringExtra = "https://www.dailymotion.com/embed/video/" + stringExtra.substring(stringExtra.lastIndexOf(RemoteSettings.i) + 1);
                    }
                    webView.loadUrl(stringExtra);
                } else {
                    webView.loadUrl("about:blank");
                    Toast.makeText(this, "No video URL provided", 0).show();
                }
                R().e(new b(true));
                return;
            }
            throw new IllegalStateException("WebView not found in layout");
        }
        throw new IllegalStateException("ViewBinding initialization failed");
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onDestroy() {
        WebView webView;
        super.onDestroy();
        C5 c5 = this.C1;
        if (c5 != null && (webView = c5.c) != null) {
            webView.stopLoading();
            this.C1.c.destroy();
        }
        this.C1 = null;
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onPause() {
        WebView webView;
        super.onPause();
        C5 c5 = this.C1;
        if (c5 != null && (webView = c5.c) != null) {
            webView.onPause();
        }
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        WebView webView;
        super.onResume();
        C5 c5 = this.C1;
        if (c5 != null && (webView = c5.c) != null) {
            webView.onResume();
        }
    }
}
