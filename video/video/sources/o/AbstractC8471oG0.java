package o;

import java.io.Serializable;

@InterfaceC7311ja0
/* renamed from: o.oG0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8471oG0 {
    public static final char[] X = C10671xH0.a.toCharArray();

    /* renamed from: o.oG0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC8471oG0 implements Serializable {
        private static final long serialVersionUID = 0;
        public final byte[] Y;

        public a(byte[] bArr) {
            this.Y = (byte[]) C10664xF1.E(bArr);
        }

        @Override // o.AbstractC8471oG0
        public byte[] a() {
            return (byte[]) this.Y.clone();
        }

        @Override // o.AbstractC8471oG0
        public int b() {
            boolean z;
            byte[] bArr = this.Y;
            if (bArr.length >= 4) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.n0(z, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.Y;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // o.AbstractC8471oG0
        public long c() {
            boolean z;
            byte[] bArr = this.Y;
            if (bArr.length >= 8) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.n0(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return m();
        }

        @Override // o.AbstractC8471oG0
        public int d() {
            return this.Y.length * 8;
        }

        @Override // o.AbstractC8471oG0
        public boolean f(AbstractC8471oG0 abstractC8471oG0) {
            boolean z;
            if (this.Y.length != abstractC8471oG0.l().length) {
                return false;
            }
            boolean z2 = true;
            int i = 0;
            while (true) {
                byte[] bArr = this.Y;
                if (i < bArr.length) {
                    if (bArr[i] == abstractC8471oG0.l()[i]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 &= z;
                    i++;
                } else {
                    return z2;
                }
            }
        }

        @Override // o.AbstractC8471oG0
        public byte[] l() {
            return this.Y;
        }

        @Override // o.AbstractC8471oG0
        public long m() {
            long j = this.Y[0] & 255;
            for (int i = 1; i < Math.min(this.Y.length, 8); i++) {
                j |= (this.Y[i] & 255) << (i * 8);
            }
            return j;
        }

        @Override // o.AbstractC8471oG0
        public void o(byte[] bArr, int i, int i2) {
            System.arraycopy(this.Y, 0, bArr, i, i2);
        }
    }

    /* renamed from: o.oG0$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC8471oG0 implements Serializable {
        private static final long serialVersionUID = 0;
        public final int Y;

        public b(int i) {
            this.Y = i;
        }

        @Override // o.AbstractC8471oG0
        public byte[] a() {
            int i = this.Y;
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }

        @Override // o.AbstractC8471oG0
        public int b() {
            return this.Y;
        }

        @Override // o.AbstractC8471oG0
        public long c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // o.AbstractC8471oG0
        public int d() {
            return 32;
        }

        @Override // o.AbstractC8471oG0
        public boolean f(AbstractC8471oG0 abstractC8471oG0) {
            if (this.Y == abstractC8471oG0.b()) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8471oG0
        public long m() {
            return YB2.r(this.Y);
        }

        @Override // o.AbstractC8471oG0
        public void o(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.Y >> (i3 * 8));
            }
        }
    }

    /* renamed from: o.oG0$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC8471oG0 implements Serializable {
        private static final long serialVersionUID = 0;
        public final long Y;

        public c(long j) {
            this.Y = j;
        }

        @Override // o.AbstractC8471oG0
        public byte[] a() {
            long j = this.Y;
            return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
        }

        @Override // o.AbstractC8471oG0
        public int b() {
            return (int) this.Y;
        }

        @Override // o.AbstractC8471oG0
        public long c() {
            return this.Y;
        }

        @Override // o.AbstractC8471oG0
        public int d() {
            return 64;
        }

        @Override // o.AbstractC8471oG0
        public boolean f(AbstractC8471oG0 abstractC8471oG0) {
            if (this.Y == abstractC8471oG0.c()) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8471oG0
        public long m() {
            return this.Y;
        }

        @Override // o.AbstractC8471oG0
        public void o(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.Y >> (i3 * 8));
            }
        }
    }

    public static int e(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - C3599Ly1.j;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Illegal hexadecimal character: ");
        sb.append(c2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static AbstractC8471oG0 g(byte[] bArr) {
        boolean z = true;
        if (bArr.length < 1) {
            z = false;
        }
        C10664xF1.e(z, "A HashCode must contain at least 1 byte.");
        return h((byte[]) bArr.clone());
    }

    public static AbstractC8471oG0 h(byte[] bArr) {
        return new a(bArr);
    }

    public static AbstractC8471oG0 i(int i) {
        return new b(i);
    }

    public static AbstractC8471oG0 j(long j) {
        return new c(j);
    }

    public static AbstractC8471oG0 k(String str) {
        boolean z;
        boolean z2 = true;
        if (str.length() >= 2) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.u(z, "input string (%s) must have at least 2 characters", str);
        if (str.length() % 2 != 0) {
            z2 = false;
        }
        C10664xF1.u(z2, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((e(str.charAt(i)) << 4) + e(str.charAt(i + 1)));
        }
        return h(bArr);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public final boolean equals(@MB Object obj) {
        if (obj instanceof AbstractC8471oG0) {
            AbstractC8471oG0 abstractC8471oG0 = (AbstractC8471oG0) obj;
            if (d() == abstractC8471oG0.d() && f(abstractC8471oG0)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean f(AbstractC8471oG0 abstractC8471oG0);

    public final int hashCode() {
        if (d() >= 32) {
            return b();
        }
        byte[] l = l();
        int i = l[0] & 255;
        for (int i2 = 1; i2 < l.length; i2++) {
            i |= (l[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public byte[] l() {
        return a();
    }

    public abstract long m();

    @InterfaceC6181ey
    public int n(byte[] bArr, int i, int i2) {
        int u = C7775lT0.u(i2, d() / 8);
        C10664xF1.f0(i, i + u, bArr.length);
        o(bArr, i, u);
        return u;
    }

    public abstract void o(byte[] bArr, int i, int i2);

    public final String toString() {
        byte[] l = l();
        StringBuilder sb = new StringBuilder(l.length * 2);
        for (byte b2 : l) {
            char[] cArr = X;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & C8077mf.q]);
        }
        return sb.toString();
    }
}
