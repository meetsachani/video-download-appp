package o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.AbstractC5220b0;

/* renamed from: o.Fr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2986Fr extends AbstractC5220b0<C2986Fr> {
    public C2986Fr() {
        this(1024);
    }

    public static InputStream x(InputStream inputStream) throws IOException {
        return y(inputStream, 1024);
    }

    public static InputStream y(InputStream inputStream, int i) throws IOException {
        C2986Fr c2986Fr = new C2986Fr(i);
        try {
            c2986Fr.p(inputStream);
            InputStream l = c2986Fr.l();
            c2986Fr.close();
            return l;
        } catch (Throwable th) {
            try {
                c2986Fr.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.AbstractC5220b0
    public synchronized void f() {
        h();
    }

    @Override // o.AbstractC5220b0
    public synchronized int i() {
        return this.Y;
    }

    @Override // o.AbstractC5220b0
    public synchronized byte[] j() {
        return k();
    }

    @Override // o.AbstractC5220b0
    public synchronized InputStream l() {
        return m(new AbstractC5220b0.a() { // from class: o.Er
            @Override // o.AbstractC5220b0.a
            public final InputStream a(byte[] bArr, int i, int i2) {
                return new ByteArrayInputStream(bArr, i, i2);
            }
        });
    }

    @Override // o.AbstractC5220b0
    public synchronized int p(InputStream inputStream) throws IOException {
        return r(inputStream);
    }

    @Override // o.AbstractC5220b0
    public synchronized void u(OutputStream outputStream) throws IOException {
        v(outputStream);
    }

    @Override // o.AbstractC5220b0, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        C7743lL0.q(bArr, i, i2);
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            t(bArr, i, i2);
        }
    }

    public C2986Fr(int i) {
        if (i >= 0) {
            synchronized (this) {
                d(i);
            }
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i);
    }

    @Override // o.AbstractC5220b0, java.io.OutputStream
    public synchronized void write(int i) {
        s(i);
    }
}
