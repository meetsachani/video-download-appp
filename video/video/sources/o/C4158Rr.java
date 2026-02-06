package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: o.Rr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4158Rr extends OutputStream {
    public final ByteBuffer X;

    public C4158Rr(ByteBuffer byteBuffer) {
        this.X = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.X.hasRemaining()) {
            this.X.put((byte) i);
            return;
        }
        throw new EOFException("Output ByteBuffer has no bytes remaining.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        bArr.getClass();
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        if (this.X.remaining() >= i2) {
            this.X.put(bArr, i, i2);
            return;
        }
        throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
    }
}
