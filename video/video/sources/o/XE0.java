package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.RP1;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1869#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
/* loaded from: classes3.dex */
public class XE0 {
    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K> Map<K, Integer> a(@NotNull UE0<T, ? extends K> ue0) {
        boolean z;
        C6562gT0.p(ue0, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = ue0.b();
        while (b.hasNext()) {
            K a = ue0.a(b.next());
            Object obj = linkedHashMap.get(a);
            if (obj == null && !linkedHashMap.containsKey(a)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = new RP1.f();
            }
            RP1.f fVar = (RP1.f) obj;
            fVar.X++;
            linkedHashMap.put(a, fVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C6562gT0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            C11313zv2.m(entry).setValue(Integer.valueOf(((RP1.f) entry.getValue()).X));
        }
        return C11313zv2.k(linkedHashMap);
    }

    @XP0
    @HK1
    public static final <K, V, R> Map<K, R> b(Map<K, V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C6562gT0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            C11313zv2.m(entry).setValue(ha0.invoke(entry));
        }
        return C11313zv2.k(map);
    }
}
