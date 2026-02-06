package o;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C4632Wn1;

@InterfaceC5359ba0
/* renamed from: o.Wn1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4632Wn1<B> extends AbstractC9862ty0<Pv2<? extends B>, B> implements Ov2<B> {
    public final Map<Pv2<? extends B>, B> X = C7935m81.Y();

    /* renamed from: o.Wn1$a */
    /* loaded from: classes3.dex */
    public static final class a<K, V> extends AbstractC10105uy0<K, V> {
        public final Map.Entry<K, V> X;

        /* renamed from: o.Wn1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0242a extends AbstractC2804Dy0<Map.Entry<K, V>> {
            public final /* synthetic */ Set X;

            public C0242a(Set set) {
                this.X = set;
            }

            @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
            /* renamed from: Y5 */
            public Set<Map.Entry<K, V>> M5() {
                return this.X;
            }

            @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
            public Iterator<Map.Entry<K, V>> iterator() {
                return a.S5(super.iterator());
            }

            @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return V5();
            }

            @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) W5(tArr);
            }
        }

        public a(Map.Entry<K, V> entry) {
            this.X = (Map.Entry) C10664xF1.E(entry);
        }

        public static /* synthetic */ a Q5(Map.Entry entry) {
            return new a(entry);
        }

        public static <K, V> Iterator<Map.Entry<K, V>> S5(Iterator<Map.Entry<K, V>> it) {
            return C7052iU0.c0(it, new YA0() { // from class: o.Vn1
                @Override // o.YA0
                public final Object apply(Object obj) {
                    return C4632Wn1.a.Q5((Map.Entry) obj);
                }
            });
        }

        public static <K, V> Set<Map.Entry<K, V>> T5(Set<Map.Entry<K, V>> set) {
            return new C0242a(set);
        }

        @Override // o.AbstractC10105uy0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Map.Entry<K, V> L5() {
            return this.X;
        }

        @Override // o.AbstractC10105uy0, java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T extends B, java.lang.Object] */
    @MB
    private <T extends B> T X5(Pv2<T> pv2) {
        return this.X.get(pv2);
    }

    @Override // o.Ov2
    @InterfaceC6181ey
    @MB
    public <T extends B> T M(Class<T> cls, T t) {
        return (T) Y5(Pv2.S(cls), t);
    }

    @Override // o.AbstractC9862ty0, o.AbstractC2510Ay0
    /* renamed from: M5 */
    public Map<Pv2<? extends B>, B> L5() {
        return this.X;
    }

    @Override // o.Ov2
    @MB
    public <T extends B> T U3(Pv2<T> pv2) {
        return (T) X5(pv2.U());
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    /* renamed from: W5 */
    public B put(Pv2<? extends B> pv2, B b) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T extends B, java.lang.Object] */
    @MB
    public final <T extends B> T Y5(Pv2<T> pv2, T t) {
        return this.X.put(pv2, t);
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    public Set<Map.Entry<Pv2<? extends B>, B>> entrySet() {
        return a.T5(super.entrySet());
    }

    @Override // o.Ov2
    @InterfaceC6181ey
    @MB
    public <T extends B> T h5(Pv2<T> pv2, T t) {
        return (T) Y5(pv2.U(), t);
    }

    @Override // o.Ov2
    @MB
    public <T extends B> T k0(Class<T> cls) {
        return (T) X5(Pv2.S(cls));
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends Pv2<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }
}
