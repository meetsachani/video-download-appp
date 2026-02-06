package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.InterfaceC8710pF0;
import o.OB;

/* loaded from: classes2.dex */
public final class zzdw {
    public final zzdg a;
    public final zzdq b;
    public final zzdu c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    @InterfaceC8710pF0("releasedLock")
    public boolean h;
    public boolean i;

    public zzdw(Looper looper, zzdg zzdgVar, zzdu zzduVar) {
        this(new CopyOnWriteArraySet(), looper, zzdgVar, zzduVar, true);
    }

    public static /* synthetic */ boolean g(zzdw zzdwVar, Message message) {
        Iterator it = zzdwVar.d.iterator();
        while (it.hasNext()) {
            ((zzdv) it.next()).b(zzdwVar.c);
            if (zzdwVar.b.W(1)) {
                break;
            }
        }
        return true;
    }

    @OB
    public final zzdw a(Looper looper, zzdu zzduVar) {
        return new zzdw(this.d, looper, this.a, zzduVar, this.i);
    }

    public final void b(Object obj) {
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new zzdv(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        h();
        ArrayDeque arrayDeque = this.f;
        if (!arrayDeque.isEmpty()) {
            zzdq zzdqVar = this.b;
            if (!zzdqVar.W(1)) {
                zzdqVar.g(zzdqVar.z(1));
            }
            ArrayDeque arrayDeque2 = this.e;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (isEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void d(final int i, final zzdt zzdtVar) {
        h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzds
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzdt zzdtVar2 = zzdtVar;
                    ((zzdv) it.next()).a(i, zzdtVar2);
                }
            }
        });
    }

    public final void e() {
        h();
        synchronized (this.g) {
            this.h = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzdv) it.next()).c(this.c);
        }
        copyOnWriteArraySet.clear();
    }

    public final void f(Object obj) {
        h();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            zzdv zzdvVar = (zzdv) it.next();
            if (zzdvVar.a.equals(obj)) {
                zzdvVar.c(this.c);
                copyOnWriteArraySet.remove(zzdvVar);
            }
        }
    }

    public final void h() {
        boolean z;
        if (!this.i) {
            return;
        }
        if (Thread.currentThread() == this.b.a().getThread()) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
    }

    public zzdw(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdg zzdgVar, zzdu zzduVar, boolean z) {
        this.a = zzdgVar;
        this.d = copyOnWriteArraySet;
        this.c = zzduVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = zzdgVar.d(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdr
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzdw.g(zzdw.this, message);
                return true;
            }
        });
        this.i = z;
    }
}
