package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@InterfaceC6181ey
@InterfaceC7311ja0
/* renamed from: o.t3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9639t3 extends W0 {
    public final ByteBuffer a;
    public final int b;
    public final int c;

    public AbstractC9639t3(int i) {
        this(i, i);
    }

    @Override // o.CG0
    public final AbstractC8471oG0 o() {
        q();
        C10480wU0.b(this.a);
        if (this.a.remaining() > 0) {
            t(this.a);
            ByteBuffer byteBuffer = this.a;
            C10480wU0.d(byteBuffer, byteBuffer.limit());
        }
        return p();
    }

    public abstract AbstractC8471oG0 p();

    public final void q() {
        C10480wU0.b(this.a);
        while (this.a.remaining() >= this.c) {
            s(this.a);
        }
        this.a.compact();
    }

    public final void r() {
        if (this.a.remaining() < 8) {
            q();
        }
    }

    public abstract void s(ByteBuffer byteBuffer);

    public void t(ByteBuffer byteBuffer) {
        C10480wU0.d(byteBuffer, byteBuffer.limit());
        C10480wU0.c(byteBuffer, this.c + 7);
        while (true) {
            int position = byteBuffer.position();
            int i = this.c;
            if (position < i) {
                byteBuffer.putLong(0L);
            } else {
                C10480wU0.c(byteBuffer, i);
                C10480wU0.b(byteBuffer);
                s(byteBuffer);
                return;
            }
        }
    }

    public final CG0 u(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.a.remaining()) {
            this.a.put(byteBuffer);
            r();
            return this;
        }
        int position = this.b - this.a.position();
        for (int i = 0; i < position; i++) {
            this.a.put(byteBuffer.get());
        }
        q();
        while (byteBuffer.remaining() >= this.c) {
            s(byteBuffer);
        }
        this.a.put(byteBuffer);
        return this;
    }

    public AbstractC9639t3(int i, int i2) {
        C10664xF1.d(i2 % i == 0);
        this.a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.b = i2;
        this.c = i;
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public final CG0 c(short s) {
        this.a.putShort(s);
        r();
        return this;
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public final CG0 e(int i) {
        this.a.putInt(i);
        r();
        return this;
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public final CG0 f(long j) {
        this.a.putLong(j);
        r();
        return this;
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public final CG0 h(char c) {
        this.a.putChar(c);
        r();
        return this;
    }

    @Override // o.CG0, o.InterfaceC8232nH1
    public final CG0 i(byte b) {
        this.a.put(b);
        r();
        return this;
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public final CG0 k(byte[] bArr, int i, int i2) {
        return u(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // o.W0, o.CG0, o.InterfaceC8232nH1
    public final CG0 l(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return u(byteBuffer);
        } finally {
            byteBuffer.order(order);
        }
    }
}
