package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class TB2 {
    public static final Logger a = Logger.getLogger(TB2.class.getName());
    public static final Unsafe b = R();
    public static final Class<?> c = T8.b();
    public static final boolean d = q(Long.TYPE);
    public static final boolean e = q(Integer.TYPE);
    public static final e f = N();
    public static final boolean g = t0();
    public static final boolean h = s0();
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f616o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final long v;
    public static final int w = 8;
    public static final int x = 7;
    public static final int y;
    public static final boolean z;

    /* loaded from: classes.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends e {
        public static final long b = -1;

        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public static int A(long j) {
            return (int) j;
        }

        @Override // o.TB2.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public void d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public boolean e(Object obj, long j) {
            return TB2.z ? TB2.w(obj, j) : TB2.x(obj, j);
        }

        @Override // o.TB2.e
        public byte f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public byte g(Object obj, long j) {
            return TB2.z ? TB2.B(obj, j) : TB2.C(obj, j);
        }

        @Override // o.TB2.e
        public double h(Object obj, long j) {
            return Double.longBitsToDouble(m(obj, j));
        }

        @Override // o.TB2.e
        public float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // o.TB2.e
        public int j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public long l(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // o.TB2.e
        public void q(Object obj, long j, boolean z) {
            if (TB2.z) {
                TB2.Z(obj, j, z);
            } else {
                TB2.a0(obj, j, z);
            }
        }

        @Override // o.TB2.e
        public void r(long j, byte b2) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public void s(Object obj, long j, byte b2) {
            if (TB2.z) {
                TB2.e0(obj, j, b2);
            } else {
                TB2.f0(obj, j, b2);
            }
        }

        @Override // o.TB2.e
        public void t(Object obj, long j, double d) {
            y(obj, j, Double.doubleToLongBits(d));
        }

        @Override // o.TB2.e
        public void u(Object obj, long j, float f) {
            w(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.TB2.e
        public void v(long j, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public void x(long j, long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.TB2.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public void d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public boolean e(Object obj, long j) {
            return TB2.z ? TB2.w(obj, j) : TB2.x(obj, j);
        }

        @Override // o.TB2.e
        public byte f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public byte g(Object obj, long j) {
            return TB2.z ? TB2.B(obj, j) : TB2.C(obj, j);
        }

        @Override // o.TB2.e
        public double h(Object obj, long j) {
            return Double.longBitsToDouble(m(obj, j));
        }

        @Override // o.TB2.e
        public float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // o.TB2.e
        public int j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public long l(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // o.TB2.e
        public void q(Object obj, long j, boolean z) {
            if (TB2.z) {
                TB2.Z(obj, j, z);
            } else {
                TB2.a0(obj, j, z);
            }
        }

        @Override // o.TB2.e
        public void r(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public void s(Object obj, long j, byte b) {
            if (TB2.z) {
                TB2.e0(obj, j, b);
            } else {
                TB2.f0(obj, j, b);
            }
        }

        @Override // o.TB2.e
        public void t(Object obj, long j, double d) {
            y(obj, j, Double.doubleToLongBits(d));
        }

        @Override // o.TB2.e
        public void u(Object obj, long j, float f) {
            w(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.TB2.e
        public void v(long j, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // o.TB2.e
        public void x(long j, long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.TB2.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            this.a.copyMemory((Object) null, j, bArr, TB2.i + j2, j3);
        }

        @Override // o.TB2.e
        public void d(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, TB2.i + j, (Object) null, j2, j3);
        }

        @Override // o.TB2.e
        public boolean e(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // o.TB2.e
        public byte f(long j) {
            return this.a.getByte(j);
        }

        @Override // o.TB2.e
        public byte g(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // o.TB2.e
        public double h(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // o.TB2.e
        public float i(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // o.TB2.e
        public int j(long j) {
            return this.a.getInt(j);
        }

        @Override // o.TB2.e
        public long l(long j) {
            return this.a.getLong(j);
        }

        @Override // o.TB2.e
        public Object o(Field field) {
            return n(this.a.staticFieldBase(field), this.a.staticFieldOffset(field));
        }

        @Override // o.TB2.e
        public void q(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // o.TB2.e
        public void r(long j, byte b) {
            this.a.putByte(j, b);
        }

        @Override // o.TB2.e
        public void s(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // o.TB2.e
        public void t(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // o.TB2.e
        public void u(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // o.TB2.e
        public void v(long j, int i) {
            this.a.putInt(j, i);
        }

        @Override // o.TB2.e
        public void x(long j, long j2) {
            this.a.putLong(j, j2);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract void c(long j, byte[] bArr, long j2, long j3);

        public abstract void d(byte[] bArr, long j, long j2, long j3);

        public abstract boolean e(Object obj, long j);

        public abstract byte f(long j);

        public abstract byte g(Object obj, long j);

        public abstract double h(Object obj, long j);

        public abstract float i(Object obj, long j);

        public abstract int j(long j);

        public final int k(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public abstract long l(long j);

        public final long m(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final Object n(Object obj, long j) {
            return this.a.getObject(obj, j);
        }

        public abstract Object o(Field field);

        public final long p(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void q(Object obj, long j, boolean z);

        public abstract void r(long j, byte b);

        public abstract void s(Object obj, long j, byte b);

        public abstract void t(Object obj, long j, double d);

        public abstract void u(Object obj, long j, float f);

        public abstract void v(long j, int i);

        public final void w(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public abstract void x(long j, long j2);

        public final void y(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void z(Object obj, long j, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }
    }

    static {
        boolean z2;
        long k2 = k(byte[].class);
        i = k2;
        j = k(boolean[].class);
        k = l(boolean[].class);
        l = k(int[].class);
        m = l(int[].class);
        n = k(long[].class);
        f616o = l(long[].class);
        p = k(float[].class);
        q = l(float[].class);
        r = k(double[].class);
        s = l(double[].class);
        t = k(Object[].class);
        u = l(Object[].class);
        v = s(m());
        y = (int) (k2 & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = z2;
    }

    public static byte A(byte[] bArr, long j2) {
        return f.g(bArr, i + j2);
    }

    public static byte B(Object obj, long j2) {
        return (byte) ((I(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte C(Object obj, long j2) {
        return (byte) ((I(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static double D(Object obj, long j2) {
        return f.h(obj, j2);
    }

    public static double E(double[] dArr, long j2) {
        return f.h(dArr, r + (j2 * s));
    }

    public static float F(Object obj, long j2) {
        return f.i(obj, j2);
    }

    public static float G(float[] fArr, long j2) {
        return f.i(fArr, p + (j2 * q));
    }

    public static int H(long j2) {
        return f.j(j2);
    }

    public static int I(Object obj, long j2) {
        return f.k(obj, j2);
    }

    public static int J(int[] iArr, long j2) {
        return f.k(iArr, l + (j2 * m));
    }

    public static long K(long j2) {
        return f.l(j2);
    }

    public static long L(Object obj, long j2) {
        return f.m(obj, j2);
    }

    public static long M(long[] jArr, long j2) {
        return f.m(jArr, n + (j2 * f616o));
    }

    public static e N() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return null;
        }
        if (T8.c()) {
            if (d) {
                return new c(unsafe);
            }
            if (!e) {
                return null;
            }
            return new b(unsafe);
        }
        return new d(unsafe);
    }

    public static Object O(Object obj, long j2) {
        return f.n(obj, j2);
    }

    public static Object P(Object[] objArr, long j2) {
        return f.n(objArr, t + (j2 * u));
    }

    public static Object Q(Field field) {
        return f.o(field);
    }

    public static Unsafe R() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean S() {
        return h;
    }

    public static boolean T() {
        return g;
    }

    public static boolean U() {
        return d;
    }

    public static int V(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        if (i2 >= 0 && i3 >= 0 && i4 >= 0 && i2 + i4 <= bArr.length && i3 + i4 <= bArr2.length) {
            int i5 = 0;
            if (h) {
                for (int i6 = (y + i2) & 7; i5 < i4 && (i6 & 7) != 0; i6++) {
                    if (bArr[i2 + i5] != bArr2[i3 + i5]) {
                        return i5;
                    }
                    i5++;
                }
                int i7 = ((i4 - i5) & (-8)) + i5;
                while (i5 < i7) {
                    long j2 = i;
                    long j3 = i5;
                    long L = L(bArr, i2 + j2 + j3);
                    long L2 = L(bArr2, j2 + i3 + j3);
                    if (L != L2) {
                        return i5 + t(L, L2);
                    }
                    i5 += 8;
                }
            }
            while (i5 < i4) {
                if (bArr[i2 + i5] != bArr2[i3 + i5]) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }

    public static long W(Field field) {
        return f.p(field);
    }

    public static void X(Object obj, long j2, boolean z2) {
        f.q(obj, j2, z2);
    }

    public static void Y(boolean[] zArr, long j2, boolean z2) {
        f.q(zArr, j + (j2 * k), z2);
    }

    public static void Z(Object obj, long j2, boolean z2) {
        e0(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    public static void a0(Object obj, long j2, boolean z2) {
        f0(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    public static void b0(long j2, byte b2) {
        f.r(j2, b2);
    }

    public static void c0(Object obj, long j2, byte b2) {
        f.s(obj, j2, b2);
    }

    public static void d0(byte[] bArr, long j2, byte b2) {
        f.s(bArr, i + j2, b2);
    }

    public static void e0(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int I = I(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        l0(obj, j3, ((255 & b2) << i2) | (I & (~(255 << i2))));
    }

    public static void f0(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        l0(obj, j3, ((255 & b2) << i2) | (I(obj, j3) & (~(255 << i2))));
    }

    public static void g0(Object obj, long j2, double d2) {
        f.t(obj, j2, d2);
    }

    public static void h0(double[] dArr, long j2, double d2) {
        f.t(dArr, r + (j2 * s), d2);
    }

    public static long i(ByteBuffer byteBuffer) {
        return f.m(byteBuffer, v);
    }

    public static void i0(Object obj, long j2, float f2) {
        f.u(obj, j2, f2);
    }

    public static <T> T j(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void j0(float[] fArr, long j2, float f2) {
        f.u(fArr, p + (j2 * q), f2);
    }

    public static int k(Class<?> cls) {
        if (h) {
            return f.a(cls);
        }
        return -1;
    }

    public static void k0(long j2, int i2) {
        f.v(j2, i2);
    }

    public static int l(Class<?> cls) {
        if (h) {
            return f.b(cls);
        }
        return -1;
    }

    public static void l0(Object obj, long j2, int i2) {
        f.w(obj, j2, i2);
    }

    public static Field m() {
        Field r2;
        if (T8.c() && (r2 = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return r2;
        }
        Field r3 = r(Buffer.class, "address");
        if (r3 != null && r3.getType() == Long.TYPE) {
            return r3;
        }
        return null;
    }

    public static void m0(int[] iArr, long j2, int i2) {
        f.w(iArr, l + (j2 * m), i2);
    }

    public static void n(long j2, byte[] bArr, long j3, long j4) {
        f.c(j2, bArr, j3, j4);
    }

    public static void n0(long j2, long j3) {
        f.x(j2, j3);
    }

    public static void o(byte[] bArr, long j2, long j3, long j4) {
        f.d(bArr, j2, j3, j4);
    }

    public static void o0(Object obj, long j2, long j3) {
        f.y(obj, j2, j3);
    }

    public static void p(byte[] bArr, long j2, byte[] bArr2, long j3, long j4) {
        System.arraycopy(bArr, (int) j2, bArr2, (int) j3, (int) j4);
    }

    public static void p0(long[] jArr, long j2, long j3) {
        f.y(jArr, n + (j2 * f616o), j3);
    }

    public static boolean q(Class<?> cls) {
        if (!T8.c()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void q0(Object obj, long j2, Object obj2) {
        f.z(obj, j2, obj2);
    }

    public static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void r0(Object[] objArr, long j2, Object obj) {
        f.z(objArr, t + (j2 * u), obj);
    }

    public static long s(Field field) {
        e eVar;
        if (field != null && (eVar = f) != null) {
            return eVar.p(field);
        }
        return -1L;
    }

    public static boolean s0() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (T8.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static int t(long j2, long j3) {
        int numberOfTrailingZeros;
        if (z) {
            numberOfTrailingZeros = Long.numberOfLeadingZeros(j2 ^ j3);
        } else {
            numberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3);
        }
        return numberOfTrailingZeros >> 3;
    }

    public static boolean t0() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m() == null) {
                return false;
            }
            if (T8.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static boolean u(Object obj, long j2) {
        return f.e(obj, j2);
    }

    public static boolean v(boolean[] zArr, long j2) {
        return f.e(zArr, j + (j2 * k));
    }

    public static boolean w(Object obj, long j2) {
        if (B(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean x(Object obj, long j2) {
        if (C(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    public static byte y(long j2) {
        return f.f(j2);
    }

    public static byte z(Object obj, long j2) {
        return f.g(obj, j2);
    }
}
