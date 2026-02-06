package o;

import java.nio.ByteBuffer;

@Deprecated
/* loaded from: classes2.dex */
public final class LV1 {
    public static final int l = 2;
    public static final int m = 65507;
    public static final int n = 12;

    /* renamed from: o  reason: collision with root package name */
    public static final int f535o = 0;
    public static final int p = 65535;
    public static final int q = 4;
    public static final byte[] r = new byte[0];
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final byte d;
    public final boolean e;
    public final byte f;
    public final int g;
    public final long h;
    public final int i;
    public final byte[] j;
    public final byte[] k;

    /* loaded from: classes2.dex */
    public static final class b {
        public boolean a;
        public boolean b;
        public byte c;
        public int d;
        public long e;
        public int f;
        public byte[] g = LV1.r;
        public byte[] h = LV1.r;

        public LV1 i() {
            return new LV1(this);
        }

        @InterfaceC6181ey
        public b j(byte[] bArr) {
            C9542sf.g(bArr);
            this.g = bArr;
            return this;
        }

        @InterfaceC6181ey
        public b k(boolean z) {
            this.b = z;
            return this;
        }

        @InterfaceC6181ey
        public b l(boolean z) {
            this.a = z;
            return this;
        }

        @InterfaceC6181ey
        public b m(byte[] bArr) {
            C9542sf.g(bArr);
            this.h = bArr;
            return this;
        }

        @InterfaceC6181ey
        public b n(byte b) {
            this.c = b;
            return this;
        }

        @InterfaceC6181ey
        public b o(int i) {
            boolean z;
            if (i >= 0 && i <= 65535) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.d = i & 65535;
            return this;
        }

        @InterfaceC6181ey
        public b p(int i) {
            this.f = i;
            return this;
        }

        @InterfaceC6181ey
        public b q(long j) {
            this.e = j;
            return this;
        }
    }

    public static int b(int i) {
        return C9979uR0.r(i + 1, 65536);
    }

    public static int c(int i) {
        return C9979uR0.r(i - 1, 65536);
    }

    @InterfaceC11300zs1
    public static LV1 d(C3012Fy1 c3012Fy1) {
        boolean z;
        byte[] bArr;
        if (c3012Fy1.a() < 12) {
            return null;
        }
        int L = c3012Fy1.L();
        byte b2 = (byte) (L >> 6);
        boolean z2 = true;
        if (((L >> 5) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        byte b3 = (byte) (L & 15);
        if (b2 != 2) {
            return null;
        }
        int L2 = c3012Fy1.L();
        if (((L2 >> 7) & 1) != 1) {
            z2 = false;
        }
        byte b4 = (byte) (L2 & 127);
        int R = c3012Fy1.R();
        long N = c3012Fy1.N();
        int s = c3012Fy1.s();
        if (b3 > 0) {
            bArr = new byte[b3 * 4];
            for (int i = 0; i < b3; i++) {
                c3012Fy1.n(bArr, i * 4, 4);
            }
        } else {
            bArr = r;
        }
        byte[] bArr2 = new byte[c3012Fy1.a()];
        c3012Fy1.n(bArr2, 0, c3012Fy1.a());
        return new b().l(z).k(z2).n(b4).o(R).q(N).p(s).j(bArr).m(bArr2).i();
    }

    @InterfaceC11300zs1
    public static LV1 e(byte[] bArr, int i) {
        return d(new C3012Fy1(bArr, i));
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LV1.class == obj.getClass()) {
            LV1 lv1 = (LV1) obj;
            if (this.f == lv1.f && this.g == lv1.g && this.e == lv1.e && this.h == lv1.h && this.i == lv1.i) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] bArr, int i, int i2) {
        int length = (this.d * 4) + 12 + this.k.length;
        if (i2 >= length && bArr.length - i >= length) {
            ByteBuffer.wrap(bArr, i, i2).put((byte) (((this.b ? 1 : 0) << 5) | 128 | ((this.c ? 1 : 0) << 4) | (this.d & C8077mf.q))).put((byte) (((this.e ? 1 : 0) << 7) | (this.f & Byte.MAX_VALUE))).putShort((short) this.g).putInt((int) this.h).putInt(this.i).put(this.j).put(this.k);
            return length;
        }
        return -1;
    }

    public int hashCode() {
        long j = this.h;
        return ((((((((527 + this.f) * 31) + this.g) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i;
    }

    public String toString() {
        return TD2.M("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f), Integer.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.e));
    }

    public LV1(b bVar) {
        this.a = (byte) 2;
        this.b = bVar.a;
        this.c = false;
        this.e = bVar.b;
        this.f = bVar.c;
        this.g = bVar.d;
        this.h = bVar.e;
        this.i = bVar.f;
        byte[] bArr = bVar.g;
        this.j = bArr;
        this.d = (byte) (bArr.length / 4);
        this.k = bVar.h;
    }
}
