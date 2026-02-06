package o;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.dB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5749dB extends Reader {
    @MB
    public CharSequence X;
    public int Y;
    public int Z;

    public C5749dB(CharSequence charSequence) {
        this.X = (CharSequence) C10664xF1.E(charSequence);
    }

    public final void a() throws IOException {
        if (this.X != null) {
            return;
        }
        throw new IOException("reader closed");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.X = null;
    }

    public final boolean d() {
        if (f() > 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        Objects.requireNonNull(this.X);
        return this.X.length() - this.Y;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i) throws IOException {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "readAheadLimit (%s) may not be negative", i);
        a();
        this.Z = this.Y;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        C10664xF1.E(charBuffer);
        a();
        Objects.requireNonNull(this.X);
        if (d()) {
            int min = Math.min(charBuffer.remaining(), f());
            for (int i = 0; i < min; i++) {
                CharSequence charSequence = this.X;
                int i2 = this.Y;
                this.Y = i2 + 1;
                charBuffer.put(charSequence.charAt(i2));
            }
            return min;
        }
        return -1;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        a();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        a();
        this.Y = this.Z;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j) throws IOException {
        boolean z;
        int min;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "n (%s) may not be negative", j);
        a();
        min = (int) Math.min(f(), j);
        this.Y += min;
        return min;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        char c;
        a();
        Objects.requireNonNull(this.X);
        if (d()) {
            CharSequence charSequence = this.X;
            int i = this.Y;
            this.Y = i + 1;
            c = charSequence.charAt(i);
        } else {
            c = 65535;
        }
        return c;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i, int i2) throws IOException {
        C10664xF1.f0(i, i + i2, cArr.length);
        a();
        Objects.requireNonNull(this.X);
        if (d()) {
            int min = Math.min(i2, f());
            for (int i3 = 0; i3 < min; i3++) {
                CharSequence charSequence = this.X;
                int i4 = this.Y;
                this.Y = i4 + 1;
                cArr[i + i3] = charSequence.charAt(i4);
            }
            return min;
        }
        return -1;
    }
}
