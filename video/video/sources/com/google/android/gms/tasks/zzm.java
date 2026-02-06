package com.google.android.gms.tasks;

/* loaded from: classes3.dex */
final class zzm implements Runnable {
    public final /* synthetic */ Task X;
    public final /* synthetic */ zzn Y;

    public zzm(zzn zznVar, Task task) {
        this.Y = zznVar;
        this.X = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnSuccessListener onSuccessListener;
        OnSuccessListener onSuccessListener2;
        obj = this.Y.b;
        synchronized (obj) {
            try {
                zzn zznVar = this.Y;
                onSuccessListener = zznVar.c;
                if (onSuccessListener != null) {
                    onSuccessListener2 = zznVar.c;
                    onSuccessListener2.a(this.X.r());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
