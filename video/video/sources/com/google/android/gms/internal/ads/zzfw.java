package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;
import o.C10323vs;
import o.HT1;
import o.InterfaceC11300zs1;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class zzfw {
    public final zzfv a;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final PriorityQueue d = new PriorityQueue();
    public int e = -1;
    @InterfaceC11300zs1
    public zzfu f;

    public zzfw(zzfv zzfvVar) {
        this.a = zzfvVar;
    }

    public final int a() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r7 < ((com.google.android.gms.internal.ads.zzfu) r0.peek()).Y) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j, zzek zzekVar) {
        zzek zzekVar2;
        zzfu zzfuVar;
        int i = this.e;
        if (i != 0) {
            if (i != -1) {
                PriorityQueue priorityQueue = this.d;
                if (priorityQueue.size() >= this.e) {
                    String str = zzeu.a;
                }
            }
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque.isEmpty()) {
                zzekVar2 = new zzek();
            } else {
                zzekVar2 = (zzek) arrayDeque.pop();
            }
            zzekVar2.i(zzekVar.u());
            boolean z = false;
            System.arraycopy(zzekVar.n(), zzekVar.w(), zzekVar2.n(), 0, zzekVar2.u());
            zzfu zzfuVar2 = this.f;
            if (zzfuVar2 != null && j == zzfuVar2.Y) {
                zzfuVar2.X.add(zzekVar2);
                return;
            }
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                zzfuVar = new zzfu();
            } else {
                zzfuVar = (zzfu) arrayDeque2.pop();
            }
            if (j != C10323vs.b) {
                z = true;
            }
            zzdc.d(z);
            List list = zzfuVar.X;
            zzdc.f(list.isEmpty());
            zzfuVar.Y = j;
            list.add(zzekVar2);
            this.d.add(zzfuVar);
            this.f = zzfuVar;
            int i2 = this.e;
            if (i2 != -1) {
                f(i2);
                return;
            }
            return;
        }
        this.a.a(j, zzekVar);
    }

    public final void c() {
        this.d.clear();
    }

    public final void d() {
        f(0);
    }

    public final void e(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        this.e = i;
        f(i);
    }

    public final void f(int i) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.d;
            if (priorityQueue.size() > i) {
                zzfu zzfuVar = (zzfu) priorityQueue.poll();
                String str = zzeu.a;
                int i2 = 0;
                while (true) {
                    list = zzfuVar.X;
                    if (i2 >= list.size()) {
                        break;
                    }
                    this.a.a(zzfuVar.Y, (zzek) list.get(i2));
                    this.b.push((zzek) list.get(i2));
                    i2++;
                }
                list.clear();
                zzfu zzfuVar2 = this.f;
                if (zzfuVar2 != null && zzfuVar2.Y == zzfuVar.Y) {
                    this.f = null;
                }
                this.c.push(zzfuVar);
            } else {
                return;
            }
        }
    }
}
