package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbbt;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfj;
import com.google.android.gms.internal.ads.zzece;
import java.io.InputStream;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzaa {
    public /* synthetic */ zzaa(zzz zzzVar) {
    }

    @InterfaceC11300zs1
    public CookieManager a(Context context) {
        throw null;
    }

    public WebResourceResponse b(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public zzcfj c(zzcfb zzcfbVar, zzbbt zzbbtVar, boolean z, @InterfaceC11300zs1 zzece zzeceVar) {
        throw null;
    }

    public boolean d(Activity activity, Configuration configuration) {
        return false;
    }

    @InterfaceC11300zs1
    public Intent e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public zzbca.zzq f(Context context, TelephonyManager telephonyManager) {
        return zzbca.zzq.ENUM_UNKNOWN;
    }

    public void g(Context context, String str, String str2) {
    }

    public boolean h(Context context, String str) {
        return false;
    }

    public int i(AudioManager audioManager) {
        return 0;
    }

    public void j(Activity activity) {
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
