package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkx implements Runnable {
    public final /* synthetic */ zzo X;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcv Y;
    public final /* synthetic */ zzkp Z;

    public zzkx(zzkp zzkpVar, zzo zzoVar, com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        this.Z = zzkpVar;
        this.X = zzoVar;
        this.Y = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        try {
            if (this.Z.h().J().y()) {
                zzfkVar = this.Z.d;
                if (zzfkVar == null) {
                    this.Z.j().G().a("Failed to get app instance id");
                    return;
                }
                Preconditions.r(this.X);
                String J5 = zzfkVar.J5(this.X);
                if (J5 != null) {
                    this.Z.r().U(J5);
                    this.Z.h().g.b(J5);
                }
                this.Z.h0();
                this.Z.i().R(this.Y, J5);
                return;
            }
            this.Z.j().M().a("Analytics storage consent denied; will not get app instance id");
            this.Z.r().U(null);
            this.Z.h().g.b(null);
        } catch (RemoteException e) {
            this.Z.j().G().b("Failed to get app instance id", e);
        } finally {
            this.Z.i().R(this.Y, null);
        }
    }
}
