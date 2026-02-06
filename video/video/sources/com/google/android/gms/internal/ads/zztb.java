package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zztb extends zzhn {
    public final int X;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zztb(Throwable th, @InterfaceC11300zs1 zztc zztcVar) {
        super("Decoder failed: ".concat(String.valueOf(r3)), th);
        String str;
        int i;
        if (zztcVar == null) {
            str = null;
        } else {
            str = zztcVar.a;
        }
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            i = codecException.getErrorCode();
        } else {
            i = 0;
        }
        this.X = i;
    }
}
