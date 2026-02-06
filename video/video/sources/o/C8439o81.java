package o;

import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n350#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:112,6\n*E\n"})
/* renamed from: o.o81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8439o81 {
    @InterfaceC8046mW0(name = "getOrImplicitDefaultNullable")
    @HK1
    public static final <K, V> V a(@NotNull Map<K, ? extends V> map, K k) {
        C6562gT0.p(map, "<this>");
        if (map instanceof InterfaceC6722h81) {
            return (V) ((InterfaceC6722h81) map).N3(k);
        }
        V v = map.get(k);
        if (v == null && !map.containsKey(k)) {
            throw new NoSuchElementException("Key " + k + " is missing in the map.");
        }
        return v;
    }

    @NotNull
    public static final <K, V> Map<K, V> b(@NotNull Map<K, ? extends V> map, @NotNull HA0<? super K, ? extends V> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (map instanceof InterfaceC6722h81) {
            return b(((InterfaceC6722h81) map).V(), ha0);
        }
        return new C6965i81(map, ha0);
    }

    @InterfaceC8046mW0(name = "withDefaultMutable")
    @NotNull
    public static final <K, V> Map<K, V> c(@NotNull Map<K, V> map, @NotNull HA0<? super K, ? extends V> ha0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (map instanceof InterfaceC9819tn1) {
            return c(((InterfaceC9819tn1) map).V(), ha0);
        }
        return new C10062un1(map, ha0);
    }
}
