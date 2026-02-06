package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
class KeysMap {
    public final Map<String, String> a = new HashMap();
    public final int b;
    public final int c;

    public KeysMap(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public static String c(String str, int i) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i) {
                return trim.substring(0, i);
            }
            return trim;
        }
        return str;
    }

    @InterfaceC5670cr1
    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public final String b(String str) {
        if (str != null) {
            return c(str, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized boolean d(String str, String str2) {
        String b = b(str);
        if (this.a.size() >= this.b && !this.a.containsKey(b)) {
            Logger f = Logger.f();
            f.m("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b);
            return false;
        }
        String c = c(str2, this.c);
        if (CommonUtils.A(this.a.get(b), c)) {
            return false;
        }
        Map<String, String> map = this.a;
        if (str2 == null) {
            c = "";
        }
        map.put(b, c);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        String c;
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String b = b(entry.getKey());
                if (this.a.size() >= this.b && !this.a.containsKey(b)) {
                    i++;
                }
                String value = entry.getValue();
                Map<String, String> map2 = this.a;
                if (value == null) {
                    c = "";
                } else {
                    c = c(value, this.c);
                }
                map2.put(b, c);
            }
            if (i > 0) {
                Logger f = Logger.f();
                f.m("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
