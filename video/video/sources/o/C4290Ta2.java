package o;

import java.nio.ByteBuffer;
import o.C4224Si1;

@Deprecated
/* renamed from: o.Ta2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4290Ta2 extends U72 {
    public static final int d = 0;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 255;
    public final C3012Fy1 a = new C3012Fy1();
    public final C2903Ey1 b = new C2903Ey1();
    public C10071up2 c;

    @Override // o.U72
    public C4224Si1 b(C5638cj1 c5638cj1, ByteBuffer byteBuffer) {
        C4224Si1.b c4484Va2;
        C10071up2 c10071up2 = this.c;
        if (c10071up2 == null || c5638cj1.h1 != c10071up2.e()) {
            C10071up2 c10071up22 = new C10071up2(c5638cj1.a1);
            this.c = c10071up22;
            c10071up22.a(c5638cj1.a1 - c5638cj1.h1);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.W(array, limit);
        this.b.p(array, limit);
        this.b.s(39);
        long h2 = (this.b.h(1) << 32) | this.b.h(32);
        this.b.s(20);
        int h3 = this.b.h(12);
        int h4 = this.b.h(8);
        this.a.Z(14);
        if (h4 != 0) {
            if (h4 != 255) {
                if (h4 != 4) {
                    if (h4 != 5) {
                        if (h4 != 6) {
                            c4484Va2 = null;
                        } else {
                            c4484Va2 = C4637Wo2.a(this.a, h2, this.c);
                        }
                    } else {
                        c4484Va2 = C4387Ua2.a(this.a, h2, this.c);
                    }
                } else {
                    c4484Va2 = C4581Wa2.a(this.a);
                }
            } else {
                c4484Va2 = KH1.a(this.a, h3, h2);
            }
        } else {
            c4484Va2 = new C4484Va2();
        }
        if (c4484Va2 == null) {
            return new C4224Si1(new C4224Si1.b[0]);
        }
        return new C4224Si1(c4484Va2);
    }
}
