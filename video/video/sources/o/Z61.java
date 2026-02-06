package o;

import android.util.LruCache;

/* loaded from: classes.dex */
public final class Z61 {

    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements VA0<Object, Object, Integer> {
        public static final a X = new a();

        public a() {
            super(2);
        }

        @Override // o.VA0
        /* renamed from: c */
        public final Integer i(Object obj, Object obj2) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<Object, Object> {
        public static final b X = new b();

        public b() {
            super(1);
        }

        @Override // o.HA0
        public final Object invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* loaded from: classes.dex */
    public static final class d<K, V> extends LruCache<K, V> {
        public final /* synthetic */ VA0<K, V, Integer> a;
        public final /* synthetic */ HA0<K, V> b;
        public final /* synthetic */ ZA0<Boolean, K, V, V, C7458kA2> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, VA0<? super K, ? super V, Integer> va0, HA0<? super K, ? extends V> ha0, ZA0<? super Boolean, ? super K, ? super V, ? super V, C7458kA2> za0) {
            super(i);
            this.a = va0;
            this.b = ha0;
            this.c = za0;
        }

        @Override // android.util.LruCache
        public V create(K k) {
            return this.b.invoke(k);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, K k, V v, V v2) {
            this.c.r(Boolean.valueOf(z), k, v, v2);
        }

        @Override // android.util.LruCache
        public int sizeOf(K k, V v) {
            return this.a.i(k, v).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> a(int i, VA0<? super K, ? super V, Integer> va0, HA0<? super K, ? extends V> ha0, ZA0<? super Boolean, ? super K, ? super V, ? super V, C7458kA2> za0) {
        return new d(i, va0, ha0, za0);
    }

    public static /* synthetic */ LruCache b(int i, VA0 va0, HA0 ha0, ZA0 za0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            va0 = a.X;
        }
        if ((i2 & 4) != 0) {
            ha0 = b.X;
        }
        if ((i2 & 8) != 0) {
            za0 = c.X;
        }
        return new d(i, va0, ha0, za0);
    }

    /* loaded from: classes.dex */
    public static final class c extends AbstractC8052mY0 implements ZA0<Boolean, Object, Object, Object, C7458kA2> {
        public static final c X = new c();

        public c() {
            super(4);
        }

        @Override // o.ZA0
        public /* bridge */ /* synthetic */ C7458kA2 r(Boolean bool, Object obj, Object obj2, Object obj3) {
            c(bool.booleanValue(), obj, obj2, obj3);
            return C7458kA2.a;
        }

        public final void c(boolean z, Object obj, Object obj2, Object obj3) {
        }
    }
}
