package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class HM2 extends InputStream {
    public boolean X;
    public boolean Y;
    public final InputStream Y0;
    public boolean Z;
    public boolean Z0;
    public final boolean a1;

    public HM2(InputStream inputStream, boolean z) {
        this.Y0 = inputStream;
        this.a1 = z;
    }

    public final int a() {
        if (!this.a1) {
            return -1;
        }
        boolean z = this.Z;
        if (!z && !this.Y) {
            this.Y = true;
            return 13;
        } else if (z) {
            return -1;
        } else {
            this.Y = false;
            this.Z = true;
            return 10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.Y0.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw C5756dC2.a();
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        boolean z;
        boolean z2;
        if (this.X) {
            return a();
        }
        boolean z3 = false;
        if (this.Z0) {
            this.Z0 = false;
            return 10;
        }
        boolean z4 = this.Y;
        int read = this.Y0.read();
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        this.X = z;
        if (!z) {
            if (read == 13) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.Y = z2;
            if (read == 10) {
                z3 = true;
            }
            this.Z = z3;
        }
        if (z) {
            return a();
        } else if (read == 10 && !z4) {
            this.Z0 = true;
            return 13;
        } else {
            return read;
        }
    }
}
