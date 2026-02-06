package o;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.ms  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8129ms {
    public static final int a = 8192;
    public static final int b = 524288;
    public static final int c = 2147483639;
    public static final int d = 20;
    public static final OutputStream e = new a();

    /* renamed from: o.ms$a */
    /* loaded from: classes3.dex */
    public class a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C10664xF1.E(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C10664xF1.E(bArr);
            C10664xF1.f0(i, i2 + i, bArr.length);
        }
    }

    public static byte[] a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    @InterfaceC6181ey
    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        C10664xF1.E(inputStream);
        C10664xF1.E(outputStream);
        byte[] d2 = d();
        long j = 0;
        while (true) {
            int read = inputStream.read(d2);
            if (read == -1) {
                return j;
            }
            outputStream.write(d2, 0, read);
            j += read;
        }
    }

    @InterfaceC6181ey
    public static long c(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        C10664xF1.E(readableByteChannel);
        C10664xF1.E(writableByteChannel);
        long j = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long position = fileChannel.position();
            long j2 = position;
            while (true) {
                WritableByteChannel writableByteChannel2 = writableByteChannel;
                long transferTo = fileChannel.transferTo(j2, PlaybackStateCompat.A1, writableByteChannel2);
                j2 += transferTo;
                fileChannel.position(j2);
                if (transferTo <= 0 && j2 >= fileChannel.size()) {
                    return j2 - position;
                }
                writableByteChannel = writableByteChannel2;
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(d());
            while (readableByteChannel.read(wrap) != -1) {
                C10723xU0.b(wrap);
                while (wrap.hasRemaining()) {
                    j += writableByteChannel.write(wrap);
                }
                C10723xU0.a(wrap);
            }
            return j;
        }
    }

    public static byte[] d() {
        return new byte[8192];
    }

    @InterfaceC6181ey
    @InterfaceC4238Sm
    public static long e(InputStream inputStream) throws IOException {
        byte[] d2 = d();
        long j = 0;
        while (true) {
            long read = inputStream.read(d2);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    @InterfaceC4238Sm
    public static InputStream f(InputStream inputStream, long j) {
        return new d(inputStream, j);
    }

    @InterfaceC4238Sm
    public static InterfaceC11294zr g(ByteArrayInputStream byteArrayInputStream) {
        return new b((ByteArrayInputStream) C10664xF1.E(byteArrayInputStream));
    }

    @InterfaceC4238Sm
    public static InterfaceC11294zr h(byte[] bArr) {
        return g(new ByteArrayInputStream(bArr));
    }

    @InterfaceC4238Sm
    public static InterfaceC11294zr i(byte[] bArr, int i) {
        C10664xF1.d0(i, bArr.length);
        return g(new ByteArrayInputStream(bArr, i, bArr.length - i));
    }

    @InterfaceC4238Sm
    public static InterfaceC2485Ar j() {
        return l(new ByteArrayOutputStream());
    }

    @InterfaceC4238Sm
    public static InterfaceC2485Ar k(int i) {
        if (i >= 0) {
            return l(new ByteArrayOutputStream(i));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i)));
    }

    @InterfaceC4238Sm
    public static InterfaceC2485Ar l(ByteArrayOutputStream byteArrayOutputStream) {
        return new c((ByteArrayOutputStream) C10664xF1.E(byteArrayOutputStream));
    }

    @InterfaceC4238Sm
    public static OutputStream m() {
        return e;
    }

    @InterfaceC6181ey
    @InterfaceC4238Sm
    public static int n(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        C10664xF1.E(inputStream);
        C10664xF1.E(bArr);
        if (i2 >= 0) {
            C10664xF1.f0(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i2)));
    }

    @InterfaceC6181ey
    @InterfaceC9377ry1
    @InterfaceC4238Sm
    public static <T> T o(InputStream inputStream, InterfaceC7140is<T> interfaceC7140is) throws IOException {
        int read;
        C10664xF1.E(inputStream);
        C10664xF1.E(interfaceC7140is);
        byte[] d2 = d();
        do {
            read = inputStream.read(d2);
            if (read == -1) {
                break;
            }
        } while (interfaceC7140is.a(d2, 0, read));
        return interfaceC7140is.getResult();
    }

    @InterfaceC4238Sm
    public static void p(InputStream inputStream, byte[] bArr) throws IOException {
        q(inputStream, bArr, 0, bArr.length);
    }

    @InterfaceC4238Sm
    public static void q(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int n = n(inputStream, bArr, i, i2);
        if (n == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder(81);
        sb.append("reached end of stream after reading ");
        sb.append(n);
        sb.append(" bytes; ");
        sb.append(i2);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }

    @InterfaceC4238Sm
    public static void r(InputStream inputStream, long j) throws IOException {
        long t = t(inputStream, j);
        if (t >= j) {
            return;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("reached end of stream after skipping ");
        sb.append(t);
        sb.append(" bytes; ");
        sb.append(j);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }

    public static long s(InputStream inputStream, long j) throws IOException {
        int available = inputStream.available();
        if (available == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(available, j));
    }

    public static long t(InputStream inputStream, long j) throws IOException {
        byte[] bArr = null;
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            long s = s(inputStream, j3);
            if (s == 0) {
                int min = (int) Math.min(j3, 8192L);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                s = inputStream.read(bArr, 0, min);
                if (s == -1) {
                    break;
                }
            }
            j2 += s;
        }
        return j2;
    }

    public static byte[] u(InputStream inputStream) throws IOException {
        C10664xF1.E(inputStream);
        return w(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] v(InputStream inputStream, long j) throws IOException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "expectedSize (%s) must be non-negative", j);
        if (j <= 2147483639) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int read = inputStream.read(bArr, i3, i2);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= read;
            }
            int read2 = inputStream.read();
            if (read2 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) read2});
            return w(inputStream, arrayDeque, i + 1);
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append(j);
        sb.append(" bytes is too large to fit in a byte array");
        throw new OutOfMemoryError(sb.toString());
    }

    public static byte[] w(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int i2;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return a(queue, i);
                }
                i3 += read;
                i += read;
            }
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            min = C9979uR0.u(min, i2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: o.ms$b */
    /* loaded from: classes3.dex */
    public static class b implements InterfaceC11294zr {
        public final DataInput X;

        public b(ByteArrayInputStream byteArrayInputStream) {
            this.X = new DataInputStream(byteArrayInputStream);
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.X.readBoolean();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public byte readByte() {
            try {
                return this.X.readByte();
            } catch (EOFException e) {
                throw new IllegalStateException(e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public char readChar() {
            try {
                return this.X.readChar();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public double readDouble() {
            try {
                return this.X.readDouble();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public float readFloat() {
            try {
                return this.X.readFloat();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.X.readFully(bArr);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public int readInt() {
            try {
                return this.X.readInt();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        @MB
        public String readLine() {
            try {
                return this.X.readLine();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public long readLong() {
            try {
                return this.X.readLong();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public short readShort() {
            try {
                return this.X.readShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public String readUTF() {
            try {
                return this.X.readUTF();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.X.readUnsignedByte();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.X.readUnsignedShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public int skipBytes(int i) {
            try {
                return this.X.skipBytes(i);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.InterfaceC11294zr, java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            try {
                this.X.readFully(bArr, i, i2);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: o.ms$c */
    /* loaded from: classes3.dex */
    public static class c implements InterfaceC2485Ar {
        public final DataOutput X;
        public final ByteArrayOutputStream Y;

        public c(ByteArrayOutputStream byteArrayOutputStream) {
            this.Y = byteArrayOutputStream;
            this.X = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // o.InterfaceC2485Ar
        public byte[] p() {
            return this.Y.toByteArray();
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void write(int i) {
            try {
                this.X.write(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeBoolean(boolean z) {
            try {
                this.X.writeBoolean(z);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeByte(int i) {
            try {
                this.X.writeByte(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.X.writeBytes(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeChar(int i) {
            try {
                this.X.writeChar(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.X.writeChars(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeDouble(double d) {
            try {
                this.X.writeDouble(d);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeFloat(float f) {
            try {
                this.X.writeFloat(f);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeInt(int i) {
            try {
                this.X.writeInt(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeLong(long j) {
            try {
                this.X.writeLong(j);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeShort(int i) {
            try {
                this.X.writeShort(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.X.writeUTF(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.X.write(bArr);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // o.InterfaceC2485Ar, java.io.DataOutput
        public void write(byte[] bArr, int i, int i2) {
            try {
                this.X.write(bArr, i, i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: o.ms$d */
    /* loaded from: classes3.dex */
    public static final class d extends FilterInputStream {
        public long X;
        public long Y;

        public d(InputStream inputStream, long j) {
            super(inputStream);
            boolean z;
            this.Y = -1L;
            C10664xF1.E(inputStream);
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "limit must be non-negative");
            this.X = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.X);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.Y = this.X;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.X == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.X--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.Y != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.X = this.Y;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.X));
            this.X -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.X;
            if (j == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (read != -1) {
                this.X -= read;
            }
            return read;
        }
    }
}
