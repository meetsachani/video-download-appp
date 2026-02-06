package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C2638Cg0;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceFutureC8411o11;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzay {
    public final Object a = new Object();
    public String b = "";
    public String c = "";
    public boolean d = false;
    public boolean e = false;
    @InterfaceC5056aJ2
    public String f = "";
    public zzdvc g;

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static final String o(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzv.v().I(context, str2));
        InterfaceFutureC8411o11 b = new zzbo(context).b(0, str, hashMap, null);
        try {
            return (String) b.get(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(str);
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Interrupted while retrieving a response from: ".concat(valueOf), e);
            b.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String valueOf2 = String.valueOf(str);
            int i2 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Timeout while retrieving a response from: ".concat(valueOf2), e2);
            b.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            int i3 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error retrieving a response from: ".concat(valueOf3), e3);
            return null;
        }
    }

    public final zzdvc a() {
        return this.g;
    }

    public final String b() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    public final void c(Context context) {
        zzdvc zzdvcVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue() && (zzdvcVar = this.g) != null) {
            zzdvcVar.i(new zzav(this, context), zzdvb.DEBUG_MENU);
        }
    }

    public final void d(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzv.v();
        zzs.v(context, p(context, (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e5), str, str2));
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = p(context, (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h5), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzv.v();
        zzs.m(context, str, buildUpon.build().toString());
    }

    public final void f(boolean z) {
        synchronized (this.a) {
            try {
                this.e = z;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.t().j().f0(z);
                    zzdvc zzdvcVar = this.g;
                    if (zzdvcVar != null) {
                        zzdvcVar.m(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(zzdvc zzdvcVar) {
        this.g = zzdvcVar;
    }

    public final void h(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    @InterfaceC5056aJ2
    public final void i(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.f("Can not create dialog without Activity Context");
            return;
        }
        zzs.l.post(new zzax(this, context, str, z, z2));
    }

    public final boolean j(Context context, String str, String str2) {
        String o2 = o(context, p(context, (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g5), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o2)) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o2.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue()) {
                zzg j = com.google.android.gms.ads.internal.zzv.t().j();
                if (true != equals) {
                    str = "";
                }
                j.j0(str);
            }
            return equals;
        } catch (JSONException e) {
            int i2 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    @InterfaceC5056aJ2
    public final boolean k(Context context, String str, String str2) {
        boolean z;
        String o2 = o(context, p(context, (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f5), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o2)) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(o2.trim());
            String optString = jSONObject.optString("gct");
            this.f = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue()) {
                if ("0".equals(this.f) || C2638Cg0.Y4.equals(this.f)) {
                    z = true;
                } else {
                    z = false;
                }
                f(z);
                zzg j = com.google.android.gms.ads.internal.zzv.t().j();
                if (!z) {
                    str = "";
                }
                j.j0(str);
            }
            synchronized (this.a) {
                this.c = optString;
            }
            return true;
        } catch (JSONException e) {
            int i2 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final boolean n(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && m()) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Sending troubleshooting signals to the server.");
            e(context, str, str2, str3);
            return true;
        }
        return false;
    }

    public final Uri p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                com.google.android.gms.ads.internal.zzv.v();
                try {
                    str5 = new String(IOUtils.g(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    int i = zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Error reading from internal storage.");
                    str5 = "";
                }
                this.b = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzv.v();
                    this.b = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzv.v();
                    String str6 = this.b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        int i2 = zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}
