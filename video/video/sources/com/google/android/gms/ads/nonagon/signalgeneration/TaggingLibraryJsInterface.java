package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzavl;
import com.google.android.gms.internal.ads.zzavm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzfct;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C5738d80;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class TaggingLibraryJsInterface {
    public final Context a;
    public final WebView b;
    public final zzavl c;
    public final zzfct d;
    public final int e;
    public final zzdsi f;
    public final boolean g;
    public final zzgdj h = zzcaa.f;
    public final zzfjr i;
    public final zzo j;
    public final zzf k;
    public final zzj l;

    public TaggingLibraryJsInterface(WebView webView, zzavl zzavlVar, zzdsi zzdsiVar, zzfjr zzfjrVar, zzfct zzfctVar, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.b = webView;
        Context context = webView.getContext();
        this.a = context;
        this.c = zzavlVar;
        this.f = zzdsiVar;
        zzbcv.a(context);
        this.e = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S9)).intValue();
        this.g = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T9)).booleanValue();
        this.i = zzfjrVar;
        this.d = zzfctVar;
        this.j = zzoVar;
        this.k = zzfVar;
        this.l = zzjVar;
    }

    public static /* synthetic */ void e(@InterfaceC5670cr1 TaggingLibraryJsInterface taggingLibraryJsInterface, @InterfaceC5670cr1 String str) {
        zzfct zzfctVar;
        Uri parse = Uri.parse(str);
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.nc)).booleanValue() && (zzfctVar = taggingLibraryJsInterface.d) != null) {
                parse = zzfctVar.a(parse, taggingLibraryJsInterface.a, taggingLibraryJsInterface.b, null);
            } else {
                parse = taggingLibraryJsInterface.c.a(parse, taggingLibraryJsInterface.a, taggingLibraryJsInterface.b, null);
            }
        } catch (zzavm e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.c("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzv.t().x(e, "TaggingLibraryJsInterface.recordClick");
        }
        taggingLibraryJsInterface.i.d(parse.toString(), null, null, null);
    }

    public static /* synthetic */ void f(@InterfaceC5670cr1 TaggingLibraryJsInterface taggingLibraryJsInterface, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 QueryInfoGenerationCallback queryInfoGenerationCallback) {
        boolean z;
        com.google.android.gms.ads.internal.util.zzaa w = com.google.android.gms.ads.internal.zzv.w();
        Context context = taggingLibraryJsInterface.a;
        CookieManager a = w.a(context);
        if (a != null) {
            z = a.acceptThirdPartyCookies(taggingLibraryJsInterface.b);
        } else {
            z = false;
        }
        bundle.putBoolean("accept_3p_cookie", z);
        QueryInfo.a(context, AdFormat.BANNER, new AdRequest.Builder().e(AdMobAdapter.class, bundle).p(), queryInfoGenerationCallback);
    }

    @JavascriptInterface
    @InterfaceC5670cr1
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(@InterfaceC5670cr1 String str) {
        try {
            long a = com.google.android.gms.ads.internal.zzv.d().a();
            String g = this.c.c().g(this.a, str, this.b);
            if (this.g) {
                zzaa.d(this.f, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzv.d().a() - a)));
                return g;
            }
            return g;
        } catch (RuntimeException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzv.t().x(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @InterfaceC5670cr1
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(@InterfaceC5670cr1 final String str, int i) {
        if (i <= 0) {
            String str2 = "Invalid timeout for getting click signals. Timeout=" + i;
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d(str2);
            return "";
        }
        try {
            return (String) zzcaa.a.I2(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzv.t().x(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (!(e instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @InterfaceC5670cr1
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzv.v();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbu zzbuVar = new zzbu(this, uuid);
        if (((Boolean) zzbfa.e.e()).booleanValue()) {
            this.j.g(this.b, zzbuVar);
            return uuid;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V9)).booleanValue()) {
            this.h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface.f(TaggingLibraryJsInterface.this, bundle, zzbuVar);
                }
            });
            return uuid;
        }
        QueryInfo.a(this.a, AdFormat.BANNER, new AdRequest.Builder().e(AdMobAdapter.class, bundle).p(), zzbuVar);
        return uuid;
    }

    @JavascriptInterface
    @InterfaceC5670cr1
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long a = com.google.android.gms.ads.internal.zzv.d().a();
            String i = this.c.c().i(this.a, this.b, null);
            if (this.g) {
                zzaa.d(this.f, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzv.d().a() - a)));
                return i;
            }
            return i;
        } catch (RuntimeException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzv.t().x(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @InterfaceC5670cr1
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcaa.a.I2(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzv.t().x(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (!(e instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(@InterfaceC5670cr1 final String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X9)).booleanValue() && !TextUtils.isEmpty(str)) {
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbp
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface.e(TaggingLibraryJsInterface.this, str);
                }
            });
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(@InterfaceC5670cr1 String str) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i2 = jSONObject.getInt(C5738d80.b);
            i3 = jSONObject.getInt("duration_ms");
            f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 != 0) {
                i4 = 1;
                if (i5 != 1) {
                    i4 = 2;
                    if (i5 != 2) {
                        i4 = 3;
                        if (i5 != 3) {
                            i4 = -1;
                        }
                    }
                }
            } else {
                i4 = 0;
            }
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            this.c.d(MotionEvent.obtain(0L, i3, i4, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e2) {
            e = e2;
            int i6 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzv.t().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e3) {
            e = e3;
            int i62 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzv.t().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
