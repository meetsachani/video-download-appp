package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zab extends ActivityLifecycleObserver {
    public final WeakReference<zaa> a;

    @InterfaceC5056aJ2(otherwise = 2)
    public zab(zaa zaaVar) {
        this.a = new WeakReference<>(zaaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver b(Runnable runnable) {
        zaa zaaVar = this.a.get();
        if (zaaVar != null) {
            zaaVar.o(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
