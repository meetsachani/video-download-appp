package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.Sr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4258Sr implements AO1 {
    public final ByteBuffer a;

    public C4258Sr(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // o.AO1
    public void O(int i, int i2) {
        k(i + 4);
        this.a.putInt(i, i2);
    }

    @Override // o.AO1
    public void T(int i, float f) {
        k(i + 4);
        this.a.putFloat(i, f);
    }

    @Override // o.AO1
    public void Z(int i, boolean z) {
        l(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // o.AO1
    public void a(double d) {
        this.a.putDouble(d);
    }

    @Override // o.AO1
    public void b(float f) {
        this.a.putFloat(f);
    }

    @Override // o.AO1
    public void c(short s) {
        this.a.putShort(s);
    }

    @Override // o.AO1
    public void d(boolean z) {
        this.a.put(z ? (byte) 1 : (byte) 0);
    }

    @Override // o.AO1
    public void e(int i) {
        this.a.putInt(i);
    }

    @Override // o.AO1
    public void f(long j) {
        this.a.putLong(j);
    }

    @Override // o.AO1, o.InterfaceC10457wO1
    public int g() {
        return this.a.limit();
    }

    @Override // o.InterfaceC10457wO1
    public byte get(int i) {
        return this.a.get(i);
    }

    @Override // o.InterfaceC10457wO1
    public boolean getBoolean(int i) {
        if (get(i) != 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10457wO1
    public double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // o.InterfaceC10457wO1
    public float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // o.InterfaceC10457wO1
    public int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // o.InterfaceC10457wO1
    public long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // o.InterfaceC10457wO1
    public short getShort(int i) {
        return this.a.getShort(i);
    }

    @Override // o.InterfaceC10457wO1
    public byte[] h() {
        return this.a.array();
    }

    @Override // o.AO1
    public void i(int i, byte[] bArr, int i2, int i3) {
        k((i3 - i2) + i);
        int position = this.a.position();
        this.a.position(i);
        this.a.put(bArr, i2, i3);
        this.a.position(position);
    }

    @Override // o.AO1
    public void i0(int i, double d) {
        k(i + 8);
        this.a.putDouble(i, d);
    }

    @Override // o.InterfaceC10457wO1
    public String j(int i, int i2) {
        return ID2.h(this.a, i, i2);
    }

    @Override // o.AO1
    public boolean k(int i) {
        if (i <= this.a.limit()) {
            return true;
        }
        return false;
    }

    @Override // o.AO1
    public void l(int i, byte b) {
        k(i + 1);
        this.a.put(i, b);
    }

    @Override // o.AO1
    public int m() {
        return this.a.position();
    }

    @Override // o.AO1
    public void n(byte b) {
        this.a.put(b);
    }

    @Override // o.AO1
    public void o(int i, short s) {
        k(i + 2);
        this.a.putShort(i, s);
    }

    @Override // o.AO1
    public void p(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }

    @Override // o.AO1
    public void q0(int i, long j) {
        k(i + 8);
        this.a.putLong(i, j);
    }
}
