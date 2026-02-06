package o;

import java.nio.ByteBuffer;
import o.InterfaceC5143ah;

@Deprecated
/* renamed from: o.uA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9910uA extends AbstractC5402bl {
    @InterfaceC11300zs1
    public int[] i;
    @InterfaceC11300zs1
    public int[] j;

    @Override // o.AbstractC5402bl
    @InterfaceC6181ey
    public InterfaceC5143ah.a b(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        boolean z;
        boolean z2;
        int[] iArr = this.i;
        if (iArr == null) {
            return InterfaceC5143ah.a.e;
        }
        if (aVar.c == 2) {
            if (aVar.b != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 < aVar.b) {
                    if (i2 != i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new InterfaceC5143ah.b(aVar);
                }
            }
            if (z) {
                return new InterfaceC5143ah.a(aVar.a, iArr.length, 2);
            }
            return InterfaceC5143ah.a.e;
        }
        throw new InterfaceC5143ah.b(aVar);
    }

    @Override // o.InterfaceC5143ah
    public void f(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C9542sf.g(this.j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                l.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    @Override // o.AbstractC5402bl
    public void i() {
        this.j = this.i;
    }

    @Override // o.AbstractC5402bl
    public void k() {
        this.j = null;
        this.i = null;
    }

    public void m(@InterfaceC11300zs1 int[] iArr) {
        this.i = iArr;
    }
}
