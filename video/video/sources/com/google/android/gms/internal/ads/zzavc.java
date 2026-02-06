package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzavc implements Runnable {
    public final /* synthetic */ zzavd X;

    public zzavc(zzavd zzavdVar) {
        this.X = zzavdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfnx zzfnxVar;
        Object obj2;
        zzavd zzavdVar = this.X;
        obj = zzavdVar.i1;
        synchronized (obj) {
            z = zzavdVar.j1;
            if (!z) {
                zzavdVar.j1 = true;
                try {
                    zzavd.n(zzavdVar);
                } catch (Exception e) {
                    zzfnxVar = this.X.a1;
                    zzfnxVar.c(2023, -1L, e);
                }
                zzavd zzavdVar2 = this.X;
                obj2 = zzavdVar2.i1;
                synchronized (obj2) {
                    zzavdVar2.j1 = false;
                }
            }
        }
    }
}
