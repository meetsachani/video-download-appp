package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import o.C9811tl1;
import o.ES1;
import o.InterfaceC11300zs1;

@ES1(23)
/* loaded from: classes2.dex */
public final class zzsj implements zzsz {
    public final MediaCodec a;
    public final zzsp b;
    public final zzta c;
    @InterfaceC11300zs1
    public final zzsv d;
    public boolean e;
    public int f = 0;

    public /* synthetic */ zzsj(MediaCodec mediaCodec, HandlerThread handlerThread, zzta zztaVar, zzsv zzsvVar, zzsi zzsiVar) {
        this.a = mediaCodec;
        this.b = new zzsp(handlerThread);
        this.c = zztaVar;
        this.d = zzsvVar;
    }

    public static /* synthetic */ String n(int i) {
        return q(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String o(int i) {
        return q(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* bridge */ /* synthetic */ void p(zzsj zzsjVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzsv zzsvVar;
        zzsp zzspVar = zzsjVar.b;
        MediaCodec mediaCodec = zzsjVar.a;
        zzspVar.f(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        zzsjVar.c.h();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzsvVar = zzsjVar.d) != null) {
            zzsvVar.a(mediaCodec);
        }
        zzsjVar.f = 1;
    }

    public static String q(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(C9811tl1.d);
        }
        return sb.toString();
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
        this.c.d(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int a() {
        this.c.c();
        return this.b.a();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean b(zzsy zzsyVar) {
        this.b.g(zzsyVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final MediaFormat c() {
        return this.b.c();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void d(int i, int i2, int i3, long j, int i4) {
        this.c.e(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void e(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void f(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void g(int i, int i2, zzhm zzhmVar, long j, int i3) {
        this.c.a(i, 0, zzhmVar, j, 0);
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
        this.c.b();
        MediaCodec mediaCodec = this.a;
        mediaCodec.flush();
        this.b.e();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void k(int i, boolean z) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int l(MediaCodec.BufferInfo bufferInfo) {
        this.c.c();
        return this.b.b(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void m() {
        zzsv zzsvVar;
        zzsv zzsvVar2;
        try {
            if (this.f == 1) {
                this.c.g();
                this.b.h();
            }
            this.f = 2;
            if (!this.e) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (zzsvVar2 = this.d) != null) {
                    zzsvVar2.c(this.a);
                }
                this.a.release();
                this.e = true;
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzsvVar = this.d) != null) {
                zzsvVar.c(this.a);
            }
            this.a.release();
            this.e = true;
            throw th;
        }
    }
}
