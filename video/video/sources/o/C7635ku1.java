package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

@Deprecated
/* renamed from: o.ku1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7635ku1 {
    public static final int d = 22;
    public static final int e = 2;
    public static final int f = 28;
    public static final int g = 0;
    public static final byte[] h = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, C2638Cg0.s7, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] i = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, C8077mf.m, -103, 87, 83, 1, C8077mf.r, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a = InterfaceC5143ah.a;
    public int c = 0;
    public int b = 2;

    public void a(C9267rW c9267rW, List<byte[]> list) {
        byte[] bArr;
        C9542sf.g(c9267rW.Y0);
        if (c9267rW.Y0.limit() - c9267rW.Y0.position() == 0) {
            return;
        }
        if (this.b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = list.get(0);
        } else {
            bArr = null;
        }
        this.a = b(c9267rW.Y0, bArr);
        c9267rW.l();
        c9267rW.w(this.a.remaining());
        c9267rW.Y0.put(this.a);
        c9267rW.x();
    }

    public final ByteBuffer b(ByteBuffer byteBuffer, @InterfaceC11300zs1 byte[] bArr) {
        int i2;
        int length;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = (i3 + 255) / 255;
        int i5 = i4 + 27 + i3;
        if (this.b == 2) {
            if (bArr != null) {
                length = bArr.length + 28;
            } else {
                length = h.length;
            }
            i5 += i.length + length;
            i2 = length;
        } else {
            i2 = 0;
        }
        ByteBuffer c = c(i5);
        if (this.b == 2) {
            if (bArr != null) {
                e(c, bArr);
            } else {
                c.put(h);
            }
            c.put(i);
        }
        int i6 = this.c + C6418fw1.i(byteBuffer);
        this.c = i6;
        f(c, i6, this.b, i4, false);
        for (int i7 = 0; i7 < i4; i7++) {
            if (i3 >= 255) {
                c.put((byte) -1);
                i3 -= 255;
            } else {
                c.put((byte) i3);
                i3 = 0;
            }
        }
        while (position < limit) {
            c.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        c.flip();
        if (this.b == 2) {
            byte[] array = c.array();
            byte[] bArr2 = i;
            c.putInt(i2 + bArr2.length + 22, TD2.z(array, c.arrayOffset() + i2 + bArr2.length, c.limit() - c.position(), 0));
        } else {
            c.putInt(22, TD2.z(c.array(), c.arrayOffset(), c.limit() - c.position(), 0));
        }
        this.b++;
        return c;
    }

    public final ByteBuffer c(int i2) {
        if (this.a.capacity() < i2) {
            this.a = ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        return this.a;
    }

    public void d() {
        this.a = InterfaceC5143ah.a;
        this.c = 0;
        this.b = 2;
    }

    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(WB2.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, TD2.z(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    public final void f(ByteBuffer byteBuffer, long j, int i2, int i3, boolean z) {
        byte b;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        if (z) {
            b = 2;
        } else {
            b = 0;
        }
        byteBuffer.put(b);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i2);
        byteBuffer.putInt(0);
        byteBuffer.put(WB2.a(i3));
    }
}
