package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbkp implements zzbjw {
    public final Context a;

    public zzbkp(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        if (map.containsKey("text") && !TextUtils.isEmpty((CharSequence) map.get("text"))) {
            com.google.android.gms.ads.internal.util.zze.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
            if (map.containsKey("title")) {
                intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
            }
            try {
                com.google.android.gms.ads.internal.zzv.v();
                com.google.android.gms.ads.internal.util.zzs.u(this.a, intent);
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Failed to open Share Sheet", e);
                com.google.android.gms.ads.internal.zzv.t().x(e, "ShareSheetGmsgHandler.onGmsg");
            }
        }
    }
}
