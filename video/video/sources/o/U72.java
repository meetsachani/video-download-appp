package o;

import java.nio.ByteBuffer;

@Deprecated
/* loaded from: classes2.dex */
public abstract class U72 implements InterfaceC4612Wi1 {
    @Override // o.InterfaceC4612Wi1
    @InterfaceC11300zs1
    public final C4224Si1 a(C5638cj1 c5638cj1) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) C9542sf.g(c5638cj1.Y0);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        if (c5638cj1.p()) {
            return null;
        }
        return b(c5638cj1, byteBuffer);
    }

    @InterfaceC11300zs1
    public abstract C4224Si1 b(C5638cj1 c5638cj1, ByteBuffer byteBuffer);
}
