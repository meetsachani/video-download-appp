package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public final class zzcgh {
    public final zzcgi a;
    public final zzcgg b;

    public zzcgh(zzcgi zzcgiVar, zzcgg zzcggVar) {
        this.b = zzcggVar;
        this.a = zzcgiVar;
    }

    public static /* synthetic */ void a(zzcgh zzcghVar, String str) {
        Uri parse = Uri.parse(str);
        zzcfj t1 = ((zzcga) zzcghVar.b.a).t1();
        if (t1 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
            return;
        }
        t1.R0(parse);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.k("Click string is empty, not proceeding.");
            return "";
        }
        zzcgi zzcgiVar = this.a;
        zzavl D = ((zzcgo) zzcgiVar).D();
        if (D == null) {
            com.google.android.gms.ads.internal.util.zze.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzavg c = D.c();
        if (c == null) {
            com.google.android.gms.ads.internal.util.zze.k("Signals object is empty, ignoring.");
            return "";
        } else if (zzcgiVar.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.k("Context is null, ignoring.");
            return "";
        } else {
            return c.h(zzcgiVar.getContext(), str, ((zzcgq) zzcgiVar).U(), zzcgiVar.i());
        }
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcgi zzcgiVar = this.a;
        zzavl D = ((zzcgo) zzcgiVar).D();
        if (D == null) {
            com.google.android.gms.ads.internal.util.zze.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzavg c = D.c();
        if (c == null) {
            com.google.android.gms.ads.internal.util.zze.k("Signals object is empty, ignoring.");
            return "";
        } else if (zzcgiVar.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.k("Context is null, ignoring.");
            return "";
        } else {
            return c.i(zzcgiVar.getContext(), ((zzcgq) zzcgiVar).U(), zzcgiVar.i());
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("URL is empty, ignoring message");
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgf
            @Override // java.lang.Runnable
            public final void run() {
                zzcgh.a(zzcgh.this, str);
            }
        });
    }
}
