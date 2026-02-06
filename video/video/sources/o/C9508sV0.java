package o;

import java.nio.ByteBuffer;

/* renamed from: o.sV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9508sV0 {
    public final C6048eP0 a;

    public C9508sV0(C10931yL1 c10931yL1) {
        this.a = (C6048eP0) c10931yL1.b(C6048eP0.class);
    }

    public byte[] a(androidx.camera.core.g gVar) {
        C6048eP0 c6048eP0 = this.a;
        if (c6048eP0 == null) {
            ByteBuffer B = gVar.f3()[0].B();
            byte[] bArr = new byte[B.capacity()];
            B.rewind();
            B.get(bArr);
            return bArr;
        }
        return c6048eP0.g(gVar);
    }

    public boolean b() {
        if (this.a != null) {
            return true;
        }
        return false;
    }
}
