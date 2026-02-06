package o;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

@NN0
@InterfaceC7311ja0
/* renamed from: o.Dm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2761Dm1 extends T0 implements Serializable {
    public static final int a1 = 4;
    public static final int b1 = -862048943;
    public static final int c1 = 461845907;
    private static final long serialVersionUID = 0;
    public final int X;
    public final boolean Y;
    public static final InterfaceC9449sG0 Z = new C2761Dm1(0, false);
    public static final InterfaceC9449sG0 Y0 = new C2761Dm1(0, true);
    public static final InterfaceC9449sG0 Z0 = new C2761Dm1(DG0.a, true);

    @InterfaceC6181ey
    /* renamed from: o.Dm1$a */
    /* loaded from: classes3.dex */
    public static final class a extends W0 {
        public int a;
        public long b;
        public int c;
        public int d = 0;
        public boolean e = false;

        public a(int i) {
            this.a = i;
        }

        @Override // o.CG0
        public AbstractC8471oG0 o() {
            C10664xF1.g0(!this.e);
            this.e = true;
            int y = this.a ^ C2761Dm1.y((int) this.b);
            this.a = y;
            return C2761Dm1.v(y, this.d);
        }

        public final void p(int i, long j) {
            long j2 = this.b;
            int i2 = this.c;
            long j3 = ((j & 4294967295L) << i2) | j2;
            this.b = j3;
            int i3 = i2 + (i * 8);
            this.c = i3;
            this.d += i;
            if (i3 >= 32) {
                this.a = C2761Dm1.x(this.a, C2761Dm1.y((int) j3));
                this.b >>>= 32;
                this.c -= 32;
            }
        }

        @Override // o.W0, o.CG0, o.InterfaceC8232nH1
        public CG0 e(int i) {
            p(4, i);
            return this;
        }

        @Override // o.W0, o.CG0, o.InterfaceC8232nH1
        public CG0 f(long j) {
            p(4, (int) j);
            p(4, j >>> 32);
            return this;
        }

        @Override // o.W0, o.CG0, o.InterfaceC8232nH1
        public CG0 h(char c) {
            p(2, c);
            return this;
        }

        @Override // o.CG0, o.InterfaceC8232nH1
        public CG0 i(byte b) {
            p(1, b & 255);
            return this;
        }

        @Override // o.W0, o.CG0, o.InterfaceC8232nH1
        public CG0 k(byte[] bArr, int i, int i2) {
            C10664xF1.f0(i, i + i2, bArr.length);
            int i3 = 0;
            while (true) {
                int i4 = i3 + 4;
                if (i4 > i2) {
                    break;
                }
                p(4, C2761Dm1.w(bArr, i3 + i));
                i3 = i4;
            }
            while (i3 < i2) {
                i(bArr[i + i3]);
                i3++;
            }
            return this;
        }

        @Override // o.W0, o.CG0, o.InterfaceC8232nH1
        public CG0 l(ByteBuffer byteBuffer) {
            ByteOrder order = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                e(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                i(byteBuffer.get());
            }
            byteBuffer.order(order);
            return this;
        }

        @Override // o.W0, o.CG0, o.InterfaceC8232nH1
        public CG0 m(CharSequence charSequence, Charset charset) {
            if (KB.c.equals(charset)) {
                int length = charSequence.length();
                int i = 0;
                while (true) {
                    int i2 = i + 4;
                    if (i2 > length) {
                        break;
                    }
                    char charAt = charSequence.charAt(i);
                    char charAt2 = charSequence.charAt(i + 1);
                    char charAt3 = charSequence.charAt(i + 2);
                    char charAt4 = charSequence.charAt(i + 3);
                    if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                        break;
                    }
                    p(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
                    i = i2;
                }
                while (i < length) {
                    char charAt5 = charSequence.charAt(i);
                    if (charAt5 < 128) {
                        p(1, charAt5);
                    } else if (charAt5 < 2048) {
                        p(2, C2761Dm1.t(charAt5));
                    } else if (charAt5 < 55296 || charAt5 > 57343) {
                        p(3, C2761Dm1.s(charAt5));
                    } else {
                        int codePointAt = Character.codePointAt(charSequence, i);
                        if (codePointAt != charAt5) {
                            i++;
                            p(4, C2761Dm1.u(codePointAt));
                        } else {
                            g(charSequence.subSequence(i, length).toString().getBytes(charset));
                            return this;
                        }
                    }
                    i++;
                }
                return this;
            }
            return super.m(charSequence, charset);
        }
    }

    public C2761Dm1(int i, boolean z) {
        this.X = i;
        this.Y = z;
    }

    public static long s(char c) {
        return (c >>> '\f') | 224 | ((((c >>> 6) & 63) | 128) << 8) | (((c & '?') | 128) << 16);
    }

    public static long t(char c) {
        return (c >>> 6) | 192 | (((c & '?') | 128) << 8);
    }

    public static long u(int i) {
        return (i >>> 18) | 240 | ((((i >>> 12) & 63) | 128) << 8) | ((((i >>> 6) & 63) | 128) << 16) | (((i & 63) | 128) << 24);
    }

    public static AbstractC8471oG0 v(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return AbstractC8471oG0.i(i5 ^ (i5 >>> 16));
    }

    public static int w(byte[] bArr, int i) {
        return C7775lT0.k(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    public static int x(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    public static int y(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 b(CharSequence charSequence, Charset charset) {
        if (KB.c.equals(charset)) {
            int length = charSequence.length();
            int i = this.X;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 4;
                if (i5 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i3);
                char charAt2 = charSequence.charAt(i3 + 1);
                char charAt3 = charSequence.charAt(i3 + 2);
                char charAt4 = charSequence.charAt(i3 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                i = x(i, y((charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24)));
                i4 += 4;
                i3 = i5;
            }
            long j = 0;
            while (i3 < length) {
                char charAt5 = charSequence.charAt(i3);
                if (charAt5 < 128) {
                    j |= charAt5 << i2;
                    i2 += 8;
                    i4++;
                } else if (charAt5 < 2048) {
                    j |= t(charAt5) << i2;
                    i2 += 16;
                    i4 += 2;
                } else if (charAt5 >= 55296 && charAt5 <= 57343) {
                    int codePointAt = Character.codePointAt(charSequence, i3);
                    if (codePointAt == charAt5) {
                        return f(charSequence.toString().getBytes(charset));
                    }
                    i3++;
                    j |= u(codePointAt) << i2;
                    if (this.Y) {
                        i2 += 32;
                    }
                    i4 += 4;
                } else {
                    j |= s(charAt5) << i2;
                    i2 += 24;
                    i4 += 3;
                }
                if (i2 >= 32) {
                    i = x(i, y((int) j));
                    j >>>= 32;
                    i2 -= 32;
                }
                i3++;
            }
            return v(y((int) j) ^ i, i4);
        }
        return f(charSequence.toString().getBytes(charset));
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 c(CharSequence charSequence) {
        int i = this.X;
        for (int i2 = 1; i2 < charSequence.length(); i2 += 2) {
            i = x(i, y(charSequence.charAt(i2 - 1) | (charSequence.charAt(i2) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            i ^= y(charSequence.charAt(charSequence.length() - 1));
        }
        return v(i, charSequence.length() * 2);
    }

    @Override // o.InterfaceC9449sG0
    public int d() {
        return 32;
    }

    public boolean equals(@MB Object obj) {
        if (obj instanceof C2761Dm1) {
            C2761Dm1 c2761Dm1 = (C2761Dm1) obj;
            if (this.X == c2761Dm1.X && this.Y == c2761Dm1.Y) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC9449sG0
    public CG0 g() {
        return new a(this.X);
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 h(int i) {
        return v(x(this.X, y(i)), 4);
    }

    public int hashCode() {
        return C2761Dm1.class.hashCode() ^ this.X;
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 j(long j) {
        return v(x(x(this.X, y((int) j)), y((int) (j >>> 32))), 8);
    }

    @Override // o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 k(byte[] bArr, int i, int i2) {
        C10664xF1.f0(i, i + i2, bArr.length);
        int i3 = this.X;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i5 + 4;
            if (i6 > i2) {
                break;
            }
            i3 = x(i3, y(w(bArr, i5 + i)));
            i5 = i6;
        }
        int i7 = i5;
        int i8 = 0;
        while (i7 < i2) {
            i4 ^= WB2.p(bArr[i + i7]) << i8;
            i7++;
            i8 += 8;
        }
        return v(y(i4) ^ i3, i2);
    }

    public String toString() {
        int i = this.X;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i);
        sb.append(C9811tl1.d);
        return sb.toString();
    }
}
