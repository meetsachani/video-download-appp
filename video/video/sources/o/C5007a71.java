package o;

/* renamed from: o.a71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5007a71 {

    /* renamed from: o.a71$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements VA0<Object, Object, Integer> {
        public static final a X = new a();

        public a() {
            super(2);
        }

        @Override // o.VA0
        /* renamed from: c */
        public final Integer i(Object obj, Object obj2) {
            C6562gT0.p(obj, "<anonymous parameter 0>");
            C6562gT0.p(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* renamed from: o.a71$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<Object, Object> {
        public static final b X = new b();

        public b() {
            super(1);
        }

        @Override // o.HA0
        public final Object invoke(Object obj) {
            C6562gT0.p(obj, "it");
            return null;
        }
    }

    /* renamed from: o.a71$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC8052mY0 implements ZA0<Boolean, Object, Object, Object, C7458kA2> {
        public static final c X = new c();

        public c() {
            super(4);
        }

        public final void c(boolean z, Object obj, Object obj2, Object obj3) {
            C6562gT0.p(obj, "<anonymous parameter 1>");
            C6562gT0.p(obj2, "<anonymous parameter 2>");
        }

        @Override // o.ZA0
        public /* bridge */ /* synthetic */ C7458kA2 r(Boolean bool, Object obj, Object obj2, Object obj3) {
            c(bool.booleanValue(), obj, obj2, obj3);
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: o.a71$d */
    /* loaded from: classes.dex */
    public static final class d<K, V> extends Y61<K, V> {
        public final /* synthetic */ VA0<K, V, Integer> j;
        public final /* synthetic */ HA0<K, V> k;
        public final /* synthetic */ ZA0<Boolean, K, V, V, C7458kA2> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, VA0<? super K, ? super V, Integer> va0, HA0<? super K, ? extends V> ha0, ZA0<? super Boolean, ? super K, ? super V, ? super V, C7458kA2> za0) {
            super(i);
            this.j = va0;
            this.k = ha0;
            this.l = za0;
        }

        @Override // o.Y61
        public V a(K k) {
            C6562gT0.p(k, "key");
            return this.k.invoke(k);
        }

        @Override // o.Y61
        public void c(boolean z, K k, V v, V v2) {
            C6562gT0.p(k, "key");
            C6562gT0.p(v, "oldValue");
            this.l.r(Boolean.valueOf(z), k, v, v2);
        }

        @Override // o.Y61
        public int p(K k, V v) {
            C6562gT0.p(k, "key");
            C6562gT0.p(v, "value");
            return this.j.i(k, v).intValue();
        }
    }

    public static final <K, V> Y61<K, V> a(int i, VA0<? super K, ? super V, Integer> va0, HA0<? super K, ? extends V> ha0, ZA0<? super Boolean, ? super K, ? super V, ? super V, C7458kA2> za0) {
        C6562gT0.p(va0, "sizeOf");
        C6562gT0.p(ha0, "create");
        C6562gT0.p(za0, "onEntryRemoved");
        return new d(i, va0, ha0, za0);
    }

    public static /* synthetic */ Y61 b(int i, VA0 va0, HA0 ha0, ZA0 za0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            va0 = a.X;
        }
        if ((i2 & 4) != 0) {
            ha0 = b.X;
        }
        if ((i2 & 8) != 0) {
            za0 = c.X;
        }
        C6562gT0.p(va0, "sizeOf");
        C6562gT0.p(ha0, "create");
        C6562gT0.p(za0, "onEntryRemoved");
        return new d(i, va0, ha0, za0);
    }
}
