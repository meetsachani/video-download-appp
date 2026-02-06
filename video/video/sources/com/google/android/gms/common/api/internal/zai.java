package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class zai {
    public final int a;

    public zai(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(@InterfaceC5670cr1 Status status);

    public abstract void b(@InterfaceC5670cr1 Exception exc);

    public abstract void c(zabq<?> zabqVar) throws DeadObjectException;

    public abstract void d(@InterfaceC5670cr1 zaad zaadVar, boolean z);
}
