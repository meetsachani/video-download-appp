package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,671:1\n97#1,5:672\n112#1,5:677\n153#1,3:682\n144#1:685\n216#1:686\n217#1:688\n145#1:689\n216#1:690\n217#1:692\n1#2:687\n1#2:691\n1969#3,14:693\n1999#3,14:707\n2393#3,14:721\n2423#3,14:735\n1878#3,3:749\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n77#1:672,5\n90#1:677,5\n126#1:682,3\n136#1:685\n136#1:686\n136#1:688\n136#1:689\n144#1:690\n144#1:692\n136#1:687\n238#1:693,14\n256#1:707,14\n436#1:721,14\n454#1:735,14\n651#1:749,3\n*E\n"})
/* renamed from: o.s81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9418s81 extends C9175r81 {
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> Float A1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, Float> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ha0.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ha0.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) ha0.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke = ha0.invoke((Object) it.next());
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) ha0.invoke((Object) it.next());
        while (it.hasNext()) {
            R invoke = ha0.invoke((Object) it.next());
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        return (Map.Entry) C10662xF.q4(map.entrySet(), comparator);
    }

    @XP0
    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        return (Map.Entry) C10662xF.r4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (ha0.invoke(entry).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@NotNull M m, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, C7458kA2> ha0) {
        C6562gT0.p(m, "<this>");
        C6562gT0.p(ha0, "action");
        for (Map.Entry<K, V> entry : m.entrySet()) {
            ha0.invoke(entry);
        }
        return m;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@NotNull M m, @NotNull VA0<? super Integer, ? super Map.Entry<? extends K, ? extends V>, C7458kA2> va0) {
        C6562gT0.p(m, "<this>");
        C6562gT0.p(va0, "action");
        int i = 0;
        for (Object obj : m.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            va0.i(Integer.valueOf(i), obj);
            i = i2;
        }
        return m;
    }

    @NotNull
    public static final <K, V> List<C4180Rx1<K, V>> J1(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        if (map.size() == 0) {
            return C8222nF.H();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C8222nF.H();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return C7979mF.k(new C4180Rx1(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C4180Rx1(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new C4180Rx1(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean P0(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!ha0.invoke(entry).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (ha0.invoke(entry).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @XP0
    public static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return map.entrySet();
    }

    @NotNull
    public static final <K, V> B02<Map.Entry<K, V>> T0(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return C10662xF.C1(map.entrySet());
    }

    @XP0
    public static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return map.size();
    }

    public static final <K, V> int V0(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (ha0.invoke(entry).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <K, V, R> R W0(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        R r;
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                r = ha0.invoke(it.next());
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
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <K, V, R> R X0(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            R invoke = ha0.invoke(entry);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @NotNull
    public static final <K, V, R> List<R> Y0(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            C9444sF.q0(arrayList, ha0.invoke(entry));
        }
        return arrayList;
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapSequence")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R> List<R> Z0(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends B02<? extends R>> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            C9444sF.r0(arrayList, ha0.invoke(entry));
        }
        return arrayList;
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapSequenceTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R, C extends Collection<? super R>> C a1(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends B02<? extends R>> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            C9444sF.r0(c, ha0.invoke(entry));
        }
        return c;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C b1(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            C9444sF.q0(c, ha0.invoke(entry));
        }
        return c;
    }

    @IH0
    public static final <K, V> void c1(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, C7458kA2> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "action");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            ha0.invoke(entry);
        }
    }

    @NotNull
    public static final <K, V, R> List<R> d1(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            arrayList.add(ha0.invoke(entry));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, R> List<R> e1(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            R invoke = ha0.invoke(entry);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C f1(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            R invoke = ha0.invoke(entry);
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C g1(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(c, "destination");
        C6562gT0.p(ha0, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            c.add(ha0.invoke(entry));
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        Object obj;
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object obj2 = (Object) it.next();
            if (!it.hasNext()) {
                obj = obj2;
            } else {
                R invoke = ha0.invoke(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R invoke2 = ha0.invoke(obj4);
                    obj2 = obj3;
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            }
        }
        return (Map.Entry) obj;
    }

    @XP0
    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (Object) it.next();
            if (it.hasNext()) {
                R invoke = ha0.invoke(obj);
                do {
                    Object obj2 = (Object) it.next();
                    R invoke2 = ha0.invoke(obj2);
                    if (invoke.compareTo(invoke2) < 0) {
                        obj = (Object) obj2;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
                return (Map.Entry) obj;
            }
            return (Map.Entry) obj;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> double j1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, Double> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = ha0.invoke((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, ha0.invoke((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> float k1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, Float> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = ha0.invoke((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ha0.invoke((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R invoke = ha0.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke2 = ha0.invoke((Object) it.next());
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = ha0.invoke((Object) it.next());
        while (it.hasNext()) {
            R invoke2 = ha0.invoke((Object) it.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> Double n1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, Double> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ha0.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ha0.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> Float o1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, Float> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ha0.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ha0.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) ha0.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke = ha0.invoke((Object) it.next());
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) ha0.invoke((Object) it.next());
        while (it.hasNext()) {
            R invoke = ha0.invoke((Object) it.next());
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        return (Map.Entry) C10662xF.Y3(map.entrySet(), comparator);
    }

    @XP0
    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        return (Map.Entry) C10662xF.Z3(map.entrySet(), comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        Object obj;
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object obj2 = (Object) it.next();
            if (!it.hasNext()) {
                obj = obj2;
            } else {
                R invoke = ha0.invoke(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R invoke2 = ha0.invoke(obj4);
                    obj2 = obj3;
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            }
        }
        return (Map.Entry) obj;
    }

    @XP0
    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (Object) it.next();
            if (it.hasNext()) {
                R invoke = ha0.invoke(obj);
                do {
                    Object obj2 = (Object) it.next();
                    R invoke2 = ha0.invoke(obj2);
                    if (invoke.compareTo(invoke2) > 0) {
                        obj = (Object) obj2;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
                return (Map.Entry) obj;
            }
            return (Map.Entry) obj;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> double v1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, Double> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = ha0.invoke((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ha0.invoke((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> float w1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, Float> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = ha0.invoke((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ha0.invoke((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R invoke = ha0.invoke((Object) it.next());
            while (it.hasNext()) {
                R invoke2 = ha0.invoke((Object) it.next());
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = ha0.invoke((Object) it.next());
        while (it.hasNext()) {
            R invoke2 = ha0.invoke((Object) it.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <K, V> Double z1(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, Double> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ha0.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ha0.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }
}
