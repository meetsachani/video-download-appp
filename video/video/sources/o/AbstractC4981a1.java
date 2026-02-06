package o;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4981a1<K, V> extends I1<K, V> {

    /* renamed from: o.a1$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC6935i1<Map.Entry<K, V>> {
        public final AbstractC4981a1<K, V> Y;

        public b(Iterator<Map.Entry<K, V>> it, AbstractC4981a1<K, V> abstractC4981a1) {
            super(it);
            this.Y = abstractC4981a1;
        }

        @Override // o.AbstractC6935i1, java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            return new c(b().next(), this.Y);
        }
    }

    /* renamed from: o.a1$c */
    /* loaded from: classes4.dex */
    public class c extends N1<K, V> {
        public final AbstractC4981a1<K, V> Y;

        public c(Map.Entry<K, V> entry, AbstractC4981a1<K, V> abstractC4981a1) {
            super(entry);
            this.Y = abstractC4981a1;
        }

        @Override // o.N1, java.util.Map.Entry
        public V setValue(V v) {
            return a().setValue(this.Y.c(v));
        }
    }

    public AbstractC4981a1() {
    }

    public abstract V c(V v);

    public boolean d() {
        return true;
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        if (d()) {
            return new a(this.X.entrySet(), this);
        }
        return this.X.entrySet();
    }

    public AbstractC4981a1(Map<K, V> map) {
        super(map);
    }

    /* renamed from: o.a1$a */
    /* loaded from: classes4.dex */
    public class a extends Z2<Map.Entry<K, V>> {
        private static final long serialVersionUID = 4354731610923110264L;
        public final AbstractC4981a1<K, V> Y;

        public a(Set<Map.Entry<K, V>> set, AbstractC4981a1<K, V> abstractC4981a1) {
            super(set);
            this.Y = abstractC4981a1;
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(d().iterator(), this.Y);
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] array = d().toArray();
            for (int i = 0; i < array.length; i++) {
                array[i] = new c((Map.Entry) array[i], this.Y);
            }
            return array;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2 = (T[]) d().toArray(tArr.length > 0 ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 0) : tArr);
            for (int i = 0; i < tArr2.length; i++) {
                tArr2[i] = new c((Map.Entry) tArr2[i], this.Y);
            }
            if (tArr2.length > tArr.length) {
                return tArr2;
            }
            System.arraycopy(tArr2, 0, tArr, 0, tArr2.length);
            if (tArr.length > tArr2.length) {
                tArr[tArr2.length] = null;
            }
            return tArr;
        }
    }
}
