package o;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import o.InterfaceC5143ah;

@Deprecated
/* renamed from: o.vA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10153vA extends AbstractC5402bl {
    public final SparseArray<C10399wA> i = new SparseArray<>();

    @Override // o.AbstractC5402bl
    public InterfaceC5143ah.a b(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        if (aVar.c == 2) {
            C10399wA c10399wA = this.i.get(aVar.b);
            if (c10399wA != null) {
                if (c10399wA.i()) {
                    return InterfaceC5143ah.a.e;
                }
                return new InterfaceC5143ah.a(aVar.a, c10399wA.f(), 2);
            }
            throw new InterfaceC5143ah.b("No mixing matrix for input channel count", aVar);
        }
        throw new InterfaceC5143ah.b(aVar);
    }

    @Override // o.InterfaceC5143ah
    public void f(ByteBuffer byteBuffer) {
        C10399wA c10399wA = (C10399wA) C9542sf.k(this.i.get(this.b.b));
        ByteBuffer l = l((byteBuffer.remaining() / this.b.d) * this.c.d);
        int d = c10399wA.d();
        int f = c10399wA.f();
        float[] fArr = new float[f];
        while (byteBuffer.hasRemaining()) {
            for (int i = 0; i < d; i++) {
                short s = byteBuffer.getShort();
                for (int i2 = 0; i2 < f; i2++) {
                    fArr[i2] = fArr[i2] + (c10399wA.e(i, i2) * s);
                }
            }
            for (int i3 = 0; i3 < f; i3++) {
                short v = (short) TD2.v(fArr[i3], -32768.0f, 32767.0f);
                l.put((byte) (v & 255));
                l.put((byte) ((v >> 8) & 255));
                fArr[i3] = 0.0f;
            }
        }
        l.flip();
    }

    public void m(C10399wA c10399wA) {
        this.i.put(c10399wA.d(), c10399wA);
    }
}
