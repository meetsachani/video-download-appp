package o;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

@InterfaceC7311ja0
/* loaded from: classes3.dex */
public final class A11 {
    public static final c a;
    public static final /* synthetic */ boolean b = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class b implements c {
        public static final b X = new a("INSTANCE", 0);
        public static final /* synthetic */ b[] Y = h();

        /* loaded from: classes3.dex */
        public enum a extends b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // o.A11.c
            public long e(byte[] bArr, int i) {
                return C7194j51.j(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
            }

            @Override // o.A11.c
            public void g(byte[] bArr, int i, long j) {
                long j2 = 255;
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i + i2] = (byte) ((j & j2) >> (i2 * 8));
                    j2 <<= 8;
                }
            }
        }

        public b(String str, int i) {
        }

        public static /* synthetic */ b[] h() {
            return new b[]{X};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Y.clone();
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        long e(byte[] bArr, int i);

        void g(byte[] bArr, int i, long j);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class d implements c {
        public static final int Y0;
        public static final Unsafe Z;
        public static final d X = new a("UNSAFE_LITTLE_ENDIAN", 0);
        public static final d Y = new b("UNSAFE_BIG_ENDIAN", 1);
        public static final /* synthetic */ d[] Z0 = h();

        /* loaded from: classes3.dex */
        public enum a extends d {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // o.A11.c
            public long e(byte[] bArr, int i) {
                return d.Z.getLong(bArr, i + d.Y0);
            }

            @Override // o.A11.c
            public void g(byte[] bArr, int i, long j) {
                d.Z.putLong(bArr, i + d.Y0, j);
            }
        }

        /* loaded from: classes3.dex */
        public enum b extends d {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // o.A11.c
            public long e(byte[] bArr, int i) {
                return Long.reverseBytes(d.Z.getLong(bArr, i + d.Y0));
            }

            @Override // o.A11.c
            public void g(byte[] bArr, int i, long j) {
                d.Z.putLong(bArr, i + d.Y0, Long.reverseBytes(j));
            }
        }

        /* loaded from: classes3.dex */
        public class c implements PrivilegedExceptionAction<Unsafe> {
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
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe l = l();
            Z = l;
            Y0 = l.arrayBaseOffset(byte[].class);
            if (l.arrayIndexScale(byte[].class) == 1) {
                return;
            }
            throw new AssertionError();
        }

        public d(String str, int i) {
        }

        public static /* synthetic */ d[] h() {
            return new d[]{X, Y};
        }

        public static Unsafe l() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new c());
                }
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) Z0.clone();
        }
    }

    static {
        c cVar = b.X;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                    cVar = d.X;
                } else {
                    cVar = d.Y;
                }
            }
        } catch (Throwable unused) {
        }
        a = cVar;
    }

    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long b(byte[] bArr, int i) {
        return a.e(bArr, i);
    }

    public static long c(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, 8);
        long j = 0;
        for (int i3 = 0; i3 < min; i3++) {
            j |= (bArr[i + i3] & 255) << (i3 * 8);
        }
        return j;
    }

    public static void d(byte[] bArr, int i, long j) {
        a.g(bArr, i, j);
    }

    public static boolean e() {
        return a instanceof d;
    }
}
