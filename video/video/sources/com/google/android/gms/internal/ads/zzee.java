package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzee {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ zzei c;

    public zzee(zzei zzeiVar, zzzh zzzhVar, Executor executor) {
        this.c = zzeiVar;
        this.a = new WeakReference(zzzhVar);
        this.b = executor;
    }

    public static /* synthetic */ void a(zzee zzeeVar) {
        zzzh zzzhVar = (zzzh) zzeeVar.a.get();
        if (zzzhVar != null) {
            zzzhVar.a.l(zzeeVar.c.a());
        }
    }

    public final void b() {
        this.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzed
            @Override // java.lang.Runnable
            public final void run() {
                zzee.a(zzee.this);
            }
        });
    }

    public final boolean c() {
        if (this.a.get() == null) {
            return true;
        }
        return false;
    }
}
