package o;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: o.tD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9680tD0 {
    public static final String e = "GifHeaderParser";
    public static final int f = 255;
    public static final int g = 44;
    public static final int h = 33;
    public static final int i = 59;
    public static final int j = 249;
    public static final int k = 255;
    public static final int l = 254;
    public static final int m = 1;
    public static final int n = 28;

    /* renamed from: o  reason: collision with root package name */
    public static final int f870o = 2;
    public static final int p = 1;
    public static final int q = 128;
    public static final int r = 64;
    public static final int s = 7;
    public static final int t = 128;
    public static final int u = 7;
    public static final int v = 2;
    public static final int w = 10;
    public static final int x = 256;
    public ByteBuffer b;
    public C9437sD0 c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public void a() {
        this.b = null;
        this.c = null;
    }

    public final boolean b() {
        if (this.c.b != 0) {
            return true;
        }
        return false;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        if (this.c.c > 1) {
            return true;
        }
        return false;
    }

    public C9437sD0 d() {
        if (this.b != null) {
            if (b()) {
                return this.c;
            }
            l();
            if (!b()) {
                i();
                C9437sD0 c9437sD0 = this.c;
                if (c9437sD0.c < 0) {
                    c9437sD0.b = 1;
                }
            }
            return this.c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int e() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void f() {
        boolean z;
        this.c.d.a = o();
        this.c.d.b = o();
        this.c.d.c = o();
        this.c.d.d = o();
        int e2 = e();
        boolean z2 = false;
        if ((e2 & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (e2 & 7) + 1);
        C8702pD0 c8702pD0 = this.c.d;
        if ((e2 & 64) != 0) {
            z2 = true;
        }
        c8702pD0.e = z2;
        if (z) {
            c8702pD0.k = h(pow);
        } else {
            c8702pD0.k = null;
        }
        this.c.d.j = this.b.position();
        t();
        if (b()) {
            return;
        }
        C9437sD0 c9437sD0 = this.c;
        c9437sD0.c++;
        c9437sD0.e.add(c9437sD0.d);
    }

    public final void g() {
        int e2 = e();
        this.d = e2;
        if (e2 > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    i3 = this.d;
                    if (i2 < i3) {
                        i3 -= i2;
                        this.b.get(this.a, i2, i3);
                        i2 += i3;
                    } else {
                        return;
                    }
                } catch (Exception e3) {
                    if (Log.isLoggable(e, 3)) {
                        Log.d(e, "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.d, e3);
                    }
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    public final int[] h(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 2;
                i4 += 3;
                int i6 = i3 + 1;
                iArr[i3] = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16) | (-16777216) | (bArr[i5] & 255);
                i3 = i6;
            }
            return iArr;
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable(e, 3)) {
                Log.d(e, "Format Error Reading Color Table", e2);
            }
            this.c.b = 1;
            return iArr;
        }
    }

    public final void i() {
        j(Integer.MAX_VALUE);
    }

    public final void j(int i2) {
        boolean z = false;
        while (!z && !b() && this.c.c <= i2) {
            int e2 = e();
            if (e2 != 33) {
                if (e2 != 44) {
                    if (e2 != 59) {
                        this.c.b = 1;
                    } else {
                        z = true;
                    }
                } else {
                    C9437sD0 c9437sD0 = this.c;
                    if (c9437sD0.d == null) {
                        c9437sD0.d = new C8702pD0();
                    }
                    f();
                }
            } else {
                int e3 = e();
                if (e3 != 1) {
                    if (e3 != 249) {
                        if (e3 != 254) {
                            if (e3 != 255) {
                                s();
                            } else {
                                g();
                                StringBuilder sb = new StringBuilder();
                                for (int i3 = 0; i3 < 11; i3++) {
                                    sb.append((char) this.a[i3]);
                                }
                                if (sb.toString().equals("NETSCAPE2.0")) {
                                    n();
                                } else {
                                    s();
                                }
                            }
                        } else {
                            s();
                        }
                    } else {
                        this.c.d = new C8702pD0();
                        k();
                    }
                } else {
                    s();
                }
            }
        }
    }

    public final void k() {
        e();
        int e2 = e();
        C8702pD0 c8702pD0 = this.c.d;
        int i2 = (e2 & 28) >> 2;
        c8702pD0.g = i2;
        boolean z = true;
        if (i2 == 0) {
            c8702pD0.g = 1;
        }
        if ((e2 & 1) == 0) {
            z = false;
        }
        c8702pD0.f = z;
        int o2 = o();
        if (o2 < 2) {
            o2 = 10;
        }
        C8702pD0 c8702pD02 = this.c.d;
        c8702pD02.i = o2 * 10;
        c8702pD02.h = e();
        e();
    }

    public final void l() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) e());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        m();
        if (this.c.h && !b()) {
            C9437sD0 c9437sD0 = this.c;
            c9437sD0.a = h(c9437sD0.i);
            C9437sD0 c9437sD02 = this.c;
            c9437sD02.l = c9437sD02.a[c9437sD02.j];
        }
    }

    public final void m() {
        boolean z;
        this.c.f = o();
        this.c.g = o();
        int e2 = e();
        C9437sD0 c9437sD0 = this.c;
        if ((e2 & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        c9437sD0.h = z;
        c9437sD0.i = (int) Math.pow(2.0d, (e2 & 7) + 1);
        this.c.j = e();
        this.c.k = e();
    }

    public final void n() {
        do {
            g();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int o() {
        return this.b.getShort();
    }

    public final void p() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new C9437sD0();
        this.d = 0;
    }

    public C9680tD0 q(ByteBuffer byteBuffer) {
        p();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public C9680tD0 r(byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
            return this;
        }
        this.b = null;
        this.c.b = 2;
        return this;
    }

    public final void s() {
        int e2;
        do {
            e2 = e();
            this.b.position(Math.min(this.b.position() + e2, this.b.limit()));
        } while (e2 > 0);
    }

    public final void t() {
        e();
        s();
    }
}
