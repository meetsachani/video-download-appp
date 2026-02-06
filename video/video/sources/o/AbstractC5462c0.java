package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@InterfaceC6181ey
@InterfaceC7311ja0
/* renamed from: o.c0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5462c0 extends W0 {
    public final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    public final CG0 p(int i) {
        try {
            t(this.a.array(), 0, i);
            return this;
        } finally {
            C10480wU0.a(this.a);
        }
    }

    public abstract void q(byte b);

    public void r(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            t(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            C10480wU0.d(byteBuffer, byteBuffer.limit());
            return;
        }
        for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
            q(byteBuffer.get());
        }
    }

    public void s(byte[] bArr) {
        t(bArr, 0, bArr.length);
    }

    public void t(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            q(bArr[i3]);
        }
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public CG0 c(short s) {
        this.a.putShort(s);
        return p(2);
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public CG0 e(int i) {
        this.a.putInt(i);
        return p(4);
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public CG0 f(long j) {
        this.a.putLong(j);
        return p(8);
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public CG0 g(byte[] bArr) {
        C10664xF1.E(bArr);
        s(bArr);
        return this;
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public CG0 h(char c) {
        this.a.putChar(c);
        return p(2);
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public CG0 i(byte b) {
        q(b);
        return this;
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public CG0 k(byte[] bArr, int i, int i2) {
        C10664xF1.f0(i, i + i2, bArr.length);
        t(bArr, i, i2);
        return this;
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public CG0 l(ByteBuffer byteBuffer) {
        r(byteBuffer);
        return this;
    }
}
