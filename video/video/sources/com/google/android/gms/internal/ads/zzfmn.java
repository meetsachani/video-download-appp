package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Date;
import java.util.Iterator;
import o.BU0;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.helper.CookieUtil;

/* loaded from: classes2.dex */
public class zzfmn {
    public final String a;
    public zzfnp b;
    public long c;
    public int d;

    public zzfmn(String str) {
        b();
        this.a = str;
        this.b = new zzfnp(null);
    }

    public final WebView a() {
        return (WebView) this.b.get();
    }

    public final void b() {
        this.c = System.nanoTime();
        this.d = 1;
    }

    public void c() {
        this.b.clear();
    }

    public final void d(String str, long j) {
        if (j >= this.c && this.d != 3) {
            this.d = 3;
            zzfme.a().h(a(), this.a, str);
        }
    }

    public final void e() {
        zzfme.a().c(a(), this.a);
    }

    public final void f(zzflc zzflcVar) {
        zzfme.a().d(a(), this.a, zzflcVar.b());
    }

    public final void g(@InterfaceC5670cr1 Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfmt.e(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfme.a().f(a(), jSONObject);
    }

    public final void h(String str, long j) {
        if (j >= this.c) {
            this.d = 2;
            zzfme.a().h(a(), this.a, str);
        }
    }

    public void i(zzflf zzflfVar, zzfld zzfldVar) {
        j(zzflfVar, zzfldVar, null);
    }

    public final void j(zzflf zzflfVar, zzfld zzfldVar, JSONObject jSONObject) {
        String h = zzflfVar.h();
        JSONObject jSONObject2 = new JSONObject();
        zzfmt.e(jSONObject2, "environment", FirebaseMessaging.r);
        zzfmt.e(jSONObject2, "adSessionType", zzfldVar.d());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfmt.e(jSONObject3, "deviceType", str + CookieUtil.b + str2);
        zzfmt.e(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfmt.e(jSONObject3, BU0.f, "Android");
        zzfmt.e(jSONObject2, "deviceInfo", jSONObject3);
        zzfmt.e(jSONObject2, "deviceCategory", zzfms.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfmt.e(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfmt.e(jSONObject4, "partnerName", zzfldVar.e().b());
        zzfmt.e(jSONObject4, "partnerVersion", zzfldVar.e().c());
        zzfmt.e(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfmt.e(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfmt.e(jSONObject5, RemoteConfigConstants.RequestFieldKey.W, zzfmc.b().a().getApplicationContext().getPackageName());
        zzfmt.e(jSONObject2, FirebaseMessaging.r, jSONObject5);
        if (zzfldVar.f() != null) {
            zzfmt.e(jSONObject2, "contentUrl", zzfldVar.f());
        }
        if (zzfldVar.g() != null) {
            zzfmt.e(jSONObject2, "customReferenceData", zzfldVar.g());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfldVar.h().iterator();
        if (!it.hasNext()) {
            zzfme.a().j(a(), h, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzflp zzflpVar = (zzflp) it.next();
            throw null;
        }
    }

    public final void k(boolean z) {
        String str;
        if (p()) {
            if (true != z) {
                str = "backgrounded";
            } else {
                str = "foregrounded";
            }
            zzfme.a().i(a(), this.a, str);
        }
    }

    public final void l(float f) {
        zzfme.a().e(a(), this.a, f);
    }

    public final void m(boolean z) {
        String str;
        if (p()) {
            if (true != z) {
                str = "unlocked";
            } else {
                str = "locked";
            }
            zzfme.a().g(a(), this.a, str);
        }
    }

    public final void n(WebView webView) {
        this.b = new zzfnp(webView);
    }

    public void o() {
    }

    public final boolean p() {
        if (this.b.get() != 0) {
            return true;
        }
        return false;
    }
}
