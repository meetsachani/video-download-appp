package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class zzaou implements zzaot {
    public final FileChannel a;
    public final long b;
    public final long c;

    public zzaou(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final long a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
