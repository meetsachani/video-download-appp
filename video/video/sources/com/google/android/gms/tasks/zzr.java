package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzr {
    public final Object a = new Object();
    public Queue b;
    public boolean c;

    public final void a(@InterfaceC5670cr1 zzq zzqVar) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(zzqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(@InterfaceC5670cr1 Task task) {
        zzq zzqVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        try {
                            zzqVar = (zzq) this.b.poll();
                            if (zzqVar == null) {
                                this.c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    zzqVar.d(task);
                }
            }
        }
    }
}
