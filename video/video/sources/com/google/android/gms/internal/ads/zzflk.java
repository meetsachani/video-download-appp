package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzflk extends TimerTask {
    public final /* synthetic */ Timer X;
    public final /* synthetic */ zzflm Y;
    public final /* synthetic */ zzcfs Z;

    public zzflk(zzflm zzflmVar, zzcfs zzcfsVar, Timer timer) {
        this.Z = zzcfsVar;
        this.X = timer;
        this.Y = zzflmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.Y.h();
        zzcft.o1(this.Z.a, true);
        this.X.cancel();
    }
}
