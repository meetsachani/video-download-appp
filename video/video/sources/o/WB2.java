package o;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

@InterfaceC5116aa0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public final class WB2 {
    public static final byte a = Byte.MIN_VALUE;
    public static final byte b = -1;
    public static final int c = 255;

    @InterfaceC5299bJ2
    /* loaded from: classes3.dex */
    public static class a {
        public static final String a = a.class.getName().concat("$UnsafeComparator");
        public static final Comparator<byte[]> b = a();

        /* renamed from: o.WB2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum EnumC0240a implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            /* renamed from: g */
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < min; i++) {
                    int b = WB2.b(bArr[i], bArr2[i]);
                    if (b != 0) {
                        return b;
                    }
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        @InterfaceC5299bJ2
        /* loaded from: classes3.dex */
        public enum b implements Comparator<byte[]> {
            INSTANCE;
            
            public static final boolean Y = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            public static final int Y0;
            public static final Unsafe Z;

            /* renamed from: o.WB2$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0241a implements PrivilegedExceptionAction<Unsafe> {
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
                Unsafe h = h();
                Z = h;
                int arrayBaseOffset = h.arrayBaseOffset(byte[].class);
                Y0 = arrayBaseOffset;
                if ("64".equals(System.getProperty("sun.arch.data.model")) && arrayBaseOffset % 8 == 0 && h.arrayIndexScale(byte[].class) == 1) {
                    return;
                }
                throw new Error();
            }

            public static Unsafe h() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (SecurityException unused) {
                        return (Unsafe) AccessController.doPrivileged(new C0241a());
                    }
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            }

            @Override // java.util.Comparator
            /* renamed from: g */
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i = min & (-8);
                int i2 = 0;
                while (i2 < i) {
                    Unsafe unsafe = Z;
                    int i3 = Y0;
                    long j = i2;
                    long j2 = unsafe.getLong(bArr, i3 + j);
                    long j3 = unsafe.getLong(bArr2, i3 + j);
                    if (j2 != j3) {
                        if (Y) {
                            return C5271bC2.a(j2, j3);
                        }
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                        return ((int) ((j2 >>> numberOfTrailingZeros) & 255)) - ((int) ((j3 >>> numberOfTrailingZeros) & 255));
                    }
                    i2 += 8;
                }
                while (i2 < min) {
                    int b = WB2.b(bArr[i2], bArr2[i2]);
                    if (b != 0) {
                        return b;
                    }
                    i2++;
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Comparator<byte[]> a() {
            try {
                Object[] enumConstants = Class.forName(a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return WB2.f();
            }
        }
    }

    @InterfaceC6181ey
    public static byte a(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "out of range: %s", j);
        return (byte) j;
    }

    public static int b(byte b2, byte b3) {
        return p(b2) - p(b3);
    }

    public static byte c(byte b2) {
        return (byte) (b2 ^ 128);
    }

    public static String d(String str, byte... bArr) {
        C10664xF1.E(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * (str.length() + 3));
        sb.append(p(bArr[0]));
        for (int i = 1; i < bArr.length; i++) {
            sb.append(str);
            sb.append(q(bArr[i]));
        }
        return sb.toString();
    }

    public static Comparator<byte[]> e() {
        return a.b;
    }

    @InterfaceC5299bJ2
    public static Comparator<byte[]> f() {
        return a.EnumC0240a.INSTANCE;
    }

    public static byte g(byte... bArr) {
        boolean z;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int p = p(bArr[0]);
        for (int i = 1; i < bArr.length; i++) {
            int p2 = p(bArr[i]);
            if (p2 > p) {
                p = p2;
            }
        }
        return (byte) p;
    }

    public static byte h(byte... bArr) {
        boolean z;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int p = p(bArr[0]);
        for (int i = 1; i < bArr.length; i++) {
            int p2 = p(bArr[i]);
            if (p2 < p) {
                p = p2;
            }
        }
        return (byte) p;
    }

    @InterfaceC6181ey
    @InterfaceC4238Sm
    public static byte i(String str) {
        return j(str, 10);
    }

    @InterfaceC6181ey
    @InterfaceC4238Sm
    public static byte j(String str, int i) {
        int parseInt = Integer.parseInt((String) C10664xF1.E(str), i);
        if ((parseInt >> 8) == 0) {
            return (byte) parseInt;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("out of range: ");
        sb.append(parseInt);
        throw new NumberFormatException(sb.toString());
    }

    public static byte k(long j) {
        if (j > p((byte) -1)) {
            return (byte) -1;
        }
        if (j < 0) {
            return (byte) 0;
        }
        return (byte) j;
    }

    public static void l(byte[] bArr) {
        C10664xF1.E(bArr);
        m(bArr, 0, bArr.length);
    }

    public static void m(byte[] bArr, int i, int i2) {
        C10664xF1.E(bArr);
        C10664xF1.f0(i, i2, bArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            bArr[i3] = c(bArr[i3]);
        }
        Arrays.sort(bArr, i, i2);
        while (i < i2) {
            bArr[i] = c(bArr[i]);
            i++;
        }
    }

    public static void n(byte[] bArr) {
        C10664xF1.E(bArr);
        o(bArr, 0, bArr.length);
    }

    public static void o(byte[] bArr, int i, int i2) {
        C10664xF1.E(bArr);
        C10664xF1.f0(i, i2, bArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ Byte.MAX_VALUE);
        }
        Arrays.sort(bArr, i, i2);
        while (i < i2) {
            bArr[i] = (byte) (bArr[i] ^ Byte.MAX_VALUE);
            i++;
        }
    }

    public static int p(byte b2) {
        return b2 & 255;
    }

    @InterfaceC4238Sm
    public static String q(byte b2) {
        return r(b2, 10);
    }

    @InterfaceC4238Sm
    public static String r(byte b2, int i) {
        boolean z;
        if (i >= 2 && i <= 36) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        return Integer.toString(p(b2), i);
    }
}
