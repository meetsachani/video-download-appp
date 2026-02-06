package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class ConfigGetParameterHandler {
    @InterfaceC5056aJ2(otherwise = 3)
    public static final Charset e = Charset.forName("UTF-8");
    public static final Pattern f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    public static final Pattern g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    public final Set<BiConsumer<String, ConfigContainer>> a = new HashSet();
    public final Executor b;
    public final ConfigCacheClient c;
    public final ConfigCacheClient d;

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.b = executor;
        this.c = configCacheClient;
        this.d = configCacheClient2;
    }

    @InterfaceC11300zs1
    public static ConfigContainer g(ConfigCacheClient configCacheClient) {
        return configCacheClient.g();
    }

    @InterfaceC11300zs1
    public static Double i(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer g2 = g(configCacheClient);
        if (g2 == null) {
            return null;
        }
        try {
            return Double.valueOf(g2.g().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Set<String> j(ConfigCacheClient configCacheClient) {
        HashSet hashSet = new HashSet();
        ConfigContainer g2 = g(configCacheClient);
        if (g2 != null) {
            Iterator<String> keys = g2.g().keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
        }
        return hashSet;
    }

    public static TreeSet<String> l(String str, ConfigContainer configContainer) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> keys = configContainer.g().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    @InterfaceC11300zs1
    public static Long n(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer g2 = g(configCacheClient);
        if (g2 == null) {
            return null;
        }
        try {
            return Long.valueOf(g2.g().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @InterfaceC11300zs1
    public static String p(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer g2 = g(configCacheClient);
        if (g2 == null) {
            return null;
        }
        try {
            return g2.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void r(String str, String str2) {
        Log.w(FirebaseRemoteConfig.z, String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(BiConsumer<String, ConfigContainer> biConsumer) {
        synchronized (this.a) {
            this.a.add(biConsumer);
        }
    }

    public final void c(final String str, final ConfigContainer configContainer) {
        if (configContainer == null) {
            return;
        }
        synchronized (this.a) {
            try {
                for (final BiConsumer<String, ConfigContainer> biConsumer : this.a) {
                    this.b.execute(new Runnable() { // from class: o.RJ
                        @Override // java.lang.Runnable
                        public final void run() {
                            BiConsumer.this.accept(str, configContainer);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map<String, FirebaseRemoteConfigValue> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(j(this.c));
        hashSet.addAll(j(this.d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, q(str));
        }
        return hashMap;
    }

    public boolean e(String str) {
        String p = p(this.c, str);
        if (p != null) {
            if (f.matcher(p).matches()) {
                c(str, g(this.c));
                return true;
            } else if (g.matcher(p).matches()) {
                c(str, g(this.c));
                return false;
            }
        }
        String p2 = p(this.d, str);
        if (p2 != null) {
            if (f.matcher(p2).matches()) {
                return true;
            }
            if (g.matcher(p2).matches()) {
                return false;
            }
        }
        r(str, "Boolean");
        return false;
    }

    public byte[] f(String str) {
        String p = p(this.c, str);
        if (p != null) {
            c(str, g(this.c));
            return p.getBytes(e);
        }
        String p2 = p(this.d, str);
        if (p2 != null) {
            return p2.getBytes(e);
        }
        r(str, "ByteArray");
        return FirebaseRemoteConfig.r;
    }

    public double h(String str) {
        Double i = i(this.c, str);
        if (i != null) {
            c(str, g(this.c));
            return i.doubleValue();
        }
        Double i2 = i(this.d, str);
        if (i2 != null) {
            return i2.doubleValue();
        }
        r(str, "Double");
        return 0.0d;
    }

    public Set<String> k(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        ConfigContainer g2 = g(this.c);
        if (g2 != null) {
            treeSet.addAll(l(str, g2));
        }
        ConfigContainer g3 = g(this.d);
        if (g3 != null) {
            treeSet.addAll(l(str, g3));
        }
        return treeSet;
    }

    public long m(String str) {
        Long n = n(this.c, str);
        if (n != null) {
            c(str, g(this.c));
            return n.longValue();
        }
        Long n2 = n(this.d, str);
        if (n2 != null) {
            return n2.longValue();
        }
        r(str, "Long");
        return 0L;
    }

    public String o(String str) {
        String p = p(this.c, str);
        if (p != null) {
            c(str, g(this.c));
            return p;
        }
        String p2 = p(this.d, str);
        if (p2 != null) {
            return p2;
        }
        r(str, "String");
        return "";
    }

    public FirebaseRemoteConfigValue q(String str) {
        String p = p(this.c, str);
        if (p != null) {
            c(str, g(this.c));
            return new FirebaseRemoteConfigValueImpl(p, 2);
        }
        String p2 = p(this.d, str);
        if (p2 != null) {
            return new FirebaseRemoteConfigValueImpl(p2, 1);
        }
        r(str, "FirebaseRemoteConfigValue");
        return new FirebaseRemoteConfigValueImpl("", 0);
    }
}
