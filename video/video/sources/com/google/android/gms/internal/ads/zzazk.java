package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzazk {
    @InterfaceC5056aJ2
    public int b;
    public final Object a = new Object();
    public final List c = new LinkedList();

    public final void a(zzazj zzazjVar) {
        synchronized (this.a) {
            try {
                List list = this.c;
                if (list.size() >= 10) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Queue is full, current size = " + list.size());
                    list.remove(0);
                }
                int i2 = this.b;
                this.b = i2 + 1;
                zzazjVar.g(i2);
                zzazjVar.k();
                list.add(zzazjVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(zzazj zzazjVar) {
        synchronized (this.a) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    zzazj zzazjVar2 = (zzazj) it.next();
                    if (!com.google.android.gms.ads.internal.zzv.t().j().G()) {
                        if (!zzazjVar.equals(zzazjVar2) && zzazjVar2.c().equals(zzazjVar.c())) {
                            it.remove();
                            return true;
                        }
                    } else if (!com.google.android.gms.ads.internal.zzv.t().j().J() && !zzazjVar.equals(zzazjVar2) && zzazjVar2.d().equals(zzazjVar.d())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(zzazj zzazjVar) {
        synchronized (this.a) {
            try {
                if (this.c.contains(zzazjVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
