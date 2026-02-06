package o;

import com.facebook.internal.H;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import o.AbstractC8616os;

/* renamed from: o.cq1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5666cq1 extends AbstractC8616os.i {
    public final ByteBuffer d1;

    public C5666cq1(ByteBuffer byteBuffer) {
        C9740tS0.e(byteBuffer, H.a.b);
        this.d1 = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return AbstractC8616os.B(this.d1.slice());
    }

    @Override // o.AbstractC8616os
    public void H0(OutputStream outputStream) throws IOException {
        outputStream.write(v0());
    }

    @Override // o.AbstractC8616os
    public void J(ByteBuffer byteBuffer) {
        byteBuffer.put(this.d1.slice());
    }

    @Override // o.AbstractC8616os
    public void J0(AbstractC6898hs abstractC6898hs) throws IOException {
        abstractC6898hs.W(this.d1.slice());
    }

    @Override // o.AbstractC8616os
    public void K0(OutputStream outputStream, int i, int i2) throws IOException {
        if (this.d1.hasArray()) {
            outputStream.write(this.d1.array(), this.d1.arrayOffset() + this.d1.position() + i, i2);
            return;
        }
        C4646Wr.h(P0(i, i2 + i), outputStream);
    }

    @Override // o.AbstractC8616os
    public void M(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.d1.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    @Override // o.AbstractC8616os.i
    public boolean N0(AbstractC8616os abstractC8616os, int i, int i2) {
        return u0(0, i2).equals(abstractC8616os.u0(i, i2 + i));
    }

    public final ByteBuffer P0(int i, int i2) {
        if (i >= this.d1.position() && i2 <= this.d1.limit() && i <= i2) {
            ByteBuffer slice = this.d1.slice();
            slice.position(i - this.d1.position());
            slice.limit(i2 - this.d1.position());
            return slice;
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // o.AbstractC8616os
    public byte V(int i) {
        return i(i);
    }

    @Override // o.AbstractC8616os
    public boolean Y() {
        return BD2.s(this.d1);
    }

    @Override // o.AbstractC8616os
    public KE d0() {
        return KE.o(this.d1, true);
    }

    @Override // o.AbstractC8616os
    public ByteBuffer e() {
        return this.d1.asReadOnlyBuffer();
    }

    @Override // o.AbstractC8616os
    public InputStream e0() {
        return new a();
    }

    @Override // o.AbstractC8616os
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8616os)) {
            return false;
        }
        AbstractC8616os abstractC8616os = (AbstractC8616os) obj;
        if (size() != abstractC8616os.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C5666cq1) {
            return this.d1.equals(((C5666cq1) obj).d1);
        }
        if (obj instanceof C5102aV1) {
            return obj.equals(this);
        }
        return this.d1.equals(abstractC8616os.e());
    }

    @Override // o.AbstractC8616os
    public List<ByteBuffer> f() {
        return Collections.singletonList(e());
    }

    @Override // o.AbstractC8616os
    public byte i(int i) {
        try {
            return this.d1.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // o.AbstractC8616os
    public int j0(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.d1.get(i4);
        }
        return i;
    }

    @Override // o.AbstractC8616os
    public int k0(int i, int i2, int i3) {
        return BD2.v(i, this.d1, i2, i3 + i2);
    }

    @Override // o.AbstractC8616os
    public int size() {
        return this.d1.remaining();
    }

    @Override // o.AbstractC8616os
    public AbstractC8616os u0(int i, int i2) {
        try {
            return new C5666cq1(P0(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // o.AbstractC8616os
    public String z0(Charset charset) {
        byte[] v0;
        int length;
        int i;
        if (this.d1.hasArray()) {
            v0 = this.d1.array();
            i = this.d1.arrayOffset() + this.d1.position();
            length = this.d1.remaining();
        } else {
            v0 = v0();
            length = v0.length;
            i = 0;
        }
        return new String(v0, i, length, charset);
    }

    /* renamed from: o.cq1$a */
    /* loaded from: classes.dex */
    public class a extends InputStream {
        public final ByteBuffer X;

        public a() {
            this.X = C5666cq1.this.d1.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.X.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.X.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.X.hasRemaining()) {
                return this.X.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.X.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.X.hasRemaining()) {
                int min = Math.min(i2, this.X.remaining());
                this.X.get(bArr, i, min);
                return min;
            }
            return -1;
        }
    }
}
