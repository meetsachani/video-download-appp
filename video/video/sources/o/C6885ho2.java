package o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.ho2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6885ho2 extends OutputStream {
    public static final RJ0<C6885ho2, OutputStream> a1 = new RJ0() { // from class: o.go2
        @Override // o.RJ0
        public final Object apply(Object obj) {
            OutputStream outputStream;
            C6885ho2 c6885ho2 = (C6885ho2) obj;
            outputStream = C8374ns1.X;
            return outputStream;
        }
    };
    public final int X;
    public final EJ0<C6885ho2> Y;
    public long Y0;
    public final RJ0<C6885ho2, OutputStream> Z;
    public boolean Z0;

    public C6885ho2(int i) {
        this(i, EJ0.a(), a1);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        i().close();
    }

    public void d(int i) throws IOException {
        if (!this.Z0 && this.Y0 + i > this.X) {
            this.Z0 = true;
            n();
        }
    }

    public long f() {
        return this.Y0;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        i().flush();
    }

    public OutputStream h() throws IOException {
        return this.Z.apply(this);
    }

    @Deprecated
    public OutputStream i() throws IOException {
        return h();
    }

    public int j() {
        return this.X;
    }

    public boolean k() {
        if (this.Y0 > this.X) {
            return true;
        }
        return false;
    }

    public void l() {
        this.Z0 = false;
        this.Y0 = 0L;
    }

    public void m(long j) {
        this.Y0 = j;
    }

    public void n() throws IOException {
        this.Y.accept(this);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        d(bArr.length);
        i().write(bArr);
        this.Y0 += bArr.length;
    }

    public C6885ho2(int i, EJ0<C6885ho2> ej0, RJ0<C6885ho2, OutputStream> rj0) {
        this.X = i < 0 ? 0 : i;
        this.Y = ej0 == null ? EJ0.a() : ej0;
        this.Z = rj0 == null ? a1 : rj0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        d(i2);
        i().write(bArr, i, i2);
        this.Y0 += i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        d(1);
        i().write(i);
        this.Y0++;
    }
}
