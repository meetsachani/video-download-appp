package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public class zzfr {
    public static HashMap<String, String> h;
    public static Object m;
    public static boolean n;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    @InterfaceC11300zs1
    public static ContentResolver f = null;
    @InterfaceC11300zs1
    public static zzb g = null;
    public static final HashMap<String, Boolean> i = new HashMap<>(16, 1.0f);
    public static final HashMap<String, Integer> j = new HashMap<>(16, 1.0f);
    public static final HashMap<String, Long> k = new HashMap<>(16, 1.0f);
    public static final HashMap<String, Float> l = new HashMap<>(16, 1.0f);

    /* renamed from: o  reason: collision with root package name */
    public static String[] f305o = new String[0];

    /* loaded from: classes3.dex */
    public interface zza<T extends Map<String, String>> {
        T u(int i);
    }

    /* loaded from: classes3.dex */
    public interface zzb {
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzfr.class) {
            try {
                String str3 = null;
                if (h == null) {
                    e.set(false);
                    h = new HashMap<>(16, 1.0f);
                    m = new Object();
                    n = false;
                    contentResolver.registerContentObserver(a, true, new zzfu(null));
                } else if (e.getAndSet(false)) {
                    h.clear();
                    i.clear();
                    j.clear();
                    k.clear();
                    l.clear();
                    m = new Object();
                    n = false;
                }
                Object obj = m;
                if (h.containsKey(str)) {
                    String str4 = h.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                for (String str5 : f305o) {
                    if (str.startsWith(str5)) {
                        if (!n) {
                            HashMap<String, String> hashMap = (HashMap) b(contentResolver, f305o, new zzft());
                            if (hashMap != null) {
                                if (!hashMap.isEmpty()) {
                                    Set<String> keySet = hashMap.keySet();
                                    keySet.removeAll(i.keySet());
                                    keySet.removeAll(j.keySet());
                                    keySet.removeAll(k.keySet());
                                    keySet.removeAll(l.keySet());
                                }
                                if (!hashMap.isEmpty()) {
                                    if (h.isEmpty()) {
                                        h = hashMap;
                                    } else {
                                        h.putAll(hashMap);
                                    }
                                }
                                n = true;
                            }
                            if (h.containsKey(str)) {
                                String str6 = h.get(str);
                                if (str6 != null) {
                                    str3 = str6;
                                }
                                return str3;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
                if (query == null) {
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        d(obj, str, null);
                        query.close();
                        return null;
                    }
                    String string = query.getString(1);
                    query.close();
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    d(obj, str, string);
                    if (string == null) {
                        return null;
                    }
                    return string;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static <T extends Map<String, String>> T b(ContentResolver contentResolver, String[] strArr, zza<T> zzaVar) {
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        if (query == null) {
            return null;
        }
        T u = zzaVar.u(query.getCount());
        while (query.moveToNext()) {
            try {
                u.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return u;
    }

    public static void d(Object obj, String str, String str2) {
        synchronized (zzfr.class) {
            try {
                if (obj == m) {
                    h.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
