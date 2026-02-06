package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zai {
    public final A b;

    public zae(int i, A a) {
        super(i);
        this.b = (A) Preconditions.s(a, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(@InterfaceC5670cr1 Status status) {
        try {
            this.b.b(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(@InterfaceC5670cr1 Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.b.b(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq<?> zabqVar) throws DeadObjectException {
        try {
            this.b.A(zabqVar.s());
        } catch (RuntimeException e) {
            b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(@InterfaceC5670cr1 zaad zaadVar, boolean z) {
        zaadVar.c(this.b, z);
    }
}
