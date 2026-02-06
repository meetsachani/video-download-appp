package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes2.dex */
final class zzbbm extends PushbackInputStream {
    public final /* synthetic */ zzbbn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbbm(zzbbn zzbbnVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.X = zzbbnVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzbbp.e(this.X.Z);
        super.close();
    }
}
