package o;

import java.io.Serializable;
import java.util.Map;
import o.AbstractC6044eO0;

@NN0(containerOf = {"B"})
@InterfaceC11149zF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class SN0<B> extends AbstractC9862ty0<Class<? extends B>, B> implements InterfaceC7224jD<B>, Serializable {
    public static final SN0<Object> Y = new SN0<>(AbstractC6044eO0.u());
    public final AbstractC6044eO0<Class<? extends B>, B> X;

    /* loaded from: classes3.dex */
    public static final class b<B> {
        public final AbstractC6044eO0.b<Class<? extends B>, B> a = AbstractC6044eO0.b();

        public static <B, T extends B> T b(Class<T> cls, B b) {
            return (T) C9211rH1.f(cls).cast(b);
        }

        public SN0<B> a() {
            AbstractC6044eO0<Class<? extends B>, B> d = this.a.d();
            if (d.isEmpty()) {
                return SN0.Y5();
            }
            return new SN0<>(d);
        }

        @InterfaceC6181ey
        public <T extends B> b<B> c(Class<T> cls, T t) {
            this.a.i(cls, t);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6181ey
        public <T extends B> b<B> d(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class<? extends T> key = entry.getKey();
                this.a.i(key, b(key, entry.getValue()));
            }
            return this;
        }
    }

    public static <B> b<B> W5() {
        return new b<>();
    }

    public static <B, S extends B> SN0<B> X5(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof SN0) {
            return (SN0) map;
        }
        return new b().d(map).a();
    }

    public static <B> SN0<B> Y5() {
        return (SN0<B>) Y;
    }

    public static <B, T extends B> SN0<B> Z5(Class<T> cls, T t) {
        return new SN0<>(AbstractC6044eO0.v(cls, t));
    }

    @Override // o.InterfaceC7224jD
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public <T extends B> T M(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9862ty0, o.AbstractC2510Ay0
    /* renamed from: M5 */
    public Map<Class<? extends B>, B> L5() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T extends B, java.lang.Object] */
    @Override // o.InterfaceC7224jD
    @MB
    public <T extends B> T k0(Class<T> cls) {
        return this.X.get(C10664xF1.E(cls));
    }

    public Object readResolve() {
        if (isEmpty()) {
            return Y5();
        }
        return this;
    }

    public SN0(AbstractC6044eO0<Class<? extends B>, B> abstractC6044eO0) {
        this.X = abstractC6044eO0;
    }
}
