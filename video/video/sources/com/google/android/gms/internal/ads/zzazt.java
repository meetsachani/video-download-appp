package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.b;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzazt extends Thread {
    public boolean X;
    public boolean Y;
    public final zzazk Y0;
    public final Object Z;
    public final int Z0;
    public final int a1;
    public final int b1;
    public final int c1;
    public final int d1;
    public final int e1;
    public final int f1;
    public final int g1;
    public final String h1;
    public final boolean i1;
    public final boolean j1;

    public zzazt() {
        zzazk zzazkVar = new zzazk();
        this.X = false;
        this.Y = false;
        this.Y0 = zzazkVar;
        this.Z = new Object();
        this.a1 = ((Long) zzbem.d.e()).intValue();
        this.b1 = ((Long) zzbem.a.e()).intValue();
        this.c1 = ((Long) zzbem.e.e()).intValue();
        this.d1 = ((Long) zzbem.c.e()).intValue();
        this.e1 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i0)).intValue();
        this.f1 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j0)).intValue();
        this.g1 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k0)).intValue();
        this.Z0 = ((Long) zzbem.f.e()).intValue();
        this.h1 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m0);
        this.i1 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n0)).booleanValue();
        this.j1 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.o0)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.p0)).getClass();
        setName("ContentFetchTask");
    }

    @InterfaceC5056aJ2
    public final zzazs a(@InterfaceC11300zs1 View view, zzazj zzazjVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzazjVar.h(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazs(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcfb)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.h()) {
                    zzazjVar.f();
                    webView.post(new zzazr(this, zzazjVar, webView, globalVisibleRect));
                    return new zzazs(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzazs a = a(viewGroup.getChildAt(i3), zzazjVar);
                    i += a.a;
                    i2 += a.b;
                }
                return new zzazs(this, i, i2);
            }
        }
        return new zzazs(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r10 == 0) goto L23;
     */
    @InterfaceC5056aJ2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view) {
        try {
            zzazj zzazjVar = new zzazj(this.a1, this.b1, this.c1, this.d1, this.e1, this.f1, this.g1, this.j1);
            Context b = com.google.android.gms.ads.internal.zzv.f().b();
            if (b != null) {
                String str = this.h1;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(b.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l0), "id", b.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzazs a = a(view, zzazjVar);
            zzazjVar.j();
            if (a.a != 0 || a.b != 0) {
                int i = a.b;
                if (i == 0) {
                    if (zzazjVar.b() == 0) {
                        return;
                    }
                }
                if (this.Y0.c(zzazjVar)) {
                    return;
                }
                this.Y0.a(zzazjVar);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzv.t().x(e, "ContentFetchTask.fetchContent");
        }
    }

    @InterfaceC5056aJ2
    public final void c(zzazj zzazjVar, WebView webView, String str, boolean z) {
        zzazj zzazjVar2;
        zzazjVar.e();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.i1 && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    zzazjVar.i(title + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzazjVar2 = zzazjVar;
                } else {
                    zzazjVar2 = zzazjVar;
                    zzazjVar2.i(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            } else {
                zzazjVar2 = zzazjVar;
            }
            if (zzazjVar2.l()) {
                this.Y0.b(zzazjVar2);
            }
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Json string may be malformed.");
        } catch (Throwable th) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.c("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzv.t().x(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void d() {
        synchronized (this.Z) {
            try {
                if (this.X) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Content hash thread already started, quitting...");
                    return;
                }
                this.X = true;
                start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.Z) {
            this.Y = true;
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("ContentFetchThread: paused, pause = true");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:3)(2:31|(2:36|(3:39|(3:41|42|(6:50|(1:52)(5:53|54|55|(1:59)|(1:61))|6|7|e7|20))|37)))|4|5|6|7|e7) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
        r1 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.e("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzv.t().x(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
        r1 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.e("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:62:0x00e8->B:71:0x00e8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        Object obj;
        while (true) {
            Context b = com.google.android.gms.ads.internal.zzv.f().b();
            if (b != null) {
                ActivityManager activityManager = (ActivityManager) b.getSystemService(b.r);
                KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
                if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (Process.myPid() == runningAppProcessInfo.pid) {
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) b.getSystemService("power")) != null && powerManager.isScreenOn()) {
                                Activity a = com.google.android.gms.ads.internal.zzv.f().a();
                                if (a == null) {
                                    int i = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.b("ContentFetchThread: no activity. Sleeping.");
                                    e();
                                } else {
                                    View view = null;
                                    try {
                                        if (a.getWindow() != null && a.getWindow().getDecorView() != null) {
                                            view = a.getWindow().getDecorView().findViewById(16908290);
                                        }
                                    } catch (Exception e) {
                                        com.google.android.gms.ads.internal.zzv.t().x(e, "ContentFetchTask.extractContent");
                                        int i2 = com.google.android.gms.ads.internal.util.zze.b;
                                        com.google.android.gms.ads.internal.util.client.zzo.b("Failed getting root view of activity. Content not extracted.");
                                    }
                                    if (view != null) {
                                        view.post(new zzazp(this, view));
                                    }
                                }
                                Thread.sleep(this.Z0 * 1000);
                                obj = this.Z;
                                synchronized (obj) {
                                    while (this.Y) {
                                        try {
                                            int i3 = com.google.android.gms.ads.internal.util.zze.b;
                                            com.google.android.gms.ads.internal.util.client.zzo.b("ContentFetchTask: waiting");
                                            obj.wait();
                                        } catch (InterruptedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i4 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("ContentFetchTask: sleeping");
            e();
            Thread.sleep(this.Z0 * 1000);
            obj = this.Z;
            synchronized (obj) {
            }
        }
    }
}
