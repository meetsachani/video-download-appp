package o;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@NN0
@InterfaceC7311ja0
/* renamed from: o.Cm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2663Cm1 extends T0 implements Serializable {
    public static final InterfaceC9449sG0 Y = new C2663Cm1(0);
    public static final InterfaceC9449sG0 Z = new C2663Cm1(DG0.a);
    private static final long serialVersionUID = 0;
    public final int X;

    /* renamed from: o.Cm1$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9639t3 {
        public static final int g = 16;
        public static final long h = -8663945395140668459L;
        public static final long i = 5545529020109919103L;
        public long d;
        public long e;
        public int f;

        public a(int i2) {
            super(16);
            long j = i2;
            this.d = j;
            this.e = j;
            this.f = 0;
        }

        public static long w(long j) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        public static long x(long j) {
            return Long.rotateLeft(j * h, 31) * i;
        }

        public static long y(long j) {
            return Long.rotateLeft(j * i, 33) * h;
        }

        @Override // o.AbstractC9639t3
        public AbstractC8471oG0 p() {
            long j = this.d;
            int i2 = this.f;
            long j2 = j ^ i2;
            long j3 = this.e ^ i2;
            long j4 = j2 + j3;
            this.d = j4;
            this.e = j3 + j4;
            this.d = w(j4);
            long w = w(this.e);
            long j5 = this.d + w;
            this.d = j5;
            this.e = w + j5;
            return AbstractC8471oG0.h(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.d).putLong(this.e).array());
        }

        @Override // o.AbstractC9639t3
        public void s(ByteBuffer byteBuffer) {
            v(byteBuffer.getLong(), byteBuffer.getLong());
            this.f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // o.AbstractC9639t3
        public void t(ByteBuffer byteBuffer) {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long p;
            this.f += byteBuffer.remaining();
            long j7 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j = 0;
                    p = j ^ WB2.p(byteBuffer.get(0));
                    break;
                case 2:
                    j2 = 0;
                    j = j2 ^ (WB2.p(byteBuffer.get(1)) << 8);
                    p = j ^ WB2.p(byteBuffer.get(0));
                    break;
                case 3:
                    j3 = 0;
                    j2 = (WB2.p(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (WB2.p(byteBuffer.get(1)) << 8);
                    p = j ^ WB2.p(byteBuffer.get(0));
                    break;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (WB2.p(byteBuffer.get(3)) << 24);
                    j2 = (WB2.p(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (WB2.p(byteBuffer.get(1)) << 8);
                    p = j ^ WB2.p(byteBuffer.get(0));
                    break;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (WB2.p(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (WB2.p(byteBuffer.get(3)) << 24);
                    j2 = (WB2.p(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (WB2.p(byteBuffer.get(1)) << 8);
                    p = j ^ WB2.p(byteBuffer.get(0));
                    break;
                case 6:
                    j6 = 0;
                    j5 = (WB2.p(byteBuffer.get(5)) << 40) ^ j6;
                    j4 = j5 ^ (WB2.p(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (WB2.p(byteBuffer.get(3)) << 24);
                    j2 = (WB2.p(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (WB2.p(byteBuffer.get(1)) << 8);
                    p = j ^ WB2.p(byteBuffer.get(0));
                    break;
                case 7:
                    j6 = WB2.p(byteBuffer.get(6)) << 48;
                    j5 = (WB2.p(byteBuffer.get(5)) << 40) ^ j6;
                    j4 = j5 ^ (WB2.p(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (WB2.p(byteBuffer.get(3)) << 24);
                    j2 = (WB2.p(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (WB2.p(byteBuffer.get(1)) << 8);
                    p = j ^ WB2.p(byteBuffer.get(0));
                    break;
                case 8:
                    p = byteBuffer.getLong();
                    break;
                case 9:
                    j7 ^= WB2.p(byteBuffer.get(8));
                    p = byteBuffer.getLong();
                    break;
                case 10:
                    j7 ^= WB2.p(byteBuffer.get(9)) << 8;
                    j7 ^= WB2.p(byteBuffer.get(8));
                    p = byteBuffer.getLong();
                    break;
                case 11:
                    j7 ^= WB2.p(byteBuffer.get(10)) << 16;
                    j7 ^= WB2.p(byteBuffer.get(9)) << 8;
                    j7 ^= WB2.p(byteBuffer.get(8));
                    p = byteBuffer.getLong();
                    break;
                case 12:
                    j7 ^= WB2.p(byteBuffer.get(11)) << 24;
                    j7 ^= WB2.p(byteBuffer.get(10)) << 16;
                    j7 ^= WB2.p(byteBuffer.get(9)) << 8;
                    j7 ^= WB2.p(byteBuffer.get(8));
                    p = byteBuffer.getLong();
                    break;
                case 13:
                    j7 ^= WB2.p(byteBuffer.get(12)) << 32;
                    j7 ^= WB2.p(byteBuffer.get(11)) << 24;
                    j7 ^= WB2.p(byteBuffer.get(10)) << 16;
                    j7 ^= WB2.p(byteBuffer.get(9)) << 8;
                    j7 ^= WB2.p(byteBuffer.get(8));
                    p = byteBuffer.getLong();
                    break;
                case 14:
                    j7 ^= WB2.p(byteBuffer.get(13)) << 40;
                    j7 ^= WB2.p(byteBuffer.get(12)) << 32;
                    j7 ^= WB2.p(byteBuffer.get(11)) << 24;
                    j7 ^= WB2.p(byteBuffer.get(10)) << 16;
                    j7 ^= WB2.p(byteBuffer.get(9)) << 8;
                    j7 ^= WB2.p(byteBuffer.get(8));
                    p = byteBuffer.getLong();
                    break;
                case 15:
                    j7 = WB2.p(byteBuffer.get(14)) << 48;
                    j7 ^= WB2.p(byteBuffer.get(13)) << 40;
                    j7 ^= WB2.p(byteBuffer.get(12)) << 32;
                    j7 ^= WB2.p(byteBuffer.get(11)) << 24;
                    j7 ^= WB2.p(byteBuffer.get(10)) << 16;
                    j7 ^= WB2.p(byteBuffer.get(9)) << 8;
                    j7 ^= WB2.p(byteBuffer.get(8));
                    p = byteBuffer.getLong();
                    break;
                default:
                    throw new AssertionError("Should never get here.");
            }
            this.d = x(p) ^ this.d;
            this.e ^= y(j7);
        }

        public final void v(long j, long j2) {
            long x = x(j) ^ this.d;
            this.d = x;
            long rotateLeft = Long.rotateLeft(x, 27);
            long j3 = this.e;
            this.d = ((rotateLeft + j3) * 5) + 1390208809;
            long y = y(j2) ^ j3;
            this.e = y;
            this.e = ((Long.rotateLeft(y, 31) + this.d) * 5) + 944331445;
        }
    }

    public C2663Cm1(int i) {
        this.X = i;
    }

    @Override // o.InterfaceC9449sG0
    public int d() {
        return 128;
    }

    public boolean equals(@MB Object obj) {
        if (!(obj instanceof C2663Cm1) || this.X != ((C2663Cm1) obj).X) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC9449sG0
    public CG0 g() {
        return new a(this.X);
    }

    public int hashCode() {
        return C2663Cm1.class.hashCode() ^ this.X;
    }

    public String toString() {
        int i = this.X;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i);
        sb.append(C9811tl1.d);
        return sb.toString();
    }
}
