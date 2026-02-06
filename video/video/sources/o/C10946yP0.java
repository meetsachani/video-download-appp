package o;

import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

@Z90
@InterfaceC11149zF0
/* renamed from: o.yP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10946yP0 {
    public static final int a = 4;
    public static final int b = 8;
    public static final char c = '.';
    public static final char d = ':';
    public static final SA e = SA.q('.');
    public static final SA f = SA.q(':');
    public static final Inet4Address g = (Inet4Address) g("127.0.0.1");
    public static final Inet4Address h = (Inet4Address) g("0.0.0.0");

    /* renamed from: o.yP0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public final Inet4Address a;
        public final Inet4Address b;
        public final int c;
        public final int d;

        public a(@MB Inet4Address inet4Address, @MB Inet4Address inet4Address2, int i, int i2) {
            boolean z;
            boolean z2 = false;
            if (i >= 0 && i <= 65535) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.k(z, "port '%s' is out of range (0 <= port <= 0xffff)", i);
            if (i2 >= 0 && i2 <= 65535) {
                z2 = true;
            }
            C10664xF1.k(z2, "flags '%s' is out of range (0 <= flags <= 0xffff)", i2);
            this.a = (Inet4Address) C3743Nk1.a(inet4Address, C10946yP0.h);
            this.b = (Inet4Address) C3743Nk1.a(inet4Address2, C10946yP0.h);
            this.c = i;
            this.d = i2;
        }

        public Inet4Address a() {
            return this.b;
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.c;
        }

        public Inet4Address d() {
            return this.a;
        }
    }

    public static boolean A(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] != 32 || address[1] != 2) {
            return false;
        }
        return true;
    }

    public static boolean B(Inet6Address inet6Address) {
        byte b2;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b2 = address[15]) == 0 || b2 == 1)) {
            return false;
        }
        return true;
    }

    public static boolean C(String str) {
        if (z(str) != null) {
            return true;
        }
        return false;
    }

    public static boolean D(Inet6Address inet6Address) {
        if (G(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        if ((address[8] | 3) != 3 || address[9] != 0 || address[10] != 94 || address[11] != -2) {
            return false;
        }
        return true;
    }

    public static boolean E(String str) {
        byte[] z = z(str);
        if (z == null || z.length != 16) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < 10) {
                if (z[i] != 0) {
                    return false;
                }
                i++;
            } else {
                for (int i2 = 10; i2 < 12; i2++) {
                    if (z[i2] != -1) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static boolean F(InetAddress inetAddress) {
        for (byte b2 : inetAddress.getAddress()) {
            if (b2 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        if (address[0] != 32 || address[1] != 1 || address[2] != 0 || address[3] != 0) {
            return false;
        }
        return true;
    }

    public static boolean H(String str) {
        if (i(str) != null) {
            return true;
        }
        return false;
    }

    public static short I(String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > 0 && i3 <= 4) {
            int i4 = 0;
            while (i < i2) {
                i4 = (i4 << 4) | Character.digit(str.charAt(i), 16);
                i++;
            }
            return (short) i4;
        }
        throw new NumberFormatException();
    }

    public static byte J(String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > 0 && i3 <= 3) {
            if (i3 > 1 && str.charAt(i) == '0') {
                throw new NumberFormatException();
            }
            int i4 = 0;
            while (i < i2) {
                int i5 = i4 * 10;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i4 = i5 + digit;
                    i++;
                } else {
                    throw new NumberFormatException();
                }
            }
            if (i4 <= 255) {
                return (byte) i4;
            }
            throw new NumberFormatException();
        }
        throw new NumberFormatException();
    }

    @MB
    public static byte[] K(String str) {
        if (e.i(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i2] = J(str, i, indexOf);
                i = indexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @MB
    public static byte[] L(String str) {
        int i = f.i(str);
        if (i >= 2 && i <= 8) {
            int i2 = 1;
            int i3 = i + 1;
            int i4 = 8 - i3;
            boolean z = false;
            for (int i5 = 0; i5 < str.length() - 1; i5++) {
                if (str.charAt(i5) == ':' && str.charAt(i5 + 1) == ':') {
                    if (z) {
                        return null;
                    }
                    int i6 = i4 + 1;
                    if (i5 == 0) {
                        i6 = i4 + 2;
                    }
                    if (i5 == str.length() - 2) {
                        i6++;
                    }
                    i4 = i6;
                    z = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z && i4 <= 0) {
                return null;
            }
            if (!z && i3 != 8) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i2 = 0;
                }
                while (i2 < str.length()) {
                    int indexOf = str.indexOf(58, i2);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    if (str.charAt(i2) == ':') {
                        for (int i7 = 0; i7 < i4; i7++) {
                            allocate.putShort((short) 0);
                        }
                    } else {
                        allocate.putShort(I(str, i2, indexOf));
                    }
                    i2 = indexOf + 1;
                }
                return allocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String M(InetAddress inetAddress) {
        C10664xF1.E(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        C10664xF1.d(inetAddress instanceof Inet6Address);
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            int i2 = i * 2;
            iArr[i] = C7775lT0.k((byte) 0, (byte) 0, address[i2], address[i2 + 1]);
        }
        d(iArr);
        return x(iArr);
    }

    public static BigInteger N(InetAddress inetAddress) {
        return new BigInteger(1, inetAddress.getAddress());
    }

    public static String O(InetAddress inetAddress) {
        if (inetAddress instanceof Inet6Address) {
            String M = M(inetAddress);
            StringBuilder sb = new StringBuilder(String.valueOf(M).length() + 2);
            sb.append(C6566gU0.f);
            sb.append(M);
            sb.append(C6566gU0.g);
            return sb.toString();
        }
        return M(inetAddress);
    }

    public static InetAddress b(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    public static int c(InetAddress inetAddress) {
        return C8129ms.h(q(inetAddress).getAddress()).readInt();
    }

    public static void d(int[] iArr) {
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < iArr.length + 1; i4++) {
            if (i4 < iArr.length && iArr[i4] == 0) {
                if (i3 < 0) {
                    i3 = i4;
                }
            } else if (i3 >= 0) {
                int i5 = i4 - i3;
                if (i5 > i) {
                    i2 = i3;
                    i = i5;
                }
                i3 = -1;
            }
        }
        if (i >= 2) {
            Arrays.fill(iArr, i2, i + i2, -1);
        }
    }

    @MB
    public static String e(String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        String substring = str.substring(0, lastIndexOf);
        byte[] K = K(str.substring(lastIndexOf));
        if (K == null) {
            return null;
        }
        String hexString = Integer.toHexString(((K[0] & 255) << 8) | (K[1] & 255));
        String hexString2 = Integer.toHexString((K[3] & 255) | ((K[2] & 255) << 8));
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(hexString).length() + String.valueOf(hexString2).length());
        sb.append(substring);
        sb.append(hexString);
        sb.append(":");
        sb.append(hexString2);
        return sb.toString();
    }

    public static InetAddress f(InetAddress inetAddress) {
        boolean z;
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.u(z, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return b(address);
    }

    @InterfaceC6181ey
    public static InetAddress g(String str) {
        byte[] z = z(str);
        if (z != null) {
            return b(z);
        }
        throw j("'%s' is not an IP string literal.", str);
    }

    public static InetAddress h(String str) {
        InetAddress i = i(str);
        if (i != null) {
            return i;
        }
        throw j("Not a valid URI IP literal: '%s'", str);
    }

    @MB
    public static InetAddress i(String str) {
        int i;
        C10664xF1.E(str);
        if (str.startsWith(C6566gU0.f) && str.endsWith(C6566gU0.g)) {
            str = str.substring(1, str.length() - 1);
            i = 16;
        } else {
            i = 4;
        }
        byte[] z = z(str);
        if (z != null && z.length == i) {
            return b(z);
        }
        return null;
    }

    public static IllegalArgumentException j(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    public static InetAddress k(BigInteger bigInteger, boolean z) {
        boolean z2;
        int i;
        if (bigInteger.signum() >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.e(z2, "BigInteger must be greater than or equal to 0");
        if (z) {
            i = 16;
        } else {
            i = 4;
        }
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i];
        int max = Math.max(0, byteArray.length - i);
        int length = byteArray.length - max;
        int i2 = i - length;
        for (int i3 = 0; i3 < max; i3++) {
            if (byteArray[i3] != 0) {
                throw j("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i), bigInteger);
            }
        }
        System.arraycopy(byteArray, max, bArr, i2, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    public static Inet4Address l(BigInteger bigInteger) {
        return (Inet4Address) k(bigInteger, false);
    }

    public static Inet6Address m(BigInteger bigInteger) {
        return (Inet6Address) k(bigInteger, true);
    }

    public static Inet4Address n(int i) {
        return t(C7775lT0.C(i));
    }

    public static InetAddress o(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    public static Inet4Address p(Inet6Address inet6Address) {
        C10664xF1.u(A(inet6Address), "Address '%s' is not a 6to4 address.", M(inet6Address));
        return t(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address q(InetAddress inetAddress) {
        boolean z;
        long j;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i = 0;
        while (true) {
            if (i < 15) {
                if (address[i] != 0) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z && address[15] == 1) {
            return g;
        }
        if (z && address[15] == 0) {
            return h;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        if (w(inet6Address)) {
            j = s(inet6Address).hashCode();
        } else {
            j = ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong();
        }
        int b2 = DG0.B().j(j).b() | (-536870912);
        if (b2 == -1) {
            b2 = -2;
        }
        return t(C7775lT0.C(b2));
    }

    public static Inet4Address r(Inet6Address inet6Address) {
        C10664xF1.u(B(inet6Address), "Address '%s' is not IPv4-compatible.", M(inet6Address));
        return t(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address s(Inet6Address inet6Address) {
        if (B(inet6Address)) {
            return r(inet6Address);
        }
        if (A(inet6Address)) {
            return p(inet6Address);
        }
        if (G(inet6Address)) {
            return v(inet6Address).a();
        }
        throw j("'%s' has no embedded IPv4 address.", M(inet6Address));
    }

    public static Inet4Address t(byte[] bArr) {
        boolean z;
        if (bArr.length == 4) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (Inet4Address) b(bArr);
    }

    public static Inet4Address u(Inet6Address inet6Address) {
        C10664xF1.u(D(inet6Address), "Address '%s' is not an ISATAP address.", M(inet6Address));
        return t(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static a v(Inet6Address inet6Address) {
        C10664xF1.u(G(inet6Address), "Address '%s' is not a Teredo address.", M(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address t = t(Arrays.copyOfRange(address, 4, 8));
        int readShort = C8129ms.i(address, 8).readShort() & Xx2.Y0;
        int i = 65535 & (~C8129ms.i(address, 10).readShort());
        byte[] copyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i2 = 0; i2 < copyOfRange.length; i2++) {
            copyOfRange[i2] = (byte) (~copyOfRange[i2]);
        }
        return new a(t, t(copyOfRange), i, readShort);
    }

    public static boolean w(Inet6Address inet6Address) {
        if (!B(inet6Address) && !A(inet6Address) && !G(inet6Address)) {
            return false;
        }
        return true;
    }

    public static String x(int[] iArr) {
        boolean z;
        StringBuilder sb = new StringBuilder(39);
        int i = 0;
        boolean z2 = false;
        while (i < iArr.length) {
            if (iArr[i] >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (z2) {
                    sb.append(':');
                }
                sb.append(Integer.toHexString(iArr[i]));
            } else if (i == 0 || z2) {
                sb.append(C10923yJ1.d);
            }
            i++;
            z2 = z;
        }
        return sb.toString();
    }

    public static InetAddress y(InetAddress inetAddress) {
        boolean z;
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            z = false;
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        if (length >= 0) {
            z = true;
        }
        C10664xF1.u(z, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return b(address);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r3 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
        r9 = e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r9 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
        if (r1 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
        return L(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        if (r2 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r1 == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
        return K(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
        return null;
     */
    @MB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] z(String str) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt == '.') {
                    z = true;
                } else if (charAt == ':') {
                    if (z) {
                        return null;
                    }
                    z2 = true;
                } else if (charAt == '%') {
                    break;
                } else if (Character.digit(charAt, 16) == -1) {
                    return null;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
    }
}
