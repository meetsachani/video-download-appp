package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzz implements Runnable {
    public final /* synthetic */ zzw X;
    public final /* synthetic */ Callable Y;

    public zzz(zzw zzwVar, Callable callable) {
        this.X = zzwVar;
        this.Y = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.X.z(this.Y.call());
        } catch (Exception e) {
            this.X.y(e);
        } catch (Throwable th) {
            this.X.y(new RuntimeException(th));
        }
    }
}
