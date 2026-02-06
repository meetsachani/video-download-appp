package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.C4224Si1;

@Deprecated
/* renamed from: o.ij1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7106ij1 extends AbstractC2853El implements Handler.Callback {
    public static final String v1 = "MetadataRenderer";
    public static final int w1 = 0;
    public final InterfaceC4709Xi1 k1;
    public final InterfaceC6864hj1 l1;
    @InterfaceC11300zs1
    public final Handler m1;
    public final C5638cj1 n1;
    public final boolean o1;
    @InterfaceC11300zs1
    public InterfaceC4612Wi1 p1;
    public boolean q1;
    public boolean r1;
    public long s1;
    @InterfaceC11300zs1
    public C4224Si1 t1;
    public long u1;

    public C7106ij1(InterfaceC6864hj1 interfaceC6864hj1, @InterfaceC11300zs1 Looper looper) {
        this(interfaceC6864hj1, looper, InterfaceC4709Xi1.a);
    }

    @Override // o.InterfaceC10469wR1
    public void D(long j, long j2) {
        boolean z = true;
        while (z) {
            i0();
            z = h0(j);
        }
    }

    @Override // o.AbstractC2853El
    public void R() {
        this.t1 = null;
        this.p1 = null;
        this.u1 = C10323vs.b;
    }

    @Override // o.AbstractC2853El
    public void T(long j, boolean z) {
        this.t1 = null;
        this.q1 = false;
        this.r1 = false;
    }

    @Override // o.AbstractC2853El
    public void Z(C10833xx0[] c10833xx0Arr, long j, long j2) {
        this.p1 = this.k1.b(c10833xx0Arr[0]);
        C4224Si1 c4224Si1 = this.t1;
        if (c4224Si1 != null) {
            this.t1 = c4224Si1.c((c4224Si1.Y + this.u1) - j2);
        }
        this.u1 = j2;
    }

    @Override // o.InterfaceC10712xR1
    public int a(C10833xx0 c10833xx0) {
        int i;
        if (this.k1.a(c10833xx0)) {
            if (c10833xx0.B1 == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return InterfaceC10712xR1.r(i);
        }
        return InterfaceC10712xR1.r(0);
    }

    @Override // o.InterfaceC10469wR1
    public boolean c() {
        return this.r1;
    }

    public final void d0(C4224Si1 c4224Si1, List<C4224Si1.b> list) {
        for (int i = 0; i < c4224Si1.e(); i++) {
            C10833xx0 j = c4224Si1.d(i).j();
            if (j != null && this.k1.a(j)) {
                InterfaceC4612Wi1 b = this.k1.b(j);
                byte[] bArr = (byte[]) C9542sf.g(c4224Si1.d(i).y0());
                this.n1.l();
                this.n1.w(bArr.length);
                ((ByteBuffer) TD2.o(this.n1.Y0)).put(bArr);
                this.n1.x();
                C4224Si1 a = b.a(this.n1);
                if (a != null) {
                    d0(a, list);
                }
            } else {
                list.add(c4224Si1.d(i));
            }
        }
    }

    @V52
    public final long e0(long j) {
        boolean z;
        boolean z2 = false;
        if (j != C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (this.u1 != C10323vs.b) {
            z2 = true;
        }
        C9542sf.i(z2);
        return j - this.u1;
    }

    public final void f0(C4224Si1 c4224Si1) {
        Handler handler = this.m1;
        if (handler != null) {
            handler.obtainMessage(0, c4224Si1).sendToTarget();
        } else {
            g0(c4224Si1);
        }
    }

    public final void g0(C4224Si1 c4224Si1) {
        this.l1.s(c4224Si1);
    }

    @Override // o.InterfaceC10469wR1, o.InterfaceC10712xR1
    public String getName() {
        return v1;
    }

    public final boolean h0(long j) {
        boolean z;
        C4224Si1 c4224Si1 = this.t1;
        if (c4224Si1 != null && (this.o1 || c4224Si1.Y <= e0(j))) {
            f0(this.t1);
            this.t1 = null;
            z = true;
        } else {
            z = false;
        }
        if (this.q1 && this.t1 == null) {
            this.r1 = true;
        }
        return z;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            g0((C4224Si1) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final void i0() {
        if (!this.q1 && this.t1 == null) {
            this.n1.l();
            C2899Ex0 L = L();
            int a0 = a0(L, this.n1, 0);
            if (a0 == -4) {
                if (this.n1.q()) {
                    this.q1 = true;
                    return;
                }
                C5638cj1 c5638cj1 = this.n1;
                c5638cj1.h1 = this.s1;
                c5638cj1.x();
                C4224Si1 a = ((InterfaceC4612Wi1) TD2.o(this.p1)).a(this.n1);
                if (a != null) {
                    ArrayList arrayList = new ArrayList(a.e());
                    d0(a, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.t1 = new C4224Si1(e0(this.n1.a1), arrayList);
                    }
                }
            } else if (a0 == -5) {
                this.s1 = ((C10833xx0) C9542sf.g(L.b)).k1;
            }
        }
    }

    @Override // o.InterfaceC10469wR1
    public boolean isReady() {
        return true;
    }

    public C7106ij1(InterfaceC6864hj1 interfaceC6864hj1, @InterfaceC11300zs1 Looper looper, InterfaceC4709Xi1 interfaceC4709Xi1) {
        this(interfaceC6864hj1, looper, interfaceC4709Xi1, false);
    }

    public C7106ij1(InterfaceC6864hj1 interfaceC6864hj1, @InterfaceC11300zs1 Looper looper, InterfaceC4709Xi1 interfaceC4709Xi1, boolean z) {
        super(5);
        this.l1 = (InterfaceC6864hj1) C9542sf.g(interfaceC6864hj1);
        this.m1 = looper == null ? null : TD2.B(looper, this);
        this.k1 = (InterfaceC4709Xi1) C9542sf.g(interfaceC4709Xi1);
        this.o1 = z;
        this.n1 = new C5638cj1();
        this.u1 = C10323vs.b;
    }
}
