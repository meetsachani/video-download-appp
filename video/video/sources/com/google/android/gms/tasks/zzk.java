package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzk implements Runnable {
    public final /* synthetic */ Task X;
    public final /* synthetic */ zzl Y;

    public zzk(zzl zzlVar, Task task) {
        this.Y = zzlVar;
        this.X = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnFailureListener onFailureListener;
        OnFailureListener onFailureListener2;
        obj = this.Y.b;
        synchronized (obj) {
            try {
                zzl zzlVar = this.Y;
                onFailureListener = zzlVar.c;
                if (onFailureListener != null) {
                    onFailureListener2 = zzlVar.c;
                    onFailureListener2.e((Exception) Preconditions.r(this.X.q()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
