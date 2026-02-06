package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlk implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcv Y0;
    public final /* synthetic */ zzo Z;
    public final /* synthetic */ zzkp Z0;

    public zzlk(zzkp zzkpVar, String str, String str2, zzo zzoVar, com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        this.Z0 = zzkpVar;
        this.X = str;
        this.Y = str2;
        this.Z = zzoVar;
        this.Y0 = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzfkVar = this.Z0.d;
            if (zzfkVar == null) {
                this.Z0.j().G().c("Failed to get conditional properties; not connected to service", this.X, this.Y);
                return;
            }
            Preconditions.r(this.Z);
            ArrayList<Bundle> t0 = zznd.t0(zzfkVar.u1(this.X, this.Y, this.Z));
            this.Z0.h0();
            this.Z0.i().S(this.Y0, t0);
        } catch (RemoteException e) {
            this.Z0.j().G().d("Failed to get conditional properties; remote exception", this.X, this.Y, e);
        } finally {
            this.Z0.i().S(this.Y0, arrayList);
        }
    }
}
