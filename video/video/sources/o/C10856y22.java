package o;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o.AbstractC5317bO0;
import o.AbstractC9481sO0;
import o.C7232jF;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.y22  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10856y22 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.y22$a */
    /* loaded from: classes3.dex */
    public class a<E> extends m<E> {
        public final /* synthetic */ Set X;
        public final /* synthetic */ Set Y;

        /* renamed from: o.y22$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0357a extends AbstractC6437g1<E> {
            public final Iterator<? extends E> Y0;
            public final Iterator<? extends E> Z;

            public C0357a() {
                this.Z = a.this.X.iterator();
                this.Y0 = a.this.Y.iterator();
            }

            @Override // o.AbstractC6437g1
            @MB
            public E b() {
                if (this.Z.hasNext()) {
                    return this.Z.next();
                }
                while (this.Y0.hasNext()) {
                    E next = this.Y0.next();
                    if (!a.this.X.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.X = set;
            this.Y = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (!this.X.contains(obj) && !this.Y.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // o.C10856y22.m
        public <S extends Set<E>> S d(S s) {
            s.addAll(this.X);
            s.addAll(this.Y);
            return s;
        }

        @Override // o.C10856y22.m
        public AbstractC9481sO0<E> e() {
            return new AbstractC9481sO0.a().c(this.X).c(this.Y).e();
        }

        @Override // o.C10856y22.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f */
        public AbstractC6237fB2<E> iterator() {
            return new C0357a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            if (this.X.isEmpty() && this.Y.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.X.size();
            for (E e : this.Y) {
                if (!this.X.contains(e)) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.y22$b */
    /* loaded from: classes3.dex */
    public class b<E> extends m<E> {
        public final /* synthetic */ Set X;
        public final /* synthetic */ Set Y;

        /* renamed from: o.y22$b$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<E> {
            public final Iterator<E> Z;

            public a() {
                this.Z = b.this.X.iterator();
            }

            @Override // o.AbstractC6437g1
            @MB
            public E b() {
                while (this.Z.hasNext()) {
                    E next = this.Z.next();
                    if (b.this.Y.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set, Set set2) {
            super(null);
            this.X = set;
            this.Y = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (this.X.contains(obj) && this.Y.contains(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            if (this.X.containsAll(collection) && this.Y.containsAll(collection)) {
                return true;
            }
            return false;
        }

        @Override // o.C10856y22.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f */
        public AbstractC6237fB2<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.Y, this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (E e : this.X) {
                if (this.Y.contains(e)) {
                    i++;
                }
            }
            return i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.y22$c */
    /* loaded from: classes3.dex */
    public class c<E> extends m<E> {
        public final /* synthetic */ Set X;
        public final /* synthetic */ Set Y;

        /* renamed from: o.y22$c$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<E> {
            public final Iterator<E> Z;

            public a() {
                this.Z = c.this.X.iterator();
            }

            @Override // o.AbstractC6437g1
            @MB
            public E b() {
                while (this.Z.hasNext()) {
                    E next = this.Z.next();
                    if (!c.this.Y.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Set set, Set set2) {
            super(null);
            this.X = set;
            this.Y = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (this.X.contains(obj) && !this.Y.contains(obj)) {
                return true;
            }
            return false;
        }

        @Override // o.C10856y22.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f */
        public AbstractC6237fB2<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.Y.containsAll(this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (E e : this.X) {
                if (!this.Y.contains(e)) {
                    i++;
                }
            }
            return i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.y22$d */
    /* loaded from: classes3.dex */
    public class d<E> extends m<E> {
        public final /* synthetic */ Set X;
        public final /* synthetic */ Set Y;

        /* renamed from: o.y22$d$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<E> {
            public final /* synthetic */ Iterator Y0;
            public final /* synthetic */ Iterator Z;

            public a(Iterator it, Iterator it2) {
                this.Z = it;
                this.Y0 = it2;
            }

            @Override // o.AbstractC6437g1
            @MB
            public E b() {
                while (this.Z.hasNext()) {
                    E e = (E) this.Z.next();
                    if (!d.this.Y.contains(e)) {
                        return e;
                    }
                }
                while (this.Y0.hasNext()) {
                    E e2 = (E) this.Y0.next();
                    if (!d.this.X.contains(e2)) {
                        return e2;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Set set, Set set2) {
            super(null);
            this.X = set;
            this.Y = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return this.Y.contains(obj) ^ this.X.contains(obj);
        }

        @Override // o.C10856y22.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f */
        public AbstractC6237fB2<E> iterator() {
            return new a(this.X.iterator(), this.Y.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.X.equals(this.Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (E e : this.X) {
                if (!this.Y.contains(e)) {
                    i++;
                }
            }
            for (E e2 : this.Y) {
                if (!this.X.contains(e2)) {
                    i++;
                }
            }
            return i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.y22$e */
    /* loaded from: classes3.dex */
    public class e<E> extends AbstractSet<Set<E>> {
        public final /* synthetic */ int X;
        public final /* synthetic */ AbstractC6044eO0 Y;

        /* renamed from: o.y22$e$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<Set<E>> {
            public final BitSet Z;

            /* renamed from: o.y22$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0358a extends AbstractSet<E> {
                public final /* synthetic */ BitSet X;

                /* renamed from: o.y22$e$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public class C0359a extends AbstractC6437g1<E> {
                    public int Z = -1;

                    public C0359a() {
                    }

                    @Override // o.AbstractC6437g1
                    @MB
                    public E b() {
                        int nextSetBit = C0358a.this.X.nextSetBit(this.Z + 1);
                        this.Z = nextSetBit;
                        if (nextSetBit == -1) {
                            return c();
                        }
                        return e.this.Y.keySet().d().get(this.Z);
                    }
                }

                public C0358a(BitSet bitSet) {
                    this.X = bitSet;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@MB Object obj) {
                    Integer num = (Integer) e.this.Y.get(obj);
                    if (num != null && this.X.get(num.intValue())) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C0359a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return e.this.X;
                }
            }

            public a() {
                this.Z = new BitSet(e.this.Y.size());
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public Set<E> b() {
                if (this.Z.isEmpty()) {
                    this.Z.set(0, e.this.X);
                } else {
                    int nextSetBit = this.Z.nextSetBit(0);
                    int nextClearBit = this.Z.nextClearBit(nextSetBit);
                    if (nextClearBit == e.this.Y.size()) {
                        return c();
                    }
                    int i = (nextClearBit - nextSetBit) - 1;
                    this.Z.set(0, i);
                    this.Z.clear(i, nextClearBit);
                    this.Z.set(nextClearBit);
                }
                return new C0358a((BitSet) this.Z.clone());
            }
        }

        public e(int i, AbstractC6044eO0 abstractC6044eO0) {
            this.X = i;
            this.Y = abstractC6044eO0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (set.size() == this.X && this.Y.keySet().containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C9979uR0.a(this.Y.size(), this.X);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.Y.keySet());
            int i = this.X;
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Sets.combinations(");
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(i);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.y22$f */
    /* loaded from: classes3.dex */
    public static final class f<E> extends AbstractC4473Ux0<List<E>> implements Set<List<E>> {
        public final transient AbstractC5317bO0<AbstractC9481sO0<E>> X;
        public final transient C9379rz<E> Y;

        /* renamed from: o.y22$f$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC5317bO0<List<E>> {
            public final /* synthetic */ AbstractC5317bO0 Z;

            public a(AbstractC5317bO0 abstractC5317bO0) {
                this.Z = abstractC5317bO0;
            }

            @Override // o.TN0
            public boolean j() {
                return true;
            }

            @Override // java.util.List
            /* renamed from: p0 */
            public List<E> get(int i) {
                return ((AbstractC9481sO0) this.Z.get(i)).d();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.Z.size();
            }
        }

        public f(AbstractC5317bO0<AbstractC9481sO0<E>> abstractC5317bO0, C9379rz<E> c9379rz) {
            this.X = abstractC5317bO0;
            this.Y = c9379rz;
        }

        public static <E> Set<List<E>> Y5(List<? extends Set<? extends E>> list) {
            AbstractC5317bO0.a aVar = new AbstractC5317bO0.a(list.size());
            for (Set<? extends E> set : list) {
                AbstractC9481sO0 G = AbstractC9481sO0.G(set);
                if (G.isEmpty()) {
                    return AbstractC9481sO0.M();
                }
                aVar.g(G);
            }
            AbstractC5317bO0<E> e = aVar.e();
            return new f(e, new C9379rz(new a(e)));
        }

        @Override // o.AbstractC4473Ux0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Collection<List<E>> L5() {
            return this.Y;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean contains(@MB Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List<E> list = (List) obj;
            if (list.size() != this.X.size()) {
                return false;
            }
            int i = 0;
            for (E e : list) {
                if (!this.X.get(i).contains(e)) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@MB Object obj) {
            if (obj instanceof f) {
                return this.X.equals(((f) obj).X);
            }
            return super.equals(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i = 1;
            int size = size() - 1;
            for (int i2 = 0; i2 < this.X.size(); i2++) {
                size = ~(~(size * 31));
            }
            AbstractC6237fB2<AbstractC9481sO0<E>> it = this.X.iterator();
            while (it.hasNext()) {
                AbstractC9481sO0<E> next = it.next();
                i = ~(~((i * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i + size));
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.y22$g */
    /* loaded from: classes3.dex */
    public static class g<E> extends AbstractC11080yy0<E> {
        public final NavigableSet<E> X;

        public g(NavigableSet<E> navigableSet) {
            this.X = navigableSet;
        }

        public static <T> AbstractC10587ww1<T> p6(Comparator<T> comparator) {
            return AbstractC10587ww1.h(comparator).E();
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        @MB
        public E ceiling(@InterfaceC7894ly1 E e) {
            return this.X.floor(e);
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.X.comparator();
            if (comparator == null) {
                return AbstractC10587ww1.z().E();
            }
            return p6(comparator);
        }

        @Override // o.AbstractC11080yy0, o.AbstractC3305Iy0
        /* renamed from: d6 */
        public NavigableSet<E> b6() {
            return this.X;
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.X.iterator();
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.X;
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        @InterfaceC7894ly1
        public E first() {
            return this.X.last();
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        @MB
        public E floor(@InterfaceC7894ly1 E e) {
            return this.X.ceiling(e);
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        public NavigableSet<E> headSet(@InterfaceC7894ly1 E e, boolean z) {
            return this.X.tailSet(e, z).descendingSet();
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        @MB
        public E higher(@InterfaceC7894ly1 E e) {
            return this.X.lower(e);
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<E> iterator() {
            return this.X.descendingIterator();
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        @InterfaceC7894ly1
        public E last() {
            return this.X.first();
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        @MB
        public E lower(@InterfaceC7894ly1 E e) {
            return this.X.higher(e);
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        @MB
        public E pollFirst() {
            return this.X.pollLast();
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        @MB
        public E pollLast() {
            return this.X.pollFirst();
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        public NavigableSet<E> subSet(@InterfaceC7894ly1 E e, boolean z, @InterfaceC7894ly1 E e2, boolean z2) {
            return this.X.subSet(e2, z2, e, z).descendingSet();
        }

        @Override // o.AbstractC11080yy0, java.util.NavigableSet
        public NavigableSet<E> tailSet(@InterfaceC7894ly1 E e, boolean z) {
            return this.X.headSet(e, z).descendingSet();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return V5();
        }

        @Override // o.AbstractC2510Ay0
        public String toString() {
            return X5();
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public SortedSet<E> headSet(@InterfaceC7894ly1 E e) {
            return h6(e);
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public SortedSet<E> subSet(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
            return c6(e, e2);
        }

        @Override // o.AbstractC3305Iy0, java.util.SortedSet
        public SortedSet<E> tailSet(@InterfaceC7894ly1 E e) {
            return o6(e);
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) W5(tArr);
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.y22$h */
    /* loaded from: classes3.dex */
    public static class h<E> extends j<E> implements NavigableSet<E> {
        public h(NavigableSet<E> navigableSet, IF1<? super E> if1) {
            super(navigableSet, if1);
        }

        @Override // java.util.NavigableSet
        @MB
        public E ceiling(@InterfaceC7894ly1 E e) {
            return (E) C5098aU0.r(e().tailSet(e, true), this.Y, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return C7052iU0.y(e().descendingIterator(), this.Y);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return C10856y22.h(e().descendingSet(), this.Y);
        }

        public NavigableSet<E> e() {
            return (NavigableSet) this.X;
        }

        @Override // java.util.NavigableSet
        @MB
        public E floor(@InterfaceC7894ly1 E e) {
            return (E) C7052iU0.A(e().headSet(e, true).descendingIterator(), this.Y, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@InterfaceC7894ly1 E e, boolean z) {
            return C10856y22.h(e().headSet(e, z), this.Y);
        }

        @Override // java.util.NavigableSet
        @MB
        public E higher(@InterfaceC7894ly1 E e) {
            return (E) C5098aU0.r(e().tailSet(e, false), this.Y, null);
        }

        @Override // o.C10856y22.j, java.util.SortedSet
        @InterfaceC7894ly1
        public E last() {
            return (E) C7052iU0.z(e().descendingIterator(), this.Y);
        }

        @Override // java.util.NavigableSet
        @MB
        public E lower(@InterfaceC7894ly1 E e) {
            return (E) C7052iU0.A(e().headSet(e, false).descendingIterator(), this.Y, null);
        }

        @Override // java.util.NavigableSet
        @MB
        public E pollFirst() {
            return (E) C5098aU0.I(e(), this.Y);
        }

        @Override // java.util.NavigableSet
        @MB
        public E pollLast() {
            return (E) C5098aU0.I(e().descendingSet(), this.Y);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@InterfaceC7894ly1 E e, boolean z, @InterfaceC7894ly1 E e2, boolean z2) {
            return C10856y22.h(e().subSet(e, z, e2, z2), this.Y);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@InterfaceC7894ly1 E e, boolean z) {
            return C10856y22.h(e().tailSet(e, z), this.Y);
        }
    }

    /* renamed from: o.y22$i */
    /* loaded from: classes3.dex */
    public static class i<E> extends C7232jF.a<E> implements Set<E> {
        public i(Set<E> set, IF1<? super E> if1) {
            super(set, if1);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@MB Object obj) {
            return C10856y22.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C10856y22.k(this);
        }
    }

    /* renamed from: o.y22$j */
    /* loaded from: classes3.dex */
    public static class j<E> extends i<E> implements SortedSet<E> {
        public j(SortedSet<E> sortedSet, IF1<? super E> if1) {
            super(sortedSet, if1);
        }

        @Override // java.util.SortedSet
        @MB
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.X).comparator();
        }

        @Override // java.util.SortedSet
        @InterfaceC7894ly1
        public E first() {
            return (E) C7052iU0.z(this.X.iterator(), this.Y);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@InterfaceC7894ly1 E e) {
            return new j(((SortedSet) this.X).headSet(e), this.Y);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
        @InterfaceC7894ly1
        public E last() {
            SortedSet sortedSet = (SortedSet) this.X;
            while (true) {
                ?? r1 = (Object) sortedSet.last();
                if (this.Y.apply(r1)) {
                    return r1;
                }
                sortedSet = sortedSet.headSet(r1);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
            return new j(((SortedSet) this.X).subSet(e, e2), this.Y);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@InterfaceC7894ly1 E e) {
            return new j(((SortedSet) this.X).tailSet(e), this.Y);
        }
    }

    /* renamed from: o.y22$k */
    /* loaded from: classes3.dex */
    public static abstract class k<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return C10856y22.I(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C10664xF1.E(collection));
        }
    }

    /* renamed from: o.y22$l */
    /* loaded from: classes3.dex */
    public static final class l<E> extends AbstractSet<Set<E>> {
        public final AbstractC6044eO0<E, Integer> X;

        /* renamed from: o.y22$l$a */
        /* loaded from: classes3.dex */
        public class a extends Y0<Set<E>> {
            public a(int i) {
                super(i);
            }

            @Override // o.Y0
            /* renamed from: c */
            public Set<E> b(int i) {
                return new n(l.this.X, i);
            }
        }

        public l(Set<E> set) {
            boolean z;
            if (set.size() <= 30) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.k(z, "Too many elements to create power set: %s > 30", set.size());
            this.X = C7935m81.Q(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof Set) {
                return this.X.keySet().containsAll((Set) obj);
            }
            return false;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@MB Object obj) {
            if (obj instanceof l) {
                return this.X.keySet().equals(((l) obj).X.keySet());
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.X.keySet().hashCode() << (this.X.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.X.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 10);
            sb.append("powerSet(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.y22$m */
    /* loaded from: classes3.dex */
    public static abstract class m<E> extends AbstractSet<E> {
        public /* synthetic */ m(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC6181ey
        @J40("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(@InterfaceC7894ly1 E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC6181ey
        @J40("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @J40("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @InterfaceC6181ey
        public <S extends Set<E>> S d(S s) {
            s.addAll(this);
            return s;
        }

        public AbstractC9481sO0<E> e() {
            return AbstractC9481sO0.G(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f */
        public abstract AbstractC6237fB2<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC6181ey
        @J40("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@MB Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC6181ey
        @J40("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC6181ey
        @J40("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public m() {
        }
    }

    /* renamed from: o.y22$n */
    /* loaded from: classes3.dex */
    public static final class n<E> extends AbstractSet<E> {
        public final AbstractC6044eO0<E, Integer> X;
        public final int Y;

        /* renamed from: o.y22$n$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6237fB2<E> {
            public final AbstractC5317bO0<E> X;
            public int Y;

            public a() {
                this.X = n.this.X.keySet().d();
                this.Y = n.this.Y;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.Y != 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public E next() {
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.Y);
                if (numberOfTrailingZeros != 32) {
                    this.Y &= ~(1 << numberOfTrailingZeros);
                    return this.X.get(numberOfTrailingZeros);
                }
                throw new NoSuchElementException();
            }
        }

        public n(AbstractC6044eO0<E, Integer> abstractC6044eO0, int i) {
            this.X = abstractC6044eO0;
            this.Y = i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            Integer num = this.X.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.Y) != 0) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.Y);
        }
    }

    /* renamed from: o.y22$o */
    /* loaded from: classes3.dex */
    public static final class o<E> extends AbstractC3305Iy0<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        public final NavigableSet<E> X;
        public final SortedSet<E> Y;
        @MB
        public transient o<E> Z;

        public o(NavigableSet<E> navigableSet) {
            this.X = (NavigableSet) C10664xF1.E(navigableSet);
            this.Y = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // o.AbstractC3305Iy0, o.AbstractC2804Dy0
        /* renamed from: b6 */
        public SortedSet<E> Y5() {
            return this.Y;
        }

        @Override // java.util.NavigableSet
        @MB
        public E ceiling(@InterfaceC7894ly1 E e) {
            return this.X.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return C7052iU0.e0(this.X.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            o<E> oVar = this.Z;
            if (oVar == null) {
                o<E> oVar2 = new o<>(this.X.descendingSet());
                this.Z = oVar2;
                oVar2.Z = this;
                return oVar2;
            }
            return oVar;
        }

        @Override // java.util.NavigableSet
        @MB
        public E floor(@InterfaceC7894ly1 E e) {
            return this.X.floor(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@InterfaceC7894ly1 E e, boolean z) {
            return C10856y22.O(this.X.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        @MB
        public E higher(@InterfaceC7894ly1 E e) {
            return this.X.higher(e);
        }

        @Override // java.util.NavigableSet
        @MB
        public E lower(@InterfaceC7894ly1 E e) {
            return this.X.lower(e);
        }

        @Override // java.util.NavigableSet
        @MB
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @MB
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@InterfaceC7894ly1 E e, boolean z, @InterfaceC7894ly1 E e2, boolean z2) {
            return C10856y22.O(this.X.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@InterfaceC7894ly1 E e, boolean z) {
            return C10856y22.O(this.X.tailSet(e, z));
        }
    }

    public static <E> LinkedHashSet<E> A() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> B(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> A = A();
        C5098aU0.a(A, iterable);
        return A;
    }

    public static <E> LinkedHashSet<E> C(int i2) {
        return new LinkedHashSet<>(C7935m81.o(i2));
    }

    @Deprecated
    public static <E> Set<E> D(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> E() {
        return new TreeSet<>();
    }

    public static <E extends Comparable> TreeSet<E> F(Iterable<? extends E> iterable) {
        TreeSet<E> E = E();
        C5098aU0.a(E, iterable);
        return E;
    }

    public static <E> TreeSet<E> G(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) C10664xF1.E(comparator));
    }

    @InterfaceC10420wF0(serializable = false)
    public static <E> Set<Set<E>> H(Set<E> set) {
        return new l(set);
    }

    public static boolean I(Set<?> set, Collection<?> collection) {
        C10664xF1.E(collection);
        if (collection instanceof InterfaceC2467Am1) {
            collection = ((InterfaceC2467Am1) collection).n();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return C7052iU0.V(set.iterator(), collection);
        }
        return J(set, collection.iterator());
    }

    public static boolean J(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static <K extends Comparable<? super K>> NavigableSet<K> K(NavigableSet<K> navigableSet, PN1<K> pn1) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (navigableSet.comparator() != null && navigableSet.comparator() != AbstractC10587ww1.z() && pn1.q() && pn1.r()) {
            if (navigableSet.comparator().compare(pn1.y(), pn1.J()) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C10664xF1.e(z2, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (pn1.q() && pn1.r()) {
            K y = pn1.y();
            EnumC6886hp x = pn1.x();
            EnumC6886hp enumC6886hp = EnumC6886hp.CLOSED;
            if (x == enumC6886hp) {
                z = true;
            } else {
                z = false;
            }
            K J = pn1.J();
            if (pn1.I() == enumC6886hp) {
                z3 = true;
            }
            return navigableSet.subSet(y, z, J, z3);
        } else if (pn1.q()) {
            K y2 = pn1.y();
            if (pn1.x() == EnumC6886hp.CLOSED) {
                z3 = true;
            }
            return navigableSet.tailSet(y2, z3);
        } else if (pn1.r()) {
            K J2 = pn1.J();
            if (pn1.I() == EnumC6886hp.CLOSED) {
                z3 = true;
            }
            return navigableSet.headSet(J2, z3);
        } else {
            return (NavigableSet) C10664xF1.E(navigableSet);
        }
    }

    public static <E> m<E> L(Set<? extends E> set, Set<? extends E> set2) {
        C10664xF1.F(set, "set1");
        C10664xF1.F(set2, "set2");
        return new d(set, set2);
    }

    @InterfaceC11149zF0
    public static <E> NavigableSet<E> M(NavigableSet<E> navigableSet) {
        return C9069qj2.q(navigableSet);
    }

    public static <E> m<E> N(Set<? extends E> set, Set<? extends E> set2) {
        C10664xF1.F(set, "set1");
        C10664xF1.F(set2, "set2");
        return new a(set, set2);
    }

    public static <E> NavigableSet<E> O(NavigableSet<E> navigableSet) {
        if (!(navigableSet instanceof TN0)) {
            if (navigableSet instanceof o) {
                return navigableSet;
            }
            return new o(navigableSet);
        }
        return navigableSet;
    }

    public static <B> Set<List<B>> a(List<? extends Set<? extends B>> list) {
        return f.Y5(list);
    }

    @SafeVarargs
    public static <B> Set<List<B>> b(Set<? extends B>... setArr) {
        return a(Arrays.asList(setArr));
    }

    @InterfaceC4238Sm
    public static <E> Set<Set<E>> c(Set<E> set, int i2) {
        boolean z;
        AbstractC6044eO0 Q = C7935m81.Q(set);
        C5037aF.b(i2, "size");
        if (i2 <= Q.size()) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "size (%s) must be <= set.size() (%s)", i2, Q.size());
        if (i2 == 0) {
            return AbstractC9481sO0.Q(AbstractC9481sO0.M());
        }
        if (i2 == Q.size()) {
            return AbstractC9481sO0.Q(Q.keySet());
        }
        return new e(i2, Q);
    }

    public static <E extends Enum<E>> EnumSet<E> d(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        C10664xF1.e(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return o(collection, collection.iterator().next().getDeclaringClass());
    }

    public static <E extends Enum<E>> EnumSet<E> e(Collection<E> collection, Class<E> cls) {
        C10664xF1.E(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return o(collection, cls);
    }

    public static <E> m<E> f(Set<E> set, Set<?> set2) {
        C10664xF1.F(set, "set1");
        C10664xF1.F(set2, "set2");
        return new c(set, set2);
    }

    public static boolean g(Set<?> set, @MB Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @InterfaceC11149zF0
    public static <E> NavigableSet<E> h(NavigableSet<E> navigableSet, IF1<? super E> if1) {
        if (navigableSet instanceof i) {
            i iVar = (i) navigableSet;
            return new h((NavigableSet) iVar.X, C7985mG1.e(iVar.Y, if1));
        }
        return new h((NavigableSet) C10664xF1.E(navigableSet), (IF1) C10664xF1.E(if1));
    }

    public static <E> Set<E> i(Set<E> set, IF1<? super E> if1) {
        if (set instanceof SortedSet) {
            return j((SortedSet) set, if1);
        }
        if (set instanceof i) {
            i iVar = (i) set;
            return new i((Set) iVar.X, C7985mG1.e(iVar.Y, if1));
        }
        return new i((Set) C10664xF1.E(set), (IF1) C10664xF1.E(if1));
    }

    public static <E> SortedSet<E> j(SortedSet<E> sortedSet, IF1<? super E> if1) {
        if (sortedSet instanceof i) {
            i iVar = (i) sortedSet;
            return new j((SortedSet) iVar.X, C7985mG1.e(iVar.Y, if1));
        }
        return new j((SortedSet) C10664xF1.E(sortedSet), (IF1) C10664xF1.E(if1));
    }

    public static int k(Set<?> set) {
        int i2;
        int i3 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i3 = ~(~(i3 + i2));
        }
        return i3;
    }

    @InterfaceC10420wF0(serializable = true)
    public static <E extends Enum<E>> AbstractC9481sO0<E> l(E e2, E... eArr) {
        return XN0.d0(EnumSet.of((Enum) e2, (Enum[]) eArr));
    }

    @InterfaceC10420wF0(serializable = true)
    public static <E extends Enum<E>> AbstractC9481sO0<E> m(Iterable<E> iterable) {
        if (iterable instanceof XN0) {
            return (XN0) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return AbstractC9481sO0.M();
            }
            return XN0.d0(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (it.hasNext()) {
            EnumSet of = EnumSet.of((Enum) it.next());
            C7052iU0.a(of, it);
            return XN0.d0(of);
        }
        return AbstractC9481sO0.M();
    }

    public static <E> m<E> n(Set<E> set, Set<?> set2) {
        C10664xF1.F(set, "set1");
        C10664xF1.F(set2, "set2");
        return new b(set, set2);
    }

    public static <E extends Enum<E>> EnumSet<E> o(Collection<E> collection, Class<E> cls) {
        EnumSet<E> allOf = EnumSet.allOf(cls);
        allOf.removeAll(collection);
        return allOf;
    }

    public static <E> Set<E> p() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> Set<E> q(Iterable<? extends E> iterable) {
        Set<E> p = p();
        C5098aU0.a(p, iterable);
        return p;
    }

    @InterfaceC11149zF0
    public static <E> CopyOnWriteArraySet<E> r() {
        return new CopyOnWriteArraySet<>();
    }

    @InterfaceC11149zF0
    public static <E> CopyOnWriteArraySet<E> s(Iterable<? extends E> iterable) {
        Collection r;
        if (iterable instanceof Collection) {
            r = (Collection) iterable;
        } else {
            r = C10608x11.r(iterable);
        }
        return new CopyOnWriteArraySet<>(r);
    }

    public static <E extends Enum<E>> EnumSet<E> t(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> noneOf = EnumSet.noneOf(cls);
        C5098aU0.a(noneOf, iterable);
        return noneOf;
    }

    public static <E> HashSet<E> u() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> v(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>((Collection) iterable);
        }
        return w(iterable.iterator());
    }

    public static <E> HashSet<E> w(Iterator<? extends E> it) {
        HashSet<E> u = u();
        C7052iU0.a(u, it);
        return u;
    }

    public static <E> HashSet<E> x(E... eArr) {
        HashSet<E> y = y(eArr.length);
        Collections.addAll(y, eArr);
        return y;
    }

    public static <E> HashSet<E> y(int i2) {
        return new HashSet<>(C7935m81.o(i2));
    }

    public static <E> Set<E> z() {
        return Collections.newSetFromMap(C7935m81.b0());
    }
}
