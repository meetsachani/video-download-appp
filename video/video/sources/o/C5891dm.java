package o;

import java.nio.ByteBuffer;

@Deprecated
/* renamed from: o.dm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5891dm extends C9267rW {
    public static final int k1 = 32;
    @InterfaceC5056aJ2
    public static final int l1 = 3072000;
    public long h1;
    public int i1;
    public int j1;

    public C5891dm() {
        super(2);
        this.j1 = 32;
    }

    public boolean B(C9267rW c9267rW) {
        C9542sf.a(!c9267rW.y());
        C9542sf.a(!c9267rW.o());
        C9542sf.a(!c9267rW.q());
        if (!C(c9267rW)) {
            return false;
        }
        int i = this.i1;
        this.i1 = i + 1;
        if (i == 0) {
            this.a1 = c9267rW.a1;
            if (c9267rW.s()) {
                u(1);
            }
        }
        if (c9267rW.p()) {
            u(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = c9267rW.Y0;
        if (byteBuffer != null) {
            w(byteBuffer.remaining());
            this.Y0.put(byteBuffer);
        }
        this.h1 = c9267rW.a1;
        return true;
    }

    public final boolean C(C9267rW c9267rW) {
        ByteBuffer byteBuffer;
        if (!G()) {
            return true;
        }
        if (this.i1 >= this.j1 || c9267rW.p() != p()) {
            return false;
        }
        ByteBuffer byteBuffer2 = c9267rW.Y0;
        if (byteBuffer2 == null || (byteBuffer = this.Y0) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    public long D() {
        return this.a1;
    }

    public long E() {
        return this.h1;
    }

    public int F() {
        return this.i1;
    }

    public boolean G() {
        if (this.i1 > 0) {
            return true;
        }
        return false;
    }

    public void H(@BR0(from = 1) int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.j1 = i;
    }

    @Override // o.C9267rW, o.AbstractC5906dq
    public void l() {
        super.l();
        this.i1 = 0;
    }
}
