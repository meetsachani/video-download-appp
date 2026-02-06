package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbu extends QueryInfoGenerationCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ TaggingLibraryJsInterface b;

    public zzbu(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.a = str;
        this.b = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void a(String str) {
        String str2;
        long j;
        zzgdj zzgdjVar;
        zzj zzjVar;
        WebView webView;
        zzf zzfVar;
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        if (((Boolean) zzbfa.c.e()).booleanValue()) {
            zzfVar = this.b.k;
            str2 = ",\"as\":".concat(zzfVar.a().toString());
        } else {
            str2 = "";
        }
        String str3 = this.a;
        Locale locale = Locale.getDefault();
        zzbef zzbefVar = zzbfa.e;
        if (((Boolean) zzbefVar.e()).booleanValue()) {
            j = ((Long) zzbfa.h.e()).longValue();
        } else {
            j = 0;
        }
        final String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str3, str, Long.valueOf(j), str2);
        if (((Boolean) zzbefVar.e()).booleanValue()) {
            try {
                zzgdjVar = this.b.h;
                zzgdjVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbu.this.b.b;
                        webView2.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.t().w(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            webView = this.b.b;
            webView.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbfa.c.e()).booleanValue() && ((Boolean) zzbfa.d.e()).booleanValue()) {
            zzjVar = this.b.l;
            zzjVar.c();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void b(QueryInfo queryInfo) {
        String str;
        final String format;
        zzf zzfVar;
        zzgdj zzgdjVar;
        zzj zzjVar;
        WebView webView;
        long j;
        zzf zzfVar2;
        String c = queryInfo.c();
        long j2 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.a);
            if (((Boolean) zzbfa.c.e()).booleanValue()) {
                zzfVar2 = this.b.k;
                jSONObject.put("as", zzfVar2.a());
            }
            if (((Boolean) zzbfa.e.e()).booleanValue()) {
                j = ((Long) zzbfa.h.e()).longValue();
            } else {
                j = 0;
            }
            jSONObject.put("sdk_ttl_ms", j);
            jSONObject.put("signal", c);
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            if (((Boolean) zzbfa.c.e()).booleanValue()) {
                zzfVar = this.b.k;
                str = ",\"as\":".concat(zzfVar.a().toString());
            } else {
                str = "";
            }
            String str2 = this.a;
            Locale locale = Locale.getDefault();
            String c2 = queryInfo.c();
            if (((Boolean) zzbfa.e.e()).booleanValue()) {
                j2 = ((Long) zzbfa.h.e()).longValue();
            }
            format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, c2, Long.valueOf(j2), str);
        }
        if (((Boolean) zzbfa.e.e()).booleanValue()) {
            try {
                zzgdjVar = this.b.h;
                zzgdjVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbu.this.b.b;
                        webView2.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.t().w(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            webView = this.b.b;
            webView.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbfa.c.e()).booleanValue() && ((Boolean) zzbfa.d.e()).booleanValue()) {
            zzjVar = this.b.l;
            zzjVar.c();
        }
    }
}
