package o;

import java.nio.ByteBuffer;
import o.InterfaceC5143ah;

@Deprecated
/* renamed from: o.n62  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8189n62 extends AbstractC5402bl {
    public static final long u = 150000;
    public static final long v = 20000;
    public static final short w = 1024;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 2;
    public final long i;
    public final long j;
    public final short k;
    public int l;
    public boolean m;
    public byte[] n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f821o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public C8189n62() {
        this(u, 20000L, w);
    }

    @Override // o.AbstractC5402bl
    @InterfaceC6181ey
    public InterfaceC5143ah.a b(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        if (aVar.c == 2) {
            if (this.m) {
                return aVar;
            }
            return InterfaceC5143ah.a.e;
        }
        throw new InterfaceC5143ah.b(aVar);
    }

    @Override // o.InterfaceC5143ah
    public void f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !a()) {
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        u(byteBuffer);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    s(byteBuffer);
                }
            } else {
                t(byteBuffer);
            }
        }
    }

    @Override // o.AbstractC5402bl, o.InterfaceC5143ah
    public boolean h() {
        return this.m;
    }

    @Override // o.AbstractC5402bl
    public void i() {
        if (this.m) {
            this.l = this.b.d;
            int m = m(this.i) * this.l;
            if (this.n.length != m) {
                this.n = new byte[m];
            }
            int m2 = m(this.j) * this.l;
            this.r = m2;
            if (this.f821o.length != m2) {
                this.f821o = new byte[m2];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // o.AbstractC5402bl
    public void j() {
        int i = this.q;
        if (i > 0) {
            r(this.n, i);
        }
        if (!this.s) {
            this.t += this.r / this.l;
        }
    }

    @Override // o.AbstractC5402bl
    public void k() {
        this.m = false;
        this.r = 0;
        byte[] bArr = TD2.f;
        this.n = bArr;
        this.f821o = bArr;
    }

    public final int m(long j) {
        return (int) ((j * this.b.a) / 1000000);
    }

    public final int n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit >= byteBuffer.position()) {
                if (Math.abs((int) byteBuffer.getShort(limit)) > this.k) {
                    int i = this.l;
                    return ((limit / i) * i) + i;
                }
            } else {
                return byteBuffer.position();
            }
        }
    }

    public final int o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.k) {
                int i = this.l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    public long p() {
        return this.t;
    }

    public final void q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.s = true;
        }
    }

    public final void r(byte[] bArr, int i) {
        l(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.s = true;
        }
    }

    public final void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o2 = o(byteBuffer);
        int position = o2 - byteBuffer.position();
        byte[] bArr = this.n;
        int length = bArr.length;
        int i = this.q;
        int i2 = length - i;
        if (o2 < limit && position < i2) {
            r(bArr, i);
            this.q = 0;
            this.p = 0;
            return;
        }
        int min = Math.min(position, i2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.n, this.q, min);
        int i3 = this.q + min;
        this.q = i3;
        byte[] bArr2 = this.n;
        if (i3 == bArr2.length) {
            if (this.s) {
                r(bArr2, this.r);
                this.t += (this.q - (this.r * 2)) / this.l;
            } else {
                this.t += (i3 - this.r) / this.l;
            }
            w(byteBuffer, this.n, this.q);
            this.q = 0;
            this.p = 2;
        }
        byteBuffer.limit(limit);
    }

    public final void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.n.length));
        int n = n(byteBuffer);
        if (n == byteBuffer.position()) {
            this.p = 1;
        } else {
            byteBuffer.limit(n);
            q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    public final void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o2 = o(byteBuffer);
        byteBuffer.limit(o2);
        this.t += byteBuffer.remaining() / this.l;
        w(byteBuffer, this.f821o, this.r);
        if (o2 < limit) {
            r(this.f821o, this.r);
            this.p = 0;
            byteBuffer.limit(limit);
        }
    }

    public void v(boolean z2) {
        this.m = z2;
    }

    public final void w(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.r);
        int i2 = this.r - min;
        System.arraycopy(bArr, i - i2, this.f821o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f821o, i2, min);
    }

    public C8189n62(long j, long j2, short s) {
        C9542sf.a(j2 <= j);
        this.i = j;
        this.j = j2;
        this.k = s;
        byte[] bArr = TD2.f;
        this.n = bArr;
        this.f821o = bArr;
    }
}
