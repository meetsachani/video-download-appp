package o;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: o.tS0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9740tS0 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b = Charset.forName("ISO-8859-1");
    public static final int c = 4096;
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final KE f;

    /* renamed from: o.tS0$a */
    /* loaded from: classes.dex */
    public interface a extends k<Boolean> {
        void C1(boolean z);

        boolean Z(int i, boolean z);

        boolean getBoolean(int i);

        @Override // o.C9740tS0.k, o.C9740tS0.i
        k<Boolean> o(int i);
    }

    /* renamed from: o.tS0$b */
    /* loaded from: classes.dex */
    public interface b extends k<Double> {
        double getDouble(int i);

        double i0(int i, double d);

        @Override // o.C9740tS0.k, o.C9740tS0.i
        k<Double> o(int i);

        void v4(double d);
    }

    /* renamed from: o.tS0$c */
    /* loaded from: classes.dex */
    public interface c {
        int k();
    }

    /* renamed from: o.tS0$d */
    /* loaded from: classes.dex */
    public interface d<T extends c> {
        T a(int i);
    }

    /* renamed from: o.tS0$e */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(int i);
    }

    /* renamed from: o.tS0$f */
    /* loaded from: classes.dex */
    public interface f extends k<Float> {
        void D0(float f);

        float T(int i, float f);

        float getFloat(int i);

        @Override // o.C9740tS0.k, o.C9740tS0.i
        k<Float> o(int i);
    }

    /* renamed from: o.tS0$g */
    /* loaded from: classes.dex */
    public interface g extends k<Integer> {
        void H3(int i);

        int O(int i, int i2);

        int getInt(int i);

        @Override // o.C9740tS0.k, o.C9740tS0.i
        k<Integer> o(int i);
    }

    /* renamed from: o.tS0$h */
    /* loaded from: classes.dex */
    public static class h<F, T> extends AbstractList<T> {
        public final List<F> X;
        public final a<F, T> Y;

        /* renamed from: o.tS0$h$a */
        /* loaded from: classes.dex */
        public interface a<F, T> {
            T a(F f);
        }

        public h(List<F> list, a<F, T> aVar) {
            this.X = list;
            this.Y = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.Y.a(this.X.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.tS0$i */
    /* loaded from: classes.dex */
    public interface i extends k<Long> {
        long getLong(int i);

        void i4(long j);

        @Override // 
        k<Long> o(int i);

        long q0(int i, long j);
    }

    /* renamed from: o.tS0$j */
    /* loaded from: classes.dex */
    public static class j<K, V, RealValue> extends AbstractMap<K, V> {
        public final Map<K, RealValue> X;
        public final b<RealValue, V> Y;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: o.tS0$j$a */
        /* loaded from: classes.dex */
        public static class a<T> implements b<Integer, T> {
            public final /* synthetic */ d a;
            public final /* synthetic */ c b;

            public a(d dVar, c cVar) {
                this.a = dVar;
                this.b = cVar;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // o.C9740tS0.j.b
            /* renamed from: c */
            public Integer b(c cVar) {
                return Integer.valueOf(cVar.k());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // o.C9740tS0.j.b
            /* renamed from: d */
            public c a(Integer num) {
                c a = this.a.a(num.intValue());
                if (a == null) {
                    return this.b;
                }
                return a;
            }
        }

        /* renamed from: o.tS0$j$b */
        /* loaded from: classes.dex */
        public interface b<A, B> {
            B a(A a);

            A b(B b);
        }

        /* renamed from: o.tS0$j$c */
        /* loaded from: classes.dex */
        public class c implements Map.Entry<K, V> {
            public final Map.Entry<K, RealValue> X;

            public c(Map.Entry<K, RealValue> entry) {
                this.X = entry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if ((obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue())) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.X.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) j.this.Y.a(this.X.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.X.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v) {
                Object value = this.X.setValue(j.this.Y.b(v));
                if (value == null) {
                    return null;
                }
                return (V) j.this.Y.a(value);
            }
        }

        /* renamed from: o.tS0$j$d */
        /* loaded from: classes.dex */
        public class d implements Iterator<Map.Entry<K, V>> {
            public final Iterator<Map.Entry<K, RealValue>> X;

            public d(Iterator<Map.Entry<K, RealValue>> it) {
                this.X = it;
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return new c(this.X.next());
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

        /* renamed from: o.tS0$j$e */
        /* loaded from: classes.dex */
        public class e extends AbstractSet<Map.Entry<K, V>> {
            public final Set<Map.Entry<K, RealValue>> X;

            public e(Set<Map.Entry<K, RealValue>> set) {
                this.X = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.X.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.X.size();
            }
        }

        public j(Map<K, RealValue> map, b<RealValue, V> bVar) {
            this.X = map;
            this.Y = bVar;
        }

        public static <T extends c> b<Integer, T> b(d<T> dVar, T t) {
            return new a(dVar, t);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.X.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            RealValue realvalue = this.X.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.Y.a(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            RealValue put = this.X.put(k, this.Y.b(v));
            if (put == null) {
                return null;
            }
            return this.Y.a(put);
        }
    }

    /* renamed from: o.tS0$k */
    /* loaded from: classes.dex */
    public interface k<E> extends List<E>, RandomAccess {
        void M0();

        boolean X2();

        k<E> o(int i);
    }

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        f = KE.p(bArr);
    }

    public static byte[] a(String str) {
        return str.getBytes(b);
    }

    public static ByteBuffer b(String str) {
        return ByteBuffer.wrap(a(str));
    }

    public static AbstractC8616os c(String str) {
        return AbstractC8616os.F(str.getBytes(b));
    }

    public static <T> T d(T t) {
        t.getClass();
        return t;
    }

    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean g(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
    }

    public static boolean i(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!h(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static <T extends InterfaceC3540Li1> T j(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e2) {
            throw new RuntimeException("Failed to get default instance for " + cls, e2);
        }
    }

    public static int k(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static int l(List<byte[]> list) {
        int i2 = 1;
        for (byte[] bArr : list) {
            i2 = (i2 * 31) + m(bArr);
        }
        return i2;
    }

    public static int m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public static int n(byte[] bArr, int i2, int i3) {
        int w = w(i3, bArr, i2, i3);
        if (w == 0) {
            return 1;
        }
        return w;
    }

    public static int o(ByteBuffer byteBuffer) {
        int i2;
        if (byteBuffer.hasArray()) {
            int w = w(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (w == 0) {
                return 1;
            }
            return w;
        }
        int i3 = 4096;
        if (byteBuffer.capacity() <= 4096) {
            i3 = byteBuffer.capacity();
        }
        byte[] bArr = new byte[i3];
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        int capacity = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            if (duplicate.remaining() <= i3) {
                i2 = duplicate.remaining();
            } else {
                i2 = i3;
            }
            duplicate.get(bArr, 0, i2);
            capacity = w(capacity, bArr, 0, i2);
        }
        if (capacity == 0) {
            return 1;
        }
        return capacity;
    }

    public static int p(List<ByteBuffer> list) {
        int i2 = 1;
        for (ByteBuffer byteBuffer : list) {
            i2 = (i2 * 31) + o(byteBuffer);
        }
        return i2;
    }

    public static int q(c cVar) {
        return cVar.k();
    }

    public static int r(List<? extends c> list) {
        int i2 = 1;
        for (c cVar : list) {
            i2 = (i2 * 31) + q(cVar);
        }
        return i2;
    }

    public static int s(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static boolean t(AbstractC8616os abstractC8616os) {
        return abstractC8616os.Y();
    }

    public static boolean u(byte[] bArr) {
        return BD2.t(bArr);
    }

    public static Object v(Object obj, Object obj2) {
        return ((InterfaceC3540Li1) obj).x().q3((InterfaceC3540Li1) obj2).i2();
    }

    public static int w(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static String x(String str) {
        return new String(str.getBytes(b), a);
    }

    public static byte[] y(String str) {
        return str.getBytes(a);
    }

    public static String z(byte[] bArr) {
        return new String(bArr, a);
    }
}
