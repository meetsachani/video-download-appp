package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class zzaos implements zzaot {
    public final ByteBuffer a;

    public zzaos(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final long a() {
        return this.a.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        ByteBuffer byteBuffer = this.a;
        synchronized (byteBuffer) {
            int i2 = (int) j;
            byteBuffer.position(i2);
            byteBuffer.limit(i2 + i);
            slice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
