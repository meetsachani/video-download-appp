package okhttp3.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import o.C10763xf2;
import o.C10923yJ1;
import o.C5422bq;
import o.C6562gT0;
import o.C6566gU0;
import o.C9545sf2;
import o.UE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C6562gT0.t(charAt, 31) <= 0 || C6562gT0.t(charAt, 127) >= 0 || C10763xf2.I3(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (C6562gT0.t(charAt, 48) < 0 || C6562gT0.t(charAt, 57) > 0) {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
        if (r11 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
        if (r12 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
        r0 = r11 - r12;
        java.lang.System.arraycopy(r8, r12, r8, 16 - r0, r0);
        java.util.Arrays.fill(r8, r12, (16 - r11) + r12, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
        return java.net.InetAddress.getByAddress(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress decodeIpv6(String str, int i, int i2) {
        String str2;
        int i3;
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            if (i4 < i2) {
                if (i5 == 16) {
                    return null;
                }
                int i8 = i4 + 2;
                if (i8 <= i2 && C9545sf2.I2(str, C10923yJ1.d, i4, false, 4, null)) {
                    if (i6 != -1) {
                        return null;
                    }
                    i5 += 2;
                    if (i8 == i2) {
                        i6 = i5;
                        break;
                    }
                    str2 = str;
                    i6 = i5;
                    i7 = i8;
                    int i9 = 0;
                    i4 = i7;
                    while (i4 < i2) {
                    }
                    i3 = i4 - i7;
                    if (i3 == 0) {
                        break;
                    }
                    break;
                }
                if (i5 != 0) {
                    if (C9545sf2.I2(str, ":", i4, false, 4, null)) {
                        i4++;
                    } else if (!C9545sf2.I2(str, UE.h, i4, false, 4, null) || !decodeIpv4Suffix(str, i7, i2, bArr, i5 - 2)) {
                        return null;
                    } else {
                        i5 += 2;
                    }
                }
                str2 = str;
                i7 = i4;
                int i92 = 0;
                i4 = i7;
                while (i4 < i2) {
                    int parseHexDigit = Util.parseHexDigit(str2.charAt(i4));
                    if (parseHexDigit == -1) {
                        break;
                    }
                    i92 = (i92 << 4) + parseHexDigit;
                    i4++;
                }
                i3 = i4 - i7;
                if (i3 == 0 || i3 > 4) {
                    break;
                }
                int i10 = i5 + 1;
                bArr[i5] = (byte) ((i92 >>> 8) & 255);
                i5 += 2;
                bArr[i10] = (byte) (i92 & 255);
            } else {
                break;
            }
        }
        return null;
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C5422bq c5422bq = new C5422bq();
        while (i2 < bArr.length) {
            if (i2 == i) {
                c5422bq.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    c5422bq.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c5422bq.writeByte(58);
                }
                c5422bq.F4((Util.and(bArr[i2], 255) << 8) | Util.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return c5422bq.Y4();
    }

    @Nullable
    public static final String toCanonicalHost(@NotNull String str) {
        InetAddress decodeIpv6;
        C6562gT0.p(str, "<this>");
        if (C10763xf2.n3(str, ":", false, 2, null)) {
            if (C9545sf2.J2(str, C6566gU0.f, false, 2, null) && C9545sf2.b2(str, C6566gU0.g, false, 2, null)) {
                decodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                decodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (decodeIpv6 == null) {
                return null;
            }
            byte[] address = decodeIpv6.getAddress();
            if (address.length == 16) {
                C6562gT0.o(address, "address");
                return inet6AddressToAscii(address);
            } else if (address.length == 4) {
                return decodeIpv6.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        }
        try {
            String ascii = IDN.toASCII(str);
            C6562gT0.o(ascii, "toASCII(host)");
            Locale locale = Locale.US;
            C6562gT0.o(locale, "US");
            String lowerCase = ascii.toLowerCase(locale);
            C6562gT0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                return null;
            }
            if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
