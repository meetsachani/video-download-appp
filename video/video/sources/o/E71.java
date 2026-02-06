package o;

import java.util.Map;

@InterfaceC8046mW0(name = "MapAccessorsKt")
/* loaded from: classes3.dex */
public final class E71 {
    @XP0
    public static final <V, V1 extends V> V1 a(Map<? super String, ? extends V> map, Object obj, TW0<?> tw0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(tw0, "property");
        return (V1) C8439o81.a(map, tw0.getName());
    }

    @XP0
    @InterfaceC8046mW0(name = "getVar")
    public static final <V, V1 extends V> V1 b(Map<? super String, ? extends V> map, Object obj, TW0<?> tw0) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(tw0, "property");
        return (V1) C8439o81.a(map, tw0.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <V> void c(Map<? super String, ? super V> map, Object obj, TW0<?> tw0, V v) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(tw0, "property");
        map.put(tw0.getName(), v);
    }
}
