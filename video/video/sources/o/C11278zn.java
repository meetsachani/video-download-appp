package o;

/* renamed from: o.zn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11278zn {
    public final int a;
    public final int b;

    public C11278zn(int i) {
        int numberOfTrailingZeros;
        this.a = i;
        if (i == 0) {
            numberOfTrailingZeros = 0;
        } else {
            numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
        }
        this.b = numberOfTrailingZeros;
    }

    public int a(int i) {
        return i & (~this.a);
    }

    public byte b(byte b) {
        return (byte) a(b);
    }

    public short c(short s) {
        return (short) a(s);
    }

    public int d(int i) {
        return i & this.a;
    }

    public short e(short s) {
        return (short) d(s);
    }

    public short f(short s) {
        return (short) g(s);
    }

    public int g(int i) {
        return d(i) >> this.b;
    }

    public boolean h(int i) {
        int i2 = this.a;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    public boolean i(int i) {
        if ((i & this.a) != 0) {
            return true;
        }
        return false;
    }

    public int j(int i) {
        return i | this.a;
    }

    public int k(int i, boolean z) {
        if (z) {
            return j(i);
        }
        return a(i);
    }

    public byte l(byte b) {
        return (byte) j(b);
    }

    public byte m(byte b, boolean z) {
        if (z) {
            return l(b);
        }
        return b(b);
    }

    public short n(short s) {
        return (short) j(s);
    }

    public short o(short s, boolean z) {
        if (z) {
            return n(s);
        }
        return c(s);
    }

    public short p(short s, short s2) {
        return (short) q(s, s2);
    }

    public int q(int i, int i2) {
        int i3 = this.a;
        return (i & (~i3)) | ((i2 << this.b) & i3);
    }
}
