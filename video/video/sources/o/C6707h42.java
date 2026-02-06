package o;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.h42  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6707h42 {
    public final SharedPreferences a;
    public final Set<String> b;

    public C6707h42(SharedPreferences sharedPreferences, Set<String> set) {
        C6562gT0.p(sharedPreferences, "prefs");
        this.a = sharedPreferences;
        this.b = set;
    }

    public static /* synthetic */ String i(C6707h42 c6707h42, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c6707h42.h(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set k(C6707h42 c6707h42, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return c6707h42.j(str, set);
    }

    public final String a(String str) {
        Set<String> set = this.b;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(C6562gT0.C("Can't access key outside migration: ", str).toString());
    }

    public final boolean b(String str) {
        C6562gT0.p(str, "key");
        return this.a.contains(a(str));
    }

    public final Map<String, Object> c() {
        boolean contains;
        Map<String, ?> all = this.a.getAll();
        C6562gT0.o(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.b;
            if (set == null) {
                contains = true;
            } else {
                contains = set.contains(key);
            }
            if (contains) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C8683p81.j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = C10662xF.d6((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean d(String str, boolean z) {
        C6562gT0.p(str, "key");
        return this.a.getBoolean(a(str), z);
    }

    public final float e(String str, float f) {
        C6562gT0.p(str, "key");
        return this.a.getFloat(a(str), f);
    }

    public final int f(String str, int i) {
        C6562gT0.p(str, "key");
        return this.a.getInt(a(str), i);
    }

    public final long g(String str, long j) {
        C6562gT0.p(str, "key");
        return this.a.getLong(a(str), j);
    }

    public final String h(String str, String str2) {
        C6562gT0.p(str, "key");
        return this.a.getString(a(str), str2);
    }

    public final Set<String> j(String str, Set<String> set) {
        C6562gT0.p(str, "key");
        Set<String> stringSet = this.a.getStringSet(a(str), set);
        if (stringSet == null) {
            return null;
        }
        return C10662xF.c6(stringSet);
    }
}
