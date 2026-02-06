package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import o.TD0;

/* renamed from: o.cs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5672cs {
    public final byte[][] a;
    public final int b;
    public final int c;

    public C5672cs(int i, int i2) {
        this.a = (byte[][]) Array.newInstance(Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public void a(byte b) {
        for (byte[] bArr : this.a) {
            Arrays.fill(bArr, b);
        }
    }

    public byte b(int i, int i2) {
        return this.a[i2][i];
    }

    public byte[][] c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }

    public void f(int i, int i2, byte b) {
        this.a[i2][i] = b;
    }

    public void g(int i, int i2, int i3) {
        this.a[i2][i] = (byte) i3;
    }

    public void h(int i, int i2, boolean z) {
        this.a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            byte[] bArr = this.a[i];
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = bArr[i2];
                if (b != 0) {
                    if (b != 1) {
                        sb.append(TD0.a.Y0);
                    } else {
                        sb.append(" 1");
                    }
                } else {
                    sb.append(" 0");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
