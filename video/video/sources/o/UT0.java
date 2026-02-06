package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public class UT0 extends InputStream {
    public Iterator<ByteBuffer> X;
    public ByteBuffer Y;
    public int Y0;
    public int Z = 0;
    public int Z0;
    public boolean a1;
    public byte[] b1;
    public int c1;
    public long d1;

    public UT0(Iterable<ByteBuffer> iterable) {
        this.X = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.Z++;
        }
        this.Y0 = -1;
        if (!a()) {
            this.Y = C9740tS0.e;
            this.Y0 = 0;
            this.Z0 = 0;
            this.d1 = 0L;
        }
    }

    public final boolean a() {
        this.Y0++;
        if (!this.X.hasNext()) {
            return false;
        }
        ByteBuffer next = this.X.next();
        this.Y = next;
        this.Z0 = next.position();
        if (this.Y.hasArray()) {
            this.a1 = true;
            this.b1 = this.Y.array();
            this.c1 = this.Y.arrayOffset();
        } else {
            this.a1 = false;
            this.d1 = TB2.i(this.Y);
            this.b1 = null;
        }
        return true;
    }

    public final void d(int i) {
        int i2 = this.Z0 + i;
        this.Z0 = i2;
        if (i2 == this.Y.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.Y0 == this.Z) {
            return -1;
        }
        if (this.a1) {
            int i = this.b1[this.Z0 + this.c1] & 255;
            d(1);
            return i;
        }
        int y = TB2.y(this.Z0 + this.d1) & 255;
        d(1);
        return y;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.Y0 == this.Z) {
            return -1;
        }
        int limit = this.Y.limit();
        int i3 = this.Z0;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.a1) {
            System.arraycopy(this.b1, i3 + this.c1, bArr, i, i2);
            d(i2);
            return i2;
        }
        int position = this.Y.position();
        this.Y.position(this.Z0);
        this.Y.get(bArr, i, i2);
        this.Y.position(position);
        d(i2);
        return i2;
    }
}
