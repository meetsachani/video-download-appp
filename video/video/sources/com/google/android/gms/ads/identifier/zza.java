package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zza extends Thread {
    public final /* synthetic */ Map X;

    public zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.X = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.X;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.a(buildUpon.build().toString());
    }
}
