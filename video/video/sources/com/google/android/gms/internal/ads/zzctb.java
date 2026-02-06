package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zzctb {
    public final Object a = new Object();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public final int a(String str) {
        Integer num = (Integer) this.b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long b(String str) {
        Long l = (Long) this.d.get(str);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public final void c(String str) {
        int valueOf;
        synchronized (this.a) {
            try {
                ConcurrentHashMap concurrentHashMap = this.b;
                Integer num = (Integer) concurrentHashMap.get(str);
                if (num == null) {
                    valueOf = 1;
                } else {
                    valueOf = Integer.valueOf(num.intValue() + 1);
                }
                concurrentHashMap.put(str, valueOf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str, String str2, long j) {
        ConcurrentHashMap concurrentHashMap = this.c;
        Long l = (Long) concurrentHashMap.get(str2);
        if (l == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.d.put(str, Long.valueOf(j - l.longValue()));
    }

    public final void e(String str, long j) {
        this.c.put(str, Long.valueOf(j));
    }
}
