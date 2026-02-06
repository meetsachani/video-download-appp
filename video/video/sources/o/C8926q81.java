package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,816:1\n415#1:826\n426#1:831\n523#1,6:836\n548#1,6:842\n1#2:817\n1252#3,4:818\n1252#3,4:822\n1252#3,4:827\n1252#3,4:832\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n465#1:826\n480#1:831\n538#1:836,6\n563#1:842,6\n415#1:818,4\n426#1:822,4\n465#1:827,4\n480#1:832,4\n*E\n"})
/* renamed from: o.q81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8926q81 extends C8683p81 {
    @NotNull
    public static final <K, V> Map<K, V> A(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (ha0.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @XP0
    public static final <K, V> void A0(Map<K, V> map, K k, V v) {
        C6562gT0.p(map, "<this>");
        map.put(k, v);
    }

    @NotNull
    public static final <K, V> Map<K, V> B(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super K, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (ha0.invoke((K) entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static <K, V> Map<K, V> B0(@NotNull Iterable<? extends C4180Rx1<? extends K, ? extends V>> iterable) {
        Object next;
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return C0(iterable, new LinkedHashMap(C8683p81.j(collection.size())));
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return C8683p81.k((C4180Rx1) next);
            }
            return z();
        }
        return k0(C0(iterable, new LinkedHashMap()));
    }

    @NotNull
    public static final <K, V> Map<K, V> C(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!ha0.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@NotNull Iterable<? extends C4180Rx1<? extends K, ? extends V>> iterable, @NotNull M m) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(m, "destination");
        w0(m, iterable);
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!ha0.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static <K, V> Map<K, V> D0(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return J0(map);
            }
            return C8683p81.o(map);
        }
        return z();
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (ha0.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@NotNull Map<? extends K, ? extends V> map, @NotNull M m) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(m, "destination");
        m.putAll(map);
        return m;
    }

    @NotNull
    public static final <K, V> Map<K, V> F(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super V, Boolean> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (ha0.invoke((V) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> F0(@NotNull B02<? extends C4180Rx1<? extends K, ? extends V>> b02) {
        C6562gT0.p(b02, "<this>");
        return k0(G0(b02, new LinkedHashMap()));
    }

    @XP0
    public static final <K, V> V G(Map<? extends K, ? extends V> map, K k) {
        C6562gT0.p(map, "<this>");
        return map.get(k);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@NotNull B02<? extends C4180Rx1<? extends K, ? extends V>> b02, @NotNull M m) {
        C6562gT0.p(b02, "<this>");
        C6562gT0.p(m, "destination");
        x0(m, b02);
        return m;
    }

    @XP0
    public static final <K, V> V H(Map<K, ? extends V> map, K k, FA0<? extends V> fa0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(fa0, "defaultValue");
        V v = map.get(k);
        if (v == null) {
            return fa0.invoke();
        }
        return v;
    }

    @NotNull
    public static final <K, V> Map<K, V> H0(@NotNull C4180Rx1<? extends K, ? extends V>[] c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "<this>");
        int length = c4180Rx1Arr.length;
        if (length != 0) {
            if (length != 1) {
                return I0(c4180Rx1Arr, new LinkedHashMap(C8683p81.j(c4180Rx1Arr.length)));
            }
            return C8683p81.k(c4180Rx1Arr[0]);
        }
        return z();
    }

    public static final <K, V> V I(@NotNull Map<K, ? extends V> map, K k, @NotNull FA0<? extends V> fa0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(fa0, "defaultValue");
        V v = map.get(k);
        if (v == null && !map.containsKey(k)) {
            return fa0.invoke();
        }
        return v;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@NotNull C4180Rx1<? extends K, ? extends V>[] c4180Rx1Arr, @NotNull M m) {
        C6562gT0.p(c4180Rx1Arr, "<this>");
        C6562gT0.p(m, "destination");
        y0(m, c4180Rx1Arr);
        return m;
    }

    public static final <K, V> V J(@NotNull Map<K, V> map, K k, @NotNull FA0<? extends V> fa0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(fa0, "defaultValue");
        V v = map.get(k);
        if (v == null) {
            V invoke = fa0.invoke();
            map.put(k, invoke);
            return invoke;
        }
        return v;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static <K, V> Map<K, V> J0(@NotNull Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    @InterfaceC6480g82(version = "1.1")
    public static final <K, V> V K(@NotNull Map<K, ? extends V> map, K k) {
        C6562gT0.p(map, "<this>");
        return (V) C8439o81.a(map, k);
    }

    @XP0
    public static final <K, V> C4180Rx1<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        C6562gT0.p(entry, "<this>");
        return new C4180Rx1<>(entry.getKey(), entry.getValue());
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @NotNull
    public static <K, V> HashMap<K, V> M(@NotNull C4180Rx1<? extends K, ? extends V>... c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C8683p81.j(c4180Rx1Arr.length));
        y0(hashMap, c4180Rx1Arr);
        return hashMap;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lo/FA0<+TR;>;)TR; */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final Object N(Map map, FA0 fa0) {
        C6562gT0.p(fa0, "defaultValue");
        if (map.isEmpty()) {
            return fa0.invoke();
        }
        return map;
    }

    @XP0
    public static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return !map.isEmpty();
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    @XP0
    public static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        return (Iterator<Map.Entry<? extends K, ? extends V>>) map.entrySet().iterator();
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @NotNull
    public static final <K, V> LinkedHashMap<K, V> S(@NotNull C4180Rx1<? extends K, ? extends V>... c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "pairs");
        return (LinkedHashMap) I0(c4180Rx1Arr, new LinkedHashMap(C8683p81.j(c4180Rx1Arr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<R, V> T(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C8683p81.j(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(ha0.invoke(obj), ((Map.Entry) obj).getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "transform");
        for (Object obj : map.entrySet()) {
            m.put(ha0.invoke(obj), ((Map.Entry) obj).getValue());
        }
        return m;
    }

    @XP0
    public static final <K, V> Map<K, V> V() {
        return z();
    }

    @NotNull
    public static <K, V> Map<K, V> W(@NotNull C4180Rx1<? extends K, ? extends V>... c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "pairs");
        if (c4180Rx1Arr.length > 0) {
            return I0(c4180Rx1Arr, new LinkedHashMap(C8683p81.j(c4180Rx1Arr.length)));
        }
        return z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<K, R> X(@NotNull Map<? extends K, ? extends V> map, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C8683p81.j(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(((Map.Entry) obj).getKey(), ha0.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(ha0, "transform");
        for (Object obj : map.entrySet()) {
            m.put(((Map.Entry) obj).getKey(), ha0.invoke(obj));
        }
        return m;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> Z(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends K> iterable) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(iterable, "keys");
        Map J0 = J0(map);
        C9444sF.H0(J0.keySet(), iterable);
        return k0(J0);
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> a0(@NotNull Map<? extends K, ? extends V> map, K k) {
        C6562gT0.p(map, "<this>");
        Map J0 = J0(map);
        J0.remove(k);
        return k0(J0);
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> b0(@NotNull Map<? extends K, ? extends V> map, @NotNull B02<? extends K> b02) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(b02, "keys");
        Map J0 = J0(map);
        C9444sF.J0(J0.keySet(), b02);
        return k0(J0);
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> c0(@NotNull Map<? extends K, ? extends V> map, @NotNull K[] kArr) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(kArr, "keys");
        Map J0 = J0(map);
        C9444sF.K0(J0.keySet(), kArr);
        return k0(J0);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <K, V> void d0(Map<K, V> map, Iterable<? extends K> iterable) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(iterable, "keys");
        C9444sF.H0(map.keySet(), iterable);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <K, V> void e0(Map<K, V> map, K k) {
        C6562gT0.p(map, "<this>");
        map.remove(k);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <K, V> void f0(Map<K, V> map, B02<? extends K> b02) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(b02, "keys");
        C9444sF.J0(map.keySet(), b02);
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <K, V> void g0(Map<K, V> map, K[] kArr) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(kArr, "keys");
        C9444sF.K0(map.keySet(), kArr);
    }

    @XP0
    @InterfaceC8046mW0(name = "mutableIterator")
    public static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        C6562gT0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @NotNull
    public static <K, V> Map<K, V> j0(@NotNull C4180Rx1<? extends K, ? extends V>... c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C8683p81.j(c4180Rx1Arr.length));
        y0(linkedHashMap, c4180Rx1Arr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> k0(@NotNull Map<K, ? extends V> map) {
        C6562gT0.p(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return map;
            }
            return C8683p81.o(map);
        }
        return z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        if (map == 0) {
            return z();
        }
        return map;
    }

    @NotNull
    public static final <K, V> Map<K, V> m0(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends C4180Rx1<? extends K, ? extends V>> iterable) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(iterable, "pairs");
        if (map.isEmpty()) {
            return B0(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> n0(@NotNull Map<? extends K, ? extends V> map, @NotNull Map<? extends K, ? extends V> map2) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0(@NotNull Map<? extends K, ? extends V> map, @NotNull C4180Rx1<? extends K, ? extends V> c4180Rx1) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(c4180Rx1, "pair");
        if (map.isEmpty()) {
            return C8683p81.k(c4180Rx1);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c4180Rx1.e(), c4180Rx1.f());
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> p0(@NotNull Map<? extends K, ? extends V> map, @NotNull B02<? extends C4180Rx1<? extends K, ? extends V>> b02) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(b02, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, b02);
        return k0(linkedHashMap);
    }

    @NotNull
    public static final <K, V> Map<K, V> q0(@NotNull Map<? extends K, ? extends V> map, @NotNull C4180Rx1<? extends K, ? extends V>[] c4180Rx1Arr) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(c4180Rx1Arr, "pairs");
        if (map.isEmpty()) {
            return H0(c4180Rx1Arr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, c4180Rx1Arr);
        return linkedHashMap;
    }

    @XP0
    public static final <K, V> void r0(Map<? super K, ? super V> map, Iterable<? extends C4180Rx1<? extends K, ? extends V>> iterable) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(iterable, "pairs");
        w0(map, iterable);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final <K, V> Map<K, V> s(int i, @InterfaceC5183ar HA0<? super Map<K, V>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        Map h = C8683p81.h(i);
        ha0.invoke(h);
        return C8683p81.d(h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <K, V> void s0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(map2, "map");
        map.putAll(map2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final <K, V> Map<K, V> t(@InterfaceC5183ar HA0<? super Map<K, V>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        Map g = C8683p81.g();
        ha0.invoke(g);
        return C8683p81.d(g);
    }

    @XP0
    public static final <K, V> void t0(Map<? super K, ? super V> map, C4180Rx1<? extends K, ? extends V> c4180Rx1) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(c4180Rx1, "pair");
        map.put((K) c4180Rx1.e(), (V) c4180Rx1.f());
    }

    @XP0
    public static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        C6562gT0.p(entry, "<this>");
        return entry.getKey();
    }

    @XP0
    public static final <K, V> void u0(Map<? super K, ? super V> map, B02<? extends C4180Rx1<? extends K, ? extends V>> b02) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(b02, "pairs");
        x0(map, b02);
    }

    @XP0
    public static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        C6562gT0.p(entry, "<this>");
        return entry.getValue();
    }

    @XP0
    public static final <K, V> void v0(Map<? super K, ? super V> map, C4180Rx1<? extends K, ? extends V>[] c4180Rx1Arr) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(c4180Rx1Arr, "pairs");
        y0(map, c4180Rx1Arr);
    }

    @XP0
    public static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k) {
        C6562gT0.p(map, "<this>");
        return map.containsKey(k);
    }

    public static final <K, V> void w0(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends C4180Rx1<? extends K, ? extends V>> iterable) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(iterable, "pairs");
        for (C4180Rx1<? extends K, ? extends V> c4180Rx1 : iterable) {
            map.put((K) c4180Rx1.a(), (V) c4180Rx1.b());
        }
    }

    @XP0
    public static final <K> boolean x(Map<? extends K, ?> map, K k) {
        C6562gT0.p(map, "<this>");
        return map.containsKey(k);
    }

    public static final <K, V> void x0(@NotNull Map<? super K, ? super V> map, @NotNull B02<? extends C4180Rx1<? extends K, ? extends V>> b02) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(b02, "pairs");
        for (C4180Rx1<? extends K, ? extends V> c4180Rx1 : b02) {
            map.put((K) c4180Rx1.a(), (V) c4180Rx1.b());
        }
    }

    @XP0
    public static final <K, V> boolean y(Map<K, ? extends V> map, V v) {
        C6562gT0.p(map, "<this>");
        return map.containsValue(v);
    }

    public static final <K, V> void y0(@NotNull Map<? super K, ? super V> map, @NotNull C4180Rx1<? extends K, ? extends V>[] c4180Rx1Arr) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(c4180Rx1Arr, "pairs");
        for (C4180Rx1<? extends K, ? extends V> c4180Rx1 : c4180Rx1Arr) {
            map.put((K) c4180Rx1.a(), (V) c4180Rx1.b());
        }
    }

    @NotNull
    public static <K, V> Map<K, V> z() {
        C5363bb0 c5363bb0 = C5363bb0.X;
        C6562gT0.n(c5363bb0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c5363bb0;
    }

    @XP0
    public static final <K, V> V z0(Map<? extends K, V> map, K k) {
        C6562gT0.p(map, "<this>");
        return (V) C11313zv2.k(map).remove(k);
    }
}
