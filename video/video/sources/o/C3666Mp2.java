package o;

import java.nio.ByteBuffer;
import o.InterfaceC5143ah;

@Deprecated
/* renamed from: o.Mp2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3666Mp2 extends AbstractC5402bl {
    public static final int i = Float.floatToIntBits(Float.NaN);
    public static final double j = 4.656612875245797E-10d;

    public static void m(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // o.AbstractC5402bl
    @InterfaceC6181ey
    public InterfaceC5143ah.a b(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        int i2 = aVar.c;
        if (TD2.T0(i2)) {
            if (i2 != 4) {
                return new InterfaceC5143ah.a(aVar.a, aVar.b, 4);
            }
            return InterfaceC5143ah.a.e;
        }
        throw new InterfaceC5143ah.b(aVar);
    }

    @Override // o.InterfaceC5143ah
    public void f(ByteBuffer byteBuffer) {
        ByteBuffer l;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 536870912) {
            if (i3 == 805306368) {
                l = l(i2);
                while (position < limit) {
                    m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            l = l((i2 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l.flip();
    }
}
