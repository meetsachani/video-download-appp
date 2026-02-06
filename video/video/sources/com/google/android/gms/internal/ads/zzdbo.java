package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class zzdbo {
    public final Map X = new HashMap();

    public zzdbo(Set set) {
        d1(set);
    }

    public final synchronized void W0(zzddq zzddqVar) {
        c1(zzddqVar.a, zzddqVar.b);
    }

    public final synchronized void c1(Object obj, Executor executor) {
        this.X.put(obj, executor);
    }

    public final synchronized void d1(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            W0((zzddq) it.next());
        }
    }

    public final synchronized void g1(final zzdbn zzdbnVar) {
        for (Map.Entry entry : this.X.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbm
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdbn.this.b(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzv.t().w(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
