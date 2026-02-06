package o;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class U61 implements InterfaceC2727De {
    public static final int h = 4194304;
    public static final int i = 8;
    public static final int j = 2;
    public final TE0<a, Object> b;
    public final b c;
    public final Map<Class<?>, NavigableMap<Integer, Integer>> d;
    public final Map<Class<?>, InterfaceC4784Yd<?>> e;
    public final int f;
    public int g;

    /* loaded from: classes.dex */
    public static final class a implements InterfaceC11146zE1 {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // o.InterfaceC11146zE1
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Class<?> cls) {
            this.b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = this.b * 31;
            Class<?> cls = this.c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends AbstractC7597kl<a> {
        @Override // o.AbstractC7597kl
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i, Class<?> cls) {
            a b = b();
            b.b(i, cls);
            return b;
        }
    }

    public U61() {
        this.b = new TE0<>();
        this.c = new b();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = 4194304;
    }

    @Override // o.InterfaceC2727De
    public synchronized void a(int i2) {
        try {
            if (i2 >= 40) {
                b();
            } else if (i2 >= 20 || i2 == 15) {
                h(this.f / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.InterfaceC2727De
    public synchronized void b() {
        h(0);
    }

    @Override // o.InterfaceC2727De
    public synchronized <T> T c(int i2, Class<T> cls) {
        a e;
        try {
            Integer ceilingKey = n(cls).ceilingKey(Integer.valueOf(i2));
            if (q(i2, ceilingKey)) {
                e = this.c.e(ceilingKey.intValue(), cls);
            } else {
                e = this.c.e(i2, cls);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) m(e, cls);
    }

    @Override // o.InterfaceC2727De
    public synchronized <T> T d(int i2, Class<T> cls) {
        return (T) m(this.c.e(i2, cls), cls);
    }

    @Override // o.InterfaceC2727De
    @Deprecated
    public <T> void e(T t, Class<T> cls) {
        put(t);
    }

    public final void f(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> n = n(cls);
        Integer num = n.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                n.remove(Integer.valueOf(i2));
                return;
            } else {
                n.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    public final void g() {
        h(this.f);
    }

    public final void h(int i2) {
        while (this.g > i2) {
            Object f = this.b.f();
            C10175vF1.e(f);
            InterfaceC4784Yd i3 = i(f);
            this.g -= i3.b(f) * i3.a();
            f(i3.b(f), f.getClass());
            if (Log.isLoggable(i3.i0(), 2)) {
                Log.v(i3.i0(), "evicted: " + i3.b(f));
            }
        }
    }

    public final <T> InterfaceC4784Yd<T> i(T t) {
        return j(t.getClass());
    }

    public final <T> InterfaceC4784Yd<T> j(Class<T> cls) {
        InterfaceC4784Yd<T> c10808xr;
        InterfaceC4784Yd<T> interfaceC4784Yd = (InterfaceC4784Yd<T>) this.e.get(cls);
        if (interfaceC4784Yd == null) {
            if (cls.equals(int[].class)) {
                c10808xr = new KR0();
            } else if (cls.equals(byte[].class)) {
                c10808xr = new C10808xr();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.e.put(cls, c10808xr);
            return c10808xr;
        }
        return interfaceC4784Yd;
    }

    public final <T> T k(a aVar) {
        return (T) this.b.a(aVar);
    }

    public int l() {
        int i2 = 0;
        for (Class<?> cls : this.d.keySet()) {
            for (Integer num : this.d.get(cls).keySet()) {
                i2 += num.intValue() * this.d.get(cls).get(num).intValue() * j(cls).a();
            }
        }
        return i2;
    }

    public final <T> T m(a aVar, Class<T> cls) {
        InterfaceC4784Yd<T> j2 = j(cls);
        T t = (T) k(aVar);
        if (t != null) {
            this.g -= j2.b(t) * j2.a();
            f(j2.b(t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(j2.i0(), 2)) {
                Log.v(j2.i0(), "Allocated " + aVar.b + " bytes");
            }
            return j2.newArray(aVar.b);
        }
        return t;
    }

    public final NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.d.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.d.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final boolean o() {
        int i2 = this.g;
        if (i2 != 0 && this.f / i2 < 2) {
            return false;
        }
        return true;
    }

    public final boolean p(int i2) {
        if (i2 <= this.f / 2) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC2727De
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        InterfaceC4784Yd<T> j2 = j(cls);
        int b2 = j2.b(t);
        int a2 = j2.a() * b2;
        if (!p(a2)) {
            return;
        }
        a e = this.c.e(b2, cls);
        this.b.d(e, t);
        NavigableMap<Integer, Integer> n = n(cls);
        Integer num = n.get(Integer.valueOf(e.b));
        Integer valueOf = Integer.valueOf(e.b);
        int i2 = 1;
        if (num != null) {
            i2 = 1 + num.intValue();
        }
        n.put(valueOf, Integer.valueOf(i2));
        this.g += a2;
        g();
    }

    public final boolean q(int i2, Integer num) {
        if (num != null) {
            if (o() || num.intValue() <= i2 * 8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public U61(int i2) {
        this.b = new TE0<>();
        this.c = new b();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = i2;
    }
}
