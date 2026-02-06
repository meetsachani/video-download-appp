package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes4.dex */
public class VF1<E> extends AbstractC8162n0<E> {
    private static final long serialVersionUID = -5259182142076705162L;
    public final KF1<? super E> Y;

    /* loaded from: classes4.dex */
    public static class a<E> {
        public final KF1<? super E> a;
        public final List<E> b = new ArrayList();
        public final List<E> c = new ArrayList();

        public a(KF1<? super E> kf1) {
            if (kf1 != null) {
                this.a = kf1;
                return;
            }
            throw new NullPointerException("Predicate must not be null");
        }

        public a<E> a(E e) {
            if (this.a.evaluate(e)) {
                this.b.add(e);
                return this;
            }
            this.c.add(e);
            return this;
        }

        public a<E> b(Collection<? extends E> collection) {
            if (collection != null) {
                for (E e : collection) {
                    a(e);
                }
            }
            return this;
        }

        public InterfaceC2958Fk<E> c() {
            return d(new C7480kG0());
        }

        public InterfaceC2958Fk<E> d(InterfaceC2958Fk<E> interfaceC2958Fk) {
            if (interfaceC2958Fk != null) {
                SF1 l = SF1.l(interfaceC2958Fk, this.a);
                l.addAll(this.b);
                return l;
            }
            throw new NullPointerException("Bag must not be null.");
        }

        public List<E> e() {
            return f(new ArrayList());
        }

        public List<E> f(List<E> list) {
            if (list != null) {
                YF1 r = YF1.r(list, this.a);
                r.addAll(this.b);
                return r;
            }
            throw new NullPointerException("List must not be null.");
        }

        public InterfaceC6135em1<E> g() {
            return h(new C9692tG0());
        }

        public InterfaceC6135em1<E> h(InterfaceC6135em1<E> interfaceC6135em1) {
            if (interfaceC6135em1 != null) {
                C5286bG1 l = C5286bG1.l(interfaceC6135em1, this.a);
                l.addAll(this.b);
                return l;
            }
            throw new NullPointerException("MultiSet must not be null.");
        }

        public Queue<E> i() {
            return j(new LinkedList());
        }

        public Queue<E> j(Queue<E> queue) {
            if (queue != null) {
                C5771dG1 l = C5771dG1.l(queue, this.a);
                l.addAll(this.b);
                return l;
            }
            throw new NullPointerException("queue must not be null");
        }

        public Set<E> k() {
            return l(new HashSet());
        }

        public Set<E> l(Set<E> set) {
            if (set != null) {
                C6013eG1 l = C6013eG1.l(set, this.a);
                l.addAll(this.b);
                return l;
            }
            throw new NullPointerException("Set must not be null.");
        }

        public Collection<E> m() {
            return Collections.unmodifiableCollection(this.c);
        }
    }

    public VF1(Collection<E> collection, KF1<? super E> kf1) {
        super(collection);
        if (kf1 != null) {
            this.Y = kf1;
            for (E e : collection) {
                j(e);
            }
            return;
        }
        throw new NullPointerException("Predicate must not be null.");
    }

    public static <E> a<E> f(KF1<? super E> kf1) {
        return new a<>(kf1);
    }

    public static <E> a<E> h() {
        return new a<>(C10078ur1.b());
    }

    public static <T> VF1<T> i(Collection<T> collection, KF1<? super T> kf1) {
        return new VF1<>(collection, kf1);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean add(E e) {
        j(e);
        return d().add(e);
    }

    @Override // o.AbstractC8162n0, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        for (E e : collection) {
            j(e);
        }
        return d().addAll(collection);
    }

    public void j(E e) {
        if (this.Y.evaluate(e)) {
            return;
        }
        throw new IllegalArgumentException("Cannot add Object '" + e + "' - Predicate '" + this.Y + "' rejected it");
    }
}
