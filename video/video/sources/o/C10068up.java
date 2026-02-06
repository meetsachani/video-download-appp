package o;

import java.io.IOException;
import java.io.Reader;

/* renamed from: o.up  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10068up extends Reader {
    public static final int a1 = -1;
    public final Reader X;
    public int Y;
    public int Y0;
    public int Z = -1;
    public final int Z0;

    public C10068up(Reader reader, int i) {
        this.X = reader;
        this.Z0 = i;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        int i2 = this.Y;
        this.Y0 = i - i2;
        this.Z = i2;
        this.X.mark(i);
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        int i = this.Y;
        if (i >= this.Z0) {
            return -1;
        }
        int i2 = this.Z;
        if (i2 < 0 || i - i2 < this.Y0) {
            this.Y = i + 1;
            return this.X.read();
        }
        return -1;
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.Y = this.Z;
        this.X.reset();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        C7743lL0.r(cArr, i, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int read = read();
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            cArr[i + i3] = (char) read;
        }
        return i2;
    }
}
