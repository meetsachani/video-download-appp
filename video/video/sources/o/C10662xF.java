package o;

import com.facebook.internal.H;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import o.C11156zH;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3800:1\n295#1,2:3801\n528#1,7:3803\n543#1,6:3810\n865#1,2:3817\n796#1:3819\n1878#1,2:3820\n797#1,2:3822\n1880#1:3824\n799#1:3825\n1878#1,3:3826\n817#1,2:3829\n855#1,2:3831\n1267#1,4:3841\n1236#1,4:3845\n1252#1,4:3849\n1299#1,4:3853\n1460#1,5:3857\n1475#1,5:3862\n1516#1,3:3867\n1519#1,3:3877\n1534#1,3:3880\n1537#1,3:3890\n1634#1,3:3907\n1604#1,4:3910\n1593#1:3914\n1878#1,2:3915\n1880#1:3918\n1594#1:3919\n1878#1,3:3920\n1625#1:3923\n1869#1:3924\n1870#1:3926\n1626#1:3927\n1869#1,2:3928\n1878#1,3:3930\n2967#1,3:3933\n2970#1,6:3937\n2992#1,3:3943\n2995#1,7:3947\n865#1,2:3954\n827#1:3956\n855#1,2:3957\n827#1:3959\n855#1,2:3960\n827#1:3962\n855#1,2:3963\n3522#1,8:3969\n3550#1,7:3977\n3581#1,10:3984\n1#2:3816\n1#2:3917\n1#2:3925\n1#2:3936\n1#2:3946\n37#3:3833\n36#3,3:3834\n37#3:3837\n36#3,3:3838\n384#4,7:3870\n384#4,7:3883\n384#4,7:3893\n384#4,7:3900\n32#5,2:3965\n32#5,2:3967\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n174#1:3801,2\n184#1:3803,7\n194#1:3810,6\n774#1:3817,2\n785#1:3819\n785#1:3820,2\n785#1:3822,2\n785#1:3824\n785#1:3825\n796#1:3826,3\n808#1:3829,2\n827#1:3831,2\n1194#1:3841,4\n1209#1:3845,4\n1223#1:3849,4\n1286#1:3853,4\n1374#1:3857,5\n1387#1:3862,5\n1491#1:3867,3\n1491#1:3877,3\n1504#1:3880,3\n1504#1:3890,3\n1563#1:3907,3\n1573#1:3910,4\n1583#1:3914\n1583#1:3915,2\n1583#1:3918\n1583#1:3919\n1593#1:3920,3\n1617#1:3923\n1617#1:3924\n1617#1:3926\n1617#1:3927\n1625#1:3928,2\n2767#1:3930,3\n3067#1:3933,3\n3067#1:3937,6\n3084#1:3943,3\n3084#1:3947,7\n3260#1:3954,2\n3268#1:3956\n3268#1:3957,2\n3278#1:3959\n3278#1:3960,2\n3288#1:3962\n3288#1:3963,2\n3511#1:3969,8\n3539#1:3977,7\n3568#1:3984,10\n1583#1:3917\n1617#1:3925\n3067#1:3936\n3084#1:3946\n1042#1:3833\n1042#1:3834,3\n1089#1:3837\n1089#1:3838,3\n1491#1:3870,7\n1504#1:3883,7\n1518#1:3893,7\n1536#1:3900,7\n3456#1:3965,2\n3498#1:3967,2\n*E\n"})
/* renamed from: o.xF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10662xF extends C9930uF {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n3641#2:23\n*E\n"})
    /* renamed from: o.xF$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements B02<T> {
        public final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* renamed from: o.xF$b */
    /* loaded from: classes3.dex */
    public static final class b<K, T> implements UE0<T, K> {
        public final /* synthetic */ Iterable<T> a;
        public final /* synthetic */ HA0<T, K> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Iterable<? extends T> iterable, HA0<? super T, ? extends K> ha0) {
            this.a = iterable;
            this.b = ha0;
        }

        @Override // o.UE0
        public K a(T t) {
            return this.b.invoke(t);
        }

        @Override // o.UE0
        public Iterator<T> b() {
            return this.a.iterator();
        }
    }

    public static final <T> boolean A1(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (ha0.invoke((T) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <T> T A2(Iterable<? extends T> iterable, HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        for (T t2 : iterable) {
            if (ha0.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    @NotNull
    public static final <T, R> List<R> A3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(C8466oF.b0(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ha0.invoke((T) it.next()));
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, C extends Iterable<? extends T>> C A4(@NotNull C c, @NotNull VA0<? super Integer, ? super T, C7458kA2> va0) {
        C6562gT0.p(c, "<this>");
        C6562gT0.p(va0, "action");
        int i = 0;
        for (T t : c) {
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            va0.i(Integer.valueOf(i), t);
            i = i2;
        }
        return c;
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final <T> double A5(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Double> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ha0.invoke((T) it.next()).doubleValue();
        }
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <T> Iterable<T> B1(Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        return iterable;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @XP0
    public static final <T> T B2(List<? extends T> list, HA0<? super T, Boolean> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (ha0.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @NotNull
    public static final <T, R> List<R> B3(@NotNull Iterable<? extends T> iterable, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(C8466oF.b0(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            arrayList.add(va0.i(Integer.valueOf(i), obj));
            i = i2;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> C4180Rx1<List<T>, List<T>> B4(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (ha0.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    @InterfaceC8046mW0(name = "sumOfByte")
    public static final int B5(@NotNull Iterable<Byte> iterable) {
        C6562gT0.p(iterable, "<this>");
        int i = 0;
        for (Byte b2 : iterable) {
            i += b2.byteValue();
        }
        return i;
    }

    @NotNull
    public static <T> B02<T> C1(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        return new a(iterable);
    }

    public static final <T> T C2(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) E2((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @NotNull
    public static final <T, R> List<R> C3(@NotNull Iterable<? extends T> iterable, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            R i3 = va0.i(Integer.valueOf(i), obj);
            if (i3 != null) {
                arrayList.add(i3);
            }
            i = i2;
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> C4(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(iterable2, "elements");
        if (iterable instanceof Collection) {
            return G4((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        C9444sF.q0(arrayList, iterable);
        C9444sF.q0(arrayList, iterable2);
        return arrayList;
    }

    @InterfaceC8046mW0(name = "sumOfDouble")
    public static final double C5(@NotNull Iterable<Double> iterable) {
        C6562gT0.p(iterable, "<this>");
        double d = 0.0d;
        for (Double d2 : iterable) {
            d += d2.doubleValue();
        }
        return d;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> D1(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(C8466oF.b0(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke((T) it.next());
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T D2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : iterable) {
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C D3(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            R i3 = va0.i(Integer.valueOf(i), obj);
            if (i3 != null) {
                c.add(i3);
            }
            i = i2;
        }
        return c;
    }

    @NotNull
    public static final <T> List<T> D4(@NotNull Iterable<? extends T> iterable, T t) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return H4((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        C9444sF.q0(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> double D5(Iterable<? extends T> iterable, HA0<? super T, Double> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ha0.invoke((T) it.next()).doubleValue();
        }
        return d;
    }

    @NotNull
    public static final <T, K> Map<K, T> E1(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(C8466oF.b0(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(ha0.invoke(obj), obj);
        }
        return linkedHashMap;
    }

    public static <T> T E2(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C E3(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            c.add(va0.i(Integer.valueOf(i), obj));
            i = i2;
        }
        return c;
    }

    @NotNull
    public static final <T> List<T> E4(@NotNull Iterable<? extends T> iterable, @NotNull B02<? extends T> b02) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(b02, "elements");
        ArrayList arrayList = new ArrayList();
        C9444sF.q0(arrayList, iterable);
        C9444sF.r0(arrayList, b02);
        return arrayList;
    }

    @InterfaceC8046mW0(name = "sumOfFloat")
    public static final float E5(@NotNull Iterable<Float> iterable) {
        C6562gT0.p(iterable, "<this>");
        float f = 0.0f;
        for (Float f2 : iterable) {
            f += f2.floatValue();
        }
        return f;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> F1(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(C8466oF.b0(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(ha0.invoke(obj), ha02.invoke(obj));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <T, R> R F2(Iterable<? extends T> iterable, HA0<? super T, ? extends R> ha0) {
        R r;
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (true) {
            if (it.hasNext()) {
                r = ha0.invoke((T) it.next());
                if (r != null) {
                    break;
                }
            } else {
                r = null;
                break;
            }
        }
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @NotNull
    public static final <T, R> List<R> F3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> F4(@NotNull Iterable<? extends T> iterable, @NotNull T[] tArr) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(tArr, "elements");
        if (iterable instanceof Collection) {
            return J4((Collection) iterable, tArr);
        }
        ArrayList arrayList = new ArrayList();
        C9444sF.q0(arrayList, iterable);
        C9444sF.s0(arrayList, tArr);
        return arrayList;
    }

    @InterfaceC8046mW0(name = "sumOfInt")
    public static final int F5(@NotNull Iterable<Integer> iterable) {
        C6562gT0.p(iterable, "<this>");
        int i = 0;
        for (Integer num : iterable) {
            i += num.intValue();
        }
        return i;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M G1(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "keySelector");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m.put(ha0.invoke(obj), obj);
        }
        return m;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <T, R> R G2(Iterable<? extends T> iterable, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C G3(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }

    @NotNull
    public static <T> List<T> G4(@NotNull Collection<? extends T> collection, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C9444sF.q0(arrayList2, iterable);
        return arrayList2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> int G5(Iterable<? extends T> iterable, HA0<? super T, Integer> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ha0.invoke((T) it.next()).intValue();
        }
        return i;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M H1(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m.put(ha0.invoke(obj), ha02.invoke(obj));
        }
        return m;
    }

    @Nullable
    public static <T> T H2(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C H3(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(ha0.invoke((T) it.next()));
        }
        return c;
    }

    @NotNull
    public static <T> List<T> H4(@NotNull Collection<? extends T> collection, T t) {
        C6562gT0.p(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    @InterfaceC8046mW0(name = "sumOfLong")
    public static final long H5(@NotNull Iterable<Long> iterable) {
        C6562gT0.p(iterable, "<this>");
        long j = 0;
        for (Long l : iterable) {
            j += l.longValue();
        }
        return j;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M I1(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull HA0<? super T, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke((T) it.next());
            m.put(invoke.e(), invoke.f());
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T I2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : iterable) {
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T I3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = ha0.invoke(next);
        T t2 = next;
        do {
            T next2 = it.next();
            R invoke2 = ha0.invoke(next2);
            t = t2;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                t = next2;
            }
            t2 = t;
        } while (it.hasNext());
        return t;
    }

    @NotNull
    public static final <T> List<T> I4(@NotNull Collection<? extends T> collection, @NotNull B02<? extends T> b02) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(b02, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        C9444sF.r0(arrayList, b02);
        return arrayList;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> long I5(Iterable<? extends T> iterable, HA0<? super T, Long> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ha0.invoke((T) it.next()).longValue();
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> J1(@NotNull Iterable<? extends K> iterable, @NotNull HA0<? super K, ? extends V> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(C8466oF.b0(iterable, 10)), 16));
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            linkedHashMap.put(obj, ha0.invoke(obj));
        }
        return linkedHashMap;
    }

    @Nullable
    public static <T> T J2(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T J3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            R invoke = ha0.invoke(next);
            T t2 = next;
            do {
                T next2 = it.next();
                R invoke2 = ha0.invoke(next2);
                t = t2;
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                    t = next2;
                }
                t2 = t;
            } while (it.hasNext());
            return t;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T> List<T> J4(@NotNull Collection<? extends T> collection, @NotNull T[] tArr) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(tArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        C9444sF.s0(arrayList, tArr);
        return arrayList;
    }

    @InterfaceC8046mW0(name = "sumOfShort")
    public static final int J5(@NotNull Iterable<Short> iterable) {
        C6562gT0.p(iterable, "<this>");
        int i = 0;
        for (Short sh : iterable) {
            i += sh.shortValue();
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M K1(@NotNull Iterable<? extends K> iterable, @NotNull M m, @NotNull HA0<? super K, ? extends V> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "valueSelector");
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            m.put(obj, ha0.invoke(obj));
        }
        return m;
    }

    @NotNull
    public static final <T, R> List<R> K2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C9444sF.q0(arrayList, ha0.invoke((T) it.next()));
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> double K3(Iterable<? extends T> iterable, HA0<? super T, Double> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = ha0.invoke((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ha0.invoke((T) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    public static final <T> List<T> K4(Iterable<? extends T> iterable, T t) {
        C6562gT0.p(iterable, "<this>");
        return D4(iterable, t);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final <T> int K5(Iterable<? extends T> iterable, HA0<? super T, C7162ix2> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        int n = C7162ix2.n(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            n = C7162ix2.n(n + ha0.invoke((T) it.next()).p0());
        }
        return n;
    }

    @InterfaceC8046mW0(name = "averageOfByte")
    public static final double L1(@NotNull Iterable<Byte> iterable) {
        C6562gT0.p(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Byte b2 : iterable) {
            d += b2.byteValue();
            i++;
            if (i < 0) {
                C8222nF.Y();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> List<R> L2(Iterable<? extends T> iterable, VA0<? super Integer, ? super T, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i), obj));
            i = i2;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> float L3(Iterable<? extends T> iterable, HA0<? super T, Float> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = ha0.invoke((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ha0.invoke((T) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    public static final <T> List<T> L4(Collection<? extends T> collection, T t) {
        C6562gT0.p(collection, "<this>");
        return H4(collection, t);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final <T> long L5(Iterable<? extends T> iterable, HA0<? super T, C9860tx2> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        long n = C9860tx2.n(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            n = C9860tx2.n(n + ha0.invoke((T) it.next()).p0());
        }
        return n;
    }

    @InterfaceC8046mW0(name = "averageOfDouble")
    public static final double M1(@NotNull Iterable<Double> iterable) {
        C6562gT0.p(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Double d2 : iterable) {
            d += d2.doubleValue();
            i++;
            if (i < 0) {
                C8222nF.Y();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C M2(Iterable<? extends T> iterable, C c, VA0<? super Integer, ? super T, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            C9444sF.q0(c, va0.i(Integer.valueOf(i), obj));
            i = i2;
        }
        return c;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R M3(Iterable<? extends T> iterable, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke2 = ha0.invoke((T) it.next());
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> T M4(Collection<? extends T> collection) {
        C6562gT0.p(collection, "<this>");
        return (T) N4(collection, AbstractC10696xN1.X);
    }

    @NotNull
    public static final <T> List<T> M5(@NotNull Iterable<? extends T> iterable, int i) {
        C6562gT0.p(iterable, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return C8222nF.H();
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return Y5(iterable);
                }
                if (i == 1) {
                    return C7979mF.k(C2(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (T t : iterable) {
                arrayList.add(t);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C8222nF.T(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @InterfaceC8046mW0(name = "averageOfFloat")
    public static final double N1(@NotNull Iterable<Float> iterable) {
        C6562gT0.p(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Float f : iterable) {
            d += f.floatValue();
            i++;
            if (i < 0) {
                C8222nF.Y();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedSequence")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> List<R> N2(Iterable<? extends T> iterable, VA0<? super Integer, ? super T, ? extends B02<? extends R>> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            C9444sF.r0(arrayList, va0.i(Integer.valueOf(i), obj));
            i = i2;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R N3(Iterable<? extends T> iterable, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = ha0.invoke((T) it.next());
        while (it.hasNext()) {
            R invoke2 = ha0.invoke((T) it.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @InterfaceC6480g82(version = "1.3")
    public static <T> T N4(@NotNull Collection<? extends T> collection, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (!collection.isEmpty()) {
            return (T) i2(collection, abstractC10696xN1.m(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @NotNull
    public static final <T> List<T> N5(@NotNull List<? extends T> list, int i) {
        C6562gT0.p(list, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return C8222nF.H();
            }
            int size = list.size();
            if (i >= size) {
                return Y5(list);
            }
            if (i == 1) {
                return C7979mF.k(s3(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @InterfaceC8046mW0(name = "averageOfInt")
    public static final double O1(@NotNull Iterable<Integer> iterable) {
        C6562gT0.p(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Integer num : iterable) {
            d += num.intValue();
            i++;
            if (i < 0) {
                C8222nF.Y();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedSequenceTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C O2(Iterable<? extends T> iterable, C c, VA0<? super Integer, ? super T, ? extends B02<? extends R>> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            C9444sF.r0(c, va0.i(Integer.valueOf(i), obj));
            i = i2;
        }
        return c;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Double O3(Iterable<? extends T> iterable, HA0<? super T, Double> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ha0.invoke((T) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ha0.invoke((T) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <T> T O4(Collection<? extends T> collection) {
        C6562gT0.p(collection, "<this>");
        return (T) P4(collection, AbstractC10696xN1.X);
    }

    @NotNull
    public static final <T> List<T> O5(@NotNull List<? extends T> list, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "predicate");
        if (list.isEmpty()) {
            return C8222nF.H();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!ha0.invoke((T) listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return C8222nF.H();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return Y5(list);
    }

    @InterfaceC8046mW0(name = "averageOfLong")
    public static final double P1(@NotNull Iterable<Long> iterable) {
        C6562gT0.p(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Long l : iterable) {
            d += l.longValue();
            i++;
            if (i < 0) {
                C8222nF.Y();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapSequence")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> List<R> P2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends B02<? extends R>> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C9444sF.r0(arrayList, ha0.invoke((T) it.next()));
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Float P3(Iterable<? extends T> iterable, HA0<? super T, Float> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ha0.invoke((T) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ha0.invoke((T) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T P4(@NotNull Collection<? extends T> collection, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) i2(collection, abstractC10696xN1.m(collection.size()));
    }

    @NotNull
    public static final <T> List<T> P5(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (!ha0.invoke(obj).booleanValue()) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @InterfaceC8046mW0(name = "averageOfShort")
    public static final double Q1(@NotNull Iterable<Short> iterable) {
        C6562gT0.p(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Short sh : iterable) {
            d += sh.shortValue();
            i++;
            if (i < 0) {
                C8222nF.Y();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapSequenceTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C Q2(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull HA0<? super T, ? extends B02<? extends R>> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C9444sF.r0(c, ha0.invoke((T) it.next()));
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R Q3(Iterable<? extends T> iterable, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (R) ha0.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke = ha0.invoke((T) it.next());
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final <S, T extends S> S Q4(@NotNull Iterable<? extends T> iterable, @NotNull VA0<? super S, ? super T, ? extends S> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = va0.i(next, (T) it.next());
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    @NotNull
    public static final boolean[] Q5(@NotNull Collection<Boolean> collection) {
        C6562gT0.p(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (Boolean bool : collection) {
            zArr[i] = bool.booleanValue();
            i++;
        }
        return zArr;
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> List<List<T>> R1(@NotNull Iterable<? extends T> iterable, int i) {
        C6562gT0.p(iterable, "<this>");
        return g6(iterable, i, i, true);
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C R2(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull HA0<? super T, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C9444sF.q0(c, ha0.invoke((T) it.next()));
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R R3(Iterable<? extends T> iterable, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) ha0.invoke((T) it.next());
        while (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    public static final <S, T extends S> S R4(@NotNull Iterable<? extends T> iterable, @NotNull XA0<? super Integer, ? super S, ? super T, ? extends S> xa0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(xa0, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            int i = 1;
            while (it.hasNext()) {
                int i2 = i + 1;
                if (i < 0) {
                    C8222nF.Z();
                }
                next = xa0.P(Integer.valueOf(i), next, (T) it.next());
                i = i2;
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    @NotNull
    public static final byte[] R5(@NotNull Collection<Byte> collection) {
        C6562gT0.p(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Byte b2 : collection) {
            bArr[i] = b2.byteValue();
            i++;
        }
        return bArr;
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T, R> List<R> S1(@NotNull Iterable<? extends T> iterable, int i, @NotNull HA0<? super List<? extends T>, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "transform");
        return h6(iterable, i, i, true, ha0);
    }

    public static final <T, R> R S2(@NotNull Iterable<? extends T> iterable, R r, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = va0.i(r, (T) it.next());
        }
        return r;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T S3(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S S4(@NotNull Iterable<? extends T> iterable, @NotNull XA0<? super Integer, ? super S, ? super T, ? extends S> xa0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(xa0, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            next = xa0.P(Integer.valueOf(i), next, (T) it.next());
            i = i2;
        }
        return (S) next;
    }

    @NotNull
    public static final char[] S5(@NotNull Collection<Character> collection) {
        C6562gT0.p(collection, "<this>");
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character ch : collection) {
            cArr[i] = ch.charValue();
            i++;
        }
        return cArr;
    }

    @XP0
    public static final <T> T T1(List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        return list.get(0);
    }

    public static final <T, R> R T2(@NotNull Iterable<? extends T> iterable, R r, @NotNull XA0<? super Integer, ? super R, ? super T, ? extends R> xa0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(xa0, "operation");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            r = xa0.P(Integer.valueOf(i), r, obj);
            i = i2;
        }
        return r;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double T3(@NotNull Iterable<Double> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S T4(@NotNull Iterable<? extends T> iterable, @NotNull VA0<? super S, ? super T, ? extends S> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = va0.i(next, (T) it.next());
        }
        return (S) next;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C T5(@NotNull Iterable<? extends T> iterable, @NotNull C c) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    @XP0
    public static final <T> T U1(List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        return list.get(1);
    }

    public static final <T, R> R U2(@NotNull List<? extends T> list, R r, @NotNull VA0<? super T, ? super R, ? extends R> va0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(va0, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r = va0.i((T) listIterator.previous(), r);
            }
        }
        return r;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float U3(@NotNull Iterable<Float> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <S, T extends S> S U4(@NotNull List<? extends T> list, @NotNull VA0<? super T, ? super S, ? extends S> va0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(va0, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S previous = listIterator.previous();
            while (listIterator.hasPrevious()) {
                previous = va0.i((T) listIterator.previous(), previous);
            }
            return (S) previous;
        }
        throw new UnsupportedOperationException("Empty list can't be reduced.");
    }

    @NotNull
    public static final double[] U5(@NotNull Collection<Double> collection) {
        C6562gT0.p(collection, "<this>");
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Double d : collection) {
            dArr[i] = d.doubleValue();
            i++;
        }
        return dArr;
    }

    @XP0
    public static final <T> T V1(List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        return list.get(2);
    }

    public static final <T, R> R V2(@NotNull List<? extends T> list, R r, @NotNull XA0<? super Integer, ? super T, ? super R, ? extends R> xa0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(xa0, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r = xa0.P(Integer.valueOf(listIterator.previousIndex()), (T) listIterator.previous(), r);
            }
        }
        return r;
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double V3(@NotNull Iterable<Double> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final <S, T extends S> S V4(@NotNull List<? extends T> list, @NotNull XA0<? super Integer, ? super T, ? super S, ? extends S> xa0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(xa0, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S previous = listIterator.previous();
            while (listIterator.hasPrevious()) {
                previous = xa0.P(Integer.valueOf(listIterator.previousIndex()), (T) listIterator.previous(), previous);
            }
            return (S) previous;
        }
        throw new UnsupportedOperationException("Empty list can't be reduced.");
    }

    @NotNull
    public static final float[] V5(@NotNull Collection<Float> collection) {
        C6562gT0.p(collection, "<this>");
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Float f : collection) {
            fArr[i] = f.floatValue();
            i++;
        }
        return fArr;
    }

    @XP0
    public static final <T> T W1(List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        return list.get(3);
    }

    @IH0
    public static final <T> void W2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            ha0.invoke((T) it.next());
        }
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float W3(@NotNull Iterable<Float> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S W4(@NotNull List<? extends T> list, @NotNull XA0<? super Integer, ? super T, ? super S, ? extends S> xa0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(xa0, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = xa0.P(Integer.valueOf(listIterator.previousIndex()), (T) listIterator.previous(), previous);
        }
        return (S) previous;
    }

    @NotNull
    public static final <T> HashSet<T> W5(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        return (HashSet) T5(iterable, new HashSet(C8683p81.j(C8466oF.b0(iterable, 12))));
    }

    @XP0
    public static final <T> T X1(List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        return list.get(4);
    }

    public static final <T> void X2(@NotNull Iterable<? extends T> iterable, @NotNull VA0<? super Integer, ? super T, C7458kA2> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "action");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            va0.i(Integer.valueOf(i), obj);
            i = i2;
        }
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T X3(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S X4(@NotNull List<? extends T> list, @NotNull VA0<? super T, ? super S, ? extends S> va0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(va0, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = va0.i((T) listIterator.previous(), previous);
        }
        return (S) previous;
    }

    @NotNull
    public static final int[] X5(@NotNull Collection<Integer> collection) {
        C6562gT0.p(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    public static <T> boolean Y1(@NotNull Iterable<? extends T> iterable, T t) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (f3(iterable, t) >= 0) {
            return true;
        }
        return false;
    }

    @XP0
    public static final <T> T Y2(List<? extends T> list, int i, HA0<? super Integer, ? extends T> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return ha0.invoke(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T Y3(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            T next = it.next();
            if (comparator.compare(obj, next) < 0) {
                obj = next;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Iterable<T> Y4(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    @NotNull
    public static <T> List<T> Y5(@NotNull Iterable<? extends T> iterable) {
        Object next;
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return b6(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return C7979mF.k(next);
            }
            return C8222nF.H();
        }
        return C8222nF.T(a6(iterable));
    }

    public static final <T> int Z1(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C8222nF.Y();
            }
        }
        return i;
    }

    @Nullable
    public static <T> T Z2(@NotNull List<? extends T> list, int i) {
        C6562gT0.p(list, "<this>");
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T> T Z3(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) < 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> Z4(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    @NotNull
    public static final long[] Z5(@NotNull Collection<Long> collection) {
        C6562gT0.p(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long l : collection) {
            jArr[i] = l.longValue();
            i++;
        }
        return jArr;
    }

    public static final <T> int a2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (ha0.invoke((T) it.next()).booleanValue() && (i = i + 1) < 0) {
                C8222nF.Y();
            }
        }
        return i;
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> a3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = ha0.invoke(obj);
            Object obj2 = linkedHashMap.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(invoke, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T a4(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = ha0.invoke(next);
        T t2 = next;
        do {
            T next2 = it.next();
            R invoke2 = ha0.invoke(next2);
            t = t2;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                t = next2;
            }
            t2 = t;
        } while (it.hasNext());
        return t;
    }

    @NotNull
    public static final <T> List<T> a5(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Y5(iterable);
        }
        List<T> a6 = a6(iterable);
        C9930uF.r1(a6);
        return a6;
    }

    @NotNull
    public static final <T> List<T> a6(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return b6((Collection) iterable);
        }
        return (List) T5(iterable, new ArrayList());
    }

    @XP0
    public static final <T> int b2(Collection<? extends T> collection) {
        C6562gT0.p(collection, "<this>");
        return collection.size();
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> b3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = ha0.invoke(obj);
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T b4(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends R> ha0) {
        T t;
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            R invoke = ha0.invoke(next);
            T t2 = next;
            do {
                T next2 = it.next();
                R invoke2 = ha0.invoke(next2);
                t = t2;
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                    t = next2;
                }
                t2 = t;
            } while (it.hasNext());
            return t;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> List<R> b5(@NotNull Iterable<? extends T> iterable, R r, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "operation");
        int b0 = C8466oF.b0(iterable, 9);
        if (b0 == 0) {
            return C7979mF.k(r);
        }
        ArrayList arrayList = new ArrayList(b0 + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = va0.i(r, (T) it.next());
            arrayList.add(r);
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> b6(@NotNull Collection<? extends T> collection) {
        C6562gT0.p(collection, "<this>");
        return new ArrayList(collection);
    }

    @NotNull
    public static final <T> List<T> c2(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        return Y5(c6(iterable));
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M c3(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "keySelector");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = ha0.invoke(obj);
            Object obj2 = m.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m.put(invoke, obj2);
            }
            ((List) obj2).add(obj);
        }
        return m;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> double c4(Iterable<? extends T> iterable, HA0<? super T, Double> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = ha0.invoke((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ha0.invoke((T) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> List<R> c5(@NotNull Iterable<? extends T> iterable, R r, @NotNull XA0<? super Integer, ? super R, ? super T, ? extends R> xa0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(xa0, "operation");
        int b0 = C8466oF.b0(iterable, 9);
        if (b0 == 0) {
            return C7979mF.k(r);
        }
        ArrayList arrayList = new ArrayList(b0 + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            r = xa0.P(Integer.valueOf(i), r, (T) it.next());
            arrayList.add(r);
            i = i2;
        }
        return arrayList;
    }

    @NotNull
    public static <T> Set<T> c6(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) T5(iterable, new LinkedHashSet());
    }

    @NotNull
    public static final <T, K> List<T> d2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (hashSet.add(ha0.invoke(obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M d3(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = ha0.invoke(obj);
            Object obj2 = m.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m.put(invoke, obj2);
            }
            ((List) obj2).add(ha02.invoke(obj));
        }
        return m;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> float d4(Iterable<? extends T> iterable, HA0<? super T, Float> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = ha0.invoke((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ha0.invoke((T) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> d5(@NotNull Iterable<? extends T> iterable, @NotNull VA0<? super S, ? super T, ? extends S> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C8222nF.H();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(C8466oF.b0(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = va0.i(next, (T) it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @NotNull
    public static <T> Set<T> d6(@NotNull Iterable<? extends T> iterable) {
        Object next;
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return (Set) T5(iterable, new LinkedHashSet(C8683p81.j(collection.size())));
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return A22.f(next);
            }
            return B22.k();
        }
        return B22.r((Set) T5(iterable, new LinkedHashSet()));
    }

    @NotNull
    public static <T> List<T> e2(@NotNull Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        C6562gT0.p(iterable, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return Y5(iterable);
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i;
                if (size <= 0) {
                    return C8222nF.H();
                }
                if (size == 1) {
                    return C7979mF.k(q3(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            for (T t : iterable) {
                if (i2 >= i) {
                    arrayList.add(t);
                } else {
                    i2++;
                }
            }
            return C8222nF.T(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K> UE0<T, K> e3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "keySelector");
        return new b(iterable, ha0);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R e4(Iterable<? extends T> iterable, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke2 = ha0.invoke((T) it.next());
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> e5(@NotNull Iterable<? extends T> iterable, @NotNull XA0<? super Integer, ? super S, ? super T, ? extends S> xa0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(xa0, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C8222nF.H();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(C8466oF.b0(iterable, 10));
        arrayList.add(next);
        int i = 1;
        while (it.hasNext()) {
            next = xa0.P(Integer.valueOf(i), next, (T) it.next());
            arrayList.add(next);
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final short[] e6(@NotNull Collection<Short> collection) {
        C6562gT0.p(collection, "<this>");
        short[] sArr = new short[collection.size()];
        int i = 0;
        for (Short sh : collection) {
            sArr[i] = sh.shortValue();
            i++;
        }
        return sArr;
    }

    @NotNull
    public static <T> List<T> f2(@NotNull List<? extends T> list, int i) {
        C6562gT0.p(list, "<this>");
        if (i >= 0) {
            return M5(list, C5075aO1.u(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static final <T> int f3(@NotNull Iterable<? extends T> iterable, T t) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                C8222nF.Z();
            }
            if (C6562gT0.g(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R f4(Iterable<? extends T> iterable, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = ha0.invoke((T) it.next());
        while (it.hasNext()) {
            R invoke2 = ha0.invoke((T) it.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> List<R> f5(@NotNull Iterable<? extends T> iterable, R r, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "operation");
        int b0 = C8466oF.b0(iterable, 9);
        if (b0 == 0) {
            return C7979mF.k(r);
        }
        ArrayList arrayList = new ArrayList(b0 + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = va0.i(r, (T) it.next());
            arrayList.add(r);
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Set<T> f6(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(iterable2, "other");
        Set<T> c6 = c6(iterable);
        C9444sF.q0(c6, iterable2);
        return c6;
    }

    @NotNull
    public static final <T> List<T> g2(@NotNull List<? extends T> list, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!ha0.invoke((T) listIterator.previous()).booleanValue()) {
                    return M5(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return C8222nF.H();
    }

    public static final <T> int g3(@NotNull List<? extends T> list, T t) {
        C6562gT0.p(list, "<this>");
        return list.indexOf(t);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Double g4(Iterable<? extends T> iterable, HA0<? super T, Double> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ha0.invoke((T) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ha0.invoke((T) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> List<R> g5(@NotNull Iterable<? extends T> iterable, R r, @NotNull XA0<? super Integer, ? super R, ? super T, ? extends R> xa0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(xa0, "operation");
        int b0 = C8466oF.b0(iterable, 9);
        if (b0 == 0) {
            return C7979mF.k(r);
        }
        ArrayList arrayList = new ArrayList(b0 + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            r = xa0.P(Integer.valueOf(i), r, (T) it.next());
            arrayList.add(r);
            i = i2;
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> List<List<T>> g6(@NotNull Iterable<? extends T> iterable, int i, int i2, boolean z) {
        int i3;
        C6562gT0.p(iterable, "<this>");
        C8688p92.a(i, i2);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i4 = size / i2;
            if (size % i2 == 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            ArrayList arrayList = new ArrayList(i4 + i3);
            int i5 = 0;
            while (i5 >= 0 && i5 < size) {
                int B = C5075aO1.B(i, size - i5);
                if (B < i && !z) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList(B);
                for (int i6 = 0; i6 < B; i6++) {
                    arrayList2.add(list.get(i6 + i5));
                }
                arrayList.add(arrayList2);
                i5 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator b2 = C8688p92.b(iterable.iterator(), i, i2, z, false);
        while (b2.hasNext()) {
            arrayList3.add((List) b2.next());
        }
        return arrayList3;
    }

    @NotNull
    public static final <T> List<T> h2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (z) {
                arrayList.add(obj);
            } else if (!ha0.invoke(obj).booleanValue()) {
                arrayList.add(obj);
                z = true;
            }
        }
        return arrayList;
    }

    public static final <T> int h3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i < 0) {
                C8222nF.Z();
            }
            if (ha0.invoke(obj).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Float h4(Iterable<? extends T> iterable, HA0<? super T, Float> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ha0.invoke((T) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ha0.invoke((T) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.3")
    public static final <T> void h5(@NotNull List<T> list, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int J = C8222nF.J(list); J > 0; J--) {
            int m = abstractC10696xN1.m(J + 1);
            list.set(m, list.set(J, list.get(m)));
        }
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T, R> List<R> h6(@NotNull Iterable<? extends T> iterable, int i, int i2, boolean z, @NotNull HA0<? super List<? extends T>, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "transform");
        C8688p92.a(i, i2);
        int i3 = 1;
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i4 = size / i2;
            int i5 = 0;
            if (size % i2 == 0) {
                i3 = 0;
            }
            ArrayList arrayList = new ArrayList(i4 + i3);
            C10297vl1 c10297vl1 = new C10297vl1(list);
            while (i5 >= 0 && i5 < size) {
                int B = C5075aO1.B(i, size - i5);
                if (!z && B < i) {
                    return arrayList;
                }
                c10297vl1.h(i5, B + i5);
                arrayList.add(ha0.invoke(c10297vl1));
                i5 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator b2 = C8688p92.b(iterable.iterator(), i, i2, z, true);
        while (b2.hasNext()) {
            arrayList2.add(ha0.invoke((List) b2.next()));
        }
        return arrayList2;
    }

    public static final <T> T i2(@NotNull Iterable<? extends T> iterable, final int i) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) l2(iterable, i, new HA0() { // from class: o.wF
            @Override // o.HA0
            public final Object invoke(Object obj) {
                Object k2;
                k2 = C10662xF.k2(i, ((Integer) obj).intValue());
                return k2;
            }
        });
    }

    public static final <T> int i3(@NotNull List<? extends T> list, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (ha0.invoke((T) it.next()).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R i4(Iterable<? extends T> iterable, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (R) ha0.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke = ha0.invoke((T) it.next());
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static <T> T i5(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) k5((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static /* synthetic */ List i6(Iterable iterable, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return g6(iterable, i, i2, z);
    }

    @XP0
    public static final <T> T j2(List<? extends T> list, int i) {
        C6562gT0.p(list, "<this>");
        return list.get(i);
    }

    public static final <T> int j3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        int i = -1;
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i2 < 0) {
                C8222nF.Z();
            }
            if (ha0.invoke(obj).booleanValue()) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R j4(Iterable<? extends T> iterable, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) ha0.invoke((T) it.next());
        while (it.hasNext()) {
            R invoke = ha0.invoke((T) it.next());
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T j5(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : iterable) {
            if (ha0.invoke(t2).booleanValue()) {
                if (!z) {
                    z = true;
                    t = t2;
                } else {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ List j6(Iterable iterable, int i, int i2, boolean z, HA0 ha0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return h6(iterable, i, i2, z, ha0);
    }

    public static final Object k2(int i, int i2) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
    }

    public static final <T> int k3(@NotNull List<? extends T> list, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (ha0.invoke((T) listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static <T extends Comparable<? super T>> T k4(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> T k5(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    @NotNull
    public static final <T> Iterable<C9485sP0<T>> k6(@NotNull final Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        return new C9728tP0(new FA0() { // from class: o.vF
            @Override // o.FA0
            public final Object invoke() {
                Iterator l6;
                l6 = C10662xF.l6(iterable);
                return l6;
            }
        });
    }

    public static final <T> T l2(@NotNull Iterable<? extends T> iterable, int i, @NotNull HA0<? super Integer, ? extends T> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return (T) list.get(i);
            }
            return ha0.invoke(Integer.valueOf(i));
        } else if (i < 0) {
            return ha0.invoke(Integer.valueOf(i));
        } else {
            int i2 = 0;
            for (T t : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return t;
                }
                i2 = i3;
            }
            return ha0.invoke(Integer.valueOf(i));
        }
    }

    @NotNull
    public static final <T> Set<T> l3(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(iterable2, "other");
        Set<T> c6 = c6(iterable);
        C9444sF.R0(c6, iterable2);
        return c6;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double l4(@NotNull Iterable<Double> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @Nullable
    public static final <T> T l5(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() != 1) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final Iterator l6(Iterable iterable) {
        return iterable.iterator();
    }

    @XP0
    public static final <T> T m2(List<? extends T> list, int i, HA0<? super Integer, ? extends T> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return ha0.invoke(Integer.valueOf(i));
    }

    @NotNull
    public static final <T, A extends Appendable> A m3(@NotNull Iterable<? extends T> iterable, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable HA0<? super T, ? extends CharSequence> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C6849hf2.b(a2, t, ha0);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float m4(@NotNull Iterable<Float> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> T m5(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        boolean z = false;
        T t = null;
        for (T t2 : iterable) {
            if (ha0.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (!z) {
            return null;
        }
        return t;
    }

    @NotNull
    public static <T, R> List<C4180Rx1<T, R>> m6(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> iterable2) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), C8466oF.b0(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C6670gv2.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    @Nullable
    public static final <T> T n2(@NotNull Iterable<? extends T> iterable, int i) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) Z2((List) iterable, i);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return null;
    }

    public static /* synthetic */ Appendable n3(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, HA0 ha0, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i2 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return m3(iterable, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, ha02);
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double n4(@NotNull Iterable<Double> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @Nullable
    public static <T> T n5(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @NotNull
    public static final <T, R, V> List<V> n6(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> iterable2, @NotNull VA0<? super T, ? super R, ? extends V> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(iterable2, "other");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), C8466oF.b0(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(va0.i((T) it.next(), (R) it2.next()));
        }
        return arrayList;
    }

    @XP0
    public static final <T> T o2(List<? extends T> list, int i) {
        C6562gT0.p(list, "<this>");
        return (T) Z2(list, i);
    }

    @NotNull
    public static final <T> String o3(@NotNull Iterable<? extends T> iterable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable HA0<? super T, ? extends CharSequence> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) m3(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, ha0)).toString();
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float o4(@NotNull Iterable<Float> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T> List<T> o5(@NotNull List<? extends T> list, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(list.get(num.intValue()));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<C4180Rx1<T, R>> o6(@NotNull Iterable<? extends T> iterable, @NotNull R[] rArr) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(rArr, "other");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i = 0;
        for (T t : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(t, rArr[i]));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> p2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (ha0.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String p3(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, HA0 ha0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return o3(iterable, charSequence, charSequence2, charSequence3, i, charSequence5, ha02);
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T p4(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static <T> List<T> p5(@NotNull List<? extends T> list, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return Y5(list.subList(c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R, V> List<V> p6(@NotNull Iterable<? extends T> iterable, @NotNull R[] rArr, @NotNull VA0<? super T, ? super R, ? extends V> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(va0.i(obj, rArr[i]));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> q2(@NotNull Iterable<? extends T> iterable, @NotNull VA0<? super Integer, ? super T, Boolean> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            if (va0.i(Integer.valueOf(i), obj).booleanValue()) {
                arrayList.add(obj);
            }
            i = i2;
        }
        return arrayList;
    }

    public static final <T> T q3(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) s3((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T q4(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            T next = it.next();
            if (comparator.compare(obj, next) > 0) {
                obj = next;
            }
        }
        return (T) obj;
    }

    public static final <T, R extends Comparable<? super R>> void q5(@NotNull List<T> list, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "selector");
        if (list.size() > 1) {
            C9201rF.p0(list, new C11156zH.a(ha0));
        }
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> List<C4180Rx1<T, T>> q6(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(C6670gv2.a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C r2(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull VA0<? super Integer, ? super T, Boolean> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(va0, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            if (va0.i(Integer.valueOf(i), obj).booleanValue()) {
                c.add(obj);
            }
            i = i2;
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T r3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : iterable) {
            if (ha0.invoke(t2).booleanValue()) {
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T> T r4(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) > 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    public static final <T, R extends Comparable<? super R>> void r5(@NotNull List<T> list, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "selector");
        if (list.size() > 1) {
            C9201rF.p0(list, new C11156zH.c(ha0));
        }
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T, R> List<R> r6(@NotNull Iterable<? extends T> iterable, @NotNull VA0<? super T, ? super T, ? extends R> va0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(va0, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(va0.i(next, next2));
            next = (Object) next2;
        }
        return arrayList;
    }

    public static final /* synthetic */ <R> List<R> s2(Iterable<?> iterable) {
        C6562gT0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            C6562gT0.y(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T s3(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C8222nF.J(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @NotNull
    public static final <T> List<T> s4(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(iterable2, "elements");
        Collection t0 = C9444sF.t0(iterable2);
        if (t0.isEmpty()) {
            return Y5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!t0.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T extends Comparable<? super T>> void s5(@NotNull List<T> list) {
        C6562gT0.p(list, "<this>");
        C9201rF.p0(list, C11156zH.x());
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C t2(Iterable<?> iterable, C c) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        for (Object obj : iterable) {
            C6562gT0.y(3, "R");
            if (obj != null) {
                c.add(obj);
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T t3(@NotNull List<? extends T> list, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (ha0.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @NotNull
    public static final <T> List<T> t4(@NotNull Iterable<? extends T> iterable, T t) {
        C6562gT0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C8466oF.b0(iterable, 10));
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && C6562gT0.g(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> t5(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Y5(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C4788Ye.U3((Comparable[]) array);
            return C4788Ye.t(array);
        }
        List<T> a6 = a6(iterable);
        C9201rF.m0(a6);
        return a6;
    }

    @NotNull
    public static final <T> List<T> u2(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (!ha0.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> int u3(@NotNull Iterable<? extends T> iterable, T t) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t);
        }
        int i = -1;
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 < 0) {
                C8222nF.Z();
            }
            if (C6562gT0.g(t, t2)) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    @NotNull
    public static final <T> List<T> u4(@NotNull Iterable<? extends T> iterable, @NotNull B02<? extends T> b02) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(b02, "elements");
        List G3 = C6695h12.G3(b02);
        if (G3.isEmpty()) {
            return Y5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!G3.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> u5(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        return x5(iterable, new C11156zH.a(ha0));
    }

    @NotNull
    public static <T> List<T> v2(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        return (List) w2(iterable, new ArrayList());
    }

    public static final <T> int v3(@NotNull List<? extends T> list, T t) {
        C6562gT0.p(list, "<this>");
        return list.lastIndexOf(t);
    }

    @NotNull
    public static final <T> List<T> v4(@NotNull Iterable<? extends T> iterable, @NotNull T[] tArr) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(tArr, "elements");
        if (tArr.length == 0) {
            return Y5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!C7330jf.B8(tArr, t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> v5(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        return x5(iterable, new C11156zH.c(ha0));
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C w2(@NotNull Iterable<? extends T> iterable, @NotNull C c) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        for (T t : iterable) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    @Nullable
    public static final <T> T w3(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @XP0
    public static final <T> List<T> w4(Iterable<? extends T> iterable, T t) {
        C6562gT0.p(iterable, "<this>");
        return t4(iterable, t);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> w5(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        return x5(iterable, C11156zH.x());
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C x2(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (!ha0.invoke(obj).booleanValue()) {
                c.add(obj);
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> T x3(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        for (T t2 : iterable) {
            if (ha0.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    public static final <T> boolean x4(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> List<T> x5(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Y5(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C4788Ye.h4(array, comparator);
            return C4788Ye.t(array);
        }
        List<T> a6 = a6(iterable);
        C9201rF.p0(a6, comparator);
        return a6;
    }

    public static final <T> boolean y1(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!ha0.invoke((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C y2(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (ha0.invoke(obj).booleanValue()) {
                c.add(obj);
            }
        }
        return c;
    }

    @Nullable
    public static final <T> T y3(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> boolean y4(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (ha0.invoke((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T> Set<T> y5(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(iterable2, "other");
        Set<T> c6 = c6(iterable);
        C9444sF.H0(c6, iterable2);
        return c6;
    }

    public static final <T> boolean z1(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return !((Collection) iterable).isEmpty();
        }
        return iterable.iterator().hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @XP0
    public static final <T> T z2(Iterable<? extends T> iterable, HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : iterable) {
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T z3(@NotNull List<? extends T> list, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (ha0.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, C extends Iterable<? extends T>> C z4(@NotNull C c, @NotNull HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(c, "<this>");
        C6562gT0.p(ha0, "action");
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            ha0.invoke(it.next());
        }
        return c;
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final <T> int z5(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Integer> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ha0.invoke((T) it.next()).intValue();
        }
        return i;
    }
}
