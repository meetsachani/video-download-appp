package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC11146zE1;

/* loaded from: classes.dex */
public class TE0<K extends InterfaceC11146zE1, V> {
    public final a<K, V> a = new a<>();
    public final Map<K, a<K, V>> b = new HashMap();

    /* loaded from: classes.dex */
    public static class a<K, V> {
        public final K a;
        public List<V> b;
        public a<K, V> c;
        public a<K, V> d;

        public a() {
            this(null);
        }

        public void a(V v) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(v);
        }

        public V b() {
            int c = c();
            if (c > 0) {
                return this.b.remove(c - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(K k) {
            this.d = this;
            this.c = this;
            this.a = k;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.d;
        aVar2.c = aVar.c;
        aVar.c.d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.c.d = aVar;
        aVar.d.c = aVar;
    }

    public V a(K k) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2;
        aVar.c = aVar2.c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2.d;
        aVar.c = aVar2;
        g(aVar);
    }

    public void d(K k, V v) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            c(aVar);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    public V f() {
        for (a aVar = this.a.d; !aVar.equals(this.a); aVar = aVar.d) {
            V v = (V) aVar.b();
            if (v != null) {
                return v;
            }
            e(aVar);
            this.b.remove(aVar.a);
            ((InterfaceC11146zE1) aVar.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.a.c;
        boolean z = false;
        while (!aVar.equals(this.a)) {
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
