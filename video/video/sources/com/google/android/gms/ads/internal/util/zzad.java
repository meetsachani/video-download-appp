package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzfrt;
import com.google.android.gms.internal.ads.zzfru;
import com.google.android.gms.internal.ads.zzfrv;
import com.google.android.gms.internal.ads.zzfun;
import com.google.android.gms.internal.ads.zzfvr;
import java.io.IOException;
import java.util.List;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzad {
    public static Bundle a(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return b(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    @InterfaceC5670cr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle b(Context context, String str) {
        JSONArray jSONArray;
        int i;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                int i2 = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.c("JSON parsing error", e);
            }
            if (jSONArray != null) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                String optString = optJSONObject.optString("bk");
                String optString2 = optJSONObject.optString("sk");
                int optInt = optJSONObject.optInt("type", -1);
                if (optInt != 0) {
                    if (optInt != 1) {
                        if (optInt != 2) {
                            i = 0;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i != 0) {
                    List f = zzfvr.b(zzfun.c('/')).f(optString2);
                    if (f.size() > 2 || f.isEmpty()) {
                        obj = null;
                    } else {
                        if (f.size() == 1) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                            str2 = (String) f.get(0);
                        } else {
                            sharedPreferences = context.getSharedPreferences((String) f.get(0), 0);
                            str2 = (String) f.get(1);
                        }
                        obj = sharedPreferences.getAll().get(str2);
                    }
                    if (obj != null) {
                        int i4 = i - 1;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (obj instanceof Boolean) {
                                    bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                                }
                            } else if (obj instanceof Integer) {
                                bundle.putInt(optString, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(optString, ((Long) obj).longValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(optString, ((Float) obj).floatValue());
                            }
                        } else if (obj instanceof String) {
                            bundle.putString(optString, (String) obj);
                        }
                    }
                }
            }
            return bundle;
        }
        jSONArray = null;
        if (jSONArray != null) {
        }
    }

    public static void c(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfrt k = zzfrt.k(context);
            zzfru j = zzfru.j(context);
            zzfrv a = zzfrv.a(context);
            k.l();
            k.m();
            j.k();
            a.b(null);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                return;
            }
            throw new IOException("Failed to remove query_info_shared_prefs");
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzv.t().x(e2, "clearStorageOnIdlessMode_scar");
        }
    }
}
