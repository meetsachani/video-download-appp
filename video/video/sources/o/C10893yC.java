package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: o.yC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10893yC extends FilterInputStream {
    public final C11136zC X;
    public final int Y;
    public boolean Z;

    public C10893yC(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public void a() throws IOException {
        if (!this.Z) {
            int e = this.X.e();
            byte[] l = C7743lL0.l(e);
            while (e > 0) {
                int read = ((FilterInputStream) this).in.read(l, 0, e);
                if (read == -1) {
                    this.Z = true;
                    return;
                } else if (read > 0) {
                    this.X.b(l, 0, read);
                    e -= read;
                }
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.Z = true;
        this.X.c();
    }

    public boolean d(int i) throws IOException {
        if (this.X.d() < i) {
            a();
        }
        return this.X.f();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (d(1)) {
            return this.X.j() & 255;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10893yC(InputStream inputStream, int i) {
        super(inputStream);
        Objects.requireNonNull(inputStream, "inputStream");
        if (i > 0) {
            this.X = new C11136zC(i);
            this.Y = i;
            this.Z = false;
            return;
        }
        throw new IllegalArgumentException("Illegal bufferSize: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (d(i2)) {
            int min = Math.min(i2, this.X.d());
            for (int i3 = 0; i3 < min; i3++) {
                bArr[i + i3] = this.X.j();
            }
            return min;
        }
        return -1;
    }
}
