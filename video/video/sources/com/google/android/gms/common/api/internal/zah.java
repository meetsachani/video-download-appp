package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zah extends zad<Boolean> {
    public final ListenerHolder.ListenerKey<?> c;

    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.c = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void d(@InterfaceC5670cr1 zaad zaadVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq<?> zabqVar) {
        zaci zaciVar = zabqVar.u().get(this.c);
        if (zaciVar != null && zaciVar.a.f()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @InterfaceC11300zs1
    public final Feature[] g(zabq<?> zabqVar) {
        zaci zaciVar = zabqVar.u().get(this.c);
        if (zaciVar == null) {
            return null;
        }
        return zaciVar.a.c();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void h(zabq<?> zabqVar) throws RemoteException {
        zaci remove = zabqVar.u().remove(this.c);
        if (remove != null) {
            remove.b.b(zabqVar.s(), this.b);
            remove.a.a();
            return;
        }
        this.b.e(Boolean.FALSE);
    }
}
