package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzapq {
    public final int a;
    public final byte[] b;
    @InterfaceC11300zs1
    public final Map c;
    @InterfaceC11300zs1
    public final List d;
    public final boolean e;

    public zzapq(int i, byte[] bArr, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 List list, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = list == null ? null : Collections.unmodifiableList(list);
        this.e = z;
    }

    @InterfaceC11300zs1
    public static List a(@InterfaceC11300zs1 Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzapm((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzapq(int i, byte[] bArr, @InterfaceC11300zs1 Map map, boolean z, long j) {
        this(i, bArr, map, a(map), z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzapq(int i, byte[] bArr, boolean z, long j, @InterfaceC11300zs1 List list) {
        this(i, bArr, r0, list, z, j);
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzapm zzapmVar = (zzapm) it.next();
                treeMap.put(zzapmVar.a(), zzapmVar.b());
            }
        }
    }

    @Deprecated
    public zzapq(byte[] bArr, @InterfaceC11300zs1 Map map) {
        this(200, bArr, map, a(map), false, 0L);
    }
}
