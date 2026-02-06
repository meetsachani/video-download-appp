package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@InterfaceC6181ey
@InterfaceC7311ja0
/* loaded from: classes3.dex */
public abstract class W0 implements CG0 {
    @Override // o.CG0
    public <T> CG0 n(@InterfaceC8885py1 T t, TB0<? super T> tb0) {
        tb0.s5(t, this);
        return this;
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public final CG0 a(double d) {
        return f(Double.doubleToRawLongBits(d));
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public final CG0 b(float f) {
        return e(Float.floatToRawIntBits(f));
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 c(short s) {
        i((byte) s);
        i((byte) (s >>> 8));
        return this;
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public final CG0 d(boolean z) {
        return i(z ? (byte) 1 : (byte) 0);
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 e(int i) {
        i((byte) i);
        i((byte) (i >>> 8));
        i((byte) (i >>> 16));
        i((byte) (i >>> 24));
        return this;
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 f(long j) {
        for (int i = 0; i < 64; i += 8) {
            i((byte) (j >>> i));
        }
        return this;
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 g(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 h(char c) {
        i((byte) c);
        i((byte) (c >>> '\b'));
        return this;
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 j(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            h(charSequence.charAt(i));
        }
        return this;
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 k(byte[] bArr, int i, int i2) {
        C10664xF1.f0(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            i(bArr[i + i3]);
        }
        return this;
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 l(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            C10480wU0.d(byteBuffer, byteBuffer.limit());
            return this;
        }
        for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
            i(byteBuffer.get());
        }
        return this;
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 m(CharSequence charSequence, Charset charset) {
        return g(charSequence.toString().getBytes(charset));
    }
}
