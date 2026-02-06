package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlf implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ zzo Y;
    public final /* synthetic */ zzbg Y0;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ String Z0;
    public final /* synthetic */ zzkp a1;

    public zzlf(zzkp zzkpVar, boolean z, zzo zzoVar, boolean z2, zzbg zzbgVar, String str) {
        this.a1 = zzkpVar;
        this.X = z;
        this.Y = zzoVar;
        this.Z = z2;
        this.Y0 = zzbgVar;
        this.Z0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzbg zzbgVar;
        zzfkVar = this.a1.d;
        if (zzfkVar == null) {
            this.a1.j().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.X) {
            Preconditions.r(this.Y);
            zzkp zzkpVar = this.a1;
            if (this.Z) {
                zzbgVar = null;
            } else {
                zzbgVar = this.Y0;
            }
            zzkpVar.K(zzfkVar, zzbgVar, this.Y);
        } else {
            try {
                if (TextUtils.isEmpty(this.Z0)) {
                    Preconditions.r(this.Y);
                    zzfkVar.W5(this.Y0, this.Y);
                } else {
                    zzfkVar.l7(this.Y0, this.Z0, this.a1.j().O());
                }
            } catch (RemoteException e) {
                this.a1.j().G().b("Failed to send event to the service", e);
            }
        }
        this.a1.h0();
    }
}
