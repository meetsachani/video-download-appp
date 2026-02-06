package o;

import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.x11  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10608x11 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.x11$a */
    /* loaded from: classes3.dex */
    public class a<E> extends g<E> {
        public static final long Y = 0;

        public a(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
            return this.X.listIterator(i);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: o.x11$b */
    /* loaded from: classes3.dex */
    public class b<E> extends c<E> {
        public static final long Y = 0;

        public b(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
            return this.X.listIterator(i);
        }
    }

    /* renamed from: o.x11$c */
    /* loaded from: classes3.dex */
    public static class c<E> extends AbstractList<E> {
        public final List<E> X;

        public c(List<E> list) {
            this.X = (List) C10664xF1.E(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, @InterfaceC7894ly1 E e) {
            this.X.add(i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            return this.X.addAll(i, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            return this.X.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC7894ly1
        public E get(int i) {
            return this.X.get(i);
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC7894ly1
        public E remove(int i) {
            return this.X.remove(i);
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC7894ly1
        public E set(int i, @InterfaceC7894ly1 E e) {
            return this.X.set(i, e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.x11$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractList<Character> {
        public final CharSequence X;

        public d(CharSequence charSequence) {
            this.X = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Character get(int i) {
            C10664xF1.C(i, size());
            return Character.valueOf(this.X.charAt(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.length();
        }
    }

    /* renamed from: o.x11$e */
    /* loaded from: classes3.dex */
    public static class e<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        @InterfaceC7894ly1
        public final E X;
        public final E[] Y;

        public e(@InterfaceC7894ly1 E e, E[] eArr) {
            this.X = e;
            this.Y = (E[]) ((Object[]) C10664xF1.E(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC7894ly1
        public E get(int i) {
            C10664xF1.C(i, size());
            if (i == 0) {
                return this.X;
            }
            return this.Y[i - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return C9979uR0.t(this.Y.length, 1);
        }
    }

    /* renamed from: o.x11$f */
    /* loaded from: classes3.dex */
    public static class f<T> extends AbstractList<List<T>> {
        public final List<T> X;
        public final int Y;

        public f(List<T> list, int i) {
            this.X = list;
            this.Y = i;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public List<T> get(int i) {
            C10664xF1.C(i, size());
            int i2 = this.Y;
            int i3 = i * i2;
            return this.X.subList(i3, Math.min(i2 + i3, this.X.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return C9979uR0.g(this.X.size(), this.Y, RoundingMode.CEILING);
        }
    }

    /* renamed from: o.x11$g */
    /* loaded from: classes3.dex */
    public static class g<E> extends c<E> implements RandomAccess {
        public g(List<E> list) {
            super(list);
        }
    }

    /* renamed from: o.x11$h */
    /* loaded from: classes3.dex */
    public static class h<T> extends f<T> implements RandomAccess {
        public h(List<T> list, int i) {
            super(list, i);
        }
    }

    /* renamed from: o.x11$i */
    /* loaded from: classes3.dex */
    public static class i<T> extends j<T> implements RandomAccess {
        public i(List<T> list) {
            super(list);
        }
    }

    /* renamed from: o.x11$j */
    /* loaded from: classes3.dex */
    public static class j<T> extends AbstractList<T> {
        public final List<T> X;

        /* renamed from: o.x11$j$a */
        /* loaded from: classes3.dex */
        public class a implements ListIterator<T> {
            public boolean X;
            public final /* synthetic */ ListIterator Y;

            public a(ListIterator listIterator) {
                this.Y = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(@InterfaceC7894ly1 T t) {
                this.Y.add(t);
                this.Y.previous();
                this.X = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.Y.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.Y.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            @InterfaceC7894ly1
            public T next() {
                if (hasNext()) {
                    this.X = true;
                    return (T) this.Y.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return j.this.h(this.Y.nextIndex());
            }

            @Override // java.util.ListIterator
            @InterfaceC7894ly1
            public T previous() {
                if (hasPrevious()) {
                    this.X = true;
                    return (T) this.Y.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                C5037aF.e(this.X);
                this.Y.remove();
                this.X = false;
            }

            @Override // java.util.ListIterator
            public void set(@InterfaceC7894ly1 T t) {
                C10664xF1.g0(this.X);
                this.Y.set(t);
            }
        }

        public j(List<T> list) {
            this.X = (List) C10664xF1.E(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, @InterfaceC7894ly1 T t) {
            this.X.add(h(i), t);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.X.clear();
        }

        public List<T> e() {
            return this.X;
        }

        public final int f(int i) {
            int size = size();
            C10664xF1.C(i, size);
            return (size - 1) - i;
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC7894ly1
        public T get(int i) {
            return this.X.get(f(i));
        }

        public final int h(int i) {
            int size = size();
            C10664xF1.d0(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new a(this.X.listIterator(h(i)));
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC7894ly1
        public T remove(int i) {
            return this.X.remove(f(i));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC7894ly1
        public T set(int i, @InterfaceC7894ly1 T t) {
            return this.X.set(f(i), t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            return C10608x11.B(this.X.subList(h(i2), h(i)));
        }
    }

    /* renamed from: o.x11$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC5317bO0<Character> {
        public final String Z;

        public k(String str) {
            this.Z = str;
        }

        @Override // o.AbstractC5317bO0, java.util.List
        public int indexOf(@MB Object obj) {
            if (obj instanceof Character) {
                return this.Z.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // o.TN0
        public boolean j() {
            return false;
        }

        @Override // o.AbstractC5317bO0, java.util.List
        public int lastIndexOf(@MB Object obj) {
            if (obj instanceof Character) {
                return this.Z.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // o.AbstractC5317bO0, java.util.List
        /* renamed from: m0 */
        public AbstractC5317bO0<Character> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            return C10608x11.h(this.Z.substring(i, i2));
        }

        @Override // java.util.List
        /* renamed from: p0 */
        public Character get(int i) {
            C10664xF1.C(i, size());
            return Character.valueOf(this.Z.charAt(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z.length();
        }
    }

    /* renamed from: o.x11$l */
    /* loaded from: classes3.dex */
    public static class l<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> X;
        public final YA0<? super F, ? extends T> Y;

        /* renamed from: o.x11$l$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC9105qs2<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // o.AbstractC8375ns2
            public T b(F f) {
                return l.this.Y.apply(f);
            }
        }

        public l(List<F> list, YA0<? super F, ? extends T> ya0) {
            this.X = (List) C10664xF1.E(list);
            this.Y = (YA0) C10664xF1.E(ya0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC7894ly1
        public T get(int i) {
            return this.Y.apply((F) this.X.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new a(this.X.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.Y.apply((F) this.X.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.x11$m */
    /* loaded from: classes3.dex */
    public static class m<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> X;
        public final YA0<? super F, ? extends T> Y;

        /* renamed from: o.x11$m$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC9105qs2<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // o.AbstractC8375ns2
            @InterfaceC7894ly1
            public T b(@InterfaceC7894ly1 F f) {
                return m.this.Y.apply(f);
            }
        }

        public m(List<F> list, YA0<? super F, ? extends T> ya0) {
            this.X = (List) C10664xF1.E(list);
            this.Y = (YA0) C10664xF1.E(ya0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new a(this.X.listIterator(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.x11$n */
    /* loaded from: classes3.dex */
    public static class n<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        @InterfaceC7894ly1
        public final E X;
        @InterfaceC7894ly1
        public final E Y;
        public final E[] Z;

        public n(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2, E[] eArr) {
            this.X = e;
            this.Y = e2;
            this.Z = (E[]) ((Object[]) C10664xF1.E(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC7894ly1
        public E get(int i) {
            if (i != 0) {
                if (i != 1) {
                    C10664xF1.C(i, size());
                    return this.Z[i - 2];
                }
                return this.Y;
            }
            return this.X;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return C9979uR0.t(this.Z.length, 2);
        }
    }

    public static <T> List<List<T>> A(List<T> list, int i2) {
        boolean z;
        C10664xF1.E(list);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        if (list instanceof RandomAccess) {
            return new h(list, i2);
        }
        return new f(list, i2);
    }

    public static <T> List<T> B(List<T> list) {
        if (list instanceof AbstractC5317bO0) {
            return ((AbstractC5317bO0) list).j0();
        }
        if (list instanceof j) {
            return ((j) list).e();
        }
        if (list instanceof RandomAccess) {
            return new i(list);
        }
        return new j(list);
    }

    public static <E> List<E> C(List<E> list, int i2, int i3) {
        List bVar;
        if (list instanceof RandomAccess) {
            bVar = new a(list);
        } else {
            bVar = new b(list);
        }
        return bVar.subList(i2, i3);
    }

    public static <F, T> List<T> D(List<F> list, YA0<? super F, ? extends T> ya0) {
        if (list instanceof RandomAccess) {
            return new l(list, ya0);
        }
        return new m(list, ya0);
    }

    public static <E> boolean a(List<E> list, int i2, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i2);
        boolean z = false;
        for (E e2 : iterable) {
            listIterator.add(e2);
            z = true;
        }
        return z;
    }

    public static <E> List<E> b(@InterfaceC7894ly1 E e2, @InterfaceC7894ly1 E e3, E[] eArr) {
        return new n(e2, e3, eArr);
    }

    public static <E> List<E> c(@InterfaceC7894ly1 E e2, E[] eArr) {
        return new e(e2, eArr);
    }

    public static <B> List<List<B>> d(List<? extends List<? extends B>> list) {
        return C9379rz.f(list);
    }

    @SafeVarargs
    public static <B> List<List<B>> e(List<? extends B>... listArr) {
        return d(Arrays.asList(listArr));
    }

    public static <T> List<T> f(Iterable<T> iterable) {
        return (List) iterable;
    }

    @InterfaceC4238Sm
    public static List<Character> g(CharSequence charSequence) {
        return new d((CharSequence) C10664xF1.E(charSequence));
    }

    public static AbstractC5317bO0<Character> h(String str) {
        return new k((String) C10664xF1.E(str));
    }

    @InterfaceC5299bJ2
    public static int i(int i2) {
        C5037aF.b(i2, "arraySize");
        return C7775lT0.x(i2 + 5 + (i2 / 10));
    }

    public static boolean j(List<?> list, @MB Object obj) {
        if (obj == C10664xF1.E(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i2 = 0; i2 < size; i2++) {
                if (!C2593Bt1.a(list.get(i2), list2.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        return C7052iU0.t(list.iterator(), list2.iterator());
    }

    public static int k(List<?> list) {
        int hashCode;
        int i2 = 1;
        for (Object obj : list) {
            int i3 = i2 * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i2 = ~(~(i3 + hashCode));
        }
        return i2;
    }

    public static int l(List<?> list, @MB Object obj) {
        if (list instanceof RandomAccess) {
            return m(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C2593Bt1.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int m(List<?> list, @MB Object obj) {
        int size = list.size();
        int i2 = 0;
        if (obj == null) {
            while (i2 < size) {
                if (list.get(i2) == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i2 < size) {
            if (obj.equals(list.get(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int n(List<?> list, @MB Object obj) {
        if (list instanceof RandomAccess) {
            return o(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C2593Bt1.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int o(List<?> list, @MB Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ListIterator<E> p(List<E> list, int i2) {
        return new c(list).listIterator(i2);
    }

    @InterfaceC10420wF0(serializable = true)
    public static <E> ArrayList<E> q() {
        return new ArrayList<>();
    }

    @InterfaceC10420wF0(serializable = true)
    public static <E> ArrayList<E> r(Iterable<? extends E> iterable) {
        C10664xF1.E(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return s(iterable.iterator());
    }

    @InterfaceC10420wF0(serializable = true)
    public static <E> ArrayList<E> s(Iterator<? extends E> it) {
        ArrayList<E> q = q();
        C7052iU0.a(q, it);
        return q;
    }

    @SafeVarargs
    @InterfaceC10420wF0(serializable = true)
    public static <E> ArrayList<E> t(E... eArr) {
        C10664xF1.E(eArr);
        ArrayList<E> arrayList = new ArrayList<>(i(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @InterfaceC10420wF0(serializable = true)
    public static <E> ArrayList<E> u(int i2) {
        C5037aF.b(i2, "initialArraySize");
        return new ArrayList<>(i2);
    }

    @InterfaceC10420wF0(serializable = true)
    public static <E> ArrayList<E> v(int i2) {
        return new ArrayList<>(i(i2));
    }

    @InterfaceC11149zF0
    public static <E> CopyOnWriteArrayList<E> w() {
        return new CopyOnWriteArrayList<>();
    }

    @InterfaceC11149zF0
    public static <E> CopyOnWriteArrayList<E> x(Iterable<? extends E> iterable) {
        Collection r;
        if (iterable instanceof Collection) {
            r = (Collection) iterable;
        } else {
            r = r(iterable);
        }
        return new CopyOnWriteArrayList<>(r);
    }

    @InterfaceC10420wF0(serializable = true)
    public static <E> LinkedList<E> y() {
        return new LinkedList<>();
    }

    @InterfaceC10420wF0(serializable = true)
    public static <E> LinkedList<E> z(Iterable<? extends E> iterable) {
        LinkedList<E> y = y();
        C5098aU0.a(y, iterable);
        return y;
    }
}
