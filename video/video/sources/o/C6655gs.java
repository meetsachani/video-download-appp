package o;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: o.gs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6655gs extends FilterOutputStream {
    public final OutputStream X;
    public ByteOrder Y;

    public C6655gs(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.X = outputStream;
        this.Y = byteOrder;
    }

    public void a(ByteOrder byteOrder) {
        this.Y = byteOrder;
    }

    public void d(int i) throws IOException {
        this.X.write(i);
    }

    public void f(int i) throws IOException {
        ByteOrder byteOrder = this.Y;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.X.write(i & 255);
            this.X.write((i >>> 8) & 255);
            this.X.write((i >>> 16) & 255);
            this.X.write((i >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.X.write((i >>> 24) & 255);
            this.X.write((i >>> 16) & 255);
            this.X.write((i >>> 8) & 255);
            this.X.write(i & 255);
        }
    }

    public void h(short s) throws IOException {
        ByteOrder byteOrder = this.Y;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.X.write(s & 255);
            this.X.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.X.write((s >>> 8) & 255);
            this.X.write(s & 255);
        }
    }

    public void i(long j) throws IOException {
        f((int) j);
    }

    public void j(int i) throws IOException {
        h((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.X.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.X.write(bArr, i, i2);
    }
}
