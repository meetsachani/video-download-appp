package o;

import java.nio.ByteBuffer;
import o.AbstractC9510sW;

@Deprecated
/* loaded from: classes2.dex */
public class BF2 extends AbstractC9510sW {
    public static final int j1 = 0;
    public static final int k1 = 1;
    public static final int l1 = 2;
    public static final int m1 = 3;
    public int Y0;
    public int Z0;
    @InterfaceC11300zs1
    public ByteBuffer a1;
    public int b1;
    public int c1;
    @InterfaceC11300zs1
    public C10833xx0 d1;
    @InterfaceC11300zs1
    public ByteBuffer[] e1;
    @InterfaceC11300zs1
    public int[] f1;
    public int g1;
    @InterfaceC11300zs1
    public ByteBuffer h1;
    public final AbstractC9510sW.a<BF2> i1;

    public BF2(AbstractC9510sW.a<BF2> aVar) {
        this.i1 = aVar;
    }

    public static boolean z(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            if (i2 <= 0 || i < Integer.MAX_VALUE / i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC9510sW
    public void v() {
        this.i1.a(this);
    }

    public void w(long j, int i, @InterfaceC11300zs1 ByteBuffer byteBuffer) {
        this.Y = j;
        this.Z0 = i;
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            j(268435456);
            int limit = byteBuffer.limit();
            ByteBuffer byteBuffer2 = this.h1;
            if (byteBuffer2 != null && byteBuffer2.capacity() >= limit) {
                this.h1.clear();
            } else {
                this.h1 = ByteBuffer.allocate(limit);
            }
            this.h1.put(byteBuffer);
            this.h1.flip();
            byteBuffer.position(0);
            return;
        }
        this.h1 = null;
    }

    public void x(int i, int i2) {
        this.b1 = i;
        this.c1 = i2;
    }

    public boolean y(int i, int i2, int i3, int i4, int i5) {
        this.b1 = i;
        this.c1 = i2;
        this.g1 = i5;
        int i6 = (int) ((i2 + 1) / 2);
        if (z(i3, i2) && z(i4, i6)) {
            int i7 = i2 * i3;
            int i8 = i6 * i4;
            int i9 = (i8 * 2) + i7;
            if (z(i8, 2) && i9 >= i7) {
                ByteBuffer byteBuffer = this.a1;
                if (byteBuffer != null && byteBuffer.capacity() >= i9) {
                    this.a1.position(0);
                    this.a1.limit(i9);
                } else {
                    this.a1 = ByteBuffer.allocateDirect(i9);
                }
                if (this.e1 == null) {
                    this.e1 = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.a1;
                ByteBuffer[] byteBufferArr = this.e1;
                ByteBuffer slice = byteBuffer2.slice();
                byteBufferArr[0] = slice;
                slice.limit(i7);
                byteBuffer2.position(i7);
                ByteBuffer slice2 = byteBuffer2.slice();
                byteBufferArr[1] = slice2;
                slice2.limit(i8);
                byteBuffer2.position(i7 + i8);
                ByteBuffer slice3 = byteBuffer2.slice();
                byteBufferArr[2] = slice3;
                slice3.limit(i8);
                if (this.f1 == null) {
                    this.f1 = new int[3];
                }
                int[] iArr = this.f1;
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }
}
