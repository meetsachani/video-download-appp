package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class S80 {
    public static final Map<Integer, Set<Integer>> a;
    public static final Map<Integer, Set<Integer>> b;
    public static final Map<Integer, Integer> c;
    public static final Map<String, Map<N80, Integer>> d;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        HashMap hashMap3 = new HashMap();
        c = hashMap3;
        HashMap hashMap4 = new HashMap();
        d = hashMap4;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(8, 10)));
        hashMap2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(0, 1);
        hashMap3.put(1, 3);
        hashMap3.put(2, 4);
        hashMap3.put(3, 5);
        hashMap3.put(4, 6);
        HashMap hashMap5 = new HashMap();
        N80 n80 = N80.n;
        hashMap5.put(n80, 1);
        N80 n802 = N80.p;
        hashMap5.put(n802, 2);
        N80 n803 = N80.q;
        hashMap5.put(n803, 4096);
        N80 n804 = N80.r;
        hashMap5.put(n804, 8192);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(n80, 1);
        hashMap6.put(n802, 2);
        hashMap6.put(n803, 4096);
        hashMap6.put(n804, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(n80, 1);
        hashMap7.put(n802, 4);
        hashMap7.put(n803, 4096);
        hashMap7.put(n804, 16384);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(N80.s, 256);
        hashMap8.put(N80.t, 512);
        hashMap4.put(C4128Rj1.k, hashMap5);
        hashMap4.put(C4128Rj1.n, hashMap6);
        hashMap4.put(C4128Rj1.m, hashMap7);
        hashMap4.put(C4128Rj1.w, hashMap8);
    }

    public static int a(String str, N80 n80) {
        Integer num;
        Map<N80, Integer> map = d.get(str);
        if (map != null && (num = map.get(n80)) != null) {
            return num.intValue();
        }
        return -1;
    }

    public static Set<Integer> b(N80 n80) {
        Set<Integer> set = a.get(Integer.valueOf(n80.a()));
        if (set == null) {
            return Collections.EMPTY_SET;
        }
        return set;
    }

    public static Set<Integer> c(N80 n80) {
        Set<Integer> set = b.get(Integer.valueOf(n80.b()));
        if (set == null) {
            return Collections.EMPTY_SET;
        }
        return set;
    }
}
