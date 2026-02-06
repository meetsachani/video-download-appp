package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzcdn {
    public final ArrayList a = new ArrayList();
    public long b;

    public final long a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((zzgt) it.next()).d().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.b = Math.max(this.b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.b;
    }

    public final void b(zzgt zzgtVar) {
        this.a.add(zzgtVar);
    }
}
