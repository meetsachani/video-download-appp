package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkj implements Runnable {
    public final /* synthetic */ Bundle X;
    public final /* synthetic */ zzki Y;
    public final /* synthetic */ long Y0;
    public final /* synthetic */ zzki Z;
    public final /* synthetic */ zzkh Z0;

    public zzkj(zzkh zzkhVar, Bundle bundle, zzki zzkiVar, zzki zzkiVar2, long j) {
        this.Z0 = zzkhVar;
        this.X = bundle;
        this.Y = zzkiVar;
        this.Z = zzkiVar2;
        this.Y0 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkh.J(this.Z0, this.X, this.Y, this.Z, this.Y0);
    }
}
