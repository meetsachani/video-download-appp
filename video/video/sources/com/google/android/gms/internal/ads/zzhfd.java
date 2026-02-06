package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class zzhfd extends zzhfg implements zzarh {
    public final String c1 = "moov";

    public zzhfd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final String a() {
        return this.c1;
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void d(zzhfh zzhfhVar, ByteBuffer byteBuffer, long j, zzare zzareVar) throws IOException {
        zzhfhVar.b();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.Y = zzhfhVar;
        this.Y0 = zzhfhVar.b();
        zzhfhVar.w(zzhfhVar.b() + j);
        this.Z0 = zzhfhVar.b();
        this.X = zzareVar;
    }
}
