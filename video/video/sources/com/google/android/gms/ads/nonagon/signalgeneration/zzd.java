package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzd {
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public final Context c;
    public final Object d = new Object();

    public zzd(Context context) {
        this.c = context;
    }

    public final int a() {
        int i;
        k();
        synchronized (this.d) {
            i = this.a.getInt("aav", -1);
        }
        return i;
    }

    public final int b() {
        int i;
        k();
        synchronized (this.d) {
            i = this.a.getInt("vc", -1);
        }
        return i;
    }

    @InterfaceC11300zs1
    public final String c(String str) {
        String string;
        k();
        synchronized (this.d) {
            string = this.a.getString(str, null);
            this.b.remove(str).commit();
        }
        return string;
    }

    @InterfaceC11300zs1
    public final String d() {
        String string;
        k();
        synchronized (this.d) {
            string = this.a.getString("dm", null);
        }
        return string;
    }

    @InterfaceC11300zs1
    public final String e() {
        String string;
        k();
        synchronized (this.d) {
            string = this.a.getString("pn", null);
        }
        return string;
    }

    public final Map f() {
        HashMap hashMap;
        k();
        synchronized (this.d) {
            try {
                Map<String, ?> all = this.a.getAll();
                hashMap = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        hashMap.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public final void g() {
        k();
        synchronized (this.d) {
            this.b.clear().commit();
        }
    }

    public final void h(String str, String str2) {
        k();
        synchronized (this.d) {
            this.b.putString(str, str2).commit();
        }
    }

    public final void i(String str, int i, String str2, int i2) {
        k();
        synchronized (this.d) {
            this.b.putString("pn", str).putInt("vc", i).putString("dm", str2).putInt("aav", i2).commit();
        }
    }

    public final boolean j(String str) {
        boolean contains;
        k();
        synchronized (this.d) {
            contains = this.a.contains(str);
        }
        return contains;
    }

    public final void k() {
        synchronized (this.d) {
            try {
                if (this.a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.c.getSharedPreferences("query_info_shared_prefs", 0);
                this.a = sharedPreferences;
                this.b = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
