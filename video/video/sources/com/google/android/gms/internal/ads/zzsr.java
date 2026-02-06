package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
import o.HZ;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzsr implements zzsx {
    @InterfaceC11300zs1
    public final Context a;

    @Deprecated
    public zzsr() {
        this.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    @Override // com.google.android.gms.internal.ads.zzsx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzsz a(zzsw zzswVar) throws IOException {
        Context context;
        zztc zztcVar;
        MediaCodec createByCodecName;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || ((context = this.a) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int b = zzay.b(zzswVar.c.f301o);
            zzdx.e(HZ.g, "Creating an asynchronous MediaCodec adapter for track type ".concat(zzeu.d(b)));
            return new zzsh(b).d(zzswVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zztcVar = zzswVar.a;
            String str = zztcVar.a;
            Trace.beginSection("createCodec:".concat(str));
            createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
        } catch (IOException e) {
            e = e;
        } catch (RuntimeException e2) {
            e = e2;
        }
        try {
            Trace.beginSection("configureCodec");
            Surface surface = zzswVar.d;
            int i2 = 0;
            if (surface == null && zztcVar.h && i >= 35) {
                i2 = 8;
            }
            createByCodecName.configure(zzswVar.b, surface, (MediaCrypto) null, i2);
            Trace.endSection();
            Trace.beginSection("startCodec");
            createByCodecName.start();
            Trace.endSection();
            return new zzty(createByCodecName, zzswVar.f, null);
        } catch (IOException e3) {
            e = e3;
            mediaCodec = createByCodecName;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e4) {
            e = e4;
            mediaCodec = createByCodecName;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    public zzsr(Context context, @InterfaceC11300zs1 zzfvu zzfvuVar, @InterfaceC11300zs1 zzfvu zzfvuVar2) {
        this.a = context;
    }
}
