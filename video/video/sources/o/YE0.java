package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* loaded from: classes3.dex */
public class YE0 extends XE0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> c(@NotNull UE0<T, ? extends K> ue0, @NotNull ZA0<? super K, ? super R, ? super T, ? super Boolean, ? extends R> za0) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        C6562gT0.p(za0, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = ue0.b();
        while (b.hasNext()) {
            ?? next = b.next();
            Object obj = (K) ue0.a(next);
            Object obj2 = (Object) linkedHashMap.get(obj);
            if (obj2 == 0 && !linkedHashMap.containsKey(obj)) {
                z = true;
            } else {
                z = false;
            }
            linkedHashMap.put(obj, za0.r(obj, obj2, next, Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M d(@NotNull UE0<T, ? extends K> ue0, @NotNull M m, @NotNull ZA0<? super K, ? super R, ? super T, ? super Boolean, ? extends R> za0) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(za0, "operation");
        Iterator<T> b = ue0.b();
        while (b.hasNext()) {
            ?? next = b.next();
            Object a = ue0.a(next);
            Object obj = (Object) m.get(a);
            if (obj == 0 && !m.containsKey(a)) {
                z = true;
            } else {
                z = false;
            }
            m.put(a, za0.r(a, obj, next, Boolean.valueOf(z)));
        }
        return m;
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K, M extends Map<? super K, Integer>> M e(@NotNull UE0<T, ? extends K> ue0, @NotNull M m) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        C6562gT0.p(m, "destination");
        Iterator<T> b = ue0.b();
        while (b.hasNext()) {
            K a = ue0.a(b.next());
            Object obj = m.get(a);
            if (obj == null && !m.containsKey(a)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = 0;
            }
            m.put(a, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> f(@NotNull UE0<T, ? extends K> ue0, R r, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        C6562gT0.p(va0, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = ue0.b();
        while (b.hasNext()) {
            ?? next = b.next();
            K a = ue0.a(next);
            Object obj = (Object) linkedHashMap.get(a);
            if (obj == null && !linkedHashMap.containsKey(a)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = (Object) r;
            }
            linkedHashMap.put(a, va0.i(obj, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> g(@NotNull UE0<T, ? extends K> ue0, @NotNull VA0<? super K, ? super T, ? extends R> va0, @NotNull XA0<? super K, ? super R, ? super T, ? extends R> xa0) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        C6562gT0.p(va0, "initialValueSelector");
        C6562gT0.p(xa0, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = ue0.b();
        while (b.hasNext()) {
            ?? next = b.next();
            Object obj = (K) ue0.a(next);
            R r = (Object) linkedHashMap.get(obj);
            if (r == null && !linkedHashMap.containsKey(obj)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                r = va0.i(obj, next);
            }
            linkedHashMap.put(obj, xa0.P(obj, r, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M h(@NotNull UE0<T, ? extends K> ue0, @NotNull M m, R r, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(va0, "operation");
        Iterator<T> b = ue0.b();
        while (b.hasNext()) {
            ?? next = b.next();
            K a = ue0.a(next);
            Object obj = (Object) m.get(a);
            if (obj == null && !m.containsKey(a)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = (Object) r;
            }
            m.put(a, va0.i(obj, next));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M i(@NotNull UE0<T, ? extends K> ue0, @NotNull M m, @NotNull VA0<? super K, ? super T, ? extends R> va0, @NotNull XA0<? super K, ? super R, ? super T, ? extends R> xa0) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(va0, "initialValueSelector");
        C6562gT0.p(xa0, "operation");
        Iterator<T> b = ue0.b();
        while (b.hasNext()) {
            ?? next = b.next();
            Object a = ue0.a(next);
            R r = (Object) m.get(a);
            if (r == null && !m.containsKey(a)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                r = va0.i(a, next);
            }
            m.put(a, xa0.P(a, r, next));
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <S, T extends S, K> Map<K, S> j(@NotNull UE0<T, ? extends K> ue0, @NotNull XA0<? super K, ? super S, ? super T, ? extends S> xa0) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        C6562gT0.p(xa0, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b = ue0.b();
        while (b.hasNext()) {
            S s = (Object) b.next();
            Object obj = (Object) ue0.a(s);
            Object obj2 = (Object) linkedHashMap.get(obj);
            if (obj2 == 0 && !linkedHashMap.containsKey(obj)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                s = xa0.P(obj, obj2, s);
            }
            linkedHashMap.put(obj, s);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@NotNull UE0<T, ? extends K> ue0, @NotNull M m, @NotNull XA0<? super K, ? super S, ? super T, ? extends S> xa0) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        C6562gT0.p(m, "destination");
        C6562gT0.p(xa0, "operation");
        Iterator b = ue0.b();
        while (b.hasNext()) {
            S s = (Object) b.next();
            Object obj = (Object) ue0.a(s);
            Object obj2 = (Object) m.get(obj);
            if (obj2 == 0 && !m.containsKey(obj)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                s = xa0.P(obj, obj2, s);
            }
            m.put(obj, s);
        }
        return m;
    }
}
