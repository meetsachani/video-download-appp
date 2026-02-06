package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class zzhfe extends zzhfc implements zzarh {
    public int d1;

    public zzhfe(String str) {
        super("mvhd");
    }

    public final int f() {
        if (!this.Y) {
            e();
        }
        return this.d1;
    }

    public final long g(ByteBuffer byteBuffer) {
        this.d1 = zzarg.c(byteBuffer.get());
        zzarg.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
