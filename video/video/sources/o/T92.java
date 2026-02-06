package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import o.InterfaceC5143ah;

/* loaded from: classes2.dex */
public class T92 implements InterfaceC5143ah {
    @Deprecated
    public static final int q = -1;
    public static final float r = 1.0E-4f;
    public static final int s = 1024;
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public InterfaceC5143ah.a e;
    public InterfaceC5143ah.a f;
    public InterfaceC5143ah.a g;
    public InterfaceC5143ah.a h;
    public boolean i;
    @InterfaceC11300zs1
    public S92 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f615o;
    public boolean p;

    public T92() {
        InterfaceC5143ah.a aVar = InterfaceC5143ah.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = InterfaceC5143ah.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    public final long a(long j) {
        if (this.f615o >= 1024) {
            long l = this.n - ((S92) C9542sf.g(this.j)).l();
            int i = this.h.a;
            int i2 = this.g.a;
            if (i == i2) {
                return TD2.C1(j, l, this.f615o);
            }
            return TD2.C1(j, l * i, this.f615o * i2);
        }
        return (long) (this.c * j);
    }

    public final void b(int i) {
        this.b = i;
    }

    @Override // o.InterfaceC5143ah
    public final boolean c() {
        if (this.p) {
            S92 s92 = this.j;
            if (s92 == null || s92.k() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.InterfaceC5143ah
    public final ByteBuffer d() {
        int k;
        S92 s92 = this.j;
        if (s92 != null && (k = s92.k()) > 0) {
            if (this.k.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            s92.j(this.l);
            this.f615o += k;
            this.k.limit(k);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = InterfaceC5143ah.a;
        return byteBuffer;
    }

    @Override // o.InterfaceC5143ah
    @InterfaceC6181ey
    public final InterfaceC5143ah.a e(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        if (aVar.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = aVar.a;
            }
            this.e = aVar;
            InterfaceC5143ah.a aVar2 = new InterfaceC5143ah.a(i, aVar.b, 2);
            this.f = aVar2;
            this.i = true;
            return aVar2;
        }
        throw new InterfaceC5143ah.b(aVar);
    }

    @Override // o.InterfaceC5143ah
    public final void f(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.n += remaining;
        ((S92) C9542sf.g(this.j)).t(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // o.InterfaceC5143ah
    public final void flush() {
        if (h()) {
            InterfaceC5143ah.a aVar = this.e;
            this.g = aVar;
            InterfaceC5143ah.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new S92(aVar.a, aVar.b, this.c, this.d, aVar2.a);
            } else {
                S92 s92 = this.j;
                if (s92 != null) {
                    s92.i();
                }
            }
        }
        this.m = InterfaceC5143ah.a;
        this.n = 0L;
        this.f615o = 0L;
        this.p = false;
    }

    @Override // o.InterfaceC5143ah
    public final void g() {
        S92 s92 = this.j;
        if (s92 != null) {
            s92.s();
        }
        this.p = true;
    }

    @Override // o.InterfaceC5143ah
    public final boolean h() {
        if (this.f.a != -1) {
            if (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public final void j(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // o.InterfaceC5143ah
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        InterfaceC5143ah.a aVar = InterfaceC5143ah.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = InterfaceC5143ah.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.f615o = 0L;
        this.p = false;
    }
}
