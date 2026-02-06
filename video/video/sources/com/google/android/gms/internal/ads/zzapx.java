package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzapx {
    public final AtomicInteger a;
    public final Set b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final zzape e;
    public final zzapn f;
    public final zzapo[] g;
    public zzapg h;
    public final List i;
    public final List j;
    public final zzapl k;

    public zzapx(zzape zzapeVar, zzapn zzapnVar, int i) {
        zzapl zzaplVar = new zzapl(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = zzapeVar;
        this.f = zzapnVar;
        this.g = new zzapo[4];
        this.k = zzaplVar;
    }

    public final zzapu a(zzapu zzapuVar) {
        zzapuVar.j(this);
        Set set = this.b;
        synchronized (set) {
            set.add(zzapuVar);
        }
        zzapuVar.l(this.a.incrementAndGet());
        zzapuVar.r("add-to-queue");
        c(zzapuVar, 0);
        this.c.add(zzapuVar);
        return zzapuVar;
    }

    public final void b(zzapu zzapuVar) {
        Set set = this.b;
        synchronized (set) {
            set.remove(zzapuVar);
        }
        List<zzapw> list = this.i;
        synchronized (list) {
            try {
                for (zzapw zzapwVar : list) {
                    zzapwVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(zzapuVar, 5);
    }

    public final void c(zzapu zzapuVar, int i) {
        List<zzapv> list = this.j;
        synchronized (list) {
            try {
                for (zzapv zzapvVar : list) {
                    zzapvVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        zzapg zzapgVar = this.h;
        if (zzapgVar != null) {
            zzapgVar.b();
        }
        zzapo[] zzapoVarArr = this.g;
        for (int i = 0; i < 4; i++) {
            zzapo zzapoVar = zzapoVarArr[i];
            if (zzapoVar != null) {
                zzapoVar.a();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.c;
        PriorityBlockingQueue priorityBlockingQueue2 = this.d;
        zzape zzapeVar = this.e;
        zzapl zzaplVar = this.k;
        zzapg zzapgVar2 = new zzapg(priorityBlockingQueue, priorityBlockingQueue2, zzapeVar, zzaplVar);
        this.h = zzapgVar2;
        zzapgVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzapo zzapoVar2 = new zzapo(priorityBlockingQueue2, this.f, zzapeVar, zzaplVar);
            zzapoVarArr[i2] = zzapoVar2;
            zzapoVar2.start();
        }
    }
}
