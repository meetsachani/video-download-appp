package o;

import java.util.Map;

@InterfaceC8046mW0(name = "CollectionsJDK8Kt")
/* renamed from: o.kF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7475kF {
    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final <K, V> V a(Map<? extends K, ? extends V> map, K k, V v) {
        C6562gT0.p(map, "<this>");
        return map.getOrDefault(k, v);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final <K, V> boolean b(Map<? extends K, ? extends V> map, K k, V v) {
        C6562gT0.p(map, "<this>");
        return C11313zv2.k(map).remove(k, v);
    }
}
