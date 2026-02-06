package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.AbstractC5737d8;

@InterfaceC5601ca0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.cF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5522cF<V, C> extends AbstractC5737d8<V, C> {
    @MB
    public List<b<V>> l1;

    /* renamed from: o.cF$a */
    /* loaded from: classes3.dex */
    public static final class a<V> extends AbstractC5522cF<V, List<V>> {
        public a(TN0<? extends InterfaceFutureC8411o11<? extends V>> tn0, boolean z) {
            super(tn0, z);
            U();
        }

        @Override // o.AbstractC5522cF
        /* renamed from: Z */
        public List<V> Y(List<b<V>> list) {
            V v;
            ArrayList u = C10608x11.u(list.size());
            for (b<V> bVar : list) {
                if (bVar != null) {
                    v = bVar.a;
                } else {
                    v = null;
                }
                u.add(v);
            }
            return Collections.unmodifiableList(u);
        }
    }

    /* renamed from: o.cF$b */
    /* loaded from: classes3.dex */
    public static final class b<V> {
        public V a;

        public b(V v) {
            this.a = v;
        }
    }

    public AbstractC5522cF(TN0<? extends InterfaceFutureC8411o11<? extends V>> tn0, boolean z) {
        super(tn0, z, true);
        List<b<V>> u;
        if (tn0.isEmpty()) {
            u = Collections.EMPTY_LIST;
        } else {
            u = C10608x11.u(tn0.size());
        }
        for (int i = 0; i < tn0.size(); i++) {
            u.add(null);
        }
        this.l1 = u;
    }

    @Override // o.AbstractC5737d8
    public final void P(int i, @InterfaceC7165iy1 V v) {
        List<b<V>> list = this.l1;
        if (list != null) {
            list.set(i, new b<>(v));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5737d8
    public final void S() {
        List<b<V>> list = this.l1;
        if (list != null) {
            B(Y(list));
        }
    }

    @Override // o.AbstractC5737d8
    public void X(AbstractC5737d8.a aVar) {
        super.X(aVar);
        this.l1 = null;
    }

    public abstract C Y(List<b<V>> list);
}
