package o;

import java.util.Map;

@InterfaceC7070ia0
/* renamed from: o.b81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5254b81<K, V> extends W71<K, V> {
    @MB
    public volatile transient a<K, V> c;
    @MB
    public volatile transient a<K, V> d;

    /* renamed from: o.b81$a */
    /* loaded from: classes3.dex */
    public static final class a<K, V> {
        public final K a;
        public final V b;

        public a(K k, V v) {
            this.a = k;
            this.b = v;
        }
    }

    public C5254b81(Map<K, V> map) {
        super(map);
    }

    @Override // o.W71
    public void d() {
        super.d();
        this.c = null;
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.W71
    @MB
    public V f(Object obj) {
        C10664xF1.E(obj);
        V g = g(obj);
        if (g != null) {
            return g;
        }
        V h = h(obj);
        if (h != null) {
            l(obj, h);
        }
        return h;
    }

    @Override // o.W71
    @MB
    public V g(@MB Object obj) {
        V v = (V) super.g(obj);
        if (v != null) {
            return v;
        }
        a<K, V> aVar = this.c;
        if (aVar != null && aVar.a == obj) {
            return aVar.b;
        }
        a<K, V> aVar2 = this.d;
        if (aVar2 != null && aVar2.a == obj) {
            m(aVar2);
            return aVar2.b;
        }
        return null;
    }

    public final void l(K k, V v) {
        m(new a<>(k, v));
    }

    public final void m(a<K, V> aVar) {
        this.d = this.c;
        this.c = aVar;
    }
}
