package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
final class zzaqo extends FilterInputStream {
    public final long X;
    public long Y;

    public zzaqo(InputStream inputStream, long j) {
        super(inputStream);
        this.X = j;
    }

    public final long a() {
        return this.X - this.Y;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.Y++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.Y += read;
        }
        return read;
    }
}
