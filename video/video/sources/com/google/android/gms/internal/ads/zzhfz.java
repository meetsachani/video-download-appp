package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhfz extends zzhfr {
    static {
        zzhfw.a(Collections.EMPTY_MAP);
    }

    public /* synthetic */ zzhfz(Map map, zzhfx zzhfxVar) {
        super(map);
    }

    public static zzhfy c(int i) {
        return new zzhfy(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: d */
    public final Map b() {
        LinkedHashMap b = zzhfs.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            b.put(entry.getKey(), ((zzhge) entry.getValue()).b());
        }
        return Collections.unmodifiableMap(b);
    }
}
