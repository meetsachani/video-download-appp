package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes2.dex */
final class zad extends zaa {
    public final BaseImplementation.ResultHolder<Status> X;

    public zad(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.X = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void c6(int i) throws RemoteException {
        this.X.a(new Status(i));
    }
}
