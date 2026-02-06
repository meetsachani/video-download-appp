package o;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.nio.channels.Channel;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.function.IntUnaryOperator;
import o.AbstractC9396s3;

/* renamed from: o.s3 */
/* loaded from: classes4.dex */
public abstract class AbstractC9396s3<T, B extends AbstractC9396s3<T, B>> extends C2<T, B> {
    public static final int j = Integer.MAX_VALUE;
    public static final OpenOption[] k = C11130zA1.j;
    public int b = 8192;
    public int c = 8192;
    public int d = Integer.MAX_VALUE;
    public Charset e = Charset.defaultCharset();
    public Charset f = Charset.defaultCharset();
    public OpenOption[] g = k;
    public final IntUnaryOperator h;
    public IntUnaryOperator i;

    public AbstractC9396s3() {
        IntUnaryOperator intUnaryOperator = new IntUnaryOperator() { // from class: o.r3
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return AbstractC9396s3.J(AbstractC9396s3.this, i);
            }
        };
        this.h = intUnaryOperator;
        this.i = intUnaryOperator;
    }

    public static /* synthetic */ int J(AbstractC9396s3 abstractC9396s3, int i) {
        int i2 = abstractC9396s3.d;
        if (i > i2) {
            return abstractC9396s3.i0(i, i2);
        }
        return i;
    }

    public final int K(int i) {
        return this.i.applyAsInt(i);
    }

    public int L() {
        return this.b;
    }

    public int M() {
        return this.c;
    }

    public <C extends Channel> C N(Class<C> cls) throws IOException {
        return (C) d().f(cls, T());
    }

    public CharSequence O() throws IOException {
        return d().h(P());
    }

    public Charset P() {
        return this.e;
    }

    public Charset Q() {
        return this.f;
    }

    public File R() {
        return d().i();
    }

    public InputStream S() throws IOException {
        return d().j(T());
    }

    public OpenOption[] T() {
        return this.g;
    }

    public OutputStream U() throws IOException {
        return d().k(T());
    }

    public Path V() {
        return d().l();
    }

    public RandomAccessFile W() throws IOException {
        return d().m(T());
    }

    public Reader X() throws IOException {
        return d().n(P());
    }

    public Writer Y() throws IOException {
        return d().p(P(), T());
    }

    public B Z(int i) {
        if (i <= 0) {
            i = this.c;
        }
        this.b = K(i);
        return (B) c();
    }

    public B a0(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.c;
        }
        Z(i);
        return (B) c();
    }

    public B b0(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            intUnaryOperator = this.h;
        }
        this.i = intUnaryOperator;
        return (B) c();
    }

    public B c0(int i) {
        this.c = i;
        return (B) c();
    }

    public B d0(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.d = i;
        return (B) c();
    }

    public B e0(String str) {
        return f0(IB.f(str, this.f));
    }

    public B f0(Charset charset) {
        this.e = IB.h(charset, this.f);
        return (B) c();
    }

    public B g0(Charset charset) {
        this.f = charset;
        return (B) c();
    }

    public B h0(OpenOption... openOptionArr) {
        if (openOptionArr == null) {
            openOptionArr = k;
        }
        this.g = openOptionArr;
        return (B) c();
    }

    public final int i0(int i, int i2) {
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
