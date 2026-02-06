package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import o.InterfaceC8148mw2;

/* renamed from: o.gC2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6496gC2 extends InputStream {
    public static final int Z0 = -1;
    public final byte[] X;
    public final int Y;
    public int Y0;
    public int Z;

    /* renamed from: o.gC2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C6496gC2, b> {
        public int l;
        public int m;

        public final byte[] m0() throws IOException {
            return d().d();
        }

        @Override // o.XK0
        /* renamed from: n0 */
        public C6496gC2 get() throws IOException {
            return new C6496gC2(this);
        }

        @Override // o.C2
        /* renamed from: o0 */
        public b u(byte[] bArr) {
            Objects.requireNonNull(bArr, "origin");
            this.m = bArr.length;
            return (b) super.u(bArr);
        }

        public b p0(int i) {
            if (i >= 0) {
                this.m = i;
                return this;
            }
            throw new IllegalArgumentException("length cannot be negative");
        }

        public b q0(int i) {
            if (i >= 0) {
                this.l = i;
                return this;
            }
            throw new IllegalArgumentException("offset cannot be negative");
        }
    }

    public static b a() {
        return new b();
    }

    public static int d(byte[] bArr, int i) {
        int i2;
        f(i, "defaultValue");
        if (bArr.length > 0) {
            i2 = bArr.length;
        } else {
            i2 = i;
        }
        return Math.min(i, i2);
    }

    public static int f(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative");
    }

    @Override // java.io.InputStream
    public int available() {
        int i = this.Z;
        int i2 = this.Y;
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.Y0 = this.Z;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.Z;
        if (i < this.Y) {
            byte[] bArr = this.X;
            this.Z = i + 1;
            return bArr[i] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.Z = this.Y0;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j >= 0) {
            int i = this.Y;
            int i2 = this.Z;
            long j2 = i - i2;
            if (j < j2) {
                j2 = j;
            }
            this.Z = Math.addExact(i2, Math.toIntExact(j));
            return j2;
        }
        throw new IllegalArgumentException("Skipping backward is not supported");
    }

    public C6496gC2(b bVar) throws IOException {
        this(bVar.m0(), bVar.l, bVar.m);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Deprecated
    public C6496gC2(byte[] bArr) {
        this(bArr, bArr.length, 0, 0);
    }

    @Deprecated
    public C6496gC2(byte[] bArr, int i) {
        this(bArr, bArr.length, Math.min(f(i, InterfaceC8148mw2.c.R), d(bArr, i)), d(bArr, i));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C7743lL0.q(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.Z;
        int i4 = this.Y;
        if (i3 >= i4) {
            return -1;
        }
        int i5 = i4 - i3;
        if (i2 >= i5) {
            i2 = i5;
        }
        if (i2 <= 0) {
            return 0;
        }
        System.arraycopy(this.X, i3, bArr, i, i2);
        this.Z += i2;
        return i2;
    }

    @Deprecated
    public C6496gC2(byte[] bArr, int i, int i2) {
        f(i, InterfaceC8148mw2.c.R);
        f(i2, "length");
        Objects.requireNonNull(bArr, "data");
        this.X = bArr;
        this.Y = Math.min(d(bArr, i) + i2, bArr.length);
        this.Z = d(bArr, i);
        this.Y0 = d(bArr, i);
    }

    public C6496gC2(byte[] bArr, int i, int i2, int i3) {
        Objects.requireNonNull(bArr, "data");
        this.X = bArr;
        this.Y = i;
        this.Z = i2;
        this.Y0 = i3;
    }
}
