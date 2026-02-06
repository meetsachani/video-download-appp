package o;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.mC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7967mC extends FilterOutputStream {
    public final int X;

    /* renamed from: o.mC$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C7967mC, b> {
        @Override // o.XK0
        /* renamed from: j0 */
        public C7967mC get() throws IOException {
            return new C7967mC(this);
        }
    }

    public static b a() {
        return new b();
    }

    public int d() {
        return this.X;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        while (i2 > 0) {
            int min = Math.min(i2, this.X);
            ((FilterOutputStream) this).out.write(bArr, i, min);
            i2 -= min;
            i += min;
        }
    }

    public C7967mC(b bVar) throws IOException {
        super(bVar.U());
        int L = bVar.L();
        if (L > 0) {
            this.X = L;
            return;
        }
        throw new IllegalArgumentException("chunkSize <= 0");
    }

    @Deprecated
    public C7967mC(OutputStream outputStream) {
        this(outputStream, 8192);
    }

    @Deprecated
    public C7967mC(OutputStream outputStream, int i) {
        super(outputStream);
        if (i > 0) {
            this.X = i;
            return;
        }
        throw new IllegalArgumentException("chunkSize <= 0");
    }
}
