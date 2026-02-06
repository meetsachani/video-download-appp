package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.fu2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6411fu2<K extends Comparable<K>, V extends Comparable<V>> implements InterfaceC8390nw1<K, V>, Serializable {
    private static final long serialVersionUID = 721969328361807L;
    public transient i<K, V>[] X;
    public transient int Y;
    public transient Set<K> Y0;
    public transient int Z;
    public transient Set<V> Z0;
    public transient Set<Map.Entry<K, V>> a1;
    public transient C6411fu2<K, V>.d b1;

    /* renamed from: o.fu2$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.fu2$b */
    /* loaded from: classes4.dex */
    public enum b {
        KEY("key"),
        VALUE("value");
        
        public final String X;

        b(String str) {
            this.X = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.X;
        }
    }

    /* renamed from: o.fu2$c */
    /* loaded from: classes4.dex */
    public class c extends C6411fu2<K, V>.k<Map.Entry<K, V>> {
        public c() {
            super(b.KEY);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            i g0 = C6411fu2.this.g0(entry.getKey());
            if (g0 == null || !g0.getValue().equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            i g0 = C6411fu2.this.g0(entry.getKey());
            if (g0 != null && g0.getValue().equals(value)) {
                C6411fu2.this.G(g0);
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.fu2$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC8390nw1<V, K> {
        public Set<V> X;
        public Set<K> Y;
        public Set<Map.Entry<V, K>> Z;

        public d() {
        }

        @Override // o.InterfaceC9369rw1
        /* renamed from: a */
        public V firstKey() {
            if (C6411fu2.this.Y != 0) {
                C6411fu2 c6411fu2 = C6411fu2.this;
                i[] iVarArr = c6411fu2.X;
                b bVar = b.VALUE;
                return (V) c6411fu2.e0(iVarArr[bVar.ordinal()], bVar).getValue();
            }
            throw new NoSuchElementException("Map is empty");
        }

        @Override // java.util.Map, o.UC0
        /* renamed from: b */
        public K get(Object obj) {
            return (K) C6411fu2.this.b0(obj);
        }

        @Override // o.InterfaceC4927Zm
        /* renamed from: c */
        public V b0(Object obj) {
            return (V) C6411fu2.this.get(obj);
        }

        @Override // java.util.Map, o.OK1
        public void clear() {
            C6411fu2.this.clear();
        }

        @Override // java.util.Map, o.UC0
        public boolean containsKey(Object obj) {
            return C6411fu2.this.containsValue(obj);
        }

        @Override // java.util.Map, o.UC0
        public boolean containsValue(Object obj) {
            return C6411fu2.this.containsKey(obj);
        }

        @Override // o.InterfaceC9369rw1
        /* renamed from: d */
        public V lastKey() {
            if (C6411fu2.this.Y != 0) {
                C6411fu2 c6411fu2 = C6411fu2.this;
                i[] iVarArr = c6411fu2.X;
                b bVar = b.VALUE;
                return (V) c6411fu2.X(iVarArr[bVar.ordinal()], bVar).getValue();
            }
            throw new NoSuchElementException("Map is empty");
        }

        @Override // o.InterfaceC9369rw1
        /* renamed from: e */
        public V n0(V v) {
            C6411fu2.x(v);
            C6411fu2 c6411fu2 = C6411fu2.this;
            b bVar = b.VALUE;
            i q0 = c6411fu2.q0(c6411fu2.f0(v, bVar), bVar);
            if (q0 == null) {
                return null;
            }
            return (V) q0.getValue();
        }

        @Override // java.util.Map, o.UC0
        public Set<Map.Entry<V, K>> entrySet() {
            if (this.Z == null) {
                this.Z = new e();
            }
            return this.Z;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return C6411fu2.this.D(obj, b.VALUE);
        }

        @Override // o.InterfaceC9369rw1
        /* renamed from: f */
        public V j0(V v) {
            C6411fu2.x(v);
            C6411fu2 c6411fu2 = C6411fu2.this;
            b bVar = b.VALUE;
            i s0 = c6411fu2.s0(c6411fu2.f0(v, bVar), bVar);
            if (s0 == null) {
                return null;
            }
            return (V) s0.getValue();
        }

        @Override // o.InterfaceC4927Zm, java.util.Map, o.OK1
        /* renamed from: g */
        public K put(V v, K k) {
            K k2 = (K) get(v);
            C6411fu2.this.F(k, v);
            return k2;
        }

        @Override // java.util.Map
        public int hashCode() {
            return C6411fu2.this.E(b.VALUE);
        }

        @Override // java.util.Map, o.UC0
        /* renamed from: i */
        public K remove(Object obj) {
            return (K) C6411fu2.this.l0(obj);
        }

        @Override // java.util.Map, o.UC0
        public boolean isEmpty() {
            return C6411fu2.this.isEmpty();
        }

        @Override // o.InterfaceC4927Zm
        /* renamed from: j */
        public V l0(Object obj) {
            return (V) C6411fu2.this.remove(obj);
        }

        @Override // java.util.Map, o.UC0
        public Set<V> keySet() {
            if (this.X == null) {
                this.X = new j(b.VALUE);
            }
            return this.X;
        }

        @Override // java.util.Map, o.OK1
        public void putAll(Map<? extends V, ? extends K> map) {
            for (Map.Entry<? extends V, ? extends K> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // java.util.Map, o.UC0
        public int size() {
            return C6411fu2.this.size();
        }

        public String toString() {
            return C6411fu2.this.L(b.VALUE);
        }

        @Override // o.InterfaceC8390nw1, o.InterfaceC4927Zm
        public InterfaceC8390nw1<K, V> h() {
            return C6411fu2.this;
        }

        @Override // o.VT0
        public InterfaceC9855tw1<V, K> p() {
            if (isEmpty()) {
                return C6831hb0.b();
            }
            return new g(b.VALUE);
        }

        @Override // o.InterfaceC4927Zm, java.util.Map, o.UC0
        public Set<K> values() {
            if (this.Y == null) {
                this.Y = new h(b.VALUE);
            }
            return this.Y;
        }
    }

    /* renamed from: o.fu2$e */
    /* loaded from: classes4.dex */
    public class e extends C6411fu2<K, V>.k<Map.Entry<V, K>> {
        public e() {
            super(b.VALUE);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            i h0 = C6411fu2.this.h0(entry.getKey());
            if (h0 == null || !h0.getKey().equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<V, K>> iterator() {
            return new f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            i h0 = C6411fu2.this.h0(entry.getKey());
            if (h0 != null && h0.getKey().equals(value)) {
                C6411fu2.this.G(h0);
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.fu2$f */
    /* loaded from: classes4.dex */
    public class f extends C6411fu2<K, V>.l implements InterfaceC8877pw1<Map.Entry<V, K>> {
        public f() {
            super(b.VALUE);
        }

        public final Map.Entry<V, K> d(i<K, V> iVar) {
            return new C8452oB2(iVar.getValue(), iVar.getKey());
        }

        @Override // java.util.Iterator
        /* renamed from: e */
        public Map.Entry<V, K> next() {
            return d(b());
        }

        @Override // o.InterfaceC8877pw1
        /* renamed from: f */
        public Map.Entry<V, K> previous() {
            return d(c());
        }
    }

    /* renamed from: o.fu2$g */
    /* loaded from: classes4.dex */
    public class g extends C6411fu2<K, V>.l implements InterfaceC9855tw1<V, K> {
        public g(b bVar) {
            super(bVar);
        }

        @Override // o.U71
        /* renamed from: d */
        public V getKey() {
            i<K, V> iVar = this.Y;
            if (iVar != null) {
                return iVar.getValue();
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // o.U71
        /* renamed from: e */
        public K getValue() {
            i<K, V> iVar = this.Y;
            if (iVar != null) {
                return iVar.getKey();
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // o.U71, java.util.Iterator
        /* renamed from: f */
        public V next() {
            return b().getValue();
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        /* renamed from: g */
        public V previous() {
            return c().getValue();
        }

        @Override // o.U71
        /* renamed from: h */
        public K setValue(K k) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.fu2$h */
    /* loaded from: classes4.dex */
    public class h extends C6411fu2<K, V>.k<K> {
        public h(b bVar) {
            super(bVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            C6411fu2.z(obj, b.KEY);
            if (C6411fu2.this.g0(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new n(this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (C6411fu2.this.J(obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.fu2$i */
    /* loaded from: classes4.dex */
    public static class i<K extends Comparable<K>, V extends Comparable<V>> implements Map.Entry<K, V>, JX0<K, V> {
        public final K X;
        public final V Y;
        public int b1;
        public final i<K, V>[] Z = new i[2];
        public final i<K, V>[] Y0 = new i[2];
        public final i<K, V>[] Z0 = new i[2];
        public final boolean[] a1 = {true, true};
        public boolean c1 = false;

        public i(K k, V v) {
            this.X = k;
            this.Y = v;
        }

        public final void A(b bVar) {
            this.a1[bVar.ordinal()] = true;
        }

        public final void B(i<K, V> iVar, b bVar) {
            this.Z[bVar.ordinal()] = iVar;
        }

        public final void C(i<K, V> iVar, b bVar) {
            this.Z0[bVar.ordinal()] = iVar;
        }

        public final void D(b bVar) {
            this.a1[bVar.ordinal()] = false;
        }

        public final void E(i<K, V> iVar, b bVar) {
            this.Y0[bVar.ordinal()] = iVar;
        }

        @Override // java.util.Map.Entry
        /* renamed from: F */
        public V setValue(V v) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Map.Entry.setValue is not supported");
        }

        public final void G(i<K, V> iVar, b bVar) {
            boolean[] zArr = this.a1;
            int ordinal = bVar.ordinal();
            zArr[ordinal] = zArr[ordinal] ^ iVar.a1[bVar.ordinal()];
            boolean[] zArr2 = iVar.a1;
            int ordinal2 = bVar.ordinal();
            zArr2[ordinal2] = zArr2[ordinal2] ^ this.a1[bVar.ordinal()];
            boolean[] zArr3 = this.a1;
            int ordinal3 = bVar.ordinal();
            zArr3[ordinal3] = iVar.a1[bVar.ordinal()] ^ zArr3[ordinal3];
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey().equals(entry.getKey()) && getValue().equals(entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.c1) {
                this.b1 = getKey().hashCode() ^ getValue().hashCode();
                this.c1 = true;
            }
            return this.b1;
        }

        public final void p(i<K, V> iVar, b bVar) {
            this.a1[bVar.ordinal()] = iVar.a1[bVar.ordinal()];
        }

        public final Object q(b bVar) {
            int i = a.a[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return getValue();
                }
                throw new IllegalArgumentException();
            }
            return getKey();
        }

        @Override // java.util.Map.Entry, o.JX0
        /* renamed from: r */
        public K getKey() {
            return this.X;
        }

        public final i<K, V> s(b bVar) {
            return this.Z[bVar.ordinal()];
        }

        public final i<K, V> t(b bVar) {
            return this.Z0[bVar.ordinal()];
        }

        public final i<K, V> u(b bVar) {
            return this.Y0[bVar.ordinal()];
        }

        @Override // java.util.Map.Entry, o.JX0
        /* renamed from: v */
        public V getValue() {
            return this.Y;
        }

        public final boolean w(b bVar) {
            return this.a1[bVar.ordinal()];
        }

        public final boolean x(b bVar) {
            if (this.Z0[bVar.ordinal()] != null && this.Z0[bVar.ordinal()].Z[bVar.ordinal()] == this) {
                return true;
            }
            return false;
        }

        public final boolean y(b bVar) {
            return !this.a1[bVar.ordinal()];
        }

        public final boolean z(b bVar) {
            if (this.Z0[bVar.ordinal()] != null && this.Z0[bVar.ordinal()].Y0[bVar.ordinal()] == this) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.fu2$j */
    /* loaded from: classes4.dex */
    public class j extends C6411fu2<K, V>.k<V> {
        public j(b bVar) {
            super(bVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            C6411fu2.z(obj, b.VALUE);
            if (C6411fu2.this.h0(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new g(this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (C6411fu2.this.K(obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.fu2$k */
    /* loaded from: classes4.dex */
    public abstract class k<E> extends AbstractSet<E> {
        public final b X;

        public k(b bVar) {
            this.X = bVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6411fu2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6411fu2.this.size();
        }
    }

    /* renamed from: o.fu2$l */
    /* loaded from: classes4.dex */
    public abstract class l {
        public final b X;
        public i<K, V> Y = null;
        public i<K, V> Y0 = null;
        public i<K, V> Z;
        public int Z0;

        public l(b bVar) {
            this.X = bVar;
            this.Z0 = C6411fu2.this.Z;
            this.Z = C6411fu2.this.e0(C6411fu2.this.X[bVar.ordinal()], bVar);
        }

        public i<K, V> b() {
            if (this.Z != null) {
                if (C6411fu2.this.Z == this.Z0) {
                    i<K, V> iVar = this.Z;
                    this.Y = iVar;
                    this.Y0 = iVar;
                    this.Z = C6411fu2.this.q0(iVar, this.X);
                    return this.Y;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        public i<K, V> c() {
            if (this.Y0 != null) {
                if (C6411fu2.this.Z == this.Z0) {
                    i<K, V> iVar = this.Y;
                    this.Z = iVar;
                    if (iVar == null) {
                        this.Z = C6411fu2.this.q0(this.Y0, this.X);
                    }
                    i<K, V> iVar2 = this.Y0;
                    this.Y = iVar2;
                    this.Y0 = C6411fu2.this.s0(iVar2, this.X);
                    return this.Y;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (this.Z != null) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.Y0 != null) {
                return true;
            }
            return false;
        }

        public final void remove() {
            if (this.Y != null) {
                if (C6411fu2.this.Z == this.Z0) {
                    C6411fu2.this.G(this.Y);
                    this.Z0++;
                    this.Y = null;
                    i<K, V> iVar = this.Z;
                    if (iVar == null) {
                        C6411fu2 c6411fu2 = C6411fu2.this;
                        this.Y0 = c6411fu2.X(c6411fu2.X[this.X.ordinal()], this.X);
                        return;
                    }
                    this.Y0 = C6411fu2.this.s0(iVar, this.X);
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.fu2$m */
    /* loaded from: classes4.dex */
    public class m extends C6411fu2<K, V>.l implements InterfaceC8877pw1<Map.Entry<K, V>> {
        public m() {
            super(b.KEY);
        }

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            return b();
        }

        @Override // o.InterfaceC8877pw1
        /* renamed from: e */
        public Map.Entry<K, V> previous() {
            return c();
        }
    }

    /* renamed from: o.fu2$n */
    /* loaded from: classes4.dex */
    public class n extends C6411fu2<K, V>.l implements InterfaceC9855tw1<K, V> {
        public n(b bVar) {
            super(bVar);
        }

        @Override // o.U71
        /* renamed from: d */
        public K getKey() {
            i<K, V> iVar = this.Y;
            if (iVar != null) {
                return iVar.getKey();
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // o.U71
        /* renamed from: e */
        public V getValue() {
            i<K, V> iVar = this.Y;
            if (iVar != null) {
                return iVar.getValue();
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // o.U71, java.util.Iterator
        /* renamed from: f */
        public K next() {
            return b().getKey();
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        /* renamed from: g */
        public K previous() {
            return c().getKey();
        }

        @Override // o.U71
        /* renamed from: h */
        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }
    }

    public C6411fu2() {
        this.Y = 0;
        this.Z = 0;
        this.b1 = null;
        this.X = new i[2];
    }

    public static void A(Object obj) {
        z(obj, b.VALUE);
    }

    public static <T extends Comparable<T>> int B(T t, T t2) {
        return t.compareTo(t2);
    }

    public static boolean a0(i<?, ?> iVar, b bVar) {
        if (iVar != null && !iVar.w(bVar)) {
            return false;
        }
        return true;
    }

    public static boolean c0(i<?, ?> iVar, b bVar) {
        if (iVar != null && iVar.y(bVar)) {
            return true;
        }
        return false;
    }

    public static void i0(i<?, ?> iVar, b bVar) {
        if (iVar != null) {
            iVar.A(bVar);
        }
    }

    public static void m0(i<?, ?> iVar, b bVar) {
        if (iVar != null) {
            iVar.D(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = new i[2];
        int readInt = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            put((Comparable) objectInputStream.readObject(), (Comparable) objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static void x(Object obj) {
        z(obj, b.KEY);
    }

    public static void y(Object obj, Object obj2) {
        x(obj);
        A(obj2);
    }

    public static void z(Object obj, b bVar) {
        if (obj != null) {
            if (obj instanceof Comparable) {
                return;
            }
            throw new ClassCastException(bVar + " must be Comparable");
        }
        throw new NullPointerException(bVar + " cannot be null");
    }

    public final void A0(i<K, V> iVar, i<K, V> iVar2, b bVar) {
        boolean z;
        i<K, V> t = iVar.t(bVar);
        i s = iVar.s(bVar);
        i u = iVar.u(bVar);
        i<K, V> t2 = iVar2.t(bVar);
        i s2 = iVar2.s(bVar);
        i u2 = iVar2.u(bVar);
        boolean z2 = false;
        if (iVar.t(bVar) != null && iVar == iVar.t(bVar).s(bVar)) {
            z = true;
        } else {
            z = false;
        }
        if (iVar2.t(bVar) != null && iVar2 == iVar2.t(bVar).s(bVar)) {
            z2 = true;
        }
        if (iVar == t2) {
            iVar.C(iVar2, bVar);
            if (z2) {
                iVar2.B(iVar, bVar);
                iVar2.E(u, bVar);
            } else {
                iVar2.E(iVar, bVar);
                iVar2.B(s, bVar);
            }
        } else {
            iVar.C(t2, bVar);
            if (t2 != null) {
                if (z2) {
                    t2.B(iVar, bVar);
                } else {
                    t2.E(iVar, bVar);
                }
            }
            iVar2.B(s, bVar);
            iVar2.E(u, bVar);
        }
        if (iVar2 == t) {
            iVar2.C(iVar, bVar);
            if (z) {
                iVar.B(iVar2, bVar);
                iVar.E(u2, bVar);
            } else {
                iVar.E(iVar2, bVar);
                iVar.B(s2, bVar);
            }
        } else {
            iVar2.C(t, bVar);
            if (t != null) {
                if (z) {
                    t.B(iVar2, bVar);
                } else {
                    t.E(iVar2, bVar);
                }
            }
            iVar.B(s2, bVar);
            iVar.E(u2, bVar);
        }
        if (iVar.s(bVar) != null) {
            iVar.s(bVar).C(iVar, bVar);
        }
        if (iVar.u(bVar) != null) {
            iVar.u(bVar).C(iVar, bVar);
        }
        if (iVar2.s(bVar) != null) {
            iVar2.s(bVar).C(iVar2, bVar);
        }
        if (iVar2.u(bVar) != null) {
            iVar2.u(bVar).C(iVar2, bVar);
        }
        iVar.G(iVar2, bVar);
        if (this.X[bVar.ordinal()] == iVar) {
            this.X[bVar.ordinal()] = iVar2;
        } else if (this.X[bVar.ordinal()] == iVar2) {
            this.X[bVar.ordinal()] = iVar;
        }
    }

    public final void C(i<K, V> iVar, i<K, V> iVar2, b bVar) {
        if (iVar2 != null) {
            if (iVar == null) {
                iVar2.A(bVar);
            } else {
                iVar2.p(iVar, bVar);
            }
        }
    }

    public final boolean D(Object obj, b bVar) {
        U71<?, ?> S;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        if (this.Y > 0) {
            try {
                S = S(bVar);
            } catch (ClassCastException | NullPointerException unused) {
            }
            while (S.hasNext()) {
                if (!S.getValue().equals(map.get(S.next()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int E(b bVar) {
        int i2 = 0;
        if (this.Y > 0) {
            U71<?, ?> S = S(bVar);
            while (S.hasNext()) {
                i2 += S.next().hashCode() ^ S.getValue().hashCode();
            }
        }
        return i2;
    }

    public final void F(K k2, V v) {
        y(k2, v);
        J(k2);
        K(v);
        i<K, V>[] iVarArr = this.X;
        b bVar = b.KEY;
        i<K, V> iVar = iVarArr[bVar.ordinal()];
        if (iVar == null) {
            i<K, V> iVar2 = new i<>(k2, v);
            this.X[bVar.ordinal()] = iVar2;
            this.X[b.VALUE.ordinal()] = iVar2;
            Y();
            return;
        }
        while (true) {
            int B = B(k2, iVar.getKey());
            if (B != 0) {
                if (B < 0) {
                    b bVar2 = b.KEY;
                    if (iVar.s(bVar2) != null) {
                        iVar = iVar.s(bVar2);
                    } else {
                        i<K, V> iVar3 = new i<>(k2, v);
                        Z(iVar3);
                        iVar.B(iVar3, bVar2);
                        iVar3.C(iVar, bVar2);
                        I(iVar3, bVar2);
                        Y();
                        return;
                    }
                } else {
                    b bVar3 = b.KEY;
                    if (iVar.u(bVar3) != null) {
                        iVar = iVar.u(bVar3);
                    } else {
                        i<K, V> iVar4 = new i<>(k2, v);
                        Z(iVar4);
                        iVar.E(iVar4, bVar3);
                        iVar4.C(iVar, bVar3);
                        I(iVar4, bVar3);
                        Y();
                        return;
                    }
                }
            } else {
                throw new IllegalArgumentException("Cannot store a duplicate key (\"" + k2 + "\") in this Map");
            }
        }
    }

    public final void G(i<K, V> iVar) {
        b[] values;
        for (b bVar : b.values()) {
            if (iVar.s(bVar) != null && iVar.u(bVar) != null) {
                A0(q0(iVar, bVar), iVar, bVar);
            }
            i<K, V> s = iVar.s(bVar) != null ? iVar.s(bVar) : iVar.u(bVar);
            if (s != null) {
                s.C(iVar.t(bVar), bVar);
                if (iVar.t(bVar) == null) {
                    this.X[bVar.ordinal()] = s;
                } else if (iVar == iVar.t(bVar).s(bVar)) {
                    iVar.t(bVar).B(s, bVar);
                } else {
                    iVar.t(bVar).E(s, bVar);
                }
                iVar.B(null, bVar);
                iVar.E(null, bVar);
                iVar.C(null, bVar);
                if (a0(iVar, bVar)) {
                    H(s, bVar);
                }
            } else if (iVar.t(bVar) == null) {
                this.X[bVar.ordinal()] = null;
            } else {
                if (a0(iVar, bVar)) {
                    H(iVar, bVar);
                }
                if (iVar.t(bVar) != null) {
                    if (iVar == iVar.t(bVar).s(bVar)) {
                        iVar.t(bVar).B(null, bVar);
                    } else {
                        iVar.t(bVar).E(null, bVar);
                    }
                    iVar.C(null, bVar);
                }
            }
        }
        z0();
    }

    public final void H(i<K, V> iVar, b bVar) {
        while (iVar != this.X[bVar.ordinal()] && a0(iVar, bVar)) {
            if (iVar.x(bVar)) {
                i<K, V> W = W(T(iVar, bVar), bVar);
                if (c0(W, bVar)) {
                    i0(W, bVar);
                    m0(T(iVar, bVar), bVar);
                    x0(T(iVar, bVar), bVar);
                    W = W(T(iVar, bVar), bVar);
                }
                if (a0(R(W, bVar), bVar) && a0(W(W, bVar), bVar)) {
                    m0(W, bVar);
                    iVar = T(iVar, bVar);
                } else {
                    if (a0(W(W, bVar), bVar)) {
                        i0(R(W, bVar), bVar);
                        m0(W, bVar);
                        y0(W, bVar);
                        W = W(T(iVar, bVar), bVar);
                    }
                    C(T(iVar, bVar), W, bVar);
                    i0(T(iVar, bVar), bVar);
                    i0(W(W, bVar), bVar);
                    x0(T(iVar, bVar), bVar);
                    iVar = this.X[bVar.ordinal()];
                }
            } else {
                i<K, V> R = R(T(iVar, bVar), bVar);
                if (c0(R, bVar)) {
                    i0(R, bVar);
                    m0(T(iVar, bVar), bVar);
                    y0(T(iVar, bVar), bVar);
                    R = R(T(iVar, bVar), bVar);
                }
                if (a0(W(R, bVar), bVar) && a0(R(R, bVar), bVar)) {
                    m0(R, bVar);
                    iVar = T(iVar, bVar);
                } else {
                    if (a0(R(R, bVar), bVar)) {
                        i0(W(R, bVar), bVar);
                        m0(R, bVar);
                        x0(R, bVar);
                        R = R(T(iVar, bVar), bVar);
                    }
                    C(T(iVar, bVar), R, bVar);
                    i0(T(iVar, bVar), bVar);
                    i0(R(R, bVar), bVar);
                    y0(T(iVar, bVar), bVar);
                    iVar = this.X[bVar.ordinal()];
                }
            }
        }
        i0(iVar, bVar);
    }

    public final void I(i<K, V> iVar, b bVar) {
        m0(iVar, bVar);
        while (iVar != null && iVar != this.X[bVar.ordinal()] && c0(iVar.t(bVar), bVar)) {
            if (iVar.x(bVar)) {
                i<K, V> W = W(P(iVar, bVar), bVar);
                if (c0(W, bVar)) {
                    i0(T(iVar, bVar), bVar);
                    i0(W, bVar);
                    m0(P(iVar, bVar), bVar);
                    iVar = P(iVar, bVar);
                } else {
                    if (iVar.z(bVar)) {
                        iVar = T(iVar, bVar);
                        x0(iVar, bVar);
                    }
                    i0(T(iVar, bVar), bVar);
                    m0(P(iVar, bVar), bVar);
                    if (P(iVar, bVar) != null) {
                        y0(P(iVar, bVar), bVar);
                    }
                }
            } else {
                i<K, V> R = R(P(iVar, bVar), bVar);
                if (c0(R, bVar)) {
                    i0(T(iVar, bVar), bVar);
                    i0(R, bVar);
                    m0(P(iVar, bVar), bVar);
                    iVar = P(iVar, bVar);
                } else {
                    if (iVar.x(bVar)) {
                        iVar = T(iVar, bVar);
                        y0(iVar, bVar);
                    }
                    i0(T(iVar, bVar), bVar);
                    m0(P(iVar, bVar), bVar);
                    if (P(iVar, bVar) != null) {
                        x0(P(iVar, bVar), bVar);
                    }
                }
            }
        }
        i0(this.X[bVar.ordinal()], bVar);
    }

    public final V J(Object obj) {
        i<K, V> g0 = g0(obj);
        if (g0 == null) {
            return null;
        }
        G(g0);
        return g0.getValue();
    }

    public final K K(Object obj) {
        i<K, V> h0 = h0(obj);
        if (h0 == null) {
            return null;
        }
        G(h0);
        return h0.getKey();
    }

    public final String L(b bVar) {
        int i2 = this.Y;
        if (i2 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 32);
        sb.append('{');
        U71<?, ?> S = S(bVar);
        boolean hasNext = S.hasNext();
        while (hasNext) {
            Object next = S.next();
            Object value = S.getValue();
            if (next == this) {
                next = "(this Map)";
            }
            sb.append(next);
            sb.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb.append(value);
            hasNext = S.hasNext();
            if (hasNext) {
                sb.append(C6566gU0.h);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // o.InterfaceC9369rw1
    /* renamed from: N */
    public K firstKey() {
        if (this.Y != 0) {
            i<K, V>[] iVarArr = this.X;
            b bVar = b.KEY;
            return e0(iVarArr[bVar.ordinal()], bVar).getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    @Override // java.util.Map, o.UC0
    /* renamed from: O */
    public V get(Object obj) {
        x(obj);
        i<K, V> g0 = g0(obj);
        if (g0 == null) {
            return null;
        }
        return g0.getValue();
    }

    public final i<K, V> P(i<K, V> iVar, b bVar) {
        return T(T(iVar, bVar), bVar);
    }

    @Override // o.InterfaceC4927Zm
    /* renamed from: Q */
    public K b0(Object obj) {
        A(obj);
        i<K, V> h0 = h0(obj);
        if (h0 == null) {
            return null;
        }
        return h0.getKey();
    }

    public final i<K, V> R(i<K, V> iVar, b bVar) {
        if (iVar != null) {
            return iVar.s(bVar);
        }
        return null;
    }

    public final U71<?, ?> S(b bVar) {
        int i2 = a.a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return new g(b.VALUE);
            }
            throw new IllegalArgumentException();
        }
        return new n(b.KEY);
    }

    public final i<K, V> T(i<K, V> iVar, b bVar) {
        if (iVar != null) {
            return iVar.t(bVar);
        }
        return null;
    }

    public final i<K, V> W(i<K, V> iVar, b bVar) {
        if (iVar != null) {
            return iVar.u(bVar);
        }
        return null;
    }

    public final i<K, V> X(i<K, V> iVar, b bVar) {
        if (iVar != null) {
            while (iVar.u(bVar) != null) {
                iVar = iVar.u(bVar);
            }
        }
        return iVar;
    }

    public final void Y() {
        o0();
        this.Y++;
    }

    public final void Z(i<K, V> iVar) throws IllegalArgumentException {
        i<K, V> iVar2 = this.X[b.VALUE.ordinal()];
        while (true) {
            int B = B(iVar.getValue(), iVar2.getValue());
            if (B != 0) {
                if (B < 0) {
                    b bVar = b.VALUE;
                    if (iVar2.s(bVar) != null) {
                        iVar2 = iVar2.s(bVar);
                    } else {
                        iVar2.B(iVar, bVar);
                        iVar.C(iVar2, bVar);
                        I(iVar, bVar);
                        return;
                    }
                } else {
                    b bVar2 = b.VALUE;
                    if (iVar2.u(bVar2) != null) {
                        iVar2 = iVar2.u(bVar2);
                    } else {
                        iVar2.E(iVar, bVar2);
                        iVar.C(iVar2, bVar2);
                        I(iVar, bVar2);
                        return;
                    }
                }
            } else {
                throw new IllegalArgumentException("Cannot store a duplicate value (\"" + iVar.q(b.VALUE) + "\") in this Map");
            }
        }
    }

    @Override // java.util.Map, o.OK1
    public void clear() {
        o0();
        this.Y = 0;
        this.X[b.KEY.ordinal()] = null;
        this.X[b.VALUE.ordinal()] = null;
    }

    @Override // java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        x(obj);
        if (g0(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        A(obj);
        if (h0(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9369rw1
    /* renamed from: d0 */
    public K lastKey() {
        if (this.Y != 0) {
            i<K, V>[] iVarArr = this.X;
            b bVar = b.KEY;
            return X(iVarArr[bVar.ordinal()], bVar).getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    public final i<K, V> e0(i<K, V> iVar, b bVar) {
        if (iVar != null) {
            while (iVar.s(bVar) != null) {
                iVar = iVar.s(bVar);
            }
        }
        return iVar;
    }

    @Override // java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.a1 == null) {
            this.a1 = new c();
        }
        return this.a1;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return D(obj, b.KEY);
    }

    public final <T extends Comparable<T>> i<K, V> f0(Object obj, b bVar) {
        i<K, V> iVar = this.X[bVar.ordinal()];
        while (iVar != null) {
            int B = B((Comparable) obj, (Comparable) iVar.q(bVar));
            if (B == 0) {
                return iVar;
            }
            iVar = B < 0 ? iVar.s(bVar) : iVar.u(bVar);
        }
        return null;
    }

    public final i<K, V> g0(Object obj) {
        return f0(obj, b.KEY);
    }

    public final i<K, V> h0(Object obj) {
        return f0(obj, b.VALUE);
    }

    @Override // java.util.Map
    public int hashCode() {
        return E(b.KEY);
    }

    @Override // java.util.Map, o.UC0
    public boolean isEmpty() {
        if (this.Y == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, o.UC0
    public Set<K> keySet() {
        if (this.Y0 == null) {
            this.Y0 = new h(b.KEY);
        }
        return this.Y0;
    }

    public final void o0() {
        this.Z++;
    }

    @Override // java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final i<K, V> q0(i<K, V> iVar, b bVar) {
        if (iVar == null) {
            return null;
        }
        if (iVar.u(bVar) == null) {
            i<K, V> t = iVar.t(bVar);
            while (true) {
                i<K, V> iVar2 = t;
                i<K, V> iVar3 = iVar;
                iVar = iVar2;
                if (iVar == null || iVar3 != iVar.u(bVar)) {
                    break;
                }
                t = iVar.t(bVar);
            }
            return iVar;
        }
        return e0(iVar.u(bVar), bVar);
    }

    @Override // o.InterfaceC9369rw1
    /* renamed from: r0 */
    public K n0(K k2) {
        x(k2);
        i<K, V> q0 = q0(g0(k2), b.KEY);
        if (q0 == null) {
            return null;
        }
        return q0.getKey();
    }

    public final i<K, V> s0(i<K, V> iVar, b bVar) {
        if (iVar == null) {
            return null;
        }
        if (iVar.s(bVar) == null) {
            i<K, V> t = iVar.t(bVar);
            while (true) {
                i<K, V> iVar2 = t;
                i<K, V> iVar3 = iVar;
                iVar = iVar2;
                if (iVar == null || iVar3 != iVar.s(bVar)) {
                    break;
                }
                t = iVar.t(bVar);
            }
            return iVar;
        }
        return X(iVar.s(bVar), bVar);
    }

    @Override // java.util.Map, o.UC0
    public int size() {
        return this.Y;
    }

    @Override // o.InterfaceC9369rw1
    /* renamed from: t0 */
    public K j0(K k2) {
        x(k2);
        i<K, V> s0 = s0(g0(k2), b.KEY);
        if (s0 == null) {
            return null;
        }
        return s0.getKey();
    }

    public String toString() {
        return L(b.KEY);
    }

    @Override // o.InterfaceC4927Zm, java.util.Map, o.OK1
    /* renamed from: u0 */
    public V put(K k2, V v) {
        V v2 = get(k2);
        F(k2, v);
        return v2;
    }

    @Override // java.util.Map, o.UC0
    /* renamed from: v0 */
    public V remove(Object obj) {
        return J(obj);
    }

    @Override // o.InterfaceC4927Zm
    /* renamed from: w0 */
    public K l0(Object obj) {
        return K(obj);
    }

    public final void x0(i<K, V> iVar, b bVar) {
        i<K, V> u = iVar.u(bVar);
        iVar.E(u.s(bVar), bVar);
        if (u.s(bVar) != null) {
            u.s(bVar).C(iVar, bVar);
        }
        u.C(iVar.t(bVar), bVar);
        if (iVar.t(bVar) == null) {
            this.X[bVar.ordinal()] = u;
        } else if (iVar.t(bVar).s(bVar) == iVar) {
            iVar.t(bVar).B(u, bVar);
        } else {
            iVar.t(bVar).E(u, bVar);
        }
        u.B(iVar, bVar);
        iVar.C(u, bVar);
    }

    public final void y0(i<K, V> iVar, b bVar) {
        i<K, V> s = iVar.s(bVar);
        iVar.B(s.u(bVar), bVar);
        if (s.u(bVar) != null) {
            s.u(bVar).C(iVar, bVar);
        }
        s.C(iVar.t(bVar), bVar);
        if (iVar.t(bVar) == null) {
            this.X[bVar.ordinal()] = s;
        } else if (iVar.t(bVar).u(bVar) == iVar) {
            iVar.t(bVar).E(s, bVar);
        } else {
            iVar.t(bVar).B(s, bVar);
        }
        s.E(iVar, bVar);
        iVar.C(s, bVar);
    }

    public final void z0() {
        o0();
        this.Y--;
    }

    @Override // o.InterfaceC8390nw1, o.InterfaceC4927Zm
    public InterfaceC8390nw1<V, K> h() {
        if (this.b1 == null) {
            this.b1 = new d();
        }
        return this.b1;
    }

    @Override // o.VT0
    public InterfaceC9855tw1<K, V> p() {
        if (isEmpty()) {
            return C6831hb0.b();
        }
        return new n(b.KEY);
    }

    @Override // o.InterfaceC4927Zm, java.util.Map, o.UC0
    public Set<V> values() {
        if (this.Z0 == null) {
            this.Z0 = new j(b.KEY);
        }
        return this.Z0;
    }

    public C6411fu2(Map<? extends K, ? extends V> map) {
        this();
        putAll(map);
    }
}
