package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfdo {
    public final Deque a = new LinkedBlockingDeque();
    public final Callable b;
    public final zzgdj c;

    public zzfdo(Callable callable, zzgdj zzgdjVar) {
        this.b = callable;
        this.c = zzgdjVar;
    }

    @InterfaceC11300zs1
    public final synchronized InterfaceFutureC8411o11 a() {
        c(1);
        return (InterfaceFutureC8411o11) this.a.poll();
    }

    public final synchronized void b(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        this.a.addFirst(interfaceFutureC8411o11);
    }

    public final synchronized void c(int i) {
        Deque deque = this.a;
        int size = i - deque.size();
        for (int i2 = 0; i2 < size; i2++) {
            deque.add(this.c.I2(this.b));
        }
    }
}
