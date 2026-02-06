package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC10389w71;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2(otherwise = 2)
/* loaded from: classes2.dex */
final class zaa extends LifecycleCallback {
    public List<Runnable> Y;

    public zaa(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.Y = new ArrayList();
        this.X.a("LifecycleObserverOnStop", this);
    }

    public static /* bridge */ /* synthetic */ zaa m(Activity activity) {
        zaa zaaVar;
        synchronized (activity) {
            try {
                LifecycleFragment c = LifecycleCallback.c(activity);
                zaaVar = (zaa) c.c("LifecycleObserverOnStop", zaa.class);
                if (zaaVar == null) {
                    zaaVar = new zaa(c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zaaVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @InterfaceC10389w71
    public final void l() {
        List<Runnable> list;
        synchronized (this) {
            list = this.Y;
            this.Y = new ArrayList();
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
    }

    public final synchronized void o(Runnable runnable) {
        this.Y.add(runnable);
    }
}
