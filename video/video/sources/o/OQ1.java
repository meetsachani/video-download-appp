package o;

import java.util.Map;
import o.QQ1;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class OQ1<K, V> extends RN0<K, V> {
    public static final OQ1<Object, Object> f1 = new OQ1<>();
    @MB
    public final transient Object a1;
    @InterfaceC5299bJ2
    public final transient Object[] b1;
    public final transient int c1;
    public final transient int d1;
    public final transient OQ1<V, K> e1;

    /* JADX WARN: Multi-variable type inference failed */
    public OQ1() {
        this.a1 = null;
        this.b1 = new Object[0];
        this.c1 = 0;
        this.d1 = 0;
        this.e1 = this;
    }

    @Override // o.RN0, o.InterfaceC4626Wm
    /* renamed from: N */
    public RN0<V, K> m5() {
        return this.e1;
    }

    @Override // o.AbstractC6044eO0, java.util.Map
    @MB
    public V get(@MB Object obj) {
        V v = (V) QQ1.L(this.a1, this.b1, this.d1, this.c1, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // o.AbstractC6044eO0
    public AbstractC9481sO0<Map.Entry<K, V>> i() {
        return new QQ1.a(this, this.b1, this.c1, this.d1);
    }

    @Override // o.AbstractC6044eO0
    public AbstractC9481sO0<K> j() {
        return new QQ1.b(this, new QQ1.c(this.b1, this.c1, this.d1));
    }

    @Override // o.AbstractC6044eO0
    public boolean o() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.d1;
    }

    public OQ1(Object[] objArr, int i) {
        this.b1 = objArr;
        this.d1 = i;
        this.c1 = 0;
        int B = i >= 2 ? AbstractC9481sO0.B(i) : 0;
        this.a1 = QQ1.K(objArr, i, B, 0);
        this.e1 = new OQ1<>(QQ1.K(objArr, i, B, 1), objArr, i, this);
    }

    public OQ1(@MB Object obj, Object[] objArr, int i, OQ1<V, K> oq1) {
        this.a1 = obj;
        this.b1 = objArr;
        this.c1 = 1;
        this.d1 = i;
        this.e1 = oq1;
    }
}
