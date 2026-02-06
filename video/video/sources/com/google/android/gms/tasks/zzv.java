package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC10389w71;

/* loaded from: classes3.dex */
final class zzv extends LifecycleCallback {
    public final List Y;

    public zzv(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.Y = new ArrayList();
        this.X.a("TaskOnStopCallback", this);
    }

    public static zzv m(Activity activity) {
        zzv zzvVar;
        LifecycleFragment c = LifecycleCallback.c(activity);
        synchronized (c) {
            try {
                zzvVar = (zzv) c.c("TaskOnStopCallback", zzv.class);
                if (zzvVar == null) {
                    zzvVar = new zzv(c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @InterfaceC10389w71
    public final void l() {
        synchronized (this.Y) {
            try {
                for (WeakReference weakReference : this.Y) {
                    zzq zzqVar = (zzq) weakReference.get();
                    if (zzqVar != null) {
                        zzqVar.c();
                    }
                }
                this.Y.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(zzq zzqVar) {
        synchronized (this.Y) {
            this.Y.add(new WeakReference(zzqVar));
        }
    }
}
