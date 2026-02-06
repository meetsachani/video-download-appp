package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* renamed from: o.p81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8683p81 extends C8439o81 {
    public static final int a = 1073741824;

    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <K, V> Map<K, V> d(@NotNull Map<K, V> map) {
        C6562gT0.p(map, "builder");
        return ((H71) map).l();
    }

    @XP0
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final <K, V> Map<K, V> e(int i, HA0<? super Map<K, V>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        Map h = h(i);
        ha0.invoke(h);
        return d(h);
    }

    @XP0
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final <K, V> Map<K, V> f(HA0<? super Map<K, V>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        Map g = g();
        ha0.invoke(g);
        return d(g);
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> g() {
        return new H71();
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <K, V> Map<K, V> h(int i) {
        return new H71(i);
    }

    public static final <K, V> V i(@NotNull ConcurrentMap<K, V> concurrentMap, K k, @NotNull FA0<? extends V> fa0) {
        C6562gT0.p(concurrentMap, "<this>");
        C6562gT0.p(fa0, "defaultValue");
        V v = concurrentMap.get(k);
        if (v == null) {
            V invoke = fa0.invoke();
            V putIfAbsent = concurrentMap.putIfAbsent(k, invoke);
            if (putIfAbsent == null) {
                return invoke;
            }
            return putIfAbsent;
        }
        return v;
    }

    @HK1
    public static int j(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    public static <K, V> Map<K, V> k(@NotNull C4180Rx1<? extends K, ? extends V> c4180Rx1) {
        C6562gT0.p(c4180Rx1, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(c4180Rx1.e(), c4180Rx1.f());
        C6562gT0.o(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <K, V> SortedMap<K, V> l(@NotNull Comparator<? super K> comparator, @NotNull C4180Rx1<? extends K, ? extends V>... c4180Rx1Arr) {
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(c4180Rx1Arr, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        C8926q81.y0(treeMap, c4180Rx1Arr);
        return treeMap;
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m(@NotNull C4180Rx1<? extends K, ? extends V>... c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "pairs");
        TreeMap treeMap = new TreeMap();
        C8926q81.y0(treeMap, c4180Rx1Arr);
        return treeMap;
    }

    @XP0
    public static final Properties n(Map<String, String> map) {
        C6562gT0.p(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @NotNull
    public static final <K, V> Map<K, V> o(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C6562gT0.o(singletonMap, "with(...)");
        return singletonMap;
    }

    @XP0
    public static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return o(map);
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> q(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return new TreeMap(map);
    }

    @NotNull
    public static final <K, V> SortedMap<K, V> r(@NotNull Map<? extends K, ? extends V> map, @NotNull Comparator<? super K> comparator) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
