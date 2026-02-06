package o;

import java.nio.ByteBuffer;
import o.InterfaceC5143ah;

@Deprecated
/* renamed from: o.Np2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3764Np2 extends AbstractC5402bl {
    @Override // o.AbstractC5402bl
    @InterfaceC6181ey
    public InterfaceC5143ah.a b(InterfaceC5143ah.a aVar) throws InterfaceC5143ah.b {
        int i = aVar.c;
        if (i != 3 && i != 2 && i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
            throw new InterfaceC5143ah.b(aVar);
        }
        if (i != 2) {
            return new InterfaceC5143ah.a(aVar.a, aVar.b, 2);
        }
        return InterfaceC5143ah.a.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae A[LOOP:4: B:30:0x00ae->B:31:0x00b0, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0036, B:31:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.InterfaceC5143ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 != 536870912) {
                        if (i3 != 805306368) {
                            throw new IllegalStateException();
                        }
                    } else {
                        i2 /= 3;
                    }
                }
                ByteBuffer l = l(i2);
                i = this.b.c;
                if (i != 3) {
                    if (i != 4) {
                        if (i != 268435456) {
                            if (i != 536870912) {
                                if (i == 805306368) {
                                    while (position < limit) {
                                        l.put(byteBuffer.get(position + 2));
                                        l.put(byteBuffer.get(position + 3));
                                        position += 4;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                while (position < limit) {
                                    l.put(byteBuffer.get(position + 1));
                                    l.put(byteBuffer.get(position + 2));
                                    position += 3;
                                }
                            }
                        } else {
                            while (position < limit) {
                                l.put(byteBuffer.get(position + 1));
                                l.put(byteBuffer.get(position));
                                position += 2;
                            }
                        }
                    } else {
                        while (position < limit) {
                            short v = (short) (TD2.v(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                            l.put((byte) (v & 255));
                            l.put((byte) ((v >> 8) & 255));
                            position += 4;
                        }
                    }
                } else {
                    while (position < limit) {
                        l.put((byte) 0);
                        l.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                l.flip();
            }
            i2 /= 2;
            ByteBuffer l2 = l(i2);
            i = this.b.c;
            if (i != 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            l2.flip();
        }
        i2 *= 2;
        ByteBuffer l22 = l(i2);
        i = this.b.c;
        if (i != 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        l22.flip();
    }
}
