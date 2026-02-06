package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
final class zzaqh implements zzapt {
    public final Map a = new HashMap();
    @InterfaceC11300zs1
    public final zzapg b;
    @InterfaceC11300zs1
    public final BlockingQueue c;
    public final zzapl d;

    public zzaqh(@InterfaceC5670cr1 zzapg zzapgVar, @InterfaceC5670cr1 BlockingQueue blockingQueue, zzapl zzaplVar) {
        this.d = zzaplVar;
        this.b = zzapgVar;
        this.c = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final synchronized void a(zzapu zzapuVar) {
        try {
            Map map = this.a;
            String o2 = zzapuVar.o();
            List list = (List) map.remove(o2);
            if (list != null && !list.isEmpty()) {
                if (zzaqg.b) {
                    zzaqg.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), o2);
                }
                zzapu zzapuVar2 = (zzapu) list.remove(0);
                map.put(o2, list);
                zzapuVar2.z(this);
                try {
                    this.c.put(zzapuVar2);
                } catch (InterruptedException e) {
                    zzaqg.b("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.b.b();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void b(zzapu zzapuVar, zzaqa zzaqaVar) {
        List<zzapu> list;
        zzapd zzapdVar = zzaqaVar.b;
        if (zzapdVar != null && !zzapdVar.a(System.currentTimeMillis())) {
            String o2 = zzapuVar.o();
            synchronized (this) {
                list = (List) this.a.remove(o2);
            }
            if (list != null) {
                if (zzaqg.b) {
                    zzaqg.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), o2);
                }
                for (zzapu zzapuVar2 : list) {
                    this.d.b(zzapuVar2, zzaqaVar, null);
                }
                return;
            }
            return;
        }
        a(zzapuVar);
    }

    public final synchronized boolean c(zzapu zzapuVar) {
        try {
            Map map = this.a;
            String o2 = zzapuVar.o();
            if (map.containsKey(o2)) {
                List list = (List) map.get(o2);
                if (list == null) {
                    list = new ArrayList();
                }
                zzapuVar.r("waiting-for-response");
                list.add(zzapuVar);
                map.put(o2, list);
                if (zzaqg.b) {
                    zzaqg.a("Request for cacheKey=%s is in flight, putting on hold.", o2);
                }
                return true;
            }
            map.put(o2, null);
            zzapuVar.z(this);
            if (zzaqg.b) {
                zzaqg.a("new request, sending to network %s", o2);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
