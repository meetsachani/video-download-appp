package o;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.Oa0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3800Oa0<C extends Comparable> extends GM<C> {

    @InterfaceC11149zF0
    /* renamed from: o.Oa0$b */
    /* loaded from: classes3.dex */
    public static final class b<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;
        public final W30<C> X;

        private Object readResolve() {
            return new C3800Oa0(this.X);
        }

        public b(W30<C> w30) {
            this.X = w30;
        }
    }

    public C3800Oa0(W30<C> w30) {
        super(w30);
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @InterfaceC11149zF0
    /* renamed from: B0 */
    public AbstractC6237fB2<C> descendingIterator() {
        return C7052iU0.u();
    }

    @Override // o.AbstractC9481sO0
    @InterfaceC11149zF0
    public boolean L() {
        return true;
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        return false;
    }

    @Override // o.AbstractC9481sO0, o.TN0
    public AbstractC5317bO0<C> d() {
        return AbstractC5317bO0.L();
    }

    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    public boolean equals(@MB Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // o.AbstractC10942yO0
    @InterfaceC11149zF0
    public int indexOf(@MB Object obj) {
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // o.TN0
    public boolean j() {
        return false;
    }

    @Override // o.AbstractC10942yO0, o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<C> iterator() {
        return C7052iU0.u();
    }

    @Override // o.GM
    public PN1<C> p1() {
        throw new NoSuchElementException();
    }

    @Override // o.GM
    public PN1<C> q1(EnumC6886hp enumC6886hp, EnumC6886hp enumC6886hp2) {
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // o.GM, java.util.AbstractCollection
    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // o.AbstractC10942yO0, o.AbstractC9481sO0, o.TN0
    @InterfaceC11149zF0
    public Object writeReplace() {
        return new b(this.c1);
    }

    @Override // o.AbstractC10942yO0, java.util.SortedSet
    /* renamed from: y1 */
    public C first() {
        throw new NoSuchElementException();
    }

    @Override // o.GM, o.AbstractC10942yO0
    @InterfaceC11149zF0
    public AbstractC10942yO0<C> z0() {
        return AbstractC10942yO0.E0(AbstractC10587ww1.z().E());
    }

    @Override // o.AbstractC10942yO0, java.util.SortedSet
    /* renamed from: z1 */
    public C last() {
        throw new NoSuchElementException();
    }

    @Override // o.GM
    public GM<C> o1(GM<C> gm) {
        return this;
    }

    @Override // o.GM, o.AbstractC10942yO0
    /* renamed from: n1 */
    public GM<C> H0(C c, boolean z) {
        return this;
    }

    @Override // o.GM, o.AbstractC10942yO0
    /* renamed from: x1 */
    public GM<C> b1(C c, boolean z) {
        return this;
    }

    @Override // o.GM, o.AbstractC10942yO0
    /* renamed from: u1 */
    public GM<C> Y0(C c, boolean z, C c2, boolean z2) {
        return this;
    }
}
