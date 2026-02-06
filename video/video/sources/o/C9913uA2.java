package o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.uA2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9913uA2 extends InputStream {
    public boolean X;
    public boolean Y;
    public final InputStream Y0;
    public boolean Z;
    public final boolean Z0;

    public C9913uA2(InputStream inputStream, boolean z) {
        this.Y0 = inputStream;
        this.Z0 = z;
    }

    public final int a(boolean z) {
        if (z || !this.Z0 || this.Z) {
            return -1;
        }
        this.Z = true;
        return 10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.Y0.close();
    }

    public final int d() throws IOException {
        boolean z;
        boolean z2;
        int read = this.Y0.read();
        boolean z3 = false;
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        this.X = z;
        if (z) {
            return read;
        }
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
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw C5756dC2.a();
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        boolean z = this.Y;
        if (this.X) {
            return a(z);
        }
        int d = d();
        if (this.X) {
            return a(z);
        } else if (this.Y) {
            return 10;
        } else {
            if (z && this.Z) {
                return read();
            }
            return d;
        }
    }
}
