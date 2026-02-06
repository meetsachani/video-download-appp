package o;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: o.fs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6400fs extends InputStream implements DataInput {
    public static final ByteOrder Z0 = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder a1 = ByteOrder.BIG_ENDIAN;
    public final DataInputStream X;
    public ByteOrder Y;
    public int Y0;
    public final int Z;

    public C6400fs(InputStream inputStream) throws IOException {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public int a() {
        return this.Z;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.X.available();
    }

    public int d() {
        return this.Y0;
    }

    public long f() throws IOException {
        return readInt() & 4294967295L;
    }

    public void h(ByteOrder byteOrder) {
        this.Y = byteOrder;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this.X) {
            this.X.mark(i);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.Y0++;
        return this.X.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        this.Y0++;
        return this.X.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        int i = this.Y0 + 1;
        this.Y0 = i;
        if (i <= this.Z) {
            int read = this.X.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        this.Y0 += 2;
        return this.X.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.Y0 + i2;
        this.Y0 = i3;
        if (i3 <= this.Z) {
            if (this.X.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int i = this.Y0 + 4;
        this.Y0 = i;
        if (i <= this.Z) {
            int read = this.X.read();
            int read2 = this.X.read();
            int read3 = this.X.read();
            int read4 = this.X.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.Y;
                if (byteOrder == Z0) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == a1) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.Y);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int i = this.Y0 + 8;
        this.Y0 = i;
        if (i <= this.Z) {
            int read = this.X.read();
            int read2 = this.X.read();
            int read3 = this.X.read();
            int read4 = this.X.read();
            int read5 = this.X.read();
            int read6 = this.X.read();
            int read7 = this.X.read();
            int read8 = this.X.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.Y;
                if (byteOrder == Z0) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == a1) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.Y);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int i = this.Y0 + 2;
        this.Y0 = i;
        if (i <= this.Z) {
            int read = this.X.read();
            int read2 = this.X.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.Y;
                if (byteOrder == Z0) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == a1) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.Y);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        this.Y0 += 2;
        return this.X.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        this.Y0++;
        return this.X.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        int i = this.Y0 + 2;
        this.Y0 = i;
        if (i <= this.Z) {
            int read = this.X.read();
            int read2 = this.X.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.Y;
                if (byteOrder == Z0) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == a1) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.Y);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public void seek(long j) throws IOException {
        int i = this.Y0;
        if (i > j) {
            this.Y0 = 0;
            this.X.reset();
            this.X.mark(this.Z);
        } else {
            j -= i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) == i2) {
            return;
        }
        throw new IOException("Couldn't seek up to the byteCount");
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException {
        int min = Math.min(i, this.Z - this.Y0);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.X.skipBytes(min - i2);
        }
        this.Y0 += i2;
        return i2;
    }

    public C6400fs(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.Y = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.X = dataInputStream;
        int available = dataInputStream.available();
        this.Z = available;
        this.Y0 = 0;
        dataInputStream.mark(available);
        this.Y = byteOrder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.X.read(bArr, i, i2);
        this.Y0 += read;
        return read;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int length = this.Y0 + bArr.length;
        this.Y0 = length;
        if (length <= this.Z) {
            if (this.X.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    public C6400fs(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
