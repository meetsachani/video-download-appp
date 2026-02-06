package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes2.dex */
final class zzcas implements Runnable {
    public final /* synthetic */ MediaPlayer X;
    public final /* synthetic */ zzcba Y;

    public zzcas(zzcba zzcbaVar, MediaPlayer mediaPlayer) {
        this.X = mediaPlayer;
        this.Y = zzcbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbb zzcbbVar;
        zzcbb zzcbbVar2;
        zzcba zzcbaVar = this.Y;
        zzcba.M(zzcbaVar, this.X);
        zzcbbVar = zzcbaVar.o1;
        if (zzcbbVar != null) {
            zzcbbVar2 = zzcbaVar.o1;
            zzcbbVar2.e();
        }
    }
}
