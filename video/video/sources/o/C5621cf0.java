package o;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

@InterfaceC4238Sm
@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.cf0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5621cf0<E> extends AbstractC2706Cy0<E> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Queue<E> X;
    @InterfaceC5299bJ2
    public final int Y;

    public C5621cf0(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "maxSize (%s) must >= 0", i);
        this.X = new ArrayDeque(i);
        this.Y = i;
    }

    public static <E> C5621cf0<E> c6(int i) {
        return new C5621cf0<>(i);
    }

    @Override // o.AbstractC2706Cy0, o.AbstractC4473Ux0
    /* renamed from: Y5 */
    public Queue<E> M5() {
        return this.X;
    }

    @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public boolean add(E e) {
        C10664xF1.E(e);
        if (this.Y == 0) {
            return true;
        }
        if (size() == this.Y) {
            this.X.remove();
        }
        this.X.add(e);
        return true;
    }

    @Override // o.AbstractC4473Ux0, java.util.Collection
    @InterfaceC6181ey
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size >= this.Y) {
            clear();
            return C5098aU0.a(this, C5098aU0.N(collection, size - this.Y));
        }
        return N5(collection);
    }

    @Override // o.AbstractC2706Cy0, java.util.Queue
    @InterfaceC6181ey
    public boolean offer(E e) {
        return add(e);
    }

    public int remainingCapacity() {
        return this.Y - size();
    }

    @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return super.toArray();
    }
}
