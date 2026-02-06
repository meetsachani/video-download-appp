package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,526:1\n1#2:527\n*E\n"})
/* renamed from: o.nF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8222nF extends C7979mF {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Incorrect field signature: TK; */
    /* renamed from: o.nF$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements HA0<T, Integer> {
        public final /* synthetic */ HA0<T, K> X;
        public final /* synthetic */ Comparable Y;

        /* JADX WARN: Incorrect types in method signature: (Lo/HA0<-TT;+TK;>;TK;)V */
        public a(HA0 ha0, Comparable comparable) {
            this.X = ha0;
            this.Y = comparable;
        }

        @Override // o.HA0
        /* renamed from: c */
        public final Integer invoke(T t) {
            return Integer.valueOf(C11156zH.l((Comparable) this.X.invoke(t), this.Y));
        }
    }

    public static final <T, K extends Comparable<? super K>> int A(@NotNull List<? extends T> list, @Nullable K k, int i, int i2, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "selector");
        return u(list, i, i2, new a(ha0, k));
    }

    public static /* synthetic */ int B(List list, Comparable comparable, int i, int i2, HA0 ha0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "selector");
        return u(list, i, i2, new a(ha0, comparable));
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final <E> List<E> C(int i, @InterfaceC5183ar HA0<? super List<E>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        List j = C7979mF.j(i);
        ha0.invoke(j);
        return C7979mF.a(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final <E> List<E> D(@InterfaceC5183ar HA0<? super List<E>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        List i = C7979mF.i();
        ha0.invoke(i);
        return C7979mF.a(i);
    }

    @NotNull
    public static final Object[] E(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "collection");
        int i = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @NotNull
    public static final <T> T[] F(@NotNull Collection<?> collection, @NotNull T[] tArr) {
        C6562gT0.p(collection, "collection");
        C6562gT0.p(tArr, "array");
        int i = 0;
        if (collection.isEmpty()) {
            return (T[]) C7979mF.n(0, tArr);
        }
        int length = tArr.length;
        T[] tArr2 = tArr;
        if (length < collection.size()) {
            tArr2 = (T[]) C4594We.a(tArr, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            tArr2[i] = it.next();
            i++;
        }
        return (T[]) C7979mF.n(collection.size(), tArr2);
    }

    @XP0
    public static final <T> boolean G(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(collection2, "elements");
        return collection.containsAll(collection2);
    }

    @NotNull
    public static <T> List<T> H() {
        return C4773Ya0.X;
    }

    @NotNull
    public static C11197zR0 I(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "<this>");
        return new C11197zR0(0, collection.size() - 1);
    }

    public static <T> int J(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lo/FA0<+TR;>;)TR; */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final Object K(Collection collection, FA0 fa0) {
        C6562gT0.p(fa0, "defaultValue");
        if (collection.isEmpty()) {
            return fa0.invoke();
        }
        return collection;
    }

    @XP0
    public static final <T> boolean L(Collection<? extends T> collection) {
        C6562gT0.p(collection, "<this>");
        return !collection.isEmpty();
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> boolean M(Collection<? extends T> collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    @XP0
    public static final <T> List<T> N() {
        return H();
    }

    @NotNull
    public static <T> List<T> O(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        if (tArr.length > 0) {
            return C4788Ye.t(tArr);
        }
        return H();
    }

    @NotNull
    public static final <T> List<T> P(@Nullable T t) {
        if (t != null) {
            return C7979mF.k(t);
        }
        return H();
    }

    @NotNull
    public static <T> List<T> Q(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        return C7330jf.cb(tArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> List<T> R() {
        return new ArrayList();
    }

    @NotNull
    public static <T> List<T> S(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C4891Zd(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> T(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return C7979mF.k(list.get(0));
        }
        return H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <T> Collection<T> U(Collection<? extends T> collection) {
        if (collection == 0) {
            return H();
        }
        return collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <T> List<T> V(List<? extends T> list) {
        if (list == 0) {
            return H();
        }
        return list;
    }

    public static final void W(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 >= 0) {
                if (i3 <= i) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <T> List<T> X(@NotNull Iterable<? extends T> iterable, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        List<T> a6 = C10662xF.a6(iterable);
        C10662xF.h5(a6, abstractC10696xN1);
        return a6;
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static void Y() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static void Z() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> List<T> p(int i, HA0<? super Integer, ? extends T> ha0) {
        C6562gT0.p(ha0, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(ha0.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> List<T> q(int i, HA0<? super Integer, ? extends T> ha0) {
        C6562gT0.p(ha0, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(ha0.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> ArrayList<T> r() {
        return new ArrayList<>();
    }

    @NotNull
    public static <T> ArrayList<T> s(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C4891Zd(tArr, true));
    }

    @NotNull
    public static final <T> Collection<T> t(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return new C4891Zd(tArr, false);
    }

    public static final <T> int u(@NotNull List<? extends T> list, int i, int i2, @NotNull HA0<? super T, Integer> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "comparison");
        W(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = ha0.invoke((T) list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }

    public static final <T extends Comparable<? super T>> int v(@NotNull List<? extends T> list, @Nullable T t, int i, int i2) {
        C6562gT0.p(list, "<this>");
        W(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int l = C11156zH.l(list.get(i4), t);
            if (l < 0) {
                i = i4 + 1;
            } else if (l > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }

    public static final <T> int w(@NotNull List<? extends T> list, T t, @NotNull Comparator<? super T> comparator, int i, int i2) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(comparator, "comparator");
        W(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare((T) list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int x(List list, int i, int i2, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return u(list, i, i2, ha0);
    }

    public static /* synthetic */ int y(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return v(list, comparable, i, i2);
    }

    public static /* synthetic */ int z(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return w(list, obj, comparator, i, i2);
    }
}
