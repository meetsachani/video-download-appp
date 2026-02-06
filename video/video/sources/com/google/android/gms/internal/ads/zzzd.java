package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzzd {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Handler handler, zzze zzzeVar) {
        c(zzzeVar);
        this.a.add(new zzzc(handler, zzzeVar));
    }

    public final void b(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final zzzc zzzcVar = (zzzc) it.next();
            z = zzzcVar.c;
            if (!z) {
                handler = zzzcVar.a;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzze zzzeVar;
                        zzzeVar = zzzc.this.b;
                        zzzeVar.e(i, j, j2);
                    }
                });
            }
        }
    }

    public final void c(zzze zzzeVar) {
        zzze zzzeVar2;
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzzc zzzcVar = (zzzc) it.next();
            zzzeVar2 = zzzcVar.b;
            if (zzzeVar2 == zzzeVar) {
                zzzcVar.c();
                copyOnWriteArrayList.remove(zzzcVar);
            }
        }
    }
}
