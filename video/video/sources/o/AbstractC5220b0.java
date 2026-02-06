package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.AbstractC5220b0;

/* renamed from: o.b0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5220b0<T extends AbstractC5220b0<T>> extends OutputStream {
    public static final int b1 = 1024;
    public int Y;
    public byte[] Z;
    public int Z0;
    public final List<byte[]> X = new ArrayList();
    public int Y0 = -1;
    public boolean a1 = true;

    @FunctionalInterface
    /* renamed from: o.b0$a */
    /* loaded from: classes4.dex */
    public interface a<T extends InputStream> {
        T a(byte[] bArr, int i, int i2);
    }

    public void d(int i) {
        if (this.Y0 < this.X.size() - 1) {
            this.Z0 += this.Z.length;
            int i2 = this.Y0 + 1;
            this.Y0 = i2;
            this.Z = this.X.get(i2);
            return;
        }
        byte[] bArr = this.Z;
        if (bArr == null) {
            if (i <= 0) {
                i = 1024;
            }
            this.Z0 = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.Z0);
            this.Z0 += this.Z.length;
        }
        this.Y0++;
        byte[] l = C7743lL0.l(i);
        this.Z = l;
        this.X.add(l);
    }

    public abstract void f();

    public void h() {
        this.Y = 0;
        this.Z0 = 0;
        this.Y0 = 0;
        if (this.a1) {
            this.Z = this.X.get(0);
            return;
        }
        this.Z = null;
        int length = this.X.get(0).length;
        this.X.clear();
        d(length);
        this.a1 = true;
    }

    public abstract int i();

    public abstract byte[] j();

    public byte[] k() {
        int i = this.Y;
        if (i == 0) {
            return C7743lL0.f;
        }
        byte[] l = C7743lL0.l(i);
        int i2 = 0;
        for (byte[] bArr : this.X) {
            int min = Math.min(bArr.length, i);
            System.arraycopy(bArr, 0, l, i2, min);
            i2 += min;
            i -= min;
            if (i == 0) {
                break;
            }
        }
        return l;
    }

    public abstract InputStream l();

    public <T extends InputStream> InputStream m(a<T> aVar) {
        int i = this.Y;
        if (i == 0) {
            return C6501gE.X;
        }
        ArrayList arrayList = new ArrayList(this.X.size());
        for (byte[] bArr : this.X) {
            int min = Math.min(bArr.length, i);
            arrayList.add(aVar.a(bArr, 0, min));
            i -= min;
            if (i == 0) {
                break;
            }
        }
        this.a1 = false;
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public String n(String str) throws UnsupportedEncodingException {
        return new String(j(), str);
    }

    public String o(Charset charset) {
        return new String(j(), charset);
    }

    public abstract int p(InputStream inputStream) throws IOException;

    public T q(CharSequence charSequence, Charset charset) {
        write(charSequence.toString().getBytes(IB.g(charset)));
        return a();
    }

    public int r(InputStream inputStream) throws IOException {
        int i = this.Y - this.Z0;
        byte[] bArr = this.Z;
        int read = inputStream.read(bArr, i, bArr.length - i);
        int i2 = 0;
        while (read != -1) {
            i2 += read;
            i += read;
            this.Y += read;
            byte[] bArr2 = this.Z;
            if (i == bArr2.length) {
                d(bArr2.length);
                i = 0;
            }
            byte[] bArr3 = this.Z;
            read = inputStream.read(bArr3, i, bArr3.length - i);
        }
        return i2;
    }

    public void s(int i) {
        int i2 = this.Y;
        int i3 = i2 - this.Z0;
        if (i3 == this.Z.length) {
            d(i2 + 1);
            i3 = 0;
        }
        this.Z[i3] = (byte) i;
        this.Y++;
    }

    public void t(byte[] bArr, int i, int i2) {
        int i3 = this.Y;
        int i4 = i3 + i2;
        int i5 = i3 - this.Z0;
        int i6 = i2;
        while (i6 > 0) {
            int min = Math.min(i6, this.Z.length - i5);
            System.arraycopy(bArr, (i + i2) - i6, this.Z, i5, min);
            i6 -= min;
            if (i6 > 0) {
                d(i4);
                i5 = 0;
            }
        }
        this.Y = i4;
    }

    @Deprecated
    public String toString() {
        return new String(j(), Charset.defaultCharset());
    }

    public abstract void u(OutputStream outputStream) throws IOException;

    public void v(OutputStream outputStream) throws IOException {
        int i = this.Y;
        for (byte[] bArr : this.X) {
            int min = Math.min(bArr.length, i);
            outputStream.write(bArr, 0, min);
            i -= min;
            if (i == 0) {
                return;
            }
        }
    }

    @Override // java.io.OutputStream
    public abstract void write(int i);

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i, int i2);

    public T a() {
        return this;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
