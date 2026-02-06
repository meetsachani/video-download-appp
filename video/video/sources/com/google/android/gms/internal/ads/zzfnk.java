package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfnk {
    public final BlockingQueue a;
    public final ThreadPoolExecutor b;
    public final ArrayDeque c = new ArrayDeque();
    public zzfnj d = null;

    public zzfnk() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void a(zzfnj zzfnjVar) {
        this.d = null;
        c();
    }

    public final void b(zzfnj zzfnjVar) {
        zzfnjVar.b(this);
        this.c.add(zzfnjVar);
        if (this.d == null) {
            c();
        }
    }

    public final void c() {
        zzfnj zzfnjVar = (zzfnj) this.c.poll();
        this.d = zzfnjVar;
        if (zzfnjVar != null) {
            zzfnjVar.executeOnExecutor(this.b, new Object[0]);
        }
    }
}
