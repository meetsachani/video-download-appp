package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import o.C5445bv2;
import o.C9698tH2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcng implements zzbog {
    public final Context a;
    public final zzayq b;
    public final PowerManager c;

    public zzcng(Context context, zzayq zzayqVar) {
        this.a = context;
        this.b = zzayqVar;
        this.c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    /* renamed from: a */
    public final JSONObject c(zzcnj zzcnjVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzayt zzaytVar = zzcnjVar.f;
        if (zzaytVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzayq zzayqVar = this.b;
            if (zzayqVar.d() != null) {
                boolean z = zzaytVar.a;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject put = jSONObject3.put("afmaVersion", zzayqVar.b()).put("activeViewJSON", zzayqVar.d()).put("timestamp", zzcnjVar.d).put("adFormat", zzayqVar.a()).put("hashCode", zzayqVar.c()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcnjVar.b).put("isNative", zzayqVar.e()).put("isScreenOn", this.c.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzv.x().e()).put("appVolume", com.google.android.gms.ads.internal.zzv.x().a());
                Context context = this.a;
                put.put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.b(context.getApplicationContext()));
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                JSONObject put2 = jSONObject3.put("windowVisibility", zzaytVar.b).put("isAttachedToWindow", z);
                JSONObject jSONObject4 = new JSONObject();
                Rect rect = zzaytVar.c;
                JSONObject put3 = put2.put("viewBox", jSONObject4.put(C9698tH2.l, rect.top).put("bottom", rect.bottom).put("left", rect.left).put(C5445bv2.n0, rect.right));
                JSONObject jSONObject5 = new JSONObject();
                Rect rect2 = zzaytVar.d;
                JSONObject put4 = put3.put("adBox", jSONObject5.put(C9698tH2.l, rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put(C5445bv2.n0, rect2.right));
                JSONObject jSONObject6 = new JSONObject();
                Rect rect3 = zzaytVar.e;
                JSONObject put5 = put4.put("globalVisibleBox", jSONObject6.put(C9698tH2.l, rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put(C5445bv2.n0, rect3.right)).put("globalVisibleBoxVisible", zzaytVar.f);
                JSONObject jSONObject7 = new JSONObject();
                Rect rect4 = zzaytVar.g;
                JSONObject put6 = put5.put("localVisibleBox", jSONObject7.put(C9698tH2.l, rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put(C5445bv2.n0, rect4.right)).put("localVisibleBoxVisible", zzaytVar.h);
                JSONObject jSONObject8 = new JSONObject();
                Rect rect5 = zzaytVar.i;
                put6.put("hitBox", jSONObject8.put(C9698tH2.l, rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put(C5445bv2.n0, rect5.right)).put("screenDensity", displayMetrics.density);
                jSONObject3.put("isVisible", zzcnjVar.a);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C1)).booleanValue()) {
                    JSONArray jSONArray2 = new JSONArray();
                    List<Rect> list = zzaytVar.k;
                    if (list != null) {
                        for (Rect rect6 : list) {
                            jSONArray2.put(new JSONObject().put(C9698tH2.l, rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put(C5445bv2.n0, rect6.right));
                        }
                    }
                    jSONObject3.put("scrollableContainerBoxes", jSONArray2);
                }
                if (!TextUtils.isEmpty(zzcnjVar.e)) {
                    jSONObject3.put("doneReasonCode", "u");
                }
                jSONObject = jSONObject3;
            } else {
                throw new JSONException("Active view Info cannot be null.");
            }
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
