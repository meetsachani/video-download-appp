package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzli implements Runnable {
    public final /* synthetic */ boolean X = true;
    public final /* synthetic */ zzo Y;
    public final /* synthetic */ zzad Y0;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ zzad Z0;
    public final /* synthetic */ zzkp a1;

    public zzli(zzkp zzkpVar, boolean z, zzo zzoVar, boolean z2, zzad zzadVar, zzad zzadVar2) {
        this.a1 = zzkpVar;
        this.Y = zzoVar;
        this.Z = z2;
        this.Y0 = zzadVar;
        this.Z0 = zzadVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzad zzadVar;
        zzfkVar = this.a1.d;
        if (zzfkVar == null) {
            this.a1.j().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.X) {
            Preconditions.r(this.Y);
            zzkp zzkpVar = this.a1;
            if (this.Z) {
                zzadVar = null;
            } else {
                zzadVar = this.Y0;
            }
            zzkpVar.K(zzfkVar, zzadVar, this.Y);
        } else {
            try {
                if (TextUtils.isEmpty(this.Z0.X)) {
                    Preconditions.r(this.Y);
                    zzfkVar.J7(this.Y0, this.Y);
                } else {
                    zzfkVar.p3(this.Y0);
                }
            } catch (RemoteException e) {
                this.a1.j().G().b("Failed to send conditional user property to the service", e);
            }
        }
        this.a1.h0();
    }
}
