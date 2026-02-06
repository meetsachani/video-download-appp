package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C2381j;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcqj extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final Context Y0;
    public View Z0;

    public zzcqj(Context context) {
        super(context);
        this.Y0 = context;
    }

    public static zzcqj a(Context context, View view, zzfbu zzfbuVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcqj zzcqjVar = new zzcqj(context);
        List list = zzfbuVar.u;
        if (!list.isEmpty() && (resources = zzcqjVar.Y0.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfbv zzfbvVar = (zzfbv) list.get(0);
            float f = displayMetrics.density;
            zzcqjVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfbvVar.a * f), (int) (zzfbvVar.b * f)));
        }
        zzcqjVar.Z0 = view;
        zzcqjVar.addView(view);
        com.google.android.gms.ads.internal.zzv.D();
        zzcan.b(zzcqjVar, zzcqjVar);
        com.google.android.gms.ads.internal.zzv.D();
        zzcan.a(zzcqjVar, zzcqjVar);
        JSONObject jSONObject = zzfbuVar.h0;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqjVar.Y0);
        JSONObject optJSONObject = jSONObject.optJSONObject(C2381j.e1);
        if (optJSONObject != null) {
            zzcqjVar.c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcqjVar.c(optJSONObject2, relativeLayout, 12);
        }
        zzcqjVar.addView(relativeLayout);
        return zzcqjVar;
    }

    public final int b(double d) {
        com.google.android.gms.ads.internal.client.zzbb.b();
        return com.google.android.gms.ads.internal.util.client.zzf.D(this.Y0, (int) d);
    }

    public final void c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.Y0);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b, 0, b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.Z0.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.Z0.setY(-iArr[1]);
    }
}
