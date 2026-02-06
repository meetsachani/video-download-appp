package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.messaging.GmsRpc;
import java.util.Map;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbyl {
    @InterfaceC5056aJ2
    public static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String b(Uri uri, Context context, Map map) {
        if (!com.google.android.gms.ads.internal.zzv.s().p(context)) {
            return uri.toString();
        }
        String b = com.google.android.gms.ads.internal.zzv.s().b(context);
        if (b == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w0);
        String uri2 = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v0)).booleanValue() && uri2.contains(str)) {
            com.google.android.gms.ads.internal.zzv.s().j(context, b, (Map) map.get("_ac"));
            return d(uri2, context).replace(str, b);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u0)).booleanValue()) {
                String uri3 = a(d(uri2, context), "fbs_aeid", b).toString();
                com.google.android.gms.ads.internal.zzv.s().j(context, b, (Map) map.get("_ac"));
                return uri3;
            }
        }
        return uri2;
    }

    public static String c(String str, Context context, boolean z, Map map) {
        String b;
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D0)).booleanValue() || z) && com.google.android.gms.ads.internal.zzv.s().p(context) && !TextUtils.isEmpty(str) && (b = com.google.android.gms.ads.internal.zzv.s().b(context)) != null) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w0);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v0)).booleanValue() && str.contains(str2)) {
                if (com.google.android.gms.ads.internal.zzv.v().P(str)) {
                    com.google.android.gms.ads.internal.zzv.s().j(context, b, (Map) map.get("_ac"));
                    return d(str, context).replace(str2, b);
                } else if (com.google.android.gms.ads.internal.zzv.v().Q(str)) {
                    com.google.android.gms.ads.internal.zzv.s().k(context, b, (Map) map.get("_ai"));
                    return d(str, context).replace(str2, b);
                } else {
                    return str;
                }
            } else if (!str.contains("fbs_aeid")) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u0)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.zzv.v().P(str)) {
                        com.google.android.gms.ads.internal.zzv.s().j(context, b, (Map) map.get("_ac"));
                        return a(d(str, context), "fbs_aeid", b).toString();
                    } else if (com.google.android.gms.ads.internal.zzv.v().Q(str)) {
                        com.google.android.gms.ads.internal.zzv.s().k(context, b, (Map) map.get("_ai"));
                        return a(d(str, context), "fbs_aeid", b).toString();
                    } else {
                        return str;
                    }
                }
                return str;
            } else {
                return str;
            }
        }
        return str;
    }

    public static String d(String str, Context context) {
        String e = com.google.android.gms.ads.internal.zzv.s().e(context);
        String c = com.google.android.gms.ads.internal.zzv.s().c(context);
        if (!str.contains(GmsRpc.A) && !TextUtils.isEmpty(e)) {
            str = a(str, GmsRpc.A, e).toString();
        }
        if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(c)) {
            return a(str, "fbs_aiid", c).toString();
        }
        return str;
    }
}
