package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.AbstractC9510sW;

@Deprecated
/* loaded from: classes2.dex */
public class O72 extends AbstractC9510sW {
    public final AbstractC9510sW.a<O72> Y0;
    @InterfaceC11300zs1
    public ByteBuffer Z0;

    public O72(AbstractC9510sW.a<O72> aVar) {
        this.Y0 = aVar;
    }

    @Override // o.AbstractC5906dq
    public void l() {
        super.l();
        ByteBuffer byteBuffer = this.Z0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // o.AbstractC9510sW
    public void v() {
        this.Y0.a(this);
    }

    public ByteBuffer w(long j, int i) {
        this.Y = j;
        ByteBuffer byteBuffer = this.Z0;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.Z0 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.Z0.position(0);
        this.Z0.limit(i);
        return this.Z0;
    }
}
