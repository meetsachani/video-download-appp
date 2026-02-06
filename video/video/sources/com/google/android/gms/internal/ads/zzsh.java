package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzsh implements zzsx {
    public final zzfvu a;
    public final zzfvu b;

    public zzsh(int i) {
        zzsf zzsfVar = new zzsf(i);
        zzsg zzsgVar = new zzsg(i);
        this.a = zzsfVar;
        this.b = zzsgVar;
    }

    public static /* synthetic */ HandlerThread b(int i) {
        return new HandlerThread(zzsj.n(i));
    }

    public static /* synthetic */ HandlerThread c(int i) {
        return new HandlerThread(zzsj.o(i));
    }

    @Override // com.google.android.gms.internal.ads.zzsx
    public final /* bridge */ /* synthetic */ zzsz a(zzsw zzswVar) throws IOException {
        throw null;
    }

    public final zzsj d(zzsw zzswVar) throws IOException {
        Exception exc;
        MediaCodec mediaCodec;
        zztc zztcVar = zzswVar.a;
        String str = zztcVar.a;
        zzsj zzsjVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzsj zzsjVar2 = new zzsj(mediaCodec, b(((zzsf) this.a).X), new zzsn(mediaCodec, c(((zzsg) this.b).X)), zzswVar.f, null);
                try {
                    Trace.endSection();
                    Surface surface = zzswVar.d;
                    int i = 0;
                    if (surface == null && zztcVar.h && Build.VERSION.SDK_INT >= 35) {
                        i = 8;
                    }
                    zzsj.p(zzsjVar2, zzswVar.b, surface, null, i);
                    return zzsjVar2;
                } catch (Exception e) {
                    exc = e;
                    zzsjVar = zzsjVar2;
                    if (zzsjVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        zzsjVar.m();
                    }
                    throw exc;
                }
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Exception e3) {
            exc = e3;
            mediaCodec = null;
        }
    }
}
