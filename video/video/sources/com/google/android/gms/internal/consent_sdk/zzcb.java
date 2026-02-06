package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.InterfaceC6184ey2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcb implements zzd {
    public final Application a;
    public final zzbx b;
    public final Handler c;
    public final Executor d;
    public final zze e;
    public final zzao f;
    public final zzbc g;
    public final zzaq h;

    public zzcb(Application application, zzbx zzbxVar, Handler handler, Executor executor, zze zzeVar, zzao zzaoVar, zzbc zzbcVar, zzaq zzaqVar) {
        this.a = application;
        this.b = zzbxVar;
        this.c = handler;
        this.d = executor;
        this.e = zzeVar;
        this.f = zzaoVar;
        this.g = zzbcVar;
        this.h = zzaqVar;
    }

    public static /* synthetic */ void c(zzcb zzcbVar) {
        String concat;
        JSONObject jSONObject = new JSONObject();
        Application application = zzcbVar.a;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                concat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", concat);
            JSONObject jSONObject2 = new JSONObject();
            zzaq zzaqVar = zzcbVar.h;
            for (String str : zzaqVar.c().keySet()) {
                jSONObject2.put(str, zzaqVar.c().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        zzcbVar.g.d().d("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor a() {
        final Handler handler = this.c;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzbz
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    @InterfaceC6184ey2
    public final boolean b(String str, JSONObject jSONObject) {
        boolean z;
        char c = 65535;
        int i = 3;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        if (z) {
            if (!z) {
                if (!z) {
                    if (!z) {
                        return false;
                    }
                    d();
                    return true;
                }
                g(jSONObject);
                return true;
            }
            String optString = jSONObject.optString("status");
            switch (optString.hashCode()) {
                case -954325659:
                    if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                        c = 3;
                        break;
                    }
                    break;
                case -258041904:
                    if (optString.equals("personalized")) {
                        c = 0;
                        break;
                    }
                    break;
                case 429411856:
                    if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                        c = 4;
                        break;
                    }
                    break;
                case 467888915:
                    if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1666911234:
                    if (optString.equals("non_personalized")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1725474845:
                    if (optString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c != 0 && c != 1 && c != 2 && c != 3 && c != 4) {
                if (c != 5) {
                    this.g.i(new zzg(1, "We are getting something wrong with the webview."));
                    return true;
                }
                i = 1;
            }
            this.g.h(i);
            return true;
        }
        this.g.j();
        return true;
    }

    @InterfaceC6184ey2
    public final void d() {
        this.d.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzca
            @Override // java.lang.Runnable
            public final void run() {
                zzcb.c(zzcb.this);
            }
        });
    }

    public final void e(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.e.b(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.f);
    }

    public final void f(int i, String str, String str2) {
        this.g.k(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }

    @InterfaceC6184ey2
    public final void g(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            this.b.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e);
        }
    }
}
