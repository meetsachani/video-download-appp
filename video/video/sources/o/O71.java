package o;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import o.IM2;
import o.InterfaceC3540Li1;

/* loaded from: classes.dex */
public class O71<K, V> {
    public static final int d = 1;
    public static final int e = 2;
    public final b<K, V> a;
    public final K b;
    public final V c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IM2.b.values().length];
            a = iArr;
            try {
                iArr[IM2.b.h1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IM2.b.k1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IM2.b.g1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b<K, V> {
        public final IM2.b a;
        public final K b;
        public final IM2.b c;
        public final V d;

        public b(IM2.b bVar, K k, IM2.b bVar2, V v) {
            this.a = bVar;
            this.b = k;
            this.c = bVar2;
            this.d = v;
        }
    }

    public O71(IM2.b bVar, K k, IM2.b bVar2, V v) {
        this.a = new b<>(bVar, k, bVar2, v);
        this.b = k;
        this.c = v;
    }

    public static <K, V> int b(b<K, V> bVar, K k, V v) {
        return C11040yo0.o(bVar.a, 1, k) + C11040yo0.o(bVar.c, 2, v);
    }

    public static <K, V> O71<K, V> f(IM2.b bVar, K k, IM2.b bVar2, V v) {
        return new O71<>(bVar, k, bVar2, v);
    }

    public static <K, V> Map.Entry<K, V> h(KE ke, b<K, V> bVar, C3151Hj0 c3151Hj0) throws IOException {
        Object obj = bVar.b;
        Object obj2 = bVar.d;
        while (true) {
            int Y = ke.Y();
            if (Y == 0) {
                break;
            } else if (Y == IM2.c(1, bVar.a.g())) {
                obj = i(ke, c3151Hj0, bVar.a, obj);
            } else if (Y == IM2.c(2, bVar.c.g())) {
                obj2 = i(ke, c3151Hj0, bVar.c, obj2);
            } else if (!ke.g0(Y)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static <T> T i(KE ke, C3151Hj0 c3151Hj0, IM2.b bVar, T t) throws IOException {
        int i = a.a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return (T) C11040yo0.N(ke, bVar, true);
                }
                throw new RuntimeException("Groups are not allowed in maps.");
            }
            return (T) Integer.valueOf(ke.z());
        }
        InterfaceC3540Li1.a x = ((InterfaceC3540Li1) t).x();
        ke.I(x, c3151Hj0);
        return (T) x.i2();
    }

    public static <K, V> void l(ME me, b<K, V> bVar, K k, V v) throws IOException {
        C11040yo0.R(me, bVar.a, 1, k);
        C11040yo0.R(me, bVar.c, 2, v);
    }

    public int a(int i, K k, V v) {
        return ME.X0(i) + ME.D0(b(this.a, k, v));
    }

    public K c() {
        return this.b;
    }

    public b<K, V> d() {
        return this.a;
    }

    public V e() {
        return this.c;
    }

    public Map.Entry<K, V> g(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws IOException {
        return h(abstractC8616os.d0(), this.a, c3151Hj0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(Q71<K, V> q71, KE ke, C3151Hj0 c3151Hj0) throws IOException {
        int t = ke.t(ke.N());
        b<K, V> bVar = this.a;
        Object obj = bVar.b;
        Object obj2 = bVar.d;
        while (true) {
            int Y = ke.Y();
            if (Y == 0) {
                break;
            } else if (Y == IM2.c(1, this.a.a.g())) {
                obj = i(ke, c3151Hj0, this.a.a, obj);
            } else if (Y == IM2.c(2, this.a.c.g())) {
                obj2 = i(ke, c3151Hj0, this.a.c, obj2);
            } else if (!ke.g0(Y)) {
                break;
            }
        }
        ke.a(0);
        ke.s(t);
        q71.put(obj, obj2);
    }

    public void k(ME me, int i, K k, V v) throws IOException {
        me.g2(i, 2);
        me.h2(b(this.a, k, v));
        l(me, this.a, k, v);
    }

    public O71(b<K, V> bVar, K k, V v) {
        this.a = bVar;
        this.b = k;
        this.c = v;
    }
}
