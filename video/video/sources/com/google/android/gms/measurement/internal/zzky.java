package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzky implements Runnable {
    public final /* synthetic */ AtomicReference X;
    public final /* synthetic */ zzo Y;
    public final /* synthetic */ zzkp Z;

    public zzky(zzkp zzkpVar, AtomicReference atomicReference, zzo zzoVar) {
        this.Z = zzkpVar;
        this.X = atomicReference;
        this.Y = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        synchronized (this.X) {
            try {
            } catch (RemoteException e) {
                this.Z.j().G().b("Failed to get app instance id", e);
                this.X.notify();
            }
            if (this.Z.h().J().y()) {
                zzfkVar = this.Z.d;
                if (zzfkVar == null) {
                    this.Z.j().G().a("Failed to get app instance id");
                    this.X.notify();
                    return;
                }
                Preconditions.r(this.Y);
                this.X.set(zzfkVar.J5(this.Y));
                String str = (String) this.X.get();
                if (str != null) {
                    this.Z.r().U(str);
                    this.Z.h().g.b(str);
                }
                this.Z.h0();
                this.X.notify();
                return;
            }
            this.Z.j().M().a("Analytics storage consent denied; will not get app instance id");
            this.Z.r().U(null);
            this.Z.h().g.b(null);
            this.X.set(null);
            this.X.notify();
        }
    }
}
