package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzarl extends zzhfc {
    public zzarl(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhfc
    public final void c(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
