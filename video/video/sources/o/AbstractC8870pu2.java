package o;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@Deprecated
@InterfaceC6329fa0
@InterfaceC4238Sm
@InterfaceC10420wF0
/* renamed from: o.pu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8870pu2<T> {

    /* renamed from: o.pu2$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC8870pu2<T> {
        public final /* synthetic */ YA0 a;

        public a(YA0 ya0) {
            this.a = ya0;
        }

        @Override // o.AbstractC8870pu2
        public Iterable<T> b(T t) {
            return (Iterable) this.a.apply(t);
        }
    }

    /* renamed from: o.pu2$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC10343vw0<T> {
        public final /* synthetic */ Object Y;

        public b(Object obj) {
            this.Y = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* renamed from: r0 */
        public AbstractC6237fB2<T> iterator() {
            return AbstractC8870pu2.this.e(this.Y);
        }
    }

    /* renamed from: o.pu2$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC10343vw0<T> {
        public final /* synthetic */ Object Y;

        public c(Object obj) {
            this.Y = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* renamed from: r0 */
        public AbstractC6237fB2<T> iterator() {
            return AbstractC8870pu2.this.c(this.Y);
        }
    }

    /* renamed from: o.pu2$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC10343vw0<T> {
        public final /* synthetic */ Object Y;

        public d(Object obj) {
            this.Y = obj;
        }

        @Override // java.lang.Iterable
        /* renamed from: r0 */
        public AbstractC6237fB2<T> iterator() {
            return new e(this.Y);
        }
    }

    /* renamed from: o.pu2$e */
    /* loaded from: classes3.dex */
    public final class e extends AbstractC6237fB2<T> implements InterfaceC8699pC1<T> {
        public final Queue<T> X;

        public e(T t) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.X = arrayDeque;
            arrayDeque.add(t);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.X.isEmpty();
        }

        @Override // java.util.Iterator, o.InterfaceC8699pC1
        public T next() {
            T remove = this.X.remove();
            C5098aU0.a(this.X, AbstractC8870pu2.this.b(remove));
            return remove;
        }

        @Override // o.InterfaceC8699pC1
        public T peek() {
            return this.X.element();
        }
    }

    /* renamed from: o.pu2$f */
    /* loaded from: classes3.dex */
    public final class f extends AbstractC6437g1<T> {
        public final ArrayDeque<g<T>> Z;

        public f(T t) {
            ArrayDeque<g<T>> arrayDeque = new ArrayDeque<>();
            this.Z = arrayDeque;
            arrayDeque.addLast(e(t));
        }

        @Override // o.AbstractC6437g1
        @MB
        public T b() {
            while (!this.Z.isEmpty()) {
                g<T> last = this.Z.getLast();
                if (last.b.hasNext()) {
                    this.Z.addLast(e(last.b.next()));
                } else {
                    this.Z.removeLast();
                    return last.a;
                }
            }
            return c();
        }

        public final g<T> e(T t) {
            return new g<>(t, AbstractC8870pu2.this.b(t).iterator());
        }
    }

    /* renamed from: o.pu2$g */
    /* loaded from: classes3.dex */
    public static final class g<T> {
        public final T a;
        public final Iterator<T> b;

        public g(T t, Iterator<T> it) {
            this.a = (T) C10664xF1.E(t);
            this.b = (Iterator) C10664xF1.E(it);
        }
    }

    /* renamed from: o.pu2$h */
    /* loaded from: classes3.dex */
    public final class h extends AbstractC6237fB2<T> {
        public final Deque<Iterator<T>> X;

        public h(T t) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.X = arrayDeque;
            arrayDeque.addLast(C7052iU0.Y(C10664xF1.E(t)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.X.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.X.getLast();
            T t = (T) C10664xF1.E(last.next());
            if (!last.hasNext()) {
                this.X.removeLast();
            }
            Iterator<T> it = AbstractC8870pu2.this.b(t).iterator();
            if (it.hasNext()) {
                this.X.addLast(it);
            }
            return t;
        }
    }

    @Deprecated
    public static <T> AbstractC8870pu2<T> g(YA0<T, ? extends Iterable<T>> ya0) {
        C10664xF1.E(ya0);
        return new a(ya0);
    }

    @Deprecated
    public final AbstractC10343vw0<T> a(T t) {
        C10664xF1.E(t);
        return new d(t);
    }

    public abstract Iterable<T> b(T t);

    public AbstractC6237fB2<T> c(T t) {
        return new f(t);
    }

    @Deprecated
    public final AbstractC10343vw0<T> d(T t) {
        C10664xF1.E(t);
        return new c(t);
    }

    public AbstractC6237fB2<T> e(T t) {
        return new h(t);
    }

    @Deprecated
    public final AbstractC10343vw0<T> f(T t) {
        C10664xF1.E(t);
        return new b(t);
    }
}
