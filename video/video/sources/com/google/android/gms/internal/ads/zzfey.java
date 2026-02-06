package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfey {
    public final zzfec a;
    public final zzfew b;
    public final zzfdy c;
    public zzffe e;
    public int f = 1;
    public final ArrayDeque d = new ArrayDeque();

    public zzfey(zzfec zzfecVar, zzfdy zzfdyVar, zzfew zzfewVar) {
        this.a = zzfecVar;
        this.c = zzfdyVar;
        this.b = zzfewVar;
        zzfdyVar.b(new zzfet(this));
    }

    public static /* synthetic */ void c(zzfey zzfeyVar) {
        synchronized (zzfeyVar) {
            zzfeyVar.f = 1;
            zzfeyVar.h();
        }
    }

    @InterfaceC11300zs1
    public final synchronized InterfaceFutureC8411o11 a(zzfex zzfexVar) {
        this.f = 2;
        if (i()) {
            return null;
        }
        return this.e.c(zzfexVar);
    }

    public final synchronized void f(zzfex zzfexVar) {
        this.d.add(zzfexVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        r3 = new com.google.android.gms.internal.ads.zzffe(r4.a, r4.b, r0);
        r4.e = r3;
        r3.d(new com.google.android.gms.internal.ads.zzfeu(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v6)).booleanValue() && !com.google.android.gms.ads.internal.zzv.t().j().g().h()) {
            this.d.clear();
            return;
        }
        if (i()) {
            while (true) {
                ArrayDeque arrayDeque = this.d;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzfex zzfexVar = (zzfex) arrayDeque.pollFirst();
                if (zzfexVar == null || (zzfexVar.a() != null && this.a.c(zzfexVar.a()))) {
                    break;
                }
            }
        }
    }

    public final synchronized boolean i() {
        return this.e == null;
    }
}
