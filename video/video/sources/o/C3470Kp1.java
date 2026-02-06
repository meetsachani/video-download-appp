package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: o.Kp1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3470Kp1 {
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final List<MG0> d;
    public final boolean e;
    public final long f;

    @Deprecated
    public C3470Kp1(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, a(map), z, j);
    }

    public static List<MG0> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new MG0(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public static Map<String, String> b(List<MG0> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (MG0 mg0 : list) {
            treeMap.put(mg0.a(), mg0.b());
        }
        return treeMap;
    }

    public C3470Kp1(int i, byte[] bArr, boolean z, long j, List<MG0> list) {
        this(i, bArr, b(list), list, z, j);
    }

    @Deprecated
    public C3470Kp1(int i, byte[] bArr, Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0L);
    }

    public C3470Kp1(byte[] bArr) {
        this(200, bArr, false, 0L, (List<MG0>) Collections.EMPTY_LIST);
    }

    @Deprecated
    public C3470Kp1(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    public C3470Kp1(int i, byte[] bArr, Map<String, String> map, List<MG0> list, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        if (list == null) {
            this.d = null;
        } else {
            this.d = Collections.unmodifiableList(list);
        }
        this.e = z;
        this.f = j;
    }
}
