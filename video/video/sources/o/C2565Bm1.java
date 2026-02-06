package o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import o.C10856y22;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Bm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2565Bm1 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.Bm1$a */
    /* loaded from: classes3.dex */
    public class a<E> extends n<E> {
        public final /* synthetic */ InterfaceC2467Am1 Y0;
        public final /* synthetic */ InterfaceC2467Am1 Z;

        /* renamed from: o.Bm1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0164a extends AbstractC6437g1<InterfaceC2467Am1.a<E>> {
            public final /* synthetic */ Iterator Y0;
            public final /* synthetic */ Iterator Z;

            public C0164a(Iterator it, Iterator it2) {
                this.Z = it;
                this.Y0 = it2;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public InterfaceC2467Am1.a<E> b() {
                if (this.Z.hasNext()) {
                    InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) this.Z.next();
                    Object a = aVar.a();
                    return C2565Bm1.k(a, Math.max(aVar.getCount(), a.this.Y0.w4(a)));
                }
                while (this.Y0.hasNext()) {
                    InterfaceC2467Am1.a aVar2 = (InterfaceC2467Am1.a) this.Y0.next();
                    Object a2 = aVar2.a();
                    if (!a.this.Z.contains(a2)) {
                        return C2565Bm1.k(a2, aVar2.getCount());
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2467Am1 interfaceC2467Am1, InterfaceC2467Am1 interfaceC2467Am12) {
            super(null);
            this.Z = interfaceC2467Am1;
            this.Y0 = interfaceC2467Am12;
        }

        @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
        public boolean contains(@MB Object obj) {
            if (!this.Z.contains(obj) && !this.Y0.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // o.AbstractC7180j2
        public Set<E> d() {
            return C10856y22.N(this.Z.n(), this.Y0.n());
        }

        @Override // o.AbstractC7180j2
        public Iterator<E> h() {
            throw new AssertionError("should never be called");
        }

        @Override // o.AbstractC7180j2
        public Iterator<InterfaceC2467Am1.a<E>> i() {
            return new C0164a(this.Z.entrySet().iterator(), this.Y0.entrySet().iterator());
        }

        @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.Z.isEmpty() && this.Y0.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC2467Am1
        public int w4(@MB Object obj) {
            return Math.max(this.Z.w4(obj), this.Y0.w4(obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.Bm1$b */
    /* loaded from: classes3.dex */
    public class b<E> extends n<E> {
        public final /* synthetic */ InterfaceC2467Am1 Y0;
        public final /* synthetic */ InterfaceC2467Am1 Z;

        /* renamed from: o.Bm1$b$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<InterfaceC2467Am1.a<E>> {
            public final /* synthetic */ Iterator Z;

            public a(Iterator it) {
                this.Z = it;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public InterfaceC2467Am1.a<E> b() {
                while (this.Z.hasNext()) {
                    InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) this.Z.next();
                    Object a = aVar.a();
                    int min = Math.min(aVar.getCount(), b.this.Y0.w4(a));
                    if (min > 0) {
                        return C2565Bm1.k(a, min);
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2467Am1 interfaceC2467Am1, InterfaceC2467Am1 interfaceC2467Am12) {
            super(null);
            this.Z = interfaceC2467Am1;
            this.Y0 = interfaceC2467Am12;
        }

        @Override // o.AbstractC7180j2
        public Set<E> d() {
            return C10856y22.n(this.Z.n(), this.Y0.n());
        }

        @Override // o.AbstractC7180j2
        public Iterator<E> h() {
            throw new AssertionError("should never be called");
        }

        @Override // o.AbstractC7180j2
        public Iterator<InterfaceC2467Am1.a<E>> i() {
            return new a(this.Z.entrySet().iterator());
        }

        @Override // o.InterfaceC2467Am1
        public int w4(@MB Object obj) {
            int w4 = this.Z.w4(obj);
            if (w4 == 0) {
                return 0;
            }
            return Math.min(w4, this.Y0.w4(obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.Bm1$c */
    /* loaded from: classes3.dex */
    public class c<E> extends n<E> {
        public final /* synthetic */ InterfaceC2467Am1 Y0;
        public final /* synthetic */ InterfaceC2467Am1 Z;

        /* renamed from: o.Bm1$c$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<InterfaceC2467Am1.a<E>> {
            public final /* synthetic */ Iterator Y0;
            public final /* synthetic */ Iterator Z;

            public a(Iterator it, Iterator it2) {
                this.Z = it;
                this.Y0 = it2;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public InterfaceC2467Am1.a<E> b() {
                if (this.Z.hasNext()) {
                    InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) this.Z.next();
                    Object a = aVar.a();
                    return C2565Bm1.k(a, aVar.getCount() + c.this.Y0.w4(a));
                }
                while (this.Y0.hasNext()) {
                    InterfaceC2467Am1.a aVar2 = (InterfaceC2467Am1.a) this.Y0.next();
                    Object a2 = aVar2.a();
                    if (!c.this.Z.contains(a2)) {
                        return C2565Bm1.k(a2, aVar2.getCount());
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2467Am1 interfaceC2467Am1, InterfaceC2467Am1 interfaceC2467Am12) {
            super(null);
            this.Z = interfaceC2467Am1;
            this.Y0 = interfaceC2467Am12;
        }

        @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
        public boolean contains(@MB Object obj) {
            if (!this.Z.contains(obj) && !this.Y0.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // o.AbstractC7180j2
        public Set<E> d() {
            return C10856y22.N(this.Z.n(), this.Y0.n());
        }

        @Override // o.AbstractC7180j2
        public Iterator<E> h() {
            throw new AssertionError("should never be called");
        }

        @Override // o.AbstractC7180j2
        public Iterator<InterfaceC2467Am1.a<E>> i() {
            return new a(this.Z.entrySet().iterator(), this.Y0.entrySet().iterator());
        }

        @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.Z.isEmpty() && this.Y0.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // o.C2565Bm1.n, java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
        public int size() {
            return C9979uR0.t(this.Z.size(), this.Y0.size());
        }

        @Override // o.InterfaceC2467Am1
        public int w4(@MB Object obj) {
            return this.Z.w4(obj) + this.Y0.w4(obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.Bm1$d */
    /* loaded from: classes3.dex */
    public class d<E> extends n<E> {
        public final /* synthetic */ InterfaceC2467Am1 Y0;
        public final /* synthetic */ InterfaceC2467Am1 Z;

        /* renamed from: o.Bm1$d$a */
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
                    InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) this.Z.next();
                    E e = (E) aVar.a();
                    if (aVar.getCount() > d.this.Y0.w4(e)) {
                        return e;
                    }
                }
                return c();
            }
        }

        /* renamed from: o.Bm1$d$b */
        /* loaded from: classes3.dex */
        public class b extends AbstractC6437g1<InterfaceC2467Am1.a<E>> {
            public final /* synthetic */ Iterator Z;

            public b(Iterator it) {
                this.Z = it;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public InterfaceC2467Am1.a<E> b() {
                while (this.Z.hasNext()) {
                    InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) this.Z.next();
                    Object a = aVar.a();
                    int count = aVar.getCount() - d.this.Y0.w4(a);
                    if (count > 0) {
                        return C2565Bm1.k(a, count);
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2467Am1 interfaceC2467Am1, InterfaceC2467Am1 interfaceC2467Am12) {
            super(null);
            this.Z = interfaceC2467Am1;
            this.Y0 = interfaceC2467Am12;
        }

        @Override // o.C2565Bm1.n, o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // o.C2565Bm1.n, o.AbstractC7180j2
        public int f() {
            return C7052iU0.Z(i());
        }

        @Override // o.AbstractC7180j2
        public Iterator<E> h() {
            return new a(this.Z.entrySet().iterator());
        }

        @Override // o.AbstractC7180j2
        public Iterator<InterfaceC2467Am1.a<E>> i() {
            return new b(this.Z.entrySet().iterator());
        }

        @Override // o.InterfaceC2467Am1
        public int w4(@MB Object obj) {
            int w4 = this.Z.w4(obj);
            if (w4 == 0) {
                return 0;
            }
            return Math.max(0, w4 - this.Y0.w4(obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.Bm1$e */
    /* loaded from: classes3.dex */
    public class e<E> extends AbstractC8375ns2<InterfaceC2467Am1.a<E>, E> {
        public e(Iterator it) {
            super(it);
        }

        @Override // o.AbstractC8375ns2
        @InterfaceC7894ly1
        /* renamed from: c */
        public E b(InterfaceC2467Am1.a<E> aVar) {
            return aVar.a();
        }
    }

    /* renamed from: o.Bm1$f */
    /* loaded from: classes3.dex */
    public static abstract class f<E> implements InterfaceC2467Am1.a<E> {
        @Override // o.InterfaceC2467Am1.a
        public boolean equals(@MB Object obj) {
            if (obj instanceof InterfaceC2467Am1.a) {
                InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) obj;
                if (getCount() == aVar.getCount() && C2593Bt1.a(a(), aVar.a())) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.InterfaceC2467Am1.a
        public int hashCode() {
            int hashCode;
            E a = a();
            if (a == null) {
                hashCode = 0;
            } else {
                hashCode = a.hashCode();
            }
            return hashCode ^ getCount();
        }

        @Override // o.InterfaceC2467Am1.a
        public String toString() {
            String valueOf = String.valueOf(a());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    /* renamed from: o.Bm1$g */
    /* loaded from: classes3.dex */
    public static final class g implements Comparator<InterfaceC2467Am1.a<?>> {
        public static final g X = new g();

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(InterfaceC2467Am1.a<?> aVar, InterfaceC2467Am1.a<?> aVar2) {
            return aVar2.getCount() - aVar.getCount();
        }
    }

    /* renamed from: o.Bm1$h */
    /* loaded from: classes3.dex */
    public static abstract class h<E> extends C10856y22.k<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return i().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return i().containsAll(collection);
        }

        public abstract InterfaceC2467Am1<E> i();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            if (i().v(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().entrySet().size();
        }
    }

    /* renamed from: o.Bm1$i */
    /* loaded from: classes3.dex */
    public static abstract class i<E> extends C10856y22.k<InterfaceC2467Am1.a<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof InterfaceC2467Am1.a) {
                InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) obj;
                if (aVar.getCount() > 0 && i().w4(aVar.a()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        public abstract InterfaceC2467Am1<E> i();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            if (obj instanceof InterfaceC2467Am1.a) {
                InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) obj;
                E e = (E) aVar.a();
                int count = aVar.getCount();
                if (count != 0) {
                    return i().Y3(e, count, 0);
                }
            }
            return false;
        }
    }

    /* renamed from: o.Bm1$j */
    /* loaded from: classes3.dex */
    public static final class j<E> extends n<E> {
        public final IF1<? super E> Y0;
        public final InterfaceC2467Am1<E> Z;

        /* renamed from: o.Bm1$j$a */
        /* loaded from: classes3.dex */
        public class a implements IF1<InterfaceC2467Am1.a<E>> {
            public a() {
            }

            @Override // o.IF1
            /* renamed from: a */
            public boolean apply(InterfaceC2467Am1.a<E> aVar) {
                return j.this.Y0.apply(aVar.a());
            }
        }

        public j(InterfaceC2467Am1<E> interfaceC2467Am1, IF1<? super E> if1) {
            super(null);
            this.Z = (InterfaceC2467Am1) C10664xF1.E(interfaceC2467Am1);
            this.Y0 = (IF1) C10664xF1.E(if1);
        }

        @Override // o.AbstractC7180j2
        public Set<E> d() {
            return C10856y22.i(this.Z.n(), this.Y0);
        }

        @Override // o.AbstractC7180j2
        public Set<InterfaceC2467Am1.a<E>> e() {
            return C10856y22.i(this.Z.entrySet(), new a());
        }

        @Override // o.AbstractC7180j2
        public Iterator<E> h() {
            throw new AssertionError("should never be called");
        }

        @Override // o.AbstractC7180j2
        public Iterator<InterfaceC2467Am1.a<E>> i() {
            throw new AssertionError("should never be called");
        }

        @Override // o.C2565Bm1.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        /* renamed from: j */
        public AbstractC6237fB2<E> iterator() {
            return C7052iU0.y(this.Z.iterator(), this.Y0);
        }

        @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
        public int v(@MB Object obj, int i) {
            C5037aF.b(i, "occurrences");
            if (i == 0) {
                return w4(obj);
            }
            if (contains(obj)) {
                return this.Z.v(obj, i);
            }
            return 0;
        }

        @Override // o.InterfaceC2467Am1
        public int w4(@MB Object obj) {
            int w4 = this.Z.w4(obj);
            if (w4 <= 0 || !this.Y0.apply(obj)) {
                return 0;
            }
            return w4;
        }

        @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
        public int x(@InterfaceC7894ly1 E e, int i) {
            C10664xF1.y(this.Y0.apply(e), "Element %s does not match predicate %s", e, this.Y0);
            return this.Z.x(e, i);
        }
    }

    /* renamed from: o.Bm1$k */
    /* loaded from: classes3.dex */
    public static class k<E> extends f<E> implements Serializable {
        private static final long serialVersionUID = 0;
        @InterfaceC7894ly1
        public final E X;
        public final int Y;

        public k(@InterfaceC7894ly1 E e, int i) {
            this.X = e;
            this.Y = i;
            C5037aF.b(i, "count");
        }

        @Override // o.InterfaceC2467Am1.a
        @InterfaceC7894ly1
        public final E a() {
            return this.X;
        }

        @MB
        public k<E> b() {
            return null;
        }

        @Override // o.InterfaceC2467Am1.a
        public final int getCount() {
            return this.Y;
        }
    }

    /* renamed from: o.Bm1$l */
    /* loaded from: classes3.dex */
    public static final class l<E> implements Iterator<E> {
        public final InterfaceC2467Am1<E> X;
        public final Iterator<InterfaceC2467Am1.a<E>> Y;
        public int Y0;
        @MB
        public InterfaceC2467Am1.a<E> Z;
        public int Z0;
        public boolean a1;

        public l(InterfaceC2467Am1<E> interfaceC2467Am1, Iterator<InterfaceC2467Am1.a<E>> it) {
            this.X = interfaceC2467Am1;
            this.Y = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y0 <= 0 && !this.Y.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public E next() {
            if (hasNext()) {
                if (this.Y0 == 0) {
                    InterfaceC2467Am1.a<E> next = this.Y.next();
                    this.Z = next;
                    int count = next.getCount();
                    this.Y0 = count;
                    this.Z0 = count;
                }
                this.Y0--;
                this.a1 = true;
                InterfaceC2467Am1.a<E> aVar = this.Z;
                Objects.requireNonNull(aVar);
                return aVar.a();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            C5037aF.e(this.a1);
            if (this.Z0 == 1) {
                this.Y.remove();
            } else {
                InterfaceC2467Am1<E> interfaceC2467Am1 = this.X;
                InterfaceC2467Am1.a<E> aVar = this.Z;
                Objects.requireNonNull(aVar);
                interfaceC2467Am1.remove(aVar.a());
            }
            this.Z0--;
            this.a1 = false;
        }
    }

    /* renamed from: o.Bm1$m */
    /* loaded from: classes3.dex */
    public static class m<E> extends AbstractC10594wy0<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final InterfaceC2467Am1<? extends E> X;
        @MB
        public transient Set<E> Y;
        @MB
        public transient Set<InterfaceC2467Am1.a<E>> Z;

        public m(InterfaceC2467Am1<? extends E> interfaceC2467Am1) {
            this.X = interfaceC2467Am1;
        }

        @Override // o.AbstractC10594wy0, o.InterfaceC2467Am1
        public int R(@InterfaceC7894ly1 E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10594wy0, o.InterfaceC2467Am1
        public boolean Y3(@InterfaceC7894ly1 E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10594wy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public InterfaceC2467Am1<E> M5() {
            return (InterfaceC2467Am1<? extends E>) this.X;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean add(@InterfaceC7894ly1 E e) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10594wy0, o.InterfaceC2467Am1
        public Set<InterfaceC2467Am1.a<E>> entrySet() {
            Set<InterfaceC2467Am1.a<E>> set = this.Z;
            if (set == null) {
                Set<InterfaceC2467Am1.a<E>> unmodifiableSet = Collections.unmodifiableSet(this.X.entrySet());
                this.Z = unmodifiableSet;
                return unmodifiableSet;
            }
            return set;
        }

        public Set<E> h6() {
            return Collections.unmodifiableSet(this.X.n());
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<E> iterator() {
            return C7052iU0.e0(this.X.iterator());
        }

        @Override // o.AbstractC10594wy0, o.InterfaceC2467Am1
        public Set<E> n() {
            Set<E> set = this.Y;
            if (set == null) {
                Set<E> h6 = h6();
                this.Y = h6;
                return h6;
            }
            return set;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean remove(@MB Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10594wy0, o.InterfaceC2467Am1
        public int v(@MB Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10594wy0, o.InterfaceC2467Am1
        public int x(@InterfaceC7894ly1 E e, int i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.Bm1$n */
    /* loaded from: classes3.dex */
    public static abstract class n<E> extends AbstractC7180j2<E> {
        public n() {
        }

        @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            n().clear();
        }

        @Override // o.AbstractC7180j2
        public int f() {
            return n().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<E> iterator() {
            return C2565Bm1.n(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
        public int size() {
            return C2565Bm1.o(this);
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> InterfaceC2467Am1<E> A(InterfaceC2467Am1<? extends E> interfaceC2467Am1) {
        if (!(interfaceC2467Am1 instanceof m)) {
            if (interfaceC2467Am1 instanceof AbstractC7269jO0) {
                return interfaceC2467Am1;
            }
            return new m((InterfaceC2467Am1) C10664xF1.E(interfaceC2467Am1));
        }
        return interfaceC2467Am1;
    }

    @InterfaceC4238Sm
    public static <E> InterfaceC5603ca2<E> B(InterfaceC5603ca2<E> interfaceC5603ca2) {
        return new KB2((InterfaceC5603ca2) C10664xF1.E(interfaceC5603ca2));
    }

    public static <E> boolean a(InterfaceC2467Am1<E> interfaceC2467Am1, Collection<? extends E> collection) {
        C10664xF1.E(interfaceC2467Am1);
        C10664xF1.E(collection);
        if (collection instanceof InterfaceC2467Am1) {
            return c(interfaceC2467Am1, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C7052iU0.a(interfaceC2467Am1, collection.iterator());
    }

    public static <E> boolean b(InterfaceC2467Am1<E> interfaceC2467Am1, G1<? extends E> g1) {
        if (g1.isEmpty()) {
            return false;
        }
        g1.j(interfaceC2467Am1);
        return true;
    }

    public static <E> boolean c(InterfaceC2467Am1<E> interfaceC2467Am1, InterfaceC2467Am1<? extends E> interfaceC2467Am12) {
        if (interfaceC2467Am12 instanceof G1) {
            return b(interfaceC2467Am1, (G1) interfaceC2467Am12);
        }
        if (interfaceC2467Am12.isEmpty()) {
            return false;
        }
        for (InterfaceC2467Am1.a<? extends E> aVar : interfaceC2467Am12.entrySet()) {
            interfaceC2467Am1.x(aVar.a(), aVar.getCount());
        }
        return true;
    }

    public static <T> InterfaceC2467Am1<T> d(Iterable<T> iterable) {
        return (InterfaceC2467Am1) iterable;
    }

    @InterfaceC6181ey
    public static boolean e(InterfaceC2467Am1<?> interfaceC2467Am1, InterfaceC2467Am1<?> interfaceC2467Am12) {
        C10664xF1.E(interfaceC2467Am1);
        C10664xF1.E(interfaceC2467Am12);
        for (InterfaceC2467Am1.a<?> aVar : interfaceC2467Am12.entrySet()) {
            if (interfaceC2467Am1.w4(aVar.a()) < aVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4238Sm
    public static <E> AbstractC7269jO0<E> f(InterfaceC2467Am1<E> interfaceC2467Am1) {
        InterfaceC2467Am1.a[] aVarArr = (InterfaceC2467Am1.a[]) interfaceC2467Am1.entrySet().toArray(new InterfaceC2467Am1.a[0]);
        Arrays.sort(aVarArr, g.X);
        return AbstractC7269jO0.r(Arrays.asList(aVarArr));
    }

    @InterfaceC4238Sm
    public static <E> InterfaceC2467Am1<E> g(InterfaceC2467Am1<E> interfaceC2467Am1, InterfaceC2467Am1<?> interfaceC2467Am12) {
        C10664xF1.E(interfaceC2467Am1);
        C10664xF1.E(interfaceC2467Am12);
        return new d(interfaceC2467Am1, interfaceC2467Am12);
    }

    public static <E> Iterator<E> h(Iterator<InterfaceC2467Am1.a<E>> it) {
        return new e(it);
    }

    public static boolean i(InterfaceC2467Am1<?> interfaceC2467Am1, @MB Object obj) {
        if (obj == interfaceC2467Am1) {
            return true;
        }
        if (obj instanceof InterfaceC2467Am1) {
            InterfaceC2467Am1 interfaceC2467Am12 = (InterfaceC2467Am1) obj;
            if (interfaceC2467Am1.size() == interfaceC2467Am12.size() && interfaceC2467Am1.entrySet().size() == interfaceC2467Am12.entrySet().size()) {
                for (InterfaceC2467Am1.a aVar : interfaceC2467Am12.entrySet()) {
                    if (interfaceC2467Am1.w4(aVar.a()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @InterfaceC4238Sm
    public static <E> InterfaceC2467Am1<E> j(InterfaceC2467Am1<E> interfaceC2467Am1, IF1<? super E> if1) {
        if (interfaceC2467Am1 instanceof j) {
            j jVar = (j) interfaceC2467Am1;
            return new j(jVar.Z, C7985mG1.e(jVar.Y0, if1));
        }
        return new j(interfaceC2467Am1, if1);
    }

    public static <E> InterfaceC2467Am1.a<E> k(@InterfaceC7894ly1 E e2, int i2) {
        return new k(e2, i2);
    }

    public static int l(Iterable<?> iterable) {
        if (iterable instanceof InterfaceC2467Am1) {
            return ((InterfaceC2467Am1) iterable).n().size();
        }
        return 11;
    }

    public static <E> InterfaceC2467Am1<E> m(InterfaceC2467Am1<E> interfaceC2467Am1, InterfaceC2467Am1<?> interfaceC2467Am12) {
        C10664xF1.E(interfaceC2467Am1);
        C10664xF1.E(interfaceC2467Am12);
        return new b(interfaceC2467Am1, interfaceC2467Am12);
    }

    public static <E> Iterator<E> n(InterfaceC2467Am1<E> interfaceC2467Am1) {
        return new l(interfaceC2467Am1, interfaceC2467Am1.entrySet().iterator());
    }

    public static int o(InterfaceC2467Am1<?> interfaceC2467Am1) {
        long j2 = 0;
        for (InterfaceC2467Am1.a<?> aVar : interfaceC2467Am1.entrySet()) {
            j2 += aVar.getCount();
        }
        return C7775lT0.x(j2);
    }

    public static boolean p(InterfaceC2467Am1<?> interfaceC2467Am1, Collection<?> collection) {
        if (collection instanceof InterfaceC2467Am1) {
            collection = ((InterfaceC2467Am1) collection).n();
        }
        return interfaceC2467Am1.n().removeAll(collection);
    }

    @InterfaceC6181ey
    public static boolean q(InterfaceC2467Am1<?> interfaceC2467Am1, Iterable<?> iterable) {
        if (iterable instanceof InterfaceC2467Am1) {
            return r(interfaceC2467Am1, (InterfaceC2467Am1) iterable);
        }
        C10664xF1.E(interfaceC2467Am1);
        C10664xF1.E(iterable);
        Iterator<?> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= interfaceC2467Am1.remove(it.next());
        }
        return z;
    }

    @InterfaceC6181ey
    public static boolean r(InterfaceC2467Am1<?> interfaceC2467Am1, InterfaceC2467Am1<?> interfaceC2467Am12) {
        C10664xF1.E(interfaceC2467Am1);
        C10664xF1.E(interfaceC2467Am12);
        Iterator<InterfaceC2467Am1.a<?>> it = interfaceC2467Am1.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC2467Am1.a<?> next = it.next();
            int w4 = interfaceC2467Am12.w4(next.a());
            if (w4 >= next.getCount()) {
                it.remove();
            } else if (w4 > 0) {
                interfaceC2467Am1.v(next.a(), w4);
            }
            z = true;
        }
        return z;
    }

    public static boolean s(InterfaceC2467Am1<?> interfaceC2467Am1, Collection<?> collection) {
        C10664xF1.E(collection);
        if (collection instanceof InterfaceC2467Am1) {
            collection = ((InterfaceC2467Am1) collection).n();
        }
        return interfaceC2467Am1.n().retainAll(collection);
    }

    @InterfaceC6181ey
    public static boolean t(InterfaceC2467Am1<?> interfaceC2467Am1, InterfaceC2467Am1<?> interfaceC2467Am12) {
        return u(interfaceC2467Am1, interfaceC2467Am12);
    }

    public static <E> boolean u(InterfaceC2467Am1<E> interfaceC2467Am1, InterfaceC2467Am1<?> interfaceC2467Am12) {
        C10664xF1.E(interfaceC2467Am1);
        C10664xF1.E(interfaceC2467Am12);
        Iterator<InterfaceC2467Am1.a<E>> it = interfaceC2467Am1.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC2467Am1.a<E> next = it.next();
            int w4 = interfaceC2467Am12.w4(next.a());
            if (w4 == 0) {
                it.remove();
            } else if (w4 < next.getCount()) {
                interfaceC2467Am1.R(next.a(), w4);
            }
            z = true;
        }
        return z;
    }

    public static <E> int v(InterfaceC2467Am1<E> interfaceC2467Am1, @InterfaceC7894ly1 E e2, int i2) {
        C5037aF.b(i2, "count");
        int w4 = interfaceC2467Am1.w4(e2);
        int i3 = i2 - w4;
        if (i3 > 0) {
            interfaceC2467Am1.x(e2, i3);
            return w4;
        }
        if (i3 < 0) {
            interfaceC2467Am1.v(e2, -i3);
        }
        return w4;
    }

    public static <E> boolean w(InterfaceC2467Am1<E> interfaceC2467Am1, @InterfaceC7894ly1 E e2, int i2, int i3) {
        C5037aF.b(i2, "oldCount");
        C5037aF.b(i3, "newCount");
        if (interfaceC2467Am1.w4(e2) == i2) {
            interfaceC2467Am1.R(e2, i3);
            return true;
        }
        return false;
    }

    @InterfaceC4238Sm
    public static <E> InterfaceC2467Am1<E> x(InterfaceC2467Am1<? extends E> interfaceC2467Am1, InterfaceC2467Am1<? extends E> interfaceC2467Am12) {
        C10664xF1.E(interfaceC2467Am1);
        C10664xF1.E(interfaceC2467Am12);
        return new c(interfaceC2467Am1, interfaceC2467Am12);
    }

    @InterfaceC4238Sm
    public static <E> InterfaceC2467Am1<E> y(InterfaceC2467Am1<? extends E> interfaceC2467Am1, InterfaceC2467Am1<? extends E> interfaceC2467Am12) {
        C10664xF1.E(interfaceC2467Am1);
        C10664xF1.E(interfaceC2467Am12);
        return new a(interfaceC2467Am1, interfaceC2467Am12);
    }

    @Deprecated
    public static <E> InterfaceC2467Am1<E> z(AbstractC7269jO0<E> abstractC7269jO0) {
        return (InterfaceC2467Am1) C10664xF1.E(abstractC7269jO0);
    }
}
