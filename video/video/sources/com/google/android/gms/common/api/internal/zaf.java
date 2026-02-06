package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zaf extends zad<Void> {
    public final zaci c;

    public zaf(zaci zaciVar, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.c = zaciVar;
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void d(@InterfaceC5670cr1 zaad zaadVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq<?> zabqVar) {
        return this.c.a.f();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @InterfaceC11300zs1
    public final Feature[] g(zabq<?> zabqVar) {
        return this.c.a.c();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void h(zabq<?> zabqVar) throws RemoteException {
        this.c.a.d(zabqVar.s(), this.b);
        ListenerHolder.ListenerKey<?> b = this.c.a.b();
        if (b != null) {
            zabqVar.u().put(b, this.c);
        }
    }
}
