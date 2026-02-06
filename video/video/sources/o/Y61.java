package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Y61<K, V> {
    public int a;
    public final C5250b71<K, V> b;
    public final C7915m31 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public Y61(int i) {
        this.a = i;
        if (i > 0) {
            this.b = new C5250b71<>(0, 0.75f);
            this.c = new C7915m31();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V a(K k) {
        C6562gT0.p(k, "key");
        return null;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.f;
        }
        return i;
    }

    public void c(boolean z, K k, V v, V v2) {
        C6562gT0.p(k, "key");
        C6562gT0.p(v, "oldValue");
    }

    public final void d() {
        r(-1);
    }

    public final int e() {
        int i;
        synchronized (this.c) {
            i = this.g;
        }
        return i;
    }

    public final V f(K k) {
        V d;
        C6562gT0.p(k, "key");
        synchronized (this.c) {
            V a = this.b.a(k);
            if (a != null) {
                this.h++;
                return a;
            }
            this.i++;
            V a2 = a(k);
            if (a2 == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    this.f++;
                    d = this.b.d(k, a2);
                    if (d != null) {
                        this.b.d(k, d);
                    } else {
                        this.d += n(k, a2);
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (d != null) {
                c(false, k, a2, d);
                return d;
            }
            r(this.a);
            return a2;
        }
    }

    public final int g() {
        int i;
        synchronized (this.c) {
            i = this.h;
        }
        return i;
    }

    public final int h() {
        int i;
        synchronized (this.c) {
            i = this.a;
        }
        return i;
    }

    public final int i() {
        int i;
        synchronized (this.c) {
            i = this.i;
        }
        return i;
    }

    public final V j(K k, V v) {
        V d;
        C6562gT0.p(k, "key");
        C6562gT0.p(v, "value");
        synchronized (this.c) {
            try {
                this.e++;
                this.d += n(k, v);
                d = this.b.d(k, v);
                if (d != null) {
                    this.d -= n(k, d);
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d != null) {
            c(false, k, d, v);
        }
        r(this.a);
        return d;
    }

    public final int k() {
        int i;
        synchronized (this.c) {
            i = this.e;
        }
        return i;
    }

    public final V l(K k) {
        V e;
        C6562gT0.p(k, "key");
        synchronized (this.c) {
            try {
                e = this.b.e(k);
                if (e != null) {
                    this.d -= n(k, e);
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e != null) {
            c(false, k, e, null);
        }
        return e;
    }

    public void m(int i) {
        if (i > 0) {
            synchronized (this.c) {
                this.a = i;
                C7458kA2 c7458kA2 = C7458kA2.a;
            }
            r(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final int n(K k, V v) {
        int p = p(k, v);
        if (p >= 0) {
            return p;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    public final int o() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public int p(K k, V v) {
        C6562gT0.p(k, "key");
        C6562gT0.p(v, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.c) {
            try {
                Iterator<T> it = this.b.b().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.c() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || this.b.c()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) C10662xF.H2(this.b.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.b.e(key);
                    this.d -= n(key, value);
                    this.g++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c(true, key, value, null);
        }
    }

    public String toString() {
        int i;
        String str;
        synchronized (this.c) {
            try {
                int i2 = this.h;
                int i3 = this.i + i2;
                if (i3 != 0) {
                    i = (i2 * 100) / i3;
                } else {
                    i = 0;
                }
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.h + ",misses=" + this.i + ",hitRate=" + i + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
