package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public final class zzco {
    public static final zzdf d = zzdf.w("UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    public final Context b;
    public final Map a = new HashMap();
    public final Map c = new HashMap();

    public zzco(Context context) {
        this.b = context;
    }

    public final Map b() {
        return this.a;
    }

    public final void c() {
        for (SharedPreferences.Editor editor : this.c.values()) {
            editor.commit();
        }
    }

    public final void d() {
        this.a.clear();
    }

    public final boolean e(String str, @InterfaceC11300zs1 Object obj) {
        zzcn a = zzcp.a(this.b, str);
        if (a == null) {
            return false;
        }
        SharedPreferences.Editor f = f(a.a);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            String str2 = a.b;
            f.putInt(str2, num.intValue());
            if (d.contains(str2)) {
                this.a.put(str2, num);
                return true;
            }
            return true;
        } else if (obj instanceof Long) {
            f.putLong(a.b, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof Double) {
            f.putFloat(a.b, ((Double) obj).floatValue());
            return true;
        } else if (obj instanceof Float) {
            f.putFloat(a.b, ((Float) obj).floatValue());
            return true;
        } else if (obj instanceof Boolean) {
            f.putBoolean(a.b, ((Boolean) obj).booleanValue());
            return true;
        } else if (!(obj instanceof String)) {
            return false;
        } else {
            f.putString(a.b, (String) obj);
            return true;
        }
    }

    public final SharedPreferences.Editor f(String str) {
        Map map = this.c;
        if (!map.containsKey(str)) {
            map.put(str, this.b.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) map.get(str);
    }
}
