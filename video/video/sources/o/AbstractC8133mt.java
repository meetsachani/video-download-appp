package o;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@InterfaceC6086ea0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.mt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8133mt<K, V> {

    /* renamed from: o.mt$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC8133mt<K, V> {
        public final /* synthetic */ Executor Y;

        /* renamed from: o.mt$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class CallableC0309a implements Callable<V> {
            public final /* synthetic */ Object a;
            public final /* synthetic */ Object b;

            public CallableC0309a(Object obj, Object obj2) {
                this.a = obj;
                this.b = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
                return AbstractC8133mt.this.f(this.a, this.b).get();
            }
        }

        public a(Executor executor) {
            this.Y = executor;
        }

        @Override // o.AbstractC8133mt
        public V d(K k) throws Exception {
            return (V) AbstractC8133mt.this.d(k);
        }

        @Override // o.AbstractC8133mt
        public Map<K, V> e(Iterable<? extends K> iterable) throws Exception {
            return AbstractC8133mt.this.e(iterable);
        }

        @Override // o.AbstractC8133mt
        public InterfaceFutureC8411o11<V> f(K k, V v) throws Exception {
            C8655p11 b = C8655p11.b(new CallableC0309a(k, v));
            this.Y.execute(b);
            return b;
        }
    }

    /* renamed from: o.mt$b */
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends AbstractC8133mt<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final YA0<K, V> X;

        public b(YA0<K, V> ya0) {
            this.X = (YA0) C10664xF1.E(ya0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC8133mt
        public V d(K k) {
            return (V) this.X.apply(C10664xF1.E(k));
        }
    }

    /* renamed from: o.mt$c */
    /* loaded from: classes3.dex */
    public static final class c extends RuntimeException {
        public c(String str) {
            super(str);
        }
    }

    /* renamed from: o.mt$d */
    /* loaded from: classes3.dex */
    public static final class d<V> extends AbstractC8133mt<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final InterfaceC8331nh2<V> X;

        public d(InterfaceC8331nh2<V> interfaceC8331nh2) {
            this.X = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
        }

        @Override // o.AbstractC8133mt
        public V d(Object obj) {
            C10664xF1.E(obj);
            return this.X.get();
        }
    }

    /* renamed from: o.mt$e */
    /* loaded from: classes3.dex */
    public static final class e extends UnsupportedOperationException {
    }

    @QB
    @InterfaceC11149zF0
    public static <K, V> AbstractC8133mt<K, V> a(AbstractC8133mt<K, V> abstractC8133mt, Executor executor) {
        C10664xF1.E(abstractC8133mt);
        C10664xF1.E(executor);
        return new a(executor);
    }

    @QB
    public static <K, V> AbstractC8133mt<K, V> b(YA0<K, V> ya0) {
        return new b(ya0);
    }

    @QB
    public static <V> AbstractC8133mt<Object, V> c(InterfaceC8331nh2<V> interfaceC8331nh2) {
        return new d(interfaceC8331nh2);
    }

    public abstract V d(K k) throws Exception;

    public Map<K, V> e(Iterable<? extends K> iterable) throws Exception {
        throw new e();
    }

    @InterfaceC11149zF0
    public InterfaceFutureC8411o11<V> f(K k, V v) throws Exception {
        C10664xF1.E(k);
        C10664xF1.E(v);
        return C6980iC0.m(d(k));
    }
}
