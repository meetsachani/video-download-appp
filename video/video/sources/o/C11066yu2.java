package o;

import java.nio.ByteBuffer;
import o.InterfaceC5143ah;

@Deprecated
/* renamed from: o.yu2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11066yu2 extends AbstractC5402bl {
    public static final int p = 2;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = TD2.f;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public long f923o;

    @Override // o.AbstractC5402bl
    public InterfaceC5143ah.a b(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        if (aVar.c == 2) {
            this.k = true;
            if (this.i == 0 && this.j == 0) {
                return InterfaceC5143ah.a.e;
            }
            return aVar;
        }
        throw new InterfaceC5143ah.b(aVar);
    }

    @Override // o.AbstractC5402bl, o.InterfaceC5143ah
    public boolean c() {
        if (super.c() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC5402bl, o.InterfaceC5143ah
    public ByteBuffer d() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // o.InterfaceC5143ah
    public void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.l);
            this.f923o += min / this.b.d;
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l > 0) {
                return;
            }
            int i2 = i - min;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer l = l(length);
            int w = TD2.w(length, 0, this.n);
            l.put(this.m, 0, w);
            int w2 = TD2.w(length - w, 0, i2);
            byteBuffer.limit(byteBuffer.position() + w2);
            l.put(byteBuffer);
            byteBuffer.limit(limit);
            int i3 = i2 - w2;
            int i4 = this.n - w;
            this.n = i4;
            byte[] bArr = this.m;
            System.arraycopy(bArr, w, bArr, 0, i4);
            byteBuffer.get(this.m, this.n, i3);
            this.n += i3;
            l.flip();
        }
    }

    @Override // o.AbstractC5402bl
    public void i() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // o.AbstractC5402bl
    public void j() {
        int i;
        if (this.k) {
            if (this.n > 0) {
                this.f923o += i / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // o.AbstractC5402bl
    public void k() {
        this.m = TD2.f;
    }

    public long m() {
        return this.f923o;
    }

    public void n() {
        this.f923o = 0L;
    }

    public void o(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
