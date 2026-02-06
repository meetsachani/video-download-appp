package o;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes4.dex */
public class QS0 extends AbstractC9882u3 {
    public static final AbstractC9882u3 e = new QS0();
    public static final char f = ':';
    public final InterfaceC10759xe2 c;
    public final Map<String, InterfaceC10759xe2> d;

    public QS0() {
        this((Map) null);
    }

    public Map<String, InterfaceC10759xe2> h() {
        return this.d;
    }

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            String C = C2730De2.C(str.substring(0, indexOf));
            int i = indexOf + 1;
            String substring = str.substring(i);
            InterfaceC10759xe2 interfaceC10759xe2 = this.d.get(C);
            if (interfaceC10759xe2 != null) {
                str2 = interfaceC10759xe2.lookup(substring);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
            str = str.substring(i);
        }
        InterfaceC10759xe2 interfaceC10759xe22 = this.c;
        if (interfaceC10759xe22 == null) {
            return null;
        }
        return interfaceC10759xe22.lookup(str);
    }

    public String toString() {
        return super.toString() + " [stringLookupMap=" + this.d + ", defaultStringLookup=" + this.c + C6566gU0.g;
    }

    public QS0(Map<String, InterfaceC10759xe2> map, InterfaceC10759xe2 interfaceC10759xe2, boolean z) {
        this.c = interfaceC10759xe2;
        Map<String, InterfaceC10759xe2> map2 = (Map) map.entrySet().stream().collect(Collectors.toMap(new Function() { // from class: o.OS0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String C;
                C = C2730De2.C((String) ((Map.Entry) obj).getKey());
                return C;
            }
        }, new Function() { // from class: o.PS0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (InterfaceC10759xe2) ((Map.Entry) obj).getValue();
            }
        }));
        this.d = map2;
        if (z) {
            C2730De2.a.d(map2);
        }
    }

    public <V> QS0(Map<String, V> map) {
        this(C2730De2.a.v(map));
    }

    public QS0(InterfaceC10759xe2 interfaceC10759xe2) {
        this(Collections.EMPTY_MAP, interfaceC10759xe2, true);
    }
}
