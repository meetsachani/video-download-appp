package o;

import java.io.DataInput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.Ti2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4322Ti2 extends AbstractC8244nK1 implements DataInput {
    public C4322Ti2(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException, EOFException {
        if (readByte() != 0) {
            return true;
        }
        return false;
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException, EOFException {
        return (byte) ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException, EOFException {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException, EOFException {
        return C4002Qc0.b(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException, EOFException {
        return C4002Qc0.d(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException, EOFException {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException, EOFException {
        return C4002Qc0.f(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readLine() throws IOException, EOFException {
        throw C5756dC2.b("readLine");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException, EOFException {
        return C4002Qc0.h(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException, EOFException {
        return C4002Qc0.j(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException, EOFException {
        throw C5756dC2.b("readUTF");
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException, EOFException {
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException, EOFException {
        return C4002Qc0.n(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(i);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException, EOFException {
        int i3 = i2;
        while (i3 > 0) {
            int read = read(bArr, (i + i2) - i3, i3);
            if (-1 == read) {
                throw new EOFException();
            }
            i3 -= read;
        }
    }
}
