package o;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class P80 {
    public static final Map<Long, N80> a;
    public static final Map<N80, List<Long>> b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        N80 n80 = N80.n;
        hashMap.put(1L, n80);
        hashMap2.put(n80, Collections.singletonList(1L));
        hashMap.put(2L, N80.p);
        hashMap2.put((N80) hashMap.get(2L), Collections.singletonList(2L));
        N80 n802 = N80.q;
        hashMap.put(4L, n802);
        hashMap2.put(n802, Collections.singletonList(4L));
        N80 n803 = N80.r;
        hashMap.put(8L, n803);
        hashMap2.put(n803, Collections.singletonList(8L));
        List<Long> asList = Arrays.asList(64L, 128L, 16L, 32L);
        for (Long l : asList) {
            a.put(l, N80.s);
        }
        b.put(N80.s, asList);
        List<Long> asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        for (Long l2 : asList2) {
            a.put(l2, N80.t);
        }
        b.put(N80.t, asList2);
    }

    public static Long a(N80 n80, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = b.get(n80);
        if (list != null) {
            supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
            for (Long l : list) {
                if (supportedProfiles.contains(l)) {
                    return l;
                }
            }
            return null;
        }
        return null;
    }

    public static N80 b(long j) {
        return a.get(Long.valueOf(j));
    }
}
