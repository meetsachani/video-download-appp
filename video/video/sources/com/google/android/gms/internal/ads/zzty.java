package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import o.ES1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzty implements zzsz {
    public final MediaCodec a;
    @InterfaceC11300zs1
    public final zzsv b;

    public /* synthetic */ zzty(MediaCodec mediaCodec, zzsv zzsvVar, zztx zztxVar) {
        this.a = mediaCodec;
        this.b = zzsvVar;
        if (Build.VERSION.SDK_INT >= 35 && zzsvVar != null) {
            zzsvVar.a(mediaCodec);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @InterfaceC11300zs1
    public final ByteBuffer A(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @InterfaceC11300zs1
    public final ByteBuffer S(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void Z(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final /* synthetic */ boolean b(zzsy zzsyVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void d(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @ES1(23)
    public final void e(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void f(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void g(int i, int i2, zzhm zzhmVar, long j, int i3) {
        this.a.queueSecureInputBuffer(i, 0, zzhmVar.a(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void h(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @ES1(35)
    public final void i() {
        this.a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void j() {
        this.a.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void k(int i, boolean z) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int l(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void m() {
        zzsv zzsvVar;
        zzsv zzsvVar2;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                this.a.stop();
            }
            if (i >= 35 && (zzsvVar2 = this.b) != null) {
                zzsvVar2.c(this.a);
            }
            this.a.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzsvVar = this.b) != null) {
                zzsvVar.c(this.a);
            }
            this.a.release();
            throw th;
        }
    }
}
