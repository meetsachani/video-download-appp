package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhbp {
    public static final Unsafe a;
    public static final Class b;
    public static final boolean c;
    public static final zzhbo d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final long h;
    public static final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    static {
        boolean z;
        zzhbo zzhboVar;
        boolean z2;
        Field e2;
        long j;
        zzhbo zzhboVar2;
        Unsafe q = q();
        a = q;
        int i2 = zzgwx.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean G = G(cls);
        c = G;
        Class cls2 = Integer.TYPE;
        boolean G2 = G(cls2);
        zzhbo zzhboVar3 = null;
        if (q != null) {
            if (G) {
                zzhboVar3 = new zzhbn(q);
            } else if (G2) {
                zzhboVar3 = new zzhbm(q);
            }
        }
        d = zzhboVar3;
        boolean z3 = true;
        if (zzhboVar3 != null) {
            try {
                Class<?> cls3 = zzhboVar3.a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                r(th);
            }
            if (e() != null) {
                z = true;
                e = z;
                zzhboVar = d;
                if (zzhboVar != null) {
                    try {
                        Class<?> cls4 = zzhboVar.a.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        r(th2);
                    }
                    f = z2;
                    g = c(byte[].class);
                    c(boolean[].class);
                    d(boolean[].class);
                    c(int[].class);
                    d(int[].class);
                    c(long[].class);
                    d(long[].class);
                    c(float[].class);
                    d(float[].class);
                    c(double[].class);
                    d(double[].class);
                    c(Object[].class);
                    d(Object[].class);
                    e2 = e();
                    j = -1;
                    if (e2 != null && (zzhboVar2 = d) != null) {
                        j = zzhboVar2.a.objectFieldOffset(e2);
                    }
                    h = j;
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    i = z3;
                }
                z2 = false;
                f = z2;
                g = c(byte[].class);
                c(boolean[].class);
                d(boolean[].class);
                c(int[].class);
                d(int[].class);
                c(long[].class);
                d(long[].class);
                c(float[].class);
                d(float[].class);
                c(double[].class);
                d(double[].class);
                c(Object[].class);
                d(Object[].class);
                e2 = e();
                j = -1;
                if (e2 != null) {
                    j = zzhboVar2.a.objectFieldOffset(e2);
                }
                h = j;
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                i = z3;
            }
        }
        z = false;
        e = z;
        zzhboVar = d;
        if (zzhboVar != null) {
        }
        z2 = false;
        f = z2;
        g = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        e2 = e();
        j = -1;
        if (e2 != null) {
        }
        h = j;
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        i = z3;
    }

    private zzhbp() {
    }

    public static void A(Object obj, long j, float f2) {
        d.h(obj, j, f2);
    }

    public static void B(Object obj, long j, int i2) {
        d.a.putInt(obj, j, i2);
    }

    public static void C(Object obj, long j, long j2) {
        d.a.putLong(obj, j, j2);
    }

    public static void D(Object obj, long j, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean E(Object obj, long j) {
        if (((byte) ((d.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean F(Object obj, long j) {
        if (((byte) ((d.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean G(Class cls) {
        int i2 = zzgwx.a;
        try {
            Class cls2 = b;
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

    public static boolean H(Object obj, long j) {
        return d.i(obj, j);
    }

    public static boolean a() {
        return f;
    }

    public static boolean b() {
        return e;
    }

    public static int c(Class cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int d(Class cls) {
        if (f) {
            return d.a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field e() {
        int i2 = zzgwx.a;
        Field f2 = f(Buffer.class, "effectiveDirectAddress");
        if (f2 == null) {
            Field f3 = f(Buffer.class, "address");
            if (f3 != null && f3.getType() == Long.TYPE) {
                return f3;
            }
            return null;
        }
        return f2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void g(Object obj, long j, byte b2) {
        Unsafe unsafe = d.a;
        long j2 = (-4) & j;
        int i2 = unsafe.getInt(obj, j2);
        int i3 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i3) | (i2 & (~(255 << i3))));
    }

    public static void h(Object obj, long j, byte b2) {
        Unsafe unsafe = d.a;
        long j2 = (-4) & j;
        int i2 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (unsafe.getInt(obj, j2) & (~(255 << i2))));
    }

    public static byte i(long j) {
        return d.a(j);
    }

    public static double j(Object obj, long j) {
        return d.b(obj, j);
    }

    public static float k(Object obj, long j) {
        return d.c(obj, j);
    }

    public static int l(Object obj, long j) {
        return d.a.getInt(obj, j);
    }

    public static long m(ByteBuffer byteBuffer) {
        zzhbo zzhboVar = d;
        return zzhboVar.a.getLong(byteBuffer, h);
    }

    public static long n(Object obj, long j) {
        return d.a.getLong(obj, j);
    }

    public static Object o(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object p(Object obj, long j) {
        return d.a.getObject(obj, j);
    }

    public static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhbl());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void r(Throwable th) {
        Logger.getLogger(zzhbp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void w(long j, byte[] bArr, long j2, long j3) {
        d.d(j, bArr, j2, j3);
    }

    public static void x(Object obj, long j, boolean z) {
        d.e(obj, j, z);
    }

    public static void y(byte[] bArr, long j, byte b2) {
        d.f(bArr, g + j, b2);
    }

    public static void z(Object obj, long j, double d2) {
        d.g(obj, j, d2);
    }
}
