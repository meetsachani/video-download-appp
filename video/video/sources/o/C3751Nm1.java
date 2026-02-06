package o;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.Nm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3751Nm1<B> extends AbstractC9862ty0<Class<? extends B>, B> implements InterfaceC7224jD<B>, Serializable {
    public final Map<Class<? extends B>, B> X;

    /* renamed from: o.Nm1$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC10105uy0<Class<? extends B>, B> {
        public final /* synthetic */ Map.Entry X;

        public a(Map.Entry entry) {
            this.X = entry;
        }

        @Override // o.AbstractC10105uy0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Map.Entry<Class<? extends B>, B> L5() {
            return this.X;
        }

        @Override // o.AbstractC10105uy0, java.util.Map.Entry
        public B setValue(B b) {
            return (B) super.setValue(C3751Nm1.X5(getKey(), b));
        }
    }

    /* renamed from: o.Nm1$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC2804Dy0<Map.Entry<Class<? extends B>, B>> {

        /* renamed from: o.Nm1$b$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC8375ns2<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            public a(b bVar, Iterator it) {
                super(it);
            }

            @Override // o.AbstractC8375ns2
            /* renamed from: c */
            public Map.Entry<Class<? extends B>, B> b(Map.Entry<Class<? extends B>, B> entry) {
                return C3751Nm1.Y5(entry);
            }
        }

        public b() {
        }

        @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<Map.Entry<Class<? extends B>, B>> M5() {
            return C3751Nm1.this.L5().entrySet();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new a(this, M5().iterator());
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

    /* renamed from: o.Nm1$c */
    /* loaded from: classes3.dex */
    public static final class c<B> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Map<Class<? extends B>, B> X;

        public c(Map<Class<? extends B>, B> map) {
            this.X = map;
        }

        public Object readResolve() {
            return C3751Nm1.a6(this.X);
        }
    }

    public C3751Nm1(Map<Class<? extends B>, B> map) {
        this.X = (Map) C10664xF1.E(map);
    }

    @InterfaceC6181ey
    @MB
    public static <B, T extends B> T X5(Class<T> cls, @MB B b2) {
        return (T) C9211rH1.f(cls).cast(b2);
    }

    public static <B> Map.Entry<Class<? extends B>, B> Y5(Map.Entry<Class<? extends B>, B> entry) {
        return new a(entry);
    }

    public static <B> C3751Nm1<B> Z5() {
        return new C3751Nm1<>(new HashMap());
    }

    public static <B> C3751Nm1<B> a6(Map<Class<? extends B>, B> map) {
        return new C3751Nm1<>(map);
    }

    private Object writeReplace() {
        return new c(L5());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC7224jD
    @InterfaceC6181ey
    @MB
    public <T extends B> T M(Class<T> cls, T t) {
        return (T) X5(cls, put(cls, t));
    }

    @Override // o.AbstractC9862ty0, o.AbstractC2510Ay0
    /* renamed from: M5 */
    public Map<Class<? extends B>, B> L5() {
        return this.X;
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    @InterfaceC6181ey
    @MB
    /* renamed from: b6 */
    public B put(Class<? extends B> cls, B b2) {
        return (B) super.put(cls, X5(cls, b2));
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new b();
    }

    @Override // o.InterfaceC7224jD
    @MB
    public <T extends B> T k0(Class<T> cls) {
        return (T) X5(cls, get(cls));
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            X5((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }
}
