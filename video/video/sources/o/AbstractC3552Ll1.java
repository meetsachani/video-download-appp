package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

@InterfaceC7070ia0
/* renamed from: o.Ll1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3552Ll1<E> extends AbstractSet<E> {
    public final Map<E, ?> X;
    public final Object Y;

    /* renamed from: o.Ll1$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC6437g1<E> {
        public final /* synthetic */ Iterator Z;

        public a(Iterator it) {
            this.Z = it;
        }

        @Override // o.AbstractC6437g1
        @MB
        public E b() {
            while (this.Z.hasNext()) {
                Map.Entry entry = (Map.Entry) this.Z.next();
                if (AbstractC3552Ll1.this.Y.equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return c();
        }
    }

    public AbstractC3552Ll1(Map<E, ?> map, Object obj) {
        this.X = (Map) C10664xF1.E(map);
        this.Y = C10664xF1.E(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        return this.Y.equals(this.X.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public AbstractC6237fB2<E> iterator() {
        return new a(this.X.entrySet().iterator());
    }
}
