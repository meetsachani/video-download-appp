package com.google.android.gms.internal.ads;

import o.AbstractC6818hX0;
import o.C5738d80;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzbsp {
    public final zzcfb a;
    public final String b;

    public zzbsp(zzcfb zzcfbVar, String str) {
        this.a = zzcfbVar;
        this.b = str;
    }

    public final void b(int i, int i2, int i3, int i4) {
        try {
            this.a.a("onDefaultPositionReceived", new JSONObject().put("x", i).put(C5738d80.b, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while dispatching default position.", e);
        }
    }

    public final void c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.b);
            zzcfb zzcfbVar = this.a;
            if (zzcfbVar != null) {
                zzcfbVar.a("onError", put);
            }
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while dispatching error event.", e);
        }
    }

    public final void d(String str) {
        try {
            this.a.a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.a.a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put(AbstractC6818hX0.i, i5));
        } catch (JSONException e) {
            int i6 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while obtaining screen information.", e);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        try {
            this.a.a("onSizeChanged", new JSONObject().put("x", i).put(C5738d80.b, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while dispatching size change.", e);
        }
    }

    public final void g(String str) {
        try {
            this.a.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while dispatching state change.", e);
        }
    }
}
