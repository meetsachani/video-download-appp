package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkt implements Runnable {
    public final /* synthetic */ AtomicReference X;
    public final /* synthetic */ zzo Y;
    public final /* synthetic */ zzkp Y0;
    public final /* synthetic */ Bundle Z;

    public zzkt(zzkp zzkpVar, AtomicReference atomicReference, zzo zzoVar, Bundle bundle) {
        this.Y0 = zzkpVar;
        this.X = atomicReference;
        this.Y = zzoVar;
        this.Z = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        synchronized (this.X) {
            try {
                zzfkVar = this.Y0.d;
            } catch (RemoteException e) {
                this.Y0.j().G().b("Failed to get trigger URIs; remote exception", e);
                this.X.notify();
            }
            if (zzfkVar == null) {
                this.Y0.j().G().a("Failed to get trigger URIs; not connected to service");
                this.X.notify();
                return;
            }
            Preconditions.r(this.Y);
            this.X.set(zzfkVar.f4(this.Y, this.Z));
            this.Y0.h0();
            this.X.notify();
        }
    }
}
