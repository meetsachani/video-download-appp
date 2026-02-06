package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzgnk {
    public static final zzgwp a = zzgwp.b(new byte[0]);

    public static final zzgwp a(int i) {
        return zzgwp.b(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzgwp b(int i) {
        return zzgwp.b(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
