package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzaqy extends ByteArrayOutputStream {
    public final zzaql X;

    public zzaqy(zzaql zzaqlVar, int i) {
        this.X = zzaqlVar;
        ((ByteArrayOutputStream) this).buf = zzaqlVar.b(Math.max(i, 256));
    }

    public final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        zzaql zzaqlVar = this.X;
        int i3 = i2 + i;
        byte[] b = zzaqlVar.b(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b, 0, ((ByteArrayOutputStream) this).count);
        zzaqlVar.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = b;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.X.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
