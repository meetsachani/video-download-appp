package o;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/* renamed from: o.vK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC10195vK1 extends FilterReader {
    public AbstractC10195vK1(Reader reader) {
        super(reader);
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterReader) this).in.close();
        } catch (IOException e) {
            f(e);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void mark(int i) throws IOException {
        try {
            ((FilterReader) this).in.mark(i);
        } catch (IOException e) {
            f(e);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean markSupported() {
        return ((FilterReader) this).in.markSupported();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i = 1;
        try {
            d(1);
            int read = ((FilterReader) this).in.read();
            if (read == -1) {
                i = -1;
            }
            a(i);
            return read;
        } catch (IOException e) {
            f(e);
            return -1;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws IOException {
        try {
            return ((FilterReader) this).in.ready();
        } catch (IOException e) {
            f(e);
            return false;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void reset() throws IOException {
        try {
            ((FilterReader) this).in.reset();
        } catch (IOException e) {
            f(e);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j) throws IOException {
        try {
            return ((FilterReader) this).in.skip(j);
        } catch (IOException e) {
            f(e);
            return 0L;
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        try {
            d(C7743lL0.t0(cArr));
            int read = ((FilterReader) this).in.read(cArr);
            a(read);
            return read;
        } catch (IOException e) {
            f(e);
            return -1;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        try {
            d(i2);
            int read = ((FilterReader) this).in.read(cArr, i, i2);
            a(read);
            return read;
        } catch (IOException e) {
            f(e);
            return -1;
        }
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        try {
            d(C7743lL0.r0(charBuffer));
            int read = ((FilterReader) this).in.read(charBuffer);
            a(read);
            return read;
        } catch (IOException e) {
            f(e);
            return -1;
        }
    }

    public void a(int i) throws IOException {
    }

    public void d(int i) throws IOException {
    }

    public void f(IOException iOException) throws IOException {
        throw iOException;
    }
}
