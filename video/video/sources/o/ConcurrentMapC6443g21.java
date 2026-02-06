package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.AbstractC6044eO0;
import o.AbstractC6433g0;
import o.AbstractC8133mt;
import o.C5434bt;

@InterfaceC10420wF0(emulated = true)
/* renamed from: o.g21  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ConcurrentMapC6443g21<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final int r1 = 1073741824;
    public static final int s1 = 65536;
    public static final int t1 = 3;
    public static final int u1 = 63;
    public static final int v1 = 16;
    public static final Logger w1 = Logger.getLogger(ConcurrentMapC6443g21.class.getName());
    public static final A<Object, Object> x1 = new C6444a();
    public static final Queue<?> y1 = new C6445b();
    public final int X;
    public final int Y;
    public final int Y0;
    public final r<K, V>[] Z;
    public final AbstractC6843he0<Object> Z0;
    public final AbstractC6843he0<Object> a1;
    public final t b1;
    public final t c1;
    public final long d1;
    public final FK2<K, V> e1;
    public final long f1;
    public final long g1;
    public final long h1;
    public final Queue<C9737tR1<K, V>> i1;
    public final InterfaceC8759pR1<K, V> j1;
    public final AbstractC10799xo2 k1;
    public final EnumC6449f l1;
    public final AbstractC6433g0.b m1;
    @MB
    public final AbstractC8133mt<? super K, V> n1;
    @MB
    @InterfaceC7537kU1
    public Set<K> o1;
    @MB
    @InterfaceC7537kU1
    public Collection<V> p1;
    @MB
    @InterfaceC7537kU1
    public Set<Map.Entry<K, V>> q1;

    /* renamed from: o.g21$A */
    /* loaded from: classes3.dex */
    public interface A<K, V> {
        boolean a();

        @MB
        UP1<K, V> b();

        void c(@MB V v);

        int d();

        A<K, V> e(ReferenceQueue<V> referenceQueue, @MB V v, UP1<K, V> up1);

        V f() throws ExecutionException;

        @MB
        V get();

        boolean h();
    }

    /* renamed from: o.g21$B */
    /* loaded from: classes3.dex */
    public final class B extends AbstractCollection<V> {
        public B() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ConcurrentMapC6443g21.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ConcurrentMapC6443g21.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return ConcurrentMapC6443g21.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new z(ConcurrentMapC6443g21.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return ConcurrentMapC6443g21.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return ConcurrentMapC6443g21.W(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC6443g21.W(this).toArray(eArr);
        }
    }

    /* renamed from: o.g21$C */
    /* loaded from: classes3.dex */
    public static final class C<K, V> extends E<K, V> {
        public volatile long Y0;
        @GJ2
        public UP1<K, V> Z0;
        @GJ2
        public UP1<K, V> a1;

        public C(ReferenceQueue<K> referenceQueue, K k, int i, @MB UP1<K, V> up1) {
            super(referenceQueue, k, i, up1);
            this.Y0 = Long.MAX_VALUE;
            this.Z0 = ConcurrentMapC6443g21.G();
            this.a1 = ConcurrentMapC6443g21.G();
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public UP1<K, V> i() {
            return this.a1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void l(UP1<K, V> up1) {
            this.a1 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public UP1<K, V> m() {
            return this.Z0;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void q(long j) {
            this.Y0 = j;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public long s() {
            return this.Y0;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void u(UP1<K, V> up1) {
            this.Z0 = up1;
        }
    }

    /* renamed from: o.g21$D */
    /* loaded from: classes3.dex */
    public static final class D<K, V> extends E<K, V> {
        public volatile long Y0;
        @GJ2
        public UP1<K, V> Z0;
        @GJ2
        public UP1<K, V> a1;
        public volatile long b1;
        @GJ2
        public UP1<K, V> c1;
        @GJ2
        public UP1<K, V> d1;

        public D(ReferenceQueue<K> referenceQueue, K k, int i, @MB UP1<K, V> up1) {
            super(referenceQueue, k, i, up1);
            this.Y0 = Long.MAX_VALUE;
            this.Z0 = ConcurrentMapC6443g21.G();
            this.a1 = ConcurrentMapC6443g21.G();
            this.b1 = Long.MAX_VALUE;
            this.c1 = ConcurrentMapC6443g21.G();
            this.d1 = ConcurrentMapC6443g21.G();
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public UP1<K, V> i() {
            return this.a1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public UP1<K, V> j() {
            return this.c1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void l(UP1<K, V> up1) {
            this.a1 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public UP1<K, V> m() {
            return this.Z0;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public UP1<K, V> n() {
            return this.d1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void o(UP1<K, V> up1) {
            this.c1 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public long p() {
            return this.b1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void q(long j) {
            this.Y0 = j;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public long s() {
            return this.Y0;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void t(long j) {
            this.b1 = j;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void u(UP1<K, V> up1) {
            this.Z0 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void v(UP1<K, V> up1) {
            this.d1 = up1;
        }
    }

    /* renamed from: o.g21$E */
    /* loaded from: classes3.dex */
    public static class E<K, V> extends WeakReference<K> implements UP1<K, V> {
        public final int X;
        @MB
        public final UP1<K, V> Y;
        public volatile A<K, V> Z;

        public E(ReferenceQueue<K> referenceQueue, K k, int i, @MB UP1<K, V> up1) {
            super(k, referenceQueue);
            this.Z = ConcurrentMapC6443g21.X();
            this.X = i;
            this.Y = up1;
        }

        @Override // o.UP1
        public A<K, V> e() {
            return this.Z;
        }

        @Override // o.UP1
        public int g() {
            return this.X;
        }

        @Override // o.UP1
        public K getKey() {
            return get();
        }

        @Override // o.UP1
        public UP1<K, V> h() {
            return this.Y;
        }

        public UP1<K, V> i() {
            throw new UnsupportedOperationException();
        }

        public UP1<K, V> j() {
            throw new UnsupportedOperationException();
        }

        public void l(UP1<K, V> up1) {
            throw new UnsupportedOperationException();
        }

        public UP1<K, V> m() {
            throw new UnsupportedOperationException();
        }

        public UP1<K, V> n() {
            throw new UnsupportedOperationException();
        }

        public void o(UP1<K, V> up1) {
            throw new UnsupportedOperationException();
        }

        public long p() {
            throw new UnsupportedOperationException();
        }

        public void q(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public void r(A<K, V> a) {
            this.Z = a;
        }

        public long s() {
            throw new UnsupportedOperationException();
        }

        public void t(long j) {
            throw new UnsupportedOperationException();
        }

        public void u(UP1<K, V> up1) {
            throw new UnsupportedOperationException();
        }

        public void v(UP1<K, V> up1) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.g21$G */
    /* loaded from: classes3.dex */
    public static final class G<K, V> extends E<K, V> {
        public volatile long Y0;
        @GJ2
        public UP1<K, V> Z0;
        @GJ2
        public UP1<K, V> a1;

        public G(ReferenceQueue<K> referenceQueue, K k, int i, @MB UP1<K, V> up1) {
            super(referenceQueue, k, i, up1);
            this.Y0 = Long.MAX_VALUE;
            this.Z0 = ConcurrentMapC6443g21.G();
            this.a1 = ConcurrentMapC6443g21.G();
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public UP1<K, V> j() {
            return this.Z0;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public UP1<K, V> n() {
            return this.a1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void o(UP1<K, V> up1) {
            this.Z0 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public long p() {
            return this.Y0;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void t(long j) {
            this.Y0 = j;
        }

        @Override // o.ConcurrentMapC6443g21.E, o.UP1
        public void v(UP1<K, V> up1) {
            this.a1 = up1;
        }
    }

    /* renamed from: o.g21$H */
    /* loaded from: classes3.dex */
    public static final class H<K, V> extends s<K, V> {
        public final int Y;

        public H(ReferenceQueue<V> referenceQueue, V v, UP1<K, V> up1, int i) {
            super(referenceQueue, v, up1);
            this.Y = i;
        }

        @Override // o.ConcurrentMapC6443g21.s, o.ConcurrentMapC6443g21.A
        public int d() {
            return this.Y;
        }

        @Override // o.ConcurrentMapC6443g21.s, o.ConcurrentMapC6443g21.A
        public A<K, V> e(ReferenceQueue<V> referenceQueue, V v, UP1<K, V> up1) {
            return new H(referenceQueue, v, up1, this.Y);
        }
    }

    /* renamed from: o.g21$I */
    /* loaded from: classes3.dex */
    public static final class I<K, V> extends x<K, V> {
        public final int Y;

        public I(V v, int i) {
            super(v);
            this.Y = i;
        }

        @Override // o.ConcurrentMapC6443g21.x, o.ConcurrentMapC6443g21.A
        public int d() {
            return this.Y;
        }
    }

    /* renamed from: o.g21$J */
    /* loaded from: classes3.dex */
    public static final class J<K, V> extends F<K, V> {
        public final int Y;

        public J(ReferenceQueue<V> referenceQueue, V v, UP1<K, V> up1, int i) {
            super(referenceQueue, v, up1);
            this.Y = i;
        }

        @Override // o.ConcurrentMapC6443g21.F, o.ConcurrentMapC6443g21.A
        public int d() {
            return this.Y;
        }

        @Override // o.ConcurrentMapC6443g21.F, o.ConcurrentMapC6443g21.A
        public A<K, V> e(ReferenceQueue<V> referenceQueue, V v, UP1<K, V> up1) {
            return new J(referenceQueue, v, up1, this.Y);
        }
    }

    /* renamed from: o.g21$L */
    /* loaded from: classes3.dex */
    public final class L implements Map.Entry<K, V> {
        public final K X;
        public V Y;

        public L(K k, V v) {
            this.X = k;
            this.Y = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.X.equals(entry.getKey()) && this.Y.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.Y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.X.hashCode() ^ this.Y.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) ConcurrentMapC6443g21.this.put(this.X, v);
            this.Y = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(getKey());
            String valueOf2 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }
    }

    /* renamed from: o.g21$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C6445b extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return AbstractC9481sO0.M().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* renamed from: o.g21$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public abstract class AbstractC6446c<T> extends AbstractSet<T> {
        public AbstractC6446c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentMapC6443g21.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ConcurrentMapC6443g21.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentMapC6443g21.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return ConcurrentMapC6443g21.W(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC6443g21.W(this).toArray(eArr);
        }
    }

    /* renamed from: o.g21$d  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6447d<K, V> implements UP1<K, V> {
        @Override // o.UP1
        public A<K, V> e() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public int g() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public UP1<K, V> h() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public UP1<K, V> i() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public UP1<K, V> j() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public void l(UP1<K, V> up1) {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public UP1<K, V> m() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public UP1<K, V> n() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public void o(UP1<K, V> up1) {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public long p() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public void q(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public void r(A<K, V> a) {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public long s() {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public void t(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public void u(UP1<K, V> up1) {
            throw new UnsupportedOperationException();
        }

        @Override // o.UP1
        public void v(UP1<K, V> up1) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.g21$f  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static abstract class EnumC6449f {
        public static final EnumC6449f X;
        public static final EnumC6449f Y;
        public static final EnumC6449f Y0;
        public static final EnumC6449f Z;
        public static final EnumC6449f Z0;
        public static final EnumC6449f a1;
        public static final EnumC6449f b1;
        public static final EnumC6449f c1;
        public static final int d1 = 1;
        public static final int e1 = 2;
        public static final int f1 = 4;
        public static final EnumC6449f[] g1;
        public static final /* synthetic */ EnumC6449f[] h1;

        /* renamed from: o.g21$f$a */
        /* loaded from: classes3.dex */
        public enum a extends EnumC6449f {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> l(r<K, V> rVar, K k, int i, @MB UP1<K, V> up1) {
                return new w(k, i, up1);
            }
        }

        /* renamed from: o.g21$f$b */
        /* loaded from: classes3.dex */
        public enum b extends EnumC6449f {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> h(r<K, V> rVar, UP1<K, V> up1, UP1<K, V> up12) {
                UP1<K, V> h = super.h(rVar, up1, up12);
                g(up1, h);
                return h;
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> l(r<K, V> rVar, K k, int i, @MB UP1<K, V> up1) {
                return new u(k, i, up1);
            }
        }

        /* renamed from: o.g21$f$c */
        /* loaded from: classes3.dex */
        public enum c extends EnumC6449f {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> h(r<K, V> rVar, UP1<K, V> up1, UP1<K, V> up12) {
                UP1<K, V> h = super.h(rVar, up1, up12);
                i(up1, h);
                return h;
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> l(r<K, V> rVar, K k, int i, @MB UP1<K, V> up1) {
                return new y(k, i, up1);
            }
        }

        /* renamed from: o.g21$f$d */
        /* loaded from: classes3.dex */
        public enum d extends EnumC6449f {
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> h(r<K, V> rVar, UP1<K, V> up1, UP1<K, V> up12) {
                UP1<K, V> h = super.h(rVar, up1, up12);
                g(up1, h);
                i(up1, h);
                return h;
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> l(r<K, V> rVar, K k, int i, @MB UP1<K, V> up1) {
                return new v(k, i, up1);
            }
        }

        /* renamed from: o.g21$f$e */
        /* loaded from: classes3.dex */
        public enum e extends EnumC6449f {
            public e(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> l(r<K, V> rVar, K k, int i, @MB UP1<K, V> up1) {
                return new E(rVar.c1, k, i, up1);
            }
        }

        /* renamed from: o.g21$f$f  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum C0279f extends EnumC6449f {
            public C0279f(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> h(r<K, V> rVar, UP1<K, V> up1, UP1<K, V> up12) {
                UP1<K, V> h = super.h(rVar, up1, up12);
                g(up1, h);
                return h;
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> l(r<K, V> rVar, K k, int i, @MB UP1<K, V> up1) {
                return new C(rVar.c1, k, i, up1);
            }
        }

        /* renamed from: o.g21$f$g */
        /* loaded from: classes3.dex */
        public enum g extends EnumC6449f {
            public g(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> h(r<K, V> rVar, UP1<K, V> up1, UP1<K, V> up12) {
                UP1<K, V> h = super.h(rVar, up1, up12);
                i(up1, h);
                return h;
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> l(r<K, V> rVar, K k, int i, @MB UP1<K, V> up1) {
                return new G(rVar.c1, k, i, up1);
            }
        }

        /* renamed from: o.g21$f$h */
        /* loaded from: classes3.dex */
        public enum h extends EnumC6449f {
            public h(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> h(r<K, V> rVar, UP1<K, V> up1, UP1<K, V> up12) {
                UP1<K, V> h = super.h(rVar, up1, up12);
                g(up1, h);
                i(up1, h);
                return h;
            }

            @Override // o.ConcurrentMapC6443g21.EnumC6449f
            public <K, V> UP1<K, V> l(r<K, V> rVar, K k, int i, @MB UP1<K, V> up1) {
                return new D(rVar.c1, k, i, up1);
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            X = aVar;
            b bVar = new b("STRONG_ACCESS", 1);
            Y = bVar;
            c cVar = new c("STRONG_WRITE", 2);
            Z = cVar;
            d dVar = new d("STRONG_ACCESS_WRITE", 3);
            Y0 = dVar;
            e eVar = new e("WEAK", 4);
            Z0 = eVar;
            C0279f c0279f = new C0279f("WEAK_ACCESS", 5);
            a1 = c0279f;
            g gVar = new g("WEAK_WRITE", 6);
            b1 = gVar;
            h hVar = new h("WEAK_ACCESS_WRITE", 7);
            c1 = hVar;
            h1 = e();
            g1 = new EnumC6449f[]{aVar, bVar, cVar, dVar, eVar, c0279f, gVar, hVar};
        }

        public EnumC6449f(String str, int i) {
        }

        public static /* synthetic */ EnumC6449f[] e() {
            return new EnumC6449f[]{X, Y, Z, Y0, Z0, a1, b1, c1};
        }

        public static EnumC6449f j(t tVar, boolean z, boolean z2) {
            int i;
            int i2 = 0;
            if (tVar == t.Z) {
                i = 4;
            } else {
                i = 0;
            }
            int i3 = i | (z ? 1 : 0);
            if (z2) {
                i2 = 2;
            }
            return g1[i3 | i2];
        }

        public static EnumC6449f valueOf(String str) {
            return (EnumC6449f) Enum.valueOf(EnumC6449f.class, str);
        }

        public static EnumC6449f[] values() {
            return (EnumC6449f[]) h1.clone();
        }

        public <K, V> void g(UP1<K, V> up1, UP1<K, V> up12) {
            up12.q(up1.s());
            ConcurrentMapC6443g21.c(up1.i(), up12);
            ConcurrentMapC6443g21.c(up12, up1.m());
            ConcurrentMapC6443g21.H(up1);
        }

        public <K, V> UP1<K, V> h(r<K, V> rVar, UP1<K, V> up1, UP1<K, V> up12) {
            return l(rVar, up1.getKey(), up1.g(), up12);
        }

        public <K, V> void i(UP1<K, V> up1, UP1<K, V> up12) {
            up12.t(up1.p());
            ConcurrentMapC6443g21.d(up1.n(), up12);
            ConcurrentMapC6443g21.d(up12, up1.j());
            ConcurrentMapC6443g21.I(up1);
        }

        public abstract <K, V> UP1<K, V> l(r<K, V> rVar, K k, int i, @MB UP1<K, V> up1);

        public /* synthetic */ EnumC6449f(String str, int i, C6444a c6444a) {
            this(str, i);
        }
    }

    /* renamed from: o.g21$g  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C6450g extends ConcurrentMapC6443g21<K, V>.AbstractC6452i<Map.Entry<K, V>> {
        public C6450g(ConcurrentMapC6443g21 concurrentMapC6443g21) {
            super();
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6452i, java.util.Iterator
        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    /* renamed from: o.g21$h  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C6451h extends ConcurrentMapC6443g21<K, V>.AbstractC6446c<Map.Entry<K, V>> {
        public C6451h() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = ConcurrentMapC6443g21.this.get(key)) == null || !ConcurrentMapC6443g21.this.a1.d(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6450g(ConcurrentMapC6443g21.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !ConcurrentMapC6443g21.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: o.g21$i  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public abstract class AbstractC6452i<T> implements Iterator<T> {
        public int X;
        public int Y = -1;
        @MB
        public AtomicReferenceArray<UP1<K, V>> Y0;
        @MB
        public r<K, V> Z;
        @MB
        public UP1<K, V> Z0;
        @MB
        public ConcurrentMapC6443g21<K, V>.L a1;
        @MB
        public ConcurrentMapC6443g21<K, V>.L b1;

        public AbstractC6452i() {
            this.X = ConcurrentMapC6443g21.this.Z.length - 1;
            b();
        }

        public final void b() {
            this.a1 = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i = this.X;
                if (i >= 0) {
                    r<K, V>[] rVarArr = ConcurrentMapC6443g21.this.Z;
                    this.X = i - 1;
                    r<K, V> rVar = rVarArr[i];
                    this.Z = rVar;
                    if (rVar.Y != 0) {
                        AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.Z.a1;
                        this.Y0 = atomicReferenceArray;
                        this.Y = atomicReferenceArray.length() - 1;
                        if (f()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public boolean c(UP1<K, V> up1) {
            try {
                long a = ConcurrentMapC6443g21.this.k1.a();
                K key = up1.getKey();
                Object v = ConcurrentMapC6443g21.this.v(up1, a);
                if (v != null) {
                    this.a1 = new L(key, v);
                    this.Z.F();
                    return true;
                }
                this.Z.F();
                return false;
            } catch (Throwable th) {
                this.Z.F();
                throw th;
            }
        }

        public ConcurrentMapC6443g21<K, V>.L d() {
            ConcurrentMapC6443g21<K, V>.L l = this.a1;
            if (l != null) {
                this.b1 = l;
                b();
                return this.b1;
            }
            throw new NoSuchElementException();
        }

        public boolean e() {
            UP1<K, V> up1 = this.Z0;
            if (up1 == null) {
                return false;
            }
            while (true) {
                this.Z0 = up1.h();
                UP1<K, V> up12 = this.Z0;
                if (up12 != null) {
                    if (c(up12)) {
                        return true;
                    }
                    up1 = this.Z0;
                } else {
                    return false;
                }
            }
        }

        public boolean f() {
            while (true) {
                int i = this.Y;
                if (i >= 0) {
                    AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.Y0;
                    this.Y = i - 1;
                    UP1<K, V> up1 = atomicReferenceArray.get(i);
                    this.Z0 = up1;
                    if (up1 != null && (c(up1) || e())) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a1 != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.b1 != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.g0(z);
            ConcurrentMapC6443g21.this.remove(this.b1.getKey());
            this.b1 = null;
        }
    }

    /* renamed from: o.g21$j  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C6453j extends ConcurrentMapC6443g21<K, V>.AbstractC6452i<K> {
        public C6453j(ConcurrentMapC6443g21 concurrentMapC6443g21) {
            super();
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6452i, java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    /* renamed from: o.g21$k  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C6454k extends ConcurrentMapC6443g21<K, V>.AbstractC6446c<K> {
        public C6454k() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ConcurrentMapC6443g21.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C6453j(ConcurrentMapC6443g21.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (ConcurrentMapC6443g21.this.remove(obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.g21$l  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C6455l<K, V> extends p<K, V> implements Y11<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        @MB
        public transient Y11<K, V> i1;

        public C6455l(ConcurrentMapC6443g21<K, V> concurrentMapC6443g21) {
            super(concurrentMapC6443g21);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.i1 = (Y11<K, V>) N5().b((AbstractC8133mt<? super K, V>) this.g1);
        }

        private Object readResolve() {
            return this.i1;
        }

        @Override // o.Y11
        public V C0(K k) {
            return this.i1.C0(k);
        }

        @Override // o.Y11
        public void R4(K k) {
            this.i1.R4(k);
        }

        @Override // o.Y11, o.YA0
        public final V apply(K k) {
            return this.i1.apply(k);
        }

        @Override // o.Y11
        public V get(K k) throws ExecutionException {
            return this.i1.get(k);
        }

        @Override // o.Y11
        public AbstractC6044eO0<K, V> x1(Iterable<? extends K> iterable) throws ExecutionException {
            return this.i1.x1(iterable);
        }
    }

    /* renamed from: o.g21$m */
    /* loaded from: classes3.dex */
    public static class m<K, V> implements A<K, V> {
        public volatile A<K, V> X;
        public final D22<V> Y;
        public final C6100ed2 Z;

        /* renamed from: o.g21$m$a */
        /* loaded from: classes3.dex */
        public class a implements YA0<V, V> {
            public a() {
            }

            @Override // o.YA0
            public V apply(V v) {
                m.this.l(v);
                return v;
            }
        }

        public m() {
            this(ConcurrentMapC6443g21.X());
        }

        @Override // o.ConcurrentMapC6443g21.A
        public boolean a() {
            return true;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public UP1<K, V> b() {
            return null;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public void c(@MB V v) {
            if (v != null) {
                l(v);
            } else {
                this.X = ConcurrentMapC6443g21.X();
            }
        }

        @Override // o.ConcurrentMapC6443g21.A
        public int d() {
            return this.X.d();
        }

        @Override // o.ConcurrentMapC6443g21.A
        public V f() throws ExecutionException {
            return (V) C5748dA2.f(this.Y);
        }

        public long g() {
            return this.Z.g(TimeUnit.NANOSECONDS);
        }

        @Override // o.ConcurrentMapC6443g21.A
        public V get() {
            return this.X.get();
        }

        @Override // o.ConcurrentMapC6443g21.A
        public boolean h() {
            return this.X.h();
        }

        public final InterfaceFutureC8411o11<V> i(Throwable th) {
            return C6980iC0.l(th);
        }

        public A<K, V> j() {
            return this.X;
        }

        public InterfaceFutureC8411o11<V> k(K k, AbstractC8133mt<? super K, V> abstractC8133mt) {
            InterfaceFutureC8411o11<V> i;
            try {
                this.Z.k();
                V v = this.X.get();
                if (v == null) {
                    V d = abstractC8133mt.d(k);
                    if (l(d)) {
                        return this.Y;
                    }
                    return C6980iC0.m(d);
                }
                InterfaceFutureC8411o11<V> f = abstractC8133mt.f(k, v);
                if (f == null) {
                    return C6980iC0.m(null);
                }
                return C6980iC0.x(f, new a(), C3645Mk1.c());
            } catch (Throwable th) {
                if (m(th)) {
                    i = this.Y;
                } else {
                    i = i(th);
                }
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return i;
            }
        }

        public boolean l(@MB V v) {
            return this.Y.B(v);
        }

        public boolean m(Throwable th) {
            return this.Y.C(th);
        }

        public m(A<K, V> a2) {
            this.Y = D22.F();
            this.Z = C6100ed2.e();
            this.X = a2;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public A<K, V> e(ReferenceQueue<V> referenceQueue, @MB V v, UP1<K, V> up1) {
            return this;
        }
    }

    /* renamed from: o.g21$n */
    /* loaded from: classes3.dex */
    public static class n<K, V> extends o<K, V> implements Y11<K, V> {
        private static final long serialVersionUID = 1;

        public n(C5434bt<? super K, ? super V> c5434bt, AbstractC8133mt<? super K, V> abstractC8133mt) {
            super(new ConcurrentMapC6443g21(c5434bt, (AbstractC8133mt) C10664xF1.E(abstractC8133mt)), null);
        }

        @Override // o.Y11
        public V C0(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new Gy2(e.getCause());
            }
        }

        @Override // o.Y11
        public void R4(K k) {
            this.X.Q(k);
        }

        @Override // o.Y11, o.YA0
        public final V apply(K k) {
            return C0(k);
        }

        @Override // o.Y11
        public V get(K k) throws ExecutionException {
            return this.X.w(k);
        }

        @Override // o.ConcurrentMapC6443g21.o
        public Object writeReplace() {
            return new C6455l(this.X);
        }

        @Override // o.Y11
        public AbstractC6044eO0<K, V> x1(Iterable<? extends K> iterable) throws ExecutionException {
            return this.X.o(iterable);
        }
    }

    /* renamed from: o.g21$o */
    /* loaded from: classes3.dex */
    public static class o<K, V> implements InterfaceC4951Zs<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        public final ConcurrentMapC6443g21<K, V> X;

        /* renamed from: o.g21$o$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC8133mt<Object, V> {
            public final /* synthetic */ Callable X;

            public a(o oVar, Callable callable) {
                this.X = callable;
            }

            @Override // o.AbstractC8133mt
            public V d(Object obj) throws Exception {
                return (V) this.X.call();
            }
        }

        public /* synthetic */ o(ConcurrentMapC6443g21 concurrentMapC6443g21, C6444a c6444a) {
            this(concurrentMapC6443g21);
        }

        @Override // o.InterfaceC4951Zs
        @MB
        public V B3(Object obj) {
            return this.X.u(obj);
        }

        @Override // o.InterfaceC4951Zs
        public V G0(K k, Callable<? extends V> callable) throws ExecutionException {
            C10664xF1.E(callable);
            return this.X.n(k, new a(this, callable));
        }

        @Override // o.InterfaceC4951Zs
        public void J() {
            this.X.b();
        }

        @Override // o.InterfaceC4951Zs
        public C8620ot J5() {
            AbstractC6433g0.a aVar = new AbstractC6433g0.a();
            aVar.g(this.X.m1);
            for (r<K, V> rVar : this.X.Z) {
                aVar.g(rVar.i1);
            }
            return aVar.f();
        }

        @Override // o.InterfaceC4951Zs
        public void K5() {
            this.X.clear();
        }

        @Override // o.InterfaceC4951Zs
        public void P3(Iterable<?> iterable) {
            this.X.y(iterable);
        }

        @Override // o.InterfaceC4951Zs
        public ConcurrentMap<K, V> l() {
            return this.X;
        }

        @Override // o.InterfaceC4951Zs
        public void l2(Object obj) {
            C10664xF1.E(obj);
            this.X.remove(obj);
        }

        @Override // o.InterfaceC4951Zs
        public void put(K k, V v) {
            this.X.put(k, v);
        }

        @Override // o.InterfaceC4951Zs
        public void putAll(Map<? extends K, ? extends V> map) {
            this.X.putAll(map);
        }

        @Override // o.InterfaceC4951Zs
        public long size() {
            return this.X.C();
        }

        public Object writeReplace() {
            return new p(this.X);
        }

        @Override // o.InterfaceC4951Zs
        public AbstractC6044eO0<K, V> y5(Iterable<?> iterable) {
            return this.X.r(iterable);
        }

        public o(C5434bt<? super K, ? super V> c5434bt) {
            this(new ConcurrentMapC6443g21(c5434bt, null));
        }

        public o(ConcurrentMapC6443g21<K, V> concurrentMapC6443g21) {
            this.X = concurrentMapC6443g21;
        }
    }

    /* renamed from: o.g21$p */
    /* loaded from: classes3.dex */
    public static class p<K, V> extends AbstractC4179Rx0<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        public final t X;
        public final t Y;
        public final AbstractC6843he0<Object> Y0;
        public final AbstractC6843he0<Object> Z;
        public final long Z0;
        public final long a1;
        public final long b1;
        public final FK2<K, V> c1;
        public final int d1;
        public final InterfaceC8759pR1<? super K, ? super V> e1;
        @MB
        public final AbstractC10799xo2 f1;
        public final AbstractC8133mt<? super K, V> g1;
        @MB
        public transient InterfaceC4951Zs<K, V> h1;

        public p(ConcurrentMapC6443g21<K, V> concurrentMapC6443g21) {
            this(concurrentMapC6443g21.b1, concurrentMapC6443g21.c1, concurrentMapC6443g21.Z0, concurrentMapC6443g21.a1, concurrentMapC6443g21.g1, concurrentMapC6443g21.f1, concurrentMapC6443g21.d1, concurrentMapC6443g21.e1, concurrentMapC6443g21.Y0, concurrentMapC6443g21.j1, concurrentMapC6443g21.k1, concurrentMapC6443g21.n1);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.h1 = (InterfaceC4951Zs<K, V>) N5().a();
        }

        private Object readResolve() {
            return this.h1;
        }

        @Override // o.AbstractC4179Rx0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public InterfaceC4951Zs<K, V> L5() {
            return this.h1;
        }

        public C5434bt<K, V> N5() {
            C5434bt<K, V> c5434bt = (C5434bt<K, V>) C5434bt.D().H(this.X).I(this.Y).z(this.Z).L(this.Y0).e(this.d1).G((InterfaceC8759pR1<? super K, ? super V>) this.e1);
            c5434bt.a = false;
            long j = this.Z0;
            if (j > 0) {
                c5434bt.g(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.a1;
            if (j2 > 0) {
                c5434bt.f(j2, TimeUnit.NANOSECONDS);
            }
            FK2 fk2 = this.c1;
            if (fk2 != C5434bt.e.INSTANCE) {
                c5434bt.O(fk2);
                long j3 = this.b1;
                if (j3 != -1) {
                    c5434bt.C(j3);
                }
            } else {
                long j4 = this.b1;
                if (j4 != -1) {
                    c5434bt.B(j4);
                }
            }
            AbstractC10799xo2 abstractC10799xo2 = this.f1;
            if (abstractC10799xo2 != null) {
                c5434bt.K(abstractC10799xo2);
            }
            return c5434bt;
        }

        public p(t tVar, t tVar2, AbstractC6843he0<Object> abstractC6843he0, AbstractC6843he0<Object> abstractC6843he02, long j, long j2, long j3, FK2<K, V> fk2, int i, InterfaceC8759pR1<? super K, ? super V> interfaceC8759pR1, AbstractC10799xo2 abstractC10799xo2, AbstractC8133mt<? super K, V> abstractC8133mt) {
            this.X = tVar;
            this.Y = tVar2;
            this.Z = abstractC6843he0;
            this.Y0 = abstractC6843he02;
            this.Z0 = j;
            this.a1 = j2;
            this.b1 = j3;
            this.c1 = fk2;
            this.d1 = i;
            this.e1 = interfaceC8759pR1;
            this.f1 = (abstractC10799xo2 == AbstractC10799xo2.b() || abstractC10799xo2 == C5434bt.x) ? null : abstractC10799xo2;
            this.g1 = abstractC8133mt;
        }
    }

    /* renamed from: o.g21$r */
    /* loaded from: classes3.dex */
    public static class r<K, V> extends ReentrantLock {
        @GJ2
        public final ConcurrentMapC6443g21<K, V> X;
        public volatile int Y;
        public int Y0;
        @InterfaceC7980mF0("this")
        public long Z;
        public int Z0;
        @MB
        public volatile AtomicReferenceArray<UP1<K, V>> a1;
        public final long b1;
        @MB
        public final ReferenceQueue<K> c1;
        @MB
        public final ReferenceQueue<V> d1;
        public final Queue<UP1<K, V>> e1;
        public final AtomicInteger f1 = new AtomicInteger();
        @InterfaceC7980mF0("this")
        public final Queue<UP1<K, V>> g1;
        @InterfaceC7980mF0("this")
        public final Queue<UP1<K, V>> h1;
        public final AbstractC6433g0.b i1;

        /* renamed from: o.g21$r$a */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public final /* synthetic */ Object X;
            public final /* synthetic */ int Y;
            public final /* synthetic */ InterfaceFutureC8411o11 Y0;
            public final /* synthetic */ m Z;

            public a(Object obj, int i, m mVar, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
                this.X = obj;
                this.Y = i;
                this.Z = mVar;
                this.Y0 = interfaceFutureC8411o11;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    r.this.s(this.X, this.Y, this.Z, this.Y0);
                } catch (Throwable th) {
                    ConcurrentMapC6443g21.w1.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.Z.m(th);
                }
            }
        }

        public r(ConcurrentMapC6443g21<K, V> concurrentMapC6443g21, int i, long j, AbstractC6433g0.b bVar) {
            ReferenceQueue<K> referenceQueue;
            Queue<UP1<K, V>> i2;
            Queue<UP1<K, V>> i3;
            Queue<UP1<K, V>> i4;
            this.X = concurrentMapC6443g21;
            this.b1 = j;
            this.i1 = (AbstractC6433g0.b) C10664xF1.E(bVar);
            y(E(i));
            if (concurrentMapC6443g21.a0()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.c1 = referenceQueue;
            this.d1 = concurrentMapC6443g21.c0() ? new ReferenceQueue<>() : null;
            if (concurrentMapC6443g21.Z()) {
                i2 = new ConcurrentLinkedQueue<>();
            } else {
                i2 = ConcurrentMapC6443g21.i();
            }
            this.e1 = i2;
            if (concurrentMapC6443g21.e0()) {
                i3 = new K<>();
            } else {
                i3 = ConcurrentMapC6443g21.i();
            }
            this.g1 = i3;
            if (concurrentMapC6443g21.Z()) {
                i4 = new C6448e<>();
            } else {
                i4 = ConcurrentMapC6443g21.i();
            }
            this.h1 = i4;
        }

        public InterfaceFutureC8411o11<V> A(K k, int i, m<K, V> mVar, AbstractC8133mt<? super K, V> abstractC8133mt) {
            InterfaceFutureC8411o11<V> k2 = mVar.k(k, abstractC8133mt);
            k2.h4(new a(k, i, mVar, k2), C3645Mk1.c());
            return k2;
        }

        public V B(K k, int i, m<K, V> mVar, AbstractC8133mt<? super K, V> abstractC8133mt) throws ExecutionException {
            return s(k, i, mVar, mVar.k(k, abstractC8133mt));
        }

        public V C(K k, int i, AbstractC8133mt<? super K, V> abstractC8133mt) throws ExecutionException {
            m<K, V> mVar;
            boolean z;
            A<K, V> a2;
            V B;
            int i2 = i;
            lock();
            try {
                long a3 = this.X.k1.a();
                H(a3);
                int i3 = this.Y - 1;
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                int length = i2 & (atomicReferenceArray.length() - 1);
                UP1<K, V> up1 = atomicReferenceArray.get(length);
                UP1<K, V> up12 = up1;
                while (true) {
                    mVar = null;
                    if (up12 != null) {
                        long j = a3;
                        K key = up12.getKey();
                        if (up12.g() == i2 && key != null && this.X.Z0.d(k, key)) {
                            a2 = up12.e();
                            if (a2.a()) {
                                z = false;
                            } else {
                                V v = a2.get();
                                if (v == null) {
                                    m(key, i2, v, a2.d(), EnumC8516oR1.Z);
                                    i2 = i;
                                } else if (this.X.z(up12, j)) {
                                    i2 = i;
                                    m(key, i2, v, a2.d(), EnumC8516oR1.Y0);
                                } else {
                                    L(up12, j);
                                    this.i1.a(1);
                                    unlock();
                                    G();
                                    return v;
                                }
                                this.g1.remove(up12);
                                this.h1.remove(up12);
                                this.Y = i3;
                                z = true;
                            }
                        } else {
                            up12 = up12.h();
                            a3 = j;
                        }
                    } else {
                        z = true;
                        a2 = null;
                        break;
                    }
                }
                if (z) {
                    mVar = new m<>();
                    if (up12 == null) {
                        up12 = D(k, i2, up1);
                        up12.r(mVar);
                        atomicReferenceArray.set(length, up12);
                    } else {
                        up12.r(mVar);
                    }
                }
                unlock();
                G();
                if (z) {
                    try {
                        synchronized (up12) {
                            B = B(k, i2, mVar, abstractC8133mt);
                        }
                        return B;
                    } finally {
                        this.i1.b(1);
                    }
                }
                return f0(up12, k, a2);
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC7980mF0("this")
        public UP1<K, V> D(K k, int i, @MB UP1<K, V> up1) {
            return this.X.l1.l(this, C10664xF1.E(k), i, up1);
        }

        public AtomicReferenceArray<UP1<K, V>> E(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public void F() {
            if ((this.f1.incrementAndGet() & 63) == 0) {
                a();
            }
        }

        public void G() {
            Z();
        }

        @InterfaceC7980mF0("this")
        public void H(long j) {
            Y(j);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
            unlock();
            G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
            return null;
         */
        @MB
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public V I(K k, int i, V v, boolean z) {
            UP1<K, V> up1;
            int i2;
            lock();
            try {
                long a2 = this.X.k1.a();
                H(a2);
                if (this.Y + 1 > this.Z0) {
                    o();
                }
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                int length = i & (atomicReferenceArray.length() - 1);
                UP1<K, V> up12 = atomicReferenceArray.get(length);
                UP1<K, V> up13 = up12;
                while (true) {
                    if (up13 != null) {
                        K key = up13.getKey();
                        if (up13.g() == i && key != null && this.X.Z0.d(k, key)) {
                            A<K, V> e = up13.e();
                            V v2 = e.get();
                            if (v2 == null) {
                                this.Y0++;
                                if (e.h()) {
                                    m(k, i, v2, e.d(), EnumC8516oR1.Z);
                                    UP1<K, V> up14 = up13;
                                    b0(up14, k, v, a2);
                                    i2 = this.Y;
                                    up1 = up14;
                                } else {
                                    UP1<K, V> up15 = up13;
                                    b0(up15, k, v, a2);
                                    up1 = up15;
                                    i2 = this.Y + 1;
                                }
                                this.Y = i2;
                                n(up1);
                            } else {
                                long j = a2;
                                UP1<K, V> up16 = up13;
                                if (z) {
                                    L(up16, j);
                                    unlock();
                                    G();
                                    return v2;
                                }
                                this.Y0++;
                                m(k, i, v2, e.d(), EnumC8516oR1.Y);
                                b0(up16, k, v, j);
                                n(up16);
                                unlock();
                                G();
                                return v2;
                            }
                        } else {
                            long j2 = a2;
                            up13 = up13.h();
                            a2 = j2;
                        }
                    } else {
                        this.Y0++;
                        UP1<K, V> D = D(k, i, up12);
                        b0(D, k, v, a2);
                        atomicReferenceArray.set(length, D);
                        this.Y++;
                        n(D);
                        break;
                    }
                }
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        public boolean J(UP1<K, V> up1, int i) {
            AtomicReferenceArray<UP1<K, V>> atomicReferenceArray;
            int length;
            UP1<K, V> up12;
            UP1<K, V> up13;
            lock();
            try {
                atomicReferenceArray = this.a1;
                length = (atomicReferenceArray.length() - 1) & i;
                up12 = atomicReferenceArray.get(length);
                up13 = up12;
            } catch (Throwable th) {
                th = th;
            }
            while (up13 != null) {
                if (up13 == up1) {
                    this.Y0++;
                    atomicReferenceArray.set(length, V(up12, up13, up13.getKey(), i, up13.e().get(), up13.e(), EnumC8516oR1.Z));
                    this.Y--;
                    unlock();
                    G();
                    return true;
                }
                int i2 = i;
                try {
                    up13 = up13.h();
                    i = i2;
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th2;
                Throwable th3 = th;
                unlock();
                G();
                throw th3;
            }
            unlock();
            G();
            return false;
        }

        public boolean K(K k, int i, A<K, V> a2) {
            AtomicReferenceArray<UP1<K, V>> atomicReferenceArray;
            int length;
            UP1<K, V> up1;
            UP1<K, V> up12;
            lock();
            try {
                atomicReferenceArray = this.a1;
                length = (atomicReferenceArray.length() - 1) & i;
                up1 = atomicReferenceArray.get(length);
                up12 = up1;
            } catch (Throwable th) {
                th = th;
            }
            while (up12 != null) {
                K key = up12.getKey();
                if (up12.g() == i && key != null && this.X.Z0.d(k, key)) {
                    if (up12.e() == a2) {
                        this.Y0++;
                        atomicReferenceArray.set(length, V(up1, up12, key, i, a2.get(), a2, EnumC8516oR1.Z));
                        this.Y--;
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            G();
                        }
                        return true;
                    }
                    unlock();
                    if (!isHeldByCurrentThread()) {
                        G();
                    }
                    return false;
                }
                int i2 = i;
                A<K, V> a3 = a2;
                try {
                    up12 = up12.h();
                    i = i2;
                    a2 = a3;
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th2;
                Throwable th3 = th;
                unlock();
                if (!isHeldByCurrentThread()) {
                    G();
                }
                throw th3;
            }
            unlock();
            if (!isHeldByCurrentThread()) {
                G();
            }
            return false;
        }

        @InterfaceC7980mF0("this")
        public void L(UP1<K, V> up1, long j) {
            if (this.X.N()) {
                up1.q(j);
            }
            this.h1.add(up1);
        }

        public void M(UP1<K, V> up1, long j) {
            if (this.X.N()) {
                up1.q(j);
            }
            this.e1.add(up1);
        }

        @InterfaceC7980mF0("this")
        public void N(UP1<K, V> up1, int i, long j) {
            j();
            this.Z += i;
            if (this.X.N()) {
                up1.q(j);
            }
            if (this.X.P()) {
                up1.t(j);
            }
            this.h1.add(up1);
            this.g1.add(up1);
        }

        @MB
        public V O(K k, int i, AbstractC8133mt<? super K, V> abstractC8133mt, boolean z) {
            m<K, V> z2 = z(k, i, z);
            if (z2 == null) {
                return null;
            }
            InterfaceFutureC8411o11<V> A = A(k, i, z2, abstractC8133mt);
            if (A.isDone()) {
                try {
                    return (V) C5748dA2.f(A);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
            r9 = r5.e();
            r8 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
            if (r8 == null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            r12 = o.EnumC8516oR1.X;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            r10 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
            if (r9.h() == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
            r12 = o.EnumC8516oR1.Z;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
            r11.Y0++;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
            r0.set(r1, V(r4, r5, r6, r13, r8, r9, r10));
            r11.Y--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
            unlock();
            G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
            return r8;
         */
        @MB
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public V P(Object obj, int i) {
            UP1<K, V> up1;
            lock();
            try {
                H(this.X.k1.a());
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                int length = (atomicReferenceArray.length() - 1) & i;
                UP1<K, V> up12 = atomicReferenceArray.get(length);
                up1 = up12;
            } catch (Throwable th) {
                th = th;
            }
            while (true) {
                if (up1 == null) {
                    break;
                }
                K key = up1.getKey();
                if (up1.g() == i && key != null && this.X.Z0.d(obj, key)) {
                    break;
                }
                int i2 = i;
                try {
                    up1 = up1.h();
                    i = i2;
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th2;
                Throwable th3 = th;
                unlock();
                G();
                throw th3;
            }
            unlock();
            G();
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
            r10 = r6.e();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
            if (r12.X.a1.d(r15, r9) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
            r13 = o.EnumC8516oR1.X;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
            r11 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
            r13 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
            if (r9 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
            if (r10.h() == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
            r13 = o.EnumC8516oR1.Z;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
            r12.Y0++;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
            r0.set(r1, V(r5, r6, r7, r14, r9, r10, r11));
            r12.Y--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
            if (r11 != o.EnumC8516oR1.X) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
            unlock();
            G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean Q(Object obj, int i, Object obj2) {
            UP1<K, V> up1;
            lock();
            try {
                H(this.X.k1.a());
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                UP1<K, V> up12 = atomicReferenceArray.get(length);
                up1 = up12;
            } catch (Throwable th) {
                th = th;
            }
            while (true) {
                if (up1 == null) {
                    break;
                }
                K key = up1.getKey();
                if (up1.g() == i && key != null && this.X.Z0.d(obj, key)) {
                    break;
                }
                int i2 = i;
                try {
                    up1 = up1.h();
                    i = i2;
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th2;
                Throwable th3 = th;
                unlock();
                G();
                throw th3;
            }
            unlock();
            G();
            return false;
        }

        @InterfaceC7980mF0("this")
        public void R(UP1<K, V> up1) {
            m(up1.getKey(), up1.g(), up1.e().get(), up1.e().d(), EnumC8516oR1.Z);
            this.g1.remove(up1);
            this.h1.remove(up1);
        }

        @InterfaceC7980mF0("this")
        @InterfaceC5299bJ2
        public boolean S(UP1<K, V> up1, int i, EnumC8516oR1 enumC8516oR1) {
            AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
            int length = (atomicReferenceArray.length() - 1) & i;
            UP1<K, V> up12 = atomicReferenceArray.get(length);
            for (UP1<K, V> up13 = up12; up13 != null; up13 = up13.h()) {
                if (up13 == up1) {
                    this.Y0++;
                    atomicReferenceArray.set(length, V(up12, up13, up13.getKey(), i, up13.e().get(), up13.e(), enumC8516oR1));
                    this.Y--;
                    return true;
                }
            }
            return false;
        }

        @InterfaceC7980mF0("this")
        @MB
        public UP1<K, V> T(UP1<K, V> up1, UP1<K, V> up12) {
            int i = this.Y;
            UP1<K, V> h = up12.h();
            while (up1 != up12) {
                UP1<K, V> h2 = h(up1, h);
                if (h2 != null) {
                    h = h2;
                } else {
                    R(up1);
                    i--;
                }
                up1 = up1.h();
            }
            this.Y = i;
            return h;
        }

        public boolean U(K k, int i, m<K, V> mVar) {
            lock();
            try {
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                int length = (atomicReferenceArray.length() - 1) & i;
                UP1<K, V> up1 = atomicReferenceArray.get(length);
                UP1<K, V> up12 = up1;
                while (true) {
                    if (up12 == null) {
                        break;
                    }
                    K key = up12.getKey();
                    if (up12.g() == i && key != null && this.X.Z0.d(k, key)) {
                        if (up12.e() == mVar) {
                            if (mVar.h()) {
                                up12.r(mVar.j());
                            } else {
                                atomicReferenceArray.set(length, T(up1, up12));
                            }
                            unlock();
                            G();
                            return true;
                        }
                    } else {
                        up12 = up12.h();
                    }
                }
                unlock();
                G();
                return false;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        @InterfaceC7980mF0("this")
        @MB
        public UP1<K, V> V(UP1<K, V> up1, UP1<K, V> up12, @MB K k, int i, V v, A<K, V> a2, EnumC8516oR1 enumC8516oR1) {
            m(k, i, v, a2.d(), enumC8516oR1);
            this.g1.remove(up12);
            this.h1.remove(up12);
            if (a2.a()) {
                a2.c(null);
                return up1;
            }
            return T(up1, up12);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
            return null;
         */
        @MB
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public V W(K k, int i, V v) {
            lock();
            try {
                long a2 = this.X.k1.a();
                H(a2);
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                int length = i & (atomicReferenceArray.length() - 1);
                UP1<K, V> up1 = atomicReferenceArray.get(length);
                UP1<K, V> up12 = up1;
                while (true) {
                    if (up12 == null) {
                        break;
                    }
                    K key = up12.getKey();
                    if (up12.g() == i && key != null && this.X.Z0.d(k, key)) {
                        long j = a2;
                        A<K, V> e = up12.e();
                        V v2 = e.get();
                        if (v2 == null) {
                            if (e.h()) {
                                this.Y0++;
                                atomicReferenceArray.set(length, V(up1, up12, key, i, v2, e, EnumC8516oR1.Z));
                                this.Y--;
                            }
                        } else {
                            UP1<K, V> up13 = up12;
                            this.Y0++;
                            m(k, i, v2, e.d(), EnumC8516oR1.Y);
                            b0(up13, k, v, j);
                            n(up13);
                            unlock();
                            G();
                            return v2;
                        }
                    } else {
                        UP1<K, V> up14 = up1;
                        long j2 = a2;
                        up12 = up12.h();
                        up1 = up14;
                        a2 = j2;
                    }
                }
            } finally {
                unlock();
                G();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean X(K k, int i, V v, V v2) {
            int i2 = i;
            lock();
            try {
                long a2 = this.X.k1.a();
                H(a2);
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                int length = i2 & (atomicReferenceArray.length() - 1);
                UP1<K, V> up1 = atomicReferenceArray.get(length);
                UP1<K, V> up12 = up1;
                while (true) {
                    if (up12 == null) {
                        break;
                    }
                    UP1<K, V> up13 = up12;
                    K key = up13.getKey();
                    if (up13.g() == i2 && key != null && this.X.Z0.d(k, key)) {
                        long j = a2;
                        A<K, V> e = up13.e();
                        V v3 = e.get();
                        if (v3 == null) {
                            if (e.h()) {
                                this.Y0++;
                                atomicReferenceArray.set(length, V(up1, up13, key, i2, v3, e, EnumC8516oR1.Z));
                                this.Y--;
                            }
                        } else if (this.X.a1.d(v, v3)) {
                            this.Y0++;
                            m(k, i, v3, e.d(), EnumC8516oR1.Y);
                            b0(up13, k, v2, j);
                            n(up13);
                            return true;
                        } else {
                            L(up13, j);
                        }
                    } else {
                        UP1<K, V> up14 = up1;
                        long j2 = a2;
                        up12 = up13.h();
                        up1 = up14;
                        i2 = i;
                        a2 = j2;
                    }
                }
            } finally {
                unlock();
                G();
            }
        }

        public void Y(long j) {
            if (tryLock()) {
                try {
                    k();
                    p(j);
                    this.f1.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void Z() {
            if (!isHeldByCurrentThread()) {
                this.X.J();
            }
        }

        public void a() {
            Y(this.X.k1.a());
            Z();
        }

        public V a0(UP1<K, V> up1, K k, int i, V v, long j, AbstractC8133mt<? super K, V> abstractC8133mt) {
            V O;
            if (this.X.R() && j - up1.p() > this.X.h1 && !up1.e().a() && (O = O(k, i, abstractC8133mt, true)) != null) {
                return O;
            }
            return v;
        }

        public void b() {
            EnumC8516oR1 enumC8516oR1;
            if (this.Y != 0) {
                lock();
                try {
                    H(this.X.k1.a());
                    AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (UP1<K, V> up1 = atomicReferenceArray.get(i); up1 != null; up1 = up1.h()) {
                            if (up1.e().h()) {
                                K key = up1.getKey();
                                V v = up1.e().get();
                                try {
                                    if (key != null && v != null) {
                                        enumC8516oR1 = EnumC8516oR1.X;
                                        m(key, up1.g(), v, up1.e().d(), enumC8516oR1);
                                    }
                                    m(key, up1.g(), v, up1.e().d(), enumC8516oR1);
                                } catch (Throwable th) {
                                    th = th;
                                    unlock();
                                    G();
                                    throw th;
                                }
                                enumC8516oR1 = EnumC8516oR1.Z;
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    d();
                    this.g1.clear();
                    this.h1.clear();
                    this.f1.set(0);
                    this.Y0++;
                    this.Y = 0;
                    unlock();
                    G();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @InterfaceC7980mF0("this")
        public void b0(UP1<K, V> up1, K k, V v, long j) {
            boolean z;
            A<K, V> e = up1.e();
            int e2 = this.X.e1.e(k, v);
            if (e2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.h0(z, "Weights must be non-negative");
            up1.r(this.X.c1.h(this, up1, v, e2));
            N(up1, e2, j);
            e.c(v);
        }

        public void c() {
            do {
            } while (this.c1.poll() != null);
        }

        public boolean c0(K k, int i, m<K, V> mVar, V v) {
            EnumC8516oR1 enumC8516oR1;
            lock();
            try {
                long a2 = this.X.k1.a();
                H(a2);
                int i2 = this.Y + 1;
                if (i2 > this.Z0) {
                    o();
                    i2 = this.Y + 1;
                }
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                int length = i & (atomicReferenceArray.length() - 1);
                UP1<K, V> up1 = atomicReferenceArray.get(length);
                UP1<K, V> up12 = up1;
                while (true) {
                    if (up12 != null) {
                        K key = up12.getKey();
                        if (up12.g() == i && key != null && this.X.Z0.d(k, key)) {
                            A<K, V> e = up12.e();
                            V v2 = e.get();
                            if (mVar != e && (v2 != null || e == ConcurrentMapC6443g21.x1)) {
                                m(k, i, v, 0, EnumC8516oR1.Y);
                                unlock();
                                G();
                                return false;
                            }
                            this.Y0++;
                            if (mVar.h()) {
                                if (v2 == null) {
                                    enumC8516oR1 = EnumC8516oR1.Z;
                                } else {
                                    enumC8516oR1 = EnumC8516oR1.Y;
                                }
                                m(k, i, v2, mVar.d(), enumC8516oR1);
                                i2--;
                            }
                            UP1<K, V> up13 = up12;
                            b0(up13, k, v, a2);
                            this.Y = i2;
                            n(up13);
                        } else {
                            up12 = up12.h();
                        }
                    } else {
                        this.Y0++;
                        UP1<K, V> D = D(k, i, up1);
                        b0(D, k, v, a2);
                        atomicReferenceArray.set(length, D);
                        this.Y = i2;
                        n(D);
                        break;
                    }
                }
                unlock();
                G();
                return true;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }

        public void d() {
            if (this.X.a0()) {
                c();
            }
            if (this.X.c0()) {
                e();
            }
        }

        public void d0() {
            if (tryLock()) {
                try {
                    k();
                } finally {
                    unlock();
                }
            }
        }

        public void e() {
            do {
            } while (this.d1.poll() != null);
        }

        public void e0(long j) {
            if (tryLock()) {
                try {
                    p(j);
                } finally {
                    unlock();
                }
            }
        }

        public boolean f(Object obj, int i) {
            try {
                boolean z = false;
                if (this.Y == 0) {
                    return false;
                }
                UP1<K, V> v = v(obj, i, this.X.k1.a());
                if (v == null) {
                    return false;
                }
                if (v.e().get() != null) {
                    z = true;
                }
                return z;
            } finally {
                F();
            }
        }

        public V f0(UP1<K, V> up1, K k, A<K, V> a2) throws ExecutionException {
            if (a2.a()) {
                C10664xF1.x0(!Thread.holdsLock(up1), "Recursive load of: %s", k);
                try {
                    V f = a2.f();
                    if (f != null) {
                        M(up1, this.X.k1.a());
                        return f;
                    }
                    String valueOf = String.valueOf(k);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                    sb.append("CacheLoader returned null for key ");
                    sb.append(valueOf);
                    sb.append(UE.h);
                    throw new AbstractC8133mt.c(sb.toString());
                } finally {
                    this.i1.b(1);
                }
            }
            throw new AssertionError();
        }

        @InterfaceC5299bJ2
        public boolean g(Object obj) {
            try {
                if (this.Y != 0) {
                    long a2 = this.X.k1.a();
                    AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (UP1<K, V> up1 = atomicReferenceArray.get(i); up1 != null; up1 = up1.h()) {
                            V w = w(up1, a2);
                            if (w != null && this.X.a1.d(obj, w)) {
                                F();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                F();
            }
        }

        @InterfaceC7980mF0("this")
        public UP1<K, V> h(UP1<K, V> up1, UP1<K, V> up12) {
            if (up1.getKey() == null) {
                return null;
            }
            A<K, V> e = up1.e();
            V v = e.get();
            if (v == null && e.h()) {
                return null;
            }
            UP1<K, V> h = this.X.l1.h(this, up1, up12);
            h.r(e.e(this.d1, v, h));
            return h;
        }

        @InterfaceC7980mF0("this")
        public void i() {
            int i = 0;
            do {
                Reference<? extends K> poll = this.c1.poll();
                if (poll != null) {
                    this.X.K((UP1) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @InterfaceC7980mF0("this")
        public void j() {
            while (true) {
                UP1<K, V> poll = this.e1.poll();
                if (poll != null) {
                    if (this.h1.contains(poll)) {
                        this.h1.add(poll);
                    }
                } else {
                    return;
                }
            }
        }

        @InterfaceC7980mF0("this")
        public void k() {
            if (this.X.a0()) {
                i();
            }
            if (this.X.c0()) {
                l();
            }
        }

        @InterfaceC7980mF0("this")
        public void l() {
            int i = 0;
            do {
                Reference<? extends V> poll = this.d1.poll();
                if (poll != null) {
                    this.X.L((A) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @InterfaceC7980mF0("this")
        public void m(@MB K k, int i, @MB V v, int i2, EnumC8516oR1 enumC8516oR1) {
            this.Z -= i2;
            if (enumC8516oR1.g()) {
                this.i1.c();
            }
            if (this.X.i1 != ConcurrentMapC6443g21.y1) {
                this.X.i1.offer(C9737tR1.a(k, v, enumC8516oR1));
            }
        }

        @InterfaceC7980mF0("this")
        public void n(UP1<K, V> up1) {
            if (this.X.j()) {
                j();
                if (up1.e().d() > this.b1 && !S(up1, up1.g(), EnumC8516oR1.Z0)) {
                    throw new AssertionError();
                }
                while (this.Z > this.b1) {
                    UP1<K, V> x = x();
                    if (!S(x, x.g(), EnumC8516oR1.Z0)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @InterfaceC7980mF0("this")
        public void o() {
            AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.Y;
            AtomicReferenceArray<UP1<K, V>> E = E(length << 1);
            this.Z0 = (E.length() * 3) / 4;
            int length2 = E.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                UP1<K, V> up1 = atomicReferenceArray.get(i2);
                if (up1 != null) {
                    UP1<K, V> h = up1.h();
                    int g = up1.g() & length2;
                    if (h == null) {
                        E.set(g, up1);
                    } else {
                        UP1<K, V> up12 = up1;
                        while (h != null) {
                            int g2 = h.g() & length2;
                            if (g2 != g) {
                                up12 = h;
                                g = g2;
                            }
                            h = h.h();
                        }
                        E.set(g, up12);
                        while (up1 != up12) {
                            int g3 = up1.g() & length2;
                            UP1<K, V> h2 = h(up1, E.get(g3));
                            if (h2 != null) {
                                E.set(g3, h2);
                            } else {
                                R(up1);
                                i--;
                            }
                            up1 = up1.h();
                        }
                    }
                }
            }
            this.a1 = E;
            this.Y = i;
        }

        @InterfaceC7980mF0("this")
        public void p(long j) {
            UP1<K, V> peek;
            UP1<K, V> peek2;
            j();
            do {
                peek = this.g1.peek();
                if (peek == null || !this.X.z(peek, j)) {
                    do {
                        peek2 = this.h1.peek();
                        if (peek2 == null || !this.X.z(peek2, j)) {
                            return;
                        }
                    } while (S(peek2, peek2.g(), EnumC8516oR1.Y0));
                    throw new AssertionError();
                }
            } while (S(peek, peek.g(), EnumC8516oR1.Y0));
            throw new AssertionError();
        }

        @MB
        public V q(Object obj, int i) {
            try {
                if (this.Y != 0) {
                    long a2 = this.X.k1.a();
                    UP1<K, V> v = v(obj, i, a2);
                    if (v == null) {
                        F();
                        return null;
                    }
                    V v2 = v.e().get();
                    if (v2 != null) {
                        M(v, a2);
                        V a0 = a0(v, v.getKey(), i, v2, a2, this.X.n1);
                        F();
                        return a0;
                    }
                    d0();
                }
                F();
                return null;
            } catch (Throwable th) {
                F();
                throw th;
            }
        }

        public V r(K k, int i, AbstractC8133mt<? super K, V> abstractC8133mt) throws ExecutionException {
            K k2;
            int i2;
            AbstractC8133mt<? super K, V> abstractC8133mt2;
            UP1<K, V> t;
            C10664xF1.E(k);
            C10664xF1.E(abstractC8133mt);
            try {
                try {
                } catch (ExecutionException e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    F();
                    throw th2;
                }
                try {
                    if (this.Y != 0 && (t = t(k, i)) != null) {
                        long a2 = this.X.k1.a();
                        V w = w(t, a2);
                        if (w != null) {
                            M(t, a2);
                            this.i1.a(1);
                            V a0 = a0(t, k, i, w, a2, abstractC8133mt);
                            F();
                            return a0;
                        }
                        k2 = k;
                        i2 = i;
                        abstractC8133mt2 = abstractC8133mt;
                        A<K, V> e2 = t.e();
                        if (e2.a()) {
                            V f0 = f0(t, k2, e2);
                            F();
                            return f0;
                        }
                    } else {
                        k2 = k;
                        i2 = i;
                        abstractC8133mt2 = abstractC8133mt;
                    }
                    V C = C(k2, i2, abstractC8133mt2);
                    F();
                    return C;
                } catch (ExecutionException e3) {
                    e = e3;
                    ExecutionException executionException = e;
                    Throwable cause = executionException.getCause();
                    if (!(cause instanceof Error)) {
                        if (cause instanceof RuntimeException) {
                            throw new Gy2(cause);
                        }
                        throw executionException;
                    }
                    throw new C5140ag0((Error) cause);
                }
            } catch (Throwable th3) {
                th = th3;
                Throwable th22 = th;
                F();
                throw th22;
            }
        }

        public V s(K k, int i, m<K, V> mVar, InterfaceFutureC8411o11<V> interfaceFutureC8411o11) throws ExecutionException {
            V v;
            try {
                v = (V) C5748dA2.f(interfaceFutureC8411o11);
            } catch (Throwable th) {
                th = th;
                v = null;
            }
            try {
                if (v != null) {
                    this.i1.e(mVar.g());
                    c0(k, i, mVar, v);
                    return v;
                }
                String valueOf = String.valueOf(k);
                StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                sb.append("CacheLoader returned null for key ");
                sb.append(valueOf);
                sb.append(UE.h);
                throw new AbstractC8133mt.c(sb.toString());
            } catch (Throwable th2) {
                th = th2;
                if (v == null) {
                    this.i1.d(mVar.g());
                    U(k, i, mVar);
                }
                throw th;
            }
        }

        @MB
        public UP1<K, V> t(Object obj, int i) {
            for (UP1<K, V> u = u(i); u != null; u = u.h()) {
                if (u.g() == i) {
                    K key = u.getKey();
                    if (key == null) {
                        d0();
                    } else if (this.X.Z0.d(obj, key)) {
                        return u;
                    }
                }
            }
            return null;
        }

        public UP1<K, V> u(int i) {
            AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        @MB
        public UP1<K, V> v(Object obj, int i, long j) {
            UP1<K, V> t = t(obj, i);
            if (t == null) {
                return null;
            }
            if (this.X.z(t, j)) {
                e0(j);
                return null;
            }
            return t;
        }

        public V w(UP1<K, V> up1, long j) {
            if (up1.getKey() == null) {
                d0();
                return null;
            }
            V v = up1.e().get();
            if (v == null) {
                d0();
                return null;
            } else if (this.X.z(up1, j)) {
                e0(j);
                return null;
            } else {
                return v;
            }
        }

        @InterfaceC7980mF0("this")
        public UP1<K, V> x() {
            for (UP1<K, V> up1 : this.h1) {
                if (up1.e().d() > 0) {
                    return up1;
                }
            }
            throw new AssertionError();
        }

        public void y(AtomicReferenceArray<UP1<K, V>> atomicReferenceArray) {
            this.Z0 = (atomicReferenceArray.length() * 3) / 4;
            if (!this.X.g()) {
                int i = this.Z0;
                if (i == this.b1) {
                    this.Z0 = i + 1;
                }
            }
            this.a1 = atomicReferenceArray;
        }

        /* JADX WARN: Finally extract failed */
        @MB
        public m<K, V> z(K k, int i, boolean z) {
            lock();
            try {
                long a2 = this.X.k1.a();
                H(a2);
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = this.a1;
                int length = (atomicReferenceArray.length() - 1) & i;
                UP1<K, V> up1 = atomicReferenceArray.get(length);
                for (UP1<K, V> up12 = up1; up12 != null; up12 = up12.h()) {
                    K key = up12.getKey();
                    if (up12.g() == i && key != null && this.X.Z0.d(k, key)) {
                        A<K, V> e = up12.e();
                        if (!e.a() && (!z || a2 - up12.p() >= this.X.h1)) {
                            this.Y0++;
                            m<K, V> mVar = new m<>(e);
                            up12.r(mVar);
                            unlock();
                            G();
                            return mVar;
                        }
                        unlock();
                        G();
                        return null;
                    }
                }
                this.Y0++;
                m<K, V> mVar2 = new m<>();
                UP1<K, V> D = D(k, i, up1);
                D.r(mVar2);
                atomicReferenceArray.set(length, D);
                unlock();
                G();
                return mVar2;
            } catch (Throwable th) {
                unlock();
                G();
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.g21$t */
    /* loaded from: classes3.dex */
    public static abstract class t {
        public static final t X = new a("STRONG", 0);
        public static final t Y = new b("SOFT", 1);
        public static final t Z = new c("WEAK", 2);
        public static final /* synthetic */ t[] Y0 = e();

        /* renamed from: o.g21$t$a */
        /* loaded from: classes3.dex */
        public enum a extends t {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.t
            public AbstractC6843he0<Object> g() {
                return AbstractC6843he0.c();
            }

            @Override // o.ConcurrentMapC6443g21.t
            public <K, V> A<K, V> h(r<K, V> rVar, UP1<K, V> up1, V v, int i) {
                if (i == 1) {
                    return new x(v);
                }
                return new I(v, i);
            }
        }

        /* renamed from: o.g21$t$b */
        /* loaded from: classes3.dex */
        public enum b extends t {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.t
            public AbstractC6843he0<Object> g() {
                return AbstractC6843he0.g();
            }

            @Override // o.ConcurrentMapC6443g21.t
            public <K, V> A<K, V> h(r<K, V> rVar, UP1<K, V> up1, V v, int i) {
                if (i == 1) {
                    return new s(rVar.d1, v, up1);
                }
                return new H(rVar.d1, v, up1, i);
            }
        }

        /* renamed from: o.g21$t$c */
        /* loaded from: classes3.dex */
        public enum c extends t {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // o.ConcurrentMapC6443g21.t
            public AbstractC6843he0<Object> g() {
                return AbstractC6843he0.g();
            }

            @Override // o.ConcurrentMapC6443g21.t
            public <K, V> A<K, V> h(r<K, V> rVar, UP1<K, V> up1, V v, int i) {
                if (i == 1) {
                    return new F(rVar.d1, v, up1);
                }
                return new J(rVar.d1, v, up1, i);
            }
        }

        public t(String str, int i) {
        }

        public static /* synthetic */ t[] e() {
            return new t[]{X, Y, Z};
        }

        public static t valueOf(String str) {
            return (t) Enum.valueOf(t.class, str);
        }

        public static t[] values() {
            return (t[]) Y0.clone();
        }

        public abstract AbstractC6843he0<Object> g();

        public abstract <K, V> A<K, V> h(r<K, V> rVar, UP1<K, V> up1, V v, int i);

        public /* synthetic */ t(String str, int i, C6444a c6444a) {
            this(str, i);
        }
    }

    /* renamed from: o.g21$u */
    /* loaded from: classes3.dex */
    public static final class u<K, V> extends w<K, V> {
        public volatile long Z0;
        @GJ2
        public UP1<K, V> a1;
        @GJ2
        public UP1<K, V> b1;

        public u(K k, int i, @MB UP1<K, V> up1) {
            super(k, i, up1);
            this.Z0 = Long.MAX_VALUE;
            this.a1 = ConcurrentMapC6443g21.G();
            this.b1 = ConcurrentMapC6443g21.G();
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public UP1<K, V> i() {
            return this.b1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void l(UP1<K, V> up1) {
            this.b1 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public UP1<K, V> m() {
            return this.a1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void q(long j) {
            this.Z0 = j;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public long s() {
            return this.Z0;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void u(UP1<K, V> up1) {
            this.a1 = up1;
        }
    }

    /* renamed from: o.g21$v */
    /* loaded from: classes3.dex */
    public static final class v<K, V> extends w<K, V> {
        public volatile long Z0;
        @GJ2
        public UP1<K, V> a1;
        @GJ2
        public UP1<K, V> b1;
        public volatile long c1;
        @GJ2
        public UP1<K, V> d1;
        @GJ2
        public UP1<K, V> e1;

        public v(K k, int i, @MB UP1<K, V> up1) {
            super(k, i, up1);
            this.Z0 = Long.MAX_VALUE;
            this.a1 = ConcurrentMapC6443g21.G();
            this.b1 = ConcurrentMapC6443g21.G();
            this.c1 = Long.MAX_VALUE;
            this.d1 = ConcurrentMapC6443g21.G();
            this.e1 = ConcurrentMapC6443g21.G();
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public UP1<K, V> i() {
            return this.b1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public UP1<K, V> j() {
            return this.d1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void l(UP1<K, V> up1) {
            this.b1 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public UP1<K, V> m() {
            return this.a1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public UP1<K, V> n() {
            return this.e1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void o(UP1<K, V> up1) {
            this.d1 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public long p() {
            return this.c1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void q(long j) {
            this.Z0 = j;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public long s() {
            return this.Z0;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void t(long j) {
            this.c1 = j;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void u(UP1<K, V> up1) {
            this.a1 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void v(UP1<K, V> up1) {
            this.e1 = up1;
        }
    }

    /* renamed from: o.g21$w */
    /* loaded from: classes3.dex */
    public static class w<K, V> extends AbstractC6447d<K, V> {
        public final K X;
        public final int Y;
        public volatile A<K, V> Y0 = ConcurrentMapC6443g21.X();
        @MB
        public final UP1<K, V> Z;

        public w(K k, int i, @MB UP1<K, V> up1) {
            this.X = k;
            this.Y = i;
            this.Z = up1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public A<K, V> e() {
            return this.Y0;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public int g() {
            return this.Y;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public K getKey() {
            return this.X;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public UP1<K, V> h() {
            return this.Z;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void r(A<K, V> a) {
            this.Y0 = a;
        }
    }

    /* renamed from: o.g21$y */
    /* loaded from: classes3.dex */
    public static final class y<K, V> extends w<K, V> {
        public volatile long Z0;
        @GJ2
        public UP1<K, V> a1;
        @GJ2
        public UP1<K, V> b1;

        public y(K k, int i, @MB UP1<K, V> up1) {
            super(k, i, up1);
            this.Z0 = Long.MAX_VALUE;
            this.a1 = ConcurrentMapC6443g21.G();
            this.b1 = ConcurrentMapC6443g21.G();
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public UP1<K, V> j() {
            return this.a1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public UP1<K, V> n() {
            return this.b1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void o(UP1<K, V> up1) {
            this.a1 = up1;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public long p() {
            return this.Z0;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void t(long j) {
            this.Z0 = j;
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
        public void v(UP1<K, V> up1) {
            this.b1 = up1;
        }
    }

    /* renamed from: o.g21$z */
    /* loaded from: classes3.dex */
    public final class z extends ConcurrentMapC6443g21<K, V>.AbstractC6452i<V> {
        public z(ConcurrentMapC6443g21 concurrentMapC6443g21) {
            super();
        }

        @Override // o.ConcurrentMapC6443g21.AbstractC6452i, java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    public ConcurrentMapC6443g21(C5434bt<? super K, ? super V> c5434bt, @MB AbstractC8133mt<? super K, V> abstractC8133mt) {
        Queue<C9737tR1<K, V>> concurrentLinkedQueue;
        this.Y0 = Math.min(c5434bt.j(), 65536);
        t o2 = c5434bt.o();
        this.b1 = o2;
        this.c1 = c5434bt.v();
        this.Z0 = c5434bt.n();
        this.a1 = c5434bt.u();
        long p2 = c5434bt.p();
        this.d1 = p2;
        this.e1 = (FK2<K, V>) c5434bt.w();
        this.f1 = c5434bt.k();
        this.g1 = c5434bt.l();
        this.h1 = c5434bt.q();
        InterfaceC8759pR1<K, V> interfaceC8759pR1 = (InterfaceC8759pR1<K, V>) c5434bt.r();
        this.j1 = interfaceC8759pR1;
        if (interfaceC8759pR1 == C5434bt.d.INSTANCE) {
            concurrentLinkedQueue = i();
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        }
        this.i1 = concurrentLinkedQueue;
        this.k1 = c5434bt.t(O());
        this.l1 = EnumC6449f.j(o2, Y(), d0());
        this.m1 = c5434bt.s().get();
        this.n1 = abstractC8133mt;
        int min = Math.min(c5434bt.m(), 1073741824);
        if (j() && !g()) {
            min = (int) Math.min(min, p2);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.Y0 && (!j() || i4 * 20 <= this.d1)) {
            i3++;
            i4 <<= 1;
        }
        this.Y = 32 - i3;
        this.X = i4 - 1;
        this.Z = E(i4);
        int i5 = min / i4;
        while (i2 < (i5 * i4 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (j()) {
            long j = this.d1;
            long j2 = i4;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (true) {
                r<K, V>[] rVarArr = this.Z;
                if (i < rVarArr.length) {
                    if (i == j4) {
                        j3--;
                    }
                    rVarArr[i] = f(i2, j3, c5434bt.s().get());
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                r<K, V>[] rVarArr2 = this.Z;
                if (i < rVarArr2.length) {
                    rVarArr2[i] = f(i2, -1L, c5434bt.s().get());
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static <K, V> UP1<K, V> G() {
        return q.INSTANCE;
    }

    public static <K, V> void H(UP1<K, V> up1) {
        UP1<K, V> G2 = G();
        up1.u(G2);
        up1.l(G2);
    }

    public static <K, V> void I(UP1<K, V> up1) {
        UP1<K, V> G2 = G();
        up1.o(G2);
        up1.v(G2);
    }

    public static int S(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    public static <E> ArrayList<E> W(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C7052iU0.a(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V> A<K, V> X() {
        return (A<K, V>) x1;
    }

    public static <K, V> void c(UP1<K, V> up1, UP1<K, V> up12) {
        up1.u(up12);
        up12.l(up1);
    }

    public static <K, V> void d(UP1<K, V> up1, UP1<K, V> up12) {
        up1.o(up12);
        up12.v(up1);
    }

    public static <E> Queue<E> i() {
        return (Queue<E>) y1;
    }

    @InterfaceC5299bJ2
    public boolean A(UP1<K, V> up1, long j) {
        if (T(up1.g()).w(up1, j) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    @MB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<K, V> B(Set<? extends K> set, AbstractC8133mt<? super K, V> abstractC8133mt) throws ExecutionException {
        C10664xF1.E(abstractC8133mt);
        C10664xF1.E(set);
        C6100ed2 c = C6100ed2.c();
        boolean z2 = true;
        boolean z3 = false;
        try {
            try {
                try {
                    try {
                        try {
                            Map map = (Map<? super K, V>) abstractC8133mt.e(set);
                            if (map != null) {
                                c.l();
                                for (Map.Entry<K, V> entry : map.entrySet()) {
                                    K key = entry.getKey();
                                    V value = entry.getValue();
                                    if (key != null && value != null) {
                                        put(key, value);
                                    } else {
                                        z3 = true;
                                    }
                                }
                                if (!z3) {
                                    this.m1.e(c.g(TimeUnit.NANOSECONDS));
                                    return map;
                                }
                                this.m1.d(c.g(TimeUnit.NANOSECONDS));
                                String valueOf = String.valueOf(abstractC8133mt);
                                StringBuilder sb = new StringBuilder(valueOf.length() + 42);
                                sb.append(valueOf);
                                sb.append(" returned null keys or values from loadAll");
                                throw new AbstractC8133mt.c(sb.toString());
                            }
                            this.m1.d(c.g(TimeUnit.NANOSECONDS));
                            String valueOf2 = String.valueOf(abstractC8133mt);
                            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 31);
                            sb2.append(valueOf2);
                            sb2.append(" returned null map from loadAll");
                            throw new AbstractC8133mt.c(sb2.toString());
                        } catch (AbstractC8133mt.e e) {
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                if (!z2) {
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            throw new ExecutionException(e2);
                        }
                    } catch (Error e3) {
                        throw new C5140ag0(e3);
                    }
                } catch (InterruptedException e4) {
                    Thread.currentThread().interrupt();
                    throw new ExecutionException(e4);
                }
            } catch (RuntimeException e5) {
                throw new Gy2(e5);
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
            if (!z2) {
                this.m1.d(c.g(TimeUnit.NANOSECONDS));
            }
            throw th;
        }
    }

    public long C() {
        r<K, V>[] rVarArr;
        long j = 0;
        for (int i = 0; i < this.Z.length; i++) {
            j += Math.max(0, rVarArr[i].Y);
        }
        return j;
    }

    @InterfaceC5299bJ2
    public UP1<K, V> D(K k, int i, @MB UP1<K, V> up1) {
        r<K, V> T = T(i);
        T.lock();
        try {
            return T.D(k, i, up1);
        } finally {
            T.unlock();
        }
    }

    public final r<K, V>[] E(int i) {
        return new r[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5299bJ2
    public A<K, V> F(UP1<K, V> up1, V v2, int i) {
        return this.c1.h(T(up1.g()), up1, C10664xF1.E(v2), i);
    }

    public void J() {
        while (true) {
            C9737tR1<K, V> poll = this.i1.poll();
            if (poll != null) {
                try {
                    this.j1.e(poll);
                } catch (Throwable th) {
                    w1.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    public void K(UP1<K, V> up1) {
        int g = up1.g();
        T(g).J(up1, g);
    }

    public void L(A<K, V> a) {
        UP1<K, V> b = a.b();
        int g = b.g();
        T(g).K(b.getKey(), g, a);
    }

    public boolean N() {
        return l();
    }

    public boolean O() {
        if (!P() && !N()) {
            return false;
        }
        return true;
    }

    public boolean P() {
        if (!m() && !R()) {
            return false;
        }
        return true;
    }

    public void Q(K k) {
        int x2 = x(C10664xF1.E(k));
        T(x2).O(k, x2, this.n1, false);
    }

    public boolean R() {
        if (this.h1 > 0) {
            return true;
        }
        return false;
    }

    public r<K, V> T(int i) {
        return this.Z[(i >>> this.Y) & this.X];
    }

    public boolean Y() {
        if (!Z() && !N()) {
            return false;
        }
        return true;
    }

    public boolean Z() {
        if (!l() && !j()) {
            return false;
        }
        return true;
    }

    public boolean a0() {
        if (this.b1 != t.X) {
            return true;
        }
        return false;
    }

    public void b() {
        for (r<K, V> rVar : this.Z) {
            rVar.a();
        }
    }

    public boolean c0() {
        if (this.c1 != t.X) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (r<K, V> rVar : this.Z) {
            rVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@MB Object obj) {
        if (obj == null) {
            return false;
        }
        int x2 = x(obj);
        return T(x2).f(obj, x2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@MB Object obj) {
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        long a = this.k1.a();
        r<K, V>[] rVarArr = this.Z;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = rVarArr.length;
            long j2 = 0;
            for (int i2 = z2; i2 < length; i2++) {
                r<K, V> rVar = rVarArr[i2];
                int i3 = rVar.Y;
                AtomicReferenceArray<UP1<K, V>> atomicReferenceArray = rVar.a1;
                boolean z3 = z2;
                for (int i4 = z3; i4 < atomicReferenceArray.length(); i4++) {
                    UP1<K, V> up1 = atomicReferenceArray.get(i4);
                    while (up1 != null) {
                        r<K, V>[] rVarArr2 = rVarArr;
                        V w2 = rVar.w(up1, a);
                        UP1<K, V> up12 = up1;
                        if (w2 != null && this.a1.d(obj, w2)) {
                            return true;
                        }
                        up1 = up12.h();
                        rVarArr = rVarArr2;
                    }
                }
                j2 += rVar.Y0;
                z2 = z3;
            }
            boolean z4 = z2;
            r<K, V>[] rVarArr3 = rVarArr;
            if (j2 != j) {
                i++;
                j = j2;
                z2 = z4;
                rVarArr = rVarArr3;
            } else {
                return z4;
            }
        }
        return z2;
    }

    public boolean d0() {
        if (!e0() && !P()) {
            return false;
        }
        return true;
    }

    @InterfaceC5299bJ2
    public UP1<K, V> e(UP1<K, V> up1, UP1<K, V> up12) {
        return T(up1.g()).h(up1, up12);
    }

    public boolean e0() {
        return m();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC11149zF0
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.q1;
        if (set != null) {
            return set;
        }
        C6451h c6451h = new C6451h();
        this.q1 = c6451h;
        return c6451h;
    }

    public r<K, V> f(int i, long j, AbstractC6433g0.b bVar) {
        return new r<>(this, i, j, bVar);
    }

    public boolean g() {
        if (this.e1 != C5434bt.e.INSTANCE) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @MB
    public V get(@MB Object obj) {
        if (obj == null) {
            return null;
        }
        int x2 = x(obj);
        return T(x2).q(obj, x2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @MB
    public V getOrDefault(@MB Object obj, @MB V v2) {
        V v3 = get(obj);
        if (v3 != null) {
            return v3;
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        r<K, V>[] rVarArr = this.Z;
        long j = 0;
        for (int i = 0; i < rVarArr.length; i++) {
            if (rVarArr[i].Y != 0) {
                return false;
            }
            j += rVarArr[i].Y0;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < rVarArr.length; i2++) {
            if (rVarArr[i2].Y != 0) {
                return false;
            }
            j -= rVarArr[i2].Y0;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    public boolean j() {
        if (this.d1 >= 0) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (!m() && !l()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.o1;
        if (set != null) {
            return set;
        }
        C6454k c6454k = new C6454k();
        this.o1 = c6454k;
        return c6454k;
    }

    public boolean l() {
        if (this.f1 > 0) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.g1 > 0) {
            return true;
        }
        return false;
    }

    public V n(K k, AbstractC8133mt<? super K, V> abstractC8133mt) throws ExecutionException {
        int x2 = x(C10664xF1.E(k));
        return T(x2).r(k, x2, abstractC8133mt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6044eO0<K, V> o(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap c0 = C7935m81.c0();
        LinkedHashSet A2 = C10856y22.A();
        int i = 0;
        int i2 = 0;
        for (K k : iterable) {
            Object obj = get(k);
            if (!c0.containsKey(k)) {
                c0.put(k, obj);
                if (obj == null) {
                    i2++;
                    A2.add(k);
                } else {
                    i++;
                }
            }
        }
        try {
            if (!A2.isEmpty()) {
                try {
                    Map B2 = B(Collections.unmodifiableSet(A2), this.n1);
                    for (Object obj2 : A2) {
                        Object obj3 = B2.get(obj2);
                        if (obj3 != null) {
                            c0.put(obj2, obj3);
                        } else {
                            String valueOf = String.valueOf(obj2);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                            sb.append("loadAll failed to return a value for ");
                            sb.append(valueOf);
                            throw new AbstractC8133mt.c(sb.toString());
                        }
                    }
                } catch (AbstractC8133mt.e unused) {
                    for (Object obj4 : A2) {
                        i2--;
                        c0.put(obj4, n(obj4, this.n1));
                    }
                }
            }
            AbstractC6044eO0<K, V> g = AbstractC6044eO0.g(c0);
            this.m1.a(i);
            this.m1.b(i2);
            return g;
        } catch (Throwable th) {
            this.m1.a(i);
            this.m1.b(i2);
            throw th;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v2) {
        C10664xF1.E(k);
        C10664xF1.E(v2);
        int x2 = x(k);
        return T(x2).I(k, x2, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v2) {
        C10664xF1.E(k);
        C10664xF1.E(v2);
        int x2 = x(k);
        return T(x2).I(k, x2, v2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6044eO0<K, V> r(Iterable<?> iterable) {
        AbstractC6044eO0.b b = AbstractC6044eO0.b();
        int i = 0;
        int i2 = 0;
        for (Object obj : iterable) {
            V v2 = get(obj);
            if (v2 == null) {
                i2++;
            } else {
                b.i(obj, v2);
                i++;
            }
        }
        this.m1.a(i);
        this.m1.b(i2);
        return b.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(@MB Object obj) {
        if (obj == null) {
            return null;
        }
        int x2 = x(obj);
        return T(x2).P(obj, x2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, @MB V v2, V v3) {
        C10664xF1.E(k);
        C10664xF1.E(v3);
        if (v2 == null) {
            return false;
        }
        int x2 = x(k);
        return T(x2).X(k, x2, v2, v3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return C7775lT0.x(C());
    }

    public UP1<K, V> t(@MB Object obj) {
        if (obj == null) {
            return null;
        }
        int x2 = x(obj);
        return T(x2).t(obj, x2);
    }

    @MB
    public V u(Object obj) {
        int x2 = x(C10664xF1.E(obj));
        V q2 = T(x2).q(obj, x2);
        if (q2 == null) {
            this.m1.b(1);
            return q2;
        }
        this.m1.a(1);
        return q2;
    }

    @MB
    public V v(UP1<K, V> up1, long j) {
        V v2;
        if (up1.getKey() == null || (v2 = up1.e().get()) == null || z(up1, j)) {
            return null;
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.p1;
        if (collection != null) {
            return collection;
        }
        B b = new B();
        this.p1 = b;
        return b;
    }

    public V w(K k) throws ExecutionException {
        return n(k, this.n1);
    }

    public int x(@MB Object obj) {
        return S(this.Z0.f(obj));
    }

    public void y(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public boolean z(UP1<K, V> up1, long j) {
        C10664xF1.E(up1);
        if (l() && j - up1.s() >= this.f1) {
            return true;
        }
        if (m() && j - up1.p() >= this.g1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@MB Object obj, @MB Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int x2 = x(obj);
        return T(x2).Q(obj, x2, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v2) {
        C10664xF1.E(k);
        C10664xF1.E(v2);
        int x2 = x(k);
        return T(x2).W(k, x2, v2);
    }

    /* renamed from: o.g21$q */
    /* loaded from: classes3.dex */
    public enum q implements UP1<Object, Object> {
        INSTANCE;

        @Override // o.UP1
        public A<Object, Object> e() {
            return null;
        }

        @Override // o.UP1
        public int g() {
            return 0;
        }

        @Override // o.UP1
        public Object getKey() {
            return null;
        }

        @Override // o.UP1
        public UP1<Object, Object> h() {
            return null;
        }

        @Override // o.UP1
        public long p() {
            return 0L;
        }

        @Override // o.UP1
        public long s() {
            return 0L;
        }

        @Override // o.UP1
        public UP1<Object, Object> i() {
            return this;
        }

        @Override // o.UP1
        public UP1<Object, Object> j() {
            return this;
        }

        @Override // o.UP1
        public UP1<Object, Object> m() {
            return this;
        }

        @Override // o.UP1
        public UP1<Object, Object> n() {
            return this;
        }

        @Override // o.UP1
        public void l(UP1<Object, Object> up1) {
        }

        @Override // o.UP1
        public void o(UP1<Object, Object> up1) {
        }

        @Override // o.UP1
        public void q(long j) {
        }

        @Override // o.UP1
        public void r(A<Object, Object> a) {
        }

        @Override // o.UP1
        public void t(long j) {
        }

        @Override // o.UP1
        public void u(UP1<Object, Object> up1) {
        }

        @Override // o.UP1
        public void v(UP1<Object, Object> up1) {
        }
    }

    /* renamed from: o.g21$K */
    /* loaded from: classes3.dex */
    public static final class K<K, V> extends AbstractQueue<UP1<K, V>> {
        public final UP1<K, V> X = new a(this);

        /* renamed from: o.g21$K$b */
        /* loaded from: classes3.dex */
        public class b extends R2<UP1<K, V>> {
            public b(UP1 up1) {
                super(up1);
            }

            @Override // o.R2
            /* renamed from: c */
            public UP1<K, V> b(UP1<K, V> up1) {
                UP1<K, V> j = up1.j();
                if (j == K.this.X) {
                    return null;
                }
                return j;
            }
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            UP1<K, V> j = this.X.j();
            while (true) {
                UP1<K, V> up1 = this.X;
                if (j != up1) {
                    UP1<K, V> j2 = j.j();
                    ConcurrentMapC6443g21.I(j);
                    j = j2;
                } else {
                    up1.o(up1);
                    UP1<K, V> up12 = this.X;
                    up12.v(up12);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (((UP1) obj).j() != q.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        /* renamed from: d */
        public boolean offer(UP1<K, V> up1) {
            ConcurrentMapC6443g21.d(up1.n(), up1.j());
            ConcurrentMapC6443g21.d(this.X.n(), up1);
            ConcurrentMapC6443g21.d(up1, this.X);
            return true;
        }

        @Override // java.util.Queue
        /* renamed from: e */
        public UP1<K, V> peek() {
            UP1<K, V> j = this.X.j();
            if (j == this.X) {
                return null;
            }
            return j;
        }

        @Override // java.util.Queue
        /* renamed from: f */
        public UP1<K, V> poll() {
            UP1<K, V> j = this.X.j();
            if (j == this.X) {
                return null;
            }
            remove(j);
            return j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.X.j() == this.X) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<UP1<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            UP1 up1 = (UP1) obj;
            UP1<K, V> n = up1.n();
            UP1<K, V> j = up1.j();
            ConcurrentMapC6443g21.d(n, j);
            ConcurrentMapC6443g21.I(up1);
            if (j != q.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (UP1<K, V> j = this.X.j(); j != this.X; j = j.j()) {
                i++;
            }
            return i;
        }

        /* renamed from: o.g21$K$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6447d<K, V> {
            @GJ2
            public UP1<K, V> X = this;
            @GJ2
            public UP1<K, V> Y = this;

            public a(K k) {
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public UP1<K, V> j() {
                return this.X;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public UP1<K, V> n() {
                return this.Y;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public void o(UP1<K, V> up1) {
                this.X = up1;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public long p() {
                return Long.MAX_VALUE;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public void v(UP1<K, V> up1) {
                this.Y = up1;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public void t(long j) {
            }
        }
    }

    /* renamed from: o.g21$e  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C6448e<K, V> extends AbstractQueue<UP1<K, V>> {
        public final UP1<K, V> X = new a(this);

        /* renamed from: o.g21$e$b */
        /* loaded from: classes3.dex */
        public class b extends R2<UP1<K, V>> {
            public b(UP1 up1) {
                super(up1);
            }

            @Override // o.R2
            /* renamed from: c */
            public UP1<K, V> b(UP1<K, V> up1) {
                UP1<K, V> m = up1.m();
                if (m == C6448e.this.X) {
                    return null;
                }
                return m;
            }
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            UP1<K, V> m = this.X.m();
            while (true) {
                UP1<K, V> up1 = this.X;
                if (m != up1) {
                    UP1<K, V> m2 = m.m();
                    ConcurrentMapC6443g21.H(m);
                    m = m2;
                } else {
                    up1.u(up1);
                    UP1<K, V> up12 = this.X;
                    up12.l(up12);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (((UP1) obj).m() != q.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        /* renamed from: d */
        public boolean offer(UP1<K, V> up1) {
            ConcurrentMapC6443g21.c(up1.i(), up1.m());
            ConcurrentMapC6443g21.c(this.X.i(), up1);
            ConcurrentMapC6443g21.c(up1, this.X);
            return true;
        }

        @Override // java.util.Queue
        /* renamed from: e */
        public UP1<K, V> peek() {
            UP1<K, V> m = this.X.m();
            if (m == this.X) {
                return null;
            }
            return m;
        }

        @Override // java.util.Queue
        /* renamed from: f */
        public UP1<K, V> poll() {
            UP1<K, V> m = this.X.m();
            if (m == this.X) {
                return null;
            }
            remove(m);
            return m;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.X.m() == this.X) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<UP1<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            UP1 up1 = (UP1) obj;
            UP1<K, V> i = up1.i();
            UP1<K, V> m = up1.m();
            ConcurrentMapC6443g21.c(i, m);
            ConcurrentMapC6443g21.H(up1);
            if (m != q.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (UP1<K, V> m = this.X.m(); m != this.X; m = m.m()) {
                i++;
            }
            return i;
        }

        /* renamed from: o.g21$e$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6447d<K, V> {
            @GJ2
            public UP1<K, V> X = this;
            @GJ2
            public UP1<K, V> Y = this;

            public a(C6448e c6448e) {
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public UP1<K, V> i() {
                return this.Y;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public void l(UP1<K, V> up1) {
                this.Y = up1;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public UP1<K, V> m() {
                return this.X;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public long s() {
                return Long.MAX_VALUE;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public void u(UP1<K, V> up1) {
                this.X = up1;
            }

            @Override // o.ConcurrentMapC6443g21.AbstractC6447d, o.UP1
            public void q(long j) {
            }
        }
    }

    /* renamed from: o.g21$F */
    /* loaded from: classes3.dex */
    public static class F<K, V> extends WeakReference<V> implements A<K, V> {
        public final UP1<K, V> X;

        public F(ReferenceQueue<V> referenceQueue, V v, UP1<K, V> up1) {
            super(v, referenceQueue);
            this.X = up1;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public boolean a() {
            return false;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public UP1<K, V> b() {
            return this.X;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public int d() {
            return 1;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public A<K, V> e(ReferenceQueue<V> referenceQueue, V v, UP1<K, V> up1) {
            return new F(referenceQueue, v, up1);
        }

        @Override // o.ConcurrentMapC6443g21.A
        public V f() {
            return get();
        }

        @Override // o.ConcurrentMapC6443g21.A
        public boolean h() {
            return true;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public void c(V v) {
        }
    }

    /* renamed from: o.g21$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C6444a implements A<Object, Object> {
        @Override // o.ConcurrentMapC6443g21.A
        public boolean a() {
            return false;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public UP1<Object, Object> b() {
            return null;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public int d() {
            return 0;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public Object f() {
            return null;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public Object get() {
            return null;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public boolean h() {
            return false;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public void c(Object obj) {
        }

        @Override // o.ConcurrentMapC6443g21.A
        public A<Object, Object> e(ReferenceQueue<Object> referenceQueue, @MB Object obj, UP1<Object, Object> up1) {
            return this;
        }
    }

    /* renamed from: o.g21$s */
    /* loaded from: classes3.dex */
    public static class s<K, V> extends SoftReference<V> implements A<K, V> {
        public final UP1<K, V> X;

        public s(ReferenceQueue<V> referenceQueue, V v, UP1<K, V> up1) {
            super(v, referenceQueue);
            this.X = up1;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public boolean a() {
            return false;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public UP1<K, V> b() {
            return this.X;
        }

        public int d() {
            return 1;
        }

        public A<K, V> e(ReferenceQueue<V> referenceQueue, V v, UP1<K, V> up1) {
            return new s(referenceQueue, v, up1);
        }

        @Override // o.ConcurrentMapC6443g21.A
        public V f() {
            return get();
        }

        @Override // o.ConcurrentMapC6443g21.A
        public boolean h() {
            return true;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public void c(V v) {
        }
    }

    /* renamed from: o.g21$x */
    /* loaded from: classes3.dex */
    public static class x<K, V> implements A<K, V> {
        public final V X;

        public x(V v) {
            this.X = v;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public boolean a() {
            return false;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public UP1<K, V> b() {
            return null;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public int d() {
            return 1;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public V f() {
            return get();
        }

        @Override // o.ConcurrentMapC6443g21.A
        public V get() {
            return this.X;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public boolean h() {
            return true;
        }

        @Override // o.ConcurrentMapC6443g21.A
        public void c(V v) {
        }

        @Override // o.ConcurrentMapC6443g21.A
        public A<K, V> e(ReferenceQueue<V> referenceQueue, V v, UP1<K, V> up1) {
            return this;
        }
    }
}
