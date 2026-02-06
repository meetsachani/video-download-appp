package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: o.Yu0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4852Yu0 {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ boolean f677o = false;
    public ByteBuffer a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int[] i;
    public int j;
    public int k;
    public boolean l;
    public b m;
    public final CD2 n;

    /* renamed from: o.Yu0$a */
    /* loaded from: classes.dex */
    public static class a extends InputStream {
        public ByteBuffer X;

        public a(ByteBuffer byteBuffer) {
            this.X = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.X.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* renamed from: o.Yu0$c */
    /* loaded from: classes.dex */
    public static final class c extends b {
        public static final c a = new c();

        @Override // o.C4852Yu0.b
        public ByteBuffer a(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public C4852Yu0(int i, b bVar) {
        this(i, bVar, null, CD2.d());
    }

    public static ByteBuffer N(ByteBuffer byteBuffer, b bVar) {
        int i;
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            if (capacity == 0) {
                i = 1;
            } else {
                i = capacity << 1;
            }
            byteBuffer.position(0);
            ByteBuffer a2 = bVar.a(i);
            a2.position(a2.clear().capacity() - capacity);
            a2.put(byteBuffer);
            return a2;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean P(C3646Mk2 c3646Mk2, int i) {
        if (c3646Mk2.d(i) != 0) {
            return true;
        }
        return false;
    }

    public int A(int[] iArr) {
        Q();
        h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            n(iArr[length]);
        }
        return E();
    }

    public ByteBuffer B() {
        L();
        return this.a;
    }

    @Deprecated
    public final int C() {
        L();
        return this.b;
    }

    public int D() {
        int i;
        int i2;
        if (this.d != null && this.f) {
            j(0);
            int R = R();
            int i3 = this.e - 1;
            while (i3 >= 0 && this.d[i3] == 0) {
                i3--;
            }
            for (int i4 = i3; i4 >= 0; i4--) {
                int i5 = this.d[i4];
                if (i5 != 0) {
                    i2 = R - i5;
                } else {
                    i2 = 0;
                }
                q((short) i2);
            }
            q((short) (R - this.h));
            q((short) ((i3 + 3) * 2));
            int i6 = 0;
            loop2: while (true) {
                if (i6 < this.j) {
                    int capacity = this.a.capacity() - this.i[i6];
                    int i7 = this.b;
                    short s = this.a.getShort(capacity);
                    if (s == this.a.getShort(i7)) {
                        for (int i8 = 2; i8 < s; i8 += 2) {
                            if (this.a.getShort(capacity + i8) != this.a.getShort(i7 + i8)) {
                                break;
                            }
                        }
                        i = this.i[i6];
                        break loop2;
                    }
                    i6++;
                } else {
                    i = 0;
                    break;
                }
            }
            if (i != 0) {
                int capacity2 = this.a.capacity() - R;
                this.b = capacity2;
                this.a.putInt(capacity2, i - R);
            } else {
                int i9 = this.j;
                int[] iArr = this.i;
                if (i9 == iArr.length) {
                    this.i = Arrays.copyOf(iArr, i9 * 2);
                }
                int[] iArr2 = this.i;
                int i10 = this.j;
                this.j = i10 + 1;
                iArr2[i10] = R();
                ByteBuffer byteBuffer = this.a;
                byteBuffer.putInt(byteBuffer.capacity() - R, R() - R);
            }
            this.f = false;
            return R;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public int E() {
        if (this.f) {
            this.f = false;
            Y(this.k);
            return R();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public void F(int i) {
        I(i, false);
    }

    public void G(int i, String str) {
        H(i, str, false);
    }

    public void H(int i, String str, boolean z) {
        int i2;
        int i3 = this.c;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        T(i3, i2 + 8);
        if (str.length() == 4) {
            for (int i4 = 3; i4 >= 0; i4--) {
                d((byte) str.charAt(i4));
            }
            I(i, z);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public void I(int i, boolean z) {
        int i2;
        int i3 = this.c;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        T(i3, i2 + 4);
        n(i);
        if (z) {
            j(this.a.capacity() - this.b);
        }
        this.a.position(this.b);
        this.g = true;
    }

    public void J(int i) {
        I(i, true);
    }

    public void K(int i, String str) {
        H(i, str, true);
    }

    public void L() {
        if (this.g) {
            return;
        }
        throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }

    public C4852Yu0 M(boolean z) {
        this.l = z;
        return this;
    }

    public C4852Yu0 O(ByteBuffer byteBuffer, b bVar) {
        this.m = bVar;
        this.a = byteBuffer;
        byteBuffer.clear();
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.c = 1;
        this.b = this.a.capacity();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.j = 0;
        this.k = 0;
        return this;
    }

    public void Q() {
        if (!this.f) {
            return;
        }
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    public int R() {
        return this.a.capacity() - this.b;
    }

    public void S(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.a;
            int i3 = this.b - 1;
            this.b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public void T(int i, int i2) {
        if (i > this.c) {
            this.c = i;
        }
        int i3 = ((~((this.a.capacity() - this.b) + i2)) + 1) & (i - 1);
        while (this.b < i3 + i + i2) {
            int capacity = this.a.capacity();
            ByteBuffer byteBuffer = this.a;
            ByteBuffer N = N(byteBuffer, this.m);
            this.a = N;
            if (byteBuffer != N) {
                this.m.b(byteBuffer);
            }
            this.b += this.a.capacity() - capacity;
        }
        S(i3);
    }

    public void U(boolean z) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public void V(byte b2) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, b2);
    }

    public void W(double d) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 8;
        this.b = i;
        byteBuffer.putDouble(i, d);
    }

    public void X(float f) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 4;
        this.b = i;
        byteBuffer.putFloat(i, f);
    }

    public void Y(int i) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    public void Z(long j) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 8;
        this.b = i;
        byteBuffer.putLong(i, j);
    }

    public void a(int i) {
        if (i == R()) {
            return;
        }
        throw new AssertionError("FlatBuffers: struct must be serialized inline.");
    }

    public void a0(short s) {
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    public void b(int i, boolean z, boolean z2) {
        if (!this.l && z == z2) {
            return;
        }
        c(z);
        f0(i);
    }

    public void b0(int i, int i2) {
        int capacity = this.a.capacity() - i;
        if (this.a.getShort((capacity - this.a.getInt(capacity)) + i2) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i2 + " must be set");
    }

    public void c(boolean z) {
        T(1, 0);
        U(z);
    }

    public byte[] c0() {
        return d0(this.b, this.a.capacity() - this.b);
    }

    public void d(byte b2) {
        T(1, 0);
        V(b2);
    }

    public byte[] d0(int i, int i2) {
        L();
        byte[] bArr = new byte[i2];
        this.a.position(i);
        this.a.get(bArr);
        return bArr;
    }

    public void e(int i, byte b2, int i2) {
        if (!this.l && b2 == i2) {
            return;
        }
        d(b2);
        f0(i);
    }

    public InputStream e0() {
        L();
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.position(this.b);
        duplicate.limit(this.a.capacity());
        return new a(duplicate);
    }

    public void f(double d) {
        T(8, 0);
        W(d);
    }

    public void f0(int i) {
        this.d[i] = R();
    }

    public void g(int i, double d, double d2) {
        if (!this.l && d == d2) {
            return;
        }
        f(d);
        f0(i);
    }

    public void g0(int i) {
        Q();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            this.d = new int[i];
        }
        this.e = i;
        Arrays.fill(this.d, 0, i, 0);
        this.f = true;
        this.h = R();
    }

    public void h(float f) {
        T(4, 0);
        X(f);
    }

    public void h0(int i, int i2, int i3) {
        Q();
        this.k = i2;
        int i4 = i * i2;
        T(4, i4);
        T(i3, i4);
        this.f = true;
    }

    public void i(int i, float f, double d) {
        if (!this.l && f == d) {
            return;
        }
        h(f);
        f0(i);
    }

    public void j(int i) {
        T(4, 0);
        Y(i);
    }

    public void k(int i, int i2, int i3) {
        if (!this.l && i2 == i3) {
            return;
        }
        j(i2);
        f0(i);
    }

    public void l(int i, long j, long j2) {
        if (!this.l && j == j2) {
            return;
        }
        m(j);
        f0(i);
    }

    public void m(long j) {
        T(8, 0);
        Z(j);
    }

    public void n(int i) {
        T(4, 0);
        Y((R() - i) + 4);
    }

    public void o(int i, int i2, int i3) {
        if (!this.l && i2 == i3) {
            return;
        }
        n(i2);
        f0(i);
    }

    public void p(int i, short s, int i2) {
        if (!this.l && s == i2) {
            return;
        }
        q(s);
        f0(i);
    }

    public void q(short s) {
        T(2, 0);
        a0(s);
    }

    public void r(int i, int i2, int i3) {
        if (i2 != i3) {
            a(i2);
            f0(i);
        }
    }

    public void s() {
        this.b = this.a.capacity();
        this.a.clear();
        this.c = 1;
        while (true) {
            int i = this.e;
            if (i > 0) {
                int[] iArr = this.d;
                int i2 = i - 1;
                this.e = i2;
                iArr[i2] = 0;
            } else {
                this.e = 0;
                this.f = false;
                this.g = false;
                this.h = 0;
                this.j = 0;
                this.k = 0;
                return;
            }
        }
    }

    public int t(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.a;
        int i = this.b - remaining;
        this.b = i;
        byteBuffer2.position(i);
        this.a.put(byteBuffer);
        return E();
    }

    public int u(byte[] bArr) {
        int length = bArr.length;
        h0(1, length, 1);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - length;
        this.b = i;
        byteBuffer.position(i);
        this.a.put(bArr);
        return E();
    }

    public int v(byte[] bArr, int i, int i2) {
        h0(1, i2, 1);
        ByteBuffer byteBuffer = this.a;
        int i3 = this.b - i2;
        this.b = i3;
        byteBuffer.position(i3);
        this.a.put(bArr, i, i2);
        return E();
    }

    public <T extends C3646Mk2> int w(T t, int[] iArr) {
        t.t(iArr, this.a);
        return A(iArr);
    }

    public int x(CharSequence charSequence) {
        int c2 = this.n.c(charSequence);
        d((byte) 0);
        h0(1, c2, 1);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - c2;
        this.b = i;
        byteBuffer.position(i);
        this.n.b(charSequence, this.a);
        return E();
    }

    public int y(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        d((byte) 0);
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.a;
        int i = this.b - remaining;
        this.b = i;
        byteBuffer2.position(i);
        this.a.put(byteBuffer);
        return E();
    }

    public ByteBuffer z(int i, int i2, int i3) {
        int i4 = i * i2;
        h0(i, i2, i3);
        ByteBuffer byteBuffer = this.a;
        int i5 = this.b - i4;
        this.b = i5;
        byteBuffer.position(i5);
        ByteBuffer order = this.a.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i4);
        return order;
    }

    public C4852Yu0(int i, b bVar, ByteBuffer byteBuffer, CD2 cd2) {
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        this.l = false;
        i = i <= 0 ? 1 : i;
        this.m = bVar;
        if (byteBuffer != null) {
            this.a = byteBuffer;
            byteBuffer.clear();
            this.a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a = bVar.a(i);
        }
        this.n = cd2;
        this.b = this.a.capacity();
    }

    public C4852Yu0(int i) {
        this(i, c.a, null, CD2.d());
    }

    public C4852Yu0() {
        this(1024);
    }

    /* renamed from: o.Yu0$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract ByteBuffer a(int i);

        public void b(ByteBuffer byteBuffer) {
        }
    }

    public C4852Yu0(ByteBuffer byteBuffer, b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, CD2.d());
    }

    public C4852Yu0(ByteBuffer byteBuffer) {
        this(byteBuffer, new c());
    }
}
