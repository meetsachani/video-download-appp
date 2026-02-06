package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzdin extends com.google.android.gms.ads.internal.client.zzdz {
    public final Object X = new Object();
    @InterfaceC10571ws1
    public final com.google.android.gms.ads.internal.client.zzea Y;
    @InterfaceC10571ws1
    public final zzbqa Z;

    public zzdin(@InterfaceC10571ws1 com.google.android.gms.ads.internal.client.zzea zzeaVar, @InterfaceC10571ws1 zzbqa zzbqaVar) {
        this.Y = zzeaVar;
        this.Z = zzbqaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float d() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float e() throws RemoteException {
        zzbqa zzbqaVar = this.Z;
        if (zzbqaVar != null) {
            return zzbqaVar.g();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float g() throws RemoteException {
        zzbqa zzbqaVar = this.Z;
        if (zzbqaVar != null) {
            return zzbqaVar.h();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int h() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    @InterfaceC10571ws1
    public final com.google.android.gms.ads.internal.client.zzed i() throws RemoteException {
        synchronized (this.X) {
            try {
                com.google.android.gms.ads.internal.client.zzea zzeaVar = this.Y;
                if (zzeaVar != null) {
                    return zzeaVar.i();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void k() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void l() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void n() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void n0(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void n2(@InterfaceC10571ws1 com.google.android.gms.ads.internal.client.zzed zzedVar) throws RemoteException {
        synchronized (this.X) {
            try {
                com.google.android.gms.ads.internal.client.zzea zzeaVar = this.Y;
                if (zzeaVar != null) {
                    zzeaVar.n2(zzedVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean o() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean p() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean r() throws RemoteException {
        throw new RemoteException();
    }
}
