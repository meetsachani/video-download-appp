package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.AbstractC5220b0;

/* renamed from: o.jC2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7223jC2 extends AbstractC5220b0<C7223jC2> {

    /* renamed from: o.jC2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C7223jC2, b> {
        @Override // o.XK0
        /* renamed from: j0 */
        public C7223jC2 get() {
            return new C7223jC2(this);
        }
    }

    public static InputStream A(InputStream inputStream) throws IOException {
        return C(inputStream, 1024);
    }

    public static InputStream C(InputStream inputStream, int i) throws IOException {
        C7223jC2 c7223jC2 = z().Z(i).get();
        try {
            c7223jC2.p(inputStream);
            InputStream l = c7223jC2.l();
            c7223jC2.close();
            return l;
        } catch (Throwable th) {
            if (c7223jC2 != null) {
                try {
                    c7223jC2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ C6496gC2 x(final byte[] bArr, final int i, final int i2) {
        return (C6496gC2) C8643oy2.j(new XK0() { // from class: o.hC2
            @Override // o.XK0
            public final Object get() {
                C6496gC2 c6496gC2;
                byte[] bArr2 = bArr;
                c6496gC2 = C6496gC2.a().u(bArr2).q0(i).p0(i2).get();
                return c6496gC2;
            }
        });
    }

    public static b z() {
        return new b();
    }

    @Override // o.AbstractC5220b0
    public void f() {
        h();
    }

    @Override // o.AbstractC5220b0
    public int i() {
        return this.Y;
    }

    @Override // o.AbstractC5220b0
    public byte[] j() {
        return k();
    }

    @Override // o.AbstractC5220b0
    public InputStream l() {
        return m(new AbstractC5220b0.a() { // from class: o.iC2
            @Override // o.AbstractC5220b0.a
            public final InputStream a(byte[] bArr, int i, int i2) {
                return C7223jC2.x(bArr, i, i2);
            }
        });
    }

    @Override // o.AbstractC5220b0
    public int p(InputStream inputStream) throws IOException {
        return r(inputStream);
    }

    @Override // o.AbstractC5220b0
    public void u(OutputStream outputStream) throws IOException {
        v(outputStream);
    }

    @Override // o.AbstractC5220b0, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        C7743lL0.q(bArr, i, i2);
        if (i2 == 0) {
            return;
        }
        t(bArr, i, i2);
    }

    @Deprecated
    public C7223jC2() {
        this(1024);
    }

    public C7223jC2(b bVar) {
        this(bVar.L());
    }

    @Override // o.AbstractC5220b0, java.io.OutputStream
    public void write(int i) {
        s(i);
    }

    @Deprecated
    public C7223jC2(int i) {
        if (i >= 0) {
            d(i);
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i);
    }
}
