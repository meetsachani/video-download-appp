package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.InterfaceC7011iK;

/* loaded from: classes3.dex */
public final class zzaq {
    public static final zzdf d = zzdf.r("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    public final Application a;
    public final SharedPreferences b;
    public final Set c;

    public zzaq(Application application) {
        this.a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.b = sharedPreferences;
        this.c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final int a() {
        return this.b.getInt("consent_status", 0);
    }

    public final InterfaceC7011iK.d b() {
        return InterfaceC7011iK.d.valueOf(this.b.getString("privacy_options_requirement_status", InterfaceC7011iK.d.UNKNOWN.name()));
    }

    public final Map c() {
        String str;
        Set<String> stringSet = this.b.getStringSet("stored_info", zzdf.p());
        if (stringSet.isEmpty()) {
            stringSet = d;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.a;
            zzcn a = zzcp.a(application, str2);
            if (a == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str2)));
            } else {
                Object obj = application.getSharedPreferences(a.a, 0).getAll().get(a.b);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str2)));
                } else {
                    if (obj instanceof Boolean) {
                        if (true != ((Boolean) obj).booleanValue()) {
                            str = "0";
                        } else {
                            str = "1";
                        }
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str2)));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }

    public final Set d() {
        return this.c;
    }

    public final void e() {
        Application application = this.a;
        Set set = this.c;
        zzcp.b(application, set);
        set.clear();
        this.b.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
    }

    public final void f() {
        this.b.edit().putStringSet("written_values", this.c).commit();
    }

    public final void g(int i) {
        this.b.edit().putInt("consent_status", i).commit();
    }

    public final void h(boolean z) {
        this.b.edit().putBoolean("is_pub_misconfigured", z).commit();
    }

    public final void i(InterfaceC7011iK.d dVar) {
        this.b.edit().putString("privacy_options_requirement_status", dVar.name()).commit();
    }

    public final void j(Set set) {
        this.b.edit().putStringSet("stored_info", set).commit();
    }

    public final boolean k() {
        return this.b.getBoolean("is_pub_misconfigured", false);
    }
}
