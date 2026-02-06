package o;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

@NN0
@InterfaceC7311ja0
/* renamed from: o.r2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9149r2 extends T0 {

    /* renamed from: o.r2$a */
    /* loaded from: classes3.dex */
    public final class a extends W0 {
        public final b a;

        public a(int i) {
            this.a = new b(i);
        }

        @Override // o.CG0
        public AbstractC8471oG0 o() {
            return AbstractC9149r2.this.k(this.a.a(), 0, this.a.d());
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 i(byte b) {
            this.a.write(b);
            return this;
        }

        @Override // o.W0, o.CG0, o.InterfaceC8232nH1
        public CG0 k(byte[] bArr, int i, int i2) {
            this.a.write(bArr, i, i2);
            return this;
        }

        @Override // o.W0, o.CG0, o.InterfaceC8232nH1
        public CG0 l(ByteBuffer byteBuffer) {
            this.a.f(byteBuffer);
            return this;
        }
    }

    /* renamed from: o.r2$b */
    /* loaded from: classes3.dex */
    public static final class b extends ByteArrayOutputStream {
        public b(int i) {
            super(i);
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public int d() {
            return ((ByteArrayOutputStream) this).count;
        }

        public void f(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i = ((ByteArrayOutputStream) this).count;
            int i2 = i + remaining;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i2 > bArr.length) {
                ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i + remaining);
            }
            byteBuffer.get(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, remaining);
            ((ByteArrayOutputStream) this).count += remaining;
        }
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 b(CharSequence charSequence, Charset charset) {
        return f(charSequence.toString().getBytes(charset));
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 c(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer order = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            order.putChar(charSequence.charAt(i));
        }
        return f(order.array());
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public CG0 e(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        return new a(i);
    }

    @Override // o.InterfaceC9449sG0
    public CG0 g() {
        return e(32);
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 h(int i) {
        return f(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 i(ByteBuffer byteBuffer) {
        return e(byteBuffer.remaining()).l(byteBuffer).o();
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 j(long j) {
        return f(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public abstract AbstractC8471oG0 k(byte[] bArr, int i, int i2);
}
