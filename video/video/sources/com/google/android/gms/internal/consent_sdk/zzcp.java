package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Iterator;
import java.util.Set;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public final class zzcp {
    @InterfaceC11300zs1
    public static zzcn a(Context context, String str) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(RemoteSettings.i, -1);
            int length = split.length;
            if (length == 1) {
                String valueOf = String.valueOf(context.getPackageName());
                str3 = split[0];
                str2 = valueOf.concat("_preferences");
            } else if (length == 2) {
                str2 = split[0];
                str3 = split[1];
            } else {
                return null;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return new zzcn(str2, str3);
            }
            return null;
        }
        return null;
    }

    public static void b(Context context, Set set) {
        SharedPreferences.Editor f;
        zzco zzcoVar = new zzco(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzcn a = a(context, str);
            if (a != null) {
                f = zzcoVar.f(a.a);
                f.remove(a.b);
            } else {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            }
        }
        zzcoVar.c();
    }
}
