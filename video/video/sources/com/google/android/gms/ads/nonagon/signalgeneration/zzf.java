package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzfyh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C6273fK2;
import o.C6528gK2;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzf {
    public final Context a;
    @InterfaceC11300zs1
    public final ApplicationInfo b;
    public final List c;
    public final VersionInfoParcel d;
    public final JSONObject e = new JSONObject();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public zzf(Context context, zzbce zzbceVar, List list, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = context.getApplicationInfo();
        this.c = list;
        this.d = versionInfoParcel;
    }

    public final JSONObject a() {
        if (!this.f.get()) {
            b(null);
        }
        return this.e;
    }

    public final void b(@InterfaceC11300zs1 WebView webView) {
        String[] split;
        if (!this.f.getAndSet(true)) {
            PackageInfo packageInfo = null;
            try {
                ApplicationInfo applicationInfo = this.b;
                if (applicationInfo != null) {
                    packageInfo = Wrappers.a(this.a).f(applicationInfo.packageName, 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                try {
                    JSONObject jSONObject = this.e;
                    jSONObject.put("vc", packageInfo.versionCode);
                    jSONObject.put("vnm", packageInfo.versionName);
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "PawAppSignalGenerator.initialize");
                }
            }
            ApplicationInfo applicationInfo2 = this.b;
            if (applicationInfo2 != null) {
                this.e.put("pn", applicationInfo2.packageName);
            }
            JSONObject jSONObject2 = this.e;
            List list = this.c;
            ArrayList arrayList = new ArrayList();
            for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.da)).split(",", -1)) {
                if (list.contains(str)) {
                    arrayList.add(str);
                }
            }
            jSONObject2.put("eid", arrayList);
            jSONObject2.put("js", this.d.X);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (obj != null) {
                    jSONObject2.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
                }
            }
            if (((Boolean) zzbfa.b.e()).booleanValue() && C6528gK2.a(C6528gK2.R) && webView != null) {
                C6273fK2.a(webView, String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ca), a()), zzfyh.G("*"));
            }
        }
    }
}
