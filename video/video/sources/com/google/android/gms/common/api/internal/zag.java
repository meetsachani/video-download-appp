package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zag<ResultT> extends zac {
    public final TaskApiCall<Api.AnyClient, ResultT> b;
    public final TaskCompletionSource<ResultT> c;
    public final StatusExceptionMapper d;

    public zag(int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.c = taskCompletionSource;
        this.b = taskApiCall;
        this.d = statusExceptionMapper;
        if (i == 2 && taskApiCall.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(@InterfaceC5670cr1 Status status) {
        this.c.d(this.d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(@InterfaceC5670cr1 Exception exc) {
        this.c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq<?> zabqVar) throws DeadObjectException {
        try {
            this.b.b(zabqVar.s(), this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(zai.e(e2));
        } catch (RuntimeException e3) {
            this.c.d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(@InterfaceC5670cr1 zaad zaadVar, boolean z) {
        zaadVar.d(this.c, z);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq<?> zabqVar) {
        return this.b.c();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @InterfaceC11300zs1
    public final Feature[] g(zabq<?> zabqVar) {
        return this.b.e();
    }
}
