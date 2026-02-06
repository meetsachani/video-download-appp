package o;

import java.nio.ByteBuffer;
import java.util.Arrays;

@Deprecated
/* renamed from: o.Pe0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3913Pe0 extends U72 {
    @Override // o.U72
    public C4224Si1 b(C5638cj1 c5638cj1, ByteBuffer byteBuffer) {
        return new C4224Si1(c(new C3012Fy1(byteBuffer.array(), byteBuffer.limit())));
    }

    public C3816Oe0 c(C3012Fy1 c3012Fy1) {
        return new C3816Oe0((String) C9542sf.g(c3012Fy1.F()), (String) C9542sf.g(c3012Fy1.F()), c3012Fy1.E(), c3012Fy1.E(), Arrays.copyOfRange(c3012Fy1.e(), c3012Fy1.f(), c3012Fy1.g()));
    }
}
