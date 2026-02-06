package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zad<T> extends zac {
    public final TaskCompletionSource<T> b;

    public zad(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(@InterfaceC5670cr1 Status status) {
        this.b.d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(@InterfaceC5670cr1 Exception exc) {
        this.b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq<?> zabqVar) throws DeadObjectException {
        try {
            h(zabqVar);
        } catch (DeadObjectException e) {
            a(zai.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(zai.e(e2));
        } catch (RuntimeException e3) {
            this.b.d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void d(@InterfaceC5670cr1 zaad zaadVar, boolean z) {
    }

    public abstract void h(zabq<?> zabqVar) throws RemoteException;
}
