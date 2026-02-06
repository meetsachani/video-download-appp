package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C10323vs;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class H3 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-65, C2638Cg0.C7, -35, -47, -16, -27, -24, -36, -12, -14, -7, -7, -14, -9, -16, -87, -5, -18, -10, -22, -14, -9, -19, -18, -5, -87, -8, -17, -87, -10, -22, -11, -17, -8, -5, -10, -18, -19, -87, -36, C2638Cg0.z7, -46, -87, -41, C2638Cg0.w7, -43, -87, -2, -9, -14, -3, -73};
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(C04774v c04774v) {
        int i = 0;
        while (value != 0) {
            int b = c04774v.A0I();
            i += b;
            if (b != 255) {
                return i;
            }
        }
        return -1;
    }

    public static void A03(long j, C04774v c04774v, InterfaceC0780Hd[] interfaceC0780HdArr) {
        while (true) {
            if (c04774v.A07() > 1) {
                int A002 = A00(c04774v);
                int A003 = A00(c04774v);
                int A09 = c04774v.A09() + A003;
                if (A003 != -1) {
                    int payloadType = c04774v.A07();
                    if (A003 <= payloadType) {
                        if (A002 == 4 && A003 >= 8) {
                            int userIdentifier = c04774v.A0I();
                            int providerCode = c04774v.A0M();
                            int countryCode = 0;
                            if (providerCode == 49) {
                                countryCode = c04774v.A0C();
                            }
                            int A0I = c04774v.A0I();
                            if (providerCode == 47) {
                                c04774v.A0g(1);
                            }
                            int i = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && A0I == 3) ? 1 : 0;
                            if (providerCode == 49) {
                                int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                                i &= userDataTypeCode;
                            }
                            if (i != 0) {
                                A04(j, c04774v, interfaceC0780HdArr);
                            }
                        }
                        c04774v.A0f(A09);
                    }
                }
                AbstractC04624g.A07(A01(0, 7, 3), A01(7, 45, 16));
                A09 = c04774v.A0A();
                c04774v.A0f(A09);
            } else {
                return;
            }
        }
    }

    public static void A04(long j, C04774v c04774v, InterfaceC0780Hd[] interfaceC0780HdArr) {
        int firstByte = c04774v.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c04774v.A0g(1);
        int i = (firstByte & 31) * 3;
        int A09 = c04774v.A09();
        for (InterfaceC0780Hd interfaceC0780Hd : interfaceC0780HdArr) {
            c04774v.A0f(A09);
            interfaceC0780Hd.AIr(c04774v, i);
            if (j != C10323vs.b) {
                interfaceC0780Hd.AIu(j, 1, i, 0, null);
            }
        }
    }
}
