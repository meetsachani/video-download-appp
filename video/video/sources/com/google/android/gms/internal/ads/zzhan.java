package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhan {
    public static final zzhan c = new zzhan();
    public static final /* synthetic */ int d = 0;
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final zzhax a = new zzgzv();

    private zzhan() {
    }

    public static zzhan a() {
        return c;
    }

    public final zzhaw b(Class cls) {
        zzgzf.c(cls, "messageType");
        ConcurrentMap concurrentMap = this.b;
        zzhaw zzhawVar = (zzhaw) concurrentMap.get(cls);
        if (zzhawVar == null) {
            zzhawVar = this.a.a(cls);
            zzgzf.c(cls, "messageType");
            zzhaw zzhawVar2 = (zzhaw) concurrentMap.putIfAbsent(cls, zzhawVar);
            if (zzhawVar2 != null) {
                return zzhawVar2;
            }
        }
        return zzhawVar;
    }
}
