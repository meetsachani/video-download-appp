package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes3.dex */
final class ByteStreams {
    public static final int a = 8192;
    public static final int b = 2147483639;
    public static final int c = 20;

    private ByteStreams() {
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

    public static byte[] b() {
        return new byte[8192];
    }

    public static InputStream c(InputStream inputStream, long j) {
        return new LimitedInputStream(inputStream, j);
    }

    public static int d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static byte[] e(InputStream inputStream) throws IOException {
        return f(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] f(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
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
            long j = min;
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            min = d(j * i2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* loaded from: classes3.dex */
    public static final class LimitedInputStream extends FilterInputStream {
        public long X;
        public long Y;

        public LimitedInputStream(InputStream inputStream, long j) {
            super(inputStream);
            this.Y = -1L;
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
