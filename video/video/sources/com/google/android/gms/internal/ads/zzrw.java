package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC11300zs1;
import o.OB;

/* loaded from: classes2.dex */
public final class zzrw {
    public final int a;
    @InterfaceC11300zs1
    public final zzvb b;
    public final CopyOnWriteArrayList c;

    public zzrw(CopyOnWriteArrayList copyOnWriteArrayList, int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = zzvbVar;
    }

    @OB
    public final zzrw a(int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        return new zzrw(this.c, 0, zzvbVar);
    }

    public final void b(Handler handler, zzrx zzrxVar) {
        this.c.add(new zzrv(handler, zzrxVar));
    }

    public final void c(zzrx zzrxVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzrv zzrvVar = (zzrv) it.next();
            if (zzrvVar.a == zzrxVar) {
                copyOnWriteArrayList.remove(zzrvVar);
            }
        }
    }

    public zzrw() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
