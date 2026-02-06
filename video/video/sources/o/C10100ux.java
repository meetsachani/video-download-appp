package o;

import java.nio.ByteBuffer;

@Deprecated
/* renamed from: o.ux  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10100ux extends AbstractC2853El {
    public static final String p1 = "CameraMotionRenderer";
    public static final int q1 = 100000;
    public final C9267rW k1;
    public final C3012Fy1 l1;
    public long m1;
    @InterfaceC11300zs1
    public InterfaceC9857tx n1;
    public long o1;

    public C10100ux() {
        super(6);
        this.k1 = new C9267rW(1);
        this.l1 = new C3012Fy1();
    }

    @Override // o.InterfaceC10469wR1
    public void D(long j, long j2) {
        while (!k() && this.o1 < 100000 + j) {
            this.k1.l();
            if (a0(L(), this.k1, 0) == -4 && !this.k1.q()) {
                C9267rW c9267rW = this.k1;
                this.o1 = c9267rW.a1;
                if (this.n1 != null && !c9267rW.p()) {
                    this.k1.x();
                    float[] d0 = d0((ByteBuffer) TD2.o(this.k1.Y0));
                    if (d0 != null) {
                        ((InterfaceC9857tx) TD2.o(this.n1)).a(this.o1 - this.m1, d0);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // o.AbstractC2853El
    public void R() {
        e0();
    }

    @Override // o.AbstractC2853El
    public void T(long j, boolean z) {
        this.o1 = Long.MIN_VALUE;
        e0();
    }

    @Override // o.AbstractC2853El
    public void Z(C10833xx0[] c10833xx0Arr, long j, long j2) {
        this.m1 = j2;
    }

    @Override // o.InterfaceC10712xR1
    public int a(C10833xx0 c10833xx0) {
        if (C4128Rj1.I0.equals(c10833xx0.g1)) {
            return InterfaceC10712xR1.r(4);
        }
        return InterfaceC10712xR1.r(0);
    }

    @Override // o.InterfaceC10469wR1
    public boolean c() {
        return k();
    }

    @InterfaceC11300zs1
    public final float[] d0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.l1.W(byteBuffer.array(), byteBuffer.limit());
        this.l1.Y(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.l1.w());
        }
        return fArr;
    }

    public final void e0() {
        InterfaceC9857tx interfaceC9857tx = this.n1;
        if (interfaceC9857tx != null) {
            interfaceC9857tx.f();
        }
    }

    @Override // o.InterfaceC10469wR1, o.InterfaceC10712xR1
    public String getName() {
        return p1;
    }

    @Override // o.InterfaceC10469wR1
    public boolean isReady() {
        return true;
    }

    @Override // o.AbstractC2853El, o.OD1.b
    public void t(int i, @InterfaceC11300zs1 Object obj) throws C3824Og0 {
        if (i == 8) {
            this.n1 = (InterfaceC9857tx) obj;
        } else {
            super.t(i, obj);
        }
    }
}
