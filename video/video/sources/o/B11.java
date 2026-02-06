package o;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@InterfaceC7797la0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class B11 extends FilterInputStream implements DataInput {
    public B11(InputStream inputStream) {
        super((InputStream) C10664xF1.E(inputStream));
    }

    public final byte a() throws IOException, EOFException {
        int read = ((FilterInputStream) this).in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public boolean readBoolean() throws IOException {
        if (readUnsignedByte() != 0) {
            return true;
        }
        return false;
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        C8129ms.p(this, bArr);
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public int readInt() throws IOException {
        byte a = a();
        byte a2 = a();
        return C7775lT0.k(a(), a(), a2, a);
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public long readLong() throws IOException {
        byte a = a();
        byte a2 = a();
        byte a3 = a();
        byte a4 = a();
        byte a5 = a();
        byte a6 = a();
        return C7194j51.j(a(), a(), a6, a5, a4, a3, a2, a);
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public int readUnsignedByte() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @InterfaceC6181ey
    public int readUnsignedShort() throws IOException {
        return C7775lT0.k((byte) 0, (byte) 0, a(), a());
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(i);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        C8129ms.q(this, bArr, i, i2);
    }
}
