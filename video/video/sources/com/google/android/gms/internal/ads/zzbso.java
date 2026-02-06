package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbso extends zzbsp implements zzbjw {
    public final zzcfb c;
    public final Context d;
    public final WindowManager e;
    public final zzbcd f;
    public DisplayMetrics g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f231o;

    public zzbso(zzcfb zzcfbVar, Context context, zzbcd zzbcdVar) {
        super(zzcfbVar, "");
        this.i = -1;
        this.j = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.f231o = -1;
        this.c = zzcfbVar;
        this.d = context;
        this.f = zzbcdVar;
        this.e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObject;
        zzcfb zzcfbVar = (zzcfb) obj;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbb.b();
        DisplayMetrics displayMetrics = this.g;
        this.i = com.google.android.gms.ads.internal.util.client.zzf.B(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbb.b();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = com.google.android.gms.ads.internal.util.client.zzf.B(displayMetrics2, displayMetrics2.heightPixels);
        zzcfb zzcfbVar2 = this.c;
        Activity i = zzcfbVar2.i();
        if (i != null && i.getWindow() != null) {
            com.google.android.gms.ads.internal.zzv.v();
            int[] r = com.google.android.gms.ads.internal.util.zzs.r(i);
            com.google.android.gms.ads.internal.client.zzbb.b();
            this.l = com.google.android.gms.ads.internal.util.client.zzf.B(this.g, r[0]);
            com.google.android.gms.ads.internal.client.zzbb.b();
            this.m = com.google.android.gms.ads.internal.util.client.zzf.B(this.g, r[1]);
        } else {
            this.l = this.i;
            this.m = this.j;
        }
        if (zzcfbVar2.H().i()) {
            this.n = this.i;
            this.f231o = this.j;
        } else {
            zzcfbVar2.measure(0, 0);
        }
        e(this.i, this.j, this.l, this.m, this.h, this.k);
        zzbsn zzbsnVar = new zzbsn();
        zzbcd zzbcdVar = this.f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbsnVar.e(zzbcdVar.a(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbsnVar.c(zzbcdVar.a(intent2));
        zzbsnVar.a(zzbcdVar.b());
        zzbsnVar.d(zzbcdVar.c());
        zzbsnVar.b(true);
        boolean h = zzbsn.h(zzbsnVar);
        boolean j = zzbsn.j(zzbsnVar);
        boolean f = zzbsn.f(zzbsnVar);
        boolean i2 = zzbsn.i(zzbsnVar);
        try {
            jSONObject = new JSONObject().put("sms", h).put("tel", j).put("calendar", f).put("storePicture", i2).put("inlineVideo", zzbsn.g(zzbsnVar));
        } catch (JSONException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcfbVar2.a("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        zzcfbVar2.getLocationOnScreen(iArr);
        Context context = this.d;
        h(com.google.android.gms.ads.internal.client.zzbb.b().g(context, iArr[0]), com.google.android.gms.ads.internal.client.zzbb.b().g(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzo.j(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.f("Dispatching Ready Event.");
        }
        d(zzcfbVar2.m().X);
    }

    public final void h(int i, int i2) {
        int i3;
        Context context = this.d;
        int i4 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzv.v();
            i3 = com.google.android.gms.ads.internal.util.zzs.s((Activity) context)[0];
        } else {
            i3 = 0;
        }
        zzcfb zzcfbVar = this.c;
        if (zzcfbVar.H() == null || !zzcfbVar.H().i()) {
            int width = zzcfbVar.getWidth();
            int height = zzcfbVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g0)).booleanValue()) {
                if (width == 0) {
                    if (zzcfbVar.H() != null) {
                        width = zzcfbVar.H().c;
                    } else {
                        width = 0;
                    }
                }
                if (height == 0) {
                    if (zzcfbVar.H() != null) {
                        i4 = zzcfbVar.H().b;
                    }
                    this.n = com.google.android.gms.ads.internal.client.zzbb.b().g(context, width);
                    this.f231o = com.google.android.gms.ads.internal.client.zzbb.b().g(context, i4);
                }
            }
            i4 = height;
            this.n = com.google.android.gms.ads.internal.client.zzbb.b().g(context, width);
            this.f231o = com.google.android.gms.ads.internal.client.zzbb.b().g(context, i4);
        }
        b(i, i2 - i3, this.n, this.f231o);
        zzcfbVar.M().t0(i, i2);
    }
}
