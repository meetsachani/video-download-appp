package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C6118ei0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfmr extends zzfmn {
    public WebView e;
    public Long f;
    public final Map g;

    public zzfmr(String str, Map map, String str2) {
        super(str);
        this.f = null;
        this.g = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final void c() {
        long convert;
        super.c();
        if (this.f == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfmq(this), Math.max(C6118ei0.q2 - convert, 2000L));
        this.e = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final void i(zzflf zzflfVar, zzfld zzfldVar) {
        JSONObject jSONObject = new JSONObject();
        Map i = zzfldVar.i();
        Iterator it = i.keySet().iterator();
        if (!it.hasNext()) {
            j(zzflfVar, zzfldVar, jSONObject);
        } else {
            zzflp zzflpVar = (zzflp) i.get((String) it.next());
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final void o() {
        WebView webView = new WebView(zzfmc.b().a());
        this.e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.e.getSettings().setAllowContentAccess(false);
        this.e.getSettings().setAllowFileAccess(false);
        this.e.setWebViewClient(new zzfmp(this));
        n(this.e);
        zzfme.k(this.e, null);
        Map map = this.g;
        Iterator it = map.keySet().iterator();
        if (!it.hasNext()) {
            this.f = Long.valueOf(System.nanoTime());
        } else {
            zzflp zzflpVar = (zzflp) map.get((String) it.next());
            throw null;
        }
    }
}
