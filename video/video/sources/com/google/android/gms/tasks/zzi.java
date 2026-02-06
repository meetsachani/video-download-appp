package com.google.android.gms.tasks;

/* loaded from: classes3.dex */
final class zzi implements Runnable {
    public final /* synthetic */ Task X;
    public final /* synthetic */ zzj Y;

    public zzi(zzj zzjVar, Task task) {
        this.Y = zzjVar;
        this.X = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCompleteListener onCompleteListener;
        OnCompleteListener onCompleteListener2;
        obj = this.Y.b;
        synchronized (obj) {
            try {
                zzj zzjVar = this.Y;
                onCompleteListener = zzjVar.c;
                if (onCompleteListener != null) {
                    onCompleteListener2 = zzjVar.c;
                    onCompleteListener2.a(this.X);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
