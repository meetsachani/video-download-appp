package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.C0376a;
import com.facebook.C2414x;
import com.facebook.C2416z;
import com.facebook.S;
import com.facebook.common.b;
import com.facebook.internal.q0;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import o.C10763xf2;
import o.C4788Ye;
import o.C6562gT0;
import o.C8319ne2;
import o.C9516sY;
import o.C9545sf2;
import o.C9698tH2;
import o.D32;
import o.InterfaceC5056aJ2;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q0 extends Dialog {
    @NotNull
    public static final String i1 = "FacebookSDK.WebDialog";
    @NotNull
    public static final String j1 = "touch";
    @NotNull
    public static final String k1 = "^/(v\\d+\\.\\d+/)??dialog/.*";
    public static final int l1 = 4201;
    public static final boolean m1 = false;
    public static final int n1 = 480;
    public static final int o1 = 800;
    public static final int p1 = 800;
    public static final int q1 = 1280;
    public static final double r1 = 0.5d;
    public static final int s1 = -872415232;
    public static volatile int u1;
    @Nullable
    public static d v1;
    @Nullable
    public String X;
    @NotNull
    public String Y;
    @Nullable
    public WebView Y0;
    @Nullable
    public e Z;
    @Nullable
    public ProgressDialog Z0;
    @Nullable
    public ImageView a1;
    @Nullable
    public FrameLayout b1;
    @Nullable
    public f c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    @Nullable
    public WindowManager.LayoutParams g1;
    @NotNull
    public static final b h1 = new b(null);
    public static final int t1 = b.m.V5;

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final int a() {
            m0 m0Var = m0.a;
            m0.w();
            return q0.u1;
        }

        @InterfaceC9511sW0
        public final void b(@Nullable Context context) {
            Bundle bundle;
            if (context != null) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    if (applicationInfo == null) {
                        bundle = null;
                    } else {
                        bundle = applicationInfo.metaData;
                    }
                    if (bundle != null && q0.u1 == 0) {
                        f(applicationInfo.metaData.getInt(com.facebook.M.B));
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }

        @InterfaceC9511sW0
        @NotNull
        public final q0 c(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @Nullable e eVar) {
            C6562gT0.p(context, "context");
            q0.v(context);
            return new q0(context, str, bundle, i, com.facebook.login.L.FACEBOOK, eVar, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final q0 d(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @NotNull com.facebook.login.L l, @Nullable e eVar) {
            C6562gT0.p(context, "context");
            C6562gT0.p(l, "targetApp");
            q0.v(context);
            return new q0(context, str, bundle, i, l, eVar, null);
        }

        @InterfaceC9511sW0
        public final void e(@Nullable d dVar) {
            q0.v1 = dVar;
        }

        @InterfaceC9511sW0
        public final void f(int i) {
            if (i == 0) {
                i = q0.t1;
            }
            q0.u1 = i;
        }

        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends WebViewClient {
        public final /* synthetic */ q0 a;

        public c(q0 q0Var) {
            C6562gT0.p(q0Var, "this$0");
            this.a = q0Var;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView webView, @NotNull String str) {
            ProgressDialog progressDialog;
            C6562gT0.p(webView, C9698tH2.A);
            C6562gT0.p(str, "url");
            super.onPageFinished(webView, str);
            if (!this.a.e1 && (progressDialog = this.a.Z0) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.a.b1;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView u = this.a.u();
            if (u != null) {
                u.setVisibility(0);
            }
            ImageView imageView = this.a.a1;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.a.f1 = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NotNull WebView webView, @NotNull String str, @Nullable Bitmap bitmap) {
            ProgressDialog progressDialog;
            C6562gT0.p(webView, C9698tH2.A);
            C6562gT0.p(str, "url");
            l0 l0Var = l0.a;
            l0.m0(q0.i1, C6562gT0.C("Webview loading URL: ", str));
            super.onPageStarted(webView, str, bitmap);
            if (!this.a.e1 && (progressDialog = this.a.Z0) != null) {
                progressDialog.show();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NotNull WebView webView, int i, @NotNull String str, @NotNull String str2) {
            C6562gT0.p(webView, C9698tH2.A);
            C6562gT0.p(str, "description");
            C6562gT0.p(str2, "failingUrl");
            super.onReceivedError(webView, i, str, str2);
            this.a.D(new C2414x(str, i, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NotNull WebView webView, @NotNull SslErrorHandler sslErrorHandler, @NotNull SslError sslError) {
            C6562gT0.p(webView, C9698tH2.A);
            C6562gT0.p(sslErrorHandler, "handler");
            C6562gT0.p(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.a.D(new C2414x(null, -11, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull String str) {
            boolean z;
            int i;
            C6562gT0.p(webView, C9698tH2.A);
            C6562gT0.p(str, "url");
            l0 l0Var = l0.a;
            l0.m0(q0.i1, C6562gT0.C("Redirect URL: ", str));
            Uri parse = Uri.parse(str);
            if (parse.getPath() != null && Pattern.matches(q0.k1, parse.getPath())) {
                z = true;
            } else {
                z = false;
            }
            if (C9545sf2.J2(str, this.a.Y, false, 2, null)) {
                Bundle B = this.a.B(str);
                String string = B.getString("error");
                if (string == null) {
                    string = B.getString("error_type");
                }
                String string2 = B.getString(com.facebook.C.u1);
                if (string2 == null) {
                    string2 = B.getString("error_message");
                }
                if (string2 == null) {
                    string2 = B.getString(Z.Q0);
                }
                String string3 = B.getString("error_code");
                if (string3 != null && !l0.f0(string3)) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                    l0 l0Var2 = l0.a;
                    if (!l0.f0(string) && l0.f0(string2) && i == -1) {
                        this.a.E(B);
                    } else if (string == null && (C6562gT0.g(string, "access_denied") || C6562gT0.g(string, "OAuthAccessDeniedException"))) {
                        this.a.cancel();
                    } else if (i != 4201) {
                        this.a.cancel();
                    } else {
                        this.a.D(new com.facebook.P(new com.facebook.C(i, string, string2), string2));
                    }
                    return true;
                }
                i = -1;
                l0 l0Var22 = l0.a;
                if (!l0.f0(string)) {
                }
                if (string == null) {
                }
                if (i != 4201) {
                }
                return true;
            } else if (C9545sf2.J2(str, c0.S, false, 2, null)) {
                this.a.cancel();
                return true;
            } else {
                if (!z && !C10763xf2.n3(str, "touch", false, 2, null)) {
                    try {
                        this.a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return true;
                    } catch (ActivityNotFoundException unused2) {
                    }
                }
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(@Nullable WebView webView);
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(@Nullable Bundle bundle, @Nullable C2416z c2416z);
    }

    /* loaded from: classes2.dex */
    public final class f extends AsyncTask<Void, Void, String[]> {
        @NotNull
        public final String a;
        @NotNull
        public final Bundle b;
        @NotNull
        public Exception[] c;
        public final /* synthetic */ q0 d;

        public f(@NotNull q0 q0Var, @NotNull String str, Bundle bundle) {
            C6562gT0.p(q0Var, "this$0");
            C6562gT0.p(str, "action");
            C6562gT0.p(bundle, BreadcrumbAnalyticsEventReceiver.c);
            this.d = q0Var;
            this.a = str;
            this.b = bundle;
            this.c = new Exception[0];
        }

        public static final void c(String[] strArr, int i, f fVar, CountDownLatch countDownLatch, com.facebook.Y y) {
            com.facebook.C g;
            String str;
            C6562gT0.p(strArr, "$results");
            C6562gT0.p(fVar, "this$0");
            C6562gT0.p(countDownLatch, "$latch");
            C6562gT0.p(y, "response");
            try {
                g = y.g();
                str = "Error staging photo.";
            } catch (Exception e) {
                fVar.c[i] = e;
            }
            if (g != null) {
                String h = g.h();
                if (h != null) {
                    str = h;
                }
                throw new com.facebook.A(y, str);
            }
            JSONObject i2 = y.i();
            if (i2 != null) {
                String optString = i2.optString("uri");
                if (optString != null) {
                    strArr[i] = optString;
                    countDownLatch.countDown();
                    return;
                }
                throw new C2416z("Error staging photo.");
            }
            throw new C2416z("Error staging photo.");
        }

        @Nullable
        public String[] b(@NotNull Void... voidArr) {
            if (SQ.e(this)) {
                return null;
            }
            try {
                if (SQ.e(this)) {
                    return null;
                }
                C6562gT0.p(voidArr, "p0");
                String[] stringArray = this.b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C0376a i = C0376a.g1.i();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((com.facebook.W) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri parse = Uri.parse(stringArray[i2]);
                            l0 l0Var = l0.a;
                            if (l0.h0(parse)) {
                                strArr[i2] = parse.toString();
                                countDownLatch.countDown();
                            } else {
                                S.b bVar = new S.b() { // from class: com.facebook.internal.r0
                                    @Override // com.facebook.S.b
                                    public final void a(com.facebook.Y y) {
                                        q0.f.c(strArr, i2, this, countDownLatch, y);
                                    }
                                };
                                D32 d32 = D32.a;
                                C6562gT0.o(parse, "uri");
                                concurrentLinkedQueue.add(D32.B(i, parse, bVar).n());
                            }
                            if (i3 > length) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((com.facebook.W) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }

        public void d(@Nullable String[] strArr) {
            if (!SQ.e(this)) {
                try {
                    if (!SQ.e(this)) {
                        ProgressDialog progressDialog = this.d.Z0;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                        }
                        Exception[] excArr = this.c;
                        int length = excArr.length;
                        int i = 0;
                        while (i < length) {
                            Exception exc = excArr[i];
                            i++;
                            if (exc != null) {
                                this.d.D(exc);
                                return;
                            }
                        }
                        if (strArr == null) {
                            this.d.D(new C2416z("Failed to stage photos for web dialog"));
                            return;
                        }
                        List t = C4788Ye.t(strArr);
                        if (t.contains(null)) {
                            this.d.D(new C2416z("Failed to stage photos for web dialog"));
                            return;
                        }
                        l0 l0Var = l0.a;
                        l0.t0(this.b, "media", new JSONArray((Collection) t));
                        c0 c0Var = c0.a;
                        String b = c0.b();
                        StringBuilder sb = new StringBuilder();
                        com.facebook.M m = com.facebook.M.a;
                        sb.append(com.facebook.M.B());
                        sb.append("/dialog/");
                        sb.append(this.a);
                        Uri g = l0.g(b, sb.toString(), this.b);
                        this.d.X = g.toString();
                        ImageView imageView = this.d.a1;
                        if (imageView != null) {
                            this.d.I((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (SQ.e(this)) {
                return null;
            }
            try {
                if (SQ.e(this)) {
                    return null;
                }
                return b(voidArr);
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (!SQ.e(this)) {
                try {
                    if (!SQ.e(this)) {
                        d(strArr);
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.facebook.login.L.valuesCustom().length];
            iArr[com.facebook.login.L.INSTAGRAM.ordinal()] = 1;
            a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends WebView {
        public h(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    public /* synthetic */ q0(Context context, String str, Bundle bundle, int i, com.facebook.login.L l, e eVar, C9516sY c9516sY) {
        this(context, str, bundle, i, l, eVar);
    }

    public static final void A(q0 q0Var, DialogInterface dialogInterface) {
        C6562gT0.p(q0Var, "this$0");
        q0Var.cancel();
    }

    @InterfaceC9511sW0
    public static final void G(@Nullable d dVar) {
        h1.e(dVar);
    }

    public static final boolean J(View view, MotionEvent motionEvent) {
        if (!view.hasFocus()) {
            view.requestFocus();
            return false;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final void K(int i) {
        h1.f(i);
    }

    public static final void q(q0 q0Var, View view) {
        C6562gT0.p(q0Var, "this$0");
        q0Var.cancel();
    }

    @InterfaceC9511sW0
    public static final int t() {
        return h1.a();
    }

    @InterfaceC9511sW0
    public static final void v(@Nullable Context context) {
        h1.b(context);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final q0 y(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @Nullable e eVar) {
        return h1.c(context, str, bundle, i, eVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final q0 z(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @NotNull com.facebook.login.L l, @Nullable e eVar) {
        return h1.d(context, str, bundle, i, l, eVar);
    }

    @InterfaceC5056aJ2(otherwise = 4)
    @NotNull
    public Bundle B(@Nullable String str) {
        Uri parse = Uri.parse(str);
        l0 l0Var = l0.a;
        Bundle r0 = l0.r0(parse.getQuery());
        r0.putAll(l0.r0(parse.getFragment()));
        return r0;
    }

    public final void C() {
        int i;
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i2 < i3) {
                i = i2;
            } else {
                i = i3;
            }
            if (i2 < i3) {
                i2 = i3;
            }
            int min = Math.min(s(i, displayMetrics.density, n1, 800), displayMetrics.widthPixels);
            int min2 = Math.min(s(i2, displayMetrics.density, 800, q1), displayMetrics.heightPixels);
            Window window = getWindow();
            if (window == null) {
                return;
            }
            window.setLayout(min, min2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final void D(@Nullable Throwable th) {
        C2416z c2416z;
        if (this.Z != null && !this.d1) {
            this.d1 = true;
            if (th instanceof C2416z) {
                c2416z = (C2416z) th;
            } else {
                c2416z = new C2416z(th);
            }
            e eVar = this.Z;
            if (eVar != null) {
                eVar.a(null, c2416z);
            }
            dismiss();
        }
    }

    public final void E(@Nullable Bundle bundle) {
        e eVar = this.Z;
        if (eVar != null && !this.d1) {
            this.d1 = true;
            if (eVar != null) {
                eVar.a(bundle, null);
            }
            dismiss();
        }
    }

    public final void F(@NotNull String str) {
        C6562gT0.p(str, "expectedRedirectUrl");
        this.Y = str;
    }

    public final void H(@Nullable e eVar) {
        this.Z = eVar;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void I(int i) {
        WebSettings settings;
        WebSettings settings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.Y0 = new h(getContext());
        d dVar = v1;
        if (dVar != null) {
            dVar.a(u());
        }
        WebView webView = this.Y0;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.Y0;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.Y0;
        if (webView3 != null) {
            webView3.setWebViewClient(new c(this));
        }
        WebView webView4 = this.Y0;
        WebSettings webSettings = null;
        if (webView4 == null) {
            settings = null;
        } else {
            settings = webView4.getSettings();
        }
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.Y0;
        if (webView5 != null) {
            String str = this.X;
            if (str != null) {
                webView5.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        WebView webView6 = this.Y0;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.Y0;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.Y0;
        if (webView8 == null) {
            settings2 = null;
        } else {
            settings2 = webView8.getSettings();
        }
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.Y0;
        if (webView9 != null) {
            webSettings = webView9.getSettings();
        }
        if (webSettings != null) {
            webSettings.setSaveFormData(false);
        }
        WebView webView10 = this.Y0;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.Y0;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.Y0;
        if (webView12 != null) {
            webView12.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.n0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean J;
                    J = q0.J(view, motionEvent);
                    return J;
                }
            });
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.Y0);
        linearLayout.setBackgroundColor(s1);
        FrameLayout frameLayout = this.b1;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.Z != null && !this.d1) {
            D(new com.facebook.B());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.Y0;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.e1 && (progressDialog = this.Z0) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        IBinder iBinder2;
        this.e1 = false;
        l0 l0Var = l0.a;
        Context context = getContext();
        C6562gT0.o(context, "context");
        if (l0.q0(context) && (layoutParams = this.g1) != null) {
            IBinder iBinder3 = null;
            if (layoutParams == null) {
                iBinder = null;
            } else {
                iBinder = layoutParams.token;
            }
            if (iBinder == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity == null) {
                        window = null;
                    } else {
                        window = ownerActivity.getWindow();
                    }
                    if (window == null || (attributes = window.getAttributes()) == null) {
                        iBinder2 = null;
                    } else {
                        iBinder2 = attributes.token;
                    }
                    layoutParams.token = iBinder2;
                }
                WindowManager.LayoutParams layoutParams2 = this.g1;
                if (layoutParams2 != null) {
                    iBinder3 = layoutParams2.token;
                }
                l0.m0(i1, C6562gT0.C("Set token on onAttachedToWindow(): ", iBinder3));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.Z0 = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.Z0;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(b.l.H));
        }
        ProgressDialog progressDialog3 = this.Z0;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.Z0;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.p0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    q0.A(q0.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.b1 = new FrameLayout(getContext());
        C();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        p();
        if (this.X != null) {
            ImageView imageView = this.a1;
            if (imageView != null) {
                I((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        FrameLayout frameLayout = this.b1;
        if (frameLayout != null) {
            frameLayout.addView(this.a1, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.b1;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.e1 = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull KeyEvent keyEvent) {
        Boolean valueOf;
        C6562gT0.p(keyEvent, "event");
        if (i == 4) {
            WebView webView = this.Y0;
            if (webView != null) {
                if (webView == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(webView.canGoBack());
                }
                if (C6562gT0.g(valueOf, Boolean.TRUE)) {
                    WebView webView2 = this.Y0;
                    if (webView2 != null) {
                        webView2.goBack();
                        return true;
                    }
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public void onStart() {
        AsyncTask.Status status;
        super.onStart();
        f fVar = this.c1;
        if (fVar != null) {
            if (fVar == null) {
                status = null;
            } else {
                status = fVar.getStatus();
            }
            if (status == AsyncTask.Status.PENDING) {
                f fVar2 = this.c1;
                if (fVar2 != null) {
                    fVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.Z0;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        C();
    }

    @Override // android.app.Dialog
    public void onStop() {
        f fVar = this.c1;
        if (fVar != null) {
            fVar.cancel(true);
            ProgressDialog progressDialog = this.Z0;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(@NotNull WindowManager.LayoutParams layoutParams) {
        C6562gT0.p(layoutParams, "params");
        if (layoutParams.token == null) {
            this.g1 = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    public final void p() {
        ImageView imageView = new ImageView(getContext());
        this.a1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q0.q(q0.this, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(b.g.L0);
        ImageView imageView2 = this.a1;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.a1;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    @Nullable
    public final e r() {
        return this.Z;
    }

    public final int s(int i, float f2, int i2, int i3) {
        int i4 = (int) (i / f2);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    @Nullable
    public final WebView u() {
        return this.Y0;
    }

    public final boolean w() {
        return this.d1;
    }

    public final boolean x() {
        return this.f1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull Context context, @NotNull String str) {
        this(context, str, h1.a());
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "url");
    }

    public q0(Context context, String str, int i) {
        super(context, i == 0 ? h1.a() : i);
        this.Y = c0.Q;
        this.X = str;
    }

    public q0(Context context, String str, Bundle bundle, int i, com.facebook.login.L l, e eVar) {
        super(context, i == 0 ? h1.a() : i);
        Uri g2;
        String str2 = c0.Q;
        this.Y = c0.Q;
        bundle = bundle == null ? new Bundle() : bundle;
        l0 l0Var = l0.a;
        str2 = l0.Z(context) ? c0.R : str2;
        this.Y = str2;
        bundle.putString(c0.w, str2);
        bundle.putString("display", "touch");
        com.facebook.M m = com.facebook.M.a;
        bundle.putString("client_id", com.facebook.M.o());
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{com.facebook.M.I()}, 1));
        C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.Z = eVar;
        if (C6562gT0.g(str, "share") && bundle.containsKey("media")) {
            this.c1 = new f(this, str, bundle);
            return;
        }
        if (g.a[l.ordinal()] == 1) {
            c0 c0Var = c0.a;
            g2 = l0.g(c0.k(), c0.a0, bundle);
        } else {
            c0 c0Var2 = c0.a;
            String b2 = c0.b();
            g2 = l0.g(b2, com.facebook.M.B() + "/dialog/" + ((Object) str), bundle);
        }
        this.X = g2.toString();
    }

    /* loaded from: classes2.dex */
    public static class a {
        @Nullable
        public Context a;
        @Nullable
        public String b;
        @Nullable
        public String c;
        public int d;
        @Nullable
        public e e;
        @Nullable
        public Bundle f;
        @Nullable
        public C0376a g;

        public a(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "action");
            C0376a.d dVar = C0376a.g1;
            this.g = dVar.i();
            if (!dVar.k()) {
                l0 l0Var = l0.a;
                String K = l0.K(context);
                if (K != null) {
                    this.b = K;
                } else {
                    throw new C2416z("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            b(context, str, bundle);
        }

        @Nullable
        public q0 a() {
            String h;
            C0376a c0376a = this.g;
            if (c0376a != null) {
                Bundle bundle = this.f;
                String str = null;
                if (bundle != null) {
                    if (c0376a == null) {
                        h = null;
                    } else {
                        h = c0376a.h();
                    }
                    bundle.putString("app_id", h);
                }
                Bundle bundle2 = this.f;
                if (bundle2 != null) {
                    C0376a c0376a2 = this.g;
                    if (c0376a2 != null) {
                        str = c0376a2.x();
                    }
                    bundle2.putString("access_token", str);
                }
            } else {
                Bundle bundle3 = this.f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.b);
                }
            }
            b bVar = q0.h1;
            Context context = this.a;
            if (context != null) {
                return bVar.c(context, this.c, this.f, this.d, this.e);
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final void b(Context context, String str, Bundle bundle) {
            this.a = context;
            this.c = str;
            if (bundle != null) {
                this.f = bundle;
            } else {
                this.f = new Bundle();
            }
        }

        @Nullable
        public final String c() {
            return this.b;
        }

        @Nullable
        public final Context d() {
            return this.a;
        }

        @Nullable
        public final e e() {
            return this.e;
        }

        @Nullable
        public final Bundle f() {
            return this.f;
        }

        public final int g() {
            return this.d;
        }

        @NotNull
        public final a h(@Nullable e eVar) {
            this.e = eVar;
            return this;
        }

        @NotNull
        public final a i(int i) {
            this.d = i;
            return this;
        }

        public a(@NotNull Context context, @Nullable String str, @NotNull String str2, @Nullable Bundle bundle) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str2, "action");
            if (str == null) {
                l0 l0Var = l0.a;
                str = l0.K(context);
            }
            m0 m0Var = m0.a;
            this.b = m0.t(str, "applicationId");
            b(context, str2, bundle);
        }
    }
}
