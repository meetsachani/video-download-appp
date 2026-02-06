package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class CH2 {
    public final Map<String, Object> a;
    public final Set<Closeable> b;
    public volatile boolean c;

    public CH2() {
        this.a = new HashMap();
        this.b = new LinkedHashSet();
        this.c = false;
    }

    public static void c(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void a(Closeable closeable) {
        Set<Closeable> set = this.b;
        if (set != null) {
            synchronized (set) {
                this.b.add(closeable);
            }
        }
    }

    public final void b() {
        this.c = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                try {
                    for (Object obj : this.a.values()) {
                        c(obj);
                    }
                } finally {
                }
            }
        }
        Set<Closeable> set = this.b;
        if (set != null) {
            synchronized (set) {
                try {
                    for (Closeable closeable : this.b) {
                        c(closeable);
                    }
                } finally {
                }
            }
        }
        e();
    }

    public <T> T d(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.a.get(str);
        }
        return t;
    }

    public <T> T f(String str, T t) {
        Object obj;
        synchronized (this.a) {
            try {
                obj = this.a.get(str);
                if (obj == null) {
                    this.a.put(str, t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.c) {
            c(t);
        }
        return t;
    }

    public CH2(Closeable... closeableArr) {
        this.a = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.b = linkedHashSet;
        this.c = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }

    public void e() {
    }
}
