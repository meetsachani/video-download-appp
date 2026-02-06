package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zztf extends Exception {
    @InterfaceC11300zs1
    public final String X;
    public final boolean Y;
    @InterfaceC11300zs1
    public final String Y0;
    @InterfaceC11300zs1
    public final zztc Z;

    public zztf(zzz zzzVar, @InterfaceC11300zs1 Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + zzzVar.toString(), th, zzzVar.f301o, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    public static /* bridge */ /* synthetic */ zztf a(zztf zztfVar, zztf zztfVar2) {
        return new zztf(zztfVar.getMessage(), zztfVar.getCause(), zztfVar.X, false, zztfVar.Z, zztfVar.Y0, zztfVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zztf(zzz zzzVar, @InterfaceC11300zs1 Throwable th, boolean z, zztc zztcVar) {
        this("Decoder init failed: " + r13 + C6566gU0.h + r0, th, zzzVar.f301o, false, zztcVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        String str = zztcVar.a;
        String obj = zzzVar.toString();
    }

    public zztf(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th, @InterfaceC11300zs1 String str2, boolean z, @InterfaceC11300zs1 zztc zztcVar, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 zztf zztfVar) {
        super(str, th);
        this.X = str2;
        this.Y = false;
        this.Z = zztcVar;
        this.Y0 = str3;
    }
}
