package o;

import java.util.Arrays;

/* renamed from: o.Ee  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2825Ee implements AO1 {
    public byte[] a;
    public int b;

    public C2825Ee() {
        this(10);
    }

    @Override // o.AO1
    public void O(int i, int i2) {
        k(i + 4);
        byte[] bArr = this.a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    @Override // o.AO1
    public void T(int i, float f) {
        k(i + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.a;
        bArr[i] = (byte) (floatToRawIntBits & 255);
        bArr[i + 1] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i + 2] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i + 3] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    @Override // o.AO1
    public void Z(int i, boolean z) {
        l(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // o.AO1
    public void a(double d) {
        i0(this.b, d);
        this.b += 8;
    }

    @Override // o.AO1
    public void b(float f) {
        T(this.b, f);
        this.b += 4;
    }

    @Override // o.AO1
    public void c(short s) {
        o(this.b, s);
        this.b += 2;
    }

    @Override // o.AO1
    public void d(boolean z) {
        Z(this.b, z);
        this.b++;
    }

    @Override // o.AO1
    public void e(int i) {
        O(this.b, i);
        this.b += 4;
    }

    @Override // o.AO1
    public void f(long j) {
        q0(this.b, j);
        this.b += 8;
    }

    @Override // o.AO1, o.InterfaceC10457wO1
    public int g() {
        return this.b;
    }

    @Override // o.InterfaceC10457wO1
    public byte get(int i) {
        return this.a[i];
    }

    @Override // o.InterfaceC10457wO1
    public boolean getBoolean(int i) {
        if (this.a[i] != 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10457wO1
    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // o.InterfaceC10457wO1
    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    @Override // o.InterfaceC10457wO1
    public int getInt(int i) {
        byte[] bArr = this.a;
        return (bArr[i] & 255) | (bArr[i + 3] << C8077mf.B) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    @Override // o.InterfaceC10457wO1
    public long getLong(int i) {
        byte[] bArr = this.a;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | (bArr[i + 7] << 56);
    }

    @Override // o.InterfaceC10457wO1
    public short getShort(int i) {
        byte[] bArr = this.a;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    @Override // o.InterfaceC10457wO1
    public byte[] h() {
        return this.a;
    }

    @Override // o.AO1
    public void i(int i, byte[] bArr, int i2, int i3) {
        k((i3 - i2) + i);
        System.arraycopy(bArr, i2, this.a, i, i3);
    }

    @Override // o.AO1
    public void i0(int i, double d) {
        k(i + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) doubleToRawLongBits;
        byte[] bArr = this.a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (doubleToRawLongBits >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    @Override // o.InterfaceC10457wO1
    public String j(int i, int i2) {
        return ID2.g(this.a, i, i2);
    }

    @Override // o.AO1
    public boolean k(int i) {
        byte[] bArr = this.a;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // o.AO1
    public void l(int i, byte b) {
        k(i + 1);
        this.a[i] = b;
    }

    @Override // o.AO1
    public int m() {
        return this.b;
    }

    @Override // o.AO1
    public void n(byte b) {
        l(this.b, b);
        this.b++;
    }

    @Override // o.AO1
    public void o(int i, short s) {
        k(i + 2);
        byte[] bArr = this.a;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    @Override // o.AO1
    public void p(byte[] bArr, int i, int i2) {
        i(this.b, bArr, i, i2);
        this.b += i2;
    }

    @Override // o.AO1
    public void q0(int i, long j) {
        k(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (j >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    public C2825Ee(int i) {
        this(new byte[i]);
    }

    public C2825Ee(byte[] bArr) {
        this.a = bArr;
        this.b = 0;
    }

    public C2825Ee(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }
}
