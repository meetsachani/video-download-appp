package o;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

@L40("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
@InterfaceC7070ia0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public abstract class Yt2<N> {
    public final InterfaceC5631ch2<N> a;

    /* loaded from: classes3.dex */
    public class a extends Yt2<N> {
        public final /* synthetic */ InterfaceC5631ch2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5631ch2 interfaceC5631ch2, InterfaceC5631ch2 interfaceC5631ch22) {
            super(interfaceC5631ch2, null);
            this.b = interfaceC5631ch22;
        }

        @Override // o.Yt2
        public g<N> i() {
            return g.b(this.b);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends Yt2<N> {
        public final /* synthetic */ InterfaceC5631ch2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC5631ch2 interfaceC5631ch2, InterfaceC5631ch2 interfaceC5631ch22) {
            super(interfaceC5631ch2, null);
            this.b = interfaceC5631ch22;
        }

        @Override // o.Yt2
        public g<N> i() {
            return g.c(this.b);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Iterable<N> {
        public final /* synthetic */ AbstractC9481sO0 X;

        public c(AbstractC9481sO0 abstractC9481sO0) {
            this.X = abstractC9481sO0;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return Yt2.this.i().a(this.X.iterator());
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Iterable<N> {
        public final /* synthetic */ AbstractC9481sO0 X;

        public d(AbstractC9481sO0 abstractC9481sO0) {
            this.X = abstractC9481sO0;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return Yt2.this.i().e(this.X.iterator());
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Iterable<N> {
        public final /* synthetic */ AbstractC9481sO0 X;

        public e(AbstractC9481sO0 abstractC9481sO0) {
            this.X = abstractC9481sO0;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return Yt2.this.i().d(this.X.iterator());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class f {
        public static final f X = new a("FRONT", 0);
        public static final f Y = new b("BACK", 1);
        public static final /* synthetic */ f[] Z = e();

        /* loaded from: classes3.dex */
        public enum a extends f {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Yt2.f
            public <T> void g(Deque<T> deque, T t) {
                deque.addFirst(t);
            }
        }

        /* loaded from: classes3.dex */
        public enum b extends f {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Yt2.f
            public <T> void g(Deque<T> deque, T t) {
                deque.addLast(t);
            }
        }

        public f(String str, int i) {
        }

        public static /* synthetic */ f[] e() {
            return new f[]{X, Y};
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) Z.clone();
        }

        public abstract <T> void g(Deque<T> deque, T t);

        public /* synthetic */ f(String str, int i, a aVar) {
            this(str, i);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class g<N> {
        public final InterfaceC5631ch2<N> a;

        /* loaded from: classes3.dex */
        public class a extends g<N> {
            public final /* synthetic */ Set b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5631ch2 interfaceC5631ch2, Set set) {
                super(interfaceC5631ch2);
                this.b = set;
            }

            @Override // o.Yt2.g
            @MB
            public N g(Deque<Iterator<? extends N>> deque) {
                Iterator<? extends N> first = deque.getFirst();
                while (first.hasNext()) {
                    N next = first.next();
                    Objects.requireNonNull(next);
                    if (this.b.add(next)) {
                        return next;
                    }
                }
                deque.removeFirst();
                return null;
            }
        }

        /* loaded from: classes3.dex */
        public class b extends g<N> {
            public b(InterfaceC5631ch2 interfaceC5631ch2) {
                super(interfaceC5631ch2);
            }

            @Override // o.Yt2.g
            @MB
            public N g(Deque<Iterator<? extends N>> deque) {
                Iterator<? extends N> first = deque.getFirst();
                if (first.hasNext()) {
                    return (N) C10664xF1.E(first.next());
                }
                deque.removeFirst();
                return null;
            }
        }

        /* loaded from: classes3.dex */
        public class c extends AbstractC6437g1<N> {
            public final /* synthetic */ f Y0;
            public final /* synthetic */ Deque Z;

            public c(Deque deque, f fVar) {
                this.Z = deque;
                this.Y0 = fVar;
            }

            @Override // o.AbstractC6437g1
            @MB
            public N b() {
                do {
                    N n = (N) g.this.g(this.Z);
                    if (n != null) {
                        Iterator<? extends N> it = g.this.a.b(n).iterator();
                        if (it.hasNext()) {
                            this.Y0.g(this.Z, it);
                        }
                        return n;
                    }
                } while (!this.Z.isEmpty());
                return c();
            }
        }

        /* loaded from: classes3.dex */
        public class d extends AbstractC6437g1<N> {
            public final /* synthetic */ Deque Y0;
            public final /* synthetic */ Deque Z;

            public d(Deque deque, Deque deque2) {
                this.Z = deque;
                this.Y0 = deque2;
            }

            @Override // o.AbstractC6437g1
            @MB
            public N b() {
                while (true) {
                    N n = (N) g.this.g(this.Z);
                    if (n != null) {
                        Iterator<? extends N> it = g.this.a.b(n).iterator();
                        if (!it.hasNext()) {
                            return n;
                        }
                        this.Z.addFirst(it);
                        this.Y0.push(n);
                    } else if (!this.Y0.isEmpty()) {
                        return (N) this.Y0.pop();
                    } else {
                        return c();
                    }
                }
            }
        }

        public g(InterfaceC5631ch2<N> interfaceC5631ch2) {
            this.a = interfaceC5631ch2;
        }

        public static <N> g<N> b(InterfaceC5631ch2<N> interfaceC5631ch2) {
            return new a(interfaceC5631ch2, new HashSet());
        }

        public static <N> g<N> c(InterfaceC5631ch2<N> interfaceC5631ch2) {
            return new b(interfaceC5631ch2);
        }

        public final Iterator<N> a(Iterator<? extends N> it) {
            return f(it, f.Y);
        }

        public final Iterator<N> d(Iterator<? extends N> it) {
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new d(arrayDeque2, arrayDeque);
        }

        public final Iterator<N> e(Iterator<? extends N> it) {
            return f(it, f.X);
        }

        public final Iterator<N> f(Iterator<? extends N> it, f fVar) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new c(arrayDeque, fVar);
        }

        @MB
        public abstract N g(Deque<Iterator<? extends N>> deque);
    }

    public /* synthetic */ Yt2(InterfaceC5631ch2 interfaceC5631ch2, a aVar) {
        this(interfaceC5631ch2);
    }

    public static <N> Yt2<N> g(InterfaceC5631ch2<N> interfaceC5631ch2) {
        return new a(interfaceC5631ch2, interfaceC5631ch2);
    }

    public static <N> Yt2<N> h(InterfaceC5631ch2<N> interfaceC5631ch2) {
        if (interfaceC5631ch2 instanceof InterfaceC6870hl) {
            C10664xF1.e(((InterfaceC6870hl) interfaceC5631ch2).f(), "Undirected graphs can never be trees.");
        }
        if (interfaceC5631ch2 instanceof InterfaceC10802xp1) {
            C10664xF1.e(((InterfaceC10802xp1) interfaceC5631ch2).f(), "Undirected networks can never be trees.");
        }
        return new b(interfaceC5631ch2, interfaceC5631ch2);
    }

    public final Iterable<N> a(Iterable<? extends N> iterable) {
        return new c(j(iterable));
    }

    public final Iterable<N> b(N n) {
        return a(AbstractC9481sO0.Q(n));
    }

    public final Iterable<N> c(Iterable<? extends N> iterable) {
        return new e(j(iterable));
    }

    public final Iterable<N> d(N n) {
        return c(AbstractC9481sO0.Q(n));
    }

    public final Iterable<N> e(Iterable<? extends N> iterable) {
        return new d(j(iterable));
    }

    public final Iterable<N> f(N n) {
        return e(AbstractC9481sO0.Q(n));
    }

    public abstract g<N> i();

    public final AbstractC9481sO0<N> j(Iterable<? extends N> iterable) {
        AbstractC9481sO0<N> F = AbstractC9481sO0.F(iterable);
        AbstractC6237fB2<N> it = F.iterator();
        while (it.hasNext()) {
            this.a.b(it.next());
        }
        return F;
    }

    public Yt2(InterfaceC5631ch2<N> interfaceC5631ch2) {
        this.a = (InterfaceC5631ch2) C10664xF1.E(interfaceC5631ch2);
    }
}
