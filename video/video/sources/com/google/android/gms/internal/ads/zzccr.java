package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class zzccr implements zzhfh {
    public final ByteBuffer X;

    public zzccr(ByteBuffer byteBuffer) {
        this.X = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzhfh
    public final int B5(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = this.X;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhfh
    public final ByteBuffer T2(long j, long j2) throws IOException {
        ByteBuffer byteBuffer = this.X;
        int position = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer slice = byteBuffer.slice();
        slice.limit((int) j2);
        byteBuffer.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.zzhfh
    public final long b() throws IOException {
        return this.X.position();
    }

    @Override // com.google.android.gms.internal.ads.zzhfh
    public final long c() throws IOException {
        return this.X.limit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhfh
    public final void w(long j) throws IOException {
        this.X.position((int) j);
    }
}
