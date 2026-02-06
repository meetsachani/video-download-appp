package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class OY0 extends PY0 {
    public final InterfaceC3540Li1 f;

    /* loaded from: classes.dex */
    public static class b<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, OY0> X;

        public OY0 a() {
            return this.X.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.X.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            OY0 value = this.X.getValue();
            if (value == null) {
                return null;
            }
            return value.p();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC3540Li1) {
                return this.X.getValue().m((InterfaceC3540Li1) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry<K, OY0> entry) {
            this.X = entry;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator<Map.Entry<K, Object>> X;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.X = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.X.next();
            if (next.getValue() instanceof OY0) {
                return new b(next);
            }
            return next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.X.remove();
        }
    }

    public OY0(InterfaceC3540Li1 interfaceC3540Li1, C3151Hj0 c3151Hj0, AbstractC8616os abstractC8616os) {
        super(c3151Hj0, abstractC8616os);
        this.f = interfaceC3540Li1;
    }

    @Override // o.PY0
    public boolean c() {
        if (!super.c() && this.c != this.f) {
            return false;
        }
        return true;
    }

    @Override // o.PY0
    public boolean equals(Object obj) {
        return p().equals(obj);
    }

    @Override // o.PY0
    public int hashCode() {
        return p().hashCode();
    }

    public InterfaceC3540Li1 p() {
        return g(this.f);
    }

    public String toString() {
        return p().toString();
    }
}
