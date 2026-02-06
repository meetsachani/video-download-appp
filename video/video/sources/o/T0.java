package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@NN0
@InterfaceC7311ja0
/* loaded from: classes3.dex */
public abstract class T0 implements InterfaceC9449sG0 {
    @Override // o.InterfaceC9449sG0
    public <T> AbstractC8471oG0 a(@InterfaceC8885py1 T t, TB0<? super T> tb0) {
        return g().n(t, tb0).o();
    }

    @Override // o.InterfaceC9449sG0
    public AbstractC8471oG0 b(CharSequence charSequence, Charset charset) {
        return g().m(charSequence, charset).o();
    }

    @Override // o.InterfaceC9449sG0
    public AbstractC8471oG0 c(CharSequence charSequence) {
        return e(charSequence.length() * 2).j(charSequence).o();
    }

    @Override // o.InterfaceC9449sG0
    public CG0 e(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "expectedInputSize must be >= 0 but was %s", i);
        return g();
    }

    @Override // o.InterfaceC9449sG0
    public AbstractC8471oG0 f(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    @Override // o.InterfaceC9449sG0
    public AbstractC8471oG0 h(int i) {
        return e(4).e(i).o();
    }

    @Override // o.InterfaceC9449sG0
    public AbstractC8471oG0 i(ByteBuffer byteBuffer) {
        return e(byteBuffer.remaining()).l(byteBuffer).o();
    }

    @Override // o.InterfaceC9449sG0
    public AbstractC8471oG0 j(long j) {
        return e(8).f(j).o();
    }

    @Override // o.InterfaceC9449sG0
    public AbstractC8471oG0 k(byte[] bArr, int i, int i2) {
        C10664xF1.f0(i, i + i2, bArr.length);
        return e(i2).k(bArr, i, i2).o();
    }
}
