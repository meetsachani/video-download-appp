package o;

import java.util.Map;
import o.AbstractC6044eO0;

@InterfaceC5359ba0
/* loaded from: classes3.dex */
public final class EO0<B> extends AbstractC9862ty0<Pv2<? extends B>, B> implements Ov2<B> {
    public final AbstractC6044eO0<Pv2<? extends B>, B> X;

    /* loaded from: classes3.dex */
    public static final class b<B> {
        public final AbstractC6044eO0.b<Pv2<? extends B>, B> a;

        public EO0<B> a() {
            return new EO0<>(this.a.d());
        }

        @InterfaceC6181ey
        public <T extends B> b<B> b(Class<T> cls, T t) {
            this.a.i(Pv2.S(cls), t);
            return this;
        }

        @InterfaceC6181ey
        public <T extends B> b<B> c(Pv2<T> pv2, T t) {
            this.a.i(pv2.U(), t);
            return this;
        }

        public b() {
            this.a = AbstractC6044eO0.b();
        }
    }

    public static <B> b<B> W5() {
        return new b<>();
    }

    public static <B> EO0<B> X5() {
        return new EO0<>(AbstractC6044eO0.u());
    }

    @Override // o.Ov2
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public <T extends B> T M(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9862ty0, o.AbstractC2510Ay0
    /* renamed from: M5 */
    public Map<Pv2<? extends B>, B> L5() {
        return this.X;
    }

    @Override // o.Ov2
    @MB
    public <T extends B> T U3(Pv2<T> pv2) {
        return (T) Z5(pv2.U());
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    /* renamed from: Y5 */
    public B put(Pv2<? extends B> pv2, B b2) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T extends B, java.lang.Object] */
    @MB
    public final <T extends B> T Z5(Pv2<T> pv2) {
        return this.X.get(pv2);
    }

    @Override // o.Ov2
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public <T extends B> T h5(Pv2<T> pv2, T t) {
        throw new UnsupportedOperationException();
    }

    @Override // o.Ov2
    @MB
    public <T extends B> T k0(Class<T> cls) {
        return (T) Z5(Pv2.S(cls));
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends Pv2<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }

    public EO0(AbstractC6044eO0<Pv2<? extends B>, B> abstractC6044eO0) {
        this.X = abstractC6044eO0;
    }
}
